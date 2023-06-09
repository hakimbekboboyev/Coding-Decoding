/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author hakim
 */





public class Dekodlash extends javax.swing.JFrame {

    /**
     * Creates new form Dekodlash
     */
    public Dekodlash() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">



    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        setTitle("Dekodlash");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("2x2 Matrix:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Kodni kiriting:");

        jButton1.setText("Hisobla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                int a11 = Integer.parseInt(jTextField1.getText());
                int a12 = Integer.parseInt(jTextField2.getText());
                int a21 = Integer.parseInt(jTextField3.getText());
                int a22 = Integer.parseInt(jTextField4.getText());

                String text = jTextField5.getText();

                String codingText = decodingText(a11,a12,a21,a22,text);
                jTextField6.setText(codingText);



            }
        });

        jLabel3.setText("Mafxiy xabar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(150, 150, 150))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(87, 87, 87))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(jLabel1)))
                                .addGap(19, 19, 19)
                                .addComponent(jButton1)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    public String decodingText(int a11, int a12, int a21, int a22, String text){
        Map<String,Integer> letters = new HashMap<>();

        letters.put(" ",0);
        letters.put("!",1);
        letters.put("@",2);
        letters.put("#",3);
        letters.put("$",4);
        letters.put("%",5);
        letters.put("^",6);
        letters.put("&",7);
        letters.put("*",8);
        letters.put("(",9);
        letters.put(")",10);
        letters.put("_",11);
        letters.put("+",12);
        letters.put(",",13);
        letters.put(".",14);
        letters.put("-",15);
        letters.put("/",16);
        letters.put("0",17);
        letters.put("1",18);
        letters.put("2",19);
        letters.put("3",20);
        letters.put("4",21);
        letters.put("5",22);
        letters.put("6",23);
        letters.put("7",24);
        letters.put("8",25);
        letters.put("9",26);
        letters.put(":",27);
        letters.put(";",28);
        letters.put("<",29);
        letters.put("=",30);
        letters.put(">",31);
        letters.put("?",32);
        letters.put("\"",33);
        letters.put("'",34);
        letters.put("A",35);
        letters.put("B",36);
        letters.put("C",37);
        letters.put("D",38);
        letters.put("E",39);
        letters.put("F",40);
        letters.put("G",41);
        letters.put("H",42);
        letters.put("I",43);
        letters.put("J",44);
        letters.put("K",45);
        letters.put("L",46);
        letters.put("M",47);
        letters.put("N",48);
        letters.put("O",49);
        letters.put("P",50);
        letters.put("Q",51);
        letters.put("R",52);
        letters.put("S",53);
        letters.put("T",54);
        letters.put("U",55);
        letters.put("V",56);
        letters.put("W",57);
        letters.put("X",58);
        letters.put("Y",59);
        letters.put("Z",60);
        letters.put("[",61);
        letters.put("\\",62);
        letters.put("]",63);
        letters.put("`",64);
        letters.put("~",65);
        letters.put("№",66);
        letters.put("a",67);
        letters.put("b",68);
        letters.put("c",69);
        letters.put("d",70);
        letters.put("e",71);
        letters.put("f",72);
        letters.put("g",73);
        letters.put("h",74);
        letters.put("i",75);
        letters.put("j",76);
        letters.put("k",77);
        letters.put("l",78);
        letters.put("m",79);
        letters.put("n",80);
        letters.put("o",81);
        letters.put("p",82);
        letters.put("q",83);
        letters.put("r",84);
        letters.put("s",85);
        letters.put("t",86);
        letters.put("u",87);
        letters.put("v",88);
        letters.put("w",89);
        letters.put("x",90);
        letters.put("y",91);
        letters.put("z",92);
        letters.put("{",93);
        letters.put("|",94);
        letters.put("}",95);


        int [][]matrix = new int[2][2];
        matrix[0][0] = a11;
        matrix[0][1] = a12;
        matrix[1][0] = a21;
        matrix[1][1] = a22;

        int [][] inv_matrix = new int[2][2];
        inv_matrix[0][0] = matrix[1][1];
        inv_matrix[0][1] = -matrix[0][1];
        inv_matrix[1][0] = -matrix[1][0];
        inv_matrix[1][1] = matrix[0][0];

        int det = inv_matrix[1][1]*inv_matrix[0][0]-inv_matrix[0][1]*inv_matrix[1][0];


        int l = 0;

        String cod = text;
        ArrayList<Integer> kod_list = new ArrayList<>();
        String cut;
        for (int i = 0; i < cod.length(); i++) {
            if(cod.charAt(i)==32){

                cut = cod.substring(l,i);
                l = i+1;

                kod_list.add(Integer.valueOf(cut));



            }
        }

        kod_list.add(Integer.valueOf(cod.substring(l)));
        if(kod_list.size()%2!=0){
            kod_list.add(0);
        }
        int r = kod_list.size();
        int kod_mas [][] = new int[2][r/2];
        int p=0;
        for (int i = 0; i < r/2; i++) {
            kod_mas[0][i] = kod_list.get(p);

            kod_mas[1][i] = kod_list.get(p+1);
            p+=2;

        }



        int v=0;
        int decoding[][] = new int[2][r/2];
        for (int i = 0; i < r/2; i++) {
            for (int j = 0; j < 2; j++) {

                for (int k = 0; k < 2; k++) {
                    v+= kod_mas[k][i]*inv_matrix[j][k];

                }
                decoding[j][i] = v/det;
                v=0;

            }

        }


        Set<String> list = letters.keySet();

        String decodingText = null;
        for (int i = 0; i < r/2; i++) {
            for (int j = 0; j < 2; j++) {
                for(String k : list){
                    if(letters.get(k)==decoding[j][i]){

                        decodingText+=k;
                    }
                }
            }
        }
        decodingText = decodingText.substring(4);

        return decodingText;
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

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
            java.util.logging.Logger.getLogger(Dekodlash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dekodlash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dekodlash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dekodlash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dekodlash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration
}
