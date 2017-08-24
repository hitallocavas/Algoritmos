function Vertice(id, filhos){
  this.id = id;
  this.filhos = filhos;
}



var raiz = new Vertice("raiz", null)
var v1 = new Vertice("v1", null )
var v2 = new Vertice("v2", null)
var v3 = new Vertice("v3", null )
var v4 = new Vertice("v4", null)
var v5 = new Vertice("v5", null)
var v6 = new Vertice("v6", null)

raiz.filhos = [v1,v2]
v1.filhos = [v3,v5]
v2.filhos = [v4,v6]

buscaProfundidade(raiz)

function buscaProfundidade(node){
  var t = node.filhos.lenght;
  for (var i = 0; i < t; i++) {
  while(node.filhos[i] != null){
  alert(node.filhos[i].id)
  node.filhos[i] = node.filhos[i].filhos;
  }
  }
}
