package util;

import src.cajas.Login;
import src.cajas.Opcion;
import src.cajas.mensaje;
import src.clases.Almacenista;

import src.clases.Cajero;
import src.clases.Empleado;
import src.clases.Gerente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import src.clases.Articulo;

public class VentanaPrincipal extends javax.swing.JFrame implements Runnable {

    ArrayList<Articulo> inventario = new ArrayList<>();
    int i = 1;
    Articulo art;

    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        cmbItemOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALMACENISTA", "GERENTE", "CAJERO"}));
        setTitle("GrocerySoft");
        System.out.println(getClass().getResource("./icono.png"));
        ImageIcon image = new javax.swing.ImageIcon(getClass().getResource("./icono.png"));
        setIconImage(image.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbdVentana = new javax.swing.JTabbedPane();
        pnlArticuloNuevo = new javax.swing.JPanel();
        lblArticulo = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblExistencia = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtArticulo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        cmdGuardar = new javax.swing.JButton();
        lblConsultar = new javax.swing.JLabel();
        txtConsultar = new javax.swing.JTextField();
        cmdBuscarCodigo = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        lblNumeroArticulo = new javax.swing.JLabel();
        lblArticuloEliminado = new javax.swing.JLabel();
        txtExistencia = new javax.swing.JTextField();
        pnlCatalogo = new javax.swing.JPanel();
        scrPanelIneventario = new javax.swing.JScrollPane();
        txtAreaImpresion = new javax.swing.JTextArea();
        cmdInventarioZ = new javax.swing.JButton();
        pnlEmpleados = new javax.swing.JPanel();
        cmbItemOpciones = new javax.swing.JComboBox<>();
        cmdMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaEmpleados = new javax.swing.JTextArea();
        mnuBarPrincipal = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuItemGuardar = new javax.swing.JMenuItem();
        mnuItemAbrir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblArticulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblArticulo.setText("Articulo:");

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecio.setText("Precio:");

        lblExistencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblExistencia.setText("Existencia:");

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodigo.setText("Codigo: ");

        txtArticulo.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N

        txtPrecio.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N

        txtCodigo.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N

        cmdGuardar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });

        lblConsultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblConsultar.setText("Consultar Articulo: ");

        txtConsultar.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N

        cmdBuscarCodigo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cmdBuscarCodigo.setText("Buscar ");
        cmdBuscarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarCodigoActionPerformed(evt);
            }
        });

        cmdEliminar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cmdEliminar.setText("Eliminar Articulo");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });

        lblNumeroArticulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNumeroArticulo.setText("No de Articulo: 1");

        lblArticuloEliminado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtExistencia.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N

        javax.swing.GroupLayout pnlArticuloNuevoLayout = new javax.swing.GroupLayout(pnlArticuloNuevo);
        pnlArticuloNuevo.setLayout(pnlArticuloNuevoLayout);
        pnlArticuloNuevoLayout.setHorizontalGroup(
            pnlArticuloNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArticuloNuevoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlArticuloNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlArticuloNuevoLayout.createSequentialGroup()
                        .addGroup(pnlArticuloNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConsultar)
                            .addGroup(pnlArticuloNuevoLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(cmdBuscarCodigo)))
                        .addGap(30, 30, 30)
                        .addGroup(pnlArticuloNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addGroup(pnlArticuloNuevoLayout.createSequentialGroup()
                                .addComponent(cmdEliminar)
                                .addGap(27, 27, 27)
                                .addComponent(lblArticuloEliminado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(26, 26, 26))
                    .addGroup(pnlArticuloNuevoLayout.createSequentialGroup()
                        .addGroup(pnlArticuloNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlArticuloNuevoLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(pnlArticuloNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(pnlArticuloNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlArticuloNuevoLayout.createSequentialGroup()
                                .addGroup(pnlArticuloNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(txtPrecio)
                                    .addComponent(txtCodigo))
                                .addGap(18, 18, 18)
                                .addComponent(lblNumeroArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlArticuloNuevoLayout.createSequentialGroup()
                                .addGroup(pnlArticuloNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmdGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnlArticuloNuevoLayout.setVerticalGroup(
            pnlArticuloNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArticuloNuevoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlArticuloNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumeroArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlArticuloNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(pnlArticuloNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlArticuloNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cmdGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 69, Short.MAX_VALUE)
                .addGroup(pnlArticuloNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlArticuloNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlArticuloNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmdBuscarCodigo)
                        .addComponent(cmdEliminar))
                    .addComponent(lblArticuloEliminado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbdVentana.addTab("Articulo Nuevo", pnlArticuloNuevo);

        txtAreaImpresion.setColumns(20);
        txtAreaImpresion.setRows(5);
        txtAreaImpresion.setText("Articulo\tPrecio\tCodigo\tExistencia\t\n");
        scrPanelIneventario.setViewportView(txtAreaImpresion);

        cmdInventarioZ.setText("Inventario Z");
        cmdInventarioZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdInventarioZActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCatalogoLayout = new javax.swing.GroupLayout(pnlCatalogo);
        pnlCatalogo.setLayout(pnlCatalogoLayout);
        pnlCatalogoLayout.setHorizontalGroup(
            pnlCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCatalogoLayout.createSequentialGroup()
                .addComponent(scrPanelIneventario, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdInventarioZ)
                .addContainerGap())
        );
        pnlCatalogoLayout.setVerticalGroup(
            pnlCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCatalogoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(cmdInventarioZ)
                .addContainerGap(272, Short.MAX_VALUE))
            .addComponent(scrPanelIneventario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
        );

        tbdVentana.addTab("Catalogo", pnlCatalogo);

        cmbItemOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmdMostrar.setFont(new java.awt.Font("Adobe Naskh Medium", 0, 24)); // NOI18N
        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });

        txtAreaEmpleados.setColumns(20);
        txtAreaEmpleados.setRows(5);
        jScrollPane1.setViewportView(txtAreaEmpleados);

        javax.swing.GroupLayout pnlEmpleadosLayout = new javax.swing.GroupLayout(pnlEmpleados);
        pnlEmpleados.setLayout(pnlEmpleadosLayout);
        pnlEmpleadosLayout.setHorizontalGroup(
            pnlEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbItemOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(cmdMostrar)
                .addGap(41, 145, Short.MAX_VALUE))
            .addGroup(pnlEmpleadosLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlEmpleadosLayout.setVerticalGroup(
            pnlEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbItemOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbdVentana.addTab("Empleados", pnlEmpleados);

        mnuArchivo.setText("Archivo");

        mnuItemGuardar.setText("Guardar...");
        mnuItemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemGuardarActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuItemGuardar);

        mnuItemAbrir.setText("Abrir...");
        mnuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemAbrirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuItemAbrir);

        mnuBarPrincipal.add(mnuArchivo);

        setJMenuBar(mnuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbdVentana))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbdVentana)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed

        i = i + 1;
        Articulo arts = new Articulo();

        arts.setNombre(txtArticulo.getText());
        arts.setCodigo(txtCodigo.getText());
        arts.setPrecio(txtPrecio.getText());
        arts.setExistencia(txtExistencia.getText());
        lblNumeroArticulo.setText("No de articulo " + i);

        inventario.add(arts);

        txtArticulo.setText("");
        txtCodigo.setText("");
        txtPrecio.setText("");
        txtExistencia.setText("");
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdBuscarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarCodigoActionPerformed
        int ite = Integer.parseInt(txtConsultar.getText());

        if (ite <= inventario.size() && ite > 0) {
            art = inventario.get(ite - 1);

            txtArticulo.setText((String) art.getNombre());
            txtCodigo.setText((String) art.getCodigo());
            txtPrecio.setText((String) art.getPrecio());
            txtExistencia.setText((String) art.getExistencia());
        
        } else {

            mensaje.desplegar("Articulo no existente");

        }


    }//GEN-LAST:event_cmdBuscarCodigoActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed

        i = Integer.parseInt(txtConsultar.getText());
        inventario.remove(i - 1);
        
        txtArticulo.setText("");
        txtCodigo.setText("");
        txtPrecio.setText("");
        txtExistencia.setText("");
        
        Thread hilo = new Thread(this);

        hilo.start();

    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void cmdInventarioZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdInventarioZActionPerformed

        String inven = "";
        if (Opcion.desplegar("No se podran vovler a ver los datos, Desea continuar?") == true) {

            for (int j = 0; j < inventario.size(); j++) {
                art = inventario.get(j);

                inven += (String) art.getNombre() + "\t"
                        + (String) art.getCodigo() + "\t"
                        + (String) art.getPrecio() + "\t"
                        + (String) art.getExistencia() + "\n";
            }
            txtAreaImpresion.setText(inven);
            
            lblNumeroArticulo.setText("No de Articulo: 1");
            
        } else {
            mensaje.desplegar("Recomendamos un Corte X");
        }


    }//GEN-LAST:event_cmdInventarioZActionPerformed

    private void mnuItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemGuardarActionPerformed

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Archios *.txt", ".txt");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showSaveDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to save this file: "
                    + chooser.getSelectedFile().getName());
        }
        String ruta = chooser.getSelectedFile().getPath();
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(ruta));
            bw.write(txtAreaImpresion.getText());

            bw.close();

        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_mnuItemGuardarActionPerformed

    private void mnuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemAbrirActionPerformed

        try {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "Archivos *.txt", "txt");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                System.out.println("You chose to open this file: "
                        + chooser.getSelectedFile().getName());
            }
            
            String ruta = chooser.getSelectedFile().getPath();
            String linea;
            
            FileReader f = null;
                f = new FileReader(ruta);
            BufferedReader b = null;
                b = new BufferedReader(f);
            String contenido = "";
                
                while((linea = b.readLine()) != null) {
                    contenido += linea + "\n";
                }
         txtAreaImpresion.setText(contenido);
         contenido = "";
          b.close();
       
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuItemAbrirActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed

        String empleado = cmbItemOpciones.getSelectedItem().toString().trim(),
               acum = "",
               extra = "";
        Empleado emp = null;
        
        
        switch(empleado){
            
            case "ALMACENISTA":
                Almacenista alm = new Almacenista();
                emp = new Almacenista();
                extra = alm.getNumAlmacen();
                break;
            case "GERENTE":
                Gerente ger = new Gerente();
                emp = new Gerente();
                extra = ger.getSucursal();
                break;
            case "CAJERO":
                Cajero caj = new Cajero();
                emp = new Cajero();
                extra = caj.getNumCaja();
        }
        
       acum = "Nombre: "+ emp.getNombre() +"\n"
              +"Direccion: " +emp.getDireccion() + "\n"
              +"Telefono: " +emp.getTelefono() + "\n"
              +"Turno: " +emp.getTurno() + "\n"
              +"Sueldo: " +emp.getSueldo()+ "\n"
              + extra;
       
       txtAreaEmpleados.setText(acum);
    }//GEN-LAST:event_cmdMostrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbItemOpciones;
    private javax.swing.JButton cmdBuscarCodigo;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdInventarioZ;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArticulo;
    private javax.swing.JLabel lblArticuloEliminado;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblConsultar;
    private javax.swing.JLabel lblExistencia;
    private javax.swing.JLabel lblNumeroArticulo;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenuBar mnuBarPrincipal;
    private javax.swing.JMenuItem mnuItemAbrir;
    private javax.swing.JMenuItem mnuItemGuardar;
    private javax.swing.JPanel pnlArticuloNuevo;
    private javax.swing.JPanel pnlCatalogo;
    private javax.swing.JPanel pnlEmpleados;
    private javax.swing.JScrollPane scrPanelIneventario;
    private javax.swing.JTabbedPane tbdVentana;
    private javax.swing.JTextArea txtAreaEmpleados;
    private javax.swing.JTextArea txtAreaImpresion;
    private javax.swing.JTextField txtArticulo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtConsultar;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {

        try {

            lblArticuloEliminado.setText("Eliminado");

            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        lblArticuloEliminado.setText("");

    }
}
