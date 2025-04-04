package org.example.homework8;

public class Guitare extends Wrapper.Enum implements Playable{

    public Guitare(int strings) {
        super(strings);
    }

    @Override
    public void play(int a) {
        System.out.println("Гитара играет и кол-во струн: " + this.strings);
    }

//    public void showString(){
//        System.out.println(this.strings);
//    }



}
