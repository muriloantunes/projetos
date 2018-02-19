class Polibio{
    public void Polibio(String frase)
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