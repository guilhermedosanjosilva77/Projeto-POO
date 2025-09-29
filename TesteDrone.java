import java.util.Scanner;

public class TesteDrone {
    public static void main(String[] args) {
        Drone meuDrone = new Drone("X200", "DroneTech", 0, 120, 30);
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual a capacidade da bateria do drone (mAh)? ");
        double capacidadeBateria = scanner.nextDouble();
        System.out.println("Qual o consumo de energia do drone (mAh/min)? ");
        double consumoEnergia = scanner.nextDouble();
        System.out.println("Qual o peso do drone (kg)? ");
        double peso = scanner.nextDouble();
        System.out.println("Qual a potência do motor do drone (W)? ");
        double potenciaMotor = scanner.nextDouble();
        
        double tempoVooCalculado = meuDrone.calcularTempoVoo(capacidadeBateria, consumoEnergia);
        double altitudeMaxCalculada = meuDrone.calcularAltitudeMax(peso, potenciaMotor);
        
        System.out.println("Tempo de voo calculado: " + tempoVooCalculado + " minutos");
        System.out.println("Altitude máxima calculada: " + altitudeMaxCalculada + " metros");

        scanner.close();
    }
}
