package testemongo2;
import java.util.Scanner;

public class Chose {
    
    private Scanner sc = new Scanner(System.in);
    private int opcao;

    // O que deseja fazer?
    public int choice(){
        System.out.println("O que você deseja fazer? ");
        System.out.println("1 - Mostrar usuários (exibir documentos)");
        System.out.println("2 - Inserir usuário (inserir documento)");
        System.out.println("3 - Editar usuário (editar documento)");
        System.out.println("4 - Remover usuário (remover documento)");
        System.out.println("Digite um número: ");

        opcao = sc.nextInt();
        if(opcao <1 || opcao >4){
            return 0;
        }
        
        return opcao;
    }
    
    public int getOpcao(){
        return this.opcao;
    }
    
    // Retorna a opção
    public String nomeDaOpcao(){
        switch (opcao){
            case 1:
                return "Mostrar usuários";
            case 2:
                return "Inserir usuário";
            case 3:
                return "Editar usuário";
            case 4:
                return "Remover usuário";
        }
        return "";
    }



}
