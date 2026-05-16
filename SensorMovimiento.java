public class SensorMovimiento {

    private String ubicacion;
    private boolean movimientoDetectado;

    public SensorMovimiento(String ubicacion) {
        this.ubicacion = ubicacion;
        this.movimientoDetectado = false;
    }

    public void detectarMovimiento() {
        movimientoDetectado = true;
        System.out.println("Movimiento detectado en: " + ubicacion);
    }

    public void desactivarSensor() {
        movimientoDetectado = false;
        System.out.println("Sensor desactivado en: " + ubicacion);
    }

    public void mostrarEstado() {

        if (movimientoDetectado) {
            System.out.println("El sensor está activo.");
        } else {
            System.out.println("El sensor está inactivo.");
        }
    }

    public static void main(String[] args) {

        SensorMovimiento sensor1 =
                new SensorMovimiento("Puerta Principal");

        sensor1.mostrarEstado();

        sensor1.detectarMovimiento();

        sensor1.mostrarEstado();

        sensor1.desactivarSensor();
    }
}