public class Vehiculo{
    protected String marca;
    protected String modelo;
    protected int velocidad_Maxima;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad_Maxima = velocidadMaxima;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidad Maxima: " + this.velocidad_Maxima + " km/h");
    }
}