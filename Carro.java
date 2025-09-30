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
    public double calculoDesgastePneu(double distancia,double tipoDeTerreno, double fatordeuso, double pressao,double superficiedecontato){
        this.desgastepneu=(distancia*tipoDeTerreno*fatordeuso)/(pressao*superficiedecontato);
        if(tipoDeTerreno ==1){
            tipoDeTerreno=1;
        }
        else if(tipoDeTerreno ==2){
            tipoDeTerreno=1.5;
        }
        else if (tipoDeTerreno ==3) {
            tipoDeTerreno=2;
            
        }
        else tipoDeTerreno = 3;

        //fator de uso valores
        if(fatordeuso ==1){
            fatordeuso=1;
        }
        else if(fatordeuso==2){
            fatordeuso=1.2;
        }
        else if (fatordeuso ==3) {
            fatordeuso=1.5;
            
        }
        else fatordeuso = 2;

        //valores superficie de contato
           if(superficiedecontato ==1){
            fatordeuso=1;
        }
        else if(superficiedecontato==2){
            fatordeuso=1.2;
        }
        else fatordeuso = 1.5;

        return this.desgastepneu;
    }
    
    

    
}
