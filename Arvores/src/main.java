
public class main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No raiz = new No(4);
		Three arvore = new Three(raiz);
		
		arvore.insere(5);
		arvore.insere(3);
		arvore.insere(2);
		arvore.insere(9);
		arvore.insere(99);
		arvore.insere(1);
		arvore.insere(8);
		arvore.printa();
	}

}
