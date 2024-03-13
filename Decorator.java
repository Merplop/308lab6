import java.awt.*;

public abstract class Decorator extends Component {
    Component component;

    public void add(Component c) {
        this.component = c;
    }
}
