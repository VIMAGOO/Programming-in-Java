/**
 * Inheritance2.java
 * Exemple de herencia i constructors
 * @author Jose Moreno
 * @version 
 */
public class Inheritance2 {
	public static void main(String[] args) {
		System.out.println("Creacio d'un objecte de classe A");
		A aObj = new A(1);
		System.out.println("Creacio d'un objecte de classe B");
		B bObj = new B(2);
		System.out.println("Creacio d'un objecte de classe C");
		C cObj = new C(3,4);
	}
}
class A {
	public A(int na) {
		System.out.println("Nou objecte de tipus A "+na);
	}
}
class B {
	public B(int nb) {
		System.out.println("Nou objecte de tipus B "+nb);
	}
}
class C extends A {
	B b;
	public C(int na, int nb) {
		super(na);
		b = new B(nb);
	}
}