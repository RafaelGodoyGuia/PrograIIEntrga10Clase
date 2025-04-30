# PrograIIEntrga10EjerciciosClase
# 12.4.1. Inserción directa
## Ejercicio 75. Explique apoyándose en un ejemplo cómo funciona el método de inserción directa.
- Explicación:
  <br>El método de ordenación por inserción directa (Insertion Sort) funciona de manera similar a como muchas personas ordenan cartas en su mano. Divide virtualmente la lista en dos sublistas: una ordenada (inicialmente vacía) y otra desordenada (inicialmente toda la lista). El algoritmo itera a través de la lista desordenada, tomando un elemento a la vez (el elemento actual) y lo inserta en la posición correcta dentro de la sublista ordenada. Para encontrar la posición correcta, compara el elemento actual con los elementos de la sublista ordenada (de derecha a izquierda) hasta encontrar un elemento menor o llegar al inicio de la lista. Los elementos mayores que el elemento actual se desplazan una posición a la derecha para hacer espacio.
- Ejemplo:
  <br>Consideremos el array A = [5, 2, 4, 6, 1, 3]
  <br>Paso 1: [5 | 2, 4, 6, 1, 3]
  <br>La sublista ordenada es [5]. Tomamos el primer elemento de la parte desordenada: 2.
  <br>Comparamos 2 con 5. Como 2 < 5, desplazamos 5 a la derecha. Insertamos 2 en la posición vacía.
  <br>Resultado: [2, 5 | 4, 6, 1, 3]
  <br>Paso 2: [2, 5 | 4, 6, 1, 3]
  <br>La sublista ordenada es [2, 5]. Tomamos 4.
  <br>Comparamos 4 con 5. 4 < 5, desplazamos 5.
  <br>Comparamos 4 con 2. 4 > 2, no desplazamos 2. Insertamos 4 después de 2.
  <br>Resultado: [2, 4, 5 | 6, 1, 3]
  <br>Paso 3: [2, 4, 5 | 6, 1, 3]
  <br>La sublista ordenada es [2, 4, 5]. Tomamos 6.
  <br>Comparamos 6 con 5. 6 > 5, no desplazamos 5. Insertamos 6 después de 5.
  <br>Resultado: [2, 4, 5, 6 | 1, 3]
  <br>Paso 4: [2, 4, 5, 6 | 1, 3]
  <br>La sublista ordenada es [2, 4, 5, 6]. Tomamos 1.
  <br>Comparamos 1 con 6. 1 < 6, desplazamos 6.
  <br>Comparamos 1 con 5. 1 < 5, desplazamos 5.
  <br>Comparamos 1 con 4. 1 < 4, desplazamos 4.
  <br>Comparamos 1 con 2. 1 < 2, desplazamos 2.
  <br>Llegamos al inicio. Insertamos 1 al principio.
  <br>Resultado: [1, 2, 4, 5, 6 | 3]
  <br>Paso 5: [1, 2, 4, 5, 6 | 3]
  <br>La sublista ordenada es [1, 2, 4, 5, 6]. Tomamos 3.
  <br>Comparamos 3 con 6. 3 < 6, desplazamos 6.
  <br>Comparamos 3 con 5. 3 < 5, desplazamos 5.
  <br>Comparamos 3 con 4. 3 < 4, desplazamos 4.
  <br>Comparamos 3 con 2. 3 > 2, no desplazamos 2. Insertamos 3 después de 2.
  <br>Resultado: [1, 2, 3, 4, 5, 6 | ]
  <br>El array está ahora ordenado.

## Ejercicio 76. Calcule la complejidad asintótica temporal para el peor caso del método de inserción directa.
<br>La complejidad temporal del método de inserción directa depende del estado inicial del array.
<br>Peor Caso:
<br>El peor caso ocurre cuando el array está ordenado en orden inverso. Por ejemplo: [6, 5, 4, 3, 2, 1].
- Para insertar el segundo elemento (5), se necesita 1 comparación y 1 desplazamiento.
- Para insertar el tercer elemento (4), se necesitan 2 comparaciones y 2 desplazamientos.
- Para insertar el n-ésimo elemento, se necesitan n-1 comparaciones y n-1 desplazamientos.

<br>El número total de operaciones (comparaciones y desplazamientos) es aproximadamente la suma de los primeros n-1 enteros:
<br>1 + 2 + 3 + ... + (n-1) = (n-1) * n / 2
<br>Esta suma es del orden de n^2. Por lo tanto, la complejidad asintótica temporal para el peor caso del método de inserción directa es O(n^2).

## Ejercicio 77. ¿Cuándo se usa el método de inserción directa? Justifique la respuesta.
<br>El método de inserción directa se usa principalmente en las siguientes situaciones:
- Conjuntos de datos pequeños: Para listas con pocos elementos (por ejemplo, n < 15 o n < 20), la sobrecarga de algoritmos más complejos como Mergesort o Quicksort puede hacer que la inserción directa sea más rápida en la práctica, a pesar de su complejidad teórica O(n^2). Su simplicidad de implementación y bajo coste constante son ventajosos aquí.
- Datos casi ordenados: Si la lista ya está parcial o casi ordenada, la inserción directa es muy eficiente. En el mejor caso (lista ya ordenada), cada nuevo elemento solo necesita ser comparado con el último elemento de la parte ordenada, resultando en una complejidad O(n).
- Como parte de algoritmos híbridos: Algoritmos más sofisticados como Timsort (usado en Python y Java para objetos) o Introsort utilizan la inserción directa para ordenar subproblemas pequeños (cuando la recursión de algoritmos como Quicksort o Mergesort alcanza un tamaño de subarray pequeño) porque es más eficiente en esos casos.
- Ordenación en línea (Online sorting): Cuando los elementos llegan uno por uno y se necesita mantener la lista ordenada en todo momento, la inserción directa puede ser útil, ya que puede insertar fácilmente un nuevo elemento en una lista ya ordenada.
- Cuando la simplicidad y la estabilidad son importantes: Es fácil de implementar y es un algoritmo de ordenación estable (mantiene el orden relativo de elementos con claves iguales).

