// java program to illustrate
// logical operators
public class operators3
{
  public static void main(String[] args)
 {
 String x ="Sher";
 String y ="Locked";
 
Scanner s = new Scanner(System.in);
System.out.print("Enter username:");
String uuid =s.next();
System.out.print("Enter password:")
String upwd = s.next();

 //check if user-name and password match or not.
if ((uuid.equals(x)&& upwd.equals(y))||
(uuid.equals(y)&& upwd.equals(x))
{
System.out.println("welcome user.");
}
else

{
System.out.println("wrong uid or password.");
}
}
}