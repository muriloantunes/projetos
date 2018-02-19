import java.util.Scanner;
class Computador {
    Scanner scanner = new Scanner(System.in);
    ProdutoVO po = new ProdutoVO();
    public void maquina(){
        System.out.print("Escreva uma marca de pc: ");        
        String pc = scanner.nextLine();
        System.out.print("Escreva o preco do pc: ");        
        String prc = scanner.nextLine();
        
        System.out.print("\n");
        computadorName(pc);
        computadorPrice("R$ "+prc+",00");
        System.out.print("\n");
    }
    public void computadorName(String name) {        
        po.setName(name);
        System.out.println(po.getName());
    }
    public void computadorPrice(String price) { 
        po.setPrice(price); 
        System.out.println(po.getPrice()); 
    }
}