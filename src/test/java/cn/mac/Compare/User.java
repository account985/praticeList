package cn.mac.Compare;

/**
 * @author shen jiahuan
 * @version 1.0
 * @date 2020/6/28 5:29 PM
 */
public class User implements Comparable<User>{

    private Integer id;
    private Integer age;

    public User() {
    }

    public User(Integer id, Integer age) {
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
    public int compareTo(User o) {
        if(this.age > o.getAge()){
            return -1;
        }else if(this.age < o.getAge()){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}
