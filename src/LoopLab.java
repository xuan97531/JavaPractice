import javax.swing.*;
import java.awt.*;

public class LoopLab extends JPanel {

    String type;
    int n;

    public LoopLab() {
        type = JOptionPane.showInputDialog("你想要加法表(A)或是乘法表(M)? 清輸入選擇(A or M): ");
        n = Integer.parseInt(JOptionPane.showInputDialog("請指定大小(輸入數字): "));

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int w = getWidth();
        int h = getHeight();
        int x = 0;
        int y = 0;
        int cellWidth = w / n;
        int cellHeight = h / n;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || j==1){
                    g.setColor(Color.YELLOW);
                    g.fillRect(x, y, cellWidth, cellHeight);
                }
                g.setColor(Color.BLACK);
                g.drawRect(x,y,cellWidth,cellHeight);

                if(i==1){
                    g.drawString(""+j, x+5, y+15);
                } else if (j==1) {
                    g.drawString(""+i, x+5, y+15);
                } else {
                    int value = 0;
                    if(type.toLowerCase().equals("a")){
                        value = i * j;
                    } else if (type.toLowerCase().equals("m")) {
                        value = i + j;
                    }
                    g.drawString(""+value, x+5,y+15);
                }

                x += cellWidth;
            }
            x = 0;
            y += cellHeight;
        }

    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setContentPane(new LoopLab());
        window.setVisible(true);
    }
}
