import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        ArrayList<String> listaPerguntas = new ArrayList<>();
        listaPerguntas.add("Telefonou para a vítima?");
        listaPerguntas.add("Esteve no local do crime?");
        listaPerguntas.add("Mora perto da vítima?");
        listaPerguntas.add("Devia para a vítima?");
        listaPerguntas.add("Já trabalhou com a vítima?");


        System.out.println("Responda: [S/N]");

        for(int i = 0; i < listaPerguntas.size(); i++){
            System.out.println(listaPerguntas.get(i));
            String opcao = sc.next();
            if(opcao.equalsIgnoreCase("S")){
                contador++;
            }
        }
        switch(contador){
            case 1:
                System.out.println("Inocente");
                break;
            case 2:
                System.out.println("Suspeito");
                break;
            case 3, 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino!");
                break;
            default:
                System.out.println("Inocente!");
        }
        sc.close();
    }

}
