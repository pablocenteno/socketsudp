package socketsudp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class TEnviaUDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void envia(byte[] mensaje, int tamMensaje, InetAddress hostDestino,int puerto) {
		DatagramPacket ds ;
		ds=new DatagramPacket(mensaje, tamMensaje,  hostDestino, puerto);
		
		try {
			DatagramSocket socket = new DatagramSocket(puerto,  
			    	  hostDestino);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
