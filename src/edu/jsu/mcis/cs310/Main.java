package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        String message2 = m.getGreeting2();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        System.out.println(message2);
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String getGreeting2() {
        return "Im a little teapot";
    }
    
    public String reverse(String message) {
        StringBuilder sb = new StringBuilder(message);
        sb.reverse();
        return sb.toString();
    }
    
}