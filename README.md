<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
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
 <h3>INFORME DE LABORATORIO</h3>
</div>
<table>
 <theader>
  <tr><th colspan="6" bgcolor="red">INFORMACIÓN BÁSICA</th></tr>
 </theader>
 <tbody>
  <tr><td>ASIGNATUA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
  <tr><td>TÍTULO DE LA PRACTICA:</td><td colspan="4">Grafos<td></tr>
  <tr><td>NÚMERO DE PRÁCTICA:</td><td>Practica de Laboratorio 08</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td></tr>
  <tr><td>FECHA DE PRESENTACIÓN:</td><td>21-Agosto-2022</td><td>HORA DE PRESENTACIÓN:</td><td colspan="3">11:30 p.m.</td></tr>
  <tr><td>INTEGRANTES:</td><td colspan="3">-Diego Ivan Pacori Anccasi<br>-Edson Joel López Quispe<br>-Oliver Alessandro Mayta Nolasco<br>-Edwin Francisco Aguilar Tancayo<br>-Jordy Emanuel Ayma Cutipa</td><td>NOTA:</td><td>...</td></tr>
  <tr><td>DOCENTE:</td><td colspan="5">Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</td></tr>
 </tbody>
</table>
<table>
 <theader>
  <tr><th>SOLUCIÓN Y RESULTADOS</th></tr>
 </theader>
 <tbody>
  <tr><td><strong>I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS:</strong><br>
  <ul>
    <ol>
        <li><h2>Implementar codigo de Grafo(Lista de Adyacencia)</h2></li>
        <h3>Se utilizaron tres clase</h3>
        La clase <em>Node</em>, <em>Grafo</em> y <em>Test</em><br>
        <img src="Grafo/img/clases.png"><br>
        Para guardar los nodos <strong>adyacentes</strong> se utilizó la estructura<br>
        <pre>ArrayList< Integer > = new ArrayList< Integer >();</pre>
        Se usa este Array para contener indices, los indices indican la posición de los <strong>Nodos</strong> respectivos, que se encuentran el Array de la clase Grafo<br>
        <pre>ArrayList< Node > = new ArrayList< Node >();</pre>
        El código que inicia la aplicación se encuentra en <em>Test</em>, para correr la aplicación se necesita dos identificar los nodos del grafo y la direccion de cada uno como se muestra en la siguiente imagen: 
        Se crea los nodos, como entrada necesita un String<br>
        <img src="Grafo/img/nodo.png"><br>
        Se conecta los nodos según corresponda,(nodo inicial, nodo final)<br>
        <img src="Grafo/img/relacion.png"><br>
        Al final se manda a imprimir el grafo, y el resultado es el siguiente:<br>
        <img src="Grafo/img/resultado.png">
        Otros resultados con letras envés de números<br>
        <img src="Grafo/img/resultado2.png">
        <li>Implementar BSF,DFS y Difkstra</li>
        <h1>BSF Y DFS</h1>
        <h2>Clase Grafo:</h2>
        <h3>Atributos:</h3>
        <img src="ejercicio3/DFSyBFS/imagenes/atributos.PNG"><br>
        <em>vertices:</em> Número de vertices del Grafo.<br>
        <em>adj:</em> Arreglo de listas, que representan la lista de adyacencia de cada vértice.
        <h3>Métodos:</h3>
        <h4> <em>mostrarMatrizAdy():</em> Este método usa el arreglo de listas de adyacencias para motrar la matriz de adyacencia.</h4>
        <h4> <em>addArista():</em> Agrega una conexión entre 2 vertices (agregandola en el arreglo de listas de adyacencia en la posición adecuada).</h4>
        <h4> <em>DFSUtil():</em> Marcar el nodo actual como visitado(en el arreglo de booleanos) y lo imprime ademas realiza la recurrencia para todos los vértices adyacentes a este vértice.</h4>
        <h4> <em>DFS():</em> Crea el arreglo de booleanos y utiliza a la funcion recursiva DFSUtil.</h4>
        <h4> <em>BFS():</em> El método crea un arreglo de booleanos(para verificar si el vértice fue recorrido), crea una cola para ir desencolado cuando el vértice se halla recorrido y por último recorre la lista de adyacencia realizando el procedimiento.  </h4>
        <img src="ejercicio3/DFSyBFS/imagenes/main.PNG"><br>
        Representa el siguiente grafo:<br>
        <img src="ejercicio3/DFSyBFS/imagenes/grafo.PNG"><br>
        <img src="ejercicio3/DFSyBFS/imagenes/resultado.PNG"><br>
        <h1>Dijkstra</h1>
        <h2>Clase Arista:</h2>
        <h3>Atributos:</h3>
        <em>inicio:</em> Vértice donde inicia la arista.<br>
        <em>destino:</em> Destino de la arista.
        <em>peso:</em> El peso de la arista.<br>
        <img src="ejercicio3/Dijkstra/imagenes/arista.PNG"><br>
        <h2>Clase Nodo:</h2>
        Esta clase nos sirve como ayuda para hacer un min-heap para realizar con mayor facilidad el algoritmo.
        <h3>Atributos:</h3>
        <em>vertex:</em> Representa el vértice.<br>
        <em>weight:</em> Representa el costo para llegar al vértice.<br>
        <img src="ejercicio3/Dijkstra/imagenes/nodo.PNG"><br>
        <h2>Clase Grafo:</h2>
        <h3>Atributos:</h3>
        <em>adjList:</em> Una lista de listas para representar una lista de adyacencia.<br>
        <img src="ejercicio3/Dijkstra/imagenes/grafo.PNG"><br>
        <h2>Clase Main:</h2>
        <h3>Métodos:</h3>
        <h4> <em>getRoute():</em> Este método agrega la ruta del recorrido mínimo en la Lista "route".</h4>
        <h4> <em>Dijkstra():</em> Nos ejetura el algoritmo de Dijkstra usando nuestro min-heap como apoyo para el algoritmo.</h4>
        <img src="ejercicio3/Dijkstra/imagenes/main.PNG"><br>
        Representa el siguiente grafo:<br>
        <img src="ejercicio3/Dijkstra/imagenes/miGrafo.png"><br>
        <img src="ejercicio3/Dijkstra/imagenes/resultado.PNG"><br>
        <li>El grafo de palabras se define de la siguiente manera: cada vértice es una palabra
            en el idioma Inglés y dos palabras son adyacentes si difieren exactamente en una
            posición. Por ejemplo, las cords y los corps son adyacentes, mientras que los
            corps y crops no lo son.</li>
            a) Dibuje el grafo definido por las siguientes palabras: words cords corps coops
               crops drops drips grips gripe grape graph.
            b) Mostrar la lista de adyacencia del grafo.
        <li>Realizar un metodo en la clase Grafo. Este metodo permitira saber si un grafo esta
            incluido en otro. Los parametros de entrada son 2 grafos y la salida del metodo es
            true si hay inclusion y false el caso contrario.</li>
    </ol>
  </ul>
    <tr><td><strong>III. CUESTIONARIO:</strong><br>
        <h3>¿Cuantas variantes del algoritmo de Dijkstra hay y cuál es la diferencia entre ellas?</h3><br>
        Las version del algoritmo de Diskstra son muchas por el hecho de ser un algoritmo antiguo y van apareciendo nuevas versiones, ejemplo de ello son:
        Estructura de datos cola de prioridad(Pseudocódigo)
        <pre>
        DIJKSTRA (Grafo G, nodo_fuente s)       
           para u ∈ V[G] hacer
              distancia[u] = INFINITO
              padre[u] = NULL
              visto[u] = false
          distancia[s] = 0
          adicionar (cola, (s, distancia[s]))
          mientras que cola no es vacía hacer
              u = extraer_mínimo(cola)
              visto[u] = true
              para todos v ∈ adyacencia[u] hacer
                 si ¬ visto[v]      
                    si distancia[v] > distancia[u] + peso (u, v) hacer
                        distancia[v] = distancia[u] + peso (u, v)
                        padre[v] = u
                        adicionar(cola,(v, distancia[v]))
        </pre>
        Otro es çla version sin cola de prioridad(Pseudocódigo)
        <pre>
        función Dijkstra (Grafo G, nodo_salida s)
            entero distancia[n] 
            //Inicializamos el vector con distancias iniciales
            booleano visto[n] 
            //vector de boleanos para controlar los vértices de los que ya tenemos la distancia mínima
            para cada w ∈ V[G] hacer
                Si (no existe arista entre s y w) entonces
                    distancia[w] = Infinito //puedes marcar la casilla con un -1 por ejemplo
                Si_no
                    distancia[w] = peso (s, w)
                fin si 
            fin para
            distancia[s] = 0
            visto[s] = cierto
            //n es el número de vértices que tiene el Grafo
            mientras que (no_estén_vistos_todos) hacer 
                vértice = tomar_el_mínimo_del_vector distancia y que no esté visto;
                visto[vértice] = cierto;
                para cada w ∈ sucesores (G, vértice) hacer
                    si distancia[w]>distancia[vértice]+peso (vértice, w) entonces
                        distancia[w] = distancia[vértice]+peso (vértice, w)
                    fin si
                fin para 
            fin mientras
        fin función.
        </pre>
        <h3>Invetigue sobre los ALGORITMOS DE CAMINOS MINIMOS e indique, ¿Qué similitudes encuentra, qué diferencias, en qué casos utilizar y porque?</h3><br>
        Exiten 2 algoritmos para buscar el camino más corto: el Algoritmo Floyd-Warshall y el de Dijkstra.<br>
        - Algoritmo de Dijkstra: Es un algoritmo para la determinación del camino más corto, dado un vértice origen, hacia el resto de los vértices en un grafo que tiene pesos en cada arista.<br>
        Algortitmo de Floyd-Warshall: Es un algoritmo de análisis sobre grafos para encontrar el camino mínimo en grafos dirigidos ponderados. El algoritmo encuentra el camino entre todos los pares de vértices en una única ejecución.<br>
        Como se puede notar la principal diferencia es que el algoritmo de Floyd-Warshall nos halla el camino camino mas corto dado 2 vertices, mientras que el algoritmo de Dijkstra nos halla TODOS los caminos más cortos de un vértice hacia los demás. 
    </td></tr>
    <tr><td><strong>IV. CONCLUSIONES:</strong><br>
        ...
    </td></tr>
 </tbody>
