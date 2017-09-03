package answer;

public enum Coin {
    OneHundred(100), FiveHundred(500);

    private int value;

    Coin(int value) {
        this.value = value;
    }
}
