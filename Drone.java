public class Drone extends VeiculoEletrico{

    double altitudeMax;
    double tempoVoo;


    public Drone() {
        super(modelo, marca, velocidadeAtual);
        this.altitudeMax = altitudeMax;
        this.tempoVoo = tempoVoo;
    }



    public double getAltitudeMax() {
        return altitudeMax;
    }



    public void setAltitudeMax(double altitudeMax) {
        this.altitudeMax = altitudeMax;
    }



    public double getTempoVoo() {
        return tempoVoo;
    }



    public void setTempoVoo(double tempoVoo) {
        this.tempoVoo = tempoVoo;
    }



    public double calcularTempoVoo( double capacidadeBateria, double consumoEnergia){
        tempoVoo = capacidadeBateria / consumoEnergia * 60;
         return tempoVoo;

         
    }



    public double calcularAltitudeMax(double peso, double potenciaMotor){
        altitudeMax = potenciaMotor / peso * 100;
        return altitudeMax;
        
    }
    
}
