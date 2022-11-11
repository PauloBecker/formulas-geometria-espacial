package FormasGeometricas;

import java.util.Scanner;

public class Operacao {
    Scanner scan = new Scanner(System.in);
    private int opc = -1;
    private String opc2;
    private boolean flag = true;
    Cubo cubo = new Cubo();
    Dodecaedro dodecaedro = new Dodecaedro();

    Tetraedro tetraedro = new Tetraedro();

    Piramide piramide = new Piramide();

    Prisma prisma = new Prisma();

    public void operacao(){

        while (flag){
            System.out.println("============ FORMAS GEOMÉTRICAS  - GEOMETRIA ESPACIAL ============");
            System.out.println("Informe uma das opções abaixo para calcular uma das formas geométricas: ");
            System.out.println(
                    "1 - Cubo: \n" +
                    "2 - Dodecaedro: \n" +
                    "3 - Tetraedro: \n" +
                    "4 - Pirâmide: \n" +
                    "5 - Prisma: \n" +
                    "6 - Retornar ao menu.");
            opc = scan.nextInt();

            switch (opc){
                case 1:
                    cubo.calcularFormasCubo();
                    break;
                case 2:
                    dodecaedro.calcularDodecaedro();
                    break;
                case 3:
                    tetraedro.calcularFormasTetraedro();
                    break;
                case 4:
                    piramide.calcularFormasPiramide();
                    break;
                case 5:
                    prisma.calcularPrisma();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção inválida!!!");
            }
            System.out.println("============ FORMAS GEOMÉTRICAS  - GEOMETRIA ESPACIAL ============");
            System.out.println("Deseja calcular outra forma geométrica? \n" +
                    "Digite S - para sim ou N - para encerrar.");
            opc2 = scan.next();
            if (opc2.equalsIgnoreCase("n")) flag = false;
        }

        System.out.println("Encerrando o sistema...");
        System.out.println("Até logo! ;)");
    }
}
