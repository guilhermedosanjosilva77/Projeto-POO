import java.util.Scanner;

public class TesteVeiculo {
    public static void main(String[] args) {
        VeiculoCombustao v1 = new VeiculoCombustao("lxs", "Honda", 0, 0, 0, 0, 0);
        Scanner scan = new Scanner(System.in);
        System.out.println("=====================================================================================");

        System.out.println("Consumo ideal esperado para a semana ");
        System.out.println("Quilometragem esperada:");
        v1.distancia=scan.nextDouble();

        System.out.println("Litragem esperada:");
        double combustivelgasto = scan.nextDouble();

        System.out.println("O consumo ideal para essa semana é de: " + v1.calcularConsumoMedio( combustivelgasto) +" km por litro");
        System.out.println("==========================================");

        System.out.println("Consumo real de combustivel durante a semana");
        System.out.println("Distância real percorrida: ");
        double distanciaRealPercorrida = scan.nextDouble();
        System.out.println("Consumo de combustivel gasto durante a semana:");
        double gastoReal = scan.nextDouble();

        if (v1.perdaDeCombustivelcalc(gastoReal, distanciaRealPercorrida) == true) {
            System.out.println("O carro está com problema.Perda de combustivel de aproximadamente:" + v1.perdaDeCombustivel +"L");
        }
        else{
            System.out.println("Consumo dentro do esperado");
        }
        System.out.println("=============== RELATÓRIO COMBUSTÃO ==============");

        System.out.println(v1.gerarRelatorio());










        }

}
