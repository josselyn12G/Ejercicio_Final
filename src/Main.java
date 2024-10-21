import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancia de Universidad
        System.out.print("Ingrese el nombre de la universidad: ");
        String nombreUniversidad = scanner.nextLine();
        System.out.print("Ingrese el código de la universidad: ");
        String codigoUniversidad = scanner.nextLine();
        System.out.print("Ingrese la dirección de la universidad: ");
        String direccionUniversidad = scanner.nextLine();
        Universidad universidad = new Universidad(nombreUniversidad, codigoUniversidad, direccionUniversidad);

        // Crear instancia de Curso
        System.out.print("Ingrese la materia del curso: ");
        String materiaCurso = scanner.nextLine();
        Curso curso = new Curso(materiaCurso);

        // Variables para los estudiantes
        Estudiante estudiante1 = null, estudiante2 = null, estudiante3 = null;

        // Crear instancias de Estudiante
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nDatos del estudiante " + i + ":");
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Ingrese la carrera: ");
            String carrera = scanner.nextLine();
            System.out.print("Ingrese la nota 1: ");
            int nota1 = scanner.nextInt();
            System.out.print("Ingrese la nota 2: ");
            int nota2 = scanner.nextInt();
            System.out.print("Ingrese la nota 3: ");
            int nota3 = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            // Crear estudiante y asignarlo a una variable
            if (i == 1) {
                estudiante1 = new Estudiante(nombre, apellido, carrera, nota1, nota2, nota3);
            } else if (i == 2) {
                estudiante2 = new Estudiante(nombre, apellido, carrera, nota1, nota2, nota3);
            } else {
                estudiante3 = new Estudiante(nombre, apellido, carrera, nota1, nota2, nota3);
            }
        }

        // Imprimir la tabla completa al final
        System.out.println("\nUniversidad | Código | Dirección          | Nombre | Apellido | Carrera     | Materia       | Nota 1 | Nota 2 | Nota 3");
        System.out.println("----------------------------------------------------------------------------------------------");

        // Imprimir información de los estudiantes
        imprimirEstudiante(universidad, estudiante1, curso);
        imprimirEstudiante(universidad, estudiante2, curso);
        imprimirEstudiante(universidad, estudiante3, curso);

        scanner.close();
    }

    // Metodo para imprimir la información de un estudiante
    private static void imprimirEstudiante(Universidad universidad, Estudiante estudiante, Curso curso) {
        System.out.printf("%-11s | %-6s | %-17s | %-6s | %-8s | %-11s | %-12s | %-6d | %-6d | %-6d\n",
                universidad.getNombre(), universidad.getCodigo(), universidad.getDireccion(),
                estudiante.getNombre(), estudiante.getApellido(), estudiante.getCarrera(),
                curso.getMateria(), estudiante.getNota1(), estudiante.getNota2(), estudiante.getNota3());
    }
}