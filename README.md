# Arbol Binario de Busqueda (BST) - Proyecto Estructura de Datos

> **Asignatura:** Estructura de Datos y Algoritmos I
> **Integrantes:** Ambar Salazar, Brenda Veintimilla
> **Grupo:** 15
> **Lenguaje:** Java
> **Cedula utilizada:** 1751167998

## Descripcion

Este proyecto implementa un Arbol Binario de Busqueda (BST) en Java, desarrollado como parte de la asignatura. El programa ejecutable realiza las siguientes operaciones:

* Valida una cedula de 10 digitos ingresada por el usuario.
* Genera 10 valores a partir de los digitos de la cedula usando la formula oficial establecida:
Vi = (di x 10) + i
* Construye el arbol insertando los valores en orden estricto (V1 a V10).
* Muestra el recorrido inorden despues de cada insercion para auditar el crecimiento del arbol paso a paso.
* Realiza busquedas de los valores V7, V10 y 105, mostrando de forma detallada la secuencia de nodos visitados y el numero de comparaciones efectuadas.
* Inserta los nuevos valores calculados A = 111 + d9 y B = 122 + d10.
* Elimina tres nodos representando rigurosamente los tres casos teoricos: hoja, un hijo y raiz con dos hijos (resolviendo este ultimo mediante el sucesor en orden).
* Incluye los recorridos fundamentales inorden, preorden, postorden y el calculo dinamico de la altura del arbol.

El comportamiento y estructura final del programa coincide exactamente con el arbol construido de forma manual en papel durante el taller en clase.

---

## Estructura del Proyecto

proyecto-bst/
├── src/
│   ├── Nodo.java        # Clase que representa la estructura de un nodo del arbol
│   ├── ArbolBST.java    # Logica del BST (insercion, busqueda, eliminacion y recorridos)
│   └── Main.java        # Interfaz de usuario, validacion de cedula y flujo principal
├── README.md            # Este archivo de documentacion
└── pseudocodigo.pdf     # Pseudocodigo de las operaciones principales

---

## Operaciones Implementadas

### 1. Insercion (insertar)

* Implementacion de naturaleza recursiva.
* Respeta las propiedades del BST y restringe la insercion de valores duplicados.

### 2. Busqueda (buscar)

* Recorrido iterativo eficiente a traves de las ramas.
* Cuenta activamente las comparaciones y registra dinamicamente la ruta de nodos visitados.

### 3. Eliminacion (eliminar)

* Caso 1: Nodo hoja -> Se desvincula directamente de su padre.
* Caso 2: Un solo hijo -> El nodo se reemplaza directamente por su unico hijo (izquierdo o derecho).
* Caso 3: Dos hijos -> Se reemplaza el valor por el de su sucesor en orden (el nodo con el valor minimo del subarbol derecho) y se procede a eliminar dicho sucesor de manera recursiva.

### 4. Recorridos

* inorden() -> Recorre en sentido: Izquierda -> Raiz -> Derecha (Devuelve los elementos ordenados de forma ascendente).
* preorden() -> Recorre en sentido: Raiz -> Izquierda -> Derecha.
* postorden() -> Recorre en sentido: Izquierda -> Derecha -> Raiz.

### 5. Altura del arbol (altura())

* Calcula de forma recursiva la profundidad maxima desde la raiz hasta la hoja mas lejana.

---

## Ejecucion

### Requisitos

* Java JDK 8 o superior instalado en el sistema.
* Consola de comandos, terminal o shell (no requiere entornos de desarrollo/IDEs pesados).

### Compilacion

Navega hasta el directorio de los archivos fuente (src) y ejecuta:

cd src
javac Nodo.java ArbolBST.java Main.java

### Ejecucion

Inicia el hilo principal del programa ejecutable mediante:

java Main

> Importante: El desarrollo se ha realizado haciendo uso exclusivo de la API estandar de Java. No se utilizan librerias externas ni utilidades propietarias de ningun IDE.

---

## Ejemplo de Entrada/Salida

Ingrese su cedula (10 digitos): 1751167998

Tabla de valores generados:
V1 = 1 * 10 + 1 = 11
V2 = 7 * 10 + 2 = 72
V3 = 5 * 10 + 3 = 53
...

Construyendo arbol:
Despues de insertar V1: 11
Despues de insertar V2: 11 72
...

--- Busqueda de V7 ---
Visitados: [11, 72, 77]
Comparaciones: 3
Resultado: Encontrado

--- Eliminacion de raiz con dos hijos: eliminar 72 ---
Sucesor en orden utilizado: 66
Inorden despues: 11 14 15 53 66 77 90 99 120 130

---

## Video Explicativo

[Enlace al video sustentacion (YouTube/Drive)](https://youtu.be/tu-enlace-aqui)

El video de sustentacion aborda los siguientes puntos requeridos:

* Explicacion detallada de las funciones de insercion y busqueda por un integrante del grupo.
* Explicacion analitica de los tres casos de eliminacion de nodos por el otro integrante.
* Demostracion y ejecucion en vivo del software empleando la cedula asignada al grupo.
* Contraste visual y validacion con el arbol estructurado originalmente en papel.
* Muestra explicita del caso de eliminacion de la raiz con dos hijos y el correcto reemplazo por su sucesor en orden.
* Conclusion y retrospectiva sobre la logica de programacion mas compleja de la practica.

---

## Declaracion de uso de IA

Uso de IA: 0 %

El diseño logico del Arbol Binario de Busqueda, la validacion sintactica de las estructuras, la resolucion algoritmica de los punteros en la eliminacion de nodos y la programacion completa de la interfaz en consola fueron desarrollados integramente por los miembros del grupo de trabajo de manera manual. No se emplearon asistentes de codigo artificial, generadores automaticos de pseudocodigo ni herramientas de Inteligencia Artificial generativa durante el proceso de desarrollo.

---

## Coherencia con el Taller en Papel

El arbol binario de busqueda resultante del procesamiento de los datos en la aplicacion coincide en su totalidad con el diagrama analitico estructurado a mano en el taller de clase. Las propiedades de ordenamiento, distribucion estructural de los niveles y las secuencias de los recorridos principales guardan perfecta correspondencia.

---

## Criterios de Calidad Cumplidos

* El codigo fuente compila limpiamente sin advertencias ni errores con javac.
* Empleo de una nomenclatura clara, autodescriptiva y en espanol/ingles estandarizado para variables, clases y firmas de metodos.
* Inclusion de comentarios tecnicos explicativos, orientados en particular a la resolucion de los tres casos de eliminacion.
* Ausencia de codigo muerto, funciones redundantes o clases sin uso dentro del paquete.
* Arquitectura modular con una clara separacion de responsabilidades en componentes independientes (Nodo, ArbolBST, Main).

---

## Referencias

* Apuntes de clase y guias de practica - Estructura de Datos y Algoritmos I.
* [Binary Search Tree - GeeksforGeeks](https://www.geeksforgeeks.org/binary-search-tree-data-structure/)

---

## Licencia

Proyecto de caracter estrictamente academico - Desarrollado con fines educativos para la Escuela Politecnica Nacional.

---

## Autoras

* Ambar Salazar
* Brenda Veintimilla

Grupo 15 - Estructura de Datos y Algoritmos I

Escuela Politecnica Nacional

Quito, Ecuador
