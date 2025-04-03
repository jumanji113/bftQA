package org.example.homework8;

public class Piano extends Wrapper.Enum implements Playable{

    public Piano(int strings) {
        super(strings);
    }

//    public void showString(){
//        System.out.println(this.strings);
//    }
    @Override
    public void play(int a) {
        System.out.println("Пианино играет и кол-во струн: " + this.strings);
}

}