<br>Justificación: Su rendimiento cuadrático lo hace inadecuado para grandes conjuntos de datos desordenados, pero su eficiencia en datos pequeños o casi ordenados, su simplicidad y estabilidad lo hacen útil en nichos específicos y como componente de algoritmos más avanzados.

## Ejercicio 78. Explique el código del algoritmo de inserción directa propor cionado por el libro que aparece en la bibliografía básica de la asignatura.

# 12.4.2. Mergesort
## Ejercicio 79. Explique apoyándose en un ejemplo cómo funciona el método mergesort. ¿A quién se atribuye la invención del método?
- Explicación:
  <br>Mergesort es un algoritmo de ordenación eficiente basado en la técnica "Divide y Vencerás" (Divide and Conquer). Su funcionamiento se basa en tres pasos principales:
  <br>Dividir: Si la lista tiene más de un elemento, se divide recursivamente en dos sublistas de tamaño aproximadamente igual hasta que se obtienen sublistas de tamaño 1 (que, por definición, ya están ordenadas).
  <br>Vencer (Conquer): Se ordenan recursivamente las dos sublistas creadas en el paso anterior. (El caso base de la recursión es una lista de tamaño 1).
  <br>Combinar (Merge): Se mezclan (fusionan) las dos sublistas ya ordenadas para obtener una única lista ordenada. Este paso es crucial y se realiza comparando los primeros elementos de ambas sublistas y eligiendo el menor para añadirlo a la lista combinada, repitiendo el proceso hasta que una sublista se vacía, y luego añadiendo los elementos restantes de la otra sublista.
- Ejemplo:
  <br>Consideremos el array A = [5, 2, 4, 6, 1, 3]
  <br>Dividir:
  <br>[5, 2, 4, 6, 1, 3] -> Divide en [5, 2, 4] y [6, 1, 3]
  <br>[5, 2, 4] -> Divide en [5, 2] y [4]
  <br>[5, 2] -> Divide en [5] y [2] (Caso base)
  <br>[4] (Caso base)
  <br>[6, 1, 3] -> Divide en [6, 1] y [3]
  <br>[6, 1] -> Divide en [6] y [1] (Caso base)
  <br>[3] (Caso base)
  <br>Vencer y Combinar (Merge):
  <br>Merge [5] y [2] -> [2, 5]
  <br>Merge [2, 5] y [4] -> Compara 2 y 4 (toma 2), compara 5 y 4 (toma 4), toma 5 -> [2, 4, 5]
  <br>Merge [6] y [1] -> [1, 6]
  <br>Merge [1, 6] y [3] -> Compara 1 y 3 (toma 1), compara 6 y 3 (toma 3), toma 6 -> [1, 3, 6]
  <br>Merge [2, 4, 5] y [1, 3, 6] ->
  <br>Compara 2 y 1 (toma 1) -> [1]
  <br>Compara 2 y 3 (toma 2) -> [1, 2]
  <br>Compara 4 y 3 (toma 3) -> [1, 2, 3]
  <br>Compara 4 y 6 (toma 4) -> [1, 2, 3, 4]
  <br>Compara 5 y 6 (toma 5) -> [1, 2, 3, 4, 5]
  <br>Toma 6 (se acabó la otra lista) -> [1, 2, 3, 4, 5, 6]
  <br>El array final ordenado es [1, 2, 3, 4, 5, 6].
- Invención:
  <br>La invención del algoritmo Mergesort se atribuye a John von Neumann en 1945.

## Ejercicio 80. Calcule la complejidad asintótica temporal para el peor caso del método mergesort.
<br>La complejidad temporal de Mergesort se puede analizar utilizando una relación de recurrencia.
- Dividir: Dividir la lista en dos mitades toma tiempo constante, O(1), o tiempo lineal O(n) si se crean nuevas estructuras de datos, pero la división conceptual es O(1). El cálculo del punto medio es O(1).
- Vencer: Se resuelven recursivamente dos subproblemas de tamaño n/2. Esto contribuye con 2 * T(n/2) a la complejidad.
- Combinar: La fusión (merge) de dos sublistas ordenadas de tamaño n/2 cada una para formar una lista ordenada de tamaño n requiere comparar cada elemento como máximo una vez. Se necesita recorrer ambas sublistas, lo que toma tiempo lineal, O(n).

<br>La relación de recurrencia es:
<br>T(n) = 2 * T(n/2) + O(n)
<br>Con el caso base T(1) = O(1).
<br>Esta recurrencia se puede resolver usando el Teorema Maestro o expandiéndola:
- Nivel 0: O(n) (costo de merge en el nivel superior)
- Nivel 1: 2 * O(n/2) = O(n) (costo de merge en dos subproblemas)
- Nivel 2: 4 * O(n/4) = O(n) (costo de merge en cuatro subproblemas)
- Nivel k: 2^k * O(n / 2^k) = O(n)

<br>El número de niveles de recursión (la profundidad del árbol de recursión) es log2(n). Como en cada nivel el costo total de la fusión es O(n), la complejidad total es:
<br>(Número de niveles) * (Costo por nivel) = log2(n) * O(n) = O(n log n)
<br>Esta complejidad O(n log n) se mantiene para el peor caso, el mejor caso y el caso promedio, ya que la división y la fusión siempre toman el mismo tiempo relativo independientemente del orden inicial de los datos.

## Ejercicio 81. Explique el código del algoritmo mergesort proporcionado por el libro que aparece en la bibliografía básica de la asignatura

# 12.4.3. Timsort
## Ejercicio 82. Realice los siguientes apartados sobre el algoritmo timsort:
### Explique qué es un run.
<br>En Timsort, un "run" (corrida o tramo) es una subsecuencia contigua dentro del array de entrada que ya está ordenada, ya sea en orden no decreciente (ascendente) o estrictamente decreciente. Timsort busca estos "runs naturales" al inicio. Si encuentra un run estrictamente decreciente, lo invierte para que quede en orden no decreciente.

