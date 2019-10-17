import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    private Object[] array;
   private int size;
    public ArrayList () {
        array = new Object[10];
    }
    public Object[] doubleSize(Object[] arr){
    	return Arrays.copyOf (arr, arr.length * 2);
    }
    
    @Override
    public void add(T item) {
	  //  System.out.println ("The size: " + size () + " The Length: " + array.length );
    	if(size () == array.length)
	    {
		    array = doubleSize (array);
		  
	    }
    	
	    array[size++]=item;

    }

    @Override
    public void add(int pos, T item) throws Exception {
    	if(pos < 0 || pos > size ()){
    		throw new Exception ();
	    }
    	if(size () == array.length){
		   array = Arrays.copyOf (array, array.length*2);
	    }
    	for(int i = size (); i>pos; i--){
		  //  System.out.println ("before: Element: " + array[i]);
		    array[i]=array[i-1];
//		    System.out.println ("After: Element: " + array[i]);
//		    System.out.println ();
		
		
	    }
	   // System.out.println ("Old Element at pos: "  + array[pos]);
    	array[pos] = item;
    	size++;
	  //  System.out.println ("New Element at pos: "  + array[pos]);
    	
     

    }

    @Override
    public T get(int pos) throws Exception {
        if(pos >= size() || pos < 0){
	        throw new Exception ();
        }
        return (T) array[pos];
    }

    @Override
    public T remove(int pos) throws Exception {
       if(pos< 0 || pos>=size){
       	throw new Exception ();
       }
       T element = (T) array[pos];
       for(int i = pos; i <size; i ++){
       	array[i]=array[i+1];
       }
       --size;
       return element;
    }

    @Override
    public int size() {
        return size;
    }
    
    
}
