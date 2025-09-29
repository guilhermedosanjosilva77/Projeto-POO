public class VeiculoEletrico extends Veiculo {
    
    int capacidadeBateria;
    double autonomia;
    int tempoCargaRestante;
    int cargaAtual;

    public VeiculoEletrico(String modelo, String marca, double velocidadeAtual) {
            super(modelo, marca, velocidadeAtual);
        }
    
        public double calcularAutonomia(double autonomia, int capacidade, int tempoCargaRestante, int cargaAtual){
        
    }
}