### Explique qué es el minrun.
<br>El "minrun" es un tamaño mínimo establecido para los runs. Después de identificar los runs naturales en el array, si un run es más corto que el minrun, Timsort lo extiende utilizando Inserción Binaria (una variante de la inserción directa que usa búsqueda binaria para encontrar la posición de inserción) hasta que alcance el tamaño minrun o hasta que se agoten los elementos del array.
<br>El objetivo del minrun es asegurar que los runs tengan un tamaño razonable para que el proceso de fusión posterior sea más eficiente. Un minrun demasiado pequeño crearía demasiados runs, y uno demasiado grande haría que la fase inicial de creación/extensión de runs sea costosa. El valor de minrun se calcula dinámicamente basándose en el tamaño total del array (N). Se elige de tal manera que N / minrun sea cercano a una potencia de 2 (o ligeramente menor), lo cual optimiza la estrategia de fusión posterior. Típicamente, minrun está en el rango de 32 a 65.

### Explique a partir de un ejemplo cómo funciona el algoritmo de inserción binaria.
<br>La inserción binaria es una optimización de la inserción directa. En lugar de buscar linealmente (hacia atrás) la posición correcta para insertar un elemento en la parte ya ordenada, utiliza la búsqueda binaria.
- Ejemplo:
  <br>Supongamos que tenemos la parte ordenada [2, 5, 7, 10, 13] y queremos insertar el elemento 8.
  <br>Búsqueda Binaria: Buscamos la posición donde 8 debería ir en [2, 5, 7, 10, 13].
  <br>Rango inicial: [0, 4] (índices). Medio = (0+4)/2 = 2. Elemento en índice 2 es 7. Como 8 > 7, buscamos en la mitad derecha.
  <br>Nuevo rango: [3, 4]. Medio = (3+4)/2 = 3 (redondeando hacia abajo). Elemento en índice 3 es 10. Como 8 < 10, buscamos en la mitad izquierda.
  <br>Nuevo rango: [3, 2]. El rango bajo (3) es mayor que el rango alto (2), la búsqueda termina. La posición de inserción es el índice bajo, es decir, 3.
  <br>Desplazamiento: Hemos encontrado que 8 debe insertarse en el índice 3. Desplazamos los elementos desde el índice 3 hacia la derecha:
  <br>13 se mueve a la posición 5.
  <br>10 se mueve a la posición 4.
  <br>Array temporal: [2, 5, 7, _, 10, 13]
- Inserción: Insertamos 8 en la posición 3.
- Resultado: [2, 5, 7, 8, 10, 13]

<br>La inserción binaria reduce el número de comparaciones de O(n) a O(log n) en promedio para encontrar la posición, pero el número de desplazamientos sigue siendo O(n) en el peor caso. Timsort la usa para extender runs cortos porque en esos casos (tamaño minrun), el coste del desplazamiento no es prohibitivo.

### Explique con ejemplos cómo funciona el timsort.
<br>Timsort es un algoritmo híbrido y adaptativo. Combina la inserción (binaria) y el Mergesort.
<br>Pasos Principales y Ejemplo:
<br>Consideremos el array A = [34, 10, 64, 51, 32, 21, 7, 88, 59, 2] y supongamos minrun = 4.
- Identificar/Crear Runs:
  <br>Empezamos en 34. Siguiente es 10. Es decreciente: [34, 10]. Invertimos: [10, 34]. Tamaño 2. Es < minrun (4).
  <br>Extendemos usando inserción binaria: Tomamos 64. Insertamos en [10, 34]. Queda [10, 34, 64]. Tamaño 3.
  <br>Extendemos: Tomamos 51. Insertamos en [10, 34, 64]. Búsqueda binaria: entre 34 y 64. Desplazar 64. Insertar 51. Queda [10, 34, 51, 64]. Tamaño 4 (>= minrun). Run 1: [10, 34, 51, 64].
  <br>Continuamos desde el siguiente elemento 32. Siguiente es 21. Decreciente: [32, 21]. Siguiente es 7. Decreciente: [32, 21, 7]. Invertimos: [7, 21, 32]. Tamaño 3. Es < minrun (4).
  <br>Extendemos: Tomamos 88. Insertamos en [7, 21, 32]. Queda [7, 21, 32, 88]. Tamaño 4 (>= minrun). Run 2: [7, 21, 32, 88].
  <br>Continuamos desde 59. Siguiente es 2. Decreciente: [59, 2]. Invertimos: [2, 59]. Tamaño 2. Es < minrun (4). Fin del array. Run 3: [2, 59]. (Aunque sea < minrun, si se acaba el array, se queda así).
  <br>Array ahora conceptualmente dividido en runs: [10, 34, 51, 64], [7, 21, 32, 88], [2, 59].
