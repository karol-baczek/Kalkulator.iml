package Task2;

import javax.swing.*;

public class Counter {

    private JPanel main;
    private JButton plus;
    private JButton minus;
    private JButton dzielenie;
    private JButton modulo;
    private JButton czysc;
    private JLabel liczba1;
    private JLabel liczba2;
    private JLabel wynik;
    private JTextField wejscie1;
    private JTextField wejscie2;
    private JTextField poleWynik;
    private JButton mnozenie;

    public Counter() {

        czysc.addActionListener(e -> {
            wejscie1.setText("");
            wejscie2.setText("");
            poleWynik.setText("");
        });

        plus.addActionListener(e -> {
            poleWynik.setText(addNumbers());
        });

        dzielenie.addActionListener(e ->
                poleWynik.setText(divideNumbers()));

        minus.addActionListener(e -> {
            poleWynik.setText(substractNumbers());
        });

        modulo.addActionListener(e -> {
            poleWynik.setText(moduloNumbers());
        });

        mnozenie.addActionListener(e -> {
            poleWynik.setText(multiplyNumbers());
        });
    }

    private String addNumbers() {

        Double firstNumber = Double.parseDouble(wejscie1.getText().replaceAll(",", "."));
        Double secondNumber = Double.parseDouble(wejscie2.getText().replaceAll(",", "."));

        Double result = (firstNumber + secondNumber);

        return result.toString();
    }

    private String substractNumbers() {
        Double firstNumber = Double.parseDouble(wejscie1.getText().replaceAll(",", "."));
        Double secondNumber = Double.parseDouble(wejscie2.getText().replaceAll(",", "."));

        Double result = firstNumber - secondNumber;

        return result.toString();
    }

    private String divideNumbers() {
        Double firstNumber = Double.parseDouble(wejscie1.getText().replaceAll(",", "."));
        Double secondNumber = Double.parseDouble(wejscie2.getText().replaceAll(",", "."));

        Double result = (firstNumber / secondNumber);

        return secondNumber != 0 ? result.toString() : "Nie dziel przez 0!";
    }

    private String moduloNumbers() {
        Double firstNumber = Double.parseDouble(wejscie1.getText().replaceAll(",", "."));
        Double secondNumber = Double.parseDouble(wejscie2.getText().replaceAll(",", "."));

        Double result = (firstNumber % secondNumber);
        return result.toString();
    }

    private String multiplyNumbers() {
        Double firstNumber = Double.parseDouble(wejscie1.getText().replaceAll(",", "."));
        Double secondNumber = Double.parseDouble(wejscie2.getText().replaceAll(",", "."));
        Double result = firstNumber * secondNumber;

        return result.toString();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Counter App");
        frame.setContentPane(new Counter().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.pack();
        frame.setVisible(true);
    }

}
