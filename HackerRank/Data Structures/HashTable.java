// Only a high level overview of a hash table

public class HashTable{
    LinkedList[] data;
    boolean put(String key, Person value){
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);
        Linked list = data[index];
        list.insert(key,value); // check for dupes
    }
}