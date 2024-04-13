# Calculadora de Distancias de Palabras

Breve descripción del proyecto. Explica qué hace y por qué es útil.

## Descripción

Este proyecto incluye una implementación en Java del algoritmo de distancia de edición, comúnmente conocida como 
distancia de Levenshtein, que calcula el número mínimo de operaciones (inserciones, eliminaciones o sustituciones 
de caracteres) requeridas para transformar una cadena de texto en otra. Esta funcionalidad es útil en aplicaciones 
como la corrección ortográfica, la comparación de texto, y en sistemas de procesamiento de lenguaje natural para 
evaluar la similitud entre textos. El proyecto consta de dos módulos principales: CalculadoraDistancias, que 
contiene la lógica del algoritmo, y Principal, que demuestra el uso del algoritmo con ejemplos concretos.

## Uso

El uso de este proyecto es bastante directo debido a su naturaleza enfocada. A continuación, se presenta un ejemplo 
de cómo se puede utilizar el módulo CalculadoraDistancias para calcular la distancia de edición entre dos palabras 
específicas:

```java
import palabras.CalculadoraDistancias;

public class Principal {
    public static void main(String[] args) {
        String palabra1 = "Perro";
        String palabra2 = "Perra";
        
        int distancia = CalculadoraDistancias.calcularDistancia(palabra1, palabra2);
        System.out.println("La distancia entre '" + palabra1 + "' y '" + palabra2 + "' es " + distancia);
    }
}
```
### Ejemplo
Este ejemplo calcula la distancia de edición entre las palabras "Perro" y "Perra", lo cual resultará en un valor de 1,
ya que solo requiere una operación de sustitución (cambiar 'o' por 'a'). Puedes modificar las variables palabra1 y 
palabra2 en el método main para probar con diferentes cadenas y explorar los resultados del algoritmo.

## Instalación
Proporciona instrucciones detalladas sobre cómo instalar y configurar tu proyecto. Incluye cualquier requisito previo,
pasos de instalación, y notas de configuración necesarias.

1. Clona el repositorio
```sh
git clone https://github.com/tu-usuario/tu-proyecto.git
```
2. Navega al directorio del proyecto
```sh
cd practica2.4
```

## Autor
- Nombre: [José Pascual] https://github.com/JoseP2005
- Universidad: [CEU San Pablo]

## Licencia
Este proyecto está licenciado bajo la Licencia Apache 2.0 - vea el archivo LICENSE para detalles.

Licencia Apache 2.0
La Licencia Apache es una licencia de software libre y abierta. La versión 2.0 de la Licencia Apache, aprobada por la OSI y recomendada por la Free Software Foundation, se considera una licencia de software libre que es compatible con la versión 3 de la GPL.

Para obtener una copia de esta licencia, visita http://www.apache.org/licenses/LICENSE-2.0.
