import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayInt implements IMath, ISort{
    private ArrayList<Integer> array;

    public ArrayList<Integer> getArray() {
        return array;
    }

    public void setArray(ArrayList<Integer> array) {
        this.array = array;
    }

    public ArrayInt(int c) {
        array = new ArrayList<>(c);
    }

    public void addArray (int n) {
        array.add(n);
    }

    public void replaceArray (int x, int y) {
        int index = array.indexOf(x);
        array.set(index, y);
    }

    @Override
    public String toString() {
        return "array: " + array;
    }

    @Override
    public int Max() {
        Collections.sort(array);
        int max = array.get(array.size() - 1);
        return max;
    }

    @Override
    public int Min() {
        Collections.sort(array);
        int min = array.get(0);
        return min;
    }

    @Override
    public float Avg() {
        float sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum = sum + array.get(i);
        }
        float avg = sum/array.size();
        return avg;
    }

    @Override
    public void SortAsc() {
        Collections.sort(array);
    }

    @Override
    public void SortDesc() {
        Collections.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

    }

}
