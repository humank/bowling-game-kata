import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    private Game g;

    @Test
    public void testGutterGame() throws Exception {

        setupEnv();
        rollballsFor(0);
        assertEquals(0, g.score());
    }


    @Test
    public void testAllOnes() {

        setupEnv();
        rollballsFor(1);
        assertEquals(20, g.score());
    }


    private void rollballsFor(int point) {
        for (int i = 0; i < 20; i++) {
            g.roll(point);
        }
    }

    protected void setupEnv() {
        g = new Game();
    }
}
