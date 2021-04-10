import java.util.ArrayList;

public class ArrayShift{
    public static void main(String[] args) {
        int[] oddNum={2,4,6,8,5};
      insertShiftArray(oddNum,9);
    }
    public static ArrayList insertShiftArray(int[] values, int newElement){
        ArrayList<Integer> shift= new ArrayList<>();
        for(int i=0;i<values.length;i++){
          if(i!=  values.length/2){
            shift.add(values[i]);
          }else {
            if(values.length%2==0){
              shift.add(newElement);
              shift.add(values[i]);
            }else {
              shift.add(values[i]);
              shift.add(newElement);
            }
          }
        }
       System.out.println(shift);
       return shift;
    }
    }