- Fusionar Runs (Merge):
  <br>Timsort utiliza una pila para almacenar los runs pendientes de fusionar. Intenta mantener un equilibrio en los tamaños de los runs en la pila para optimizar las fusiones. Aplica reglas para decidir cuándo fusionar runs adyacentes en la pila. Una regla común es mantener (para los tres runs superiores en la pila X, Y, Z):
  <br>len(X) > len(Y) + len(Z)
  <br>len(Y) > len(Z)
  <br>Si estas invariantes se violan, se fusionan runs. Normalmente, se fusiona Y con el menor entre X y Z.
  <br>Proceso:
  <br>Push Run 1 ([10, 34, 51, 64], len=4) a la pila. Pila: [R1(4)]
  <br>Push Run 2 ([7, 21, 32, 88], len=4) a la pila. Pila: [R1(4), R2(4)].
  <br>¿Se viola la invariante? len(R1) <= len(R2)? (4 <= 4). Sí. Fusionar R1 y R2.
  <br>Merge [10, 34, 51, 64] y [7, 21, 32, 88] -> [7, 10, 21, 32, 34, 51, 64, 88] (len=8).
  <br>Pila: [R12(8)]
  <br>Push Run 3 ([2, 59], len=2) a la pila. Pila: [R12(8), R3(2)].
  <br>¿Se viola la invariante? len(R12) <= len(R3)? (8 <= 2). No. ¿len(R3) viola algo más? No (necesitaríamos un run anterior a R12). Las invariantes se mantienen (asumiendo que solo hay estos dos runs).
  <br>Fusión Final: Al final, cuando todos los runs iniciales han sido procesados y puestos en la pila, si queda más de un run en la pila, se fusionan hasta que solo quede uno.
  <br>Fusionar R12 y R3.
  <br>Merge [7, 10, 21, 32, 34, 51, 64, 88] y [2, 59] -> [2, 7, 10, 21, 32, 34, 51, 59, 64, 88] (len=10).
  <br>Pila: [R123(10)].
- Resultado Final: El array ordenado es [2, 7, 10, 21, 32, 34, 51, 59, 64, 88].

<br>Optimización "Galloping": Durante la fusión, si se observa que consistentemente se toman muchos elementos seguidos de un mismo run, Timsort entra en modo "galopante". En lugar de comparar uno a uno, usa búsqueda binaria para determinar cuántos elementos del run "ganador" se pueden copiar en bloque antes de que un elemento del otro run pueda ser menor. Esto acelera la fusión cuando hay grandes diferencias en los rangos de valores de los runs.

### ¿Quién inventó el algoritmo?
<br>Timsort fue inventado por Tim Peters en 2002 para ser utilizado en el lenguaje de programación Python.

### ¿Qué complejidad tiene?
- Peor Caso: O(n log n). Gracias a la estrategia de fusión equilibrada, evita el caso O(n^2) de Quicksort y mantiene la eficiencia de Mergesort.
- Caso Promedio: O(n log n).
- Mejor Caso: O(n). Si el array ya está ordenado (o casi ordenado), Timsort puede detectarlo rápidamente. Identificará pocos runs (idealmente uno) y la fase de fusión será mínima o inexistente.

<br>Es un algoritmo estable y tiene buen rendimiento en una amplia gama de conjuntos de datos del mundo real que a menudo tienen cierto grado de orden preexistente.

# 12.4.4. Quicksort
## Ejercicio 83. Explique apoyándose en un ejemplo cómo funciona el método quicksort. ¿Quién inventó el método?
- Explicación:
  <br>Quicksort es otro algoritmo de ordenación eficiente que utiliza la técnica "Divide y Vencerás". Su estrategia es:
  <br>Elegir un Pivote: Seleccionar un elemento del array como "pivote". La elección del pivote puede variar (primer elemento, último, elemento central, aleatorio, mediana de tres).
  <br>Particionar: Reorganizar el array de tal manera que todos los elementos menores que el pivote queden a su izquierda, y todos los elementos mayores queden a su derecha. Los elementos iguales al pivote pueden quedar en cualquiera de los lados, o en medio, dependiendo de la implementación de la partición. Después de la partición, el pivote se encuentra en su posición final ordenada.
  <br>Recursión (Vencer): Aplicar recursivamente Quicksort a los dos sub-arrays: el que contiene los elementos menores que el pivote y el que contiene los elementos mayores que el pivote.
  <br>Caso Base: La recursión termina cuando un sub-array tiene cero o un elemento, ya que estos ya están ordenados.
- Ejemplo:
  <br>Consideremos el array A = [7, 2, 1, 6, 8, 5, 3, 4] y usemos el último elemento como pivote.
  <br>Llamada inicial: Quicksort(A, 0, 7)
  <br>Pivote: A[7] = 4.
  <br>Partición (esquema de Lomuto):
  <br>Iteramos de j=0 a 6. i empieza en -1.
  <br>j=0, A[0]=7. 7 > 4. No swap.
  <br>j=1, A[1]=2. 2 < 4. i pasa a 0. Swap A[0] y A[1]. Array: [2, 7, 1, 6, 8, 5, 3, 4].
  <br>j=2, A[2]=1. 1 < 4. i pasa a 1. Swap A[1] y A[2]. Array: [2, 1, 7, 6, 8, 5, 3, 4].
  <br>j=3, A[3]=6. 6 > 4. No swap.
  <br>j=4, A[4]=8. 8 > 4. No swap.
  <br>j=5, A[5]=5. 5 > 4. No swap.
  <br>j=6, A[6]=3. 3 < 4. i pasa a 2. Swap A[2] y A[6]. Array: [2, 1, 3, 6, 8, 5, 7, 4].
  <br>Fin del bucle. Swap A[i+1] (A[3]=6) con el pivote A[7]=4.
  <br>Array después de partición: [2, 1, 3, 4, 8, 5, 7, 6]. El pivote 4 está en el índice 3.
  <br>Llamadas Recursivas:
  <br>Quicksort(A, 0, 2) para [2, 1, 3]
  <br>Quicksort(A, 4, 7) para [8, 5, 7, 6]
  <br>Llamada Quicksort(A, 0, 2): [2, 1, 3]
  <br>Pivote: A[2] = 3.
  <br>Partición: [2, 1] son menores. Queda [2, 1, 3]. Pivote 3 en índice 2.
  <br>Llamadas: Quicksort(A, 0, 1) para [2, 1], Quicksort(A, 3, 2) (caso base, no hace nada).
  <br>Llamada Quicksort(A, 0, 1): [2, 1]
  <br>Pivote: A[1] = 1.
  <br>Partición: 1 es menor que 2. Queda [1, 2]. Pivote 1 en índice 0.
  <br>Llamadas: Quicksort(A, 0, -1) (base), Quicksort(A, 1, 1) para [2] (base).
  <br>Llamada Quicksort(A, 4, 7): [8, 5, 7, 6]
  <br>Pivote: A[7] = 6.
  <br>Partición: 5 es menor. Queda [5, 8, 7, 6]. Pivote 6 en índice 1 (relativo al subarray, índice 5 absoluto). Array: [..., 5, 6, 7, 8]
  <br>Llamadas: Quicksort(A, 4, 4) para [5] (base), Quicksort(A, 6, 7) para [7, 8].
  <br>Llamada Quicksort(A, 6, 7): [7, 8]
  <br>Pivote: A[7] = 8.
  <br>Partición: 7 es menor. Queda [7, 8]. Pivote 8 en índice 1 (relativo, 7 absoluto).
  <br>Llamadas: Quicksort(A, 6, 6) para [7] (base), Quicksort(A, 8, 7) (base).
  <br>Combinando los resultados (aunque Quicksort opera in-place, no combina explícitamente):
  <br>El array final es [1, 2, 3, 4, 5, 6, 7, 8].
