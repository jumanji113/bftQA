package org.example.homework8;

public class Wrapper {
    public static abstract class Enum{
        int strings;

        public Enum(int strings) {
            this.strings = strings;
        }

        public int getStrings() {
            return strings;
        }

        public void setStrings(int strings) {
            this.strings = strings;
        }
    }
}
