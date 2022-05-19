package questao2;

public class Hospedagem {
    protected double valor;

    public Hospedagem(double valor) {
        this.valor = valor;
    }

    public void printValor(){
        System.out.printf("Valor: R$ %.2f %n", this.valor);
    }
}