- Invención:
  <br>Quicksort fue inventado por C.A.R. Hoare (Tony Hoare) en 1959.

## Ejercicio 84. Explique el código del algoritmo quicksort proporcionado por el libro que aparece en la bibliografía básica de la asignatura.

## Ejercicio 85. Calcule las siguientes complejidades del método quicksort:
### Caso mejor.
- Ocurrencia: El mejor caso ocurre cuando la rutina de partición siempre divide el array en dos sub-arrays de tamaño casi igual (n/2). Esto sucede si el pivote elegido es siempre la mediana del subarray.
- Análisis: La relación de recurrencia es T(n) = 2T(n/2) + O(n), donde O(n) es el coste de la partición.
- Complejidad: O(n log n). Similar a Mergesort.

### Caso peor.
- Ocurrencia: El peor caso ocurre cuando la rutina de partición produce consistentemente una división muy desequilibrada, por ejemplo, un sub-array con 0 elementos y otro con n-1 elementos. Esto puede pasar si el pivote elegido es siempre el elemento más pequeño o el más grande del subarray. Un ejemplo clásico es cuando el array ya está ordenado (o inversamente ordenado) y se elige siempre el primer o el último elemento como pivote.
- Análisis: La relación de recurrencia es T(n) = T(n-1) + T(0) + O(n), que simplifica a T(n) = T(n-1) + O(n).
- Complejidad: O(n^2). La suma es n + (n-1) + (n-2) + ... + 1, que es O(n^2).

### Caso promedio.
- Ocurrencia: Sucede cuando las divisiones son razonablemente equilibradas en promedio, aunque algunas puedan ser malas. Estrategias como elegir un pivote aleatorio o la "mediana de tres" ayudan a evitar el peor caso y acercarse al comportamiento promedio.
- Análisis: Matemáticamente más complejo de derivar, pero se puede demostrar que, incluso con una mezcla de buenas y malas particiones, el comportamiento general es logarítmico. La recurrencia promedio es más difícil de escribir de forma simple, pero el resultado es:
- Complejidad: O(n log n). En la práctica, Quicksort suele ser más rápido que otros algoritmos O(n log n) como Mergesort o Heapsort debido a constantes inferiores en las operaciones internas (buena localidad de caché, operaciones in-place).

## Ejercicio 86. ¿Qué significa que el quicksort no es estable?
<br>Un algoritmo de ordenación se considera estable si preserva el orden relativo original de los elementos que tienen claves iguales. Es decir, si dos elementos A y B tienen la misma clave de ordenación (clave(A) == clave(B)) y A aparece antes que B en la secuencia original, entonces A también aparecerá antes que B en la secuencia ordenada.
<br>Quicksort no es estable porque la operación de partición puede cambiar el orden relativo de elementos con claves iguales. Durante la partición (especialmente en esquemas como el de Lomuto o Hoare), un elemento puede ser intercambiado con otro elemento que está mucho más adelante o atrás en el array. Si un elemento A con clave k se intercambia y "salta" por encima de otro elemento B con la misma clave k, su orden relativo original se pierde.
- Ejemplo:
  <br>Consideremos el array de pares (valor, letra) a ordenar por valor: [(3, 'a'), (2, 'b'), (3, 'c'), (1, 'd')]
  <br>Usamos Quicksort con el último elemento (1, 'd') como pivote.
  <br>Partición: El pivote 1 es el menor. Los demás son mayores. La partición podría resultar en algo como (dependiendo de los swaps exactos): [(1, 'd'), (2, 'b'), (3, 'c'), (3, 'a')].
  <br>Observa que (3, 'a') y (3, 'c') tienen la misma clave (3). En el array original, (3, 'a') venía antes que (3, 'c'). En el resultado de la partición (y potencialmente en el resultado final), (3, 'c') viene antes que (3, 'a'). Se ha perdido el orden relativo original.
  <br>Por esta razón, Quicksort no es adecuado cuando se necesita mantener el orden original de elementos equivalentes. Mergesort y Timsort, por otro lado, sí son estables.

# 12.4.5. Ejemplos de ejecución de algoritmos de ordenación
## Ejercicio 87. Para cada uno de los siguientes arrays, muestre su contenido a través de los diferentes pasos para los algoritmos de inserción directa, Mergesort y Quicksort.
### 1. (5, 3, 4, 8, 1, 9).
- a) Inserción Directa:
  <br>Inicial: [5 | 3, 4, 8, 1, 9]
  <br>Inserta 3: [3, 5 | 4, 8, 1, 9]
  <br>Inserta 4: [3, 4, 5 | 8, 1, 9]
  <br>Inserta 8: [3, 4, 5, 8 | 1, 9]
  <br>Inserta 1: [1, 3, 4, 5, 8 | 9]
  <br>Inserta 9: [1, 3, 4, 5, 8, 9 | ]
  <br>Final: [1, 3, 4, 5, 8, 9]
