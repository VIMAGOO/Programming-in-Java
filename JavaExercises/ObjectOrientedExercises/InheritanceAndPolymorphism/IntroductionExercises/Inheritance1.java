/**
 * Inheritance1.java
 * Exemple de herencia i constructors
 * @author Jose Moreno
 * @version 
 */
public class Inheritance1 {
	public static void main(String[] args) {
		System.out.println("Creacio d'un objecte de classe A");
		A aObj = new A();
		System.out.println("Creacio d'un objecte de classe B");
		B bObj = new B();
		System.out.println("Creacio d'un objecte de classe C");
		C cObj = new C();
	}
}
class A {
	public A() {
		System.out.println("Nou objecte de tipus A");
	}
}
class B {
	public B() {
		System.out.println("Nou objecte de tipus B");
	}
}
class C extends A {
	B b;
}