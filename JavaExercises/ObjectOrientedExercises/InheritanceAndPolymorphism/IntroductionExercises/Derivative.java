public class Derivative extends Base{
	public String cognom;
	
	public Derivative (String nom) {
		super(nom); //constructor de base
		System.out.println("Nou objecte de tipus Derivative");
	}
	
	public void celebracio(){
		System.out.println("Vamooos " + nom);
	}

}
