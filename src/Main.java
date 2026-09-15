//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
VehiculoElectrico vehiculo = new VehiculoElectrico(100.0, 50);

SurtidorElectrico surtidor = new SurtidorElectrico(30.0);

surtidor.iniciarCarga(vehiculo, 35 );
}
