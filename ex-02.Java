import java.util.Scanner;

public class Main{
public static void main(String[] args) {
	    
	float salarioMin,funcSal,salsMins;
	Scanner teclado = new Scanner (System.in);
	DecimalFormat format = new DecimalFormat("####.#");
	    
	System.out.print("Informe o valor do salario minimo:");
	salarioMin = teclado.nextFloat();
	    
	System.out.print("Informe o valor do salario do funcionario:");
	funcSal = teclado.nextFloat();
	    
	salsMins = funcSal/salarioMin;
	
	if (funcSal > salarioMin) {
            System.out.print("O funcionario recebe " +format.format(salsMins)+ " salarios minimos!");
        } else (salarioMin > funcSal) {
                System.out.printf("O funcionario ganha menos que um salario minimo!") ;
            }
	}
	    
}
