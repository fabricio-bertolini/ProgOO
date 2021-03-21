public class BMW extends Carro {
    private int velocidade;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void imprimir()
    {
        System.out.println("A cor do carro é: "+this.getCor());
        System.out.println("A quantidade de acentos do carro são de: "+this.getNum_acentos());
        System.out.println("A velocidade do carro é de: "+this.velocidade+" Km/h");
    }
}
