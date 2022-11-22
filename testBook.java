
public class testBook {
    public static void main(String[] args) {
        Author autor1 = new Author("Miguel de Cervantes Saavedra", "elPoetaDealcala@elquijote.com", 'm');
        System.out.println();
        System.out.println(autor1); // deberia imprimir el toString()

        // Test del book su contructor y el toString
        Book book1 = new Book("Er Quijote de la Mancha",autor1, 20.000, 300);
        System.out.println(book1);



        // test de los setter y los getter

        //test correccion de precio:
        book1.setPrice(0);
        //test correcion de cantidad de stock
       book1.setQtyStock(0);

        // test obtencion del autor:
        System.out.println("\nTEST: ");
        System.out.println("Los datos del autor son: "+book1.getAuthor());
        //test obtencion de email autor:
        System.out.println("El e-mail de autor es : "+book1.getAuthor().getE_mail());
        //test obtencion del seixo del autor:
        System.out.println("El genero del autor es: "+book1.getAuthor().getGender());
        System.out.println("=================================================");
        Book book2 = new Book("El Cervantico y su mula",new Author("Pedro Infante de la Sierra","elGrandePedrito@mariachi.com",'f'),21.99,99);
        System.out.println(book2);

    }

}
