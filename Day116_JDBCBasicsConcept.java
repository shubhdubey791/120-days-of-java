/**
 * ============================================
 * 120 Days of Java Learning - Day 116
 * Topic: JDBCBasicsConcept
 * ============================================
 * JDBC (Java Database Connectivity) Java programs ko databases se connect karne deta hai.
 * Basic steps: Load driver -> Get Connection -> Create Statement -> Execute Query -> Process ResultSet -> Close.
 */
public class Day116_JDBCBasicsConcept {

    public static void main(String[] args) {

        System.out.println("JDBC Workflow:");
        System.out.println("1. Class.forName(\"driverClassName\") - load driver");
        System.out.println("2. DriverManager.getConnection(url, user, pass) - connect");
        System.out.println("3. connection.createStatement() - create statement");
        System.out.println("4. statement.executeQuery(sql) - run query, get ResultSet");
        System.out.println("5. Process ResultSet, then close connection");
    }

}
