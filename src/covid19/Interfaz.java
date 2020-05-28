package covid19;

import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    ListaSimple listaCasos = new ListaSimple();
    ListaSimple listaMuertes = new ListaSimple();
    ListaSimple listaRecuperados = new ListaSimple();

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        registrarCasos = new javax.swing.JButton();
        mostrarCasos = new javax.swing.JButton();
        registrarMuerte = new javax.swing.JButton();
        informeMuertes = new javax.swing.JButton();
        registrarRecuperados = new javax.swing.JButton();
        informeRecuperados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Registro e Informe de casos de Covid19");

        registrarCasos.setText("Registrar Caso");
        registrarCasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarCasosActionPerformed(evt);
            }
        });

        mostrarCasos.setText("Mostrar Casos");
        mostrarCasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCasosActionPerformed(evt);
            }
        });

        registrarMuerte.setText("Registrar Muerte");
        registrarMuerte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarMuerteActionPerformed(evt);
            }
        });

        informeMuertes.setText("Informe de Muertes");
        informeMuertes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informeMuertesActionPerformed(evt);
            }
        });

        registrarRecuperados.setText("Registrar Recuperados");
        registrarRecuperados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarRecuperadosActionPerformed(evt);
            }
        });

        informeRecuperados.setText("Informe Recuperados");
        informeRecuperados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informeRecuperadosActionPerformed(evt);
            }
        });

        mostrar.setColumns(20);
        mostrar.setRows(5);
        jScrollPane1.setViewportView(mostrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registrarCasos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registrarMuerte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registrarRecuperados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(informeRecuperados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mostrarCasos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(informeMuertes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarCasos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarCasos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarMuerte, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(informeMuertes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarRecuperados, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(informeRecuperados, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarCasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarCasosActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificación del paciente"));
        Nodo aux = listaMuertes.buscarPaciente(id);
        Nodo aux2 = listaCasos.buscarPaciente(id);
        if (aux != null) {
            JOptionPane.showMessageDialog(null, "ERROR: ésta persona ha fallecido");
        } else {
            if (aux2 != null) {
                JOptionPane.showMessageDialog(null, "ERROR: ésta persona ya está registrada");
            } else {
                listaCasos.registrarPaciente(id);
                mostrar.setText(listaCasos.mostrarlista());
            }
        }
    }//GEN-LAST:event_registrarCasosActionPerformed

    private void mostrarCasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCasosActionPerformed
        mostrar.setText(listaCasos.mostrarlista());

    }//GEN-LAST:event_mostrarCasosActionPerformed

    private void registrarMuerteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarMuerteActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificación del paciente"));
        Nodo aux = listaCasos.buscarPaciente(id);
        if (aux != null) {
            Nodo nuevo = new Nodo();
            nuevo = aux;
            listaMuertes.registrarMuerte(nuevo);
            listaCasos.eliminarPaciente(id);
            mostrar.setText(listaCasos.mostrarlista());
        } else {
            JOptionPane.showMessageDialog(null, "Éste caso no se encuentra registrado");
        }
    }//GEN-LAST:event_registrarMuerteActionPerformed

    private void informeMuertesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informeMuertesActionPerformed
        mostrar.setText(listaMuertes.mostrarlistaMuertes());
    }//GEN-LAST:event_informeMuertesActionPerformed

    private void registrarRecuperadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarRecuperadosActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificación del paciente"));
        Nodo aux = listaCasos.buscarPaciente(id);
        if (aux != null) {
            Nodo nuevo = new Nodo();
            nuevo = aux;
            listaRecuperados.registrarRecuperado(nuevo);
            listaCasos.eliminarPaciente(id);
            mostrar.setText(listaCasos.mostrarlista());
        } else {
            JOptionPane.showMessageDialog(null, "Éste caso no se encuentra registrado");
        }
    }//GEN-LAST:event_registrarRecuperadosActionPerformed

    private void informeRecuperadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informeRecuperadosActionPerformed
        mostrar.setText(listaRecuperados.mostrarlistaRecuperados());
    }//GEN-LAST:event_informeRecuperadosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton informeMuertes;
    private javax.swing.JButton informeRecuperados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mostrar;
    private javax.swing.JButton mostrarCasos;
    private javax.swing.JButton registrarCasos;
    private javax.swing.JButton registrarMuerte;
    private javax.swing.JButton registrarRecuperados;
    // End of variables declaration//GEN-END:variables
}
