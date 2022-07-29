import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("How many numbers would you like?");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int[] data = new int[num];
    for (int i = 0; i < num; i++) {
      System.out.println("Enter the numbers you would like:");
      data[i] = s.nextInt();
    }
    for (int i = 0; i < num - 1; i++) {
      for (int j = 0; j < num - i - 1; j++) {
        if (data[j] > data[j + 1]) {
         int temp = data[j];
          data[j] = data[j + 1];
          data[j + 1] = temp;
        }
      }
    }
    for (int i = 0; i < num; i++) {
      System.out.print(data[i] + ", ");
    }
  }
}