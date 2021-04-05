import java.util.ArrayList;

public class ArrayShift{
    public static void main(String[] args) {
        int[] numbers={1, 2, 3, 4, 5, 6};
        insertShiftArray(numbers, 7);
    }
    public static ArrayList insertShiftArray(int[] values, int newElement){
        ArrayList<Integer> shift= new ArrayList<>();
        for(int i=0;i<values.length;i++){
          if(i!= values.length/2){
            shift.add(values[i]);
          }else {
            shift.add(newElement);
          }

        }
       System.out.println(shift);
       return shift;
    }
    }

