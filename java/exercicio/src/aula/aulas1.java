package aula;

import java.util.Scanner;

public class aulas1 {

    public static void main(String[] args) 
    {
     //teste git
    	int x;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        x = ler.nextInt();

        if(x < 0)
        {
            System.out.println("Seu n�mero � invalido pois � menor que zero ");
        }
        else if (x % 2 == 0) 
        {
            System.out.println("Seu numero � par ");

        }
        else if (x % 2 == 1)
        {
            System.out.println("Seu n�mero � impar ");
        }
        System.out.println("Fim de programa!");
    }


}

