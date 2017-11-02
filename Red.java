class Red extends Thread{  
Table t;  
Red(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(60);  
}   
}   