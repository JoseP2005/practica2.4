package aplicacion;

import palabras.CalculadoraDistancias;

/**
 * Clase principal que ejecuta la aplicación.
 * <p>
 * Esta clase contiene el método principal {@code main}, el cual se utiliza
 * para demostrar el cálculo de la distancia entre dos palabras mediante el
 * uso de la clase {@code CalculadoraDistancias} del paquete {@code palabras}.
 * </p>
 */
public class Principal {
    /**
     * Punto de entrada principal de la aplicación.
     * <p>
     * Este método toma dos palabras específicas y calcula la distancia entre ellas
     * utilizando la {@code CalculadoraDistancias}. Luego, imprime el resultado en
     * la consola.
     * </p>
     *
     * @param args Argumentos pasados a la línea de comandos. No se utilizan en este método.
     */
    public static void main(String[] args) {
        // Palabras específicas definidas directamente en el código
        String palabra1 = "Perro";
        String palabra2 = "Perra";

        System.out.println("La distancia entre las palabras " + palabra1 + " y " + palabra2 + " es " +
                CalculadoraDistancias.calcularDistancia(palabra1, palabra2));
    }
}
