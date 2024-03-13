import java.awt.*;

public class BoxGenerator implements Runnable {
    public void run() {
        while(true) {
            int randX = (int)(Math.random()*300);
            int randY = (int)(Math.random()*200);
            int randWidth = (int)(Math.random()*50);
            int randHeight = (int)(Math.random()*50);
            int randRed = (int)(Math.random()*255);
            int randGreen = (int)(Math.random()*255);
            int randBlue = (int)(Math.random()*255);
            Box box = new Box(randX, randY, randWidth, randHeight, new Color(randRed, randGreen, randBlue));
            Eye eye = new Eye();
            eye.add(box);
            Repository.getInstance().addBox(eye);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
