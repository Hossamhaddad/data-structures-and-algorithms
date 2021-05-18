/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package insertion;

public class App {

    public static void main(String[] args) {
    int testArr[]= {5,9,7,5,8,6,-3};

      insertionSort(testArr);
    }

public static int [] insertionSort(int[] arr){
  int n = arr.length;
  for (int i = 1; i < n; i++){
    int temp = arr[i];
    int j = i -1;

    while (j>=0 && arr[j] > temp){
      arr[j+1] = arr[j];
      j = j - 1;

    }
    arr[j+1] = temp;
  }

  for (int element: arr) {
    System.out.println(element);
  }
  return arr;
}
}

