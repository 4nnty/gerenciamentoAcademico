/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetounifg;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetounifg.notaAlunos;
import projetounifg.notas;

/**
 *
 * @author MatheusWP
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeAluno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        curso = new javax.swing.JComboBox<>();
        uf = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        campus = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btn_1 = new javax.swing.JRadioButton();
        btn_3 = new javax.swing.JRadioButton();
        btn_2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        editar = new javax.swing.JToggleButton();
        excluir = new javax.swing.JToggleButton();
        cadastrar = new javax.swing.JToggleButton();
        gerar = new javax.swing.JToggleButton();
        faltas = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAlunos = new javax.swing.JTable();
        tell = new javax.swing.JFormattedTextField();
        dataNascismento = new javax.swing.JFormattedTextField();
        raAluno = new javax.swing.JFormattedTextField();
        cpf = new javax.swing.JFormattedTextField();
        municipio = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(60, 85, 253));

        jPanel4.setBackground(new java.awt.Color(60, 85, 253));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Cadastro de Alunos");

        jPanel2.setBackground(new java.awt.Color(60, 85, 253));
        jPanel2.setForeground(java.awt.Color.white);
        jPanel2.setToolTipText("alunos");

        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("RA:");

        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Nome");

        nomeAluno.setToolTipText("nomeAluno");

        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("CPF:");

        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("UF");

        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Data de nascimento:");

        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Telefone:");

        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Curso");

        curso.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        curso.setForeground(new java.awt.Color(255, 255, 255));
        curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Engenharia de Software", "Ciências de Dados", "Análises e Desenvolvimento de Sistemas", "Redes de Computadores", "Engenharia de Dados", "Ciência da Computação", "Engenharia da Computação", "Gestão em Tecnologia da Informação" }));
        curso.setToolTipText("curso");
        curso.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        curso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursoActionPerformed(evt);
            }
        });

        uf.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        uf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "AC", "AL", "AP\t", "AM", "BA\t", "CE", "DF", "ES\t", "GO", "MA", "MT", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SP", "SE", "TO" }));
        uf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ufActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Campus:");

        campus.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        campus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Campus", "São Sebastião 611" }));
        campus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campusActionPerformed(evt);
            }
        });

        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Período:");

        btn_1.setForeground(java.awt.Color.white);
        btn_1.setText("Matutino");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_3.setForeground(java.awt.Color.white);
        btn_3.setText("Noturno");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_2.setForeground(java.awt.Color.white);
        btn_2.setText("Vespertino");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setText("Munícipio");

        editar.setText("Editar Aluno");
        editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        excluir.setText("Excluir Aluno");
        excluir.setToolTipText("");
        excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        cadastrar.setText("Cadastrar Aluno");
        cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        gerar.setText("Gerar Boletim");
        gerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarActionPerformed(evt);
            }
        });

        faltas.setText("Faltas");
        faltas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        faltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faltasActionPerformed(evt);
            }
        });

        tbAlunos.setBackground(new java.awt.Color(60, 85, 253));
        tbAlunos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbAlunos.setForeground(java.awt.Color.white);
        tbAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "RA", "Curso", "Período", "UF", "CPF", "Telefone", " Nascimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAlunos.setToolTipText("Alunos Cadastrados");
        tbAlunos.setColumnSelectionAllowed(true);
        tbAlunos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbAlunos.setGridColor(java.awt.Color.white);
        tbAlunos.setName(""); // NOI18N
        tbAlunos.setRequestFocusEnabled(false);
        tbAlunos.setRowHeight(32);
        tbAlunos.setSelectionBackground(new java.awt.Color(102, 102, 102));
        tbAlunos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbAlunos.setShowHorizontalLines(false);
        tbAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAlunosMouseClicked(evt);
            }
        });
        tbAlunos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbAlunosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbAlunos);
        tbAlunos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tbAlunos.getColumnModel().getColumnCount() > 0) {
            tbAlunos.getColumnModel().getColumn(0).setMinWidth(200);
            tbAlunos.getColumnModel().getColumn(1).setMaxWidth(200);
            tbAlunos.getColumnModel().getColumn(2).setMinWidth(0);
            tbAlunos.getColumnModel().getColumn(3).setMinWidth(110);
            tbAlunos.getColumnModel().getColumn(3).setMaxWidth(160);
            tbAlunos.getColumnModel().getColumn(4).setMinWidth(20);
            tbAlunos.getColumnModel().getColumn(4).setMaxWidth(40);
            tbAlunos.getColumnModel().getColumn(5).setMinWidth(130);
            tbAlunos.getColumnModel().getColumn(5).setMaxWidth(130);
            tbAlunos.getColumnModel().getColumn(6).setMinWidth(130);
            tbAlunos.getColumnModel().getColumn(6).setMaxWidth(140);
            tbAlunos.getColumnModel().getColumn(7).setMinWidth(110);
            tbAlunos.getColumnModel().getColumn(7).setMaxWidth(110);
        }

        try {
            tell.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            dataNascismento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            raAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            municipio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUUUUUUUUUUU")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(raAluno)
                            .addGap(63, 63, 63)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(dataNascismento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(122, 122, 122)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tell, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(curso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(jLabel9)
                                .addGap(12, 12, 12)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(btn_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(gerar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(faltas, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1089, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataNascismento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(curso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(btn_1)
                        .addComponent(btn_2)
                        .addComponent(btn_3)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gerar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faltas, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(421, 421, 421))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1178, 685));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbAlunosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbAlunosKeyPressed

    }//GEN-LAST:event_tbAlunosKeyPressed

    private void tbAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAlunosMouseClicked
        int linhaSelected = tbAlunos.getSelectedRow();
        nomeAluno.setText(tbAlunos.getValueAt(linhaSelected, 0).toString());
        raAluno.setText(tbAlunos.getValueAt(linhaSelected, 1).toString());
        curso.setSelectedItem(tbAlunos.getValueAt(linhaSelected, 2).toString());

        //Será preciso utilizar o banco de dados para sicronizar essas informações abaixo!
        tell.setText(tbAlunos.getValueAt(linhaSelected, 6).toString());
        dataNascismento.setText(tbAlunos.getValueAt(linhaSelected, 7).toString());
        cpf.setText((tbAlunos.getValueAt(linhaSelected, 5).toString()));
        uf.setSelectedItem(tbAlunos.getValueAt(linhaSelected, 4).toString());

//        È preciso refatorar
//        campus.setSelectedItem((tbAlunos.getValueAt(linhaSelected, 0).toString()));
//        municipio.setText(tbAlunos.getValueAt(linhaSelected, 0).toString());

    }//GEN-LAST:event_tbAlunosMouseClicked

    private void faltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faltasActionPerformed
        faltaAlunos novaJanela = new faltaAlunos();
        int rowSelected = tbAlunos.getSelectedRow();
        notas modelo = new notas();
        modelo.setNome(tbAlunos.getValueAt(rowSelected, 0).toString());
        modelo.setRa(tbAlunos.getValueAt(rowSelected, 1).toString());
        faltaAlunos faltas = new faltaAlunos();
        faltas.receberDados(modelo);
        faltas.setVisible(true);
    }//GEN-LAST:event_faltasActionPerformed

    private void gerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarActionPerformed

        notaAlunos novaJanela = new notaAlunos();
        int rowSelected = tbAlunos.getSelectedRow();
        notas modelo = new notas();
        modelo.setNome(tbAlunos.getValueAt(rowSelected, 0).toString());
        modelo.setRa(tbAlunos.getValueAt(rowSelected, 1).toString());
        notaAlunos notas = new notaAlunos();
        notas.receberDados(modelo);
        notas.setVisible(true);
    }//GEN-LAST:event_gerarActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        DefaultTableModel tbalunos = (DefaultTableModel) tbAlunos.getModel();
        Object[] dadosBase = {nomeAluno.getText(), raAluno.getText(), curso.getSelectedItem(), btn_1.getText(), btn_2.getText(), btn_3.getText()};
        if (nomeAluno.getText().equals("") || raAluno.getText().equals("") || cpf.getText().equals("") || dataNascismento.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o aluno, tente novamente.");
            nomeAluno.requestFocus();
        } else if (curso.getSelectedItem().equals(" ") || uf.getSelectedItem().equals(" ") || campus.getSelectedItem().equals("Selecione um Campus")) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o aluno, tente novamente.");
            curso.requestFocus();
        } else if (btn_1.isSelected()) {
            Object[] dados1 = {nomeAluno.getText(), raAluno.getText(), curso.getSelectedItem(), btn_1.getText(), uf.getSelectedItem(), cpf.getText(), tell.getText(), dataNascismento.getText()};
            tbalunos.addRow(dados1);
            nomeAluno.setText("");
            raAluno.setText("");
            curso.setSelectedItem("");
            btn_1.setSelected(false);
            btn_2.setSelected(false);
            btn_3.setSelected(false);
            cpf.setText("");
            tell.setText("");
            dataNascismento.setText("");
            municipio.setText("");
            curso.setSelectedItem(" ");
            campus.setSelectedItem("Selecione um Campus");
            uf.setSelectedItem(" ");
        } else if (btn_2.isSelected()) {
            Object[] dados2 = {nomeAluno.getText(), raAluno.getText(), curso.getSelectedItem(), btn_2.getText(), uf.getSelectedItem(), cpf.getText(), tell.getText(), dataNascismento.getText()};
            tbalunos.addRow(dados2);
            nomeAluno.setText("");
            raAluno.setText("");
            curso.setSelectedItem("");
            btn_1.setSelected(false);
            btn_2.setSelected(false);
            btn_3.setSelected(false);
            cpf.setText("");
            tell.setText("");
            dataNascismento.setText("");
            municipio.setText("");
            curso.setSelectedItem(" ");
            campus.setSelectedItem("Selecione um Campus");
            uf.setSelectedItem(" ");
        } else if (btn_3.isSelected()) {
            Object[] dados3 = {nomeAluno.getText(), raAluno.getText(), curso.getSelectedItem(), btn_3.getText(), uf.getSelectedItem(), cpf.getText(), tell.getText(), dataNascismento.getText()};
            tbalunos.addRow(dados3);
            nomeAluno.setText("");
            raAluno.setText("");
            curso.setSelectedItem("");
            btn_1.setSelected(false);
            btn_2.setSelected(false);
            btn_3.setSelected(false);
            cpf.setText("");
            tell.setText("");
            dataNascismento.setText("");
            municipio.setText("");
            curso.setSelectedItem(" ");
            campus.setSelectedItem("Selecione um Campus");
            uf.setSelectedItem(" ");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar aluno, tente novamente.");
        }

    }//GEN-LAST:event_cadastrarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        if (tbAlunos.getSelectedRow() != -1) {
            JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o aluno?", "Confirme a ação", WIDTH, JOptionPane.QUESTION_MESSAGE);
            DefaultTableModel tbalunos = (DefaultTableModel) tbAlunos.getModel();
            tbalunos.removeRow(tbAlunos.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Aluno excluído com sucesso.");
            nomeAluno.setText("");
            raAluno.setText("");
            curso.setSelectedItem("");
            btn_1.setSelected(false);
            btn_2.setSelected(false);
            btn_3.setSelected(false);
            cpf.setText("");
            tell.setText("");
            dataNascismento.setText("");
            municipio.setText("");
            curso.setSelectedItem(" ");
            campus.setSelectedItem("Selecione um Campus");
            uf.setSelectedItem(" ");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Aluno para exclusão.");
        }

    }//GEN-LAST:event_excluirActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed

        if (tbAlunos.getSelectedRow() != -1) {
            if (curso.getSelectedItem().equals(" ") || uf.getSelectedItem().equals(" ") || campus.getSelectedItem().equals("Selecione um Campus")) {
                JOptionPane.showMessageDialog(null, "Existem dados ainda não preenchidos, tente novamente.");
            } else {
                JOptionPane.showConfirmDialog(null, "Deseja realmente editar dados do aluno?", "Confirme a ação", WIDTH, JOptionPane.QUESTION_MESSAGE);
                tbAlunos.setValueAt(nomeAluno.getText(), tbAlunos.getSelectedRow(), 0);
                tbAlunos.setValueAt(raAluno.getText(), tbAlunos.getSelectedRow(), 1);
                tbAlunos.setValueAt(curso.getSelectedItem(), tbAlunos.getSelectedRow(), 2);
                tbAlunos.setValueAt(uf.getSelectedItem(), tbAlunos.getSelectedRow(), 4);
                tbAlunos.setValueAt(cpf.getText(), tbAlunos.getSelectedRow(), 5);
                tbAlunos.setValueAt(tell.getText(), tbAlunos.getSelectedRow(), 6);
                tbAlunos.setValueAt(dataNascismento.getText(), tbAlunos.getSelectedRow(), 7);
            }
        }
    }//GEN-LAST:event_editarActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        btn_1.setSelected(false);
        btn_3.setSelected(false);
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        btn_1.setSelected(false);
        btn_2.setSelected(false);
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        btn_2.setSelected(false);
        btn_3.setSelected(false);
    }//GEN-LAST:event_btn_1ActionPerformed

    private void campusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campusActionPerformed

    private void ufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ufActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ufActionPerformed

    private void cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cursoActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn_1;
    private javax.swing.JRadioButton btn_2;
    private javax.swing.JRadioButton btn_3;
    private javax.swing.JToggleButton cadastrar;
    private javax.swing.JComboBox<String> campus;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JComboBox<String> curso;
    private javax.swing.JFormattedTextField dataNascismento;
    private javax.swing.JToggleButton editar;
    private javax.swing.JToggleButton excluir;
    private javax.swing.JToggleButton faltas;
    private javax.swing.JToggleButton gerar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField municipio;
    private javax.swing.JTextField nomeAluno;
    private javax.swing.JFormattedTextField raAluno;
    private javax.swing.JTable tbAlunos;
    private javax.swing.JFormattedTextField tell;
    private javax.swing.JComboBox<String> uf;
    // End of variables declaration//GEN-END:variables
}
