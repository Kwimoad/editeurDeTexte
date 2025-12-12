package application;

public class SODialog extends javax.swing.JDialog {

    private String nomFichier;
    private String cheminFichier;
    private boolean valide = false;
    private String titre;

    public SODialog(java.awt.Frame parent, String titre) {
        super(parent, true);
        this.titre = titre;
        initComponents();
        System.out.println(titre);
    }

    public String getNomFichier() {
        return nomFichier;
    }

    public String getCheminFichier() {
        return cheminFichier;
    }

    public boolean isValide() {
        return valide;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtChemin = new javax.swing.JTextField();
        btnValider = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();

        setTitle(this.titre);
        setResizable(false);

        jLabel1.setText("Nom du fichier :");
        jLabel2.setText("Chemin du fichier :");

        btnValider.setText("Valider");
        btnValider.addActionListener(evt -> btnValiderActionPerformed());

        btnAnnuler.setText("Annuler");
        btnAnnuler.addActionListener(evt -> dispose());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNom, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                        .addComponent(txtChemin)
                                )
                        )
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnValider)
                                .addGap(18, 18, 18)
                                .addComponent(btnAnnuler)
                                .addGap(40, 40, 40))
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtChemin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnValider)
                                        .addComponent(btnAnnuler))
                                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btnValiderActionPerformed() {
        nomFichier = txtNom.getText();
        cheminFichier = txtChemin.getText();
        valide = true;
        dispose();
    }

    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtChemin;

}