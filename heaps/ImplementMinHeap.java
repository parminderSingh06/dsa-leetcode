package heaps;

import java.util.ArrayList;

public class ImplementMinHeap {
    
    ArrayList<Integer> heap = new ArrayList<>();

    public void insert(int value){
        heap.add(heap.size(),value);
        heapifyUp(heap.size()-1);
    }

    public int remove(){
        
    }

    public int peak(){
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

    }
}
