package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, num_cri, meses, tot_m = 0, tot_f = 0, tot_24 = 0;
        double porc_f, porc_m, porc_24;
        String sexo;

        System.out.print("Digite o número de crianças nascidas no período: ");
        num_cri = sc.nextInt();

        if (num_cri == 0) {
            System.out.println("NENHUMA CRIANÇA DIGITADA");
        } else {
            for (i = 1; i <= num_cri; i++) {
                System.out.print("Digite o sexo da " + i + "ª criança (M ou F): ");
                sexo = sc.next(); 
                System.out.print("Digite o tempo de vida (em meses) da " + i + "ª criança: ");
                meses = sc.nextInt();

                if (sexo.equals("M")) {
                    tot_m = tot_m + 1;
                    if (meses <= 24) {
                        tot_24 = tot_24 + 1;
                    }
                } else if (sexo.equals("F")) {
                    tot_f = tot_f + 1;
                    if (meses <= 24) {
                    	tot_24 = tot_24 + 1;
                    }
                }
            }

            porc_m = (tot_m * 100.0) / num_cri;
            porc_f = (tot_f * 100.0) / num_cri;
            porc_24 = (tot_24 * 100.0) / num_cri;

            System.out.println("Percentual de crianças do sexo feminino mortas: " + porc_f + "%");
            System.out.println("Percentual de crianças do sexo masculino mortas: " + porc_m + "%");
            System.out.println("Percentual de crianças com 24 meses ou menos mortas no período: " + porc_24 + "%");
        }


	}

}
