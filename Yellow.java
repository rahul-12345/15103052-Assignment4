class Yellow extends Thread{  
Table t;  
Yellow(Table t){  
this.t=t;  
}  
public void run(){   
t.printTable(50);  
}   
}   