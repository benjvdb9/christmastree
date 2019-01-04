package christmastree;

import javax.swing.*;
import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ComPanel extends JPanel {

    ComPanel() {


        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(1, 2, 2, 2); // marge entre composants

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER;
        JLabel lbcomd = new JLabel("  Commande Option");
        add(lbcomd, gbc);

        String[] cmdop = {"Natural tree", "Artificial tree"};
        JComboBox jccmd = new JComboBox(cmdop);
        jccmd.setSelectedIndex(0);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        add(jccmd, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        //gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.WEST;
        JLabel lbtycom = new JLabel("  Type Commande");
        add(lbtycom, gbc);

        String[] tycmd = {"Standard","personalized" };
        JComboBox jctycmd = new JComboBox(tycmd);
        jctycmd.setSelectedIndex(0);
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(jctycmd, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        //gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.WEST;
        JLabel lbgo = new JLabel("  Garland Options");
        add(lbgo, gbc);

        String[] garop = {"Electric Garland","Synthetic Garland" };
        JComboBox jcgo = new JComboBox(garop);
        jcgo.setSelectedIndex(0);
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(jcgo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        //gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.WEST;
        JLabel lbdeco = new JLabel("  Decorator Options");
        add(lbdeco, gbc);

        String[] gardeco = {"Balls","Garland", "Candle" };
        JComboBox jcdeco = new JComboBox(gardeco);
        jcdeco.setSelectedIndex(0);
        gbc.gridx = 0;
        gbc.gridy = 7;
        add(jcdeco, gbc);



    }

}
