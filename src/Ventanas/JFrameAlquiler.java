package Ventanas;

import Clases.Alquiler;
import Clases.Banana;
import Clases.Bicicleta;
import Clases.Caramañola;
import Clases.Casco;
import Clases.Cliente;
import Clases.ESeguro;
import Clases.GPS;
import Clases.Montaña;
import Clases.Ruta;
import Persistencia.PersistenciaAlquiler;
import java.text.ParseException;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import javax.swing.text.MaskFormatter;

public class JFrameAlquiler extends javax.swing.JFrame {
    
    private Alquiler alquiler;

    public JFrameAlquiler() {
        initComponents();
        llenarComboBox();
        jTxtForIdentificacion.requestFocus();
    }
    
    
    private void llenarComboBox(){
        jCBSeguro.setModel(new DefaultComboBoxModel(ESeguro.values()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipoBicicleta = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRbMontana = new javax.swing.JRadioButton();
        jRbBanana = new javax.swing.JRadioButton();
        jRbRuta = new javax.swing.JRadioButton();
        jLblRuta = new javax.swing.JLabel();
        jLblBanana = new javax.swing.JLabel();
        jLblMontana = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanelServicios = new javax.swing.JPanel();
        jChBoxCasco = new javax.swing.JCheckBox();
        jChBoxGPS = new javax.swing.JCheckBox();
        jChBoxCaramanola = new javax.swing.JCheckBox();
        jTxtForIdentificacion = new javax.swing.JFormattedTextField();
        jSpinnerHoras = new javax.swing.JSpinner();
        jSpinnerFecha = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCBSeguro = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTxtTotalPagar = new javax.swing.JTextField();
        jBtnCalcular = new javax.swing.JButton();
        jBtnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alquiler de bicicletas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Seleccione el tipo de bicicleta"));

        buttonGroupTipoBicicleta.add(jRbMontana);
        jRbMontana.setText("Montaña");

        buttonGroupTipoBicicleta.add(jRbBanana);
        jRbBanana.setText("Banana");

        buttonGroupTipoBicicleta.add(jRbRuta);
        jRbRuta.setText("Ruta");

        jLblRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bicicleta_Ruta.jpg"))); // NOI18N

        jLblBanana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bicicleta_Banana.jpg"))); // NOI18N

        jLblMontana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bicicleta_montaña.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLblMontana))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jRbMontana)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jRbRuta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLblRuta)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblBanana)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jRbBanana)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRbBanana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRbMontana)
                        .addComponent(jRbRuta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblBanana, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblMontana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        jLabel1.setText("Identificación");

        jLabel2.setText("Nombre");

        jPanelServicios.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Servicios"));

        jChBoxCasco.setText("Casco");

        jChBoxGPS.setText("GPS");

        jChBoxCaramanola.setText("Caramañola");

        javax.swing.GroupLayout jPanelServiciosLayout = new javax.swing.GroupLayout(jPanelServicios);
        jPanelServicios.setLayout(jPanelServiciosLayout);
        jPanelServiciosLayout.setHorizontalGroup(
            jPanelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelServiciosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jChBoxGPS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelServiciosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jChBoxCaramanola))
                    .addComponent(jChBoxCasco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelServiciosLayout.setVerticalGroup(
            jPanelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelServiciosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jChBoxCasco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jChBoxGPS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jChBoxCaramanola)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try {
            jTxtForIdentificacion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jSpinnerHoras.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jSpinnerFecha.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.DAY_OF_WEEK_IN_MONTH));
        jSpinnerFecha.setEditor(new javax.swing.JSpinner.DateEditor(jSpinnerFecha, "dd/MM/YYYY"));

        jLabel3.setText("Fecha");

        jLabel4.setText("Horas");

        jLabel5.setText("Seguro");

        jLabel6.setText("Total a pagar");

        jTxtTotalPagar.setEditable(false);

        jBtnCalcular.setText("Calcular");
        jBtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalcularActionPerformed(evt);
            }
        });

        jBtnGuardar.setText("Guardar");
        jBtnGuardar.setEnabled(false);
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtForIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTxtNombre)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jSpinnerHoras)
                                                    .addComponent(jCBSeguro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(35, 35, 35)
                                .addComponent(jPanelServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnCalcular)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnGuardar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtTotalPagar)
                                .addGap(86, 86, 86)))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtForIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCalcular)
                    .addComponent(jBtnGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalcularActionPerformed
        // TODO add your handling code here:
        if(revisarEspacios()){
            Cliente cliente = new Cliente(jTxtForIdentificacion.getText(), jTxtNombre.getText());
            Bicicleta bicicleta = verificarVicicleta();
            ESeguro seguro = (ESeguro)jCBSeguro.getSelectedItem();
            Date fecha = (Date)jSpinnerFecha.getValue();
            int horas = (int)jSpinnerHoras.getValue();

            alquiler = new Alquiler(cliente, bicicleta, seguro, fecha, horas);
            agregarServicios();
            jTxtTotalPagar.setText(String.format("%.2f", alquiler.calcularTotal()));
            JOptionPane.showMessageDialog(null, alquiler.toString());
            jBtnGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_jBtnCalcularActionPerformed

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        // TODO add your handling code here:
        PersistenciaAlquiler.agregarAlquiler(alquiler);
        jBtnGuardar.setEnabled(false);
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    private boolean revisarEspacios(){
        if (jTxtNombre.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "El espacio del nombre esta vacío", "Espacio incorrecto", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if (!jRbMontana.isSelected() & !jRbRuta.isSelected() & !jRbBanana.isSelected()) {
            JOptionPane.showMessageDialog(null, "Debes escoger un tipo de bicicleta", "Espacio incorrecto", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if (!jRbMontana.isSelected() & !jRbRuta.isSelected() & !jRbBanana.isSelected()) {
            JOptionPane.showMessageDialog(null, "Debes escoger un tipo de bicicleta", "Espacio incorrecto", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    private void agregarServicios(){
        if(jChBoxCaramanola.isSelected()){
            alquiler.agregarServicio(new Caramañola());
        }
        if (jChBoxCasco.isSelected()) {
            alquiler.agregarServicio(new Casco());
        }
        if (jChBoxGPS.isSelected()) {
            alquiler.agregarServicio(new GPS());
        }
    }
    private Bicicleta verificarVicicleta(){
        if (jRbMontana.isSelected()) {
            return new Montaña();
        }
        else if(jRbBanana.isSelected()){
            return new Banana();
        }
        else{
            return new Ruta();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTipoBicicleta;
    private javax.swing.JButton jBtnCalcular;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JComboBox<ESeguro> jCBSeguro;
    private javax.swing.JCheckBox jChBoxCaramanola;
    private javax.swing.JCheckBox jChBoxCasco;
    private javax.swing.JCheckBox jChBoxGPS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLblBanana;
    private javax.swing.JLabel jLblMontana;
    private javax.swing.JLabel jLblRuta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelServicios;
    private javax.swing.JRadioButton jRbBanana;
    private javax.swing.JRadioButton jRbMontana;
    private javax.swing.JRadioButton jRbRuta;
    private javax.swing.JSpinner jSpinnerFecha;
    private javax.swing.JSpinner jSpinnerHoras;
    private javax.swing.JFormattedTextField jTxtForIdentificacion;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
