import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Robot {
        public static void main(String[] args) throws AWTException {
            java.awt.Robot robot = new java.awt.Robot();
            robot.mouseMove(1300, 10);
            robot.delay(500);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseMove(10, 700);
            robot.delay(500);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_P);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyPress(KeyEvent.VK_I);
            robot.keyPress(KeyEvent.VK_N);
            robot.keyPress(KeyEvent.VK_T);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(500);
            robot.mouseMove(600, 400);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseMove(500, 300);
            robot.delay(500);
            robot.mouseMove(600, 300);
            robot.delay(500);
            robot.mouseMove(500, 400);
            robot.delay(500);
            robot.mouseMove(600, 400);
            robot.delay(500);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        }
    }

