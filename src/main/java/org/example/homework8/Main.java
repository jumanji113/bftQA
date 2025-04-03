package org.example.homework8;

public class Main {
    public static void main(String[] args) {
        Guitare guitare = new Guitare(4);
        Piano piano = new Piano(0);
        //guitare.showString();
        //piano.showString();
        guitare.play(guitare.strings);
        piano.play(piano.strings);
    }
}
