import java.util.Scanner;
class Main{
    public static void tecnologia(){
        Scanner scanner = new Scanner(System.in);
        Computador computador = new Computador();
        Laptop laptop = new Laptop();

        System.out.println("=======================");
        System.out.println(" | 1 - COMPUTADOR");
        System.out.println(" | 2 - LAPTOP");
        System.out.println(" | 3 - VOLTAR");
        System.out.println(" | 0 - SAIR");
        System.out.println("=======================\n");
        System.out.print("Opção => ");
        int opcao = scanner.nextInt();
        System.out.print("\n");
        do {            
            switch (opcao) {
            case 1:
                computador.maquina();
                tecnologia();
                break;
            case 2:
                laptop.maquina();
                tecnologia();
                break;
            case 3:
                Index.menu();
                break;
            case 0:
                System.out.println("Programa encerrando...");	
                System.exit(0);
                break;
            default:
                System.out.println("Opção Inválida!");
                System.out.print("\n");
                tecnologia();
                break;
            }
        } while (opcao != 0);
    }
    
    public static void criptografia(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println(" | 1 - CRIPTOGRAFIA1");
        System.out.println(" | 2 - CRIPTOGRAFIA2");
        System.out.println(" | 3 - VOLTAR");
        System.out.println(" | 0 - SAIR");
        System.out.println("=======================\n");
        System.out.print("Opção => ");
        int opcao = scanner.nextInt();
        System.out.print("\n");
        do {            
            switch (opcao) {
            case 1:
                Cript.enigma();
                System.out.print("\n");
                criptografia();
                break;
            case 2:
                Cripto.enigma();
                criptografia();
                break;
            case 3:
                Index.menu();
                break;
            case 0:
                System.out.println(" ");
                System.out.println("Programa encerrando...");	
                System.exit(0);
                break;
            default:
                System.out.println("Opção Inválida!");
                System.out.print("\n");
                criptografia();
                break;
            }
        } while (opcao != 0);
    }

    public static void exata(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println(" | 1 - DIVISAO DE NUMEROS");
        System.out.println(" | 2 - PARES E IMPARES");
        System.out.println(" | 3 - PRIMOS");
        System.out.println(" | 4 - MINIMOS E MAXIMOS");
        System.out.println(" | 5 - CALCULADORA");
        System.out.println(" | 6 - VOLTAR");
        System.out.println(" | 0 - SAIR");
        System.out.println("=======================\n");
        System.out.print("Opção => ");
        int opcao = scanner.nextInt();
        int inicio;
        int fim;
        do {                    
            switch (opcao) {
            case 1:
                System.out.print("\nInforme um número inicial: ");        
                inicio = scanner.nextInt();
                System.out.print("Informe um número final: ");        
                fim = scanner.nextInt();
                System.out.print("Informe um número divisivel: ");        
                int mod = scanner.nextInt();
                System.out.print("\nNúmero(s) : ");
                Matematica.numeros(inicio, fim);
                System.out.print("\nDivisível por "+mod+" : ");
                Matematica.modN(inicio, fim, mod);
                System.out.print("\n");
                System.out.print("\n");
                exata();
                break;
            case 2:
                System.out.print("\nInforme um número inicial: ");        
                inicio = scanner.nextInt();
                System.out.print("Informe um número final: ");        
                fim = scanner.nextInt();
                System.out.print("\nNúmero(s) : ");
                Matematica.numeros(inicio, fim);
                System.out.print("\nPar(es): ");
                Matematica.pares(inicio, fim);
                System.out.print("\nImpar(es): ");
                Matematica.impares(inicio, fim);
                System.out.print("\n");
                System.out.print("\n");
                exata();
                break;
            case 3:
                System.out.print("\nInforme um número inicial: ");        
                inicio = scanner.nextInt();
                System.out.print("Informe um número final: ");        
                fim = scanner.nextInt();
                System.out.print("\nNúmero(s) : ");
                Matematica.numeros(inicio, fim);
                System.out.print("\nPrimo(s): ");      
                Matematica.primos(inicio, fim);
                System.out.print("\n");
                System.out.print("\n");
                exata();
                break;
            case 4:
                System.out.print("\nInforme um número inicial: ");        
                inicio = scanner.nextInt();
                System.out.print("Informe um número final: ");        
                fim = scanner.nextInt();
                System.out.print("\nNúmero(s) : ");
                Matematica.numeros(inicio, fim);
                System.out.print("\nMinimo(s): ");      
                Matematica.minimos(inicio, fim);
                System.out.print("\nMáximo(s): ");      
                Matematica.maximos(inicio, fim);
                System.out.print("\n");
                exata();
                break;
            case 5:
                System.out.print("\nInforme o primeiro número: ");        
                inicio = scanner.nextInt();
                System.out.print("Informe o segundo número: ");        
                fim = scanner.nextInt();                
                Matematica.calculadora(inicio, fim);
                System.out.print("\n");
                exata();
                break;
            case 6:
                System.out.print("\n");
                Index.menu();
                break;
            case 0:
                System.out.println(" ");
                System.out.println("Programa encerrando...");	
                System.exit(0);
                break;
            default:
                System.out.print("\n");
                System.out.println("Opção Inválida!");
                System.out.print("\n");
                exata();
                break;
            }
        } while (opcao != 0);
    }
}