
package athlete;

/**
 *
 * @author vimago
 */
public class Athlete extends Person {
    private String disciplina;
    private int dorsal;

    public Athlete() {
    }

    public Athlete(String disciplina, int dorsal, String nom, int edat) {
        super(nom, edat);
        this.disciplina = disciplina;
        this.dorsal = dorsal;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
        
    

    @Override
    public String irClase(String nom) {
        String frase = "Soy un Athlete, mi nombre es " + nom + " y voy a clase";
        return frase;
    }

    @Override
    public String correr(String nom) {
        String frase = "Soy un Athlete, mi nombre es "+nom+" y estoy corriendo";
        return frase;
    }

    @Override
    public String saltar(String nom) {
        String frase = "Soy un Athlete, mi nombre es "+nom+" y estoy saltando";
        return frase;
    }

    @Override
    public String nadar(String nom) {
        String frase = "Soy un Athlete, mi nombre es "+nom+" y estoy nadando";
        return frase;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona:\n");
        sb.append("\tNom: ").append(nom+"\n");
        sb.append("\tEdat: ").append(edat+"\n");
        sb.append("\tDisciplina: ").append(disciplina+"\n");
        sb.append("\tDorsal: ").append(dorsal+"\n");
        return sb.toString();
    }
    
    
}
