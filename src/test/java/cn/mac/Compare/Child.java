package cn.mac.Compare;

import java.util.Comparator;

/**
 * @author shen jiahuan
 * @version 1.0
 * @date 2020/6/28 5:58 PM
 */
public class Child implements Comparator<Child> ,Comparable<Child>{
    private Integer id;
    private Integer age;

    public Child() {
    }

    public Child(Integer id, Integer age) {
        this.id = id;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Child{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(Child o1, Child o2) {
        return o1.getAge() > o2.getAge() ? 1 : (o1.getAge() == o2.getAge() ? 0 : -1);
    }

    @Override
    public int compareTo(Child o) {
        if(this.age > o.getAge()){
            return -1;
        }else if(this.age < o.getAge()){
            return 1;
        }
        return 0;

    }
}
