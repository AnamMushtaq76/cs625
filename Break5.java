public class Break5
 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        done:
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                for(int k=0;k<10;k++)
                {
                    System.out.println(k+" ");
                    if(k==5)
                    {
                        break done;
                    }
                }
                System.out.println("after k loop");
            }
            System.out.println("after j loop");
        }
        System.out.println("after i loop");
    }
    
}
