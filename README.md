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
        <li>El grafo de palabras se define de la siguiente manera: cada vértice es una palabra
            en el idioma Inglés y dos palabras son adyacentes si difieren exactamente en una
            posición. Por ejemplo, las cords y los corps son adyacentes, mientras que los
            corps y crops no lo son.</li>
            a) Dibuje el grafo definido por las siguientes palabras: words cords corps coops
               crops drops drips grips gripe grape graph.
            b) Mostrar la lista de adyacencia del grafo.
        <li><h2>Realizar un metodo en la clase Grafo. Este metodo permitira saber si un grafo esta
            incluido en otro. Los parametros de entrada son 2 grafos y la salida del metodo es
            true si hay inclusion y false el caso contrario.</h2></li>
            <h3>Se utilizo como ejemplo el codigo del problema numero 1</h3>
            <img src="problema5/img/Clases.png"><br>
            Se agrego un metodo el cual devuelve el arreglo de vertices o nodos<br>
            <img src="problema5/img/getArray.png"><br>
            Luego se empezo a crear el codigo tomando en cuenta estos puntos: (a) Cuando existe un vertice o nodo el cual
            no este conectado con ninguno, (b) Cuando en el grafo original existe un camino de v1 hacia v2, pero el grafo a comparar posee de 
            v2 hacia v1 (al ser diferentes caminos se retornara false), (c) Cuando el grafo a comparar posee un vertice el cual no este dentro del original, 
            (d) Cuando un nodo o vertice posee una conexion extra hacia otro que el graf original no tiene.<br>
            <img src="problema5/img/isIncluded1.png"><br>
            A continuacion tenemos el booleano result el cual vamos a usar para retornar, 
            luego un foreach el cual va a iterar entre todos los vertices o nodos del grafo b (el grafo a verificar), siguiendo de una condicion la cual va a buscar si el vertice existe en el grafo original, si cumple retorna false y termina el metodo, en caso contrario va a verificar si el vertice esta aislado de todo el grafo para de igual manera retornar false, en caso contrario continua con el codigo.<br>
            <img src="problema5/img/isIncluded2.png"><br>
            luego de pasar el primer filtro, creamos 2 arrays los cuales seran las conexiones que posee el vertice original (aux1) y el vertice a comparar (aux2), luego ingresara en los 2 for siguientes para llenarlos y despues un if el cual verificara si el vertice a comparar posee mas conexiones que la original, si cumple esto, detiene todo el codigo y va a retornar false.<br>
            <img src="problema5/img/isIncluded3.png"><br>
            Por ultimo va a verificar las conexiones y que estas esten dentro del original, con ayuda de una bandera para verificar si es que tiene una conexion extra, en este caso retorna false y por ultimo un if el cual verifica el boolean result y lo retorna.<br>
            <h3>Ejemplo de Ejecucion y de uso</h3>
            Creamos nuestros grafos y sus vertices<br>
            <img src="problema5/img/ejemplo1.png"><br>
            Realizamos las conexiones<br>
            <img src="problema5/img/ejemplo2.png"><br>
            Ahora llamos al metodo dentro de un print para que imprima el valor booleano y como primer parametro nuestro grafo original, y como segundo parametro el grafo a comparar y obtenemos esto (nos deberia retornar true, ya que el grafo b posee 3 vertices que estan dentro del grafo original y con sus conexiones entre los 3 sin dejar uno aislado y tampoco una conexion extra):<br>
            <img src="problema5/img/ejemplo3.png"><br>



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