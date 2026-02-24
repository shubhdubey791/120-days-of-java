/**
 * ============================================
 * 120 Days of Java Learning - Day 55
 * Topic: IteratorInterface
 * ============================================
 * Iterator collection ke elements ko one-by-one traverse karne ka standard tarika hai.
 * hasNext() aur next() methods use hote hain, remove() se safely delete bhi kar sakte hain.
 */
public class Day055_IteratorInterface {

    public static void main(String[] args) {

        java.util.List<Integer> nums = new java.util.ArrayList<>(java.util.List.of(1, 2, 3, 4, 5));
        java.util.Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {
            int val = it.next();
            if (val % 2 == 0) it.remove(); // safe removal
        }
        System.out.println("After removing evens: " + nums);
    }

}
