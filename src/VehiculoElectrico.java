public class VehiculoElectrico {
    double capacidadBateria;
    double nivelActual;


    public VehiculoElectrico(Double capacidadBateria, double nivelActual){
        this.capacidadBateria = capacidadBateria;
        this.nivelActual = nivelActual;
    }

    void recibirCarga(double kw){
        nivelActual += kw;
        if(nivelActual == capacidadBateria){
            System.out.println("Capacidad maxima de bateria alcanzada");
        }
    }
}
