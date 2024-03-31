/**
 * Inheritance3a.java
 * Exemple de herencia i constructors
 * @author Jose Moreno
 * @version
 */
public class Inheritance3a {
	public static void main(String[] args) {
		System.out.println("Creacio d'un objecte de classe A");
		A aObj = new A(1);
		System.out.println("Creacio d'un objecte de classe B");
		B bObj = new B();
		System.out.println("Creacio d'un objecte de classe C");
		C cObj = new C(3);
	}
}
class A {
	public A(int na) {
		System.out.println("Nou objecte de tipus A "+na);
	}
}
class B extends A {
	public B() {
		super(2);
		System.out.println("Nou objecte de tipus B ");
	}
}
class C extends A {
	public C(int nc) {
		super(nc);
		System.out.println("Nou objecte de tipus C ");
	}
}