package pcodemachine;
import javax.swing.JFrame;

public class MachineApp  {
    public static void main(String[] args) {
        MachineView pv = new MachineView();
        pv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pv.setVisible(true);
    }
}
