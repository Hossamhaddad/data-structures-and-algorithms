package hashtable;

public class HashNode <T>{
  public T key;
  public T value;

  public T getKey() {
    return key;
  }

  public void setKey(T key) {
    this.key = key;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public HashNode getNext() {
    return next;
  }

  public void setNext(HashNode next) {
    this.next = next;
  }

  public HashNode next;

  public HashNode(T key, T value, HashNode next) {
    this.key = key;
    this.value = value;
    this.next = next;
  }
}
