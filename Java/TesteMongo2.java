package testemongo2;

import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Arrays;
import java.util.Scanner;
import org.bson.Document;


public class TesteMongo2 {

    public static void main(String[] args){

    // Criando Objeto e recebendo dados
        Usuario user = new Usuario();
        Scanner sc = new Scanner(System.in);

    // Exibe dados
    //    System.out.println(user.getNome()+" , "+user.getTelefone()+" , "+user.getEstado()+" , "+user.getCidade());

/*
    // O que deseja fazer?
        System.out.println("O que deseja fazer? ");
        System.out.println("1 - Mostrar usuários (exibir documentos)");
        System.out.println("2 - Inserir usuário (inserir documento)");
        System.out.println("3 - Editar usuário (editar documento)");
        System.out.println("4 - Remover usuário (remover documento)");
        System.out.println("Digite um número: ");


    // Remover documento
        System.out.println("Qual o nome do cliente você deseja remover? ");
        String entradaASerExcluida = sc.nextLine();
    
        try{
            MongoClient mongoClient = new MongoClient("localhost",27017);
            MongoDatabase database = mongoClient.getDatabase("admin");
            MongoCollection<Document> collecao = database.getCollection("usuarios");

            // Bloco de remoção \\
            BasicDBObject query = new BasicDBObject();
            query.append("nome", entradaASerExcluida);
            collecao.deleteOne(query);
            // Bloco de remoção \\

            System.out.println("Entrada removida com sucesso");
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
        // Recebendo os dados
        {
            System.out.println("Nome: ");
            user.setNome(sc.nextLine());

            System.out.println("Telefone: ");
            user.setTelefone(sc.nextLine());

            System.out.println("Estado: ");
            user.setEstado(sc.nextLine());

            System.out.println("Cidade: ");
            user.setCidade(sc.nextLine());
        }


    // Inserindo no banco \\
        // Iniciando conexão
        try{
            MongoClient mongoClient = new MongoClient("localhost",27017);
            MongoDatabase database = mongoClient.getDatabase("admin");
            MongoCollection<Document> collecao = database.getCollection("usuarios");
            System.out.println("Works fine");

            // Gravando no banco
            Document document = new Document("nome", user.getNome() )
                .append("telefone", user.getTelefone() )
                .append("estado", user.getEstado() )
                .append("cidade", user.getCidade() )
                ;
            collecao.insertOne(document);

            System.out.println("Dados inseridos com sucesso!");
            
        }catch(Exception e)
        {
            System.out.println(e);
        }


    // Mostra documentos
        try{
            MongoClient mongoClient = new MongoClient("localhost",27017);
            MongoDatabase database = mongoClient.getDatabase("admin");
            MongoCollection<Document> collecao = database.getCollection("usuarios");
            
            // Bloco de impressão \\
            Block<Document> printBlock = new Block<Document>() {
                @Override
                public void apply(final Document document) {
                    System.out.println(document.toJson());
                }
            };
            collecao.find().forEach(printBlock);
            System.out.println("\nFim da Collection!");
            // Bloco de impressão \\

        }catch(Exception e)
        {
            System.out.println(e);
        }
*/

    // Editar documento \\
        try
        {
            // Setup DB \\
            MongoClient mongoClient = new MongoClient("localhost",27017);
            MongoDatabase database = mongoClient.getDatabase("admin");
            MongoCollection<Document> collecao = database.getCollection("usuarios");
            // EndOf Setup DB \\
            
            System.out.println("Qual o nome do cliente você deseja alterar?");
            String entradaASerAlterada = sc.nextLine();

                // Recebendo os dados
                System.out.println("Novo nome: ");
                user.setNome(sc.nextLine());

            if(!entradaASerAlterada.equals(user.getNome())){
                System.out.println("Resultados não coincidem");
            }
            else
            {
                System.out.println("Novo telefone: ");
                user.setTelefone(sc.nextLine());

                System.out.println("Novo estado: ");
                user.setEstado(sc.nextLine());

                System.out.println("Nova cidade: ");
                user.setCidade(sc.nextLine());

                // Pre-requisitos para Comparação e Remoção\\
                BasicDBObject query = new BasicDBObject();
                query.append("nome", entradaASerAlterada);
                collecao.find(query);

                // Remoção \\
                collecao.deleteOne(query);

                // Gravando novos dados no banco \\
                Document document = new Document("nome", user.getNome() )
                    .append("telefone", user.getTelefone() )
                    .append("estado", user.getEstado() )
                    .append("cidade", user.getCidade() )
                    ;
                collecao.insertOne(document);
                System.out.println("Dados alterados com sucesso!");
                // End of Gravando no banco \\
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        // End of "Editar documento" \\

    
    } // End of main \\

}// End of class TesteMongo2 \\




/*
    // Connectando ao banco
        try{
            MongoClient mongoClient = new MongoClient("localhost",27017);
            MongoDatabase database = mongoClient.getDatabase("admin");
            MongoCollection<Document> collecao = database.getCollection("usuarios");
            System.out.println("Works fine");
        }catch(Exception e)
        {
            System.out.println(e);
        }
*/
