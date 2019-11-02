package main.java.dao;

import main.java.entity.Card;

import java.io.IOException;

/**
 * @ProjectName: MybatisPractice2
 * @Package: main.java.dao
 * @ClassName: CardDao
 * @Author: 吕宁静
 * @Description: CardDao类
 * @Date: 2019/11/1 19:51
 * @Version: 1.0
 */
public interface CardDao {
    void insertCard(Card card) throws IOException ;
    void deleteCardByCid(int cid) throws IOException ;
    int getMoney(int cid) throws IOException ;
    void change(int cid, int addition) throws IOException ;
    void consume(int cid, int expense) throws IOException;
}
