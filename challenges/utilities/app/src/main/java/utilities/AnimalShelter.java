package utilities;

public class AnimalShelter {
  Queue<Dog> dogQ = new Queue<>();
  Queue<Cat> catQ = new Queue<>();

  public void enqueue(Animal animal){
    if (animal instanceof Cat){
      catQ.enqueue((Cat) animal);
    }else if (animal instanceof Dog){
      dogQ.enqueue((Dog) animal);
    }else {
      System.out.println("shlter is only for dog and cat");;
    }
  }
  public Animal dequeue(String str) {
    if (str.equals("cat")||str.equals("Cat")){
      return catQ.dequeue();
    }else if (str.equals("dog")||str.equals("Dog")){
      return dogQ.dequeue();
    }
    return null;
  }
}
