public class Carro extends VeiculoCombustao {
    double desgastepneu;
    double niveloleo;
    double capacidadecarter;

    public Carro(String modelo, String marca, double velocidadeAtual, double consumoMedio, double nivelCombustivel,
            double perdaDeCombustivel, double desgastepneu, double niveloleo, double capacidadecarter) {
        super(modelo, marca, velocidadeAtual, consumoMedio, nivelCombustivel, perdaDeCombustivel, capacidadecarter);
        this.desgastepneu = desgastepneu;
        this.niveloleo = niveloleo;
        this.capacidadecarter = capacidadecarter;
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
    public double calculoDesgastePneu(double tipoDeTerreno, double fatordeuso, double pressao,double superficiedecontato){
        
         if (tipoDeTerreno == 1) {
        tipoDeTerreno = 1;
    } else if (tipoDeTerreno == 2) {
        tipoDeTerreno = 1.5;
    } else if (tipoDeTerreno == 3) {
        tipoDeTerreno = 2;
    } else {
        tipoDeTerreno = 3;
    }

    // Conversão do fator de uso
    if (fatordeuso == 1) {
        fatordeuso = 1;
    } else if (fatordeuso == 2) {
        fatordeuso = 1.2;
    } else if (fatordeuso == 3) {
        fatordeuso = 1.5;
    } else {
        fatordeuso = 2;
    }

    //Conversão da superfície de contato (alinhamento) 
    if (superficiedecontato == 1) {
        superficiedecontato = 1;
    } else if (superficiedecontato == 2) {
        superficiedecontato = 1.2;
    } else {
        superficiedecontato = 1.5;
    }

    this.desgastepneu = (this.distancia * tipoDeTerreno * fatordeuso) / (pressao * superficiedecontato);

    return this.desgastepneu;
    }
    public double calculoDesgastePneu(int tempo){
        if (tempo > 12 || this.distancia >10000) {
            System.out.println("TROCA DE OLÉO NECESSÁRIA");
            
        }
        else
        niveloleo=10000/(int)this.distancia;

        return niveloleo;



    }
    
    

    
}
