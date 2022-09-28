package ascione;

public class Persona {
    
    // VARIABILI D'ISTANZA
    private String nome;
    private String cognome;
    private String genere;
    private String email;
    
    // METODO COSTRUTTORE
    public Persona(String nome, String cognome, String genere, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.genere = genere;
        this.email = email;
    }

    
    // METODI GET E SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
