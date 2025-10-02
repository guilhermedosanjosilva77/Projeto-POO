import java.util.Scanner;

public class TesteDroneFinal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- INICIALIZAÇÃO DO DRONE ---");
        
        //Coleta dos dados 
        
        System.out.print("1. Modelo do Drone: ");
        String modelo = scanner.nextLine(); 
        
        
        String marca = "Desconhecida"; 

        System.out.print("2. Capacidade da Bateria (mAh): ");
        double capacidadeBateria = scanner.nextDouble();

        System.out.print("3. Autonomia Estimada semanal (km): ");
        double autonomia = scanner.nextDouble();
        
        System.out.print("4. Altitude Máxima (m): ");
        double altitudeMax = scanner.nextDouble();
        
        System.out.print("5. Tempo de Voo (min): ");
        double tempoVoo = scanner.nextDouble();

        //  Cria o objeto drone
        
        Drone drone = new Drone(modelo, marca, 0.0, capacidadeBateria, 
                                autonomia, altitudeMax, tempoVoo);
        
        // 3. Exibição dos Resultados

        System.out.println("\n--- DRONE CRIADO COM SUCESSO! DADOS DE TELEMETRIA ---");
        
        // Monitora o desempenho 
        drone.monitorarDesempenho(); 

        System.out.println("\n--- RELATÓRIO COMPLETO ---");
        
        // Exibe Autonomia e Relatório Final
        drone.calcularAutonomia(); 
        System.out.println(drone.gerarRelatorio());

        scanner.close();
    }
}