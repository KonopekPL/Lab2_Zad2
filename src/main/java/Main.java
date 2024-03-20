// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
        Scanner scaner = new
      Scanner(System.in);
        int najmniejsza;
        System.out.println("Podaj pierwszą liczbę:");
        najmniejsza = scaner.nextInt();
        for (int i = 1; i < 5; i++){
            System.out.println("Podaj kolejną liczbę:");
            int liczba = scaner.nextInt();
            if (liczba < najmniejsza){
                najmniejsza = liczba;
            }
        }
        System.out.println("Najmniejsza liczba to: " + najmniejsza);
        scaner.close();
    }
}