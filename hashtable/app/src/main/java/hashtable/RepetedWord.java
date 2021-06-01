package hashtable;

public class RepetedWord {

  public static void main(String[] args){
 String test="This is it is it is is it it it ";
 mostRepeted(test);
    System.out.println( mostRepeted(test));
  }
  HashTable wordsTable=new HashTable();
  public static String mostRepeted(String words){
    HashNode highestValue=null;
    int counter=0;
    HashTable wordsTable=new HashTable();
    String[] word=words.split(" ");
  for(int i=0;i<word.length;i++){
    HashNode wordNode=new HashNode(word[i],counter,null);
   if(wordsTable.contains(word[i])){
     HashNode tableWord=wordsTable.get(word[i]);
     tableWord.value=counter++;
   }else {
     wordsTable.add(new HashNode(word[i],counter++,null));
   }
   }
    int value=0;
  for(int i=0;i<wordsTable.hashTable.length;i++){
    HashNode current=wordsTable.hashTable[i];
    while (current!=null){
      if((int)current.value>value){
        value=(int)current.value;
        highestValue=current;
      }
      current=current.next;
    }
    }
  return (String) highestValue.key;
  }
  }

