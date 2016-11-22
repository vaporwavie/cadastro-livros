// Conecta com Livro.java
package intensivopoo;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Livro livro = new Livro();
        
        
        Autor autor = new Autor();
        
        autor.autor = "Eoin Colfer";
        autor.paisAutor = "Irlanda";
        
        livro.nome = "A Lista dos Desejos";
        livro.genero = "Drama";
        livro.valor = 29.90;
        
        livro.autor = autor;
        
        livro.mostrarDetalhes();
        
        Livro outrolivro = new Livro();
        Autor outroautor = new Autor();
        
        outroautor.autor = "Rick Riordan";
        outroautor.paisAutor = "Estados Unidos";
        
        outrolivro.nome = "Percy Jackson e o Ladrão de Raios";
        outrolivro.genero = "Aventura";
        outrolivro.valor = 49.90;
        
        outrolivro.autor = outroautor;
        
        outrolivro.mostrarDetalhes();
    }
}
