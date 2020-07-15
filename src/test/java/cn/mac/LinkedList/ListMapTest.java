package cn.mac.LinkedList;

import cn.mac.Compare.Child;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author shen jiahuan
 * @version 1.0
 * @date 2020/6/28 4:22 PM
 */
public class ListMapTest {

    @Test
    public void LinkedTest(){
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("E");
        list.add("C");
        list.add("B");

        list.removeFirst();
        //list.removeLast();
        System.out.println(list);
    }

    @Test
    public void ArrayListTest(){
        ArrayList<String> list = new ArrayList<>();

    }

    @Test
    public void HashMapTest(){
        HashMap<String,String> map = new HashMap<>();
    }

    @Test
    public void ConcurrentHashMapTest(){
        ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>();
    }

    @Test
    public void HashSetTest(){
        HashSet<String> map = new HashSet<>();
    }

    @Test
    public void VectorTest(){
        Vector<String> map = new Vector<>();
    }


    @Test
    public void HashtableTest(){
        Hashtable<String,String> map = new Hashtable<>();
    }

    @Test
    public void TreeSetTest(){
        TreeSet<Child> childrens = new TreeSet<>();
        Child child1 = new Child(1, 14);
        Child child2 = new Child(2, 12);
        Child child3 = new Child(3, 10);
        childrens.add(child1);
        childrens.add(child2);
        childrens.add(child3);
        System.out.println(childrens);
    }

    @Test
    public void TreeMapTest(){
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(3, "val");
        map.put(2, "val");
        map.put(1, "val");
        map.put(5, "val");
        map.put(4, "val");
        System.out.println(map);
    }

    @Test
    public void LinkedHashSetTest(){
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.remove("a");
    }

    @Test
    public void ArrayTest(){
        String[] list = new String[10];
    }


    
}
