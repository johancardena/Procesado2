package procesadores;

public class Procesadores {
    int nucleos;
    Double consumo, velocidad;
    String nombre;

    //construtor vacio
    public Procesadores() {}

    public Procesadores(int nucleos, Double consumo, Double velocidad, String nombre) {
        this.nucleos = nucleos;
        this.consumo = consumo;
        this.velocidad = velocidad;
        this.nombre = nombre;
    }
    // setters y getters


    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    // metodos personalizados

    public void imprimir_datos(){
        System.out.println("***** Procesadores *****");
        System.out.println("Nucleos: " + nucleos);
        System.out.println("Consumo: " + consumo);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Nombre: " + nombre);

    }

}
