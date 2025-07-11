import java.awt.*;
import javax.swing.*;
public class SnakeGame extends JPanel{
int x=20;
int y=20;
int z=400;
Point s=new Point(5,5);
Point f=new Point(10,10);
public SnakeGame(){
setPreferredSize(new Dimension(z,z));
setBackground(Color.BLACK);
}
protected void paintComponent(Graphics g){
super.paintComponent(g);
g.setColor(Color.DARK_GRAY);
for(int i=0;i<z;i=i+y){
g.drawLine(i,0,i,z);
g.drawLine(0,i,z,i);
}
g.setColor(Color.GREEN);
g.fillRect(s.x*y,s.y*y,y,y);
g.setColor(Color.RED);
g.fillRect(f.x*y,f.y*y,y,y);
}
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