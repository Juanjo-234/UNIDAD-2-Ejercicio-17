public class SurtidorElectrico {
    double potenciaKw;

    public SurtidorElectrico(double potenciaKw){
        this.potenciaKw = potenciaKw;
    }

    void iniciarCarga(VehiculoElectrico vehiculo, int minutos){
double energiaSuministrada = (potenciaKw / 60) * minutos;

System.out.println("Suministrando energia " + energiaSuministrada + "Kw por " + minutos + " minutos");

vehiculo.recibirCarga(energiaSuministrada);
System.out.println("Carga completada. Nivel actual del vehiculo " + vehiculo.nivelActual + " Kw ");

    }
}
