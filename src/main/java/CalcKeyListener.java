import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CalcKeyListener implements KeyListener {

    private JTextField jTextField;
    ApplicationContext context;
    CalcLogic calcLogic;

    public JTextField getjTextField() {
        return jTextField;
    }

    public void setjTextField(JTextField jTextField) {
        this.jTextField = jTextField;
    }

    public ApplicationContext getContext() {
        return context;
    }

    public void setContext(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        switch (e.getKeyCode())
        {
            case (49):
                calcLogic = (CalcLogic) context.getBean("calclogic");
                calcLogic.setjTextField(jTextField);
                calcLogic.setjButtonText("1");
                calcLogic.doCalculations();
                break;

            case (50):
                calcLogic = (CalcLogic) context.getBean("calclogic");
                calcLogic.setjTextField(jTextField);
                calcLogic.setjButtonText("2");
                calcLogic.doCalculations();
                break;

            case (51):
                calcLogic = (CalcLogic) context.getBean("calclogic");
                calcLogic.setjTextField(jTextField);
                calcLogic.setjButtonText("3");
                calcLogic.doCalculations();
                break;

            case (52):
                calcLogic = (CalcLogic) context.getBean("calclogic");
                calcLogic.setjTextField(jTextField);
                calcLogic.setjButtonText("4");
                calcLogic.doCalculations();
                break;

            case (53): calcLogic = (CalcLogic) context.getBean("calclogic");
                calcLogic.setjTextField(jTextField);
                calcLogic.setjButtonText("5");
                calcLogic.doCalculations();
                break;

            case (54):
                calcLogic = (CalcLogic) context.getBean("calclogic");
                calcLogic.setjTextField(jTextField);
                calcLogic.setjButtonText("6");
                calcLogic.doCalculations();
                break;

            case (55):
                calcLogic = (CalcLogic) context.getBean("calclogic");
                calcLogic.setjTextField(jTextField);
                calcLogic.setjButtonText("7");
                calcLogic.doCalculations();
                break;

            case (56):
                calcLogic = (CalcLogic) context.getBean("calclogic");
                calcLogic.setjTextField(jTextField);
                calcLogic.setjButtonText("8");
                calcLogic.doCalculations();
                break;

            case (57):
                calcLogic = (CalcLogic) context.getBean("calclogic");
                calcLogic.setjTextField(jTextField);
                calcLogic.setjButtonText("9");
                calcLogic.doCalculations();
                break;

            case (48):
                calcLogic = (CalcLogic) context.getBean("calclogic");
                calcLogic.setjTextField(jTextField);
                calcLogic.setjButtonText("0");
                calcLogic.doCalculations();
                break;

            case (46):
                calcLogic = (CalcLogic) context.getBean("calclogic");
                calcLogic.setjTextField(jTextField);
                calcLogic.setjButtonText(".");
                calcLogic.doCalculations();
                break;

            case (8):
                calcLogic = (CalcLogic) context.getBean("calclogic");
                calcLogic.setjTextField(jTextField);
                calcLogic.setjButtonText("CE");
                calcLogic.doCalculations();
                break;

            case (10): calcLogic = (CalcLogic) context.getBean("calclogic");
                calcLogic.setjTextField(jTextField);
                calcLogic.setjButtonText("=");
                calcLogic.doCalculations();
                break;

            case (45):
                calcLogic = (CalcLogic) context.getBean("calclogic");
                calcLogic.setjTextField(jTextField);
                calcLogic.setjButtonText("-");
                calcLogic.doCalculations();
                break;

            case (61):
                calcLogic = (CalcLogic) context.getBean("calclogic");
                calcLogic.setjTextField(jTextField);
                calcLogic.setjButtonText("+");
                calcLogic.doCalculations();
                break;

            case (27): System.exit(0);
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
    }
}
