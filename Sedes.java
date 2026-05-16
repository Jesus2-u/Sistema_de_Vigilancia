public class Sedes {
    private int id;
    private String nombre;

    public Sedes(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void mostrarAlumno() {
        System.out.println("ID: " + id);
        System.out.println("Nombre de la Sede: " + nombre);
    }
}
