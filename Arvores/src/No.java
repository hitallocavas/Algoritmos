
public class No {

	private No filhoEsq;
	private No filhoDir;
	private int eu;
	
	public No(int eu){
		this.filhoEsq = null;
		this.filhoDir = null;
		this.eu = eu;
				
	}
	public No(No filhoEsq, No filhoDir, int eu){
		this.filhoEsq = filhoEsq;
		this.filhoDir = filhoDir;
		this.eu = eu;
	}
	
	public No _filhoEsq(){
		return this.filhoEsq;
	}
	
	public void setfilhoEsq(No n){
		this.filhoEsq = n;
	}
	
	public No _filhoDir(){
		return this.filhoDir;
	}
	
	public void setfilhoDir(No n){
		this.filhoDir = n;
	}
	public int _Eu(){
		return this.eu;
	}
	
	public void setEu(int n){
		this.eu = n;
	}
	
}
