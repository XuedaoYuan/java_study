package database;

import java.util.List;

public interface DAO {
    // 增删改
    public void add(Hero hero);
    public void update(Hero hero);
    public void delete(int id);
    // 获取
    public Hero get(int id);
    // 查询
    public List<Hero> list();
    // 分页查询
    public List<Hero> list(int index, int size);
}
