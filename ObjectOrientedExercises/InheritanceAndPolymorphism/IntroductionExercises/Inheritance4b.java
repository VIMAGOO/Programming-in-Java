/**
 * Inheritance4b.java
 * Exemple de herencia i constructors
 * @author Jose Moreno
 * @version
 */
public class Inheritance4b {
	public static void main(String[] args) {
		ComponentA aObj = new ComponentA();
		ComponentB bObj = new ComponentB();
		ComponentC cObj = new ComponentC();
		System.out.println("Creacio d'un objecte Base");
		Base baseObj = new Base(aObj, bObj, cObj);
		System.out.println("Creacio d'un objecte Derivat");
		Derivat derivatObj = new Derivat(aObj, bObj, cObj);
	}
}
class Base {
	ComponentA aComp;
	ComponentB bComp;
	ComponentC cComp;
	public Base(ComponentA a, ComponentB b, ComponentC c) {
		this.aComp = a;
		this.bComp = b;
		this.cComp = c;
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
	public Derivat(ComponentA a, ComponentB b, ComponentC c) {
		super(a, b, c);
		System.out.println("Nou objecte Derivat ");
	}
}