function Vertice(id){
  this.id = id;
}


function Aresta(v1, v2){
  this.v1 = v1;
  this.v2 = v2;
}


qtd_v = 3;

//Criando Vertices
var vertices = [];

for (var i = 0; i < qtd_v; i++){
  vertices[i] = new Vertice(i);
}

// Criando Arestas

var arestas = [];
qtd_e = 3;
for (var i = 0; i < qtd_e; i++) {
    t = prompt();
    t2 = prompt();
    arestas[i] = [t,t2];
}

for (var i = 0; i < qtd_e; i++) {
  console.log(arestas[i]);
}
