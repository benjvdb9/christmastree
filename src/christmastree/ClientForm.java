package christmastree;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


public class ClientForm extends JFrame {

    public ClientForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // TODO organisation du formulaire
    public class Formcon extends JPanel {

        private static final long serialVersionUID = 1L;

        Formcon() {
            setBorder(new EmptyBorder(8, 8, 8, 8));
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();

            //TitledBorder Connexion position 0,0
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.weightx = 1;
            ClientPanel signin = new ClientPanel();
            signin.setBorder(new CompoundBorder(new TitledBorder("Information client"), new EmptyBorder(4, 4, 4, 4)));
            add(signin, gbc);

            //TitledBorder Inscription position 0,2
            gbc.gridy++;
            AddPanel regist = new AddPanel();
            regist.setBorder(new CompoundBorder(new TitledBorder("Adresse de livraison"), new EmptyBorder(4, 4, 4, 4)));
            add(regist, gbc);

            gbc.gridy++;
            gbc.anchor = GridBagConstraints.WEST;
            gbc.gridy++;
            add(btnext, gbc);

            // TODO Appel fonction Inscription
            btnext.addActionListener(new ValiderListener());


        }
    }

    // TODO Composante Pour Connexion utilisateur
    protected class ClientPanel extends JPanel {

        private static final long serialVersionUID = 1L;

        ClientPanel() {
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(1, 1, 1, 1); // marge entre composants

            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.EAST;
            add(lbnom, gbc);

            gbc.gridy++;
            gbc.gridx = 0;
            add(lbprenom, gbc);

            gbc.gridx = 1;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.WEST;
            gbc.weightx = 0.5;
            add(tfnom, gbc);

            gbc.gridy++;
            gbc.gridx = 1;
            add(tfprenom, gbc);

        }
    }


    // TODO Partie inscription
    protected class AddPanel extends JPanel {

        private static final long serialVersionUID = 1L;

        AddPanel() {

            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(2, 2, 2, 2); // marge entre composants
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.EAST;
            add(lbrue, gbc);

            gbc.gridy++;
            gbc.gridx = 0;
            add(lbcomm, gbc);

            gbc.gridx = 1;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.WEST;
            gbc.weightx = 0.5;
            add(tfrue, gbc);

            gbc.gridy++;
            gbc.gridx = 1;
            add(tfcomm, gbc);

        }
    }


    // TODO initialisaton JFrame
    private void initComponents() {
        JFrame frame = new JFrame("Application ChristmasTree");
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(380, 240);
        frame.setResizable(false);
        frame.add(new Formcon());
        frame.pack();  // Adapte automatiquement composante dans la fenetre
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // TODO Programme principal
    /*public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (ClassNotFoundException ex) {}
        catch (InstantiationException ex) {}
        catch (IllegalAccessException ex) {}
        catch (UnsupportedLookAndFeelException ex) {}

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // TODO Appel page connexion inscription
                new ClientForm();
            }
        });
    }*/

    private boolean validationNom(String nom ){
        // TODO Validation nom et prenom
        return !(nom != null && nom.trim().length() < 2);
    }

    public class ValiderListener implements ActionListener{
        // TODO Action sur Bouton Suivant
        @SuppressWarnings("deprecation")
        @Override
        public void actionPerformed ( ActionEvent event ){

            if(validationNom(tfnom.getText())){
                if (validationNom(tfprenom.getText())){

                    Order order = new Order(tfrue.getText()+"\n"+ tfcomm.getText(), tfnom.getText()+"  ", tfprenom.getText());
                    Compte account = new Compte(order);
                    account.setVisible(true);


                }else {
                    JOptionPane.showMessageDialog(null, "Votre Prenom" );
                }
            }else {
                JOptionPane.showMessageDialog(null, "Votre Nom" );
            }

        }
    }


    private JTextField tfprenom = new JTextField(20);
    private JTextField tfnom = new JTextField(20);

    private JLabel lbnom = new JLabel("Nom : ");
    private JLabel lbprenom = new JLabel("     Prenom : ");

    private JLabel lbrue = new JLabel("Rue et N˚: ");
    private JLabel lbcomm = new JLabel("Commune : ");


    private JTextField tfrue = new JTextField(20);
    private JTextField tfcomm = new JTextField(20);
    private JButton btnext = new JButton("Suivant");
}

