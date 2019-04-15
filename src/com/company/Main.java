package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruta;
        double precoF;
        CadastroFrutas cadastro = new CadastroFrutas();
        int op = 0;


        do{
            System.out.println("1 - Cadastrar;");
            System.out.println("2 - criar porcao;");
            System.out.println("3 - mostrar frutas e seus precos;");
            System.out.print("Digite aqui: ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op){
                case 1:
                    System.out.print("Digite o nome da fruta: ");
                    fruta = scan.nextLine();
                    System.out.print("Digite o valor da fruta: ");
                    precoF = scan.nextDouble();

                    cadastro.cadastra(fruta, precoF);

                    break;
                case 3:
                    System.out.println(cadastro.imprimi());
                    break;
            }
        }while(op != 0);
    }
}
