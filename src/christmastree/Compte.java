package christmastree;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


public class Compte extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JFrame frame = new JFrame("Application ChristmasTree");
    private JComboBox<String> jcdeco;
    private JComboBox<String> jcgo;
    private JComboBox<String> jctycmd;
    private JComboBox<String> jccmd;
    private Order neworder = null;


    public Compte(Order order) {
        String[] cmdop = {"Natural tree", "Artificial tree"};
        String[] tycmd = {"Standard","personalized" };
        String[] garop = {"Electric Garland","Synthetic Garland" };
        String[] gardeco = {"Balls","Garland", "Candle" };

        jccmd = new JComboBox<>(cmdop);
        jctycmd = new JComboBox<>(tycmd);
        jcgo = new JComboBox<>(garop);
        jcdeco = new JComboBox<>(gardeco);

        jccmd.addActionListener(this);
        jctycmd.addActionListener(this);
        jcgo.addActionListener(this);
        jcdeco.addActionListener(this);

        initComponents();
        this.setLocationRelativeTo(null);
        lbnom.setText(order.getName() + order.getSurname());
        String[] address = order.getDeliveryAddress().split("\n");
        lbrue.setText(address[0]);
        lblocal.setText(address[1]);
        neworder = order;
    }
    // TODO initialisaton JFrame
    private void initComponents() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(480, 390);
        frame.setResizable(false);
        frame.add(new FormCompte());
        //frame.pack();  // Adapte automatiquement composante dans la fenetre
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * Formulaire de gestion commande
     */
    public class FormCompte extends JPanel{

        /**
         * Disposition Composant du formulaire compte
         */
        FormCompte(){

            setBorder(new EmptyBorder(8, 8, 8, 8));
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();

            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.anchor = GridBagConstraints.WEST;
            gbc.gridheight = 1;
            gbc.gridwidth = 2;
            ClientPanel clinfos = new ClientPanel();
            clinfos.setBorder(new CompoundBorder(new TitledBorder("Information client"), new EmptyBorder(4, 4, 4, 4)));
            add(clinfos, gbc);

            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.gridheight = 1;
            gbc.gridwidth = 2;
            gbc.anchor = GridBagConstraints.WEST;
            ComPanel companel = new ComPanel();
            companel.setBorder(new CompoundBorder(new TitledBorder("Choix commande"), new EmptyBorder(4, 4, 4, 4)));
            add(companel, gbc);

            gbc.gridx = 2;
            gbc.gridy = 0;
            gbc.gridheight = 2;
            gbc.gridwidth = 2;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.anchor = GridBagConstraints.WEST;
            ResPanel respanel = new ResPanel();
            respanel.setBorder(new CompoundBorder(new TitledBorder("Resume commande"), new EmptyBorder(4, 4, 4, 4)));
            add(respanel, gbc);

            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            gbc.anchor = GridBagConstraints.WEST;
            add(btretour, gbc);

            btretour.addActionListener(new RetListener());

            gbc.gridx = 1;
            gbc.gridy = 2;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            gbc.anchor = GridBagConstraints.EAST;
            add(btquit, gbc);
            btquit.addActionListener(new QuitListener());

            gbc.gridx = 3;
            add(btprint, gbc);
            btprint.addActionListener(new PrintListener());

        }

    }

    protected class ClientPanel extends JPanel {

        ClientPanel() {
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(2, 2, 2, 2); // marge entre composants

            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.WEST;
            add(lbnom, gbc);

            gbc.gridy++;
            add(lbrue, gbc);

            gbc.gridy++;
            gbc.gridx = 0;
            add(lblocal, gbc);

        }
    }

    public class ComPanel extends JPanel {

        ComPanel() {


            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(1, 2, 2, 2); // marge entre composants

            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.anchor = GridBagConstraints.CENTER;
            add(lbcomd, gbc);


            //jccmd.setSelectedIndex(0);
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.anchor = GridBagConstraints.WEST;
            add(jccmd, gbc);

            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.anchor = GridBagConstraints.WEST;
            add(lbtycom, gbc);


            //jctycmd.setSelectedIndex(0);
            gbc.gridx = 0;
            gbc.gridy = 3;
            add(jctycmd, gbc);

            gbc.gridx = 0;
            gbc.gridy = 4;
            gbc.anchor = GridBagConstraints.WEST;
            add(lbgo, gbc);


            //jcgo.setSelectedIndex(0);
            gbc.gridx = 0;
            gbc.gridy = 5;
            add(jcgo, gbc);

            gbc.gridx = 0;
            gbc.gridy = 6;
            //gbc.fill = GridBagConstraints.NONE;
            gbc.anchor = GridBagConstraints.WEST;
            add(lbdeco, gbc);


            //jcdeco.setSelectedIndex(0);
            gbc.gridx = 0;
            gbc.gridy = 7;
            add(jcdeco, gbc);



        }

    }

    public class ResPanel extends JPanel {

        ResPanel(){
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5); // marge entre composants


            taresum.setColumns(20);
            taresum.setRows(18);
            taresum.setEditable(false);
            taresum.setFont(new Font("Serif", Font.ITALIC, 13));
            taresum.setLineWrap(true);       // wrap line
            taresum.setWrapStyleWord(true);  // wrap line at word boundary
            //tArea.setBackground(new Color(224, 224, 224)); // light blue
            // Wrap the JTextArea inside a JScrollPane
            JScrollPane tAreaScrollPane = new JScrollPane(taresum);
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

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class QuitListener implements ActionListener{
        // TODO Action sur Bouton Quitter
        @SuppressWarnings("deprecation")
        @Override
        public void actionPerformed ( ActionEvent event ){
            System.exit(0); // stop program
        }
    }

    public class RetListener implements ActionListener{
        // TODO Action sur Bouton Retour
        @SuppressWarnings("deprecation")
        @Override
        public void actionPerformed ( ActionEvent event ){
            new ClientForm();
            frame.dispose();
        }
    }

    public class PrintListener implements ActionListener{
        // TODO Action sur Bouton print
        @SuppressWarnings("deprecation")
        @Override
        public void actionPerformed ( ActionEvent event ){


        }
    }

    private JLabel lbnom = new JLabel();
    private JLabel lbrue = new JLabel();
    private JLabel lblocal = new JLabel();

    private JButton btquit = new JButton("Quitter");
    private JButton btretour = new JButton("Retour");
    private JButton btprint = new JButton("Print");

    private JTextArea taresum = new JTextArea("Resume Commande");

    private JLabel lbcomd = new JLabel("  Commande Option");
    private JLabel lbtycom = new JLabel("  Type Commande");
    private JLabel lbgo = new JLabel("  Garland Options");
    private JLabel lbdeco = new JLabel("  Decorator Options");

}

