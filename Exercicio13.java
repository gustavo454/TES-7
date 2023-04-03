package Exercicio13;
import java.util.Scanner;
public class Exercicio13{
    public static void main(String[] args) {
        Double valor;
        Scanner Ler = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        valor = Ler.nextDouble();
        if (valor>10){
            System.out.println("Valor maior que 10");
        }else{ 
            System.out.println("Valor menor ou igual a 10");
        }
    }  
}