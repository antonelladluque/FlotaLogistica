//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Vehiculo[] flota = new Vehiculo[3];

                flota[0] = new Camion("AAH90009", "Mercedes", 180, 16);
                flota[1] = new Furgoneta("MPI", "Renault", 450, true);
                flota[2] = new MotoEnvio("Lpo044", "Zanella", 90); // Posición 2 y nombre corregido

                double costoTotalFlota = 0;
                double distanciaPrueba = 150;

                for (Vehiculo v : flota) {
                    v.mostrarFicha();
                    double costoViaje = v.calcularCostoViaje(distanciaPrueba);

                    System.out.println("Costo de viaje (" + distanciaPrueba + " km): $" + costoViaje);
                    System.out.println("--------------------------------------------------");

                    costoTotalFlota += costoViaje;
                }

                System.out.println("Costo total operativo de la flota: $" + costoTotalFlota);
            }

}