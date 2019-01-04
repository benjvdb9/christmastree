package christmastree;

import javax.swing.*;
import java.awt.*;
import javax.swing.text.*;

public class ResPanel extends JPanel {

    ResPanel(){
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // marge entre composants

        // Create a JTextArea
        JTextArea tArea = new JTextArea("");
        tArea.setColumns(20);
        tArea.setRows(18);
        tArea.setEditable(false);
        tArea.setFont(new Font("Serif", Font.ITALIC, 13));
        tArea.setLineWrap(true);       // wrap line
        tArea.setWrapStyleWord(true);  // wrap line at word boundary
        //tArea.setBackground(new Color(224, 224, 224)); // light blue
        // Wrap the JTextArea inside a JScrollPane
        JScrollPane tAreaScrollPane = new JScrollPane(tArea);
        tAreaScrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 1));
        tAreaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;
        add(tAreaScrollPane, gbc);


    }

    //JScrollPane jsresum = new JScrollPane(jtresum);


    JTextArea taresum = new JTextArea(20, 80);

    JLabel blresum = new JLabel("Name: /n test test test");

    StyleContext sc = new StyleContext();
    final DefaultStyledDocument doc = new DefaultStyledDocument(sc);

    JTextPane jtresum = new JTextPane(doc);

}
