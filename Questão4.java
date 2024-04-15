import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor das vendas de cada funcionario: [para finalizar digite -1]");
        ArrayList<Double> vendas = new ArrayList<>();
        double venda = sc.nextDouble();

        while(venda != -1){
            vendas.add(venda);
            venda = sc.nextDouble();
        }
        int[] contadores = new int[9];

        for (double item : vendas) {
            double salario = 200 + 0.09 * item;
            int indice = Math.min((int) (salario / 100) - 2, 8);
            contadores[indice]++;
        }

        System.out.println("Intervalo de Salário: Número de Vendedores");
        for (int i = 0; i < 8; i++) {
            System.out.printf("$%d - $%d: %d\n", (i + 2) * 100, (i + 3) * 100 - 1, contadores[i]);
        }
        System.out.printf("$1000 em diante: %d\n", contadores[8]);
        sc.close();
    }
}
