import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author luis_
 */
public class Saldo extends JFrame implements Runnable{
    private JPanel pnl;
    static JLabel lblSaldo;
    public Saldo(){
        super("Lo que tiene realmente el cajero");
        setBounds(100, 100, 372, 168);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lblSaldo = new JLabel("Saldo");
        lblSaldo.setBounds(147, 51, 104, 14);
        
        pnl = new JPanel(null);
        pnl.add(lblSaldo);
        setContentPane(pnl);
        setVisible(true);
    }

    @Override
    public void run() {
        while(true){
            lblSaldo.setText("" + SuperClase.saldo);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
