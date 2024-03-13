import java.awt.*;

public class Eye extends Decorator {

    @Override
    public void draw(Graphics g) {
        Color color = ((Box)(this.component)).getColor();
        int x = ((Box)(this.component)).getX();
        int y = ((Box)(this.component)).getY();
        int width = ((Box)(this.component)).getWidth();
        int height = ((Box)(this.component)).getHeight();
        g.setColor(color);
        g.fillRect(x, y, width, height);
        g.setColor(Color.BLACK);
        g.fillOval(x, y, 10, 10);
        g.setColor(Color.WHITE);
        g.fillOval(x, y, 6, 6);
    }
}
