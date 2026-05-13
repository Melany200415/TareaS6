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
**Ejercicio 1**
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
- Se utilizo la siguiente esttructura interface
public interface Imprimible {
    void imprimir();
}
--- 
**Ejercicio 2**
---
En este ejercicio se desarrolló un sistema bancario de pagos utilizando interfaces en Java.  

Se creó la interfaz `Pagable`, la cual fue implementada por las clases:

- PagoEfectivo
- PagoTarjeta
- Transferencia

Cada clase muestra un mensaje diferente según el tipo de pago realizado. Además, se aplicaron validaciones para verificar que el monto ingresado sea mayor a cero.

También se agregó una comisión diferente para pagos con tarjeta y transferencia.

---

# Conceptos aplicados

- Interfaces
- Implementación con `implements`
- Uso de `@Override`
- Encapsulamiento
- Validaciones
- Polimorfismo
---
**Ejercicio 3 **

En este ejercicio se desarrolló un sistema de roles empresariales utilizando múltiples interfaces en Java.

Se crearon las interfaces:

- Autenticable
- Reportable
- Gestionable

Y las clases:

- Cajero
- Administrador
- Supervisor

Cada clase implementa diferentes interfaces según los permisos y responsabilidades de cada rol dentro de la empresa.

Además, se realizaron validaciones de usuario y contraseña y se implementó un menú simple para ejecutar acciones según el rol seleccionado.

---

# Conceptos aplicados

- Interfaces
- Implementación múltiple
- Polimorfismo
- Encapsulamiento
- Validaciones
- Uso de `@Override`
  ---
  **VIDEO**
  
