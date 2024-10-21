public class Estudiante {
    private String nombre;
    private String apellido;
    private String carrera;
    private int nota1;
    private int nota2;
    private int nota3;

    public Estudiante(String nombre, String apellido, String carrera, int nota1, int nota2, int nota3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public int getNota3() {
        return nota3;
    }
}

