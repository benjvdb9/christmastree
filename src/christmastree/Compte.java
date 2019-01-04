package christmastree;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


public class Compte extends JFrame {

    private static final long serialVersionUID = 1L;
    private JFrame frame = new JFrame("Application ChristmasTree");


    public Compte(Order order) {
        initComponents();
        this.setLocationRelativeTo(null);
        lbnom.setText(order.getName() + order.getSurname());
        String[] address = order.getDeliveryAddress().split("\n");
        lbrue.setText(address[0]);
        lblocal.setText(address[1]);
    }
    // TODO initialisaton JFrame
    private void initComponents() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        //frame.setSize(480, 390);
        frame.setResizable(false);
        frame.add(new FormCompte());
        frame.pack();  // Adapte automatiquement composante dans la fenetre
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
            gbc.gridwidth = 3;
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

            gbc.gridx = 1;
            gbc.gridy = 2;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            gbc.anchor = GridBagConstraints.EAST;
            add(btquit, gbc);

            gbc.gridx = 3;
            add(btprint, gbc);

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

    public static void main(String[] args) throws IOException {

        new ClientForm();


    }


    public class ValiderListener implements ActionListener{
        // TODO Action sur Bouton Suivant
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
}

