import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        //paresMultiplosDe3();
        //somaMedia();
        calcularArea();
    }

    private static void calcularArea() {
        double larg;
        double comprimento;
        double area;

        int cont = 0;
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < 4; i++){
            System.out.println("Digite a largura do "+(cont+1)+"° comodo: ");
            larg = scn.nextDouble();

            System.out.println("Digite o comprimento do "+(cont+1)+"° comodo");
            comprimento = scn.nextDouble();

            area = larg * comprimento;
            System.out.println("-------------------------------------");
            System.out.println("A largura do comodo "+(cont+1)+" é: "+larg+"m2");
            System.out.println("O comprimento do comodo "+(cont+1)+" é: "+comprimento+"m2");
            System.out.println("A area do comodo "+(cont+1)+" é: "+ area+"m2");
            System.out.println("--------------------------------------");
            cont++;
        }
    }

    private static void somaMedia() {
        int num = 0;
        double media;
        double soma = 0;
        int cont = 0;

        Scanner in = new Scanner(System.in);
        while (cont < 10){
            System.out.println("Digite o "+(cont+1)+"° numero a ser somado: ");
            num = in.nextInt();

            soma = soma + num;
            cont++;
        }
        System.out.println("---------------------------------------");
        System.out.println("A soma dos 10 números deu: "+soma);
        media = soma / 10;
        System.out.println("A média dos 10 números digitados foi: " + media);
    }

    private static void paresMultiplosDe3() {
        int cont = 0;

        for (int i = 2; i <= 1000; i+=2){ //Indo em passo 2 não precisamos verificar se são pares
                if (i % 3 == 0){
                    System.out.println("numero par e multiplo de 3: "+i);
                    cont++;
                }
        }
        System.out.println("A quantidade de numeros pares e multiplos de 3 até 1000 é: "+cont);
    }
}