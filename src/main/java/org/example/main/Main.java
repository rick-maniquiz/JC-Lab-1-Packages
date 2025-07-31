package org.example.main;


// Import here manually
import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;
import static java.lang.System.out;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        out.println((new ClassOne()).greet());
        out.println((new ClassTwo()).greet());
        out.println((new ClassThree()).greet());

    }
}