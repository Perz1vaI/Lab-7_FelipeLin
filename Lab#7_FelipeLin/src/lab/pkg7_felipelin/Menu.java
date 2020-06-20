/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_felipelin;

import java.awt.BorderLayout;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author felipelinzhao
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_agregar = new javax.swing.JDialog();
        jButton5 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_archivo_nombre = new javax.swing.JTextField();
        tf_archivo_size = new javax.swing.JTextField();
        cb_extension = new javax.swing.JComboBox<>();
        crear_archivo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tf_carpeta_nombre = new javax.swing.JTextField();
        crear_carpeta = new javax.swing.JButton();
        main_lista = new javax.swing.JDialog();
        jButton6 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_main = new javax.swing.JList<>();
        pb_principal = new javax.swing.JProgressBar();
        jPanel4 = new javax.swing.JPanel();
        pb_principal2 = new javax.swing.JProgressBar();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_destacados = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        pb_principal3 = new javax.swing.JProgressBar();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_basura = new javax.swing.JList<>();
        popup_main = new javax.swing.JPopupMenu();
        destacado = new javax.swing.JMenuItem();
        agregar = new javax.swing.JMenuItem();
        elim = new javax.swing.JMenuItem();
        popup_eliminar = new javax.swing.JPopupMenu();
        eliminar = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jd_agregar.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jButton5.setText("Regresar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Extension");

        jLabel3.setText("Tamaño");

        cb_extension.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pdf", "txt", "docx", "jpg", "mp4" }));

        crear_archivo.setText("Crear");
        crear_archivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crear_archivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_archivo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_extension, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_archivo_size, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(crear_archivo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_archivo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_extension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_archivo_size, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(crear_archivo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Archivo", jPanel1);

        jLabel4.setText("Nombre");

        crear_carpeta.setText("Crear");
        crear_carpeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crear_carpetaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_carpeta_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(crear_carpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_carpeta_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(crear_carpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        jTabbedPane1.addTab("Carpeta", jPanel2);

        javax.swing.GroupLayout jd_agregarLayout = new javax.swing.GroupLayout(jd_agregar.getContentPane());
        jd_agregar.getContentPane().setLayout(jd_agregarLayout);
        jd_agregarLayout.setHorizontalGroup(
            jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_agregarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jd_agregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jd_agregarLayout.setVerticalGroup(
            jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_agregarLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        main_lista.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        main_lista.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setText("Regresar");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        main_lista.getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 107, 45));

        jTabbedPane2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane2StateChanged(evt);
            }
        });

        jl_main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_mainMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jl_main);

        pb_principal.setToolTipText("");
        pb_principal.setString("");
        pb_principal.setStringPainted(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(pb_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pb_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jTabbedPane2.addTab("Mi Unidad", jPanel3);

        pb_principal2.setToolTipText("");
        pb_principal2.setString("");
        pb_principal2.setStringPainted(true);

        jScrollPane3.setViewportView(jl_destacados);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(pb_principal2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pb_principal2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Destacado", jPanel4);

        pb_principal3.setToolTipText("");
        pb_principal3.setString("");
        pb_principal3.setStringPainted(true);

        jl_basura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_basuraMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jl_basura);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(pb_principal3, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pb_principal3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Elminar", jPanel5);

        main_lista.getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 670, 470));

        destacado.setLabel("Mover Destacado");
        destacado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destacadoActionPerformed(evt);
            }
        });
        popup_main.add(destacado);

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        popup_main.add(agregar);

        elim.setLabel("Eliminar");
        elim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimActionPerformed(evt);
            }
        });
        popup_main.add(elim);

        eliminar.setLabel("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        popup_eliminar.add(eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Menu");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton4.setText("Agregar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        jd_agregar.setLocationRelativeTo(null);
        jd_agregar.pack();
        jd_agregar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        jd_agregar.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jButton5MouseClicked

    private void crear_archivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_archivoMouseClicked
        // TODO add your handling code here:
        try {
            String nombre, extension = "", link;
            int size;
            adminArchivo aa = new adminArchivo("./Archivo.ola");

            nombre = tf_archivo_nombre.getText();
            size = Integer.parseInt(tf_archivo_size.getText());
            link = random();

            if (cb_extension.getSelectedIndex() == 0) {

                extension = ".pdf";
            } else if (cb_extension.getSelectedIndex() == 1) {
                extension = ".txt";

            } else if (cb_extension.getSelectedIndex() == 2) {
                extension = ".docx";

            } else if (cb_extension.getSelectedIndex() == 3) {
                extension = ".jpg";

            } else if (cb_extension.getSelectedIndex() == 4) {
                extension = ".mp4";

            }

            Archivo a = new Archivo(nombre, link, extension, size);
            aa.cargarArchivo();
            aa.setArchivo(a);
            aa.escribirArchivo();

            tf_archivo_nombre.setText("");
            tf_archivo_size.setText("");
            cb_extension.setSelectedIndex(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_agregar, "Ocurrio un error!");
            tf_archivo_nombre.setText("");
            tf_archivo_size.setText("");
            cb_extension.setSelectedIndex(0);

        }
    }//GEN-LAST:event_crear_archivoMouseClicked

    private void crear_carpetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_carpetaMouseClicked
        // TODO add your handling code here:
        try {
            adminArchivo aa = new adminArchivo("./Archivo.ola");
            adminCarpeta ac = new adminCarpeta("./Carpeta.ola");
            String nombre, link;
            String con1, con2, cadena1 = "", cadena2 = "";
            nombre = tf_carpeta_nombre.getText();
            link = random2();

            aa.cargarArchivo();
            ac.cargarArchivo();
            int cant = ac.getLista().size();

            if (!ac.getLista().isEmpty()) {

                for (Carpeta c : ac.getLista()) {
                    cadena1 += ac.getLista().indexOf(c) + " - " + c + "\n";
                }
                con1 = JOptionPane.showInputDialog(jd_agregar, "Desea agregar una carpeta [s/n]");
                while (con1.equals("s")) {
                    int pos = Integer.parseInt(JOptionPane.showInputDialog(this, cadena1 + "\nIngrese la posicion que quiere agregar"));
                    ac.getLista().get(cant).getLista_carpeta().add(ac.getLista().get(pos));
                    con1 = JOptionPane.showInputDialog(jd_agregar, "Desea agregar otra carpeta [s/n]");
                }
            }

            Carpeta p = new Carpeta(nombre, link);

            ac.setCarpeta(p);

            if (!aa.getLista().isEmpty()) {
                for (Archivo c : aa.getLista()) {
                    cadena2 += aa.getLista().indexOf(c) + " - " + c + "\n";
                }
                con2 = JOptionPane.showInputDialog(jd_agregar, "Desea agregar un archivo [s/n]");
                while (con2.equals("s")) {
                    int pos = Integer.parseInt(JOptionPane.showInputDialog(this, cadena2 + "\nIngrese la posicion que quiere agregar"));
                    ac.getLista().get(cant).getLista_archivo().add(aa.getLista().get(pos));
                    con2 = JOptionPane.showInputDialog(jd_agregar, "Desea agregar otro archivo [s/n]");
                }
            }

            ac.escribirArchivo();
            aa.escribirArchivo();

            tf_carpeta_nombre.setText("");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(jd_agregar, "Ocurrio un error!");
            tf_carpeta_nombre.setText("");
        }
    }//GEN-LAST:event_crear_carpetaMouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        main_lista.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        DefaultListModel modelo = new DefaultListModel();
        main_lista.pack();
        main_lista.setLocationRelativeTo(null);
        main_lista.setVisible(true);
        this.dispose();

        try {
            Carpeta temp;

            FileInputStream entrada = new FileInputStream("./Carpeta.ola");
            ObjectInputStream objeto = new ObjectInputStream(entrada);
            try {
                while ((temp = (Carpeta) objeto.readObject()) != null) {
                    modelo.addElement(temp);
                }
            } catch (Exception e) {
            }
            objeto.close();
            entrada.close();
            
            Archivo temp2;

            FileInputStream entrada2 = new FileInputStream("./Archivo.ola");
            ObjectInputStream objeto2 = new ObjectInputStream(entrada2);
            try {
                while ((temp2 = (Archivo) objeto2.readObject()) != null) {
                    modelo.addElement(temp2);
                }
            } catch (Exception e) {
            }
            objeto2.close();
            entrada2.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (jl_main.isSelectionEmpty()) {
            hl = new hilolink(pb_principal, "Mi Unidad");
        } else {
            hl = new hilolink(pb_principal, ((Carpeta) modelo.get(jl_main.getSelectedIndex())).getLink());

        }

        Thread proceso1 = new Thread(hl);
        proceso1.start();
        jl_main.setModel(modelo);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jl_mainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_mainMouseClicked
        // TODO add your handling code here:

        if (jl_main.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                popup_main.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jl_mainMouseClicked

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        jd_agregar.setLocationRelativeTo(null);
        jd_agregar.pack();
        jd_agregar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agregarActionPerformed

    private void destacadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destacadoActionPerformed
        // TODO add your handling code here:
        DefaultListModel model2 = (DefaultListModel) jl_main.getModel();
        DefaultListModel model = new DefaultListModel();
        model.addElement(jl_main.getSelectedValue());
        model2.remove(jl_main.getSelectedIndex());
        jl_destacados.setModel(model);
        jl_main.setModel(model2);
    }//GEN-LAST:event_destacadoActionPerformed

    private void jTabbedPane2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane2StateChanged
        // TODO add your handling code here:

        DefaultListModel modelo = new DefaultListModel();

        if (jl_destacados.isSelectionEmpty()) {
            hl = new hilolink(pb_principal2, "Destacado");
        } else {
            hl = new hilolink(pb_principal2, ((Carpeta) modelo.get(jl_destacados.getSelectedIndex())).getLink());

        }

        Thread proceso1 = new Thread(hl);
        proceso1.start();
        
        if (jl_basura.isSelectionEmpty()) {
            hl = new hilolink(pb_principal3, "Papelera");
        } else {
            hl = new hilolink(pb_principal3, ((Carpeta) modelo.get(jl_basura.getSelectedIndex())).getLink());

        }

        Thread proceso2 = new Thread(hl);
        proceso2.start();

       

    }//GEN-LAST:event_jTabbedPane2StateChanged

    private void elimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimActionPerformed
        // TODO add your handling code here:
        DefaultListModel model2 = (DefaultListModel) jl_main.getModel();
        DefaultListModel model = new DefaultListModel();
        model.addElement(jl_main.getSelectedValue());
        model2.remove(jl_main.getSelectedIndex());
        jl_basura.setModel(model);
        jl_main.setModel(model2);
    }//GEN-LAST:event_elimActionPerformed

    private void jl_basuraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_basuraMouseClicked
        // TODO add your handling code here:
        if (jl_basura.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                popup_eliminar.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jl_basuraMouseClicked

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        DefaultListModel model = (DefaultListModel) jl_basura.getModel();
        if (model.get(jl_basura.getSelectedIndex()) instanceof Carpeta) {
            adminCarpeta ac = new adminCarpeta("./Carpeta.ola");

            ac.cargarArchivo();
            ac.getLista().remove(jl_basura.getSelectedIndex());
            ac.escribirArchivo();
            model.remove(jl_basura.getSelectedIndex());

            jl_basura.setModel(model);
        } else if (model.get(jl_basura.getSelectedIndex()) instanceof Archivo) {
            adminArchivo ac = new adminArchivo("./Archivo.ola");

            ac.cargarArchivo();
            ac.getLista().remove(jl_basura.getSelectedIndex());
            ac.escribirArchivo();
            model.remove(jl_basura.getSelectedIndex());

            jl_basura.setModel(model);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
        
          
    }

    public static Random random = new Random();

    public static String random() {
        String cadena = "";
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String combi = abecedario + abecedario.toLowerCase() + "123456789";
        char c;

        for (int i = 0; i < 10; i++) {
            c = combi.charAt(random.nextInt(62));
            cadena += c;
        }

        return cadena;
    }

    public static String random2() {
        String cadena = "";
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String combi = abecedario + abecedario.toLowerCase() + "123456789";
        char c;

        for (int i = 0; i < 5; i++) {
            c = combi.charAt(random.nextInt(62));
            cadena += c;
        }

        return cadena;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agregar;
    private javax.swing.JComboBox<String> cb_extension;
    private javax.swing.JButton crear_archivo;
    private javax.swing.JButton crear_carpeta;
    private javax.swing.JMenuItem destacado;
    private javax.swing.JMenuItem elim;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JDialog jd_agregar;
    private javax.swing.JList<String> jl_basura;
    private javax.swing.JList<String> jl_destacados;
    private javax.swing.JList<String> jl_main;
    private javax.swing.JDialog main_lista;
    private javax.swing.JProgressBar pb_principal;
    private javax.swing.JProgressBar pb_principal2;
    private javax.swing.JProgressBar pb_principal3;
    private javax.swing.JPopupMenu popup_eliminar;
    private javax.swing.JPopupMenu popup_main;
    private javax.swing.JTextField tf_archivo_nombre;
    private javax.swing.JTextField tf_archivo_size;
    private javax.swing.JTextField tf_carpeta_nombre;
    // End of variables declaration//GEN-END:variables
 hilolink hl;
    
    

}