- b) Mergesort:
  <br>Divide: [5, 3, 4] y [8, 1, 9]
  <br>Divide: [5, 3] y [4] | [8, 1] y [9]
  <br>Divide: [5] y [3] | [4] | [8] y [1] | [9] (Casos base)
  <br>Merge: [3, 5] | [4] | [1, 8] | [9]
  <br>Merge: [3, 4, 5] | [1, 8, 9]
  <br>Merge: [1, 3, 4, 5, 8, 9]
  <br>Final: [1, 3, 4, 5, 8, 9]
- c) Quicksort (Pivote = último elemento):
  <br>Q([5, 3, 4, 8, 1, 9], 0, 5) Pivote=9. Partición: [5, 3, 4, 8, 1, 9] (9 ya es el mayor). Índice pivote=5.
  <br>Llamada Q([5, 3, 4, 8, 1], 0, 4) Pivote=1. Partición: [1, 3, 4, 8, 5] -> [1, 5, 4, 8, 3] -> [1, 8, 4, 5, 3] -> [1, 3, 4, 8, 5] (swap 1 y 5 -> swap 3 y 3 -> swap 4 y 4 -> swap 8 y 8 -> swap 5 y 1 ??? Check partition logic)
  <br>Let's re-partition [5, 3, 4, 8, 1] with pivot 1. i=-1.
  <br>j=0, A[0]=5 > 1.
  <br>j=1, A[1]=3 > 1.
  <br>j=2, A[2]=4 > 1.
  <br>j=3, A[3]=8 > 1.
  <br>Final swap: A[i+1] (A[0]) with A[4] (pivot 1). Array: [1, 3, 4, 8, 5]. Pivote en índice 0.
  <br>Llamada Q([], -1, -1) (izquierda, base)
  <br>Llamada Q([3, 4, 8, 5], 1, 4) Pivote=5. i=0.
  <br>j=1, A[1]=3 <= 5. i=1. swap A[1],A[1]. [3, 4, 8, 5]
  <br>j=2, A[2]=4 <= 5. i=2. swap A[2],A[2]. [3, 4, 8, 5]
  <br>j=3, A[3]=8 > 5.
  <br>Final swap: A[i+1] (A[3]=8) with A[4] (pivot 5). Array: [3, 4, 5, 8]. Pivote en índice 2 (absoluto 3).
  <br>Llamada Q([3, 4], 1, 1) Pivote=4. -> [3, 4]. Pivote en 1 (abs 2).
  <br>Llamada Q([3], 1, 0) (base)
  <br>Llamada Q([], 2, 1) (base)
  <br>Llamada Q([8], 3, 3) (base)
- Final: [1, 3, 4, 5, 8, 9] (El orden emerge de las llamadas recursivas)

### 2. (1, 5, 2, 4, 7, 12, 10, 9).
- a) Inserción Directa:
  <br>Inicial: [1 | 5, 2, 4, 7, 12, 10, 9]
  <br>Inserta 5: [1, 5 | 2, 4, 7, 12, 10, 9]
  <br>Inserta 2: [1, 2, 5 | 4, 7, 12, 10, 9]
  <br>Inserta 4: [1, 2, 4, 5 | 7, 12, 10, 9]
  <br>Inserta 7: [1, 2, 4, 5, 7 | 12, 10, 9]
  <br>Inserta 12: [1, 2, 4, 5, 7, 12 | 10, 9]
  <br>Inserta 10: [1, 2, 4, 5, 7, 10, 12 | 9]
  <br>Inserta 9: [1, 2, 4, 5, 7, 9, 10, 12 | ]
  <br>Final: [1, 2, 4, 5, 7, 9, 10, 12]
- b) Mergesort:
  <br>Divide: [1, 5, 2, 4] y [7, 12, 10, 9]
  <br>Divide: [1, 5] y [2, 4] | [7, 12] y [10, 9]
  <br>Divide: [1] [5] | [2] [4] | [7] [12] | [10] [9] (Base)
  <br>Merge: [1, 5] | [2, 4] | [7, 12] | [9, 10]
  <br>Merge: [1, 2, 4, 5] | [7, 9, 10, 12]
  <br>Merge: [1, 2, 4, 5, 7, 9, 10, 12]
  <br>Final: [1, 2, 4, 5, 7, 9, 10, 12]
- c) Quicksort:
  <br>Q([1, 5, 2, 4, 7, 12, 10, 9], 0, 7) Pivote=9. Partición: [1, 5, 2, 4, 7, 9, 10, 12]. Pivote en 5.
  <br>Q([1, 5, 2, 4, 7], 0, 4) Pivote=7. Partición: [1, 5, 2, 4, 7]. Pivote en 4.
  <br>Q([1, 5, 2, 4], 0, 3) Pivote=4. Partición: [1, 2, 4, 5]. Pivote en 2.
  <br>Q([1, 2], 0, 1) Pivote=2. Partición: [1, 2]. Pivote en 1.
  <br>Q([1], 0, 0) (base)
  <br>Q([5], 3, 3) (base)
  <br>Q([10, 12], 6, 7) Pivote=12. Partición: [10, 12]. Pivote en 7.
  <br>Q([10], 6, 6) (base)
- Final: [1, 2, 4, 5, 7, 9, 10, 12]

### 3. (1, 4, 7, 9, 2, 5, 8, 10).
- a) Inserción Directa:
  <br>Inicial: [1 | 4, 7, 9, 2, 5, 8, 10]
  <br>Inserta 4: [1, 4 | 7, 9, 2, 5, 8, 10]
  <br>Inserta 7: [1, 4, 7 | 9, 2, 5, 8, 10]
  <br>Inserta 9: [1, 4, 7, 9 | 2, 5, 8, 10]
  <br>Inserta 2: [1, 2, 4, 7, 9 | 5, 8, 10]
  <br>Inserta 5: [1, 2, 4, 5, 7, 9 | 8, 10]
  <br>Inserta 8: [1, 2, 4, 5, 7, 8, 9 | 10]
  <br>Inserta 10: [1, 2, 4, 5, 7, 8, 9, 10 | ]
  <br>Final: [1, 2, 4, 5, 7, 8, 9, 10] (Notar que estaba casi ordenado, inserción es eficiente aquí).
