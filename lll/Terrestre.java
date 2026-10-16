public class Terrestre extends Veiculo{
        protected int portas;
    
        public Terrestre(String marca, int ano, int portas) {
            super(marca, ano);
            this.portas = portas;
        }
    
        @Override
        public void exibirDados() {
            super.exibirDados();
            System.out.println("Portas: " + portas);
        }
    }