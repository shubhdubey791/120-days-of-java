/**
 * ============================================
 * 120 Days of Java Learning - Day 115
 * Topic: ReflectionBasics
 * ============================================
 * Reflection API runtime par class ki structure (fields, methods, constructors) inspect karne deta hai.
 * java.lang.reflect package me Class, Method, Field jaisi classes hoti hain.
 */
public class Day115_ReflectionBasics {

    public static void main(String[] args) {

        class Sample {
            private int value = 10;
            void show() { System.out.println("Sample method called"); }
        }
        Class<?> cls = Sample.class;
        System.out.println("Class name: " + cls.getSimpleName());
        System.out.println("Declared methods count: " + cls.getDeclaredMethods().length);
        System.out.println("Declared fields count: " + cls.getDeclaredFields().length);
    }

}
