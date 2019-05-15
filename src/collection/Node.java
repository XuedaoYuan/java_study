package collection;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public Node leftNode;
    public Node rightNode;
    //值
    public Object value;

    //插入节点
    public void add(Object v) {
        //节点没值 就赋值给节点
        if (null == this.value) {
            value = v;
            // 判断当前值和传入值的大小
        } else {
            if ((Integer) v - (Integer) this.value <= 0) {
                if (null == leftNode) {
                    leftNode = new Node();
                }
                leftNode.add(v);
            } else {
                if (null == rightNode) {
                    rightNode = new Node();
                }
                rightNode.add(v);
            }
        }
    }

    // 中序遍历节点
    public List<Object> values(){
        List<Object> values = new ArrayList<>();
        if(null != leftNode){
            values.addAll(leftNode.values());
        }
        values.add(value);
        if(null != rightNode){
            values.addAll(rightNode.values());
        }
        return values;
    }

    public static void main(String[] args) {
        int randoms[] = new int[]{67, 7, 30, 73, 10, 0, 78, 81, 10, 74};
        // 创建根节点
        Node root = new Node();
        for(int number : randoms){
            root.add(number);
        }

        System.out.println(root.values());

    }
}
