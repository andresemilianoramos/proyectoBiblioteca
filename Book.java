import java.util.Scanner;

public class Book {
    Scanner entrada = new Scanner(System.in);

    // establecemos las variables (todas seran privadas)
    private String bookName;
    private Author author; // que guay como instanciamos la clase Author
    // y la declaramos como variale =)
    private double price;
    private int qtyStock;




    //y a la verga, construimos los constructores;
    // Book lo lanzamos con el Author ya crado;
    public Book(String bookName, Author author, double price, int qtyStock) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.qtyStock = qtyStock;

    }


    // establecemos los getter & setters


    //getBookName = nos regresa el nombre de este "book"
    public String getBookName() {return bookName;}
    //getauthor nos regresa el nombre del autor:
    public Author getAuthor() {return author;}
    // getQtyStock nos regresa la cantidad de book en stock
    public int getQtyStock() {return qtyStock;}
    //setQtyStock nos permite editar la cantidad de libros en stock
    public void setQtyStock(int qtyStock) {this.qtyStock = qtyStock;}
    // getPrice, nos regresa el precio del Book
    public double getPrice() {return price;}
    // setPrice estbalece el precio del Book
    public void setPrice(double price) {this.price = price;}

    public String toString() {
        return "'" + bookName + "' by " + author;  // author.toString
        }
}

