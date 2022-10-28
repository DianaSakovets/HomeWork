package Tasks;

public class Pair<T, E> {

    protected T element1;
    protected E element2;


    public Pair(T element1, E element2) {
        this.element1 = element1;
        this.element2 = element2;
    }

    public T returnFirst(){
        System.out.println(element1);
        return element1;
    }
    public E returnSecond(){
        System.out.println(element2);
        return element2;
    }
    public Pair changePlacesOfElements(){
        Pair <E, T> pair = new Pair<>(element2, element1);
        System.out.println(pair);
        return pair;
    }
    public Pair<T, E> replaceFirst(T newElement){
        Pair <T, E> pair = new Pair<>(newElement, element2);
        System.out.println(pair);
        return pair;
    }
    public Pair replaceSecond(E newElement){
        Pair <T, E> pair = new Pair<>(element1, newElement);
        System.out.println(pair);
        return pair;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "element1=" + element1 +
                ", element2=" + element2 +
                '}';
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hello", 33);
        pair1.returnFirst();
        pair1.changePlacesOfElements();
        pair1.replaceSecond(4);
    }

}