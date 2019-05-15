package collection;

import charactor.Hero;

import java.util.*;

public class TestCollection {
    public String get4Random(){
        for (int i = 0; i < 4; i++) {

        }
    },
    public static void main(String[] args) {
       /* ArrayList heros = new ArrayList();

        heros.add(new Hero("盖伦"));

        System.out.println(heros.size());

        heros.add(new Hero("提莫"));

        System.out.println(heros.size());

        Hero gailun = (Hero)heros.get(0);
        System.out.println(gailun.name);

        int index = heros.indexOf(gailun);
        System.out.println(index);*/


       /* ArrayList heros = new ArrayList();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        System.out.println(heros);

        Hero specialHero = new Hero("special hero");
        heros.add(3, specialHero);
        System.out.println(heros.toString());

        // 删除 可以根据index和对象删除
        heros.remove(0);
        System.out.println(heros);*/

        // set 替换
        // size  获取大小
        // clear 清空


        //泛型 这个list只能存放Hero对象
       /* ArrayList<Hero> genericHeros = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            genericHeros.add(new Hero("Hero==>" + i));
        }
        // 遍历
        for (int i = 0, size = genericHeros.size(); i < size; i++) {
            System.out.println(genericHeros.get(i));
        }
        System.out.println("-----");
        Iterator<Hero> it = genericHeros.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-------");
        // 迭代器的for写法
        for(Iterator<Hero> iterator = genericHeros.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
        System.out.println("------");
        // 增强for循环
        for(Hero h : genericHeros){
            System.out.println(h);
        }*/


        LinkedList<Hero> ll = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            //最后插入元素
            ll.addLast(new Hero("hero" + (i + 1)));
        }
       /* System.out.println(ll.getLast());
        System.out.println(ll.getFirst());
        System.out.println("-----");
        Hero first = ll.removeFirst();
        System.out.println(first);
        System.out.println(ll);*/


        // Queue
      /*  Queue<Hero> q = new LinkedList<>();
        // 加载队列的最后面
        q.offer(new Hero("hero1"));
        q.offer(new Hero("hero2"));
        q.offer(new Hero("hero3"));

        // 取出第一个元素
        Hero h = (Hero)q.poll();
        // 那第一个元素看看， 但是不取出来
        q.peek();*/

        List<Hero> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int random = (int)Math.floor(Math.random() * 10000);

            Hero h = new Hero("hero" +random);
            l.add(h);
        }
        System.out.println(l);


    }
}
