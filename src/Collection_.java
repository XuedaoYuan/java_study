import java.util.*;

public class Collection_ {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        // for循环 遍历
        for (String str : list) {
            System.out.println(str);
        }

        // 迭代器遍历
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        // map
        Map<String, String> map = new HashMap<>();
        map.put("name", "xdyuan");
        map.put("age", "23");

        // 遍历1
        for (String key : map.keySet()) {
            System.out.println("key = " + key + ",value = " + map.get(key));
        }

        // 遍历2
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + entry.getValue());
        }
        // 遍历3
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }

        // 遍历4

    }
}
