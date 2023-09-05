public class duplicateArray {
    public static void main(String args[]) {
      int[] aRR1 = new int[]{15,12,13,15,16,84,56,84,20,10};
      for(int i=0; i<aRR1.length; i++){
     //System.out.println("Elements in the array are:" + aRR1[i] );
      for(int j=i+1; j<aRR1.length; j++){
          if(aRR1[i]==aRR1[j]){
          System.out.println("Duplicate found @ " + i + " & " + j + ": " + aRR1[i]);
      }
    }
   }
 }
}
