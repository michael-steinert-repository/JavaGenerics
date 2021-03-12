public class GenericAndClasses {

    public static void main(String[] args) {
        Box<Phone> phoneBox  = new Box<>();
        phoneBox.setType(new Phone("Google"));
        System.out.println(phoneBox.getType());

        Box<Letter> letterBox  = new Box<>();
        letterBox.setType(new Letter("Michael"));
        System.out.println(letterBox.getType());
    }

    static class Box<T> {
        private T type;

        public void setType(T type) {
            this.type = type;
        }

        public T getType() {
            return type;
        }
    }

    static class Phone {
        private final String brand;

        public Phone(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        @Override
        public String toString() {
            return "Phone{" +
                    "brand='" + brand + '\'' +
                    '}';
        }
    }

    static class Letter {
        private final String sender;

        public Letter(String sender) {
            this.sender = sender;
        }

        public String getSender() {
            return sender;
        }

        @Override
        public String toString() {
            return "Letter{" +
                    "sender='" + sender + '\'' +
                    '}';
        }
    }
}
