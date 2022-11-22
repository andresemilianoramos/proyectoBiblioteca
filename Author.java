// nos va a dar la clase autor de un libro

public class Author {
    // establecemos variables de instancia privada
    private String name;
    private String email;
    private char gender;

    //establecemos el constructor de autor

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    // Los getters y setters públicos para las variables de instancia privada.
    // No setter para nombre y género ya que no están diseñados para ser cambiados.
    // Devuelve el nombre

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getE_mail() {
        return email;
    }

    public void setE_mail(String e_mail) {
        this.email = e_mail;
    }

    @Override
    public String toString() {
        return name + " (sex: '"+gender+"') " + ", e-Mail= " + email;}

}
