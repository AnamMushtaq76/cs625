public class Operators
 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=20, b=10,c=0,d=20 ,e=40 ,f=30;
        boolean condition=true;
        c=++a;
        System.out.println("Value of c (++a)=" +c);
        c=b++;
        System.out.println("Value of c (b++)=" +c );
        c=--d;
        System.out.println("Value of c (--d)=" +c);
        c=--e;
        System.out.println("Value of c (--e)=" +c);
        System.out.println("Value of condition=" + !condition);
        
        
    }
    
}