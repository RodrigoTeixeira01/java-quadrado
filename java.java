import java.awt.event.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.*;
class Java{
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.setBounds(200,200, 100, 100);
        JFrame tela = new JFrame();
        tela.setTitle("Jogo");
        tela.setLocation(0, 0);
        tela.setDefaultCloseOperation(3);
        tela.setLayout(null);
        tela.setSize(500,500);
        JPanel background = new JPanel();
        background.setBackground(new Color(50, 50, 50));
        background.setBounds(0, 0, 500, 500);
        tela.setVisible(true);
        tela.add(panel);
        tela.add(background);
        
        
        
            
        //    long start = System.currentTimeMillis();
	//    while(System.currentTimeMillis()-start<50){}
        
        
        tela.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
                switch (e.getKeyCode()){
                    
                    case 38:
                        panel.setBounds(panel.getX(), panel.getY()-10, 100, 100);
                        break;
                    case 37:
                        panel.setBounds(panel.getX()-10, panel.getY(), 100, 100);
                        break;
                    case 40:
                        panel.setBounds(panel.getX(), panel.getY()+10, 100, 100);
                        break;
                    case 39:
                        panel.setBounds(panel.getX()+10, panel.getY(), 100, 100);
                        break;
                    default:
                        break;
                    
                    
                    
                }
            }
        });
        
        
        
              
        
        
        
        
        
            
            
            
            
            
        }
}















































/*
Label - JLabel
Botão - JButton
«input» - JTextField
*/