<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO ACADÉMICO DE INGENIERÍA DE SISTEMAS E INFORMÁTICA</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />
</div>

<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Revisión de elementos de programación (Parte II)</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>02</td><td>AÑO LECTIVO:</td><td>2023 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA INICIO::</td><td>26-May-2022</td><td>FECHA FIN:</td><td>28-May-2022</td><td>DURACIÓN:</td><td>02 horas</td>
</tr>
<tr><td colspan="6">INTEGRANTES:
    <ul>
        <li>Jordy Rolando Tejada Lazo</li>
        <li>Gustavo Alonso Yunque Quispe</li>      
</td>
</<tr>
<tr><td colspan="6">DOCENTES:
<ul>
<li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
</ul>
</td>
</<tr>
</tdbody>
</table>

# Revisión de elementos de programación

[![License][license]][license-file]
[![Downloads][downloads]][releases]
[![Last Commit][last-commit]][releases]

[![Debian][Debian]][debian-site]
[![Git][Git]][git-site]
[![GitHub][GitHub]][github-site]
[![Vim][Vim]][vim-site]
[![Java][Java]][java-site]

#

## OBJETIVOS TEMAS Y COMPETENCIAS

### OBJETIVOS

- Realizar ejercicios en temas de Estructuras de datos, tipos de datos abstractos, bucles, Arrays, Listas enlazadas, Recursión.

### TEMAS

- TAD
- Arrays

<details>
<summary>COMPETENCIAS</summary>

- C.m. Construye responsablemente soluciones haciendo uso de estructuras de datos y algoritmos, siguiendo un proceso adecuado para resolver problemas computacionales que se ajustan al uso de los recursos disponibles y a especificaciones concretas.

</details>

## CONTENIDO DE LA GUÍA

### MARCO CONCEPTUAL

- https://www.w3schools.com/java/
- https://docs.oracle.com/javase/7/docs/api/java/util/List.html
- https://docs.oracle.com/javase/tutorial/java/generics/types.html

## EJERCICIO RESUELTO POR EL DOCENTE

#

- ArrayList

  - ```sh
      ArrayList<String> alumnos = new ArrayList<String>();
      ArrayList<Integer> notas = new ArrayList<Integer>();

      alumnos.add("HENRY");
    alumnos.add("DIEGO");
    alumnos.add("RICHART");
    alumnos.add("GABRIEL");

      System.out.println(alumnos.hashCode());
      System.out.println(alumnos.isEmpty());
      System.out.println(alumnos.size());
    ```

- Iterador
  - ```sh
      Iterator<String> itA = alumnos.iterator();
    while(itA.hasNext()) {
    	System.out.println(itA.next());
    }
    ```
- Java Bean

  - ```sh
    public class Animal {

        String nombre;
        boolean genero;

        public Animal(String nombre, boolean genero) {
            super();
            this.nombre = nombre;
            this.genero = genero;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public boolean isGenero() {
            return genero;
        }
        public void setGenero(boolean genero) {
            this.genero = genero;
        }

    }
    ```

  - ```sh
    ArrayList<Animal> mascotas = new ArrayList<Animal>();
    ```
  - ```sh
    List<Animal> mascotas2 = new List<Animal>(); /** <- Ver error */
    List<Animal> mascotas2 = new ArrayList<Animal>();
    ```

## EJERCICIOS PROPUESTOS

- 1. Invertir un matriz de enteros (2 pts)

  - Ejemplo:
  - A=[1 2 3] -> Ain=[3 2 1]

  - ```sh
    public int[] invertirArray(int[] A){
        /** */
        //Procedimiento para invertir la matriz
        /** */
        return Ain;
    }
    ```
    #

- 2. Rotación a la Izquierda (3 pts)

  - Ejemplo:
  - Si d=2
  - A=[1 2 3 4 5] -> Aiz=[3 4 5 1 2]

  - ```sh
    public int[] rotarIzquierdaArray(int[] A){
        /** */
        //Procedimiento para rotar la matriz
        /** */
        return Aiz;
    }
    ```

    #

- 3. Triángulo recursivo (4 pts)

  - Ejemplo:
  - b=5
  - ```sh
    *
    **
    ***
    ****
    *****
    ```

  - ```sh
    public void trianguloRecursivo(int base){
        /** */
        //Procedimiento para imprimir triángulo
        /** */
    }
    ```

