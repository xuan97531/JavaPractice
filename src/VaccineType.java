import javax.swing.*;

public class VaccineType {
    public static void main(String[] args) {
        String vaccine = JOptionPane.showInputDialog("請輸入疫苗名稱(AZ, BNT, Moderna, Janssen): ");
        vaccine = vaccine.toLowerCase();

        if (vaccine.equals("az")){
            JOptionPane.showMessageDialog(null, "AZ\n研發國: 英國、瑞典\n疫苗類型: 腺病毒疫苗\n劑量: 2\n保護力: 81%");
        } else if (vaccine.equals("bnt")) {
            JOptionPane.showMessageDialog(null, "BNT\n研發國: 德國、美國\n疫苗類型: mRNA疫苗\n劑量: 2\n保護力: 95%");
        } else if (vaccine.equals("moderna")) {
            JOptionPane.showMessageDialog(null, "Moderna\n研發國: 美國\n疫苗類型: mRNA疫苗\n劑量: 2\n保護力: 94%");
        } else if (vaccine.equals("jassen")) {
            JOptionPane.showMessageDialog(null, "Jassen\n研發國: 美國、比利時\n疫苗類型: 腺病毒疫苗\n劑量: 1\n保護力: 66%");
        } else {
            JOptionPane.showMessageDialog(null, "無法識別輸入內容，請重新輸入");
        }
    }
}
