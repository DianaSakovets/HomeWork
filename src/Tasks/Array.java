package Tasks;

public class Array<T> {
    protected T[] array;

    public Array(T[] array) {
        this.array = array;
    }

    public <T> void print(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public T getElementByIndex(int index) throws ArrayIndexOutOfBoundsException {
        for (index = index; index < array.length; ) {

            System.out.println(array[index]);
            break;

        }
        if (index > array.length) {
            throw new ArrayIndexOutOfBoundsException("Index value is bigger than array length");
        }
        return array[index];
    }

    public static void main(String[] args) {
        String[] string1 = {"hhh", "ggg", "kkk"};
        Integer[] integer1 = {1, 2, 4, 6,};
        Boolean[] boolean1 = {true, false, true};
        Array<String> array1 = new Array(string1);
        Array<Integer> array2 = new Array(integer1);
        Array<Boolean> array3 = new Array(boolean1);
        array1.getElementByIndex(5);
    }
}
