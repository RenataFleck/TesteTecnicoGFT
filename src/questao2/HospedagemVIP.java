package questao2;

public class HospedagemVIP extends Hospedagem{
    private double valorAdicional;
    double valorVIP = super.valor + this.valorAdicional;

    public HospedagemVIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public void printValor(){
        System.out.printf("Valor VIP: R$ %.2f %n", valorVIP);
    }
}
