public class Array{

    private int count = 0;
    private int cap = 4;
    private int[] arr = new int[cap];
    
    private void adjustCapacity(){
        if(count <= cap/4 && cap > 4){
            cap /= 2;
            int[] tempArr = new int[cap];
            for(int i=0;i<count;i++){
                tempArr[i] = arr[i];
            }
            arr = tempArr;
            return;
        }

        if(cap == count){
            cap *= 2;
            int[] tempArr = new int[cap];
            for(int i=0;i<count;i++){
                tempArr[i] = arr[i];
            }
            arr = tempArr;
            return;
        }
    }

    public int size(){
        return count;
    }

    public int capacity(){
        return cap;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public int at(int index){
        if(index >= count || index < 0){
            System.out.println("Invalid index.");
        }
        return arr[index];
    }

    public void push(int item){
        if(cap == count) adjustCapacity();
        arr[count++] = item;
        return;
    }

    public void insert(int item, int index){
        if(cap == count) adjustCapacity();
        if(index >= cap || index < 0){
            System.out.println("Error index is greater than arr size.");
            return;
        }
        if(index >= count){
            push(item);
            return;
        }
        
        for(int i=count;i>index;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = item;
        count++;
        return;
    }

    public void prepend(int item){
        insert(item, 0);
    }

    public void pop(){
        arr[--count] = 0;
        adjustCapacity();
    }

    public void delete(int index){
        if(index >= count || index < 0){
            System.out.println("Invalid index.");
            return;
        }
        if(index == count){
            pop();
            return;
        }

        for(int i=index;i<count;i++){
            arr[i] = arr[i+1];
        }

        count--;
        arr[count] = 0;
        adjustCapacity();
        return;
    }

    public int findItem(int item){
        for(int i=0; i<count;i++){
            if(arr[i] == item) return i;
        }
        return -1;
    }

    public void remove(int item){
        delete(findItem(item));
    }

    public void print(){
        System.out.println("\nArray size is: " + size());
        for(int i=0;i<count;i++){
            System.out.print(" " + arr[i] + " ");
        }
    }

}