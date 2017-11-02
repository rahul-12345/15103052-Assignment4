//example of java synchronized method  
class Table{  
 synchronized void printTable(int n){//synchronized method  
   for(int i=1;i<=n;i++){  
     System.out.println(i);  
     try{  
      Thread.sleep(500);  
     }catch(Exception e){System.out.println(e);}  
   }  
 }  
}   
