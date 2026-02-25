public class Moto extends Vehiculo {
    protected int cilindrada;

    public Moto(String marca, String modelo, int velocidad_Maxima, int cilindrada) {
        super(marca, modelo, velocidad_Maxima);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Información de la Moto");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidad Máxima: " + this.velocidad_Maxima + " km/h");
        System.out.println("Cilindrada: " + this.cilindrada + "cc");
    }
}