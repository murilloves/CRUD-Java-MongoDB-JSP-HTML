package testemongo2;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Exibir {
    
    public void exibe(){
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
    
}
