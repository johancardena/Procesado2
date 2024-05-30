package procesadores;

public class Procesadores_AMD extends Procesadores_escritorio{
    boolean sensor_temperatura;

    public Procesadores_AMD() {
    }
    public Procesadores_AMD(boolean sensor_temperatura){
        this.sensor_temperatura = sensor_temperatura;
    }

    public boolean isSensor_temperatura() {
        return sensor_temperatura;
    }

    public void setSensor_temperatura(boolean sensor_temperatura) {
        this.sensor_temperatura = sensor_temperatura;
    }

    @Override
    public void imprimir_datos_escritorio() {
        super.imprimir_datos_escritorio();
        System.out.println("Sensor temperatura: " + sensor_temperatura);
    }
}
