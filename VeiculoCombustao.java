public class VeiculoCombustao extends Veiculo{
    double consumoMedio;
    double nivelCombustivel;
    int tempo;

    

    
    public VeiculoCombustao(String modelo, String marca, double velocidadeAtual, double consumoMedio,
            double nivelCombustivel, int tempo) {
        super(modelo, marca, velocidadeAtual);
        this.consumoMedio = consumoMedio;
        this.nivelCombustivel = nivelCombustivel;
        this.tempo = tempo;
    }
    



    public double getConsumoMedio() {
        return consumoMedio;
    }





    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }





    public double getNivelCombustivel() {
        return nivelCombustivel;
    }





    public void setNivelCombustivel(double nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }





    public int getTempo() {
        return tempo;
    }





    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public double calcconsumoMedio(int distanciatotal, int combustivelGasto){
       this.consumoMedio=distanciatotal/combustivelGasto;
        return  this.consumoMedio;


    }
    public double calcularKML(double distancia, double combustivelgasto){
      double consumokml=distancia/combustivelgasto;
        
        return consumokml;

    }






    
}
