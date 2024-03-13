import javax.swing.*;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class Repository extends PropertyChangeSupport {
    private static Repository instance;
    private ArrayList<Component> boxes;

    private Repository() {
        super(new Object());
        boxes = new ArrayList<Component>();
    }

    public static Repository getInstance() {
        if (instance == null) {
            instance = new Repository();
        }
        return instance;
    }

    public ArrayList<Component> getBoxes() {
        return boxes;
    }

    public void addBox(Component box) {
        boxes.add(box);
        firePropertyChange("boxes", null, box);
    }
}
