# Escuela Politecnica Nacional 
# Tarea S6
# Interfaces en Java
---
**Nombre Estudiante :** Perugachi Melany  
**Materia:** Programación Orientada a Objetos  
**Tema:** Interfaces en Java  
---
*Ejercicio Propuestos*
---
**Ejercico 1**
---
El ejercicio 1 fue desarrollado con el objetivo de aplicar y entender el uso de interfaces en Java mediante un sistema académico de documentos.  
El sistema permite representar distintos tipos de documentos académicos utilizando una interfaz común llamada `Imprimible`, la cual obliga a las clases a implementar el método `imprimir()`.
Se trabajó aplicando conceptos fundamentales de Programación Orientada a Objetos como:

- Interfaces
- Encapsulamiento
- Polimorfismo
- Sobrescritura de métodos (`@Override`)
- Organización de clases
- Buenas prácticas de programación
---
public interface Imprimible {
    void imprimir();
}
