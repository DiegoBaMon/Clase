public class Vuela { 
    public static void main(String[] args) {
        
        Maleta m1 = new Maleta(35.5);
        Maleta m2 = new Maleta(79.0);

        
        Persona p1 = new Persona("Pepita Perez", m1);
        Persona p2 = new Persona("Cristiano Ronaldo", m2);

        
        Motor motorAvion = new Motor("Motor de Avión");
        Avion miAvion = new Avion(motorAvion);

        
        miAvion.acelerar();
        miAvion.abordar(p1, p2);
        miAvion.volar();

        
        int base = 3;
        int exponente = 7;
        int resultado = miAvion.calcularPotencia(base, exponente);
        
        System.out.println("\n--- Prueba de Recursividad ---");
        System.out.println(base + " elevado a la " + exponente + " es: " + resultado);
    }
}