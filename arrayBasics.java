class arrayBasics {
  public static void main(String[] args) {
    int[] data = new int[20];   //initialising an array 
    int[] age = {13, 22, 64, 9, 5};
    data[5] = 13;   //assigning value to array
    data[10] = 26;
    data[15] = 39;
    data[4] = data[5]+ data[15];   //updating value of array
    System.out.println(data [0]);
    System.out.println(data [4]);
    System.out.println(data [8]);
    System.out.println(data [10]); 
    System.out.println(data [5]);   //printing value in an array
    System.out.println(data[8] + "\t" + data[4]);
  }
}