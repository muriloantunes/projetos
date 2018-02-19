import java.util.Scanner;
class Laptop{
    Scanner scanner = new Scanner(System.in);
    ProdutoVO po = new ProdutoVO(); 
    public void maquina(){
        System.out.print("Escreva uma marca de note: ");        
        String note = scanner.nextLine();
        System.out.print("Escreva o preco do note: ");        
        String prc2 = scanner.nextLine();

        System.out.print("\n");
        laptopName(note);
        laptopPrice("R$ "+prc2+",00");
        System.out.print("\n");
    }
    public void laptopName(String name) {
        po.setName(name); 
        System.out.println(po.getName());
    }
    public void laptopPrice(String price) {
        po.setPrice(price); 
        System.out.println(po.getPrice()); 
    }    
}