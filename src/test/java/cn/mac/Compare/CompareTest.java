package cn.mac.Compare;


import org.junit.Test;

import java.util.*;

/**
 * @author shen jiahuan
 * @version 1.0
 * @date 2020/6/28 5:20 PM
 */


public class CompareTest {

    @Test
    public void ComparableTest(){
        User user1 = new User(1, 14);
        User user2 = new User(2, 12);
        User user3 = new User(3, 10);
        User user4 = new User(4, 10);
        User[] users = {user1, user3, user2,user4};
        Arrays.sort(users);
        Arrays.stream(users).forEach(System.out::println);
    }

    @Test
    public void ComparatorTest(){
        Child child1 = new Child(1, 14);
        Child child2 = new Child(2, 12);
        Child child3 = new Child(3, 10);

        ArrayList<Child> childrens = new ArrayList<>();
        childrens.add(child1);
        childrens.add(child2);
        childrens.add(child3);
        Collections.sort(childrens, new Comparator<Child>() {
            @Override
            public int compare(Child o1, Child o2) {
                return o1.getAge() > o2.getAge() ? 1 : (o1.getAge() == o2.getAge() ? 0: -1);
            }
        });
        // 或者使用JDK8中的Lambda表达式
        //Collections.sort(list, (o1, o2) -> (o1.getAge()-o2.getAge()));

        childrens.stream().forEach(System.out::println);

    }

    @Test
    public void ComparatorUserImplTest(){
        Child child1 = new Child(1, 14);
        Child child2 = new Child(2, 12);
        Child child3 = new Child(3, 10);

        List<Child> list = new ArrayList<>();
        list.add(child1);
        list.add(child2);
        list.add(child3);

        Collections.sort(list, new Child());
        list.stream().forEach(System.out::println);
    }


}
