public class Perro extends Animal {
    protected  String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Nombre: " +this.nombre);
        System.out.println("Raza: "+ this.raza);
        System.out.println("Edad: " + this.edad + " años");
        System.out.println("dice: ¡Guau Guau!");
    }
}