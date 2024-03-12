import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println("-------------------------- PAR/IMPAR --------------------------\n");
        parImpar();
        System.out.println("\n-------------------------- SOMA --------------------------\n");
        soma();
        System.out.println("\n-------------------------- MÉDIA --------------------------\n");
        mediaAritimetica();

    }

    private static void parImpar() {
        int contPar = 0;
        int contImpar = 0;
        int numero = -1;
        Scanner in = new Scanner(System.in);

        while (numero != 0) {
            System.out.println("Digite os números que deseja verificar se são pares ou impares: ");
            numero = in.nextInt();

            if(numero != 0) {
                if (numero % 2 == 0) {
                    contPar++;
                } else {
                    contImpar++;
                }
            }
        }
        System.out.println("A quantidade de numeros pares é: " + contPar);
        System.out.println("A quantidade de numeros impares é: " + contImpar);
    }

    private static void soma() {
        int numero = 0;
        int soma = 0;
        int cont = 0;
        Scanner in = new Scanner(System.in);

        if (numero != -1) {
            while (numero != -1) {
                System.out.println("Digite o " + (cont+1) + "° que deseja somar, caso queira finalizar a conta, digite -1: ");
                numero = in.nextInt();
                cont++;
                soma = soma + numero;
            }
        }
        System.out.println("A quantidade de numeros digitados foi: " + (cont - 1));
        System.out.println("A soma dos numeros deu: " + soma);
    }

    private static void mediaAritimetica() {
        double notas = 0.0;
        double media;
        double soma = 0.0;

        Scanner scn = new Scanner(System.in);

        for (int i=0; i<3; i++){
            System.out.println("Digite a "+(i+1)+ "° nota:");
            notas = scn.nextInt();
            soma += notas;
        }
        media = soma/3;
        System.out.println("A soma das notas foi: " + soma);
        System.out.println("A média das notas foi: " + media);
    }
}
