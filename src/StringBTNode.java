public class StringBTNode {
  private String value;
  private StringBTNode left;
  private StringBTNode right; 
  
  StringBTNode(String inValue){
    value = inValue;
  }
  
  public String toString() {
    return value;
  }
  
  public StringBTNode search(String inValue) {
     return null; // change this line
  }
  
  public int depth(String inValue) {
      return -1; // change this line
  }
  
  public int height() {
       return -1; // change this line
  }
  
  public int numNodes() {
        return -1; // change this line
  }
  
  public void insert(String inVal) {
  
  }
  
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + toString());
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    else if(right != null) System.out.println(prefix + "\u251C " + "\u2400");
    if(right != null) right.print(prefix + "\u2514 ");
    else if(left != null) System.out.println(prefix + "\u2514 " + "\u2400");
  }
  
}
