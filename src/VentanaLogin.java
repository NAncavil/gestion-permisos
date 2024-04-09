public class VentanaLogin {
	private String usuario;
	private String contraseña;

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
		System.out.println("1. Iniciar sesión");
		System.out.println("2. Registrarse");
		System.out.println("3. Salir");
		System.out.print("Seleccione una opción: ");
		return scanner.nextInt();
	}

	public void displayMessage(String message) {
		System.out.println(message);
	}

	public String getUsuario() {
		System.out.print("Ingrese su nombre de usuario: ");
		return scanner.next();
	}

	public String getContraseña() {
		System.out.print("Ingrese su contraseña: ");
		return scanner.next();
	}
}
