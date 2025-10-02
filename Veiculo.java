

public class Veiculo {
    String modelo;
    String marca;
    double velocidadeAtual;
    


    public Veiculo(String modelo, String marca, double velocidadeAtual) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeAtual = velocidadeAtual;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public String gerarRelatorio(){
        return "Veiculo:"+this.modelo+ "\n" +
        "Marca:"+this.marca;
    }
    


}