class multiplesOfFive {
  public static void main(String[] args) {
    int[] data = new int [51];
    int count = 0;
    for (int i = 0; i<251; i=i+5){
      data[count] = i;
      count = count+1;
    }
    for (int i = 0; i<=50;i++)
      System.out.println(data[i]);
  }
}