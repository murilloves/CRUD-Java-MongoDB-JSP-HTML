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


public class CRUD2 {

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

    // Mostra documentos (usuários) \\
        if(escolha.getOpcao() == 1){
            Exibir show = new Exibir();
            show.exibe();
        }
    // Inserindo usuário no banco \\
        if(escolha.getOpcao() == 2){
            Inserir insert = new Inserir();
            insert.inserindo(scn, user);
        }
    // Editar documento \\
        if(escolha.getOpcao() == 3){
            Alterar update = new Alterar();
            update.alterando(scn, user);
        }
    // Remover documento (usuário) \\
        if(escolha.getOpcao() == 4){
            Remover rm = new Remover();
            rm.removendo();
        }

    }// End of "public static void main" \\

}// End of "class TesteMongo2" \\

