package aplicacion;

import palabras.CalculadoraDistancias;

public class Principal {
    public static void main(String[] args) {
        // Palabras específicas definidas directamente en el código
        String palabra1 = "Perro";
        String palabra2 = "Perra";

        System.out.println("La distancia entre las palabras " + palabra1 + " y " + palabra2 + " es " +
                CalculadoraDistancias.calcularDistancia(palabra1, palabra2));
    }
}
