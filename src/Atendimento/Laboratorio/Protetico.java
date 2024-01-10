package Atendimento.Laboratorio;

import java.util.Scanner;

public class Protetico {
    int servicos;
    int resp;

    public void setServicos(){
        System.out.println(" Qual o serviço desejado ? ");
        Scanner teclado = new Scanner(System.in);
        for (int i=1; i <= 5; i++){
            System.out.println("Protese total [1]");
            System.out.println("PPR [2]");
            System.out.println("Faceta [3]");
            servicos = teclado.nextInt();

            System.out.println("Algo mais ?");
            System.out.println("Sim [1] Não[2]");
            resp = teclado.nextInt();

            if (resp == 2){
                i = 6;
            }
        }
    }
}
