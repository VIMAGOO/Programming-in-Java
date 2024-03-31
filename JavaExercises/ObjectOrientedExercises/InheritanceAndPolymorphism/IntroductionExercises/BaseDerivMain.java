public class BaseDerivMain {
	public static void main (String[] args) {
		Base base1 = new Base("Manolo el del bar");
		System.out.println("base1.nom: "+base1.nom);
		Derivative deriv1 = new Derivada("Jefri Einstein");
		System.out.println("deriv1.nom: "+deriv1.nom);
		base1.saluda();
		deriv1.saluda();
		deriv1.celebracio();
	}
}

