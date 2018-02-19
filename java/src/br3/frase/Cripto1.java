class Cripto1 {
    public void criptografar1(String a){ 
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
}
