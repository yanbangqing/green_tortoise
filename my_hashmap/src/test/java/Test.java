import com.lemmon.hunter.structure.MyListNode;
import com.lemmon.hunter.structure.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yanbangqing
 * @version V1.0
 * @Description
 * @date 2020/9/9 10:35 下午
 */
public class Test {

    public static void main(String[] args) {
        MyListNode myListNode = new MyListNode();
        Node node = new Node("test");
        Node node2 = new Node("test");
        Node node3 = new Node("test");
        Node node4 = new Node("test");
        myListNode.add(node);
        myListNode.add(node2);
        myListNode.add(node3);
        myListNode.add(node4);
//        System.out.println(JSON.toJSONString(myListNode));
//        Map map = new HashMap();
//        map.put("1", "1");
//        System.out.println();

    }

    public void tThread() {


    }
}
