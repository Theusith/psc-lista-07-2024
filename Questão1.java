import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp, soma = 0;
        double media;
        ArrayList<String> listaMes = new ArrayList<String>();
        listaMes.add("1 - Janeiro");
        listaMes.add("2 - Fevereiro");
        listaMes.add("3 - Março");
        listaMes.add("4 - Abril");
        listaMes.add("5 - Maio");
        listaMes.add("6 - Junho");
        listaMes.add("7 - Julho");
        listaMes.add("8 - Agosto");
        listaMes.add("9 - Setembro");
        listaMes.add("10 - Outubro");
        listaMes.add("11 - Novembro");
        listaMes.add("12 - Dezembro");

        System.out.println("Digite as médias dos meses:");

        ArrayList<Double> arreyTemperatura = new ArrayList<Double>();
        for(int i =0; i < 12; i++){
            System.out.println(listaMes.get(i));
            temp = sc.nextDouble();
            arreyTemperatura.add(temp);
            soma += temp;
        }
        media = soma/arreyTemperatura.size();
        System.out.println("A média anual é: " + media + " ° C");

        for(int i = 0; i < arreyTemperatura.size(); i++){
            if(arreyTemperatura.get(i) > media){
                System.out.println(listaMes.get(i));
            }
        }
        sc.close();
    }
    
}