- b) Mergesort:
  <br>Divide: [1, 4, 7, 9] y [2, 5, 8, 10]
  <br>Divide: [1, 4] y [7, 9] | [2, 5] y [8, 10]
  <br>Divide: [1] [4] | [7] [9] | [2] [5] | [8] [10] (Base)
  <br>Merge: [1, 4] | [7, 9] | [2, 5] | [8, 10]
  <br>Merge: [1, 4, 7, 9] | [2, 5, 8, 10]
  <br>Merge: [1, 2, 4, 5, 7, 8, 9, 10]
  <br>Final: [1, 2, 4, 5, 7, 8, 9, 10]
- c) Quicksort:
  <br>Q([1, 4, 7, 9, 2, 5, 8, 10], 0, 7) Pivote=10. Partición: [1, 4, 7, 9, 2, 5, 8, 10]. Pivote en 7.
  <br>Q([1, 4, 7, 9, 2, 5, 8], 0, 6) Pivote=8. Partición: [1, 4, 7, 2, 5, 8, 9]. Pivote en 5.
  <br>Q([1, 4, 7, 2, 5], 0, 4) Pivote=5. Partición: [1, 4, 2, 5, 7]. Pivote en 3.
  <br>Q([1, 4, 2], 0, 2) Pivote=2. Partición: [1, 2, 4]. Pivote en 1.
  <br>Q([1], 0, 0) (base)
  <br>Q([4], 2, 2) (base)
  <br>Q([7], 4, 4) (base)
  <br>Q([9], 6, 6) (base)
- Final: [1, 2, 4, 5, 7, 8, 9, 10]

# 12.4.6. Límite inferior en la complejidad de la ordenación
## Ejercicio 88. Se pide calcular el límite inferior de la complejidad de los algoritmos de ordenación basados en comparaciones.
<br>Para calcular el límite inferior teórico del número de comparaciones necesarias para ordenar n elementos distintos utilizando únicamente comparaciones entre ellos, podemos usar el modelo del árbol de decisión.
- Árbol de Decisión: Cualquier algoritmo de ordenación basado en comparaciones puede representarse como un árbol de decisión binario.
  <br>Cada nodo interno representa una comparación entre dos elementos (por ejemplo, a[i] < a[j]).
  <br>Cada rama que sale de un nodo representa el resultado de esa comparación (verdadero o falso, o <, =, >).
  <br>Cada nodo hoja representa una permutación específica de los elementos de entrada, correspondiente al orden final ordenado.
- Número de Hojas: Para un array de entrada con n elementos distintos, hay n! (n factorial) posibles permutaciones iniciales. El algoritmo de ordenación debe ser capaz de determinar cuál de estas n! permutaciones corresponde al orden correcto. Por lo tanto, el árbol de decisión debe tener al menos n! hojas, una para cada posible resultado ordenado.
- Altura del Árbol: Un árbol binario con L hojas debe tener una altura h de al menos log2(L). La altura del árbol representa el número máximo de comparaciones realizadas en el peor caso por el algoritmo para llegar a una hoja (un resultado ordenado).
- Cálculo del Límite Inferior:
  <br>Número de hojas necesarias: L = n!
  <br>Altura mínima del árbol: h >= log2(n!)
  <br>Por lo tanto, la complejidad en el peor caso de cualquier algoritmo de ordenación basado en comparaciones debe ser al menos Ω(log2(n!)).
- Aproximación de Stirling: Para estimar log2(n!), podemos usar la aproximación de Stirling para n!, que dice que n! ≈ sqrt(2 * pi * n) * (n / e)^n. Tomando logaritmos:
  <br>log2(n!) ≈ log2(sqrt(2 * pi * n)) + n * log2(n / e)
  <br>log2(n!) ≈ (1/2)log2(2*pi*n) + n * (log2(n) - log2(e))
  <br>El término dominante es n * log2(n).
- Resultado: log2(n!) es Ω(n log n).
- Conclusión: El límite inferior de la complejidad temporal para el peor caso de cualquier algoritmo de ordenación basado únicamente en comparaciones es Ω(n log n). Esto significa que ningún algoritmo de este tipo puede ser más rápido que n log n en el peor caso. Algoritmos como Mergesort y Heapsort alcanzan este límite inferior y se consideran asintóticamente óptimos.

# 12.4.7. Los métodos sort en Java
## Ejercicio 89. Explique qué algoritmos de ordenación utiliza Java y en qué casos.
<br>Las bibliotecas estándar de Java (java.util.Arrays y java.util.Collections) utilizan diferentes algoritmos de ordenación según el tipo de datos y el método llamado:
<br>Arrays.sort() para Tipos Primitivos (int, float, double, char, byte, short, long):
<br>Utiliza una implementación de Dual-Pivot Quicksort. Esta variante de Quicksort, introducida por Vladimir Yaroslavskiy, generalmente ofrece un mejor rendimiento que el Quicksort tradicional al usar dos pivotes para dividir el array en tres partes en lugar de dos.
<br>Justificación: Para tipos primitivos, la estabilidad no suele ser un requisito, y Quicksort (especialmente Dual-Pivot) es muy rápido en promedio y tiene buena localidad de caché. Aunque su peor caso es O(n^2), las implementaciones modernas tienen salvaguardas para evitarlo en la práctica (como cambiar a Heapsort si la recursión es muy profunda). Es una ordenación in-place (no requiere memoria adicional significativa).
<br>Arrays.sort() para Arrays de Objetos (Object[]) y Collections.sort() para Listas (List<T>):
<br>Utiliza Timsort. Timsort es un algoritmo híbrido derivado de Mergesort e Insertion Sort (específicamente, Inserción Binaria).
<br>Justificación:
<br>Estabilidad: Timsort es un algoritmo estable, lo cual es crucial al ordenar objetos donde elementos con claves de ordenación iguales deben mantener su orden relativo.
<br>Rendimiento Adaptativo: Detecta y aprovecha los "runs" (subsecuencias ya ordenadas) presentes en muchos datos del mundo real, logrando un rendimiento cercano a O(n) en datos casi ordenados.
<br>Complejidad Garantizada: Tiene una complejidad garantizada de O(n log n) en el peor caso, a diferencia de Quicksort estándar.
<br>Eficiencia: Combina la eficiencia de Mergesort en grandes conjuntos de datos con la eficiencia de Insertion Sort en conjuntos pequeños (los runs y las extensiones de minrun).
- Resumen:
  <br>Primitivos (Arrays.sort): Dual-Pivot Quicksort (rápido en promedio, in-place, no estable).
  <br>Objetos (Arrays.sort, Collections.sort): Timsort (estable, O(n log n) garantizado, adaptativo, buen rendimiento general, requiere memoria extra O(k) donde k es el número de runs o O(n/2) en el peor caso para la fusión).

