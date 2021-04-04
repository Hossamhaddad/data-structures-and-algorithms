public class ArrayReverse{
public static void main(String[] args) {
    int[] numbers={1, 2, 3, 4, 5, 6};
    reverseArray(numbers,numbers.length);

}
static int[]  reverseArray (int[] data,int n) {
 int counter=0; 
 int[] newARR= new int[n];
 for(int i=n-1;i>=0;i--){
newARR[counter]=data[i];
 counter++;
 }
    return newARR;
}
}