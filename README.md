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
        <li>Implementar codigo de Grafo(Lista de Adyacencia)</li>
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
        Representa el siguiente grafo:
        <img src="ejercicio3/DFSyBFS/imagenes/grafo.PNG"><br>
        <img src="ejercicio3/DFSyBFS/imagenes/resultado.PNG"><br>
        <h1>Dijkstra</h1>
        <h2>Clase Arista:</h2>
        <h3>Atributos:</h3>
        <em>inicio:</em> Vértice donde inicia la arista.<br>
        <em>destino:</em> Destino de la arista.
        <em>peso:</em> El peso de la arista.
        <img src="ejercicio3/Dijkstra/imagenes/arista.PNG"><br>
        <h2>Clase Nodo:</h2>
        Esta clase nos sirve como ayuda para hacer un min-heap para realizar con mayor facilidad el algoritmo.
        <h3>Atributos:</h3>
        <em>vertex:</em> Representa el vértice.<br>
        <em>weight:</em> Representa el costo para llegar al vértice.
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
        Representa el siguiente grafo:
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
        ...
        <h3>Invetigue sobre los ALGORITMOS DE CAMINOS MINIMOS e indique, ¿Qué similitudes encuentra, qué diferencias, en qué casos utilizar y porque?</h3><br>
        ...
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
        ... 
  </td></tr>
 </tbody>
</table>
<hr>
<table>
 <theader>
  <tr><td><strong>REFERENCIAS Y BIBLIOGRAFÍA</strong></td><tr>
 </theader>
 <tbody>
  <tr><td>...</td></tr>
  <tr><td>...</td></tr>
  <tr><td>...</td></tr>
  <tr><td>...</td></tr>
 </tbody>
</table>
