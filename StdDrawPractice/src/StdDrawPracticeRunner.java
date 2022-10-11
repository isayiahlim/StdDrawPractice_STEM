import static java.awt.event.KeyEvent.VK_B;
import static java.awt.event.KeyEvent.VK_SPACE;

public class StdDrawPracticeRunner {

    public static void main(String[] args) {
        openingCredits();
        runAmerica();
        runWeb();
        runCheckerboard();
        runRose();
        runHarmonicMotion();
    }

    private static void runAmerica(){
        StdDrawPractice.america();
        waitToAdvance();
    }

    private static void runWeb() {
        StdDrawPractice.web(16, 0.5);
        waitToAdvance();
        
        StdDrawPractice.web(7, 0);
        waitToAdvance();

        StdDrawPractice.web(11, 1);
        waitToAdvance();
    }

    private static void runCheckerboard() {
        StdDrawPractice.checkerboard(8);
        waitToAdvance();
        StdDrawPractice.checkerboard(5);
        waitToAdvance();
    }

    private static void runRose() {
        StdDrawPractice.rose(6);
        waitToAdvance();
        StdDrawPractice.rose(5);
        waitToAdvance();
    }
    
    private static void runHarmonicMotion() {
        StdDrawPractice.harmonicMotion();
        waitToAdvance();
    }
    
    private static void waitToAdvance(){
        while(!StdDraw.isKeyPressed(VK_SPACE)){
            StdDraw.pause(10);
        }
        resetCanvas();
        // Give the system time to catch up
        StdDraw.pause(2000);
    }

    private static void resetCanvas(){
        StdDraw.disableDoubleBuffering();
        StdDraw.setCanvasSize();
        StdDraw.pause(250);
    }

    private static void openingCredits(){
        StdDraw.text(0.5, 0.5, "Running Problem Set 02.");
        StdDraw.pause(500);
        StdDraw.clear();
        StdDraw.text(0.5, 0.5, "Press \"B\" to begin.");
        StdDraw.text(0.5, 0.4, "Press SPACE to advance to next problem.");
        while (!StdDraw.isKeyPressed(VK_B)){
            StdDraw.pause(10);
        }
        StdDraw.clear();
    }
}
