package poo1.entidades;




public class Libro {

    
    //Atributos//
    
    private long ISBN;
    private String titulo;
    private String autor;
    private int numeropaginas;

    

    //Constructores//
    
    public Libro() {
    //constructor vacio//
    }
    
    public Libro( String titulo, long ISBN, String autor, int numeropaginas) {

        this.ISBN = ISBN;
        this.autor = autor;
        this.numeropaginas = numeropaginas;
        this.titulo = titulo;

    }
    
    //Metodos//

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeropaginas() {
        return numeropaginas;
    }

    public void setNumeropaginas(int numeropaginas) {
        this.numeropaginas = numeropaginas;
    }
    
    @Override
    public String toString(){
        return "El libro "+titulo+" con ISBN "+ISBN+" creado por el autor "+autor+
                " que tiene "+numeropaginas+" paginas";
        
    
}
}
