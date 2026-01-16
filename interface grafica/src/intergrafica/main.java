package intergrafica;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class main {

	public static void main(String[] args) {
		JFrame tela = new JFrame("Tela de Edmilson"); 
		JLabel texto = new JLabel("Sextou com S de sabotagem");
		JLabel img = new JLabel();
		JTextField valor = new JTextField(30);
		JButton botao = new JButton("Enviar");
		botao.setBounds(30,280,150,30);
		tela.getContentPane().add(botao);
		valor.setBounds(30,230,150,30);
		tela.getContentPane().add(valor);
		ImageIcon icon = new ImageIcon("src/imagens/robo_pix1.jpeg");
		Image foto = icon.getImage().getScaledInstance(150, 150,Image.SCALE_SMOOTH);
		img.setIcon(new ImageIcon(foto));
		img.setBounds(30,60,150,150);
		texto.setBounds(30,20,210,20);
		tela.getContentPane().add(img);
		tela.getContentPane().add(texto);
        tela.setLayout(null);
        tela.getContentPane().setBackground(Color.decode("#edda8c"));
        //Ação ao botão
        botao.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String textoDigitado = valor.getText();
        		JOptionPane.showMessageDialog(null,"Seu valor é de "+textoDigitado+" .Espere sentado.","Informação",1);
        	}
        });
        tela.setSize(600,600);
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //JOptionPane.showMessageDialog(null,"Professor legal","denis",JOptionPane.ERROR_MESSAGE);
        //String horario = JOptionPane.showInputDialog(null,"Que horas são", "Horário",1);
        //JOptionPane.showMessageDialog(null, "São " +horario,"Horas",1);
        //JOptionPane.showConfirmDialog(null, "Deseja Salvar?");
        //object[] opcoes = {"salvar", "não salvar", "cancelar"};
        //JOptionPane.showOptionDialog{null, "O que deseja fazer?", "opcoes",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoes[0]);
	}

}
