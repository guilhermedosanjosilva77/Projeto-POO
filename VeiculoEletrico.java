public class VeiculoEletrico extends Veiculo {
    
     private int capacidadeBateria; 
    private int cargaAtual;        
    private double autonomiaMaxima;  

    //METODOS CONSTRUTORES
    public VeiculoEletrico(String modelo, String marca, double velocidadeAtual) {
        super(modelo, marca, velocidadeAtual);
        //TODO Auto-generated constructor stub
    }
    public VeiculoEletrico(String modelo, String marca, double velocidadeAtual, int capacidadeBateria, int cargaAtual,
            double autonomiaMaxima) {
        super(modelo, marca, velocidadeAtual);
        this.capacidadeBateria = capacidadeBateria;
        this.cargaAtual = cargaAtual;
        this.autonomiaMaxima = autonomiaMaxima;
    }
    
    public double calcularAutonomia() {
        if (capacidadeBateria <= 0) {
            return 0.0;
        }
        // Lógica para elétricos: (carga / capacidade total) * autonomia máxima
        return ((double) this.cargaAtual / this.capacidadeBateria) * this.autonomiaMaxima;
    }

   
    public void monitorarDesempenho() {
        System.out.println("Monitoramento Elétrico:");
        System.out.printf("Nível da Bateria: %d/%d kWh\n", this.cargaAtual, this.capacidadeBateria);
    }
    
    // Getters e Setters
    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCargaAtual(int cargaAtual) {
        this.cargaAtual = cargaAtual;
    }
}