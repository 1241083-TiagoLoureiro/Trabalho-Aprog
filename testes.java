import java.io.FileNotFoundException;
import java.util.Scanner;

public class testes {
    public static final String FICHEIRO_PLANEAMENTO= "src/planeamento.txt";

    public static void main(String[] args) throws FileNotFoundException {
        try {
            int[][] planeamento;
            //a)
            planeamento = Lerficheiro(FICHEIRO_PLANEAMENTO);
            System.out.println("a) planeamento (km/dia/veiculo)");
            mostrarCabecalho(planeamento);



        }catch (FileNotFoundException e) {
            System.err.println("Erro: Ficheiro nao encontrado");
        }
    }

    public static int [][] Lerficheiro(String ficheiro) throws FileNotFoundException {
        Scanner sc = new Scanner(ficheiro);
        int nVeiculos = sc.nextInt();
        int nDias = sc.nextInt();
        int[][] matrizPlaneamento = new int[nVeiculos][nDias];

        for (int i = 0; i < nVeiculos; i++) {
            for (int j = 0; j < nDias; j++) {
                matrizPlaneamento[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return matrizPlaneamento;
    }

    public static void mostrarCabecalho(int[][] matrizPlaneamento) {
        System.out.println("dia: ");
        for (int i = 0; i < matrizPlaneamento[0].length; i++) {
            System.out.printf("%8d", i);
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("----|");
        for (int i = 0; i < matrizPlaneamento[0].length; i++) {
            System.out.print("--------|");
        }
        System.out.println();
    }

    public static void planeamentoPorDia(int[][] matrizPlaneamento) {
        for (int i = 0; i < matrizPlaneamento.length; i++) {
            System.out.printf("%-3d", i);
            for (int j = 0; j < matrizPlaneamento[i].length; j++) {
                System.out.printf("%8d", matrizPlaneamento[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

}