package main.java;
import main.java.br.com.figueiredoisaac.Numeros;
import main.java.br.com.figueiredoisaac.telacalculadora.gui.TelaCalculadora;

public class Program {


	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });

	}
	}

