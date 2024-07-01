import javax.swing.*;
import java.awt.*;

// 通過繼承JPanel,JavaGUI類可以使用JPanel提供的所有方法和屬性
public class Draw extends JPanel {

    @Override   // 註解表示這個方法是在覆寫父類(JPanel)的同名方法
    // 表示這個方法的訪問權限為protected,即只有子類和同一個包下的類才能訪問
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);   // 調用了super.paintComponent(g)來確保父類的實現得以執行

        // 取得視窗寬高
        int width = getWidth();
        int height = getHeight();

        g.setColor(Color.GRAY);                        // 設定顏色為灰色
        g.fillRect(0,0,width,height);            // 在面板上從(0, 0)起點繪製實心長方形(寬:隨視窗大小改變, 高:隨視窗大小改變)
        g.setColor(Color.BLUE);                        // 設定顏色為藍色
        g.drawLine(10,10,50,50);        // 在面板上繪製一條從(10, 10)起點到(50, 50)終點的直線
        g.setColor(Color.BLACK);                      // 設定顏色為黑色
        g.drawRect(100,100,50,60);  // 在面板上從(100, 100)起點繪製長方形(寬:50, 高:60)
        g.setColor(Color.RED);                        // 設定顏色為紅色
        g.fillRect(200,200,50,60);  // 在面板上從(100, 100)起點繪製實心長方形(寬:50, 高:60)
        g.setColor(Color.GREEN);                      // 設定顏色為綠色
        g.drawOval(60,60, 30,30);   // 在面板上從(60, 60)為中心繪製圓形(寬:30, 高:30)
        g.setColor(Color.YELLOW);                     // 設定顏色為黃色
        g.fillOval(100,60, 30,30);  // 在面板上從(100, 60)為中心繪製實心圓形(寬:30, 高:30)

        ImageIcon img = new ImageIcon("wakeup.jpg");   // 創建了一個ImageIcon對象,並將其賦值給變量img
        // 用ImageIcon對象img所代表的圖像,在GUI面板的(0, 300)座標位置上進行繪製,
        // 其中null表示沒有其他UI元素被指定為這個圖標的容器,
        // g是paintComponent(Graphics g)方法中傳遞的Graphics對象,用於執行實際的繪製操作
        img.paintIcon(null, g,0,300);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();  // 創建了一個JFrame對象,它代表了一個GUI窗口
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 設置了窗口的默認關閉操作為EXIT_ON_CLOSE,即當用戶關閉窗口時,程式也跟著退出
        window.setSize(300, 300);  // 窗口的大小為300x300像素
        window.setContentPane(new Draw());  // 創建的JavaGUI對象設置為窗口的內容面板
        window.setVisible(true);  // 將窗口設置為可見,這樣用戶就能看到這個GUI應用程式了
    }
}
