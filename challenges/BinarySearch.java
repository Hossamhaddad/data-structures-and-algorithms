import org.junit.Test;
import static org.junit.Assert.*;
public class BinarySearch{
  public static void main(String[] args)
  {
   int [] sort={2,3,4,5,6,7};


    System.out.println(binarySearch(sort,11));
  }
  public static int binarySearch(int[] data, int n) {
    int smallNum=0;
    int highNum=data.length-1;
    int middleNum=-1;
    while( smallNum <= highNum ) {
      middleNum = (smallNum+highNum)/2;
      if (data[middleNum]>n) {
        highNum=middleNum-1;
      }else if(data[middleNum]<n){
        smallNum=middleNum+1;
      }else{
        return middleNum;
      }
    }
    return -1;
  }

  @Test public void testExistedKey(){
    int [] sort={2,3,4,5,6,7};
    assertEquals("the result should be 2 ",2,binarySearch(sort,4));
  }
  @Test public void notExistedKey(){
    int [] sort={2,3,4,5,6,7};
    assertEquals("the result should be 2 ",-1,binarySearch(sort,10));
  }
}



