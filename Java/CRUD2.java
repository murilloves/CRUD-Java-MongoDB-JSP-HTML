package testemongo2;

import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static java.lang.System.exit;
import java.util.Arrays;
import java.util.Scanner;
import org.bson.Document;


public class TesteMongo2 {

    public static void main(String[] args){

    // Pergunta inicial \\
        Chose escolha = new Chose();
        while(escolha.choice() == 0){
            System.out.println("\nSelecione uma opção válida!\n");
            //System.exit(1);
        }
        
        System.out.println("\nVocê escolheu " + escolha.getOpcao() + ": " + escolha.nomeDaOpcao() + "\n\n");
    // Fim do primeiro bloco "Pergunta inicial" \\

    // Criando Objeto e recebendo dados \\
        Usuario user = new Usuario();
        Scanner scn = new Scanner(System.in);


    // Remover documento (usuário) \\
        if(escolha.getOpcao() == 4){
            Remover rm = new Remover();
            rm.removendo();
        }
    // Fim de "Remover documento (usuário)" \\

    // Inserindo no banco \\
        if (escolha.getOpcao() == 2){
            {
                // Recebendo os dados
                System.out.println("Digite o Nome do usuario: ");
                user.setNome(scn.nextLine());

                System.out.println("Digite o Telefone do usuario: ");
                user.setTelefone(scn.nextLine());

                System.out.println("Digite o Estado do usuario: ");
                user.setEstado(scn.nextLine());

                System.out.println("Digite a Cidade do usuario: ");
                user.setCidade(scn.nextLine());
            }
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
        }
    // Fim de "Inserindo no banco" \\

    // Mostra documentos (usuários) \\
        if(escolha.getOpcao() == 1){
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
        }
    // Fim de "Mostra documentos (usuários)" \\

    // Editar documento \\
        if(escolha.getOpcao() == 3){
            try
            {
                // Setup DB \\
                MongoClient mongoClient = new MongoClient("localhost",27017);
                MongoDatabase database = mongoClient.getDatabase("admin");
                MongoCollection<Document> collecao = database.getCollection("usuarios");
                // EndOf Setup DB \\

                System.out.println("Qual o nome do cliente você deseja alterar?");
                String entradaASerAlterada = scn.nextLine();

                    // Recebendo os dados
                    System.out.println("Novo nome: ");
                    user.setNome(scn.nextLine());

                if(!entradaASerAlterada.equals(user.getNome())){
                    System.out.println("Resultados não coincidem");
                }
                else
                {
                    System.out.println("Novo telefone: ");
                    user.setTelefone(scn.nextLine());

                    System.out.println("Novo estado: ");
                    user.setEstado(scn.nextLine());

                    System.out.println("Nova cidade: ");
                    user.setCidade(scn.nextLine());

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
        }
    // End of "Editar documento" \\
    
    }
    // End of "main" \\

}
// End of "class TesteMongo2" \\




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
