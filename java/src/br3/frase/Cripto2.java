class Cripto2{
     public void criptografar2(String a){
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
}