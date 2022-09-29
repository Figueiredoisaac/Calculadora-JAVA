package main.java;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import main.java.br.com.figueiredoisaac.Numeros;
import main.java.br.com.figueiredoisaac.telacalculadora.gui.TelaCalculadora;

public class Program {


	public static void main(String[] args) {
		
		    try {
		            // Set System L&F
		        UIManager.setLookAndFeel(
		            UIManager.getSystemLookAndFeelClassName());
		    } 
		    catch (UnsupportedLookAndFeelException e) {
		       // handle exception
		    }
		    catch (ClassNotFoundException e) {
		       // handle exception
		    }
		    catch (InstantiationException e) {
		       // handle exception
		    }
		    catch (IllegalAccessException e) {
		       // handle exception
		    }

		    
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });

	}
	}

