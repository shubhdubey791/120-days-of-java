/**
 * ============================================
 * 120 Days of Java Learning - Day 88
 * Topic: PropertiesFileHandling
 * ============================================
 * Properties class key-value config data (jaise app settings) manage karne ke liye use hoti hai.
 * .properties files me configuration store karna common practice hai.
 */
public class Day088_PropertiesFileHandling {

    public static void main(String[] args) {

        java.util.Properties props = new java.util.Properties();
        props.setProperty("appName", "JavaLearningApp");
        props.setProperty("version", "1.0");
        System.out.println("App Name: " + props.getProperty("appName"));
        System.out.println("Version: " + props.getProperty("version"));
    }

}
