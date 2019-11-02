package main.java.entity;

/**
 * @ProjectName: MybatisPractice2
 * @Package: main.java.entity
 * @ClassName: Student
 * @Author: 吕宁静
 * @Description: 学生实体类
 * @Date: 2019/11/1 19:26
 * @Version: 1.0
 */
public class Student {
    private int id;
    private String name;
    private String phone;
    private String address;
    private int cid;
    private Card card;

    public Student() {
    }

    public Student(String name, String phone, String address, int cid) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.cid = cid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", cid='" + cid + '\'' +
                '}';
    }
}
