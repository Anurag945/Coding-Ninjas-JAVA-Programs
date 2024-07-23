

class threadcolor extends Thread{
    private String color;

    public void setcolor(String color){
        this.color=color;
    }
}


public void run(){
    for(int i=0;i<5;i++){
        System.out.println( color + "thread"+i);
    }
    Thread.sleep(1000);
}




public class multithreadingg {

    public static void main(String[] args) {
        threadcolor red= new setcolor("red");

    }
    
}
