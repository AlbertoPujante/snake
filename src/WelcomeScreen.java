import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WelcomeScreen extends JPanel 
{

    JLabel title;
    JButton go;
    JButton quit;

    MainWindow mw;

    public void setTitle(String t) 
    {
        title.setText(t);
    }

    public void quitButtonActionListener() 
    {
        if (JOptionPane.showConfirmDialog(this, "Are you sure?") == JOptionPane.OK_OPTION) 
        {
            System.exit(0);
        }
    }

    public void goButtonActionListener() 
    {
        mw.showCard("Two");
    }

    public WelcomeScreen(MainWindow mw) 
    {
        this.mw = mw;

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        title = J_LABEL_T;
        add(title);

        //add formatting here
        go = J_BUTTON_NG;
        quit = J_BUTTON_Q;

        go.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent event) 
            {
                goButtonActionListener();
            }
        });

        quit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event) 
            {
                quitButtonActionListener();
            }
        });

        add(go);
        add(quit);
    }
    private static final JLabel J_LABEL_T = new JLabel();
    private static final JButton J_BUTTON_Q = new JButton("Quit");
    private static final JButton J_BUTTON_NG = new JButton("New Game");
}
