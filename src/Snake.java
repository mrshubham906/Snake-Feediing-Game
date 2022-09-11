import javax.swing.*;

public class Snake extends JFrame {
// working with jFrames size or anything else
    Snake(){
        add(new Board());  
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("The Snake Game");
    }

// calling the snake class object to start the game
    public static void main(String[] args){
        new Snake().setVisible(true);
    } 
}
