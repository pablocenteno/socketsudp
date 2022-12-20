package socketsudp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Controlador implements ActionListener{

	private Vista vista;
	private TEnviaUDP enviador;
	private TRecibeUDP recibe;
	
	public Controlador( Vista vista ){
        this.vista  = vista;
        this.recibe= new TRecibeUDP(vista);
 }
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		String texto = e.getActionCommand();
		String textoEnvio = null;
		InetAddress ia = null;
		if(texto.equals("envio")) {
			textoEnvio = vista.field1.getText();
			try {
				ia.getByName(textoEnvio);
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		 byte[] bytes = textoEnvio.getBytes();
		enviador.envia(bytes, bytes.length, ia, 8888);
		recibe.recibe(8888, 1024);
		
	}

}
