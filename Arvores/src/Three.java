
public class Three extends No {

	private No raiz;
	public Three(No no) {
		// TODO Auto-generated constructor stub
		super(no._filhoEsq(), no._filhoDir(), no._Eu());
		this.raiz = no;
	}
	
	public void insere(int k){
	int v = this.raiz._Eu();
	No no = new No(k);
	int ctrl = no._Eu();
	
	if(ctrl <= v){
	No aux = this.raiz;
	while(aux._filhoEsq() != null){
    aux = aux._filhoEsq();
    }
	aux.setfilhoEsq(no);
	}
	
	else{
	No aux = this.raiz;
	while(aux._filhoDir() != null){
		aux = aux._filhoDir();
	}
	aux.setfilhoDir(no);
	}
	}
	
	public void printa(){
		
		System.out.print(this.raiz._Eu()+ " ");
		No aux = this.raiz;
		while(aux._filhoEsq() != null){
			System.out.print(aux._filhoEsq()._Eu() + " ");
			aux = aux._filhoEsq();
		}
		aux = this.raiz;
		while(aux._filhoDir() != null){
			System.out.print(aux._filhoDir()._Eu() + " ");
			aux = aux._filhoDir();
		}
	}
	
	

}
