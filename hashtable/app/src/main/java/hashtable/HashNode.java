package hashtable;

public class HashNode {
  public String key;
  public String value;

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public HashNode getNext() {
    return next;
  }

  public void setNext(HashNode next) {
    this.next = next;
  }

  public HashNode next;

  public HashNode(String key, String value, HashNode next) {
    this.key = key;
    this.value = value;
    this.next = next;
  }
}
