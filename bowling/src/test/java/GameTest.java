import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class GameTest {
    Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }
    /*
    @Test
    public void oneThrowTest() {

        game.add(5);
        assertEquals(5, game.totalScore());
        assertEquals(1, game.currentFrame());
    }
    */
    @Test
    public void twoThrowNoMarkTest(){
        game.add(5);
        game.add(4);
        assertEquals(9, game.totalScore());
        assertEquals(2, game.currentFrame());
    }
    @Test
    public void fourThrowNoMarkTest(){
        game.add(5);
        game.add(4);
        game.add(6);
        game.add(1);
        assertEquals(9, game.scoreForFrame(1));
        assertEquals(16, game.scoreForFrame(2));
        assertEquals(16, game.totalScore());
        assertEquals(3, game.currentFrame());
    }

    @Test
    public void spareTest(){
        game.add(4);
        game.add(6);
        game.add(1);
        assertEquals(11, game.scoreForFrame(1));
        assertEquals(2, game.currentFrame());
    }

    @Test
    public void sampleAfterSpareTest(){
        game.add(3);
        game.add(7);
        game.add(3);
        game.add(2);
        assertEquals(13, game.scoreForFrame(1));
        assertEquals(18, game.scoreForFrame(2));
        assertEquals(18, game.totalScore());
        assertEquals(3, game.currentFrame());
    }

    @Test
    public void strikeTest(){
        game.add(10);
        game.add(3);
        game.add(6);
        assertEquals(19, game.scoreForFrame(1));
        assertEquals(28, game.totalScore());
        assertEquals(3, game.currentFrame());
    }

    @Test
    public void perfactGameTest(){
        for (int i=0; i < 12; i++ ) game.add(10);
        assertEquals(300, game.totalScore());
        //TODO
        assertEquals(11, game.currentFrame());
    }


    @After
    public void tearDown() throws Exception {
    }
}