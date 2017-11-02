public class TrafficLightSynchronization{  
public static void main(String args[]){  
Table obj = new Table();//only one object  
Green t1=new Green(obj);  
Yellow t2=new Yellow(obj);
Red t3=new Red(obj); 
    System.out.println("Green signal");
     t1.start();  
     try{  
      t1.join();  
     }catch(Exception e){System.out.println(e);}  
    System.out.println("Yellow signal");

     t2.start(); 
     try{  
      t2.join();  
     }catch(Exception e){System.out.println(e);}      
         System.out.println("Red signal");
     t3.start();  
}  
} 