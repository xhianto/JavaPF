package be.vdab.jpfhfdst7;

public class Getal {
//    public int x;
    private int x;
    public Getal(int a){
        this.x = a;
    }
    public void print(){
        System.out.println(x);
    }
    public int absoluut(){
        return Math.abs(x);
    }
    public int som(int a){
        return x + a;
    }

    public void add(int a){
        x = x + a;
    }

    public float som(float a){
        return x + a;
    }

    public double som(double a){
        return x + a;
    }

    public double toDouble(){
        return x;
    }
    public int getX(){
        return x;
    }
    public void setX(int a){
        this.x = a;
    }
}
