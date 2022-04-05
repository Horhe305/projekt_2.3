import java.util.Scanner; 
class Main {
  public static void main(String[] args)
  {
       Scanner Obj = new Scanner(System.in); 

      int tab[] = new int[10];

      System.out.println("Podaj 10 liczb całkowitych:");
    for (int i = 0; i <= 10; i++)
      {
        System.out.println("Podaj " + (i + 1) + " liczbę:");
        tab[i] = Obj.nextInt();
      }
  }
}