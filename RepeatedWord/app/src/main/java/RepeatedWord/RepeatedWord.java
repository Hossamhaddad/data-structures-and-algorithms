/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package RepeatedWord;

import java.util.ArrayList;
import java.util.List;

public class RepeatedWord {


    public static void main(String[] args) {
      String test="It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
     RepeatedWord word=new RepeatedWord();
     word.repeted(test);
      System.out.println(word.repeted(test));
    }


  public String repeted(String paragraph){
    List words=new ArrayList();
    String word="";
    for(int i=0;i<paragraph.length();i++){
      if((int)paragraph.charAt(i)!=32&&(int)paragraph.charAt(i)!=44&&(int)paragraph.charAt(i)!=46){
        word +=paragraph.charAt(i);
      }
      if((int)paragraph.charAt(i)==32||i==paragraph.length()-1){

     if(words.contains(word)){
       words.add(word.toLowerCase());
       return word;
     }
        words.add(word.toLowerCase());
      word="";
      }
    }
    return null;
  }

}
