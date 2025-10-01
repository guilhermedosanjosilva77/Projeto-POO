    import java.util.Scanner;

    public class TesteCarro {

        public static void main(String[] args) {
            Carro carro = new Carro(null, null, 0, 0, 0, 0, 0, 0, 0);
            Scanner scan = new Scanner(System.in);

            System.out.println("---------DESGASTE DE PNEU PREVISTO NA SEMANA --------------- "+"\n");
            boolean teste = true;
            System.out.println("Distancia prevista:");
            carro.distancia=scan.nextDouble();
        
            System.out.println("Qual tipo de terreno serão feitos as viagens?");
            System.out.println("1-Asfaltado"+"\n"+"2-Terra ou concreto"+"\n"+"3-Acidentado"+"\n"+"4-Muito irregular");
            double tipoDeTerreno = scan.nextDouble();
                while (tipoDeTerreno >4 || tipoDeTerreno<1) {
                System.out.println("Inserir uma das opcões válidas:");
                System.out.println("1-Asfaltado"+"\n"+"2-Terra ou concreto"+"\n"+"3-Acidentado"+"\n"+"4-Muito irregular");
                tipoDeTerreno = scan.nextDouble();


                
            }
            
            System.out.println("Qual o tipo de condução do motorista baseado em seu histórico: ");
            System.out.println("1-Suave"+"\n"+"2-Moderado"+"\n"+"3-Agressivo"+"\n"+"4-Muito agressivo");
            double fatordeuso= scan.nextDouble();
            while (fatordeuso >5 || fatordeuso<1) {
                System.out.println("Inserir uma das opcões válidas:");
                System.out.println("1-Suave"+"\n"+"2-Moderado"+"\n"+"3-Agressivo"+"\n"+"4-Muito agressivo");
                fatordeuso =scan.nextDouble();


                
            }


            System.out.println("Pressão atual dos pneus em PSI: ");
            double pressao = scan.nextDouble();

            System.out.println("Alinhamento atual do vêiculo: ");
            System.out.println("1-Alinhamento ideal"+"\n"+"2-Desalinhamento moderado"+"\n"+"3-Desalinhamento severo"+"\n");
            double superficiedecontato = scan.nextDouble();
            while (superficiedecontato > 3 || superficiedecontato<1) {
                System.out.println("Inserir uma das opcões válidas:");
                System.out.println("1-Alinhamento ideal"+"\n"+"2-Desalinhamento moderado"+"\n"+"3-Desalinhamento severo"+"\n");
                superficiedecontato = scan.nextDouble();
                
            }

            System.out.println("---------------RESULTADO-------------------");
            System.out.println("O desgaste para os pneus nessa semana será de aproxidamente: "+carro.calculoDesgastePneu(tipoDeTerreno, fatordeuso, pressao, superficiedecontato)+"%");

            System.out.println("----------------------------------NIVEL DE OLÉO -----------------------------");
            System.out.println("Quantos meses o óleo foi trocado a ultima vez?");
            int tempo = scan.nextInt();

            System.out.println("------------------------------RESULTADO-------------------------");
            System.out.println("A troca de óleo de seu carro precisa ser feito dentro de "+ carro.calculoDesgastePneu(tempo)+" semanas");



            

        }
        
    }
