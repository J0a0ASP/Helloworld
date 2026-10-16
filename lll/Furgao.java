public class Furgao extends Terrestre {
    public Furgao(String marca, int ano, int portas) {
        super(marca, ano, portas);
    }
    
    @Override
    public void exibirDados() {
        System.out.println("--- Dados do Furgao ---");
        super.exibirDados(); 
    
    }
}