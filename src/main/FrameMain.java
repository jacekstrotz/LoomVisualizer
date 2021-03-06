package main;

import java.awt.Color;
import java.awt.Point;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;

import regex.CustomFilter;

import com.formdev.flatlaf.FlatLightLaf;

public class FrameMain extends javax.swing.JFrame {

    static Color color[];
    static int pegNumber, repeatNumber[], rowNumber[];
    static private String pattern[];
    static private boolean init = false;
    
    private CustomFilter[] cf = new CustomFilter[3];
    
    public FrameMain() {
        FlatLightLaf.setup();
        initComponents();
        
        cf[0] = new CustomFilter("[0-9]+",3);
        cf[2] = new CustomFilter("[ON]+", 10);
        
        pattern = new String[4];
        color = new Color[4+1];
        repeatNumber = new int[4];
        rowNumber = new int[4];
        
        for (int i = 0; i < 4+1; i++) {
            if (i < 4) {
                pattern[i] = "";
                repeatNumber[i] = 0;
                rowNumber[i] = 1;
            }
            color[i] = new Color(0, 0, 0);
        }
        
        sizeSpinner.setValue(1);
        pegTextField = cf[0].adjustField(pegTextField);
        patternNumTextField = cf[2].adjustField(patternNumTextField);
        
        init = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrameInfo = new javax.swing.JFrame();
        infoLabel = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        FrameColor1 = new javax.swing.JFrame();
        colorChooser1 = new javax.swing.JColorChooser();
        oldColorLabel1 = new javax.swing.JLabel();
        FrameColor2 = new javax.swing.JFrame();
        colorChooser2 = new javax.swing.JColorChooser();
        newColorLabel1 = new javax.swing.JLabel();
        FrameColor3 = new javax.swing.JFrame();
        colorChooser3 = new javax.swing.JColorChooser();
        newColorLabel3 = new javax.swing.JLabel();
        FrameColor4 = new javax.swing.JFrame();
        colorChooser4 = new javax.swing.JColorChooser();
        newColorLabel4 = new javax.swing.JLabel();
        FrameColor5 = new javax.swing.JFrame();
        colorChooser5 = new javax.swing.JColorChooser();
        newColorLabel5 = new javax.swing.JLabel();
        FrameVisual = new javax.swing.JFrame();
        PanelVisual = new DrawPanel();
        mainLabel2 = new javax.swing.JLabel();
        warningDialog1 = new javax.swing.JDialog();
        mainLabel3 = new javax.swing.JLabel();
        warningLabel1 = new javax.swing.JLabel();
        exitButton1 = new javax.swing.JButton();
        warningDialog2 = new javax.swing.JDialog();
        mainLabel4 = new javax.swing.JLabel();
        warningLabel2 = new javax.swing.JLabel();
        exitButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        warningDialog3 = new javax.swing.JDialog();
        mainLabel5 = new javax.swing.JLabel();
        warningLabel3 = new javax.swing.JLabel();
        exitButton3 = new javax.swing.JButton();
        warningDialog4 = new javax.swing.JDialog();
        mainLabel6 = new javax.swing.JLabel();
        warningLabel4 = new javax.swing.JLabel();
        exitButton4 = new javax.swing.JButton();
        warningDialog5 = new javax.swing.JDialog();
        mainLabel7 = new javax.swing.JLabel();
        warningLabel5 = new javax.swing.JLabel();
        exitButton5 = new javax.swing.JButton();
        FramePattern1 = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        patternTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        oldColorLabel2 = new javax.swing.JLabel();
        oldColorButton = new javax.swing.JButton();
        newColorLabel2 = new javax.swing.JLabel();
        newColorButton = new javax.swing.JButton();
        FramePattern2 = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        patternTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        oldColorLabel3 = new javax.swing.JLabel();
        oldColorButton1 = new javax.swing.JButton();
        newColorLabel6 = new javax.swing.JLabel();
        newColorButton1 = new javax.swing.JButton();
        patternLabel2 = new javax.swing.JLabel();
        patternTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        color3Button = new javax.swing.JButton();
        FrameKey = new javax.swing.JFrame();
        mainLabel9 = new javax.swing.JLabel();
        pattern11Label = new javax.swing.JLabel();
        pattern21Label = new javax.swing.JLabel();
        pattern31Label = new javax.swing.JLabel();
        pattern41Label = new javax.swing.JLabel();
        pattern12Label = new javax.swing.JLabel();
        pattern22Label = new javax.swing.JLabel();
        pattern32Label = new javax.swing.JLabel();
        pattern42Label = new javax.swing.JLabel();
        colorPanel = new ColorPanel();
        mainLabel = new javax.swing.JLabel();
        pegLabel = new javax.swing.JLabel();
        pegTextField = new javax.swing.JTextField();
        infoButton = new javax.swing.JButton();
        drawButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        patternComboBox = new javax.swing.JComboBox<>();
        patternLabel1 = new javax.swing.JLabel();
        patternNumComboBox = new javax.swing.JComboBox<>();
        patternNumTextField = new javax.swing.JTextField();
        colorLabel1 = new javax.swing.JLabel();
        colorComboBox = new javax.swing.JComboBox<>();
        colorSelectButton = new javax.swing.JButton();
        sizeSpinner = new javax.swing.JSpinner();

        FrameInfo.setLocation(new java.awt.Point(0, 0));
        FrameInfo.setMinimumSize(new java.awt.Dimension(387, 170));
        FrameInfo.setResizable(false);
        FrameInfo.setSize(new java.awt.Dimension(387, 170));

        infoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("Info");

        label1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        label1.setText("Number of Pegs: ");

        label2.setText("The number of pegs on the loom");

        label5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        label5.setText("Pattern:");

        jLabel1.setText("A pattern in the form O = Old, N = New (ONNO)");

        exitButton.setText("OK");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("NOTE: Patterns are counted upwards (Pattern 1 is bottom)");

        javax.swing.GroupLayout FrameInfoLayout = new javax.swing.GroupLayout(FrameInfo.getContentPane());
        FrameInfo.getContentPane().setLayout(FrameInfoLayout);
        FrameInfoLayout.setHorizontalGroup(
            FrameInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameInfoLayout.createSequentialGroup()
                .addGroup(FrameInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(FrameInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(FrameInfoLayout.createSequentialGroup()
                                .addGroup(FrameInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FrameInfoLayout.createSequentialGroup()
                                        .addComponent(label1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label2))
                                    .addGroup(FrameInfoLayout.createSequentialGroup()
                                        .addComponent(label5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1)))
                                .addGap(0, 10, Short.MAX_VALUE))))
                    .addGroup(FrameInfoLayout.createSequentialGroup()
                        .addGroup(FrameInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrameInfoLayout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(exitButton))
                            .addGroup(FrameInfoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FrameInfoLayout.setVerticalGroup(
            FrameInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(label2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label5)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        FrameColor1.setMinimumSize(new java.awt.Dimension(686, 465));
        FrameColor1.setResizable(false);
        FrameColor1.setSize(new java.awt.Dimension(686, 465));

        oldColorLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        oldColorLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oldColorLabel1.setText("Select Color 1");

        javax.swing.GroupLayout FrameColor1Layout = new javax.swing.GroupLayout(FrameColor1.getContentPane());
        FrameColor1.getContentPane().setLayout(FrameColor1Layout);
        FrameColor1Layout.setHorizontalGroup(
            FrameColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameColor1Layout.createSequentialGroup()
                .addComponent(colorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameColor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oldColorLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        FrameColor1Layout.setVerticalGroup(
            FrameColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameColor1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(oldColorLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(colorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        FrameColor2.setMinimumSize(new java.awt.Dimension(686, 465));
        FrameColor2.setResizable(false);

        newColorLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        newColorLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newColorLabel1.setText("Select Color 2");

        javax.swing.GroupLayout FrameColor2Layout = new javax.swing.GroupLayout(FrameColor2.getContentPane());
        FrameColor2.getContentPane().setLayout(FrameColor2Layout);
        FrameColor2Layout.setHorizontalGroup(
            FrameColor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameColor2Layout.createSequentialGroup()
                .addComponent(colorChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameColor2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newColorLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        FrameColor2Layout.setVerticalGroup(
            FrameColor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameColor2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newColorLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(colorChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        FrameColor3.setMinimumSize(new java.awt.Dimension(686, 465));
        FrameColor3.setResizable(false);

        newColorLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        newColorLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newColorLabel3.setText("Select Color 3");

        javax.swing.GroupLayout FrameColor3Layout = new javax.swing.GroupLayout(FrameColor3.getContentPane());
        FrameColor3.getContentPane().setLayout(FrameColor3Layout);
        FrameColor3Layout.setHorizontalGroup(
            FrameColor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameColor3Layout.createSequentialGroup()
                .addComponent(colorChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameColor3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newColorLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        FrameColor3Layout.setVerticalGroup(
            FrameColor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameColor3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newColorLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(colorChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        FrameColor4.setMinimumSize(new java.awt.Dimension(686, 465));
        FrameColor4.setResizable(false);

        newColorLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        newColorLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newColorLabel4.setText("Select Color 4");

        javax.swing.GroupLayout FrameColor4Layout = new javax.swing.GroupLayout(FrameColor4.getContentPane());
        FrameColor4.getContentPane().setLayout(FrameColor4Layout);
        FrameColor4Layout.setHorizontalGroup(
            FrameColor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameColor4Layout.createSequentialGroup()
                .addComponent(colorChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameColor4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newColorLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        FrameColor4Layout.setVerticalGroup(
            FrameColor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameColor4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newColorLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(colorChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        FrameColor5.setMinimumSize(new java.awt.Dimension(686, 465));
        FrameColor5.setResizable(false);

        newColorLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        newColorLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newColorLabel5.setText("Select Color 5");

        javax.swing.GroupLayout FrameColor5Layout = new javax.swing.GroupLayout(FrameColor5.getContentPane());
        FrameColor5.getContentPane().setLayout(FrameColor5Layout);
        FrameColor5Layout.setHorizontalGroup(
            FrameColor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameColor5Layout.createSequentialGroup()
                .addComponent(colorChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameColor5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newColorLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        FrameColor5Layout.setVerticalGroup(
            FrameColor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameColor5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newColorLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(colorChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        FrameVisual.setMinimumSize(new java.awt.Dimension(612, 687));
        FrameVisual.setResizable(false);
        FrameVisual.setSize(new java.awt.Dimension(612, 687));

        PanelVisual.setPreferredSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout PanelVisualLayout = new javax.swing.GroupLayout(PanelVisual);
        PanelVisual.setLayout(PanelVisualLayout);
        PanelVisualLayout.setHorizontalGroup(
            PanelVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelVisualLayout.setVerticalGroup(
            PanelVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );

        mainLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        mainLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel2.setText("Visual");

        javax.swing.GroupLayout FrameVisualLayout = new javax.swing.GroupLayout(FrameVisual.getContentPane());
        FrameVisual.getContentPane().setLayout(FrameVisualLayout);
        FrameVisualLayout.setHorizontalGroup(
            FrameVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameVisualLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrameVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(PanelVisual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        FrameVisualLayout.setVerticalGroup(
            FrameVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameVisualLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelVisual, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                .addContainerGap())
        );

        warningDialog1.setMinimumSize(new java.awt.Dimension(285, 135));
        warningDialog1.setSize(new java.awt.Dimension(285, 135));

        mainLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        mainLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel3.setText("Warning");

        warningLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warningLabel1.setText("Please enter a number of pegs on the loom.");

        exitButton1.setText("OK");
        exitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout warningDialog1Layout = new javax.swing.GroupLayout(warningDialog1.getContentPane());
        warningDialog1.getContentPane().setLayout(warningDialog1Layout);
        warningDialog1Layout.setHorizontalGroup(
            warningDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warningDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(warningDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(warningLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, warningDialog1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(exitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)))
                .addContainerGap())
        );
        warningDialog1Layout.setVerticalGroup(
            warningDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warningDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(warningLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitButton1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        warningDialog2.setMinimumSize(new java.awt.Dimension(285, 145));
        warningDialog2.setResizable(false);
        warningDialog2.setSize(new java.awt.Dimension(285, 145));

        mainLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        mainLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel4.setText("Warning");

        warningLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warningLabel2.setText("Patterns cannot take up more than");

        exitButton2.setText("OK");
        exitButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("18 rows");

        javax.swing.GroupLayout warningDialog2Layout = new javax.swing.GroupLayout(warningDialog2.getContentPane());
        warningDialog2.getContentPane().setLayout(warningDialog2Layout);
        warningDialog2Layout.setHorizontalGroup(
            warningDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warningDialog2Layout.createSequentialGroup()
                .addGroup(warningDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(warningDialog2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(warningDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mainLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(warningLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)))
                    .addGroup(warningDialog2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(exitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(warningDialog2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        warningDialog2Layout.setVerticalGroup(
            warningDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warningDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warningLabel2)
                .addGap(2, 2, 2)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        warningDialog3.setMinimumSize(new java.awt.Dimension(285, 145));
        warningDialog3.setResizable(false);
        warningDialog3.setSize(new java.awt.Dimension(285, 145));

        mainLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        mainLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel5.setText("Warning");

        warningLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warningLabel3.setText("Pattern must repeat at least 2 squares.");

        exitButton3.setText("OK");
        exitButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout warningDialog3Layout = new javax.swing.GroupLayout(warningDialog3.getContentPane());
        warningDialog3.getContentPane().setLayout(warningDialog3Layout);
        warningDialog3Layout.setHorizontalGroup(
            warningDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warningDialog3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(warningDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(warningLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, warningDialog3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        warningDialog3Layout.setVerticalGroup(
            warningDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warningDialog3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainLabel5)
                .addGap(18, 18, 18)
                .addComponent(warningLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitButton3)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        warningDialog4.setMinimumSize(new java.awt.Dimension(285, 145));
        warningDialog4.setResizable(false);
        warningDialog4.setSize(new java.awt.Dimension(285, 145));

        mainLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        mainLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel6.setText("Warning");

        warningLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warningLabel4.setText("Please enter a pattern (ex. OONOO)");

        exitButton4.setText("OK");
        exitButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout warningDialog4Layout = new javax.swing.GroupLayout(warningDialog4.getContentPane());
        warningDialog4.getContentPane().setLayout(warningDialog4Layout);
        warningDialog4Layout.setHorizontalGroup(
            warningDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warningDialog4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(warningDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(warningLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, warningDialog4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        warningDialog4Layout.setVerticalGroup(
            warningDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warningDialog4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainLabel6)
                .addGap(18, 18, 18)
                .addComponent(warningLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitButton4)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        warningDialog5.setMinimumSize(new java.awt.Dimension(296, 145));
        warningDialog5.setResizable(false);
        warningDialog5.setSize(new java.awt.Dimension(296, 145));

        mainLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        mainLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel7.setText("Warning");

        warningLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warningLabel5.setText("Repeat number and pattern length mismatch.");

        exitButton5.setText("OK");
        exitButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout warningDialog5Layout = new javax.swing.GroupLayout(warningDialog5.getContentPane());
        warningDialog5.getContentPane().setLayout(warningDialog5Layout);
        warningDialog5Layout.setHorizontalGroup(
            warningDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warningDialog5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(warningDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(warningLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, warningDialog5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        warningDialog5Layout.setVerticalGroup(
            warningDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warningDialog5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainLabel7)
                .addGap(18, 18, 18)
                .addComponent(warningLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitButton5)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        FramePattern1.setMinimumSize(new java.awt.Dimension(209, 144));
        FramePattern1.setSize(new java.awt.Dimension(209, 144));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Patterns");

        jLabel4.setText("Pattern");

        oldColorLabel2.setText("Old Color");

        oldColorButton.setText("Select");

        newColorLabel2.setText("New Color");

        newColorButton.setText("Select");
        newColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newColorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FramePattern1Layout = new javax.swing.GroupLayout(FramePattern1.getContentPane());
        FramePattern1.getContentPane().setLayout(FramePattern1Layout);
        FramePattern1Layout.setHorizontalGroup(
            FramePattern1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FramePattern1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FramePattern1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FramePattern1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(patternTextField1))
                    .addGroup(FramePattern1Layout.createSequentialGroup()
                        .addGroup(FramePattern1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oldColorLabel2)
                            .addComponent(newColorLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(FramePattern1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newColorButton)
                            .addComponent(oldColorButton))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FramePattern1Layout.setVerticalGroup(
            FramePattern1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FramePattern1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FramePattern1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patternTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FramePattern1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldColorLabel2)
                    .addComponent(oldColorButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FramePattern1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newColorLabel2)
                    .addComponent(newColorButton)))
        );

        FramePattern2.setMinimumSize(new java.awt.Dimension(209, 144));
        FramePattern2.setSize(new java.awt.Dimension(209, 144));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Patterns");

        jLabel6.setText("Pattern 1");

        oldColorLabel3.setText("Color 1");

        oldColorButton1.setText("Select");

        newColorLabel6.setText("Color 2");

        newColorButton1.setText("Select");
        newColorButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newColorButton1ActionPerformed(evt);
            }
        });

        patternLabel2.setText("Pattern 2");

        jLabel7.setText("Color 3");

        color3Button.setText("Select");

        javax.swing.GroupLayout FramePattern2Layout = new javax.swing.GroupLayout(FramePattern2.getContentPane());
        FramePattern2.getContentPane().setLayout(FramePattern2Layout);
        FramePattern2Layout.setHorizontalGroup(
            FramePattern2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FramePattern2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FramePattern2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FramePattern2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(patternTextField2))
                    .addGroup(FramePattern2Layout.createSequentialGroup()
                        .addComponent(patternLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(patternTextField3))
                    .addGroup(FramePattern2Layout.createSequentialGroup()
                        .addGroup(FramePattern2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oldColorLabel3)
                            .addComponent(newColorLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(FramePattern2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newColorButton1)
                            .addComponent(oldColorButton1)
                            .addComponent(color3Button))
                        .addGap(0, 52, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FramePattern2Layout.setVerticalGroup(
            FramePattern2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FramePattern2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FramePattern2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patternTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FramePattern2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patternLabel2)
                    .addComponent(patternTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FramePattern2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldColorLabel3)
                    .addComponent(oldColorButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FramePattern2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newColorLabel6)
                    .addComponent(newColorButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FramePattern2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(color3Button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FrameKey.setMaximumSize(new java.awt.Dimension(164, 300));
        FrameKey.setMinimumSize(new java.awt.Dimension(164, 230));
        FrameKey.setSize(new java.awt.Dimension(164, 230));

        mainLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        mainLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel9.setText("Key");

        pattern11Label.setText("Pattern 1:");

        pattern21Label.setText("Pattern 2:");

        pattern31Label.setText("Pattern 3:");

        pattern41Label.setText("Pattern 4:");

        pattern12Label.setText("N/A");

        pattern22Label.setText("N/A");

        pattern32Label.setText("N/A");

        pattern42Label.setText("N/A");

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout FrameKeyLayout = new javax.swing.GroupLayout(FrameKey.getContentPane());
        FrameKey.getContentPane().setLayout(FrameKeyLayout);
        FrameKeyLayout.setHorizontalGroup(
            FrameKeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameKeyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrameKeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FrameKeyLayout.createSequentialGroup()
                        .addComponent(pattern41Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pattern42Label, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                    .addGroup(FrameKeyLayout.createSequentialGroup()
                        .addComponent(pattern31Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pattern32Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FrameKeyLayout.createSequentialGroup()
                        .addComponent(pattern21Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pattern22Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FrameKeyLayout.createSequentialGroup()
                        .addComponent(pattern11Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pattern12Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FrameKeyLayout.setVerticalGroup(
            FrameKeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameKeyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameKeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pattern11Label)
                    .addComponent(pattern12Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameKeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pattern21Label)
                    .addComponent(pattern22Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameKeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pattern31Label)
                    .addComponent(pattern32Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameKeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pattern41Label)
                    .addComponent(pattern42Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(252, 211));
        setResizable(false);
        setSize(new java.awt.Dimension(252, 211));

        mainLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("Loom Visualizer");

        pegLabel.setText("Number of Pegs");

        pegTextField.setToolTipText("How many pegs are on the loom?");
        pegTextField.setMaximumSize(new java.awt.Dimension(11, 26));

        infoButton.setText("Info");
        infoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });

        drawButton.setText("Draw");
        drawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Number of Patterns");

        patternComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        patternComboBox.setToolTipText("Dropdown to select the number of patterns");
        patternComboBox.removeAllItems();
        for (int i = 1; i <= 4; i++)
        patternComboBox.addItem(""+i);
        patternComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                patternComboBoxItemStateChanged(evt);
            }
        });
        patternComboBox.setSelectedIndex(3);

        patternLabel1.setText("Pattern");

        patternNumComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        patternNumComboBox.setToolTipText("Select the pattern you are editing (ex. 4 = 4th pattern)");
        patternNumComboBox.removeAllItems();
        for (int i = 1; i <= 4; i++)
        patternNumComboBox.addItem(""+i);
        patternNumComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                patternNumComboBoxItemStateChanged(evt);
            }
        });

        patternNumTextField.setToolTipText("Enter a pattern (ex. OONNOO)");
        patternNumTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                patternNumTextFieldFocusLost(evt);
            }
        });
        patternNumTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                patternNumTextFieldKeyTyped(evt);
            }
        });

        colorLabel1.setText("Color");

        colorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        colorComboBox.setToolTipText("Select the color you are using (ex. 4 = 4th color)");
        colorComboBox.removeAllItems();
        for (int i = 1; i <= 4+1; i++)
        colorComboBox.addItem(""+i);

        colorSelectButton.setText("Select");
        colorSelectButton.setToolTipText("Select a color via colorpicker.");
        colorSelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorSelectButtonActionPerformed(evt);
            }
        });

        sizeSpinner.setToolTipText("Size in rows");
        sizeSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sizeSpinnerStateChanged(evt);
            }
        });
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 9, 1);
        sizeSpinner.setModel(model);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pegLabel)
                        .addGap(12, 12, 12)
                        .addComponent(pegTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(patternComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(patternLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(colorLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(4, 4, 4)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(patternNumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(colorComboBox, 0, 1, Short.MAX_VALUE)))
                            .addComponent(infoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drawButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(patternNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(colorSelectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pegLabel)
                    .addComponent(pegTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(patternComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patternLabel1)
                    .addComponent(patternNumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patternNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorLabel1)
                    .addComponent(colorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorSelectButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoButton)
                    .addComponent(drawButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void drawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawButtonActionPerformed
        int total = 0;
        for (int i = 0; i <= patternComboBox.getSelectedIndex(); i++) 
            total += rowNumber[i];
        
        if (pegTextField.getText().isBlank() || 
            Integer.parseInt(pegTextField.getText()) < 2) {
            warningDialog1.setLocation(new Point(this.getLocation().x,
            this.getLocation().y+this.getHeight()));
            warningDialog1.setVisible(true);
        } else if (total > 17) {
            warningDialog2.setLocation(new Point(this.getLocation().x,
            this.getLocation().y+this.getHeight()));
            warningDialog2.setVisible(true);
        }
        else {
            pegNumber = Integer.parseInt(pegTextField.getText());
            pattern[patternNumComboBox.getSelectedIndex()] = 
                    patternNumTextField.getText();
            
            for (int i = 0; i < 4; i++)
                repeatNumber[i] = pattern[i].length();

            FrameInfo.setVisible(false);
            FrameColor1.setVisible(false);
            FrameColor2.setVisible(false);
            FrameColor3.setVisible(false);
            FrameColor4.setVisible(false);
            FrameColor5.setVisible(false);
            
            color[0] = colorChooser1.getColor();
            color[1] = colorChooser2.getColor();
            color[2] = colorChooser3.getColor();
            color[3] = colorChooser4.getColor();
            color[4] = colorChooser5.getColor();
            
            ColorPanel.numColor = getPatternNum()+1;
            
            pattern12Label.setText(pattern[0].isBlank() ? "N/A" : pattern[0]);
            pattern22Label.setText(pattern[1].isBlank() ? "N/A" : pattern[1]);
            pattern32Label.setText(pattern[2].isBlank() ? "N/A" : pattern[2]);
            pattern42Label.setText(pattern[3].isBlank() ? "N/A" : pattern[3]);
            
            FrameKey.repaint();
            if (!FrameKey.isVisible())
                FrameKey.setLocation(new Point(this.getLocation().x-FrameKey.getWidth(),
                    this.getLocation().y));
            FrameKey.setVisible(true);
            
            FrameVisual.repaint();
            if (!FrameVisual.isVisible())
                FrameVisual.setLocation(new Point(this.getLocation().x+this.getWidth(),
                this.getLocation().y-this.getHeight()));
            FrameVisual.setVisible(true);
        }
    }//GEN-LAST:event_drawButtonActionPerformed

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        FrameInfo.setLocation(new Point(this.getLocation().x+this.getWidth(),
            this.getLocation().y));
        FrameInfo.setVisible(true);
    }//GEN-LAST:event_infoButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        FrameInfo.setVisible(false);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton1ActionPerformed
        warningDialog1.setVisible(false);
    }//GEN-LAST:event_exitButton1ActionPerformed

    private void exitButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton5ActionPerformed
        warningDialog5.setVisible(false);
    }//GEN-LAST:event_exitButton5ActionPerformed

    private void exitButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton2ActionPerformed
        warningDialog2.setVisible(false);
    }//GEN-LAST:event_exitButton2ActionPerformed

    private void exitButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton3ActionPerformed
        warningDialog3.setVisible(false);
    }//GEN-LAST:event_exitButton3ActionPerformed

    private void exitButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton4ActionPerformed
        warningDialog4.setVisible(false);
    }//GEN-LAST:event_exitButton4ActionPerformed

    private void newColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newColorButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newColorButtonActionPerformed

    private void newColorButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newColorButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newColorButton1ActionPerformed

    private void patternNumComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_patternNumComboBoxItemStateChanged
        if (patternNumComboBox.getSelectedIndex() >= 0 && 
                patternNumComboBox.getSelectedIndex() < 4) {
            if (pattern[patternNumComboBox.getSelectedIndex()].isBlank() == false)
                patternNumTextField.setText(pattern[patternNumComboBox.getSelectedIndex()]);
            else
                patternNumTextField.setText("");
            
            sizeSpinner.setValue((rowNumber[patternNumComboBox.getSelectedIndex()]));
        }
    }//GEN-LAST:event_patternNumComboBoxItemStateChanged

    private void colorSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorSelectButtonActionPerformed
        switch (colorComboBox.getSelectedIndex()+1) {
            case 1:
                FrameColor2.setVisible(false);
                FrameColor3.setVisible(false);
                FrameColor4.setVisible(false);
                FrameColor5.setVisible(false);
                FrameColor1.setVisible(true);
                break;
            case 2:
                FrameColor1.setVisible(false);
                FrameColor3.setVisible(false);
                FrameColor4.setVisible(false);
                FrameColor5.setVisible(false);
                FrameColor2.setVisible(true);
                break;
            case 3:
                FrameColor2.setVisible(false);
                FrameColor1.setVisible(false);
                FrameColor4.setVisible(false);
                FrameColor5.setVisible(false);
                FrameColor3.setVisible(true);
                break;
            case 4:
                FrameColor2.setVisible(false);
                FrameColor3.setVisible(false);
                FrameColor1.setVisible(false);
                FrameColor5.setVisible(false);
                FrameColor4.setVisible(true);
                break;
            case 5:
                FrameColor2.setVisible(false);
                FrameColor3.setVisible(false);
                FrameColor4.setVisible(false);
                FrameColor1.setVisible(false);
                FrameColor5.setVisible(true);
                break;
        }
    }//GEN-LAST:event_colorSelectButtonActionPerformed

    private void patternComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_patternComboBoxItemStateChanged
        if (!init) return;
        
        int[] old = { patternNumComboBox.getSelectedIndex(), colorComboBox.getSelectedIndex() };
        
        patternNumComboBox.removeAllItems();
        colorComboBox.removeAllItems();
        
        for (int i = 1; i <= patternComboBox.getSelectedIndex()+2; i++) {
            if (i <= patternComboBox.getSelectedIndex()+1)
                patternNumComboBox.addItem(""+i);
            
            colorComboBox.addItem(""+i);
        }
        
        for (int i = 4; i > patternComboBox.getSelectedIndex(); i--) {
            switch (i) {
                case 1:
                    colorChooser2.setColor(new Color(0,0,0));
                    break;
                case 2:
                    colorChooser3.setColor(new Color(0,0,0));
                    break; 
                case 3:
                    colorChooser4.setColor(new Color(0,0,0));
                    break;
                case 4:
                    colorChooser5.setColor(new Color(0,0,0));
                    break;
                default:
                    break;
            }
            
            if (i < 4) {
                repeatNumber[i] = 0;
                rowNumber[i] = 1;
                pattern[i] = "";
            }
        }
        
        patternNumComboBox.setSelectedIndex(old[0] < patternComboBox.getSelectedIndex() ? old[0] : patternComboBox.getSelectedIndex());
        colorComboBox.setSelectedIndex(old[1] < (patternComboBox.getSelectedIndex()+1) ? old[1] : (patternComboBox.getSelectedIndex()+1));
    }//GEN-LAST:event_patternComboBoxItemStateChanged

    private void patternNumTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patternNumTextFieldKeyTyped
        pattern[patternNumComboBox.getSelectedIndex()] = patternNumTextField.getText();
    }//GEN-LAST:event_patternNumTextFieldKeyTyped

    private void patternNumTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_patternNumTextFieldFocusLost
        pattern[patternNumComboBox.getSelectedIndex()] = patternNumTextField.getText();
    }//GEN-LAST:event_patternNumTextFieldFocusLost

    private void sizeSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sizeSpinnerStateChanged
        rowNumber[patternNumComboBox.getSelectedIndex()] = Integer.parseInt(sizeSpinner.getValue().toString());
    }//GEN-LAST:event_sizeSpinnerStateChanged

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
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.out.println("Failed to initialize LaF");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }
    
    static Color getColor(int i) {
        return color[i];
    }
    
    static int getPegNumber() {
        return pegNumber;
    }
    
    static int getPatternNum() {
        return patternComboBox.getSelectedIndex()+1;
    }
    
    static int getRowNumber(int i) {
        if (i < 0 || i > 3) return -1;
        return rowNumber[i];
    }
            
    static int getRepeatNumber(int i) {
        if (i < 0 || i > 3) return -1;
        return repeatNumber[i];
    }
    
    static String getPattern(int i) {
        return pattern[i];
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame FrameColor1;
    private javax.swing.JFrame FrameColor2;
    private javax.swing.JFrame FrameColor3;
    private javax.swing.JFrame FrameColor4;
    private javax.swing.JFrame FrameColor5;
    private javax.swing.JFrame FrameInfo;
    private javax.swing.JFrame FrameKey;
    private javax.swing.JFrame FramePattern1;
    private javax.swing.JFrame FramePattern2;
    private javax.swing.JFrame FrameVisual;
    private javax.swing.JPanel PanelVisual;
    private javax.swing.JButton color3Button;
    private javax.swing.JColorChooser colorChooser1;
    private javax.swing.JColorChooser colorChooser2;
    private javax.swing.JColorChooser colorChooser3;
    private javax.swing.JColorChooser colorChooser4;
    private javax.swing.JColorChooser colorChooser5;
    private javax.swing.JComboBox<String> colorComboBox;
    private javax.swing.JLabel colorLabel1;
    private javax.swing.JPanel colorPanel;
    private javax.swing.JButton colorSelectButton;
    private javax.swing.JButton drawButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exitButton1;
    private javax.swing.JButton exitButton2;
    private javax.swing.JButton exitButton3;
    private javax.swing.JButton exitButton4;
    private javax.swing.JButton exitButton5;
    private javax.swing.JButton infoButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JLabel mainLabel2;
    private javax.swing.JLabel mainLabel3;
    private javax.swing.JLabel mainLabel4;
    private javax.swing.JLabel mainLabel5;
    private javax.swing.JLabel mainLabel6;
    private javax.swing.JLabel mainLabel7;
    private javax.swing.JLabel mainLabel9;
    private javax.swing.JButton newColorButton;
    private javax.swing.JButton newColorButton1;
    private javax.swing.JLabel newColorLabel1;
    private javax.swing.JLabel newColorLabel2;
    private javax.swing.JLabel newColorLabel3;
    private javax.swing.JLabel newColorLabel4;
    private javax.swing.JLabel newColorLabel5;
    private javax.swing.JLabel newColorLabel6;
    private javax.swing.JButton oldColorButton;
    private javax.swing.JButton oldColorButton1;
    private javax.swing.JLabel oldColorLabel1;
    private javax.swing.JLabel oldColorLabel2;
    private javax.swing.JLabel oldColorLabel3;
    private javax.swing.JLabel pattern11Label;
    private javax.swing.JLabel pattern12Label;
    private javax.swing.JLabel pattern21Label;
    private javax.swing.JLabel pattern22Label;
    private javax.swing.JLabel pattern31Label;
    private javax.swing.JLabel pattern32Label;
    private javax.swing.JLabel pattern41Label;
    private javax.swing.JLabel pattern42Label;
    private static javax.swing.JComboBox<String> patternComboBox;
    private javax.swing.JLabel patternLabel1;
    private javax.swing.JLabel patternLabel2;
    private javax.swing.JComboBox<String> patternNumComboBox;
    private javax.swing.JTextField patternNumTextField;
    private javax.swing.JTextField patternTextField1;
    private javax.swing.JTextField patternTextField2;
    private javax.swing.JTextField patternTextField3;
    private javax.swing.JLabel pegLabel;
    private javax.swing.JTextField pegTextField;
    private javax.swing.JSpinner sizeSpinner;
    private javax.swing.JDialog warningDialog1;
    private javax.swing.JDialog warningDialog2;
    private javax.swing.JDialog warningDialog3;
    private javax.swing.JDialog warningDialog4;
    private javax.swing.JDialog warningDialog5;
    private javax.swing.JLabel warningLabel1;
    private javax.swing.JLabel warningLabel2;
    private javax.swing.JLabel warningLabel3;
    private javax.swing.JLabel warningLabel4;
    private javax.swing.JLabel warningLabel5;
    // End of variables declaration//GEN-END:variables
}
