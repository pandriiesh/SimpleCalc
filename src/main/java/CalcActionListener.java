import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcActionListener implements ActionListener
{
    private String jButtonText;
    private JTextField jTextField;
    private ApplicationContext context;

    public String getjButtonText() {
        return jButtonText;
    }

    public void setjButtonText(String jButtonText) {
        this.jButtonText = jButtonText;
    }

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
    public void actionPerformed(ActionEvent e)
    {
        CalcLogic calcLogic = (CalcLogic) context.getBean("calclogic");
        calcLogic.setjTextField(jTextField);
        calcLogic.setjButtonText(jButtonText);
        calcLogic.doCalculations();
    }
}
