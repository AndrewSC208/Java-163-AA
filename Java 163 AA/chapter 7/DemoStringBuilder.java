// demo string builder:
public class DemoStringBuilder
{
  public static void main(String[] args)
  {
    StringBuilder str = new StringBuilder("singing");
    print(str);
    str.append(" in the dead of");
    print(str);
    str.insert(0, "Black");
    print(str);
    str.insert(5, "bird");
    print(str);
  }
  
  // creat a method:
  public static void print(StringBuilder s)
  {
    System.out.println(s);
  }
}