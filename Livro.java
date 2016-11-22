// Estrutura de Livros POO
package intensivopoo;

public class Livro {
    String nome, genero;
    Autor autor, paisAutor;
    double valor;
    
    void mostrarDetalhes() {
        String mensagem = "Detalhes Gerais: ";
        System.out.println(mensagem);
        System.out.println("--");
        
        // Detalhes da Obra
        System.out.println("Detalhes da Obra: ");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Valor: " + valor);
        
        // Detalhes do Autor
        System.out.println("Detalhes do Autor: ");
        autor.mostrarDetalhes();
        
        // Verificar se o livro possui um Autor
        if(this.temAutor()) {
        autor.mostrarDetalhes();
        }
        
        // Quebra de registro
        System.out.println("--");
        }

    void aplicaDescontoDe(double porcentagem) {
        this.valor -= this.valor * porcentagem;
    }
    
     boolean temAutor() {
         return this.autor != null;
    }
}