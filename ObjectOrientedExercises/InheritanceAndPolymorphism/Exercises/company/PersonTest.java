package empresa;

/**
 *
 * @author vimago
 */
public class PersonTest {

    public static void main(String[] args) {
                // Crear una instancia de Person
        Person person = new Person("12345678A", "John", "Doe", "", "123 Main Street", 123456789, "1990-01-01");

        // Imprimir los detalles de la persona
        System.out.println("Detalles de la persona:");
        System.out.println("NIF: " + person.getNif());
        System.out.println("Nombre: " + person.getName());
        System.out.println("Apellido 1: " + person.getSurname1());
        System.out.println("Apellido 2: " + person.getSurname2());
        System.out.println("Dirección: " + person.getAddress());
        System.out.println("Teléfono: " + person.getTelf());
        System.out.println("Fecha de nacimiento: " + person.getBirthdate());

        // Modificar algunos detalles de la persona
        person.setAddress("456 Elm Street");
        person.setTelf(987654321);

        // Imprimir los detalles actualizados de la persona
        System.out.println("\nDetalles actualizados de la persona:");
        System.out.println("Dirección actualizada: " + person.getAddress());
        System.out.println("Teléfono actualizado: " + person.getTelf());
    }
    }
    
