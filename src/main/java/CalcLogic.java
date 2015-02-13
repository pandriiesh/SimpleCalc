import javax.swing.*;

public class CalcLogic {

    private String jButtonText;
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

    public String getjButtonText() {
        return jButtonText;
    }

    public void setjButtonText(String jButtonText) {
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
            case "1":
                if (jTextField.getText().equals("0")) jTextField.setText("");
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"1");
                break;

            case "2":
                if (jTextField.getText().equals("0")) jTextField.setText("");
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"2");
                break;

            case "3":
                if (jTextField.getText().equals("0")) jTextField.setText("");
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"3");
                break;

            case "4":
                if (jTextField.getText().equals("0")) jTextField.setText("");
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"4");
                break;

            case "5":
                if (jTextField.getText().equals("0")) jTextField.setText("");
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"5");
                break;

            case "6":
                if (jTextField.getText().equals("0")) jTextField.setText("");
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"6");
                break;

            case "7":
                if (jTextField.getText().equals("0")) jTextField.setText("");
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"7");
                break;

            case "8":
                if (jTextField.getText().equals("0")) jTextField.setText("");
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"8");
                break;

            case "9":
                if (jTextField.getText().equals("0")) jTextField.setText("");
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"9");
                break;

            case "0":
                if (!jTextField.getText().equals("0")) {
                if (operation.equals("=") || operation.equals("%")) {
                    operation="";
                    jTextField.setText("");
                }
                jTextField.setText(jTextField.getText()+"0");}
                break;

            case ".":
                if (!jTextField.getText().contains(".")) {
                    if (jTextField.getText().equals(""))
                        jTextField.setText("0");
                    jTextField.setText(jTextField.getText() + ".");
                }
                break;

            case "%":
                doCalculationsWithPercents(operation);
                firstNumberString ="";
                break;

            case "+":
                if ((firstNumberString.equals("") && operation.equals("")) || operation.equals("=")) {
                    firstNumberString = jTextField.getText();
                } else if (!operation.equals("")) {
                    doCalculations(operation);
                }
                operation = "+";
                operationUsed = true;
                break;

            case "-":
                if ((firstNumberString.equals("") && operation.equals("")) || operation.equals("=")) {
                    firstNumberString = jTextField.getText();
                } else if (!operation.equals("")) {
                    doCalculations(operation);
                }
                operation = "-";
                operationUsed = true;
                break;

            case "*":
                if ((firstNumberString.equals("") && operation.equals("")) || operation.equals("=")) {
                    firstNumberString = jTextField.getText();
                } else if (!operation.equals("")) {
                    doCalculations(operation);
                }
                operation = "*";
                operationUsed = true;
                break;

            case "/":
                if ((firstNumberString.equals("") && operation.equals("")) || operation.equals("=")) {
                    firstNumberString = jTextField.getText();
                } else if (!operation.equals("")) {
                    doCalculations(operation);
                }
                operation = "/";
                operationUsed = true;
                break;

            case "=":
                doCalculations(operation);
                operation = "=";
                firstNumberString ="";
                break;

            case "CE":
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
            jButtonText = "CE";
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
