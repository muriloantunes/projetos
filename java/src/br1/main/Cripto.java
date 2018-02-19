import java.util.Scanner;
class Cripto{    
    public static void enigma(){
        Scanner scanner = new Scanner(System.in);
        String Frase1 =("WGFBQWQNAEQZXYENUEGAANEAGGFEQAJEGUYZ").toUpperCase();
        String Frase2 =("NAUPISOALUNOSOPASSAVIUESTUDANDOMESMO").toUpperCase();

        System.out.print("Escreva algo para criptografar: ");        
        String algo = scanner.nextLine();
        System.out.print("Escreva uma letra para criptografar: ");        
        String alg = scanner.nextLine();

        System.out.print("\n");
        ascii(algo);
        System.out.print("\n");
        System.out.print("\n");
        criptografar1((alg).toUpperCase());
        criptografar2((alg).toLowerCase());
        System.out.print("\n");
        criptografar3(Frase1);
        System.out.print("\n");
        System.out.print("\n");
        Polibio1(Frase2);
        System.out.print("\n");
        System.out.print("\n");
    }
    public static void ascii(String a){
        int aLenght = a.length();
        for(int i = 0; i < aLenght ; i++) {
            char letra = a.charAt(i);
            int ascii = (int) letra;
            // System.out.println(letra+" ");
            // System.out.println(ascii+" ");
            // System.out.println(letra +" = "+ ascii);
            // System.out.println(letra +" = "+ ascii+" ");
            // System.out.print(letra+" ");
            System.out.print(ascii+" ");
            // System.out.print(letra +" = "+ ascii);
            // System.out.print(letra +" = "+ ascii+" ");
        }
    }
    public static void criptografar1(String a){ 
        int num = 0;       
        int aLenght = a.length();
        for(int i = 0; i < aLenght ; i++) {
            char letra = a.charAt(i);
            switch(letra){
                case 'A': num = 1;
                        break;
                case 'B': num = 2;
                        break;
                case 'C': num = 3;
                        break;
                case 'D': num = 4;
                        break;
                case 'E': num = 5;
                        break;
                case 'F': num = 6;
                        break;
                case 'G': num = 7;
                        break;
                case 'H': num = 8;
                        break;
                case 'I': num = 9;
                        break;
                case 'J': num = 10;
                        break;
                case 'K': num = 11;
                        break;
                case 'L': num = 12;
                        break;
                case 'M': num = 13;
                        break;
                case 'N': num = 14;
                        break;
                case 'O': num = 15;
                        break;
                case 'P': num = 16;
                        break;
                case 'Q': num = 17;
                        break;
                case 'R': num = 18;
                        break;
                case 'S': num = 19;
                        break;
                case 'T': num = 20;
                        break;
                case 'U': num = 21;
                        break;
                case 'V': num = 22;
                        break;
                case 'W': num = 23;
                        break;
                case 'X': num = 24;
                        break;
                case 'Y': num = 25;
                        break;
                case 'Z': num = 26;
                            break;           
            }
        }

        num=num-6;

        for(int j=1;;j++){
            num=num+26;
            if(num%5==0){
                break;
            }    			
        }

        num=num/5;
        num=(num*-1);

        for(int l=1;num<0;l++){
            num=num+26;                 			
        }
       
        char letras = 0;
        switch(num){
                case 1: letras = ('A');
                    break;
                case 2: letras = ('B');
                    break;
                case 3: letras = ('C');
                    break;
                case 4: letras = ('D');
                    break;
                case 5: letras = ('E');
                    break;
                case 6: letras = ('F');
                    break;
                case 7: letras = ('G');
                    break;
                case 8: letras = ('H');
                    break;
                case 9: letras = ('I');
                    break;
                case 10: letras = ('J');
                    break;
                case 11: letras = ('K');
                    break;
                case 12: letras = ('L');
                    break;
                case 13: letras = ('M');
                    break;
                case 14: letras = ('N');
                    break;
                case 15: letras = ('O');
                    break;
                case 16: letras = ('P');
                    break;
                case 17: letras = ('Q');
                    break;
                case 18: letras = ('R');
                    break;
                case 19: letras = ('S');
                    break;
                case 20: letras = ('T');
                    break;
                case 21: letras = ('U');
                    break;
                case 22: letras = ('V');
                    break;
                case 23: letras = ('W');
                    break;
                case 24: letras = ('X');
                    break;
                case 25: letras = ('Y');
                    break;
                case 26: letras = ('Z');
                    break;            						
        }        
        System.out.println(letras + " => " + num);   
    } 
    public static void criptografar2(String a){
        int num = 0;   	    	
        char letra = a.charAt(0);
        switch(letra){
            case 'a': num = 1;
                break;
            case 'b': num = 2;
                break;
            case 'c': num = 3;
                break;
            case 'd': num = 4;
                break;
            case 'e': num = 5;
                break;
            case 'f': num = 6;
                break;
            case 'g': num = 7;
                break;
            case 'h': num = 8;
                break;
            case 'i': num = 9;
                break;
            case 'j': num = 10;
                break;
            case 'k': num = 11;
                break;
            case 'l': num = 12;
                break;
            case 'm': num = 13;
                break;
            case 'n': num = 14;
                break;
            case 'o': num = 15;
                break;
            case 'p': num = 16;
                break;
            case 'q': num = 17;
                break;
            case 'r': num = 18;
                break;
            case 's': num = 19;
                break;
            case 't': num = 20;
                break;
            case 'u': num = 21;
                break;
            case 'v': num = 22;
                break;
            case 'w': num = 23;
                break;
            case 'x': num = 24;
                break;
            case 'y': num = 25;
                break;
            case 'z': num = 26;
                break;                        
        }          

        num=num-6;

        for(int k=1;;k++){
            num=num+26;
            if(num%5==0){
                break;
            }    			
        }    		

        num=num/5;
        num=(num*-1);

        for(int l=1;num<0;l++){
            num=num+26;    			
        }

        switch(num){
            case 1: System.out.println("a => " + num);
                break;
            case 2: System.out.println("b => " + num);
                break;
            case 3: System.out.println("c => " + num);
                break;
            case 4: System.out.println("d => " + num);
                break;
            case 5: System.out.println("e => " + num);
                break;
            case 6: System.out.println("f => " + num);
                break;
            case 7: System.out.println("g => " + num);
                break;
            case 8: System.out.println("h => " + num);
                break;
            case 9: System.out.println("i => " + num);
                break;
            case 10: System.out.println("j => " + num);
                break;
            case 11: System.out.println("k => " + num);
                break;
            case 12: System.out.println("l => " + num);
                break;
            case 13: System.out.println("m => " + num);
                break;
            case 14: System.out.println("n => " + num);
                break;
            case 15: System.out.println("o => " + num);
                break;
            case 16: System.out.println("p => " + num);
                break;
            case 17: System.out.println("q => " + num);
                break;
            case 18: System.out.println("r => " + num);
                break;
            case 19: System.out.println("s => " + num);
                break;
            case 20: System.out.println("t => " + num);
                break;
            case 21: System.out.println("u => " + num);
                break;
            case 22: System.out.println("v => " + num);
                break;
            case 23: System.out.println("w => " + num);
                break;
            case 24: System.out.println("x => " + num);
                break;
            case 25: System.out.println("y => " + num);
                break;
            case 26: System.out.println("z => " + num);
                break;    						
        }   		  		
    }
    public static void criptografar3(String a){
        int aLenght = a.length();
        for(int i = 0; i < aLenght ; i++) {
            char letra = a.charAt(i);
            int ascii = (int) letra;
            int num=0, s=0;
            if(ascii > 64 && ascii < 91){
                num= ascii - 64;
            }
            
            num=num-8;
                
            for(int m=1;;m++){
                num=num+26;
                if(num%7==0){
                    break;
                }
            }
            
            num=num/7;
            num=(num*-1);
                
            for (int f=1;num<0;f++){
                num=num+26;
            }          
            
            num=num+64;

            char ch = (char) num;
                          
            System.out.print(ch);                    
        }
    }
    public static void Polibio1(String frase)
    {

        int fraseLenght = frase.length();
        for(int i = 0; i < fraseLenght; i++) {
            char letra = frase.charAt(i);
            if(fraseLenght <=36)
            System.out.print(" ");        
                switch (letra)
                {
                    case 'A':                        
                        System.out.print(11);
                        break;
                    case 'B':
                        System.out.print(12);
                        break;
                    case 'C':
                        System.out.print(13);
                        break;
                    case 'D':
                        System.out.print(14);
                        break;
                    case 'E':
                        System.out.print(15);
                        break;
                    case 'F':
                        System.out.print(21);
                        break;
                    case 'G':
                        System.out.print(22);
                        break;
                    case 'H':
                        System.out.print(23);
                        break;
                    case 'I':
                        System.out.print(24);
                        break;
                    case 'J':
                        System.out.print(25);
                        break;
                    case 'K': case 'Q':
                        System.out.print(31);
                        break;
                    case 'L':
                        System.out.print(32);
                        break;
                    case 'M':
                        System.out.print(33);
                        break;
                    case 'N':
                        System.out.print(34);
                        break;
                    case 'O':
                        System.out.print(35);
                        break;
                    case 'P':
                        System.out.print(41);
                        break;
                    case 'R':
                        System.out.print(42);
                        break;
                    case 'S':
                        System.out.print(43);
                        break;
                    case 'T':
                        System.out.print(44);
                        break;
                    case 'U':
                        System.out.print(45);
                        break;
                    case 'V':
                        System.out.print(51);
                        break;
                    case 'W':
                        System.out.print(52);
                        break;
                    case 'X':
                        System.out.print(53);
                        break;
                    case 'Y':
                        System.out.print(54);
                        break;
                    case 'Z':
                        System.out.print(55);
                        break;
            }              
        }                      
    }
}