package reflection;

import cn.tjut.HashMap_demo.MyHashMap;
import cn.tjut.enums.RoleEnum;
import cn.tjut.enums.SeatStatusEnum;
import cn.tjut.reflection.use.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.*;


@Slf4j
public class ReflectionTest {
    @Test
    public void classTest() throws Exception{
        // 获取Class对象的三种方式
        log.info("根据类名:  \t" + User.class);
        log.info("根据对象:  \t" + new User().getClass());
        log.info("根据全限定类名:\t" + Class.forName("cn.tjut.reflection.use.User"));
        // 常用的方法
        log.info("获取全限定类名:\t" + User.class.getName());
        log.info("获取类名:\t" + User.class.getSimpleName());
        log.info("实例化:\t" + User.class.newInstance());
    }

    @Test
    public void testString(){
        StringBuilder testString = new StringBuilder("123")
                .append("123")
                .append(1);
        System.out.println(testString.toString());

        StringBuffer testString2 = new StringBuffer("123")
                .append("123")
                .append(1);
        System.out.println(testString.toString());

        String s = new String("123");
        testAcceptChar(s.toCharArray());

    }

    public void testAcceptChar(char[] c){
        System.out.println(c);
    }

    @Test
    public void testWordCount(){
            String str = "I come from County DingYuan Province AnHui.";
            char[] ch = str.toCharArray();
            int count = 0;
            for(int i=0;i<ch.length;i++){
                if(ch[i]==' ')
                    count++;
            }
            count++;
            System.out.println("共有"+count+"个字串");
    }

    public int[] orderArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    @Test
    public void testSort(){
        int[] array = {1, 8, 5, 2, 4, 9, 7};
        orderArray(array);
        for (int i : array){
            System.out.println(i);
        }
    }

    @Test
    public void testEnum(){
        System.out.println(RoleEnum.User);
    }
    @Test
    public void testEnum2(){
        System.out.println(SeatStatusEnum.AVAILABLE);
    }

    @Test
    public void testArrayList(){
        ArrayList<Object> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        Object[] array = list.toArray();

        List<Object> list1 = Arrays.asList(array);
        System.out.println(list1);
        array[1] = "3";
        System.out.println(list1);
    }


    @Test
    public void testHashCode(){
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "落雨既然");

        int a = -7;
        int b = 3;
        int c = a % b;
        System.out.println("使用%做取余结果：" + c);
        c = Math.floorMod(-7 , 3);
        System.out.println("使用floorMod()做取余结果：" + c);
    }

    @Test
    public void testMyHashMap(){
        MyHashMap<String, String> map = new MyHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key2", "value2");
        map.put(null, "null");
        System.out.println(map);


        // 测试get
        String s = map.get("key1");
        System.out.println(s);

        System.out.println(map.get(null));
    }
    @Test
    public void testChar(){
        System.out.println('z'-0);
    }

//    @Test
//    public String test_ret_fin(){
//
//        try {
//            throw new Exception();
//        }catch (Exception e){
//            System.out.println("catch");
//            return "222222";
//        }finally {
//            System.out.println("finally");
//        }
//    }

    @Test
    public void testHashMod(){
        HashMap<String, String> map = new HashMap<>();
        map.put("chenmo", "沉默");
        map.put("wanger", "王二");
        map.put("chenqingyang", "陈清扬");
        map.put("xiaozhuanling", "小转铃");
        map.put("fangxiaowan", "方小婉");
        for (String key : map.keySet()){
            int h , n =16;
            int hash = (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
            int i = (n-1) & hash; // 计算索引
            System.out.println(i);
        }
    }

    @Test
    public  void testStringBuilder(){
        StringBuilder sb = new StringBuilder();
        sb.append('1');
        System.out.println(sb);
        Set<String> set = new HashSet<>();
        set.add("222");
        System.out.println(set.contains("222"));
    }


    @Test
    public void  testFastFail(){
        List<String> list = new ArrayList<>();
        list.add("111");
        list.add(("222"));
        list.add("lyj");
//        for(String temp : list){
//            if(temp.equals("lyj")) list.remove(temp);
//        }
        Iterator<String> iterator = list.iterator();
        System.out.println(iterator.next());
    }

    /**
     * Optional对象的创建方式
     */
    @Test
    public void test02(){
        // 第一种方式 通过of方法  of方法是不支持null的
        Optional<String> op1 = Optional.of("zhangsan");
        System.out.println(op1);
        //Optional<Object> op2 = Optional.of(null);

        // 第二种方式通过 ofNullable方法 支持null
        Optional<String> op3 = Optional.ofNullable("lisi");
        Optional<Object> op4 = Optional.ofNullable(null);
        System.out.println(op4);

        // 第三种方式 通过empty方法直接创建一个空的Optional对象
        Optional<Object> op5 = Optional.empty();
        System.out.println(op5);

    }
}
