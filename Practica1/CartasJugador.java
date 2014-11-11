
public class CartasJugador {
	public CartasJugador(){}
	private int Num1;
	private String Nom1;
	public CartasJugador(int Num,String Nom){
		Nom1=Nom;
		Num1=Num;
	}
	
	public int getNum1(){		
		return Num1;
	}
	public String getNom(){
		return Nom1;
	}
	public void setNum1(int Num){
		Num1=Num;
	}
	public void setNum1(String Nom){
		Nom1=Nom;
	}

}
