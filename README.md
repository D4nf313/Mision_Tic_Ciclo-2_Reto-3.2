ENUNCIADO

En vista de la conmemoración del Día del Idioma, las principales librerías del país se preparan para rendir un homenaje a los escritores latinoamericanos más reconocidos a nivel mundial, a través de la promoción de sus obras durante todo el mes de Octubre de 2021. La demanda de sus libros presenta un crecimiento considerable, y las librerías buscan mantener el suficiente inventario para cubrir la expectativa de los lectores, hasta el punto que han tenido que llevar a cabo sesiones de intercambio de material (duplicados por faltantes) para poder completar sus inventarios:

El Ministerio de Cultura, buscando facilitar las tareas de abastecimiento e intercambio de materiales en las librerías, ha lanzado una convocatoria para jóvenes emprendedores que creen sistemas de información que soporten las principales necesidades (establecidas a partir de encuestas realizadas aleatoriamente en diferentes establecimientos literarios del país), resumidas en:
→ Portafolio de Autores: Poder saber a partir del inventario completo de una librería, de qué autores se tiene al menos una obra literaria.
→ Faltante Por Autor: A partir del inventario agotado y del inventario disponible de una librería, poder determinar cuales son las obras literarias que hacen falta para un autor determinado.
→ Interés de Intercambio: Le permite saber a una librería determinada, qué obra literarias de otra librería le sirven a la hora de realizar intercambios.
→ Posibles Intercambios: Le permite saber a una librería determinada el número de intercambios que podría llevar a cabo con otra librería a partir de sus inventarios.
Objetivo: Tomando como referencia la asignación de valores numéricos a cada uno de los autores de esta forma:
1. Jorge Luis Borges
2. Gabriela Mistral
3. Isabel Allende
4. Pablo Neruda
5. Gabriel García Márquez
6. Juan Rulfo
7. Julio Cortázar
8. Mario Vargas Llosa
9. Octavio Paz
10. Ernesto Sábato
Implementar la clase Librería, por medio del archivo Librería.java, que implemente los siguientes métodos:
1. “portafolio”: Este método es la implementación de la funcionalidad “Portafolio de Autores”. Permite determinar el listado de números que identifican a los autores de los cuales se tiene al menos una obra literaria, tomando como referencia el listado total de obra literarias de autores existentes. Es importante recalcar que en el resultado cada número asociado a un autor, debe aparecer una única vez (es decir, sin duplicados).
Ejemplo: Si a una librería le quedan en existencias 3 obra literarias de la Gabriel García Márquez (identificado con el número 5), 2 de Isabel Allende (identificada con el número 3), 2 de Jorge Luis Borges (identificado con el número 1) y 1 de Octavio Paz (identificado con el número 9), la representación del listado de obra literarias existentes por autor para dicha librería es [5,5,5,2,2,1,1,9]. Para este ejemplo, el resultado esperado de invocar el método portafolio es : [5,2,1,9], que indica que en el portafolio de la librería hay de obras literarias de Gabriel García Márquez, Isabel Allende, Jorge Luis Borges y Octavio Paz.
2. “agotadoPara”: Este método es la implementación de la funcionalidad “Faltante Por Autor”.
Recibe como argumentos un listado en el que se indican las posiciones del inventario (inician en 0) en donde hay ítems faltantes (obras literarias agotadas), un listado que representa el inventario inicial de las obras literarias a partir del número que identifica al autor correspondiente, y un identificador de un autor en particular. A partir de los argumentos de entrada, se determinan las posiciones faltantes correspondientes al autor indicado.

Posiciones Faltantes (obra literarias agotadas): [0,2,4,7 ].
- Inventario Inicial: [5,5,5,2,2,1,1,9].
- Autor a Consultar: 5 (Gabriel García Márquez).
Resultado esperado: [0,2], que son las posiciones en el inventario inicial en el que hay faltantes correspondientes al autor Gabriel García Márquez.
3. “deInterés”: Este método es la implementación de la funcionalidad “Interés de Intercambio”. Como argumentos recibe el listado de obras literarias de otra librería (a partir del número que identifica la autor correspondiente), y el listado de obra literarias propio (a partir del número que identifica al autor correspondiente), y retorna el listado de las obra literarias que son aceptables para un intercambio (a partir del número que identifica al autor correspondiente).
Ejemplo:
- Obras literarias de otra librería: [3,5,7,10,9,8,9].
- Obras literarias propias: [5,5,5,2,2,1,1,9].
- Interés de Intercambio: [10, 7, 3, 8].
4. “posiblesIntercambios”: Este método es la implementación de la funcionalidad “Posibles Intercambios”. Recibe como argumentos el listado de obras literarias de otra librería (a partir del número que identifica al autor correspondiente), y el listado de obras literarias propias (a partir del número que identifica al autor correspondiente), y retorna el número total (valor entero) de intercambios que se podrían presentar.
Ejemplo:
- Obras literarias de otra librería: [3,5,7,10,9,8,9].
- Obras literarias propias: [5,5,5,2,2,1,1,9].
- Posibles Intercambios: 2. Aunque a la librería propia le interesan las obra literarias de los autores [10, 7, 3, 8], a la otra librería solo le podrían interesar las obra literarias de los autores [2,1] (listado con tamaño 2).
Nota: La clase Librería no debe tener implementada la función (método estático) main , sino los métodos indicados para esta clase (portafolio, agotadoPara, deInterés y posiblesIntercambios)
