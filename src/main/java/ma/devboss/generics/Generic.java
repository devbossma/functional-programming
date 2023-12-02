package ma.devboss.generics;

public class Generic <T> {
    T x;

    public Generic(T x) {
        this.x = x;
    }
    public T getX(){
        return this.x;
    }
}
