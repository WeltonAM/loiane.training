package _01_java_basico._01_intro._03_aula07;

public class Erros03 {
    public static void main(String[] args) {
        // System.out.Println("Hello world");
        System.out.println("Hello world");

        int count = 0;
        count = count + 1;
    }
}

// Erros03.java:5: error: cannot find symbol
// System.out.Println("Hello world");
// ^
// symbol: method Println(String)
// location: variable out of type PrintStream
// 1 error
// 1 warning