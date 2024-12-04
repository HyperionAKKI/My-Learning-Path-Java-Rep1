import java.io.*;
import java.lang.*;
import java.util.*;

// Parent class
class One {
    public void print_iot()
    {
        System.out.println("Iot");
    }
}

class Two extends One {
    public void print_for() { System.out.println("for"); }
}

// Driver class
public class tut1 {
    // Main function
    public static void main(String[] args)
    {
        Two i = new Two();
        i.print_iot();
        i.print_for();
        i.print_iot();
    }
}