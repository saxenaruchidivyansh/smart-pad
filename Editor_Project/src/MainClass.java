import javax.swing.JFrame;

public class MainClass {
    public static void main(String args[]){
        
        final notepad mynote = new notepad();
        mynote.setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
        mynote.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                mynote.file_exit();
            }
        });

    }
}
