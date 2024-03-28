public class Base {
	protected String nom;
	public Base (String nom) {
		this.nom = nom;
		System.out.println("Nou objecte de tipus base");
	}
	public void saluda(){
		System.out.println("Hola a tots siuu, soc " + nom);
	}
}
