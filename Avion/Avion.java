public class Avion {
    Motor motor;
    Persona pasajero1;
    Persona pasajero2;

    public Avion(Motor motor) {
        this.motor = motor;
    }

    public void acelerar() {
        System.out.println("El avión está acelerando en la pista.");
    }

    public void volar() {
        System.out.println("El avión está volando.");
    }

    public void abordar(Persona p1, Persona p2) {
        this.pasajero1 = p1;
        this.pasajero2 = p2;
        System.out.println(p1.nombre + " y " + p2.nombre + " han abordado el avión con sus maletas.");
    }


    public int calcularPotencia(int x, int y) {
        // Caso base: cualquier número elevado a 0 es 1
        if (y == 0) {
            return 1;
        }
        return x * calcularPotencia(x, y - 1);
    }
}