## Ejercicio 90. Escriba, compile y ejecute el siguiente código y explíquelo:
```
   import java.util.Arrays;
   import java.util.Collections;
   import java.util.List;
   public class CompararEnteros{
        public static void main(String[] args)
   {
      List<Integer> lista = Arrays.asList(23,-2, 14, 3, 12, 8);
      Collections.sort(lista);
      System.out.println(lista);
      }
   }
 ```
- Compilación y Ejecución:
  <br>Guardar el código como CompararEnteros.java.
  <br>Compilar: javac CompararEnteros.java
  <br>Ejecutar: java CompararEnteros
- Salida Esperada:
  [-2, 3, 8, 12, 14, 23]
- Explicación del Código:
  <br>import ...;: Importa las clases necesarias:
  <br>Arrays: Para usar el método asList.
  <br>Collections: Para usar el método sort.
  <br>List: Para usar la interfaz List.
  <br>List<Integer> lista = Arrays.asList(23, -2, 14, 3, 12, 8);:
  <br>Crea una lista (List) de objetos Integer.
  <br>Arrays.asList() toma una secuencia de elementos (o un array) y devuelve una vista de lista de tamaño fijo respaldada por un array. Los números primitivos int se convierten automáticamente a objetos Integer (autoboxing).
  <br>La lista lista inicialmente contiene [23, -2, 14, 3, 12, 8].
  <br>Collections.sort(lista);:
  <br>Este es el punto clave. Llama al método estático sort de la clase Collections para ordenar la lista.
  <br>Como los elementos de la lista son Integer, y la clase Integer implementa la interfaz Comparable<Integer>, el método sort utiliza el orden natural de los enteros (orden numérico ascendente).
  <br>Internamente, para listas de objetos, Collections.sort() utiliza el algoritmo Timsort.
  <br>System.out.println(lista);:
  <br>Imprime la lista en la consola después de haber sido ordenada. El método toString() de la lista se encarga de formatear la salida.

## Ejercicio 91. Escriba el siguiente programa y ejecútelo:
```
   import java.time.LocalDate;
   import java.time.Period;
   import java.time.format.DateTimeFormatter;
   public class Persona implements Comparable<Persona>{
         private String nombre;
         private LocalDate fechaNacimiento;
         public String getNombre() {
            return nombre;
         }
         public int compareTo(Persona persona){
         return this.nombre.compareTo(persona.nombre);
      }
      @Override
      public String toString() {
         DateTimeFormatter formatter = DateTimeFormatter.
         ofPattern("dd/MM/yyyy");
         return "Persona{" +
         "nombre = " + getNombre() +
         "fecha nacimiento = " + fechaNacimiento.format(
         formatter);
      }
      public Persona(String nombre, int dia, int mes, int anno) {
         this.nombre = nombre;
         this.fechaNacimiento=LocalDate.of(anno,mes,dia);
      }
      publicLocalDategetFechaNacimiento(){
         returnfechaNacimiento;
      }
      publicintcalcularEdad(){
         returnPeriod.between(fechaNacimiento,LocalDate.now())
         .getYears();
      }
   }
   importjava.util.Arrays;
   importjava.util.Collections;
   importjava.util.List;
   publicclassPrincipal{
      publicstaticvoid main(String[]args)
      {
         Personajuan= newPersona("JuanGarcíaRodríguez",13,
         2,1980);
         Personapepe= newPersona("JoséLópezPérez",4,10,
         1950);
         Personamaria=newPersona("MaríaSánchezMartínez",
         5,7,2004);
         List<Persona>lista=Arrays.asList(juan,pepe,maria);
         Collections.sort(lista);
         System.out.println("Ordenaciónpornombres:"+lista);
      }
   }
  ```

## Ejercicio92.Complemente el ejercicio 91 con el código de la siguiente clase:
```   
importjava.util.Comparator;
      publicclassComparadorEdadesimplementsComparator<Persona>{
         publicintcompare(Personapersona1,Personapersona2){
         returnpersona1.calcularEdad()-persona2.calcularEdad
         ();
      }
   }
   YmodifiquelaclasePrincipal.javaparaquequedetalycomosemuestra
   acontinuación:
   import java.util.Arrays;
   import java.util.Collections;
   import java.util.List;
   public class Principal{
      public static void main(String[] args)
      {
         Persona juan = new Persona("Juan García Rodríguez", 13,
         2, 1980);
         Persona pepe = new Persona("José López Pérez", 4, 10,
         1950);
         Persona maria = new Persona("María Sánchez Martínez",
         5, 7, 2004);
         List<Persona> lista = Arrays.asList(juan, pepe, maria);
         Collections.sort(lista);
         System.out.println("Ordenación por nombres: " + lista);
         Collections.sort(lista, new ComparadorEdades());
         System.out.println("Ordenación por edades: " + lista);
      }
   }
```
   