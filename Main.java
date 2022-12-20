package socketsudp;

public class Main {

	public static void main(String[] args) {
		Vista vista = new Vista();
		Controlador c = new Controlador(vista);
		vista.conectaControlador(c);

	}

}
