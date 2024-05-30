package procesadores;

public class Procesadores_intel extends Procesadores_escritorio{
    String tarjeta_video;
    public Procesadores_intel() {}
    public Procesadores_intel(String tarjeta_video) {
        this.tarjeta_video = tarjeta_video;
    }

    public String getTarjeta_video() {
        return tarjeta_video;
    }

    public void setTarjeta_video(String tarjeta_video) {
        this.tarjeta_video = tarjeta_video;
    }

    @Override
    public void imprimir_datos_escritorio() {
        super.imprimir_datos_escritorio();
        System.out.println(tarjeta_video);

    }
}


