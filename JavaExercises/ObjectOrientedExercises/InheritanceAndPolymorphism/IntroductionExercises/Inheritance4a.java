/**
 * Inheritance4a.java
 * Exemple de herencia i constructors
 * @author Jose Moreno
 * @version 
 */
public class Inheritance4a {
	public static void main(String[] args) {
		System.out.println("Creacio d'un objecte Base");
		Base baseObj = new Base();
		System.out.println("Creacio d'un objecte Derivat");
		Derivat derivatObj = new Derivat();
	}
}
class Base {
	ComponentA aComp;
	ComponentB bComp;
	ComponentC cComp;
	public Base() {
		System.out.println("Nou objecte Base ");
	}
}
class ComponentA {
	public ComponentA() {
		System.out.println("Nou objecte ComponentA ");
	}
}
class ComponentB {
	public ComponentB() {
		System.out.println("Nou objecte ComponentB ");
	}
}
class ComponentC {
	public ComponentC() {
		System.out.println("Nou objecte ComponentC ");
	}
}
class Derivat extends Base {
	public Derivat() {
		System.out.println("Nou objecte Derivat ");
	}
}
