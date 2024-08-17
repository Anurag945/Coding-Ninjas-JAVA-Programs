public final class vehicle implements printinterface{
private int speed;
private String color;


public String get_color(){
    return color;
}

public final int get_speed(){
    return speed;
}
public final void print(){
    System.out.println("vehicle color:"+color);
  
};
}

