package collection;

import charactor.Hero;

import java.util.*;

public class TestStack implements Stack{
    private LinkedList ll = null;
    public TestStack(){
        this.ll = new LinkedList<>();
    }
    //把英雄推入到最后位置
    public void push(Hero h){
        ll.addLast(h);
    };
    //把最后一个英雄取出来
    public Hero pull(){
        return (Hero)ll.removeLast();
    };
    //查看最后一个英雄
    public Hero peek(){
        return (Hero)ll.getLast();
    };
    public LinkedList getStack(){
        return ll;
    }
    public static void main(String[] args) {
        TestStack tStack = new TestStack();
        for (int i = 0; i < 4; i++) {
            tStack.push(new Hero("英雄" + i));
        }

        System.out.println(tStack.peek());
        System.out.println(tStack.pull());

        System.out.println(tStack.getStack());
    }
}
