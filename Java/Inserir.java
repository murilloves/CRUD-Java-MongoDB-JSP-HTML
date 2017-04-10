package testemongo2;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Scanner;
import org.bson.Document;

public class Inserir {

    
    
    public void inserindo (){
    /*
        System.out.println("Qual o nome do cliente você deseja remover? ");
        Scanner scn = new Scanner(System.in);
        String entradaASerExcluida = scn.nextLine();

        // Recebendo os dados
        System.out.println("Digite o Nome do usuario: ");
        user.setNome(scn.nextLine());

        System.out.println("Digite o Telefone do usuario: ");
        user.setTelefone(scn.nextLine());

        System.out.println("Digite o Estado do usuario: ");
        user.setEstado(scn.nextLine());

        System.out.println("Digite a Cidade do usuario: ");
        user.setCidade(scn.nextLine());

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
        
    */
    }

}
