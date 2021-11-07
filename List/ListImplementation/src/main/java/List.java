public class List {
    public static final int CAPACITY = 100;
    public static final int DEFAULTINCREMENT = 10;
    private int capacity;
    private int size;
    private int elements[];

    public List(int capacity) throws IllegalArgumentException{
        if (capacity <= 0)
            throw new IllegalArgumentException();
        
        elements = new int[capacity];
        
        for(int i = 0; i < elements.length; i++){
            elements[i] = -1;
        }
        this.capacity = capacity;
    }
    
    public List() {
        this(CAPACITY);
    }
    
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    private void resize(){
        int temp[];
        temp = new int[size + 1];
        
        for (int i = 0; i < size; i++){
            temp[i] = elements[i];
        }
        
        elements = temp;
    }
    
    public void add(int key) {
        if (size >= capacity) resize();
        
        elements[size] = key;
        size++;
        
        for (int i = 1; i < elements.length; i++) {
            int j;
            j = i;
            while (j > 0  && elements[j-1] > elements[j]) {
                int tmp = elements[j];
                if(tmp != -1){
                    elements[j] = elements[j - 1];
                    elements[j - 1] = tmp;
                }
                j--;
            }
        }

    }
    public void remove (int key) throws IndexOutOfBoundsException {
        int index = -1;
        for (int i = 0; i < size; i++){
           if(elements[i] == key){
               index = i;
               break;
           }
        }
        
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Índice fora dos limites");
        
        for (int i = index; i < size-1; i++){
            elements[i] = elements[i + 1];
        }
        
        size--;
        elements[size] = -1;
    }
    
    public int get(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Índice fora dos limites");

        return elements[index];
    }
    
    public int indexOf(int key){
        int low, high, mid;

        low = 0;
        high = size - 1;
        
        while (low <= high){
            mid = (low + high) / 2;
            if (elements[mid] == key)
                return(mid);
            else
                if (elements[mid] > key)
                    high = mid - 1;
                else
                    low = mid + 1;
        }
        
        return -1;
     }
    
    @Override
    public String toString(){
        String string = "[";
        
        for(int i = 0; i < elements.length; i++){
            if(elements[i] != -1){
                string += " " + elements[i] + ",";
            }
        }
        
        string =  string.substring(0, string.length() - 1);
        string += " ]";
        
        return string;
    }
}
