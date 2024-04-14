import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as notas: [para finalizar digite -1]");
        ArrayList<Integer> listaNotas = new ArrayList<Integer>();
        int nota = sc.nextInt();
        int soma = nota;

        while(nota != -1) {
            listaNotas.add(nota);
            nota = sc.nextInt();
            soma += nota;
        }
        for(int item : listaNotas){
            System.out.print(item + " ");
        }
        System.out.println();
        for(int i = listaNotas.size() - 1; i >= 0; i-- ){
            System.out.println(listaNotas.get(i));
        }
        System.out.println("A soma é: "+ soma);
        double media =  (double) soma/listaNotas.size();
        System.out.printf("A média é: %.1f \n", media);
        
        int cont = 0;
        for (int item: listaNotas){
            if(item > media){
                cont++;
            }
        }
        System.out.println("A quantidade de valores acima da média é: " + cont);
        cont = 0;
        for (int item: listaNotas){
            if (item < 7){
                cont++;
            }
        }
        System.out.println("A quantidade de valores abaixo de 7 é: " + cont);
        System.out.println("Fim do programa");
        sc.close();
    }
}
