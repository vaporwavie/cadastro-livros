// Uso de métodos com parâmetro
package intensivopoo;

public class LivroDesconto {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.valor = 59.90;
        
        System.out.println("Valor Anual: " + livro.valor);
        
        livro.aplicaDescontoDe(0.1);
        
        System.out.println("Valor com Desconto: " + livro.valor);
    }
}
