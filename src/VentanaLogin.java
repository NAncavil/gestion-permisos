public class VentanaLogin {
	private String usuario;
	private String contrase�a;

	public void registrarCiudadano() {
		throw new UnsupportedOperationException();
	}

	public void ingresarMenu() {
		throw new UnsupportedOperationException();
	}
}
import java.util.Scanner;

public class VentanaLogin {
	private Scanner scanner;

	public VentanaLogin() {
		scanner = new Scanner(System.in);
	}

	public int showMenuAndGetOption() {
		System.out.println("1. Iniciar sesi�n");
		System.out.println("2. Registrarse");
		System.out.println("3. Salir");
		System.out.print("Seleccione una opci�n: ");
		return scanner.nextInt();
	}

	public void displayMessage(String message) {
		System.out.println(message);
	}

	public String getUsuario() {
		System.out.print("Ingrese su nombre de usuario: ");
		return scanner.next();
	}

	public String getContrase�a() {
		System.out.print("Ingrese su contrase�a: ");
		return scanner.next();
	}
}
