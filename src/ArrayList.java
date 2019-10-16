import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    private final Object array[];
   
    public ArrayList () {
        array = new Object[10];
    }
    
    public ArrayList (Object arr[]) {
        array = Arrays.copyOf (arr, arr.length * 2);
    }
    
    @Override
    public void add(T item) throws Exception {
    	if(array.length < 0 ){
	    }

    }

    @Override
    public void add(int pos, T item) {

    }

    @Override
    public T get(int pos) {
        return null;
    }

    @Override
    public T remove(int pos) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
    
    
}
