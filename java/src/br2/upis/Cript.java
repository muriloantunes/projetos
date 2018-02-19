class Cript {
    public int letraEmNumero(char letra)
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

    public char numeroEmLetra(int numero)
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

    public int[] transformaFraseEmNumero(char[] frase)
    {

        int[] aux = new int[frase.length];

        for (int i = 0; i < frase.length; i++)
        {
            frase[i] = Character.toLowerCase(frase[i]);
            aux[i] = letraEmNumero(frase[i]);
        }
        return aux;
    }

    public char[] transformaNumerosEmFrase(int[] numero)
    {
        char[] aux = new char[numero.length];

        for (int i = 0; i <= numero.length - 1; i++)
        {
            aux[i] = numeroEmLetra(numero[i]);
        }

        return aux;
    }

    public String Permutacao(String frase, int[] chave)
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

    public String Congruencia(String frase,int x, int y)
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
    public String PermutacaoIda(String fraseOriginal, int[] chave)
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

    public String CongruenciaIda(String frase, int x, int y)
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

    public String TpCh(String fraseOriginal, int[] chave)
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
    
    public String PermutacaoVolta(String fraseOriginal, int[] chave)
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

    public String CongruenciaVolta(String frase, int x, int y)
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

    
    
