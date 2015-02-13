import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class SimpleCalc extends JFrame
{
    private static final long serialVersionUID = 1L;

    public static void main(String[] args)
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();

        SimpleCalc calc = (SimpleCalc) context.getBean("simplecalc");
        calc.setTitle("Calculator");
        calc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        CalcComponentManager calcComponentManager = (CalcComponentManager) context.getBean("calccomponentmanager");
        calcComponentManager.setContext(context);
        calcComponentManager.setContentPane(calc.getContentPane());
        calcComponentManager.createCalcView();

        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setVisible(true);
    }
}
