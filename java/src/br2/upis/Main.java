class Main {
	public static void main(String[] args) {
		Cript cript = new Cript();
		Polibio polibio= new Polibio();
		
		int[] teste1 = {5,7,4,1,2,8,3,9,6};
		int[] teste2 = {9,7,4,1,2,8,3,5,6};
		int[] teste3 = {1,7,13,19,25,31,2,8,14,20,26,32,3,9,15,21,27,33,4,10,16,22,28,34,5,11,17,23,29,35,6,12,18,24,30,36};
		int[] teste4 = {4,5,7,3,1,9,2,6,8};
		int[] teste5 = {4,5,7,3,8,9,2,6,1};
		int X = -7;
		int Y = 8;
		String Frase1 =("WGFBQWQNAEQZXYENUEGAANEAGGFEQAJEGUYZ");
		String Frase2 =("NAUPISOALUNOSOPASSAVIUESTUDANDOMESMO");

		String A = cript.CongruenciaVolta(Frase1, X, Y);
		String B = cript.PermutacaoVolta(A, teste1);
		String C = cript.TpCh(B, teste3);
		String D = cript.PermutacaoVolta(C, teste2);		
		String E = cript.PermutacaoIda(D, teste5);
		String F = cript.TpCh(E, teste3);
		String G = cript.PermutacaoIda(F, teste4);
		String H = cript.CongruenciaIda(G, X, Y);		

		System.out.println(" ");
		System.out.println(Frase1);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);
		System.out.println(F);
		System.out.println(G);
		System.out.println(H);		
		System.out.println("/////////////////////////////////////////////");

		String A1 = cript.PermutacaoIda(D, teste5);
		String B1 = cript.TpCh(A1, teste3);
		String C1 = cript.PermutacaoIda(B1, teste4);
		String D1 = cript.CongruenciaIda(C1, X, Y);
		String E1 = cript.CongruenciaVolta(D1, X, Y);
		String F1 = cript.PermutacaoVolta(E1, teste1);
		String G1 = cript.TpCh(F1, teste3);
		String H1 = cript.PermutacaoVolta(G1, teste2);

		System.out.println(" ");
		System.out.println(Frase2);
		System.out.println(A1);
		System.out.println(B1);
		System.out.println(C1);
		System.out.println(D1);
		System.out.println(E1);
		System.out.println(F1);
		System.out.println(G1);
		System.out.println(H1);
		System.out.println("/////////////////////////////////////////////");
		System.out.println(" ");
		
		polibio.Polibio(Frase2.toUpperCase());
		System.out.println(" ");	
	}
}
