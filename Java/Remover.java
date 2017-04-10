package testemongo2;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Scanner;
import org.bson.Document;

public class Remover {
    
    public void removendo(){
    
        System.out.println("Qual o nome do cliente você deseja remover? ");
        Scanner scn = new Scanner(System.in);
        String entradaASerExcluida = scn.nextLine();

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
    }

}
