public class Inheritance4c {
	public static void main(String[] args) {
		ComponentA aObj;
		ComponentB bObj;
		ComponentC cObj;
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
		this.aComp = new ComponentA();
		this.bComp = new ComponentB();
		this.cComp = new ComponentC();
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
		super();
		System.out.println("Nou objecte Derivat ");
	}
}
