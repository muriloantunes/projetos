class Cript {
    public static void enigma(){
        int[] teste1 = {5,7,4,1,2,8,3,9,6};
        int[] teste2 = {9,7,4,1,2,8,3,5,6};
        int[] teste3 = {1,7,13,19,25,31,2,8,14,20,26,32,3,9,15,21,27,33,4,10,16,22,28,34,5,11,17,23,29,35,6,12,18,24,30,36};
        int[] teste4 = {4,5,7,3,1,9,2,6,8};
        int[] teste5 = {4,5,7,3,8,9,2,6,1};
        int X = -7;
        int Y = 8;
        String Frase1 =("WGFBQWQNAEQZXYENUEGAANEAGGFEQAJEGUYZ").toUpperCase();
        String Frase2 =("NAUPISOALUNOSOPASSAVIUESTUDANDOMESMO").toUpperCase();

        String A = CongruenciaVolta(Frase1, X, Y);
        String B = PermutacaoVolta(A, teste1);
        String C = TpCh(B, teste3);
        String D = PermutacaoVolta(C, teste2);		
        String E = PermutacaoIda(D, teste5);
        String F = TpCh(E, teste3);
        String G = PermutacaoIda(F, teste4);
        String H = CongruenciaIda(G, X, Y);		

        System.out.println(Frase1);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
        System.out.println(G);
        System.out.println(H);		

        String A1 = PermutacaoIda(D, teste5);
        String B1 = TpCh(A1, teste3);
        String C1 = PermutacaoIda(B1, teste4);
        String D1 = CongruenciaIda(C1, X, Y);
        String E1 = CongruenciaVolta(D1, X, Y);
        String F1 = PermutacaoVolta(E1, teste1);
        String G1 = TpCh(F1, teste3);
        String H1 = PermutacaoVolta(G1, teste2);

        System.out.print("\n");
        System.out.println(Frase2);
        System.out.println(A1);
        System.out.println(B1);
        System.out.println(C1);
        System.out.println(D1);
        System.out.println(E1);
        System.out.println(F1);
        System.out.println(G1);
        System.out.println(H1);
    }
    public static int letraEmNumero(char letra)
    {
        int numero;

        switch (letra)
        {
            case 'a':
                return numero = 1;
            case 'b':
                return numero = 2;
            case 'c':
                return numero = 3;
            case 'd':
                return numero = 4;
            case 'e':
                return numero = 5;
            case 'f':
                return numero = 6;
            case 'g':
                return numero = 7;
            case 'h':
                return numero = 8;
            case 'i':
                return numero = 9;
            case 'j':
                return numero = 10;
            case 'k':
                return numero = 11;
            case 'l':
                return numero = 12;
            case 'm':
                return numero = 13;
            case 'n':
                return numero = 14;
            case 'o':
                return numero = 15;
            case 'p':
                return numero = 16;
            case 'q':
                return numero = 17;
            case 'r':
                return numero = 18;
            case 's':
                return numero = 19;
            case 't':
                return numero = 20;
            case 'u':
                return numero = 21;
            case 'v':
                return numero = 22;
            case 'w':
                return numero = 23;
            case 'x':
                return numero = 24;
            case 'y':
                return numero = 25;
            case 'z':
                return numero = 26;
        }
        return 0;
    }

    public static char numeroEmLetra(int numero)
    {
        char letra;

        switch (numero)
        {
            case 0:
                return letra = ' ';
            case 1:
                return letra = 'A';
            case 2:
                return letra = 'B';
            case 3:
                return letra = 'C';
            case 4:
                return letra = 'D';
            case 5:
                return letra = 'E';
            case 6:
                return letra = 'F';
            case 7:
                return letra = 'G';
            case 8:
                return letra = 'H';
            case 9:
                return letra = 'I';
            case 10:
                return letra = 'J';
            case 11:
                return letra = 'K';
            case 12:
                return letra = 'L';
            case 13:
                return letra = 'M';
            case 14:
                return letra = 'N';
            case 15:
                return letra = 'O';
            case 16:
                return letra = 'P';
            case 17:
                return letra = 'Q';
            case 18:
                return letra = 'R';
            case 19:
                return letra = 'S';
            case 20:
                return letra = 'T';
            case 21:
                return letra = 'U';
            case 22:
                return letra = 'V';
            case 23:
                return letra = 'W';
            case 24:
                return letra = 'X';
            case 25:
                return letra = 'Y';
            case 26:
                return letra = 'Z';
        }
        return '*';
    }

    public static int[] transformaFraseEmNumero(char[] frase)
    {

        int[] aux = new int[frase.length];

        for (int i = 0; i < frase.length; i++)
        {
            frase[i] = Character.toLowerCase(frase[i]);
            aux[i] = letraEmNumero(frase[i]);
        }
        return aux;
    }

    public static char[] transformaNumerosEmFrase(int[] numero)
    {
        char[] aux = new char[numero.length];

        for (int i = 0; i <= numero.length - 1; i++)
        {
            aux[i] = numeroEmLetra(numero[i]);
        }

        return aux;
    }

    public static String Permutacao(String frase, int[] chave)
    {
    	
    	char[] fraseVet;
    	fraseVet = frase.toCharArray();
    	char[] vetAux = new char[chave.length];
    	char[] pedaco = new char[chave.length];

    
    	
    	for(int i = 0; i< chave.length ; i++ )
    	{			
    		
    			pedaco[i] = fraseVet[i]; 		
    	}
    	for(int i = 0; i< chave.length ; i++)
    	{
    		
    		vetAux[chave[i]-1] = pedaco[i];	
    	}  
    	   	

    		
    	String teste = new String(vetAux);
    	
    	return teste;
    }

    public static String Congruencia(String frase,int x, int y)
    {
    	
       //  -3x + 7 = l + n26 - ELA � BONITA
    	
    	char[] fraseCriptografada;
    	int[] vetAux;
    	fraseCriptografada = frase.toCharArray();
    	vetAux = transformaFraseEmNumero(fraseCriptografada);
    	double resultado;
    	
    	for (int i = 0; i < vetAux.length ; i++)
    	{
    		
    		resultado = x * vetAux[i] + y;
    		
    		while(resultado <= 0){
    			resultado = resultado + 26;
    		}
    		
    		while(resultado > 26){
    			resultado = resultado - 26;
    		}
    		
    		
    		vetAux[i] = (int) resultado; 
    	}
    	
    		 fraseCriptografada = transformaNumerosEmFrase(vetAux);
    	     String fraseFinal = new String(fraseCriptografada);
    		    	
    	return fraseFinal;
    }
    //  574128396
    public static String PermutacaoIda(String fraseOriginal, int[] chave)
    {
		
		int tamanho = chave.length;
		int valorChave = 0;
		int ultimaInteracao;
		
		char[] frase = fraseOriginal.toCharArray();
		
		char[] pedaco = new char[tamanho];
		char[] resultado = new char[frase.length];
		
		
		while(frase.length > valorChave){
			
			ultimaInteracao = valorChave;
			
			for(int i = 0; i < pedaco.length; i++){
				pedaco[i] = frase[i + ultimaInteracao];
			}
			
			
			for(int i = 0; i < pedaco.length; i++){
				resultado[(chave[i] - 1) + ultimaInteracao] = pedaco[i];
				valorChave++;
			}	
		}
			
			String teste = new String(resultado);
		
		return teste;
	}

    public static String CongruenciaIda(String frase, int x, int y)
    {
    	
       //  -3x + 7 = l + n26 - ELA � BONITA
    	
    	char[] fraseCriptografada;
    	int[] vetAux;
    	fraseCriptografada = frase.toCharArray();
    	vetAux = transformaFraseEmNumero(fraseCriptografada);
    	double resultado;
    	
    	for (int i = 0; i < vetAux.length ; i++)
    	{
    		
    		resultado = x * vetAux[i] + y;
    		
    		while(resultado <= 0){
    			resultado = resultado + 26;
    		}
    		
    		while(resultado > 26){
    			resultado = resultado - 26;
    		}
    		
    		
    		vetAux[i] = (int) resultado; 
    	}
    	
    		 fraseCriptografada = transformaNumerosEmFrase(vetAux);
    	     String fraseFinal = new String(fraseCriptografada);
    		    	
    	return fraseFinal;
    }

    public static String TpCh(String fraseOriginal, int[] chave)
    {
		
		int tamanho = chave.length;
		int valorChave = 0;
		int ultimaInteracao;
		
		char[] frase = fraseOriginal.toCharArray();
		
		char[] pedaco = new char[tamanho];
		char[] resultado = new char[frase.length];
		
		
		while(frase.length > valorChave){
			
			ultimaInteracao = valorChave;
			
			for(int i = 0; i < pedaco.length; i++){
				pedaco[i] = frase[i + ultimaInteracao];
			}
			
			
			for(int i = 0; i < pedaco.length; i++){
				resultado[(chave[i] - 1) + ultimaInteracao] = pedaco[i];
				valorChave++;
			}	
		}
			
			String teste = new String(resultado);
		
		return teste;
    }
    
    public static String PermutacaoVolta(String fraseOriginal, int[] chave)
    {
		
		int tamanho = chave.length;
		int valorChave = 0;
		int ultimaInteracao;
		
		char[] frase = fraseOriginal.toCharArray();
		
		char[] pedaco = new char[tamanho];
		char[] resultado = new char[frase.length];
		
		
		while(frase.length > valorChave){
			
			ultimaInteracao = valorChave;
			
			for(int i = 0; i < pedaco.length; i++){
				pedaco[i] = frase[i + ultimaInteracao];
			}
			
			
			for(int i = 0; i < pedaco.length; i++){
				resultado[(chave[i] - 1) + ultimaInteracao] = pedaco[i];
				valorChave++;
			}	
		}
			
			String teste = new String(resultado);
		
		return teste;
	}

    public static String CongruenciaVolta(String frase, int x, int y)
    {

     //       -3x + 7 = l + n26 - ELA � BONITA

        y = y * -1;

        int n = 26;

        double resultado;
        char[] fraseCriptografada;
        int[] vetAux;
        fraseCriptografada = frase.toCharArray();
        vetAux = transformaFraseEmNumero(fraseCriptografada);

        for (int i = 0; i < vetAux.length; i++)
        {

            resultado = (y + vetAux[i] + n) / (double)x;

            while (resultado % x != 0 || resultado % x != -0)
            {
                n = n + 26;
                resultado = (y + vetAux[i] + n) / (double)x;
            }

            while (resultado <= 0)
            {
                resultado = resultado + 26;
            }

            while (resultado > 26)
            {
                resultado = resultado - 26;
            }

            if (vetAux[i] == 0)
                resultado = 0;

            vetAux[i] = (int)resultado;
        }

        fraseCriptografada = transformaNumerosEmFrase(vetAux);
        String fraseFinal = new String(fraseCriptografada);
        return fraseFinal;
    }   
}

    
    
