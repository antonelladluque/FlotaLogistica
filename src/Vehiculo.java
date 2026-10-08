public class Vehiculo {

    protected String patente;
    protected String marca;
    protected double costoBaseKm;

    public Vehiculo (String patente, String marca, double costoBaseKm){

        this.patente=patente;
        this.marca=marca;
        this.costoBaseKm=costoBaseKm;
    }


    public double calcularCostoViaje(double distanciaKm){

        return distanciaKm * costoBaseKm;
    }

    public double calcularCostoViaje(double distanciaKm, double peajes){
        return distanciaKm * costoBaseKm + peajes;
    }

    public void mostrarFicha(){
        System.out.print("[Vehículo] Patente: " + patente + " | Marca: " + marca);
    }
}
