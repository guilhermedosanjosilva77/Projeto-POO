public class Carro extends VeiculoCombustao {
    double desgastepneu;
    double niveloleo;
    double capacidadecarter;
    String modoconduccao;

    public Carro(String modelo, String marca, double velocidadeAtual, double consumoMedio, double nivelCombustivel,
            double perdaDeCombustivel, double desgastepneu, double niveloleo, double capacidadecarter,
            String modoconduccao) {
        super(modelo, marca, velocidadeAtual, consumoMedio, nivelCombustivel, perdaDeCombustivel);
        this.desgastepneu = desgastepneu;
        this.niveloleo = niveloleo;
        this.capacidadecarter = capacidadecarter;
        this.modoconduccao = modoconduccao;
    }

    public double getDesgastepneu() {
        return desgastepneu;
    }

    public void setDesgastepneu(double desgastepneu) {
        this.desgastepneu = desgastepneu;
    }

    public double getNiveloleo() {
        return niveloleo;
    }

    public void setNiveloleo(double niveloleo) {
        this.niveloleo = niveloleo;
    }

    public double getCapacidadecarter() {
        return capacidadecarter;
    }

    public void setCapacidadecarter(double capacidadecarter) {
        this.capacidadecarter = capacidadecarter;
    }

    public String getModoconduccao() {
        return modoconduccao;
    }

    public void setModoconduccao(String modoconduccao) {
        this.modoconduccao = modoconduccao;
    }
    public double calculoDesgastePneu(){
        return 2.0;
    }

    

    
}
