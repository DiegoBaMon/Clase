import java.util.Scanner;

public class Adicionales_Ejercicio_5_14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad de números pares (N): ");
        int n = teclado.nextInt();
        
        int suma = 0;
        int numeroActual = 6;
        
        for (int i = 0; i < n; i++) {
            suma += numeroActual;
            numeroActual += 2; // Sube de 2 en 2
        }
        
        System.out.println("La suma de los " + n + " primeros pares desde el 6 es: " + suma);
        teclado.close();
    }
}