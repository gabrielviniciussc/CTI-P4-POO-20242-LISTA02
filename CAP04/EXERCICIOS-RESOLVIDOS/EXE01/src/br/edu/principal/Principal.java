package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{
				Scanner sc = new Scanner(System.in);

		        double nota_Trab, aval_Sem, exame, media;

		        System.out.print("Digite a nota do trabalho de laboratório: ");
		        nota_Trab = sc.nextDouble();

		        System.out.print("Digite a nota da avaliação semestral: ");
		        aval_Sem = sc.nextDouble();

		        System.out.print("Digite a nota do exame final: ");
		        exame = sc.nextDouble();

		        media = (nota_Trab * 2 + aval_Sem * 3 + exame * 5) / 10;

		        System.out.println("Média ponderada: " + media);

		        if (media >= 8 && media <= 10) {
		            System.out.println("Conceito: A");
		        } else if (media >= 7 && media < 8) {
		            System.out.println("Conceito: B");
		        } else if (media >= 6 && media < 7) {
		            System.out.println("Conceito: C");
		        } else if (media >= 5 && media < 6) {
		            System.out.println("Conceito: D");
		        } else if (media >= 0 && media < 5) {
		            System.out.println("Conceito: E");
		        }
		    }
}



	


