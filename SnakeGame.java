import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SnakeGame extends JPanel implements ActionListener,KeyListener{
int x=20;
int y=20;
int z=400;
Point s=new Point(5,5);
Point f=new Point(10,10);
char d='R';
Timer t;
boolean r=true;
public SnakeGame(){
setPreferredSize(new Dimension(z,z));
setBackground(Color.BLACK);
t=new Timer(50,this);
t.start();
addKeyListener(this);
}
protected void paintComponent(Graphics g){
super.paintComponent(g);
g.setColor(Color.DARK_GRAY);
for(int i=0;i<z;i=i+y){
g.drawLine(i,0,i,z);g.drawLine(0,i,z,i);
}
g.setColor(Color.GREEN);
g.fillRect(s.x*y,s.y*y,y,y);
g.setColor(Color.RED);
g.fillRect(f.x*y,f.y*y,y,y);
}
public void actionPerformed(ActionEvent e){
if(r){
s.x=s.x+(d=='R'?1:d=='L'?-1:0);
s.y=s.y+(d=='U'?-1:d=='D'?1:0);
repaint();
}
}
public void keyPressed(KeyEvent e){
int k=e.getKeyCode();
if(k==KeyEvent.VK_UP)d='U';
if(k==KeyEvent.VK_DOWN)d='D';
if(k==KeyEvent.VK_LEFT)d='L';
if(k==KeyEvent.VK_RIGHT)d='R';
}
public void keyTyped(KeyEvent e){}
public void keyReleased(KeyEvent e){}
public static void main(String args[]){
JFrame j=new JFrame("snake game");
SnakeGame g=new SnakeGame();
j.add(g);
j.pack();
j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
j.setLocationRelativeTo(null);
j.setVisible(true);
}
}