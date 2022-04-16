class Fillingoddvaluesinanarray {
  public static void main(String[] args) {
    int[] data = new int[50];
    int count = 0;
    for (int i = 1;i <= 100; i=i+2){
      data[count] = i;
      count = count+1;
     //  System.out.println(data[count]);
    }
    for (int i= 0; i<=49; i++){
      System.out.println(data[i]);
    }
  }
}