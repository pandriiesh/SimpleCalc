import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.awt.*;

public class CalcComponentManager
{
    ApplicationContext context;
    Container contentPane;

    public void setContext(ApplicationContext context) {
        this.context = context;
    }

    public void setContentPane(Container contentPane) {
        this.contentPane = contentPane;
    }

    public void createCalcView()
    {
        contentPane.setLayout(new GridBagLayout());
        Font buttonFont = new Font("SansSerif", Font.BOLD, 16);

        JTextField jTextField = (JTextField) context.getBean("jtextfield");
        jTextField.setEditable(false);
        jTextField.setBackground(Color.WHITE);
        jTextField.setHorizontalAlignment(JTextField.RIGHT);
        jTextField.setFont(new Font("SansSerif", Font.BOLD, 20));
        GridBagConstraints gbcTextField = new GridBagConstraints();
        gbcTextField.anchor = GridBagConstraints.EAST;
        gbcTextField.fill   = GridBagConstraints.HORIZONTAL;
        gbcTextField.gridheight = 1;
        gbcTextField.gridwidth  = GridBagConstraints.REMAINDER;
        gbcTextField.insets = new Insets(5, 5, 5, 5);
        contentPane.add(jTextField, gbcTextField);

        JButton j1 = (JButton) context.getBean("jbutton");
        j1.setText("1");
        j1.setFont(buttonFont);
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.anchor = GridBagConstraints.WEST;
        gbc1.fill   = GridBagConstraints.HORIZONTAL;
        gbc1.gridheight = 1;
        gbc1.gridwidth  = 1;
        gbc1.gridx = 0;
        gbc1.gridy = 1;
        gbc1.ipadx = 10;
        gbc1.ipady = 10;
        gbc1.insets = new Insets(2, 2, 2, 2);
        contentPane.add(j1, gbc1);

        JButton j2 = (JButton) context.getBean("jbutton");
        j2.setText("2");
        j2.setFont(buttonFont);
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.anchor = GridBagConstraints.WEST;
        gbc2.fill   = GridBagConstraints.HORIZONTAL;
        gbc2.gridheight = 1;
        gbc2.gridwidth  = 1;
        gbc2.gridx = 1;
        gbc2.gridy = 1;
        gbc2.ipadx = 10;
        gbc2.ipady = 10;
        gbc2.insets = new Insets(2, 2, 2, 2);
        contentPane.add(j2, gbc2);

        JButton j3 = (JButton) context.getBean("jbutton");
        j3.setFont(buttonFont);
        j3.setText("3");
        GridBagConstraints gbc3 = new GridBagConstraints();
        gbc3.anchor = GridBagConstraints.WEST;
        gbc3.fill   = GridBagConstraints.HORIZONTAL;
        gbc3.gridheight = 1;
        gbc3.gridwidth  = 1;
        gbc3.gridx = 2;
        gbc3.gridy = 1;
        gbc3.insets = new Insets(2, 2, 2, 10);
        gbc3.ipadx = 10;
        gbc3.ipady = 10;
        contentPane.add(j3, gbc3);

        JButton j4 = (JButton) context.getBean("jbutton");
        j4.setFont(buttonFont);
        j4.setText("4");
        GridBagConstraints gbc4 = new GridBagConstraints();
        gbc4.anchor = GridBagConstraints.WEST;
        gbc4.fill   = GridBagConstraints.HORIZONTAL;
        gbc4.gridheight = 1;
        gbc4.gridwidth  = 1;
        gbc4.gridx = 0;
        gbc4.gridy = 2;
        gbc4.insets = new Insets(2, 2, 2, 2);
        gbc4.ipadx = 10;
        gbc4.ipady = 10;
        contentPane.add(j4, gbc4);

        JButton j5 = (JButton) context.getBean("jbutton");
        j5.setFont(buttonFont);
        j5.setText("5");
        GridBagConstraints gbc5 = new GridBagConstraints();
        gbc5.anchor = GridBagConstraints.WEST;
        gbc5.fill   = GridBagConstraints.HORIZONTAL;
        gbc5.gridheight = 1;
        gbc5.gridwidth  = 1;
        gbc5.gridx = 1;
        gbc5.gridy = 2;
        gbc5.ipadx = 10;
        gbc5.ipady = 10;
        gbc5.insets = new Insets(2, 2, 2, 2);
        contentPane.add(j5, gbc5);

        JButton j6 = (JButton) context.getBean("jbutton");
        j6.setFont(buttonFont);
        j6.setText("6");
        GridBagConstraints gbc6 = new GridBagConstraints();
        gbc6.anchor = GridBagConstraints.WEST;
        gbc6.fill   = GridBagConstraints.HORIZONTAL;
        gbc6.gridheight = 1;
        gbc6.gridwidth  = 1;
        gbc6.gridx = 2;
        gbc6.gridy = 2;
        gbc6.insets = new Insets(2, 2, 2, 10);
        gbc6.ipadx = 10;
        gbc6.ipady = 10;
        contentPane.add(j6, gbc6);

        JButton j7 = (JButton) context.getBean("jbutton");
        j7.setFont(buttonFont);
        j7.setText("7");
        GridBagConstraints gbc7 = new GridBagConstraints();
        gbc7.anchor = GridBagConstraints.WEST;
        gbc7.fill   = GridBagConstraints.HORIZONTAL;
        gbc7.gridheight = 1;
        gbc7.gridwidth  = 1;
        gbc7.gridx = 0;
        gbc7.gridy = 3;
        gbc7.ipadx = 10;
        gbc7.ipady = 10;
        gbc7.insets = new Insets(2, 2, 2, 2);
        contentPane.add(j7, gbc7);

        JButton j8 = (JButton) context.getBean("jbutton");
        j8.setFont(buttonFont);
        j8.setText("8");
        GridBagConstraints gbc8 = new GridBagConstraints();
        gbc8.anchor = GridBagConstraints.WEST;
        gbc8.fill   = GridBagConstraints.HORIZONTAL;
        gbc8.gridheight = 1;
        gbc8.gridwidth  = 1;
        gbc8.gridx = 1;
        gbc8.gridy = 3;
        gbc8.ipadx = 10;
        gbc8.ipady = 10;
        gbc8.insets = new Insets(2, 2, 2, 2);
        contentPane.add(j8, gbc8);

        JButton j9 = (JButton) context.getBean("jbutton");
        j9.setFont(buttonFont);
        j9.setText("9");
        GridBagConstraints gbc9 = new GridBagConstraints();
        gbc9.anchor = GridBagConstraints.WEST;
        gbc9.fill   = GridBagConstraints.HORIZONTAL;
        gbc9.gridheight = 1;
        gbc9.gridwidth  = 1;
        gbc9.gridx = 2;
        gbc9.gridy = 3;
        gbc9.insets = new Insets(2, 2, 2, 10);
        gbc9.ipadx = 10;
        gbc9.ipady = 10;
        contentPane.add(j9, gbc9);

        JButton j0 = (JButton) context.getBean("jbutton");
        j0.setFont(buttonFont);
        j0.setText("0");
        GridBagConstraints gbc0 = new GridBagConstraints();
        gbc0.anchor = GridBagConstraints.WEST;
        gbc0.fill   = GridBagConstraints.HORIZONTAL;
        gbc0.gridheight = 1;
        gbc0.gridwidth  = 1;
        gbc0.gridx = 0;
        gbc0.gridy = 4;
        gbc0.ipadx = 10;
        gbc0.ipady = 10;
        gbc0.insets = new Insets(2, 2, 2, 2);
        contentPane.add(j0, gbc0);

        JButton jDot = (JButton) context.getBean("jbutton");
        jDot.setFont(buttonFont);
        jDot.setText(".");
        GridBagConstraints gbcDot = new GridBagConstraints();
        gbcDot.anchor = GridBagConstraints.WEST;
        gbcDot.fill   = GridBagConstraints.HORIZONTAL;
        gbcDot.gridheight = 1;
        gbcDot.gridwidth  = 1;
        gbcDot.gridx = 1;
        gbcDot.gridy = 4;
        gbcDot.ipadx = 10;
        gbcDot.ipady = 10;
        gbcDot.insets = new Insets(2, 2, 2, 2);
        contentPane.add(jDot, gbcDot);

        JButton jPercent = (JButton) context.getBean("jbutton");
        jPercent.setFont(buttonFont);
        jPercent.setText("%");
        GridBagConstraints gbcPercent = new GridBagConstraints();
        gbcPercent.anchor = GridBagConstraints.WEST;
        gbcPercent.fill   = GridBagConstraints.HORIZONTAL;
        gbcPercent.gridheight = 1;
        gbcPercent.gridwidth  = 1;
        gbcPercent.gridx = 2;
        gbcPercent.gridy = 4;
        gbcPercent.insets = new Insets(2, 2, 2, 10);
        gbcPercent.ipadx = 10;
        gbcPercent.ipady = 10;
        contentPane.add(jPercent, gbcPercent);

        JButton jPlus = (JButton) context.getBean("jbutton");
        jPlus.setFont(buttonFont);
        jPlus.setText("+");
        GridBagConstraints gbcPlus = new GridBagConstraints();
        gbcPlus.anchor = GridBagConstraints.WEST;
        gbcPlus.fill   = GridBagConstraints.HORIZONTAL;
        gbcPlus.gridheight = 1;
        gbcPlus.gridwidth  = 1;
        gbcPlus.gridx = 3;
        gbcPlus.gridy = 2;
        gbcPlus.ipadx = 10;
        gbcPlus.ipady = 10;
        gbcPlus.insets = new Insets(2, 2, 2, 2);
        contentPane.add(jPlus, gbcPlus);

        JButton jMinus = (JButton) context.getBean("jbutton");
        jMinus.setFont(buttonFont);
        jMinus.setText("-");
        GridBagConstraints gbcMinus = new GridBagConstraints();
        gbcMinus.anchor = GridBagConstraints.WEST;
        gbcMinus.fill   = GridBagConstraints.HORIZONTAL;
        gbcMinus.gridheight = 1;
        gbcMinus.gridwidth  = 1;
        gbcMinus.gridx = 4;
        gbcMinus.gridy = 2;
        gbcMinus.ipadx = 10;
        gbcMinus.ipady = 10;
        gbcMinus.insets = new Insets(2, 2, 2, 2);
        contentPane.add(jMinus, gbcMinus);

        JButton jMultiply = (JButton) context.getBean("jbutton");
        jMultiply.setFont(buttonFont);
        jMultiply.setText("*");
        GridBagConstraints gbcMultiply = new GridBagConstraints();
        gbcMultiply.anchor = GridBagConstraints.WEST;
        gbcMultiply.fill   = GridBagConstraints.HORIZONTAL;
        gbcMultiply.gridheight = 1;
        gbcMultiply.gridwidth  = 1;
        gbcMultiply.gridx = 3;
        gbcMultiply.gridy = 3;
        gbcMultiply.ipadx = 10;
        gbcMultiply.ipady = 10;
        gbcMultiply.insets = new Insets(2, 2, 2, 2);
        contentPane.add(jMultiply, gbcMultiply);

        JButton jDivide = (JButton) context.getBean("jbutton");
        jDivide.setFont(buttonFont);
        jDivide.setText("/");
        GridBagConstraints gbcDivide = new GridBagConstraints();
        gbcDivide.anchor = GridBagConstraints.WEST;
        gbcDivide.fill   = GridBagConstraints.HORIZONTAL;
        gbcDivide.gridheight = 1;
        gbcDivide.gridwidth  = 1;
        gbcDivide.gridx = 4;
        gbcDivide.gridy = 3;
        gbcDivide.ipadx = 10;
        gbcDivide.ipady = 10;
        gbcDivide.insets = new Insets(2, 2, 2, 2);
        contentPane.add(jDivide, gbcDivide);

        JButton jCE = (JButton) context.getBean("jbutton");
        jCE.setFont(buttonFont);
        jCE.setText("CE");
        GridBagConstraints gbcCE = new GridBagConstraints();
        gbcCE.anchor = GridBagConstraints.WEST;
        gbcCE.fill   = GridBagConstraints.HORIZONTAL;
        gbcCE.gridheight = 1;
        gbcCE.gridwidth  = 2;
        gbcCE.gridx = 3;
        gbcCE.gridy = 1;
        gbcCE.ipadx = 10;
        gbcCE.ipady = 10;
        gbcCE.insets = new Insets(2, 2, 2, 2);
        contentPane.add(jCE, gbcCE);

        JButton jEquals = (JButton) context.getBean("jbutton");
        jEquals.setFont(buttonFont);
        jEquals.setText("=");
        GridBagConstraints gbcEquals = new GridBagConstraints();
        gbcEquals.anchor = GridBagConstraints.WEST;
        gbcEquals.fill   = GridBagConstraints.HORIZONTAL;
        gbcEquals.gridheight = 1;
        gbcEquals.gridwidth  = GridBagConstraints.REMAINDER;
        gbcEquals.gridx = 3;
        gbcEquals.gridy = 4;
        gbcEquals.ipadx = 10;
        gbcEquals.ipady = 10;
        gbcEquals.insets = new Insets(2, 2, 2, 2);
        contentPane.add(jEquals, gbcEquals);

        CalcActionListener actionListener1 = (CalcActionListener) context.getBean("calcactionlistener");
        actionListener1.setjTextField(jTextField);
        actionListener1.setjButtonText(CalcButtons.ONE);
        actionListener1.setContext(context);
        j1.addActionListener(actionListener1);

        CalcActionListener actionListener2 = (CalcActionListener) context.getBean("calcactionlistener");
        actionListener2.setjTextField(jTextField);
        actionListener2.setjButtonText(CalcButtons.TWO);
        actionListener2.setContext(context);
        j2.addActionListener(actionListener2);

        CalcActionListener actionListener3 = (CalcActionListener) context.getBean("calcactionlistener");
        actionListener3.setjTextField(jTextField);
        actionListener3.setjButtonText(CalcButtons.THREE);
        actionListener3.setContext(context);
        j3.addActionListener(actionListener3);

        CalcActionListener actionListener4 = (CalcActionListener) context.getBean("calcactionlistener");
        actionListener4.setjTextField(jTextField);
        actionListener4.setjButtonText(CalcButtons.FOUR);
        actionListener4.setContext(context);
        j4.addActionListener(actionListener4);

        CalcActionListener actionListener5 = (CalcActionListener) context.getBean("calcactionlistener");
        actionListener5.setjTextField(jTextField);
        actionListener5.setjButtonText(CalcButtons.FIVE);
        actionListener5.setContext(context);
        j5.addActionListener(actionListener5);

        CalcActionListener actionListener6 = (CalcActionListener) context.getBean("calcactionlistener");
        actionListener6.setjTextField(jTextField);
        actionListener6.setjButtonText(CalcButtons.SIX);
        actionListener6.setContext(context);
        j6.addActionListener(actionListener6);

        CalcActionListener actionListener7 = (CalcActionListener) context.getBean("calcactionlistener");
        actionListener7.setjTextField(jTextField);
        actionListener7.setjButtonText(CalcButtons.SEVEN);
        actionListener7.setContext(context);
        j7.addActionListener(actionListener7);

        CalcActionListener actionListener8 = (CalcActionListener) context.getBean("calcactionlistener");
        actionListener8.setjTextField(jTextField);
        actionListener8.setjButtonText(CalcButtons.EIGHT);
        actionListener8.setContext(context);
        j8.addActionListener(actionListener8);

        CalcActionListener actionListener9 = (CalcActionListener) context.getBean("calcactionlistener");
        actionListener9.setjTextField(jTextField);
        actionListener9.setjButtonText(CalcButtons.NINE);
        actionListener9.setContext(context);
        j9.addActionListener(actionListener9);

        CalcActionListener actionListener0 = (CalcActionListener) context.getBean("calcactionlistener");
        actionListener0.setjTextField(jTextField);
        actionListener0.setjButtonText(CalcButtons.ZERO);
        actionListener0.setContext(context);
        j0.addActionListener(actionListener0);

        CalcActionListener actionListenerDot = (CalcActionListener) context.getBean("calcactionlistener");
        actionListenerDot.setjTextField(jTextField);
        actionListenerDot.setjButtonText(CalcButtons.DOT);
        actionListenerDot.setContext(context);
        jDot.addActionListener(actionListenerDot);

        CalcActionListener actionListenerPercent = (CalcActionListener) context.getBean("calcactionlistener");
        actionListenerPercent.setjTextField(jTextField);
        actionListenerPercent.setjButtonText(CalcButtons.PERCENT);
        actionListenerPercent.setContext(context);
        jPercent.addActionListener(actionListenerPercent);

        CalcActionListener actionListenerPlus = (CalcActionListener) context.getBean("calcactionlistener");
        actionListenerPlus.setjTextField(jTextField);
        actionListenerPlus.setjButtonText(CalcButtons.PLUS);
        actionListenerPlus.setContext(context);
        jPlus.addActionListener(actionListenerPlus);

        CalcActionListener actionListenerMinus = (CalcActionListener) context.getBean("calcactionlistener");
        actionListenerMinus.setjTextField(jTextField);
        actionListenerMinus.setjButtonText(CalcButtons.MINUS);
        actionListenerMinus.setContext(context);
        jMinus.addActionListener(actionListenerMinus);

        CalcActionListener actionListenerMultiply = (CalcActionListener) context.getBean("calcactionlistener");
        actionListenerMultiply.setjTextField(jTextField);
        actionListenerMultiply.setjButtonText(CalcButtons.MULTIPLY);
        actionListenerMultiply.setContext(context);
        jMultiply.addActionListener(actionListenerMultiply);

        CalcActionListener actionListenerDivide = (CalcActionListener) context.getBean("calcactionlistener");
        actionListenerDivide.setjTextField(jTextField);
        actionListenerDivide.setjButtonText(CalcButtons.DIVIDE);
        actionListenerDivide.setContext(context);
        jDivide.addActionListener(actionListenerDivide);

        CalcActionListener actionListenerCE = (CalcActionListener) context.getBean("calcactionlistener");
        actionListenerCE.setjTextField(jTextField);
        actionListenerCE.setjButtonText(CalcButtons.CE);
        actionListenerCE.setContext(context);
        jCE.addActionListener(actionListenerCE);

        CalcActionListener actionListenerEquals = (CalcActionListener) context.getBean("calcactionlistener");
        actionListenerEquals.setjTextField(jTextField);
        actionListenerEquals.setjButtonText(CalcButtons.EQUALS);
        actionListenerEquals.setContext(context);
        jEquals.addActionListener(actionListenerEquals);


        CalcKeyListener keyListener = (CalcKeyListener) context.getBean("calckeylistener");
        keyListener.setjTextField(jTextField);
        keyListener.setContext(context);

        jTextField.addKeyListener(keyListener);
        j1.addKeyListener(keyListener);
        j2.addKeyListener(keyListener);
        j3.addKeyListener(keyListener);
        j4.addKeyListener(keyListener);
        j5.addKeyListener(keyListener);
        j6.addKeyListener(keyListener);
        j7.addKeyListener(keyListener);
        j8.addKeyListener(keyListener);
        j9.addKeyListener(keyListener);
        j0.addKeyListener(keyListener);
        jDot.addKeyListener(keyListener);
        jPercent.addKeyListener(keyListener);
        jPlus.addKeyListener(keyListener);
        jMinus.addKeyListener(keyListener);
        jMultiply.addKeyListener(keyListener);
        jDivide.addKeyListener(keyListener);
        jCE.addKeyListener(keyListener);
        jEquals.addKeyListener(keyListener);
    }
}
