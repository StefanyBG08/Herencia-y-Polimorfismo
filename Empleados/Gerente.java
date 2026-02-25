public class Gerente extends Empleado {
    protected  double bono;

    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }

    @Override
    public void calcularSalario() {
        double total = this.salario + this.bono;
        System.out.println("Empleado: " + this.nombre);
        System.out.println("Salario Base: $" + this.salario);
        System.out.println("Bono: $" + this.bono);
        System.out.println("Salario Total: $" + total);
    }
}
