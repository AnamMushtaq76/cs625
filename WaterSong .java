public class WaterSong {
    public static void main(String[] args) {
        int waterNum=9;
        String word="bottles";
           while(waterNum>0)
        {
                 if(waterNum==1)
          {
              word="bottle";
          }
          System.out.println(waterNum+" " +word +" of water on wall");
          System.out.println(waterNum+" " +word +" of water");
          System.out.println("Take one down");
          System.out.println("Pass it down");
          waterNum=waterNum-1;
   
          if(waterNum>0)
          {
              System.out.println(waterNum+" " +word +" of water on wall");
          }
          
          else
          {
              System.out.println("No more bottles of water on wall ");
          }
    }
    }  
}
