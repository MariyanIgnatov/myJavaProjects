public class Field {
    private boolean isSet;
    private char value;

    public Field() {
        this.isSet = false;
        this.value = '_';

    }

    public boolean isEmpty() {
        return !isSet;
    }

    public void unSet() {
        this.isSet = false;
        this.value = ' ';
    }

    public void set(Player player) {
        if (isEmpty()) {
            this.isSet = true;
            this.value = player.getSign();
        } else {
            System.out.println("--- This coordinates was already entered. You lose your turn! ---");
        }
    }

    public char getValue() {
        return value;
    }

}
