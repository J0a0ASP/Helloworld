public class Navio extends Aquatico {
    private int tripulantes;
    public Navio(String marca,int ano,int tripulantes){
        super(marca,ano);
        this.tripulantes=tripulantes;
    }
    public String getDados(){
        return "Navio -> "+ super.getDados()+" | Tripulantes: "+tripulantes;}
}
