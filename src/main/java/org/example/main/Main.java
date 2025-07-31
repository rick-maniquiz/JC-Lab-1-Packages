package org.example;


// Import here manually
import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println((new ClassOne()).greet());
        System.out.println((new ClassTwo()).greet());
        System.out.println((new ClassThree()).greet());

    }
}