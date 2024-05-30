package procesadores;

public class Procesadores_moviles extends Procesadores{
    boolean optimizacion_energia;
    public Procesadores_moviles() {}
    public Procesadores_moviles(boolean optimizacion_energia) {
        this.optimizacion_energia = optimizacion_energia;
    }

    public boolean isOptimizacion_energia() {
        return optimizacion_energia;
    }

    public void setOptimizacion_energia(boolean optimizacion_energia) {
        this.optimizacion_energia = optimizacion_energia;
    }

    public void imprimir_datos_moviles(){
        System.out.println("Optimizacion energia: " + isOptimizacion_energia());
    }
}

