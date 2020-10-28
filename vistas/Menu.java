package sistemaNotas;

public class Menu {
	// Menu debe heredar de MenuTemplate
	//alumnoServicio, instancia de AlumnoServicio.
	//archivoServicio, instancia de ArchivoServicio.
	//scanner, instancia de Scanner para recibir valores a trav�s del teclado.
	
	
	//Adem�s sobreescribir estos los siguientes m�todos:
	//cargarDatos, ejecuta la carga de datos del archivo.
	//exportarDatos, llama a m�todo para exportar promedios.
	//crearAlummno, solicita ingreso de datos y llena objeto de tipo Alumno.
	//agregarMateria, muestra menu para asignar materia a un alumno.
	//agregarNotaPasoUno, muestra menu para asignar nota a un alumno.
	//listarAlumnos, muestra lista de alumnos.
	//terminarPrograma, el cual finaliza la ejecuci�n del sistema.
	
	
	public int contruirMenu(List<String> pOpcionesMenu, Scanner leer) {
		List<String> opcionesMenu = pOpcionesMenu;
		int largo = opcionesMenu.size();
		
		for (int i = 0; i < largo; i++) {
			System.out.println(i+1 + " " + opcionesMenu.get(i));
		}
		return seleccionValida(largo, leer);
	}
	
	private int seleccionValida(int largo, Scanner leer) {
		int opcion = 0;
		boolean valida = false;
		while(!valida) {
			System.out.print("Ingresar opci�n: ");
			try {
				opcion =  leer.nextInt();	
			} catch (Exception error) {
				leer.nextLine();
			}
			
			if (opcion < 1 || opcion >= largo+1) {
				System.out.println("Opci�n inv�lida, intente de nuevo");
			} else {
				valida = true;
			}
		}
		return opcion;
	}

}
