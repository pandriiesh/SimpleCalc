import javax.swing.*;

public class CalcLogic {

    private CalcButtons jButtonText;
    private JTextField jTextField;
    private double firstNumberDouble;
    private double secondNumberDouble;
    private static String firstNumberString = "";
    private static String operation = "";
    private static boolean operationUsed = false;


    public JTextField getjTextField() {
        return jTextField;
    }

    public void setjTextField(JTextField jTextField) {
        this.jTextField = jTextField;
    }

    public CalcButtons getjButtonText() {
        return jButtonText;
    }

    public void setjButtonText(CalcButtons jButtonText) {
        this.jButtonText = jButtonText;
    }


    void doCalculations()
    {

        if (operationUsed) {
            jTextField.setText("");
            operationUsed = false;
        }

        switch (jButtonText)
        {
            case ONE:
                if (jTextField.getText().equals("0")) jTextField.setText("");
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"1");
                break;

            case TWO:
                if (jTextField.getText().equals("0")) jTextField.setText("");
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"2");
                break;

            case THREE:
                if (jTextField.getText().equals("0")) jTextField.setText("");
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"3");
                break;

            case FOUR:
                if (jTextField.getText().equals("0")) jTextField.setText("");
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"4");
                break;

            case FIVE:
                if (jTextField.getText().equals("0")) jTextField.setText("");
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"5");
                break;

            case SIX:
                if (jTextField.getText().equals("0")) jTextField.setText("");
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"6");
                break;

            case SEVEN:
                if (jTextField.getText().equals("0")) jTextField.setText("");
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"7");
                break;

            case EIGHT:
                if (jTextField.getText().equals("0")) jTextField.setText("");
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"8");
                break;

            case NINE:
                if (jTextField.getText().equals("0")) jTextField.setText("");
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"9");
                break;

            case ZERO:
                if (!jTextField.getText().equals("0")) {
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"0");}
                break;

            case DOT:
                if (!jTextField.getText().contains(".")) {
                    if (jTextField.getText().equals(""))
                        jTextField.setText("0");
                    jTextField.setText(jTextField.getText() + ".");
                }
                break;

            case PERCENT:
                doCalculationsWithPercents(operation);
                firstNumberString ="";
                break;

            case PLUS:
                if ((firstNumberString.equals("") && operation.equals("")) || operation.equals("=")) {
                    firstNumberString = jTextField.getText();
                } else if (!operation.equals("")) {
                    doCalculations(operation);
                }
                operation = "+";
                operationUsed = true;
                break;

            case MINUS:
                if ((firstNumberString.equals("") && operation.equals("")) || operation.equals("=")) {
                    firstNumberString = jTextField.getText();
                } else if (!operation.equals("")) {
                    doCalculations(operation);
                }
                operation = "-";
                operationUsed = true;
                break;

            case MULTIPLY:
                if ((firstNumberString.equals("") && operation.equals("")) || operation.equals("=")) {
                    firstNumberString = jTextField.getText();
                } else if (!operation.equals("")) {
                    doCalculations(operation);
                }
                operation = "*";
                operationUsed = true;
                break;

            case DIVIDE:
                if ((firstNumberString.equals("") && operation.equals("")) || operation.equals("=")) {
                    firstNumberString = jTextField.getText();
                } else if (!operation.equals("")) {
                    doCalculations(operation);
                }
                operation = "/";
                operationUsed = true;
                break;

            case EQUALS:
                doCalculations(operation);
                operation = "=";
                firstNumberString ="";
                break;

            case CE:
                operation = "";
                firstNumberString ="";
                jTextField.setText("0");
                operationUsed = false;
                break;
        }
    }

    private void doCalculations(String whatOperation)
    {
        switch (whatOperation) {
            case ("+"):
                firstNumberDouble = firstNumberString.equals("") ? 0d : Double.parseDouble(firstNumberString);
                secondNumberDouble = jTextField.getText().equals("") ?  0d  : Double.parseDouble(jTextField.getText());
                firstNumberString = (firstNumberDouble + secondNumberDouble) + "";
                jTextField.setText(firstNumberString);
                break;
            case ("-"):
                firstNumberDouble = firstNumberString.equals("") ? 0d : Double.parseDouble(firstNumberString);
                secondNumberDouble = jTextField.getText().equals("") ?  0d  : Double.parseDouble(jTextField.getText());
                firstNumberString = (firstNumberDouble - secondNumberDouble) + "";
                jTextField.setText(firstNumberString);
                break;
            case ("*"):
                firstNumberDouble = firstNumberString.equals("") ? 1d : Double.parseDouble(firstNumberString);
                secondNumberDouble = jTextField.getText().equals("") ?  1d  : Double.parseDouble(jTextField.getText());
                firstNumberString = (firstNumberDouble * secondNumberDouble) + "";
                jTextField.setText(firstNumberString);
                break;
            case ("/"):
                firstNumberDouble = firstNumberString.equals("") ? 1d : Double.parseDouble(firstNumberString);
                secondNumberDouble = jTextField.getText().equals("") ?  1d  : Double.parseDouble(jTextField.getText());
                firstNumberString = (firstNumberDouble / secondNumberDouble) +"";
                jTextField.setText(firstNumberString);
                break;
        }
    }

    private void doCalculationsWithPercents(String whatOperation)
    {
        if (jTextField.getText().equals("")) {
            jButtonText = CalcButtons.CE;
            doCalculations();
            return;
        }

        switch (whatOperation) {
            case ("+"):
                firstNumberDouble = Double.parseDouble(firstNumberString);
                secondNumberDouble = firstNumberDouble * Double.parseDouble(jTextField.getText()) / 100;
                firstNumberString = (firstNumberDouble + secondNumberDouble) + "";
                jTextField.setText(firstNumberString);
                break;
            case ("-"):
                firstNumberDouble = Double.parseDouble(firstNumberString);
                secondNumberDouble = firstNumberDouble * Double.parseDouble(jTextField.getText()) / 100;
                firstNumberString = (firstNumberDouble - secondNumberDouble) + "";
                jTextField.setText(firstNumberString);
                break;
            case ("*"):
                firstNumberDouble = Double.parseDouble(firstNumberString);
                secondNumberDouble = firstNumberDouble * Double.parseDouble(jTextField.getText()) / 100;
                firstNumberString = secondNumberDouble + "";
                jTextField.setText(firstNumberString);
                break;
            case ("/"):
                firstNumberDouble = Double.parseDouble(firstNumberString);
                secondNumberDouble = firstNumberDouble / Double.parseDouble(jTextField.getText()) * 100;
                firstNumberString = secondNumberDouble +"";
                jTextField.setText(firstNumberString);
                break;
        }
    }
}
