public class testAuthor {
    public static void main(String[] args) {
        // pueba del constructor y el toString

        Author autor1 = new Author("Miguel de Cervantes Saavedra", "elPoetaDealcala@elquijote.com", 'm');
        System.out.println();
        System.out.println(autor1); // deberia imprimir el toString()

        //Probando los Setter & Getters
        //editando el e-mail:
        autor1.setE_mail("hablaClaroMaraquero@raperoModerno.com");
        System.out.println("========================================");
        System.out.println(autor1); // toString() !! =)
        // se imprime todos las datos del autor gracias al toString()
        System.out.println("The name is: "+autor1.getName());
        // se imprime el nombre (no editable).
        System.out.println("The author's gender is: " + autor1.getGender());
        // se imprime el genero del autor ('f' || 'm')
        System.out.println("The email is: "+autor1.getE_mail());
        // se imprime el e-mail





    }
}
