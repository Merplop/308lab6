import javax.swing.*;
import java.awt.Graphics;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class Screen extends JPanel implements PropertyChangeListener {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ArrayList<Component> shapes = new ArrayList<Component>();
        shapes = Repository.getInstance().getBoxes();
        for (Component c : shapes) {
            c.draw(g);
        }
    }

    /**
     * This method gets called when a bound property is changed.
     *
     * @param evt A PropertyChangeEvent object describing the event source
     *            and the property that has changed.
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        repaint();
    }
}
