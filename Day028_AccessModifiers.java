/**
 * ============================================
 * 120 Days of Java Learning - Day 28
 * Topic: AccessModifiers
 * ============================================
 * Java me 4 access modifiers hain: private, default, protected, public.
 * private: sirf same class | default: same package | protected: package+subclass | public: everywhere
 */
public class Day028_AccessModifiers {

    public static void main(String[] args) {

        class Demo {
            private int a = 1;    // sirf isi class me accessible
            int b = 2;            // default - same package
            protected int c = 3;  // package + subclasses
            public int d = 4;     // sabjagah accessible
        }
        Demo obj = new Demo();
        System.out.println("b=" + obj.b + " c=" + obj.c + " d=" + obj.d);
    }

}
