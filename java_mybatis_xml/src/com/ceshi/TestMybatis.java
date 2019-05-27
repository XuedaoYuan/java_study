package com.ceshi;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ceshi.pojo.Girl;
import com.ceshi.pojo.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMybatis {
    private SqlSession session = null;

    public TestMybatis() {
        try {
            this.session = createSession();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        TestMybatis tm = new TestMybatis();
//        tm.insert();
//        tm.delete();
//        tm.update();
//        tm.getPerson(1);
//        tm.queryByName("jay");
//        tm.queryPersonByNameAndId("jay", 5);
//        tm.listPersonAndGirls();
//        tm.listAll();

//        tm.listGirls();\
//        tm.updateGirl();
//        tm.listGirls2();
        tm.listGirls3();

    }

    private SqlSession createSession() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        return session;
    }

    private void closeSession() {
        session.commit();
        session.close();
    }

    private void listAll() {
        List<Person> ps = this.session.selectList("listPerson");
        for (Person p : ps) {
            System.out.println(p);
        }
        this.closeSession();
    }

    private void insert() {
        Person p = new Person();
        p.setName("jay");
        p.setSex(1);
        p.setAge(30);
        this.session.insert("addPerson", p);
        this.closeSession();
    }

    private void delete() {
        Person p = new Person();
        p.setId(3);
        this.session.delete("deletePerson", p);
        this.closeSession();
    }

    private Person getPerson(int id) {
        Person p = this.session.selectOne("getPerson", id);
        System.out.println(p);
        this.closeSession();
        return p;
    }

    private void update() {
        Person p = new Person();
        p.setId(1);
        p.setName("袁学道");
        p.setAge(28);
        p.setSex(1);
        this.session.update("updatePerson", p);
        this.closeSession();
    }

    /*模糊查询*/
    private void queryByName(String name) {
        List<Person> ps = this.session.selectList("queryPersonByName", name);
        for (Person p : ps) {
            System.out.println(p);
        }
        this.closeSession();
    }

    private void queryPersonByNameAndId(String name, int id) {
        HashMap<String, Object> hm = new HashMap<>();
        hm.put("name", name);
        hm.put("id", id);
        List<Person> ps = this.session.selectList("queryPersonByNameAndId", hm);
        for (Person p : ps) {
            System.out.println(p);
        }
        this.closeSession();
    }

    private void listPersonAndGirls() {
        List<Person> ps = this.session.selectList("listPersonAndGirls");
        for (Person p : ps) {
            System.out.println(p);
            List<Girl> gs = p.getGirls();
            for (Girl g : gs) {
                System.out.println(g);
            }
        }
        this.closeSession();
    }

    private void listGirls() {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("name", "tt");
        // 不传就是全部查询， 不是模糊查询
        List<Girl> gs = this.session.selectList("listGirls", hm);
        for (Girl g : gs) {
            System.out.println(g);
        }
        this.closeSession();
    }

    private void listGirls2() {
        HashMap<String, Object> hm2 = new HashMap<>();
        hm2.put("name", "tt");
        hm2.put("pid", 1);
        // 不传就是全部查询， 不是模糊查询
        List<Girl> gs = this.session.selectList("listGirls2", hm2);
        for (Girl g : gs) {
            System.out.println(g);
        }
        this.closeSession();
    }

    private void updateGirl() {
        Girl g = new Girl();
        g.setId(5);
        g.setName("zcc");
        this.session.update("updateGirl", g);
    }

    private void listGirls3() {
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(3);
        ids.add(5);
        List<Girl> gs = this.session.selectList("listGirls3", ids);
        for (Girl g : gs) {
            System.out.println(g);
        }
        this.closeSession();
    }
}
