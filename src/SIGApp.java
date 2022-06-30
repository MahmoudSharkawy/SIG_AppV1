import javax.swing.*;

public class SIGApp extends JFrame {
    private JPanel mainPanel;
    public SIGApp  (String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }
    public static void main(String[] args) {
        JFrame frame = new SIGApp("SIG - Sales Invoice Generator| Beta");
        frame.setVisible(true);
    }
}
