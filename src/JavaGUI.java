import javax.swing.*;
import java.awt.Graphics;

// 通過繼承JPanel,JavaGUI類可以使用JPanel提供的所有方法和屬性
public class JavaGUI extends JPanel {

    @Override   // 註解表示這個方法是在覆寫父類(JPanel)的同名方法
    // 表示這個方法的訪問權限為protected,即只有子類和同一個包下的類才能訪問
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);   // 調用了super.paintComponent(g)來確保父類的實現得以執行
        g.drawString("Hello World", 100, 100);  // 面板上的(100, 100)座標處繪製文字"Hello World"
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();  // 創建了一個JFrame對象,它代表了一個GUI窗口
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 設置了窗口的默認關閉操作為EXIT_ON_CLOSE,即當用戶關閉窗口時,程式也跟著退出
        window.setSize(300, 300);  // 窗口的大小為300x300像素
        window.setContentPane(new JavaGUI());  // 創建的JavaGUI對象設置為窗口的內容面板
        window.setVisible(true);  // 將窗口設置為可見,這樣用戶就能看到這個GUI應用程式了
    }
}
