class Green extends Thread{  
Table t;  
Green(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(60);  
}   
}   