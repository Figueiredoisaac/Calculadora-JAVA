package main.java.br.com.figueiredoisaac.telacalculadora.gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextPane;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import main.java.br.com.figueiredoisaac.Numeros;
import java.awt.BorderLayout;
import java.awt.Cursor;

public class TelaCalculadora extends JFrame {

	public TelaCalculadora() {
		getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
			JTextPane visorCalculadora = new JTextPane();
			visorCalculadora.setBounds(5, 6, 200, 20);
			visorCalculadora.setEditable(false);
			visorCalculadora.setPreferredSize(new Dimension(200, 20));

			JButton btnNewButton = new JButton("7");
			btnNewButton.setBounds(5, 32, 39, 23);
			btnNewButton.setMnemonic(KeyEvent.VK_NUMPAD7);
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "7");
				}
			});
			btnNewButton.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "7");
				}
			});
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});

			JButton btnNewButton_1 = new JButton("8");
			btnNewButton_1.setBounds(49, 32, 39, 23);
			btnNewButton_1.setMnemonic(KeyEvent.VK_NUMPAD8);
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "8");
				}
			});
			btnNewButton_1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "8");
				}
			});

			JButton btnNewButton_2 = new JButton("9");
			btnNewButton_2.setBounds(93, 32, 39, 23);
			btnNewButton_2.setMnemonic(KeyEvent.VK_NUMPAD9);
			btnNewButton_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "9");
				}
			});
			btnNewButton_2.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "9");
				}
			});
			JButton btnNewButton_3 = new JButton("*");
			btnNewButton_3.setBounds(137, 32, 39, 23);
			btnNewButton_3.setMnemonic(KeyEvent.VK_MULTIPLY);
			btnNewButton_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "*");
				}

			});
			btnNewButton_3.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "*");
				}
			});

			JButton btnNewButton_4 = new JButton("/");
			btnNewButton_4.setBounds(181, 32, 37, 23);
			btnNewButton_4.setMnemonic(KeyEvent.VK_DIVIDE);
			btnNewButton_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "/");
				}
			});
			btnNewButton_4.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "/");
				}
			});

			JButton btnNewButton_5 = new JButton("4");
			btnNewButton_5.setBounds(5, 61, 39, 23);
			btnNewButton_5.setMnemonic(KeyEvent.VK_NUMPAD4);
			btnNewButton_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "4");
				}
			});
			btnNewButton_5.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "4");
				}
			});

			JButton btnNewButton_6 = new JButton("5");
			btnNewButton_6.setBounds(49, 61, 39, 23);
			btnNewButton_6.setMnemonic(KeyEvent.VK_NUMPAD5);
			btnNewButton_6.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "5");
				}
			});
			btnNewButton_6.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "5");
				}
			});

			JButton btnNewButton_7 = new JButton("6");
			btnNewButton_7.setBounds(93, 61, 39, 23);
			btnNewButton_7.setMnemonic(KeyEvent.VK_NUMPAD6);
			btnNewButton_7.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "6");
				}
			});
			btnNewButton_7.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "6");
				}
			});

			JButton btnNewButton_8 = new JButton("+");
			btnNewButton_8.setBounds(137, 61, 41, 23);
			btnNewButton_8.setMnemonic(KeyEvent.VK_ADD);
			btnNewButton_8.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "+");
				}
			});
			btnNewButton_8.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "+");
				}
			});

			JButton btnNewButton_9 = new JButton("-");
			btnNewButton_9.setBounds(183, 61, 37, 23);
			btnNewButton_9.setMnemonic(KeyEvent.VK_SUBTRACT);
			btnNewButton_9.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "-");
				}
			});
			btnNewButton_9.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "-");
				}
			});

			JButton btnNewButton_10 = new JButton("1");
			btnNewButton_10.setBounds(5, 90, 39, 23);
			btnNewButton_10.setMnemonic(KeyEvent.VK_NUMPAD1);
			btnNewButton_10.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "1");
				}
			});
			btnNewButton_10.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "1");
				}
			});

			JButton btnNewButton_11 = new JButton("2");
			btnNewButton_11.setBounds(49, 90, 39, 23);
			btnNewButton_11.setMnemonic(KeyEvent.VK_NUMPAD2);
			btnNewButton_11.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "2");
				}
			});
			btnNewButton_11.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "2");
				}
			});

			JButton btnNewButton_12 = new JButton("3");
			btnNewButton_12.setBounds(93, 90, 39, 23);
			btnNewButton_12.setMnemonic(KeyEvent.VK_NUMPAD3);
			btnNewButton_12.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "3");
				}
			});
			btnNewButton_12.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "3");
				}
			});

			JButton btnNewButton_13 = new JButton("=");
			btnNewButton_13.setBounds(137, 90, 41, 23);
			btnNewButton_13.setMnemonic(KeyEvent.VK_ENTER);
			btnNewButton_13.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String valor = visorCalculadora.getText();
			        System.out.println(">>>"+valor);
			        Numeros calculos = new Numeros();
			        String resultado = calculos.calculadora(valor);

			        visorCalculadora.setText(resultado);
				}
			});
			btnNewButton_13.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					String valor = visorCalculadora.getText();
			        System.out.println(">>>"+valor);
			        Numeros calculos = new Numeros();
			        String resultado = calculos.calculadora(valor);

			        visorCalculadora.setText(resultado);
				}
			});

			JButton btnNewButton_14 = new JButton("C");
			btnNewButton_14.setBounds(183, 90, 39, 23);
			btnNewButton_14.setMnemonic(KeyEvent.VK_BACK_SPACE);
			btnNewButton_14.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					visorCalculadora.setText("");
				}
			});
			btnNewButton_14.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					visorCalculadora.setText("");
				}
			});

			JButton btnNewButton_15 = new JButton("0");
			btnNewButton_15.setBounds(5, 119, 39, 23);
			btnNewButton_15.setMnemonic(KeyEvent.VK_NUMPAD0);
			btnNewButton_15.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "0");
				}
			});
			btnNewButton_15.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					String valor = visorCalculadora.getText();
					visorCalculadora.setText(valor + "0");
				}
			});
			getContentPane().setLayout(null);
			getContentPane().add(visorCalculadora);
			getContentPane().add(btnNewButton);
			getContentPane().add(btnNewButton_1);
			getContentPane().add(btnNewButton_2);
			getContentPane().add(btnNewButton_3);
			getContentPane().add(btnNewButton_4);
			getContentPane().add(btnNewButton_5);
			getContentPane().add(btnNewButton_6);
			getContentPane().add(btnNewButton_7);
			getContentPane().add(btnNewButton_8);
			getContentPane().add(btnNewButton_9);
			getContentPane().add(btnNewButton_10);
			getContentPane().add(btnNewButton_11);
			getContentPane().add(btnNewButton_12);
			getContentPane().add(btnNewButton_13);
			getContentPane().add(btnNewButton_14);
			getContentPane().add(btnNewButton_15);

		}
}