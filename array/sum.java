public class sum {

    
    public static void main(String[] args) {
      System.out.println("Sum of values in a array");
      int sum=0;
      int[] arr ={10, 20 , 30 , 40, 50};
      for(int i=0; i<arr.length;i++){
        sum =sum+arr[i];

      }
      System.out.println(sum);
    }

}