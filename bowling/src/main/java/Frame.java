public class Frame {
    private int score = 0;

    public int getScore(){
        return score;
    }

    public void add(int pins) {
        this.score += pins;
    }
}
