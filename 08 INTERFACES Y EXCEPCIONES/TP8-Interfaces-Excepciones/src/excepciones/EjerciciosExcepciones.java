
package excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjerciciosExcepciones {
    
    // 1. División segura - Maneja ArithmeticException
    public static void divisionSegura() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el dividendo: ");
            int dividendo = scanner.nextInt();
            System.out.print("Ingrese el divisor: ");
            int divisor = scanner.nextInt();
            
            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        }
    }
    
    // 2. Conversión de cadena a número - Maneja NumberFormatException
    public static void conversionCadenaNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        String entrada = scanner.nextLine();
        
        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Numero convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + entrada + "' no es un numero valido");
        }
    }
    
    // 3. Lectura de archivo - Maneja FileNotFoundException
    public static void lecturaArchivo() {
        try {
            FileReader archivo = new FileReader("src/textos/archivo_ejemplo.txt");
            BufferedReader lector = new BufferedReader(archivo);
            String linea;
            
            System.out.println("Contenido del archivo:");
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            
            lector.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }
    }
    
    // 4. Excepción personalizada - Valida edad
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad " + edad + " no es valida. Debe estar entre 0 y 120");
        }
        System.out.println("Edad valida: " + edad);
    }
    
    // 5. Try-with-resources - Manejo automático de recursos
    public static void leerConTryWithResources() {
        try (BufferedReader lector = new BufferedReader(new FileReader("src/textos/archivo_ejemplo.txt"))) {
            String linea;
            System.out.println("Leyendo con try-with-resources:");
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
