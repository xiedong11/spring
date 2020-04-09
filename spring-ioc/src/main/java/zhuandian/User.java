package zhuandian;

public class User {

    private String name;

    public User() {
        System.out.println("user 无参构造方法被调用。。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
