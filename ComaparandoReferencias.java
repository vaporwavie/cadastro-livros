package intensivopoo;

public class ComaparandoReferencias {
    public static void main(String[] args) {
        Autor autor = new Autor();
        
        autor.autor = "Eoin Colfer";
        autor.paisAutor = "Irlanda";
        
        Livro livro = new Livro();
        livro.autor = autor;
        
        livro.autor.autor = "Rick Riordan";
        System.out.println(autor.autor);
        
        
        Autor autor2 = new Autor();
        
        autor2.autor = "Eoin Colfer";
        autor2.paisAutor = "Irlanda";
        
        if (autor == autor2) {
            System.out.println("Os autores são iguais!");
        } else {
            System.out.println("Os autores não são iguais!");
        }
    }
}
