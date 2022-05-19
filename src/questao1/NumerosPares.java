package questao1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro com 4 dígitos entre 1000 e 9999");
        String numero = scan.nextLine();
        Integer conversaoNumero = Integer.parseInt(numero);
        System.out.println(conversaoNumero);
        String[] numeroSplit = numero.split(" ");

        while((conversaoNumero < 1000) || (conversaoNumero > 9999)){
            System.out.println("O número deve estar entre 1000 e 9999, digite novamente!");
            numero = scan.nextLine();
            conversaoNumero = Integer.parseInt(numero);
        }

//        while(numeroSplit.length < 2){
//            System.out.println("O número deve conter 4 dígitos, digite novamente!");
//            numero = scan.nextLine();
//            numeroSplit = numero.split(" ");
//        }

        int quantNumPares = 0;
        ArrayList<Integer> numeros = new ArrayList<>();

        for(int i = 1; i <= numeroSplit.length - 1; i++){
            Integer num = Integer.parseInt(numeroSplit[i]);
            numeros.add(num);
            System.out.println(num);
        }

        for(int j = 1; j <= numeros.size(); j++){
            if((numeros.get(j) % 2) == 0)
                quantNumPares++;
        }

        System.out.println(quantNumPares);
    }
}
