class MyHashSet {

    private boolean[] arr;

    /** Initialize your data structure here. */
    public MyHashSet() {
        this.arr = new boolean[1000000];
    }
    
    public void add(int key) {
        this.arr[key] = true;
    }
    
    public void remove(int key) {
        this.arr[key] = false;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(this.arr[key]) return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */