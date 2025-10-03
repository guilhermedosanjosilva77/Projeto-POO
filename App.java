import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Loop principal para o menu
        boolean continuar = true;
        while (continuar) {
            System.out.println("==========================PAGINA DE GERENCIAMENTO DE VEICULOS==========================");
            System.out.println("========================== QUAL DOS VEICULOS VOCE DESEJA FAZER O GERENCIAMENTO =================");
            System.out.println("1-Veiculo Combustão" + "\n" + "2-Veiculo Elétrico (Drone)" + "\n" + "0-Sair");
            
            int ref = scan.nextInt();
            

            switch (ref) {
                case 1:
                    // Gerenciamento d o veículo de combustão
                    System.out.println("================== GERENCIAMENTO VEICULO COMBUSTÃO ==================");
                    System.out.println("=====================================================================================");

                    // Coleta de dados e cálculos para o carro
                    Carro carro = new Carro("Volks", "Kombi", 0, 0, 0, 0, 0, 0, 0);

                    System.out.println("Consumo ideal esperado para a semana ");
                    System.out.println("Quilometragem esperada:");
                    carro.distancia = scan.nextDouble();

                    System.out.println("Litragem esperada:");
                    double combustivelgasto = scan.nextDouble();

                    System.out.println("O consumo ideal para essa semana é de: "
                            + carro.calcularConsumoMedio(combustivelgasto) + " km por litro");
                    System.out.println("==========================================");

                    System.out.println("Consumo real de combustivel durante a semana");
                    System.out.println("Distância real percorrida: ");
                    double distanciaRealPercorrida = scan.nextDouble();
                    System.out.println("Consumo de combustivel gasto durante a semana:");
                    double gastoReal = scan.nextDouble();

                    if (carro.perdaDeCombustivelcalc(gastoReal, distanciaRealPercorrida) == true) {
                        System.out.println("O carro está com problema.Perda de combustivel de aproximadamente:"
                                + carro.perdaDeCombustivel + "L");
                    } else {
                        System.out.println("Consumo dentro do esperado");
                    }
                    System.out.println("---------DESGASTE DE PNEU PREVISTO NA SEMANA --------------- " + "\n");
                    System.out.println("Qual tipo de terreno serão feitos as viagens?");
                    System.out.println("1-Asfaltado" + "\n" + "2-Terra ou concreto" + "\n" + "3-Acidentado" + "\n"
                            + "4-Muito irregular");
                    double tipoDeTerreno = scan.nextDouble();

                    while (tipoDeTerreno > 4 || tipoDeTerreno < 1) {
                        System.out.println("Inserir uma das opções válidas:");
                        System.out.println("1-Asfaltado" + "\n" + "2-Terra ou concreto" + "\n" + "3-Acidentado" + "\n"
                                + "4-Muito irregular");
                        tipoDeTerreno = scan.nextDouble();
                    }

                    System.out.println("Qual o tipo de condução do motorista baseado em seu histórico: ");
                    System.out.println("1-Suave" + "\n" + "2-Moderado" + "\n" + "3-Agressivo" + "\n" + "4-Muito agressivo");
                    double fatordeuso = scan.nextDouble();

                    while (fatordeuso > 5 || fatordeuso < 1) {
                        System.out.println("Inserir uma das opções válidas:");
                        System.out.println("1-Suave" + "\n" + "2-Moderado" + "\n" + "3-Agressivo" + "\n" + "4-Muito agressivo");
                        fatordeuso = scan.nextDouble();
                    }

                    System.out.println("Pressão atual dos pneus em PSI: ");
                    double pressao = scan.nextDouble();

                    System.out.println("Alinhamento atual do veículo: ");
                    System.out.println("1-Alinhamento ideal" + "\n" + "2-Desalinhamento moderado" + "\n"
                            + "3-Desalinhamento severo" + "\n");
                    double superficiedecontato = scan.nextDouble();

                    while (superficiedecontato > 3 || superficiedecontato < 1) {
                        System.out.println("Inserir uma das opções válidas:");
                        System.out.println("1-Alinhamento ideal" + "\n" + "2-Desalinhamento moderado" + "\n"
                                + "3-Desalinhamento severo" + "\n");
                        superficiedecontato = scan.nextDouble();
                    }

                    System.out.println("---------------RESULTADO-------------------");
                    System.out.println("O desgaste para os pneus nessa semana será de aproximadamente: "
                            + carro.calculoDesgastePneu(tipoDeTerreno, fatordeuso, pressao, superficiedecontato) + "%");

                    System.out.println("----------------------------------NIVEL DE OLÉO -----------------------------");
                    System.out.println("Quantos meses o óleo foi trocado a última vez?");
                    int tempo = scan.nextInt();

                    System.out.println("------------------------------RESULTADO-------------------------");
                    System.out.println("A troca de óleo de seu carro baseando-se na sua distância semanal indica que sua troca de óleo precisa ser feito dentro de: "
                            + carro.calculoDesgastePneu(tempo) + " semanas");

                    System.out.println(carro.gerarRelatorio());
                    break;

                case 2:
                    // Gerenciamento do drone (veículo elétrico)
                    System.out.println("--- INICIALIZAÇÃO DO DRONE ---");

                    // Coleta dos dados 
                    System.out.print("Qual o modelo do Drone: ");
                    String modelo = scan.nextLine();

                    System.out.println("Qual a Marca do Drone: ");
                    String marca = scan.nextLine();

                    System.out.print("3. Capacidade da Bateria (mAh): ");
                    double capacidadeBateria = scan.nextDouble();

                    System.out.print("4. Autonomia Estimada semanal (km): ");
                    double autonomia = scan.nextDouble();

                    System.out.print("5. Altitude Máxima (m): ");
                    double altitudeMax = scan.nextDouble();

                    System.out.print("6. Consumo Médio (mA): ");
                    double consumoMedio = scan.nextDouble();  // Consumo médio para o cálculo do tempo de voo

                    // Cria o objeto drone
                    Drone drone = new Drone(modelo, marca, 0.0, capacidadeBateria,
                            autonomia, altitudeMax, consumoMedio);

                    // Exibição dos Resultados
                    System.out.println("\n--- DRONE CRIADO COM SUCESSO! DADOS DE TELEMETRIA ---");

                    // Monitora o desempenho 
                    drone.monitorarDesempenho();

                    System.out.println("\n--- RELATÓRIO COMPLETO ---");

                    // Exibe Autonomia e Relatório Final
                    drone.calcularAutonomia();
                    System.out.println(drone.gerarRelatorio());
                    break;

                case 0:
                    // Sair do programa
                    continuar = false;
                    System.out.println("Saindo... Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, insira 1, 2 ou 0.");
                    break;
            }
        }

        scan.close();
    }
}
