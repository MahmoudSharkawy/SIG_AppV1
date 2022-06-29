# SIG App






### Sales Invoice Generator| Beta
> A sales invoice is an accounting document that records a business transaction.
> It provides the business with a record of the services they’ve provided to a client, 
> when the services were rendered and how much money the client owes the business.


<p align="center">
<img  src="https://raw.githubusercontent.com/MahmoudSharkawy/SIG_AppV1/master/Screen%20Shot%202022-06-29%20at%205.31.12%20PM.png"  width="650" height="450" />
</p>

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
