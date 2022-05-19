package questao4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int valorSucoDeLimao = 3;
        int valorSucoTamarindo = 5;

        float valorSemDesconto = 0;
        float valorComDesconto = 0;
        float qtdDesconto = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite qual tipo de suco (L = Limão e T = Tamarindo): ");
        char tipoSuco = scan.next().charAt(0);

        System.out.println("Digite a quantidade de litros: ");
        int qtdSuco = scan.nextInt();

        if(tipoSuco == 'L') {
            valorSemDesconto = qtdSuco * valorSucoDeLimao;
            if(qtdSuco <= 2) {
                qtdDesconto = qtdSuco * 3;
                valorComDesconto = valorSemDesconto - ((qtdDesconto/100) * valorSemDesconto);
            }
            else if(qtdSuco > 5) {
                qtdDesconto = qtdSuco * 5;
                valorComDesconto = valorSemDesconto - ((qtdDesconto/100) * valorSemDesconto);
            }
        }
        else if(tipoSuco == 'T'){
            valorSemDesconto = qtdSuco * valorSucoTamarindo;
            if(qtdSuco <= 2) {
                qtdDesconto = qtdSuco * 4;
                valorComDesconto = valorSemDesconto - ((qtdDesconto/100) * valorSemDesconto);
            }
            else if(qtdSuco > 5) {
                qtdDesconto = qtdSuco * 6;
                valorComDesconto = valorSemDesconto - ((qtdDesconto/100) * valorSemDesconto);

            }
        }

        if(qtdDesconto != 0) {
            System.out.println("VALOR TOTAL COM DESCONTO: " + valorComDesconto);
        }
        else {
            System.out.println("VALOR TOTAL SEM DESCONTO: " + valorSemDesconto);
        }


    }
}
