package pjintegrador.sisagenddesktop;
//Esse package permite que classes se "enxerguem" sem a necessidade de import

import java.io.*;

import com.opencsv.CSVWriter;
//Importa a library 'opencsv' para essa instância
import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ver: 1.0 alpha
 * @author Yann
 * date: 16/08/2026
 */
public class StudioDeBelezaAnimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int escolha = -1;
        //Cria uma variável para guardar uma escolha
        {

                do {

                    try {
                        System.out.println("1 - Novo Registro");
                        System.out.println("2 - Checar Registros");
                        System.out.println("3 - Atualizar Registros");
                        System.out.println("4 - Remover Registro");
                        System.out.println("0 - Sair");

                        System.out.println("Escolha...");
                        escolha = input.nextInt();

                    }

                    catch (InputMismatchException e)
                    //Pega 'InputMismatchException' cria uma variável 'e' para guardar os detalhes do erro e exibe a menssagem
                    {
                        escolha = -1;
                        //Resetao valor da escolha para o padrão (ACHO QUE ISSO NÃO É NENHUM POUCO EFICIÊNTE)
                        System.out.println("Ops, entrada inválida tente de novo :)");
                        input.nextLine();
                        //Evita que o buffer do input fique com entradas inválidas
                    }

                    switch (escolha)
                    {
                        case 1:
                            Obj.addRegistro();
                            break;

                        case 2:
                            break;

                        case 3:
                            break;

                        case 4:
                            break;

                        case 0:
                            System.out.println("Encerrando");
                            break;

                        default:
                            System.out.println("Ops, entrada inválida");
                            break;
                    }
                }
                while (escolha != 0);

                //Realmente quer sair?(futura implementação
                // switch (){
                // case == y{}
                // case == n{}
                // default: 0

                }

        }
    }
