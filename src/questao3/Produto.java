package questao3;

public class Produto {
    private String nome;
    private double valor;
    private int quantidade;

    public Produto(String nome, double valor, int quantidade) {
    }


    public void calcularValorFinal(){
        double valorTotal = (this.valor * this.quantidade) * 1.1;
        System.out.println("Valor final: " + valorTotal);
    }
}
