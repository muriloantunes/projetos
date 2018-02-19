import java.util.Scanner;
class Matematica{
    public static void numeros(int inicio, int fim){
        if ( inicio < fim ){
            for ( ; inicio <= fim; inicio++){
                System.out.print(inicio+" ");
            }
        } else if ( inicio > fim){ 
            for ( ; inicio >= fim; inicio--){
                System.out.print(inicio+" ");
            }
        } else {
            for ( ; inicio == fim; inicio++){
                System.out.print(inicio+" ");
            }
        }
    }
    public static void modN(int inicio, int fim, int mod){
        if ( inicio < fim ){
            for ( ; inicio <= fim; inicio++){
                if (inicio % mod == 0 && inicio != 0){
                    System.out.print(inicio+" "); 
                }            
            }
        } else if ( inicio > fim){ 
            for ( ; inicio >= fim; inicio--){
                if (inicio % mod == 0 && inicio != 0){
                    System.out.print(inicio+" "); 
                }
            }
        } else {
            for ( ; inicio == fim; inicio++){
                if (inicio % mod == 0 && inicio != 0){
                    System.out.print(inicio+" "); 
                } else {
                    System.out.print("ñ ");
                }
            }
        }
    }
    public static void pares(int inicio, int fim){
        if ( inicio < fim ){
            for (; inicio <= fim; inicio++){
                if (inicio % 2 == 0 && inicio != 0){
                    System.out.print(inicio+" "); 
                }
            }
        } else if ( inicio > fim){ 
            for (; inicio >= fim; inicio--){
                if (inicio % 2 == 0 && inicio != 0){
                    System.out.print(inicio+" "); 
                }
            }
        } else {
            for (; inicio == fim; inicio++){
                if (inicio % 2 == 0 && inicio != 0){
                    System.out.print(inicio+" "); 
                } else {
                    System.out.print("ñ ");
                }
            }
        }
    }
    public static void impares(int inicio, int fim){
        if ( inicio < fim ){
            for (; inicio <= fim; inicio++){
                if (inicio % 2 == 1 && inicio != 0){
                    System.out.print(inicio+" "); 
                }
            }
        } else if ( inicio > fim){ 
            for (; inicio >= fim; inicio--){
                if (inicio % 2 == 1 && inicio != 0){
                    System.out.print(inicio+" "); 
                }
            }
        } else {
            for (; inicio == fim; inicio++){
                if (inicio % 2 == 1 && inicio != 0){
                    System.out.print(inicio+" "); 
                } else {
                    System.out.print("ñ ");
                }
            }
        }
    }
    public static void primos(int inicio, int fim){
        if ( inicio < fim ){
            for (; inicio <= fim; inicio++){
                int counter = 0; 
                for (int k = 1; k <= inicio; k++){
                    if (inicio % k == 0){
                        ++counter;
                    }
                }
                if (counter == 2 && inicio != 0){
                    System.out.print(inicio+" "); 
                } 
            }
        } else if ( inicio > fim){ 
            for (; inicio >= fim; inicio--){
                int counter = 0; 
                for (int k = 1; k <= inicio; k++){
                    if (inicio % k == 0){
                        ++counter;
                    } 
                }
                if (counter == 2 && inicio != 0){
                    System.out.print(inicio+" "); 
                }
            }
        } else {
            for (; inicio == fim; inicio++){
                int counter = 0; 
                for (int k = 1; k <= inicio; k++){
                    if (inicio % k == 0){
                        ++counter;
                    }
                }
                if (counter == 2 && inicio != 0){
                    System.out.print(inicio+" "); 
                } else {
                    System.out.print("ñ ");
                }
            }                
        }
    }
    public static void minimos(int inicio, int fim){
        float in = inicio;
        float out = fim;
        String minimo1 = String.format("%.0f", (Math.min(in, out)));
        String minimo2 = String.format("%.0f", (Math.min(out, in)));

        if (inicio > fim){
            System.out.print(inicio+" a "+fim+" = "+minimo1);
        } else if (inicio < fim){
            System.out.print(fim+" a "+inicio+" = "+minimo2);
        } else {
            System.out.println(inicio+" a "+fim+" = "+minimo1);
            System.out.print("\t\t      "+fim+" a "+inicio+" = "+minimo2);
        }
    }
    public static void maximos(int inicio, int fim){
        float in = inicio;
        float out = fim;
        String maximo1 = String.format("%.0f", (Math.max(in, out)));
        String maximo2 = String.format("%.0f", (Math.max(out, in)));

        if (inicio > fim){
            System.out.println(inicio+" a "+fim+" = "+maximo1);
        } else if (inicio < fim){
            System.out.println(fim+" a "+inicio+" = "+maximo2);
        } else {
            System.out.println(inicio+" a "+fim+" = "+maximo1);
            System.out.println("\t\t      "+fim+" a "+inicio+" = "+maximo2);
        }
    }
    public static void calculadora(int inicio, int fim){ 
        Scanner scanner = new Scanner(System.in);     
        int multi1 = (inicio * fim);
        int multi2 = (fim * inicio);
        int soma1 = (inicio + fim);
        int soma2 = (fim + inicio);
        int sub1 = (inicio - fim);
        int sub2 = (fim - inicio);
        int div1 = (inicio / fim);
        int div2 = (fim / inicio);
        int mod1 = (inicio % fim);
        int mod2 = (fim % inicio);
        String potencia1 = String.format("%.0f", (Math.pow(inicio, fim)));
        String potencia2 = String.format("%.0f", (Math.pow(fim, inicio)));
        
        // System.out.print("\nNumero(s) : ");
        // numeros(inicio, fim);
        // System.out.println(" ");
        System.out.print("\n");
        if (inicio > fim){
            menuCalculadora();            
            System.out.print("Opção => ");
            int opcao = scanner.nextInt();
            System.out.print("\n");
            do {                    
                switch (opcao) {
                case 1:
                    System.out.println(inicio+" * "+fim+" = "+multi1);
                    calculadora(inicio, fim);
                    break;
                case 2:
                    System.out.println(inicio+" + "+fim+" = "+soma1);
                    calculadora(inicio, fim);
                    break;
                case 3:
                    System.out.println(inicio+" - "+fim+" = "+sub1);
                    calculadora(inicio, fim);
                    break;
                case 4:
                    System.out.println(inicio+" / "+fim+" = "+div1);
                    calculadora(inicio, fim);
                    break;
                case 5:
                    System.out.println(inicio+" % "+fim+" = "+mod1);
                    calculadora(inicio, fim);
                    break;
                case 6:
                    System.out.println(inicio+" ^ "+fim+" = "+potencia1);
                    calculadora(inicio, fim);
                    break;
                case 7:
                    // System.out.print("\n");
                    Main.exata();
                    break;
                case 0:
                    // System.out.println(" ");
                    System.out.println("Programa encerrando...");	
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    calculadora(inicio, fim);
                    break;
                }
            } while (opcao != 0);  
        } else if (inicio < fim){           
            menuCalculadora();            
            System.out.print("Opção => ");
            int opcao = scanner.nextInt();
            System.out.print("\n");
            do {                    
                switch (opcao) {
                case 1:
                    System.out.println(fim+" * "+inicio+" = "+multi2);
                    calculadora(inicio, fim);
                    break;
                case 2:
                    System.out.println(fim+" + "+inicio+" = "+soma2);
                    calculadora(inicio, fim);
                    break;
                case 3:         
                    System.out.println(fim+" - "+inicio+" = "+sub2);
                    calculadora(inicio, fim);
                    break;
                case 4:
                    System.out.println(fim+" / "+inicio+" = "+div2);
                    calculadora(inicio, fim);
                    break;
                case 5:
                    System.out.println(fim+" % "+inicio+" = "+mod2);
                    calculadora(inicio, fim);
                    break;
                case 6:
                    System.out.println(fim+" ^ "+inicio+" = "+potencia2);
                    calculadora(inicio, fim);
                    break;
                case 7:
                    // System.out.print("\n");
                    Main.exata();
                    break;
                case 0:
                    // System.out.println(" ");
                    System.out.println("Programa encerrando...");	
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    calculadora(inicio, fim);
                    break;
                }
            } while (opcao != 0);  
        } else {
            menuCalculadora();            
            System.out.print("Opção => ");
            int opcao = scanner.nextInt();
            System.out.print("\n");
            do {                    
                switch (opcao) {
                case 1:
                    System.out.println(inicio+" * "+fim+" = "+multi1);                    
                    System.out.println(fim+" * "+inicio+" = "+multi2);
                    calculadora(inicio, fim);
                    break;
                case 2:
                    System.out.println(inicio+" + "+fim+" = "+soma1);
                    System.out.println(fim+" + "+inicio+" = "+soma2); 
                    calculadora(inicio, fim);
                    break;
                case 3: 
                    System.out.println(inicio+" - "+fim+" = "+sub1);
                    System.out.println(fim+" - "+inicio+" = "+sub2);
                    calculadora(inicio, fim);
                    break;
                case 4:
                    System.out.println(inicio+" / "+fim+" = "+div1);
                    System.out.println(fim+" / "+inicio+" = "+div2);
                    calculadora(inicio, fim);
                    break;
                case 5:
                    System.out.println(inicio+" % "+fim+" = "+mod1);
                    System.out.println(fim+" % "+inicio+" = "+mod2);
                    calculadora(inicio, fim);
                    break;
                case 6:
                    System.out.println(inicio+" ^ "+fim+" = "+potencia1);
                    System.out.println(fim+" ^ "+inicio+" = "+potencia2);
                    calculadora(inicio, fim);
                    break;
                case 7:
                    // System.out.print("\n");
                    Main.exata();
                    break;
                case 0:
                    // System.out.println(" ");
                    System.out.println("Programa encerrando...");	
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    calculadora(inicio, fim);
                    break;
                }
            } while (opcao != 0);
        }
    }
    public static void menuCalculadora(){
        System.out.println("=======================");
        System.out.println(" | 1 - MULTIPLICAÇÃO");
        System.out.println(" | 2 - ADIÇÃO OU SOMA");
        System.out.println(" | 3 - SUBSTRAÇÃO");
        System.out.println(" | 4 - DIVISÃO");
        System.out.println(" | 5 - MOD");
        System.out.println(" | 6 - POTÊNCIA");
        System.out.println(" | 7 - VOLTAR");
        System.out.println(" | 0 - SAIR");
        System.out.println("=======================\n");
    }
}