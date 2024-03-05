package prj;

import java.io.IOException;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws IOException {
        System.out.println("Olá mundo");
        char ch;
        ch = 'X';
        System.out.println("ch contains: " + ch);
        ch++;
        System.out.println("ch is now: " + ch);
        ch = 90;
        System.out.println("ch is now: " + ch);

        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 1;
        long tipoLong = 912399129312913231L;
        boolean tipoBoolean = true;

        System.out.println("Valor do tipo Byte: " + tipoByte);
        System.out.println("Valor do tipo short: " + tipoShort);
        System.out.println("Valor do tipo Char: " + tipoChar);
        System.out.println("Valor do tipo Float: " + tipoFloat);
        System.out.println("Valor do tipo Double: " + tipoDouble);
        System.out.println("Valor do tipo Int: " + tipoInt);
        System.out.println("Valor do tipo Long: " + tipoLong);
        System.out.println("Valor do tipo Boolean: " + tipoBoolean);

        System.out.println("\nFirst Line\nSecond Line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF\n");

        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        if(b) System.out.println("This is executed.");
        b = false;
        if(b) System.out.println("This is not executed.");

        System.out.println("O resultado de 10 > 9 é: " + (10 > 9));


        int count = 10;
        char chr = 'X';
        float f = 1.25F;


        double radius = 4, heigth = 5;

        double volume = 3.1416 * radius * radius * heigth;
        System.out.println("\nVolume agora é: " + volume);

        System.out.println("\nExemplo Do While");

        int opcao = -1;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("************ Sistema de Cadastro ************");
            System.out.println("Opção 1: Cadastrar cliente");
            System.out.println("Opção 2: Cadastrar produto");
            System.out.println("Opção 3: Cadastrar vendedor");
            System.out.println("Opção 0: Sair");
            System.out.println("************************************");
            System.out.print("Digite a opção: ");
            opcao = in.nextInt();
            System.out.println("************************************");
            switch (opcao){
                case 1:
                    System.out.println("Opção 1 escolhida.");
                    //cadastrarCliente();
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida.");
                    //cadastrarProduto();
                    break;
                case 3:
                    System.out.println("Opção 3 escolhida");
                    //cadastrarVendedor();
                    break;
                case 0:
                    System.out.println("Opção 0 escolhida");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while (opcao != 0);
    }
}