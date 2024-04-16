import java.util.ArrayList;
import java.util.Optional;

public class desafioTarget {

    public static void main(String[] args) {
       System.out.println(testeFib(55));
        System.out.println(reverse("joao"));
    }

    private static  String testeFib(final int value){
        final int firstNumber = 0;
        final int secondNumber = 1;
        int x = 1;
        String aviso = "";
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(firstNumber);
        fib.add(secondNumber);

        for (int j = 0; j < fib.size(); j++) {

            int sum1 = fib.get(j);
            int sum2 = fib.get(x);
            int result = sum1 + sum2;
            fib.add(result);
            x++;
             if (fib.get(x) == value){
                 return  "o valor " + value + " fica na posicao: " + (x+1) + " do fib.\n"+
                         "fib: " + fib.toString();

             } else if (fib.size() == value){
                 aviso = "o valor inserido nao esta no fib";
                 break;
             }

        }
        return aviso;

    }

    private  static String reverse(final String word){
        String newWord = "";
       Character z = 0;
        for (int i = word.length() -1 ; i >= 0; i--) {
            z = word.charAt(i);
            newWord += z.toString();
        }
        return newWord;
    }
}
