/**
 * ============================================
 * 120 Days of Java Learning - Day 30
 * Topic: InstanceVsStaticMembers
 * ============================================
 * Instance members har object ke liye alag hote hain (memory alag milti hai).
 * Static members sabhi objects ke beech shared hote hain (ek hi copy).
 */
public class Day030_InstanceVsStaticMembers {

    public static void main(String[] args) {

        class Demo {
            int instanceVar = 10; // har object ka alag
            static int staticVar = 20; // sab me shared
        }
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        d1.instanceVar = 100;
        Demo.staticVar = 200;
        System.out.println("d1.instanceVar=" + d1.instanceVar + " d2.instanceVar=" + d2.instanceVar);
        System.out.println("Static shared value: " + Demo.staticVar);
    }

}
