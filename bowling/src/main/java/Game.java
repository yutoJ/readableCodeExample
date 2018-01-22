import java.util.Arrays;

public class Game {

    private int score =0;
    private int[] throwsHistory = new int[21];
    private int currentThrow = 0;
    private int currentFrame = 1;
    private boolean firstThrow = true;

    public int totalScore() {
        return scoreForFrame(currentFrame - 1);
    }

    public void add(int pins) {
        throwsHistory[currentThrow++] = pins;
        score += pins;
        adjustCurrentFrame(pins);
    }

    public int scoreForFrame(int theFrame) {
        int score = 0;
        int ball = 0;
        for (int currentFrame =0; currentFrame < theFrame; currentFrame++) {
            int firstThrow = throwsHistory[ball++];
            if (firstThrow == 10) {
                score += 10 + throwsHistory[ball] + throwsHistory[ball + 1];
            } else {
                int secondThrow = throwsHistory[ball++];
                int frameScore =  firstThrow + secondThrow;
                if (frameScore == 10) score += frameScore + throwsHistory[ball];
                else score += frameScore;
            }
        }
        return score;
    }

    public int currentFrame() {
        return currentFrame;
    }

    private void adjustCurrentFrame(int pins){
        if (firstThrow == true) {
            if (pins == 10) currentFrame++;
            else firstThrow = false;
        }else {
            firstThrow = true;
            currentFrame++;
        }
    }

    @Override
    public String toString() {
        return "Game{" +
                "score=" + score +
                ", throwsHistory=" + Arrays.toString(throwsHistory) +
                ", currentThrow=" + currentThrow +
                ", currentFrame=" + currentFrame +
                ", firstThrow=" + firstThrow +
                '}';
    }
}