</table>
<hr>
<table>
 <theader>
  <tr><td><strong>V. RETROALIMENTACIÓN GENERAL</strong><br>
  </td><tr>
 </theader>
 <tbody>
  <tr><td> 
        Un grafo es la suma de un conjunto de vertices o nodos que se relacionan con otros
        a traves de un conjunto de conexiones conocidas como aristas. Estos nos permiten estudiar 
        relaciones que existen entre unidades que interactuan con otras.
        Podemos darles muchos usos por ejemplo, para encontrar el menor camino de un lugar a otro usando 
        el algoritmo Dijkstra como lo hemos implementado o usando otros algoritmos como el de Floyd y Warshall
        (estos ultimos buscan el camino mas corto usando grafos etiquetados o ponderados), tambien podemos darle
        un uso para sitemas de informacion geografica, para dibujo computacional, sintesis de circuitos secuenciales,
        etc.
  </td></tr>
 </tbody>
</table>
<hr>
<table>
 <theader>
  <tr><td><strong>REFERENCIAS Y BIBLIOGRAFÍA</strong></td><tr>
 </theader>
 <tbody>
  <tr><td>https://delfino.cr/2021/11/la-utilidad-y-aplicacion-de-los-grafos-y-sistemas-de-informacion-geografica</td></tr>
  <tr><td>https://www.ecured.cu/Algoritmo_de_Dijkstra</td></tr>
  <tr><td>https://www.grapheverywhere.com/que-son-los-grafos/</td></tr>
  <tr><td>https://www2.ulpgc.es/hege/almacen/download/25/25317/teoriadegrafos.pdf</td></tr>
 </tbody>
</table>
