package heaps;

import java.util.ArrayList;

public class ImplementMinHeap {
    
    ArrayList<Integer> heap = new ArrayList<>();

    public void insert(int value){
        heap.add(heap.size(),value);
        heapifyUp(heap.size()-1);
    }

    public int remove(){
        int tempVar = peek();
        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        heapifyDown(0);
        return tempVar;
    }

    public int peek(){
        if(!heap.isEmpty()) return heap.get(0);
        throw new Error("Heap is empty.");
    }

    public void heapifyUp(int i){
        if(i == 0) return;
        int parentIndex = (i-1)/2;
        while(i > 0 && heap.get(parentIndex) > heap.get(i)){
            int temp = heap.get(parentIndex);
            heap.set(parentIndex, heap.get(i));
            heap.set(i, temp);
            i = parentIndex;
            parentIndex = (i-1)/2;
        }
    }

    public void heapifyDown(int i){
        if(heap.size() == 0 || heap.size() == 1) return;        
        int size = heap.size();
        while(2*i+1 < size){
            int smaller = 2*i+1;
            if(2*i+2 < size && heap.get(2*i+1) > heap.get(2*i+2)) smaller = 2*i+2;
            if(heap.get(i) <= heap.get(smaller)) break;
            int temp = heap.get(i);
            heap.set(i, heap.get(smaller));
            heap.set(smaller, temp);
            i = smaller;
        }
    }
}
