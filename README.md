# SIG App






### Sales Invoice Generator | Beta
> A sales invoice is an accounting document that records a business transaction.
> It provides the business with a record of the services they’ve provided to a client, 
> when the services were rendered and how much money the client owes the business.



<img src="blob:https://img.onl/527afbc0-0cb7-47a4-8a76-b04f60c7a4d3" />


```sh
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
```


```sh
