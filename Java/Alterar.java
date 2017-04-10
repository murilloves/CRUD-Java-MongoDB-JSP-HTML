package testemongo2;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Scanner;
import org.bson.Document;

public class Alterar {
    
    public void alterando (Scanner scn, Usuario user){
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
}
