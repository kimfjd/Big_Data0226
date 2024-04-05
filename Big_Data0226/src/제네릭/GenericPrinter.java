package 제네릭;

public class GenericPrinter<T> {
    private T material;
    public void setMatercal(T matercal){
        this.material = material;
    }
    public T getMaterial() {
        return material;
    }
    public String toString() {
        return material.toString();
    }
}
