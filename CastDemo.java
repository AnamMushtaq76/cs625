public class CastDemo
 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x,y;
        int i;
        byte b;
        char ch;
        x=10.0;
        y=3.0;
        i=(int)(x/y);
        System.out.println("integer outcom of x/y:" +i);
        i=100;
        b=(byte)i;
        System.out.println("Value of b:" +b);
        b=88;
        ch=(char)b;
        System.out.println("ch:"+ch);
        
    }
    
}
