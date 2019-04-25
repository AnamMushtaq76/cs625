public class BubbleSortProgram
 {

   
    public static void main(String[] args) {
       int size=5;
       int t;
    
       int num[]={3,6,1,8,2};
     
      
       
     
        for(int a=1;a<size;a++)
        {
           for( int b=size-1;b>=a;b--)
           {
               if(num[b-1]>num[b])
               {
                   t=num[b-1];
                   num[b-1]=num[b];
                   num[b]=t;
               }
           }
        }
        for(int i=0;i<5;i++)
        {
            System.out.print("  " +num[i]);
        }
    }
    
}
