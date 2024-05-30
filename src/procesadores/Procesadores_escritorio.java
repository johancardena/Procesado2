package procesadores;

public class Procesadores_escritorio  extends Procesadores{
    String socket;
    public Procesadores_escritorio() {

    }
    public Procesadores_escritorio(int nucleos, Double consumo, Double velocidad, String nombre,String socket) {
        super(nucleos, consumo, velocidad, nombre);
        this.socket = socket;

    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }
    public void imprimir_datos_escritorio(){
        System.out.println("Socket: " + socket);
    }

}
