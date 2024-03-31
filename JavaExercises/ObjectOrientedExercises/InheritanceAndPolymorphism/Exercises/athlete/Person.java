package atleta;

/**
 *
 * @author vimago
 */
public abstract class Person implements IRunner, ISwimmer {

    protected String nom;
    protected int edat;

    public Persona() {
    }

    public Persona(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nom=").append(nom);
        sb.append(", edat=").append(edat);
        sb.append('}');
        return sb.toString();
    }

    public abstract String irClase(String nom);
}
