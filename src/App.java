import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Operadores de atribuiçao cumulativa logica de programação.
        // (fazer um programa para ler a quantidade de minutos que a pessoa consumiu, dai
     //imprimir o valor a ser pago.Plano basico da direito 100 minutos por R$ 50,00 se exceder será cobrado 2,00 por minutos
     //excedidos)instruçoes digitar os minutos utilizados de um (ENTER)a saida será o valor da conta a pagar.
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
          int minutos = sc.nextInt();
            double conta =50.00;
      if (minutos > 100) {
          conta +=(minutos - 100)*2.0;
      }
      
      System.out.printf("Valor da conta = R$ %.2f%n", conta);
      
 sc.close();
    }
}
