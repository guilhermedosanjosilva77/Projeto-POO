public class Drone extends VeiculoEletrico {

    // Atributos específicos do Drone
    private double altitudeMax; 
    private double tempoVoo;    

    // Construtor Completo
    public Drone(String modelo, String marca, double velocidadeAtual, double capacidadeBateria, 
                 double autonomia, double altitudeMax, double tempoVoo) {
        
        // Chama o construtor da classe pai (Veiculo)
        // Isso assume que VeiculoEletrico só precisa dos atributos de Veiculo para o 'super'
        super(modelo, marca, velocidadeAtual); 
        
        // Inicializa os atributos específicos do Drone
        this.altitudeMax = altitudeMax;
        this.tempoVoo = tempoVoo;
    }

    // Getters e Setters
    
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


   
    // Fórmula altitude
    public double calcularAltitudeMax(double peso, double potenciaMotor) {
        
        this.altitudeMax = (potenciaMotor / peso) * 5.0; 
        return this.altitudeMax;
    }

    // (Capacidade / Consumo) * 60 = minutos
    public double calcularTempoVoo(double capacidadeBateria, double consumoMedio) {
        
        this.tempoVoo = (capacidadeBateria / consumoMedio) * 60; 
        return this.tempoVoo;
    }


    
    // Autonomia é focada no tempo de voo
    public double calcularAutonomia() {
        
        System.out.println("Drone " + getModelo() + ": Autonomia (Tempo de Voo) atual: " + this.tempoVoo + " minutos.");
        return this.tempoVoo;
    }

    public void monitorarDesempenho() {
        System.out.println("\n--- Monitoramento de Desempenho do DRONE ---");
        System.out.println("Modelo: " + getModelo() + " | Marca: " + getMarca()); 
        System.out.println("----------------------------------------------");
        System.out.println("Velocidade Atual: " + getVelocidadeAtual() + " km/h");
        
        // Usamos apenas os dados locais do Drone:
        System.out.println("Altitude Máxima (Teórica): " + this.altitudeMax + " metros");
        System.out.println("Tempo de Voo Restante: " + this.tempoVoo + " minutos");
    }

    public String gerarRelatorio() {
        return "RELATÓRIO DE TELEMETRIA - DRONE" +
               "\n----------------------------------------" +
               "\nModelo: " + getModelo() + " | Marca: " + getMarca() +
               "\nAltitude Máxima: " + this.altitudeMax + " metros" +
               "\nTempo de Voo Restante: " + this.tempoVoo + " minutos" +
               "\n----------------------------------------";
    }
}