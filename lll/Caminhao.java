public class Caminhao extends Veiculo {
    private double toneladas;
    public Caminhao(String marca,int ano,double toneladas){
        super(marca,ano);
        this.toneladas=toneladas;
    }

    
    public String getDados(){
        return "Caminhao -> "+super.getDados()+" | Toneladas: "+toneladas;}
}