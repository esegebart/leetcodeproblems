package com.leetcodeproblems.practice;

public class MyMapTable {



    class Entry<K, V>{
        final K key; //does not change
        V value ;
        Entry<K, V> next;

        // constructor

        public Entry(K key, V value, Entry<K,V> next){
            this.key = key;
            this.value = value;
            this.next = next;
        }


        // get the value which returns the value
        public V getValue() {
            return value;
        }

        // get key method which returns key
        public K getKey() {
            return key;
        }

        // get entry which moves to next
        public Entry<K, V> getNext() {
            return next;
        }
    }
}
