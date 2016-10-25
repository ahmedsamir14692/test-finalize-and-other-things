
package compile;


public class NewClass1 extends NewClass {
    int y=4;
    @Override
    public int m1(int i) 
    {
        
        return 7;
    }
    
   void show (float i) 
            {
                //this is over loading
//                return 6 ;
            }
   
//    @Override
//    void show ( int i)
//            {
//                
//                
//            }
    @Override
    void print ()
            {
                prit();
                System.out.println(y);
            }
    
     void prit ()
            {
                
                System.out.println("ahmed");
            }
}
