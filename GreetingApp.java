

public class GreetingApp {
    public static void main(String[] args) {
      String first = buildGreeting("Ada");
      System.out.println(first);
      System.out.println(buildGreeting("Grace"));
      System.out.println(buildGreeting("Ada Lovelace"));
        
}
static String buildGreeting(String name) {
    return "Hello, " + name + "!";
}
    
}
