import java.util.Scanner;

public class TesteVeiculo {
    public static void main(String[] args) {
        VeiculoCombustao v1 = new VeiculoCombustao("lxs", "Honda", 0, 0, 0, 0);
        Scanner scan = new Scanner(System.in);
        System.out.println("qual o consumo médio do carro?");
        System.out.println("Qual a distancia total percorrida?");
        int distanciatotal= scan.nextInt();
        System.out.println("Qual a quantidade de combustiel gasto aproxidamente");
        int combustivelGasto=scan.nextInt();

        System.out.println("De acordo com os valores fornecidos seu(a)"+ v1.marca + " de modelo:" + v1.modelo + " tem um consumo médio de:"+ v1.calcconsumoMedio(distanciatotal, combustivelGasto) );

        System.out.println("=====================================================================================");

        System.out.println("Agora vamos calcular quantos km faz por litro");
        System.out.println("Quantos km percorrido");
        double distancia=scan.nextDouble();

        System.out.println("Quantos litros aproximadamente");
        double combustivelgasto = scan.nextDouble();

        System.out.println("Seu carro faz aproximadamente" + v1.calcularKML(distancia, combustivelgasto) +" por litro");








        }
    
}
