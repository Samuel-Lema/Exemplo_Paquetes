package exemplo_paquetes;

public class Coches {
    
    private String matricula;
    
    // Constructor

    public Coches(String matricula) {
        this.matricula = matricula;
    }
    
    // Set's y Get's

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    // To String

    @Override
    public String toString() {
        return "Matricula: " + matricula;
    }
    
    
    
}
