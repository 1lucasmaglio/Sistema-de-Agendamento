package pjintegrador.sisagenddesktop;

    import java.io.*;

    import com.opencsv.CSVWriter;
    //Importa a library 'opencsv' para essa instância (vide pom.xml)
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;
    import java.util.regex.Pattern;
    import java.util.regex.Matcher;
    
    
    /**
     * Ver: 1.0 alpha
     * @author Yann
     * date: 20/08/2026
     */
    public class Obj
    {

        private static final String CSV_PATH = "testCSV.csv";
        //Cria uma string para receber o caminho do arquivo
        //O arquivo vai ser criado na pasta de onde o programa é executado
        //Atenção isso é para fins de testes e não deve ficar no código final

        public static void addRegistro()
        {
            Scanner input = new Scanner(System.in);
            File arquivo = new File(CSV_PATH);
            //Cria um objeto que representa um caminho (tipo um endereço anotado em um guardanapo)
            
            Pattern padraoPorte = Pattern.compile("[pPmMgG]");
            //Define um grupo de caracteres aceitaveis para o porte dos pets
            
            Pattern padraoNome = Pattern.compile("[a-zA-Z]+\\s+[a-zA-Z]+");
            ///OBS.: Esse '+' depois do '[a-zA-Z]' significa letras de a até z em caixa alta ou baixa e mais quantas vierem depois
            ///Incluindo espaços, e depois mais letras, incluíndo quantas vierem depois por isso o '+' depois do '[a-zA-Z]'
            
            
            System.out.println("Que bom ter você aqui, digite o nome do dono, sobrenome e porte do Pet... \n");
            
            System.out.println("Vamos começar, lembre-se primeiro o nome do dono");
            String name = input.next();
            System.out.println("Perfeito, agora sobrenome!");
            String surn = input.next();
            //Cria uma série de variáveis para atribuir as entradas do cliente
            
            /////////////////////////////////////////////////////////
            
            Matcher matchName = padraoNome.matcher(name+" "+surn);
            //Cria um matcher utilizando como padrao 'padraoNome', e verficando as entradas name e surn
            //OBS: esse espaço no meio é um desing de código bem duvidoso
            
            boolean nomeDigitado = matchName.matches();
            
            
            do{
                if(nomeDigitado)
                {
                    System.out.println("O nome digtado foi: ");
                    System.out.print(name+" "+surn);
                }
                else
                {
                    System.out.println("Tente digitar seu nome denovo, algo deu errado");
                    System.out.println("Digite nome e depois sobrenome!");
                    name = input.next();
                    surn = input.next();
                    
                    matchName = padraoNome.matcher(name+" "+surn);
                    
                    nomeDigitado = matchName.matches();
                    
                }
            }
            while(nomeDigitado == false);
            System.out.println("Que bom ter um novo cliente, senhor ou senhora" + surn + "! agora o TAMANHO do bichinho!");
            
            /////////////////////////////////////////////////////////
            
            String petsize = input.next();
            //Cria uma var para guardar o que é digitado em uma string
            
            //Validador de porte de pet:
            
            Matcher matchSize = padraoPorte.matcher(petsize);
            //Cria um matcher baseando-se no padraoPorte, que compara com o que foi digitado na var petsize.
            
            Boolean porteDigitado = matchSize.find();
            //Atribui a uma variável booleana ao valor encontrado pelo matcher
            
            do
            {
                if(porteDigitado)
                //Se porteDigitado == true, ou seja tem no padraoPorte Printar:
                {
                    System.out.println("Ok, vamos para o próximo");
                }
                
                else
                //Senão..
                {
                    System.out.println("Ops, valor digitado inválido tente denovo!");
                    //Printa uma menssagem de erro dizendo ao usuário oque fazer
                    petsize = input.next();
                    //Lê um novo valor digitado, sobrescrevendo o anterior
                    
                    matchSize = padraoPorte.matcher(petsize);
                    //Recria o matcher usando o novo valor digitado
                    //O matcher não se atualiza sozinho por isso essa linha é necessária
                    
                    porteDigitado = matchSize.find();
                    //Recalcula se o novo valor é válido
                }
            }
            
            while(porteDigitado == false);
            //Repete esse bloco enquando o valor for inválido!
            
            /////////////////////////////////////////////////////////
            
            String idplaceholder = "0";
            System.out.println("Ok, gerando id. See you next time, space cowboy!");
            
            //OBS: criar uma lógica para esses ID's!!!
            
            ////////////////////////////////////////////////////////
            
            try(FileWriter fw = new FileWriter(new File(CSV_PATH), true); CSVWriter cw = new CSVWriter(fw);)
                //OBS um try wirh resources fecha o fw & cw automaticamente
            {
                    
                String[] newEntry = {name, surn, petsize, idplaceholder};
                //Cria uma variável do tipo String de Arrays para ser usado mais abaixo    
                
                List<String[]> data = new ArrayList<String[]>();
                //Cria uma var de array de Strings chamada data, para receber valores

                if(arquivo.exists())
                    //Se arquivo existe então execute...
                    //Essa cadeia de if & else evita que o cabeçalho sempre seja escrito em cada execução
                {
                    System.out.println("Há um arquivo existente!");
                }
                else
                //Senão faça...
                        {
                            System.out.println("Criando arquivo");

                            String[] cabecalhos = {"nome", "sobrenome", "portedoPET", "Id's"};
                            //Cria um array de strings para os headers 'cabecalhos'
                            data.add(cabecalhos);
                            //Adiciona o cabeçalho no data                        
                        }
            data.add(newEntry);
            //Adiciona os inputs do usuário na var data
            
            cw.writeAll(data);
            //Escreve os valores armazenados na var data!
            
            System.out.println("Escrita de arquivo finalizada");            
            }
            catch(IOException e)
            {
                System.out.print("Algo deu errado!");
            }
        }
    }