package Tasks;

public class Iterator <T>  {
    public int i = 0;
    public T[] array;

    public Iterator(T[] array) {
        this.array = array;
    }


    public boolean hasNext() {
        return i < array.length;
    }

    public T next() {
        return array[i++];
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{3, 6, 5, 7, 4, 5};
        Iterator<Integer> iterator = new Iterator<Integer>(integers);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
