package socketsudp;

import java.awt.Container;
import java.lang.ModuleLayer.Controller;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Vista {
	
	Container contenedor;
	
	JLabel label1;
	JLabel label2;
	JLabel label3;
	
	JFrame ventana;
	
	JPanel panel1;
	JPanel panel2;
	
	JTextField field1;
	JTextField field2;
	JTextField field3;
	
	JButton envio;
	
	
	public Vista() {
		crear();
	}
	public void crear()
	{
		ventana = new JFrame("Chat UDP");
		contenedor = this.ventana.getContentPane();
		
		panel1 = new JPanel();
		panel2= new JPanel();
		

		label1 = new JLabel("IP Destino: ");
		label2 = new JLabel("Envio ");
		label3 = new JLabel("Recibo ");
		
		field1 = new JTextField("0", 10);
		field2 = new JTextField(10);
		field3 = new JTextField(10);
		
		envio= new JButton("Envio");
		
		ventana.setSize(500,400);
		
		panel1.add(label1);
		panel1.add(field1);
		panel1.add(envio);
		
		panel2.add(label2);
		panel2.add(field2);
		panel2.add(label3);
		panel2.add(field3);
		
		field3.setEditable(false);
		
		contenedor.add(panel1, "North");
		contenedor.add(panel2);
		
		ventana.setVisible(true);
		
	}
	
	public void conectaControlador( Controlador c )
	{
		
		
		envio.addActionListener(c);
		
	}
	
}
