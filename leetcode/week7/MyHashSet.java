import java.util.HashMap;
class MyHashSet {
    private int[] hashTable;
  
    public MyHashSet() {
        hashTable = new int[1000001];
        Arrays.fill(hashTable, -1);
    }
    
    public void add(int key) {
        hashTable[key] = key;
    }
    
    public void remove(int key) {
        hashTable[key] = -1;
    }
    
    public boolean contains(int key) {
        return hashTable[key] != -1;
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
