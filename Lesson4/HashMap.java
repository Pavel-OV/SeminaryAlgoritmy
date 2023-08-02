package Lesson4;

import java.util.Iterator;

public class HashMap<K, V> implements Iterable<HashMap.Entity> {
    private static final int int_bucket_const = 16;
    private Bucket[] buckets;
    private int currentBucketIndex;
    private Bucket.Node currentNode;

    class Entity {
        K key;
        V value;
    }

    class Bucket<K, V> {

        Node head;

        class Node {
            Node next;
            Entity value;

        }

        public V add(Entity entity) {
            Node node = new Node();
            node.value = entity;
            if (head == null) {
                head = node;
                node.next = null;
            }
            Node currentNode = head;
            while (true) {
                if (currentNode.value.key.equals(entity.key)) {
                    V buf = (V) currentNode.value.value;
                    currentNode.value.value = entity.value;
                    return buf;
                }
                if (currentNode.next != null) {
                    currentNode = currentNode.next;
                } else {
                    currentNode.next = node;
                    return null;
                }
            }

        }

        public V get(K key) {
            Node node = head;
            while (node.next != null) {
                if (node.value.key.equals(key))
                    return (V) node.value.value;
                node = node.next;
            }

            return null;
        }

        public V remove(K key) {
            if (head == null)
                return null;
            if (head.value.key.equals(key)) {
                V buf = (V) head.value.value;
                head = head.next;
                return buf;
            } else {
                Node node = head;
                while (node.next != null) {
                    if (node.next.value.key.equals(key)) {
                        V buf = (V) node.next.value.value;
                        node.next = node.next.next;
                        return buf;
                    }
                    node = node.next;
                }
                return null;
            }
        }

    }

    /*
     * Вычисляем индекс массива
     */
    private int calculateBucketIndex(K key) {
        int index = key.hashCode() % buckets.length; // buckets.length размер массива
        index = Math.abs(index);// проверка на отрицательное значение
        return index;
    }

    /**
     * Добавить новую пару ключ - значения
     * 
     * @param key   ключ
     * @param value значение
     * @return предыдущие значение(при совпадении ключа) иначе null
     */
    public V put(K key, V value) {
        int index = calculateBucketIndex(key);
        Bucket bucket = buckets[index];
        if (bucket == null) {
            bucket = new Bucket();
            buckets[index] = bucket;
        }
        Entity entity = new Entity();
        entity.key = key;
        entity.value = value;
        return (V) bucket.add(entity);

    }

    public V get(K key) {
        int index = calculateBucketIndex(key);
        Bucket bucket = buckets[index];
        if (bucket == null)
            return null;
        return (V) bucket.get(key);

    }

    public V remove(K key) {
        int index = calculateBucketIndex(key);
        Bucket bucket = buckets[index];
        if (bucket == null)
            return null;
        return (V) bucket.remove(key);

    }

    public HashMap() {
        // buckets = new Bucket[int_bucket_const];
        this(int_bucket_const);

    }

    public HashMap(int initCount) {
        buckets = new Bucket[initCount];

    }

    @Override
    public Iterator<HashMap.Entity> iterator() {
        return new HashMapIterator();
    }

    public class HashMapIterator implements Iterator<HashMap.Entity> {

        @Override
        public boolean hasNext() {
            if (currentNode == null) {
                for (int i = 0; i < buckets.length; i++) {
                    if (buckets[i] != null && buckets[i].head != null)
                        currentNode = buckets[i].head;
                    currentBucketIndex = i;
                    return true;
                }
                // }
            } else {
                if (get((K) currentNode.value.key) == null) {
                    currentNode = null;
                    currentBucketIndex = 0;
                    return hasNext();
                } else {
                    HashMap.Bucket.Node node = currentNode;
                    currentBucketIndex = calculateBucketIndex((K) node.value.key);
                    if (node.next != null) {
                        currentNode = node.next;
                        return true;
                    }
                    for (int i = ++currentBucketIndex; i < buckets.length; i++) {
                        if (buckets[i] != null && buckets[i].head != null) {
                            currentBucketIndex = i;
                            currentNode = buckets[i].head;
                            return true;
                        }
                    }
                    currentNode = null;
                    currentBucketIndex = 0;
                    return false;
                }
            }
            if (currentNode != null && currentNode.next != null) {
                return true;
            }
            return false;
        }

        @Override
        public Entity next() {
            if (hasNext()) {
                currentNode = currentNode.next;
                // System.out.println(hasNext());
            } else {
                for (int i = currentBucketIndex + 1; i < buckets.length; i++) {
                    if (buckets[i] != null && buckets[i].head != null) {
                        currentBucketIndex = i;
                        currentNode = buckets[i].head;
                        break;
                    }
                }
            }
            return (HashMap.Entity) currentNode.value;
        }
    }

}