- 4. Lista (11 pts)

  - Implementa una Lista usando POO con tipos genéricos siguiendo los estándares de Java. (Los métodos para una lista).

  - https://docs.oracle.com/javase/7/docs/api/java/util/List.html

  - Puede ignorar los siguientes métodos:

    - hashCode()
    - iterator()
    - listIterator()
    - listIterator(int index)
    - retainAll(Collection<?> c)
    - toArray()
    - toArray(T[] a)

  - (i) Implemente una clase Node<T> donde T es un tipo genérico, esta clase debe contener al menos dos propiedades.

  - https://docs.oracle.com/javase/tutorial/java/generics/types.html

  - ```sh
    T data: la información almacenada en el nodo
    Node<T> nextNode: una referencia al siguiente nodo
    ```

  - (ii) Implementar una clase List<T> esta clase debe contener al menos esta propiedad
  - ```sh
    Node<T> root: la referencia sobre el nodo inicial
    ```

#

## CUESTIONARIO

### ¿Qué diferencia hay entre un List y un ArrayList en Java?

- Tanto List como ArrayList son utilizados para trabajar con colecciones de elementos. La diferencia principal radica en que List es una interfaz, mientras que ArrayList es una clase concreta que implementa esa interfaz.

- Una ventaja de ArrayList es que tiene una capacidad dinámica, lo que significa que puede crecer automáticamente según sea necesario. Además, ofrece acceso eficiente a los elementos mediante índices. Por otro lado, List no tiene una capacidad dinámica y depende de implementaciones específicas.

- En términos de eficiencia en la inserción y eliminación de elementos, ArrayList es más eficiente en el medio de la lista. Sin embargo, si se realizan muchas inserciones o eliminaciones al principio o al final de la lista, otras implementaciones de List pueden ser más eficientes, como LinkedList.

- En cuanto al uso de memoria, ArrayList utiliza una cantidad fija de memoria, mientras que otras implementaciones de List pueden requerir más memoria debido a su estructura interna.

- En resumen, ArrayList es una implementación específica de List en Java que ofrece capacidad dinámica y acceso eficiente mediante índices. Sin embargo, List es más general y puede ser implementada por diferentes clases con diferentes características de rendimiento.

### ¿Qué beneficios y oportunidades ofrecen las clases genéricas en Java?

- Reutilización de código: Permite escribir código que se puede reutilizar con diferentes tipos de datos, evitando la duplicación de código.
- Seguridad de tipos: Proporciona detección de errores de tipo en tiempo de compilación, lo que reduce los errores en tiempo de ejecución y facilita el mantenimiento del código.
- Abstracción y generalización: Permite crear estructuras de datos y algoritmos independientes del tipo de datos, lo que promueve el diseño modular y escalable.
- Flexibilidad en los tipos de datos: Permite utilizar diferentes tipos de datos como parámetros, siempre que cumplan con los requisitos definidos.
- Mejora del rendimiento: Puede ofrecer mejoras en el rendimiento al evitar conversiones y comprobaciones de tipos en tiempo de ejecución.

- En resumen, las clases genéricas en Java brindan la capacidad de reutilizar código, mejorar la seguridad de tipos, facilitar la abstracción y generalización, ofrecer flexibilidad en los tipos de datos y potencialmente mejorar el rendimiento del código. Estos beneficios contribuyen a un desarrollo de software más eficiente y de alta calidad.

## REFERENCIAS

    - https://www.w3schools.com/java/
    - https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developers
    - https://docs.oracle.com/javase/7/docs/api/java/util/List.html
    - https://docs.oracle.com/javase/tutorial/java/generics/types.html

#

[license]: https://img.shields.io/github/license/rescobedoq/pw2?label=rescobedoq
[license-file]: https://github.com/rescobedoq/pw2/blob/main/LICENSE
[downloads]: https://img.shields.io/github/downloads/rescobedoq/pw2/total?label=Downloads
[releases]: https://github.com/rescobedoq/pw2/releases/
[last-commit]: https://img.shields.io/github/last-commit/rescobedoq/pw2?label=Last%20Commit
[Debian]: https://img.shields.io/badge/Debian-D70A53?style=for-the-badge&logo=debian&logoColor=white
[debian-site]: https://www.debian.org/index.es.html
[Git]: https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white
[git-site]: https://git-scm.com/
[GitHub]: https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white
[github-site]: https://github.com/
[Vim]: https://img.shields.io/badge/VIM-%2311AB00.svg?style=for-the-badge&logo=vim&logoColor=white
[vim-site]: https://www.vim.org/
[Java]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white
[java-site]: https://docs.oracle.com/javase/tutorial/

[![Debian][Debian]][debian-site]
[![Git][Git]][git-site]
[![GitHub][GitHub]][github-site]
[![Vim][Vim]][vim-site]
[![Java][Java]][java-site]

[![License][license]][license-file]
[![Downloads][downloads]][releases]
[![Last Commit][last-commit]][releases]
