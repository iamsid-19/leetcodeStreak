class MyCircularQueue {
    ArrayBlockingQueue<Integer> q1;
    public MyCircularQueue(int k) {
        q1 = new ArrayBlockingQueue<>(k);
    }
    
    public boolean enQueue(int value) {
       
         return    q1.offer(value);

    }
    
    public boolean deQueue() {
        if(q1.isEmpty())
        {
            return false;
        }
        q1.poll();
        return true;
    }
    
    public int Front() {
        if(q1.isEmpty())
        {
            return -1;
        }
        return q1.peek();
    }
    
    public int Rear() {
        if(q1.isEmpty())
        {
            return -1;
        }
        Integer[] arr = q1.toArray(new Integer[0]);
        return arr[arr.length-1];
    }
    
    public boolean isEmpty() {
        return q1.isEmpty();
       
    }
    
    public boolean isFull() {
        return q1.remainingCapacity()==0;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */