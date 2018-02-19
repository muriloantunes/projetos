class Cripto3{
    public void criptografar3(String a){
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
}
