package socketsudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class TRecibeUDP {

	Vista vista;
	private byte bytes[] = new byte[1024];
	public static void main(String[] args) {
		

	}
	
	public void recibe(int puerto, int tamMax) {
		DatagramSocket ds;
		DatagramPacket dp;
		
		try {
			ds = new DatagramSocket(puerto);
			while (true) 
	        {
	           dp = new DatagramPacket(bytes, bytes.length);
	            try {
					ds.receive(dp);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            
	            String texto = new String(dp.getData());

	            int puerto2 = dp.getPort();
	            
	            InetAddress direccion = dp.getAddress();
	
	            String todo = vista.field3.getText();
	            
	            vista.field3.setText(todo + " (" + direccion + ")" + texto);
	        }
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
