import javax.swing.JFrame;
public class Main extends JFrame {
    Screen screen;
    public Main() {
        setTitle("Lab 6 - Miro Haapalainen");
        setLocation(100, 100);
        screen = new Screen();
        this.add(screen);
        Repository.getInstance().addPropertyChangeListener(screen); 
        Thread t = new Thread(new BoxGenerator());
        t.start();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
        main.setSize(300, 200);
        main.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
