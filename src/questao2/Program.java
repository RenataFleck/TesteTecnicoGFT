package questao2;

public class Program {
    public static void main(String[] args) {
        Hospedagem hospedagem = new Hospedagem(5000);
        HospedagemVIP hospedagemVIP = new HospedagemVIP(5000, 100);

        hospedagem.printValor();
        hospedagemVIP.printValor();
    }
}
