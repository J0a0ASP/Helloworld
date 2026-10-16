public class Aquatico extends Veiculo{

    public Aquatico(String marca, int ano) {
        super(marca, ano);
    }
    
    @Override
    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}