package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        int n, i, j;
        double e, fat;

        System.out.print("Digite o valor de N: ");
        n = sc.nextInt();

        e = 1;

        for (i = 1; i <= n; i++) {
            fat = 1;
            for (j = 1; j <= i; j++) {
                fat = fat * j;
            }
            e = e + 1 / fat;
        }

        System.out.println("O valor de E é: " + e);
    }
}
