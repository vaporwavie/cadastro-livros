package intensivopoo;

public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        double soma = 0;
        
            // inicialização ; condição     ; atualização 
        for (int contador = 0; contador < 35; contador++) {
            soma += 59.90;
        }
        
        System.out.printf("O total em estoque é: %.2f \n", soma);
        
        if (soma < 150) {
            System.out.println("Seu estoque está muito baixo!");
        } 
        
        else if (soma >= 2000) {
            System.out.println("Seu estoque está muito alto!");
        }   else {
            System.out.println("Seu estoque está bom!");
        }
    }
}
