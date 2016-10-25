/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compile;

/**
 *
 * @author ahmed samir
 */
 class NewClass  {
    int x=6;
    @Override
    public void finalize ()
    {
        
        System.out.println("finalize");
    }
    
//    public void m1 (double i)
//    {
//        
//        
//    }
    public int m1 (int i)
    {
        
        return 0;
    }
    public void obj(NewClass       o)
    {
        
    }
    public NewClass rte ()
    {
        return new NewClass();
//        System.gc();
        
    }
        
    
    public void inner (int v )

    {
        class inner{
            
            public void inner (int t)
            {
                
                System.out.println(x);
                System.out.println(t);
                System.out.println(v);
                
            }
            
            
        }
        
    }
            void show ( float i)
            {
                
                
            }
            
            void print ()
            {
                
                System.out.println(x);
            }
            
            
            } 


