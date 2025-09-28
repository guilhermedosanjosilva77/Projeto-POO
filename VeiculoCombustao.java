public class VeiculoCombustao extends Veiculo{
    double consumoMedio;
    double nivelCombustivelatual;
    double perdaDeCombustivel;

    public VeiculoCombustao(String modelo, String marca, double velocidadeAtual, double consumoMedio,
            double nivelCombustivel, double perdaDeCombustivel) {
        super(modelo, marca, velocidadeAtual);
        this.consumoMedio = consumoMedio;
        this.nivelCombustivelatual = nivelCombustivel;
        this.perdaDeCombustivel = perdaDeCombustivel;

    }
    



    public double getConsumoMedio() {
        return consumoMedio;
    }





    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }





    public double getNivelCombustivel() {
        return nivelCombustivelatual;
    }





    public void setNivelCombustivel(double nivelCombustivel) {
        this.nivelCombustivelatual = nivelCombustivel;
    }
    //Dados que serão pré definidos pela empresa no inicio de cada semana
    public double calcularConsumoMedio(double distancia, double combustivelgasto){
      this.consumoMedio=distancia/combustivelgasto;
        
        return this.consumoMedio;

    }
    public boolean perdaDeCombustivelcalc(double gastoReal, double distanciaRealPercorrida){
        double combustivelEsperado=distanciaRealPercorrida/this.consumoMedio;
        this.perdaDeCombustivel=gastoReal - combustivelEsperado;
        if(perdaDeCombustivel > 0){
            return true;
        }
        else return false;


    }
    @Override
    public String gerarRelatorio(){
        String relatorioBase = super.gerarRelatorio() +"\n";

        if (perdaDeCombustivelcalc(consumoMedio, velocidadeAtual) == true) {
            return relatorioBase + " ALERTA --Veiculo com problemas de vazamento ou similares-- ALERTA";
            
        }
        else
        return relatorioBase + "Veiculo está 100%";


        }





    
}
