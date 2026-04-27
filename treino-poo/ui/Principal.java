package ui;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.time.LocalDateTime;


import model.Pessoa;
import model.PessoaJuridica;

public class Principal {

    public static void main(string[] args) {



        Scanner sc = new Scanner(System.in);

        char opcao;

        do {

            opcao = sc.next().charAt(0);
            System.out.println("Você digitou: " + opcao);

            switch (opcao) {

                case '1':

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("enail: ");
                String email = sc.nextLine();

                System.out.print("data: ");
                String data = sc.nextLine();

                System.out.print("cnpj: ");
                Integer cnpj = sc.nextInt();

                PessoaJuridica p = new PessoaJuridica(nome, email, data, cnpj);

                

            }



        } while (opcao != 's');
    }


}
