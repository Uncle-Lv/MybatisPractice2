package main.java.dao;

import main.java.entity.Card;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ProjectName: MybatisPractice2
 * @Package: main.java.dao
 * @ClassName: CardDaoImpl
 * @Author: 吕宁静
 * @Description: CardDaoImpl
 * @Date: 2019/11/1 20:31
 * @Version: 1.0
 */
public class CardDaoImpl implements CardDao {
    private InputStream is;
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;

    public CardDaoImpl() {
    }

    private void init() throws IOException {
        is = Resources.getResourceAsStream("main/resources/sqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        sqlSession = sqlSessionFactory.openSession();
    }

    @Override
    public void insertCard(Card card) throws IOException {
        this.init();
        sqlSession.insert("insertCard", card);
        sqlSession.commit();
        System.out.println("添加成功！");
        this.close();
    }

    @Override
    public void deleteCardByCid(int cid) throws IOException {
        this.init();
        sqlSession.delete("deleteCardByCid", cid);
        sqlSession.commit();
        this.close();
    }

    @Override
    public int getMoney(int cid) throws IOException {
        this.init();
        int money = sqlSession.selectOne("getMoneyByCid", cid);
        sqlSession.commit();
        this.close();
        return money;
    }

    @Override
    public void change(int cid, int addition) throws IOException {
        this.init();
        int money = sqlSession.selectOne("getMoneyByCid", cid);
        sqlSession.commit();
        Card card = new Card();
        card.setCid(cid);
        money += addition;
        card.setMoney(money);
        sqlSession.update("updatePhoneById", card);
        sqlSession.commit();
        this.close();
    }

    @Override
    public void consume(int cid, int expense) throws IOException {
        this.init();
        int money = sqlSession.selectOne("getMoneyByCid", cid);
        sqlSession.commit();
        Card card = new Card();
        card.setCid(cid);
        money -= expense;
        card.setMoney(money);
        sqlSession.update("updatePhoneById", card);
        sqlSession.commit();
        this.close();
    }

    private void close() {
        sqlSession.close();
    }
}
