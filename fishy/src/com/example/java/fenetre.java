package com.example.java;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static java.awt.Color.white;

public class fenetre extends JFrame {
    public fenetre() {
        super();
        build();//On initialise notre fenêtre
    }

    private void build() {
        setTitle("Fish2Shark"); //On donne un titre à l'application
        setSize(1000, 1000); //On donne une taille à notre fenêtre
        setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
        setResizable(false); //On interdit la redimensionnement de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix

        setContentPane(buildContentPane());
        setVisible(true);//On la rend visible
    }

    private JPanel buildContentPane() {

        JPanel panel = new JPanel();
        GridLayout gl = new GridLayout();
        gl.setColumns(6);
        gl.setRows(7);
        gl.setHgap(5);
        gl.setVgap(5);
        panel.setLayout(gl);
        //panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(new Color(44, 160, 79));

        //JLabel Image = new JLabel(new ImageIcon("3coeur.png"));
        //panel.add(Image);
        Icon Logo = new ImageIcon("fish.png");
        JLabel logo = new JLabel();
        logo.setIcon(Logo);
        panel.add(logo);

        JLabel Vide2 = new JLabel();
        panel.add(Vide2);

        Icon meilleur = new ImageIcon("meilleur.png");
        JLabel Vide3 = new JLabel();
        Vide3.setIcon(meilleur);
        panel.add(Vide3);

        Icon mise = new ImageIcon("mise.png");
        JLabel Mise = new JLabel();
        Mise.setIcon(mise);
        panel.add(Mise);

        JLabel Vide4 = new JLabel();
        panel.add(Vide4);


        JButton Button = new JButton("Money");
        Color gold = new Color(214,186,73);
        Button.setBackground(gold);
        Button.setSize(1000,1000);
        panel.add(Button);

        Icon dollar = new ImageIcon("dollar.png");
        JLabel Vide5 = new JLabel();
        Vide5.setIcon(dollar);
        panel.add(Vide5);

        JLabel Vide7 = new JLabel();
        panel.add(Vide7);

        JLabel Vide8 = new JLabel();
        panel.add(Vide8);

        JLabel tMise = new JLabel();
        Color light = new Color(169,231,187);
        panel.add(tMise);

        JLabel Vide9 = new JLabel();
        panel.add(Vide9);

        Icon coeur = new ImageIcon("coeur.png");
        JLabel Vide10 = new JLabel();
        Vide10.setIcon(coeur);
        panel.add(Vide10);

        Icon euro = new ImageIcon("euro.png");
        JLabel Vide11 = new JLabel();
        Vide11.setIcon(euro);
        panel.add(Vide11);

        JLabel Vide12 = new JLabel();
        panel.add(Vide12);

        JLabel Vide13 = new JLabel();
        panel.add(Vide13);

        Icon main = new ImageIcon("main.png");
        JLabel Main = new JLabel();
        Main.setIcon(main);
        panel.add(Main);


        JLabel Vide15 = new JLabel();
        panel.add(Vide15);

        Icon pique = new ImageIcon("pique.png");
        JLabel Vide14 = new JLabel();
        Vide14.setIcon(pique);
        panel.add(Vide14);

        Icon livre = new ImageIcon("livre.png");
        JLabel Vide16 = new JLabel();
        Vide16.setIcon(livre);
        panel.add(Vide16);

        JLabel Vide17 = new JLabel();
        panel.add(Vide17);

        JLabel Vide18 = new JLabel();
        panel.add(Vide18);

        JTextArea tMain = new JTextArea();
        tMain.setBackground(light);
        panel.add(tMain);

        JLabel Vide20 = new JLabel();
        panel.add(Vide20);

        Icon carreau = new ImageIcon("carreau.png");
        JLabel Vide19 = new JLabel();
        Vide19.setIcon(carreau);
        panel.add(Vide19);

        Icon carte = new ImageIcon("carte.png");
        JLabel Vide30 = new JLabel();
        Vide30.setIcon(carte);
        panel.add(Vide30);

        Icon joueur = new ImageIcon("joueur.png");
        JLabel Vide31 = new JLabel("joueur");
        Vide31.setIcon(joueur);
        panel.add(Vide31);

        JLabel Vide32 = new JLabel();
        panel.add(Vide32);

        Icon flop = new ImageIcon("flop.png");
        JLabel Vide33 = new JLabel();
        Vide33.setIcon(flop);
        panel.add(Vide33);

        JLabel Vide34 = new JLabel();
        panel.add(Vide34);

        Icon trefle = new ImageIcon("trefle.png");
        JLabel Vide35 = new JLabel();
        Vide35.setIcon(trefle);
        panel.add(Vide35);



        JComboBox combo1 = new JComboBox();
        combo1.setPreferredSize(new Dimension(100, 20));
        combo1.addItem("Heart");
        combo1.addItem("Spade");
        combo1.addItem("Club");
        combo1.addItem("Diamond");
        panel.add(combo1);

        JComboBox combo2 = new JComboBox();
        combo2.setPreferredSize(new Dimension(100, 20));
        combo2.addItem("Heart");
        combo2.addItem("Spade");
        combo2.addItem("Club");
        combo2.addItem("Diamond");
        panel.add(combo2);

        //Icon Logo = new ImageIcon("fish2shark.png");
        JComboBox combo3 = new JComboBox();
        combo3.setPreferredSize(new Dimension(100, 20));
        combo3.addItem("Heart");
        combo3.addItem("Spade");
        combo3.addItem("Club");
        combo3.addItem("Diamond");
        panel.add(combo3);

        JComboBox combo4 = new JComboBox();
        combo4.setPreferredSize(new Dimension(100, 20));
        combo4.addItem("Heart");
        combo4.addItem("Spade");
        combo4.addItem("Club");
        combo4.addItem("Diamond");
        panel.add(combo4);

        JComboBox combo5 = new JComboBox();
        combo5.setPreferredSize(new Dimension(100, 20));
        combo5.addItem("Heart");
        combo5.addItem("Spade");
        combo5.addItem("Club");
        combo5.addItem("Diamond");
        panel.add(combo5);

        Icon pot = new ImageIcon("pot.png");
        JLabel Vide21 = new JLabel();
        Vide21.setIcon(pot);
        panel.add(Vide21);

        JComboBox combonb1 = new JComboBox();
        combo1.setPreferredSize(new Dimension(100, 20));
        combonb1.addItem(1);
        combonb1.addItem(2);
        combonb1.addItem(3);
        combonb1.addItem(4);
        combonb1.addItem(5);
        combonb1.addItem(6);
        combonb1.addItem(7);
        combonb1.addItem(8);
        combonb1.addItem(9);
        combonb1.addItem(10);
        combonb1.addItem(11);
        combonb1.addItem(12);
        combonb1.addItem(13);
        panel.add(combonb1);

        JComboBox combonb2 = new JComboBox();
        combo2.setPreferredSize(new Dimension(100, 20));
        combonb2.addItem(1);
        combonb2.addItem(2);
        combonb2.addItem(3);
        combonb2.addItem(4);
        combonb2.addItem(5);
        combonb2.addItem(6);
        combonb2.addItem(7);
        combonb2.addItem(8);
        combonb2.addItem(9);
        combonb2.addItem(10);
        combonb2.addItem(11);
        combonb2.addItem(12);
        combonb2.addItem(13);
        panel.add(combonb2);

        //Icon Logo = new ImageIcon("fish2shark.png");
        JComboBox combonb3 = new JComboBox();
        combo3.setPreferredSize(new Dimension(100, 20));
        combonb3.addItem(1);
        combonb3.addItem(2);
        combonb3.addItem(3);
        combonb3.addItem(4);
        combonb3.addItem(5);
        combonb3.addItem(6);
        combonb3.addItem(7);
        combonb3.addItem(8);
        combonb3.addItem(9);
        combonb3.addItem(10);
        combonb3.addItem(11);
        combonb3.addItem(12);
        combonb3.addItem(13);
        panel.add(combonb3);

        JComboBox combonb4 = new JComboBox();
        combo4.setPreferredSize(new Dimension(100, 20));
        combonb4.addItem(1);
        combonb4.addItem(2);
        combonb4.addItem(3);
        combonb4.addItem(4);
        combonb4.addItem(5);
        combonb4.addItem(6);
        combonb4.addItem(7);
        combonb4.addItem(8);
        combonb4.addItem(9);
        combonb4.addItem(10);
        combonb4.addItem(11);
        combonb4.addItem(12);
        combonb4.addItem(13);
        panel.add(combonb4);

        JComboBox combonb5 = new JComboBox();
        combo5.setPreferredSize(new Dimension(100, 20));
        combonb5.addItem(1);
        combonb5.addItem(2);
        combonb5.addItem(3);
        combonb5.addItem(4);
        combonb5.addItem(5);
        combonb5.addItem(6);
        combonb5.addItem(7);
        combonb5.addItem(8);
        combonb5.addItem(9);
        combonb5.addItem(10);
        combonb5.addItem(11);
        combonb5.addItem(12);
        combonb5.addItem(13);
        panel.add(combonb5);

        JTextArea Pot = new JTextArea();
        Pot.setBackground(light);
        panel.add(Pot);

        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                checkData(Pot.getText(), tMain.getText());
                String Main = tMain.getText();
                String stockPot = Pot.getText();
                int pot = 0;
                pot = Integer.parseInt(stockPot);
                String card1coulor = (String)combo1.getSelectedItem();
                String card2coulor = (String)combo2.getSelectedItem();
                String card3coulor = (String)combo3.getSelectedItem();
                String card4coulor = (String)combo4.getSelectedItem();
                String card5coulor = (String)combo5.getSelectedItem();
                int cardnb1 = (int)combonb1.getSelectedItem();
                int cardnb2 = (int)combonb2.getSelectedItem();
                int cardnb3 = (int)combonb3.getSelectedItem();
                int cardnb4 = (int)combonb4.getSelectedItem();
                int cardnb5 = (int)combonb5.getSelectedItem();

                Card card1 = new Card(cardnb1, card1coulor);
                Card card2 = new Card(cardnb2, card2coulor);
                Card card3 = new Card(cardnb3, card3coulor);
                Card card4 = new Card(cardnb4, card4coulor);
                Card card5 = new Card(cardnb5, card5coulor);

                Flop flop = new Flop(card3, card4, card5);
                Hand hand2 = new Hand(card1, card2);
                Strength strengthPlayer = new Strength();
                Strength strengthOpp = new Strength();
                BoardEvaluate boardEvaluate = new BoardEvaluate();
                Evaluate evaluatePlayer = new Evaluate();
                Evaluate evaluateOpp = new Evaluate();

                System.out.println("affichage de la main :");
                System.out.println(hand2.getCard1().getValue() + hand2.getCard1().getColor() + hand2.getCard2().getValue() + hand2.getCard2().getColor());


                Test test = new Test();
                ArrayList<Hand> opponentHand = new ArrayList<Hand>();
                test.createOppHand(opponentHand, Main);

                boardEvaluate.isDry(flop);
                boardEvaluate.isSemiConnected(flop);
                boardEvaluate.isConnected(flop);

                System.out.println("/n affichage de la main de l'adversaire :");
                for (Hand hand : opponentHand) {

                    System.out.println(hand.getCard1().getValue() + hand.getCard1().getColor() + hand.getCard2().getValue() + hand.getCard2().getColor());

                    strengthOpp.countAir(flop, hand);
                    strengthOpp.countBP(flop, hand);
                    strengthOpp.countBrelan(flop, hand);
                    strengthOpp.countFD(flop, hand);
                    strengthOpp.countFull(flop, hand);
                    strengthOpp.countOE(flop, hand);
                    strengthOpp.countOver(flop, hand);
                    strengthOpp.countOverPair(flop, hand);
                    strengthOpp.countTP(flop, hand);

                    evaluateOpp.isWeak( flop,hand,strengthOpp,boardEvaluate );
                    evaluateOpp.isMedium( flop,hand,strengthOpp,boardEvaluate );
                    evaluateOpp.isStrong( flop,hand,strengthOpp,boardEvaluate );

                    System.out.println("Weak opp" + evaluateOpp.getWeak());
                    System.out.println("Medium opp" + evaluateOpp.getMedium());
                    System.out.println("Strong opp" + evaluateOpp.getStrong());

                }
                System.out.println("StrongOPP" + evaluateOpp.getStrong());


                System.out.println("/n affichage du pot :");
                System.out.println(pot);

                strengthPlayer.countAir(flop, hand2);
                strengthPlayer.countBP(flop, hand2);
                strengthPlayer.countBrelan(flop, hand2);
                strengthPlayer.countFD(flop, hand2);
                strengthPlayer.countFull(flop, hand2);
                strengthPlayer.countOE(flop, hand2);
                strengthPlayer.countOver(flop, hand2);
                strengthPlayer.countOverPair(flop, hand2);
                strengthPlayer.countTP(flop, hand2);

                evaluatePlayer.isWeak( flop,hand2,strengthPlayer,boardEvaluate );
                evaluatePlayer.isMedium( flop,hand2,strengthPlayer,boardEvaluate );
                evaluatePlayer.isStrong(flop,hand2,strengthPlayer,boardEvaluate  );

                System.out.println("Weak player" + evaluatePlayer.getWeak());
                //System.out.println("Medium player" + evaluatePlayer.get);

            }




        });


        return panel;

    }

    public boolean checkData(String tMain, String Pot) {
        if (tMain.isEmpty() || Pot.isEmpty()) {
            return false;
        }

        return true;
    }


}