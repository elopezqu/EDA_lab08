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