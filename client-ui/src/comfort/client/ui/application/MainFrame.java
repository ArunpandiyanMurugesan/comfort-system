package comfort.client.ui.application;

import javax.swing.*;
import java.awt.*;

/**
 * Author: Michael Morozov
 * Date: 26.12.2007
 * Time: 22:06:14
 */
public class MainFrame {
    private JPanel panel;
    private JButton button1;
    private JButton button2;

    public Component getPanel() {
        return panel;
    }


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout(0, 0));
        final JToolBar toolBar1 = new JToolBar();
        toolBar1.setOrientation(1);
        panel.add(toolBar1, BorderLayout.EAST);
        button1 = new JButton();
        button1.setText("Button");
        toolBar1.add(button1);
        button2 = new JButton();
        button2.setText("Button");
        toolBar1.add(button2);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel;
    }
}