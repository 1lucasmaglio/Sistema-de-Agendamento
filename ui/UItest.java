import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UItest {
    public static void main(String[] args) throws Exception{
        JFrame janela = new JFrame();

        JLabel labelUsuario = new JLabel("Usuário & Senha");
        // Cria um objeto JLabel
        // Nada mais nada menos que um texto na tela com a string: "Usuário"
        labelUsuario.setBounds(465, 200, 100, 80);
        // Define a posição da JLabel

        JTextField digiteUsuario = new JTextField();
        // Cria um campo para inserir Texto
        digiteUsuario.setBounds(410, 260, 200, 40);
        // Define a posição do JTextField

        JPasswordField senha = new JPasswordField();
        //Cria um campo para digitar a senha
        senha.setBounds(410, 300, 200, 40);


        JButton logar = new JButton("Login");
        // Cria uma variável com o metodo JButton
        // "Coloca" um texto nesse botão 'Login'
        // Agora temos que adiciona-ló na janela(JFrame)

        logar.setBounds(360, 500, 300, 50);
        //Como definimos o layout da janela para nulo, temos que especificar a posição do botao

        logar.addActionListener(new ActionListener() {
        // Cria um Objeto do tipo ActionListener
            // Importa a classe com 'import java.awt.event.ActionListener'

            @Override
            // não sei o que é @ override foi implementado pela própria IDE
            public void actionPerformed(ActionEvent e) {
            String usuario = digiteUsuario.getText();
            // Cria uma variável do tipo string nesse escopo, e atribui a ela o valor digitado na variável 'digiteUsuario'

            String asenha = new String(senha.getPassword());


            System.out.printf("Usuário: %s\nSenha: %s", usuario, asenha);

            }
        });

        janela.add(logar);
        // Adiciona o botao ao JFrame

        janela.add(labelUsuario);
        // Adiciona a JLabel ao JFrame

        janela.add(digiteUsuario);
        // Adiciona o JTextFiel ad JFrame

        janela.add(senha);

        janela.setLayout(null);
        // Define o layout da janela para nenhum, permitindo posicionar os itens livremente.
        // Sem ocuparem a tela inteira

        janela.setBounds(300, 90, 1000, 700);
        //Chama um metodo para a variável janela, e define a posição da janela com o metodo 'setBounds'
        //Dois primeiros parâmetros '300, 900', definem onde a janela do prgrama vai estar no monitor
        //Já os '100-, 700' definem respetivamente 1000 de largura e 700 de altura (em "pixels")


        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Chama um metodo para a variável janela, para quando o utilizador clicar no botão de fechar
        //Fecha o aplicativo, utilizando a constante 'EXIT_ON_CLOSE' que tem um valor de '3'

        janela.setVisible(true);
        //Declara a janela visível para o utilizador
    }
}
