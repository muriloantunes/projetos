import java.util.Scanner;
class Index{       
    public static void main(String[] args) {
        System.out.println("\nPrograma iniciando...\n");
        menu();        	
    }
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\t### ELDORADO ###");
        System.out.println("=======================");
        System.out.println(" | 1 - TECNOLOGIA");
        System.out.println(" | 2 - CRIPTOGRAFIA");
        System.out.println(" | 3 - MATEMATICA");
        System.out.println(" | 0 - SAIR");
        System.out.println("=======================\n");
        System.out.print("Opção => ");
        int opcao = scanner.nextInt();
        System.out.print("\n");
        do {            
            switch (opcao) {
            case 1:
                Main.tecnologia();
                System.out.println(" ");
                menu();
                break;
            case 2:
                Main.criptografia();
                System.out.println(" ");
                menu();
                break;
            case 3:
                Main.exata();
                System.out.println(" ");
                menu();
                break;
            case 0:
                System.out.println("Programa encerrando...");	
                System.exit(0);
                break;
            default:
                System.out.println("Opção Inválida!");
                System.out.println(" ");
                menu();
                break;
            }
        } while (opcao != 0);
    }
}