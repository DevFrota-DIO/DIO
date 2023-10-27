import service.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scan.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            exception.printStackTrace();
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois)
        throw new ParametrosInvalidosException(parametroUm, parametroDois);


        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.printf(i + " - ");
        }
    }
}
