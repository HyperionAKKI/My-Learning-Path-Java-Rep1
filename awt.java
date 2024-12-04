import java.awt.*;
import java.awt.event.*;
public class awt {
    public static void main(String[] args) {

        Frame f = new Frame("Evwnt handling");
        Button b = new Button("click me");
        b.setBounds(50,100,80,30);
        b.addActionListener(e -> System.out.println("Button clicked"));
        f.add(b);
        f.setSize(200,200);
        f.setLayout(null);
        f.setVisible(true);


    }
}
