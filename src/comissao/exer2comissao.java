package comissao;
import static java.lang.System.out;
import java.util.Scanner;

public class exer2comissao { 
	public static void main(String[] args) {
	 Scanner loja = new Scanner(System.in);
	
	System.out.println("Qual o nome do vendedor?");
    String nome = loja.next();
    
    System.out.println("Qual o código da peça?");
    int cod = loja.nextInt();
    
    System.out.println("Qual o valor da peça?");
    double valor = loja.nextDouble();
    
    System.out.println("Quantidade de peças vendidas?");
    double quant = loja.nextDouble();
	
    double total = valor*quant;
    double resultado = (total*5)/100;
    System.out.println("O total da comissão do vendedor é:"+ resultado);
    
    
    
    
   
    
    
    
	
} 
	}