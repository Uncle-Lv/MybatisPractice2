package main.java.entity;

/**
 * @ProjectName: MybatisPractice2
 * @Package: main.java.entity
 * @ClassName: Cid
 * @Author: 吕宁静
 * @Description: 饭卡实体类
 * @Date: 2019/11/1 19:29
 * @Version: 1.0
 */
public class Card {
    private int cid;
    private int money;
    private int count;

    public Card() {
    }

    public Card(int cid, int money, int count) {
        this.cid = cid;
        this.money = money;
        this.count = count;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cid=" + cid +
                ", money=" + money +
                ", count=" + count +
                '}';
    }
}
