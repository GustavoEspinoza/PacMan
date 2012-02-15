package pkgsuper.mexican;
import javax.swing.JFrame;

public class SuperMexican
{
    public void getGoing()
    {
        JFrame frame = new JFrame("Super Mexican");
        frame.setSize(1090, 900);
        frame.setVisible(true);
    }
     public static void main(String[] args)
    {
        new SuperMexican().getGoing();
    }
}
