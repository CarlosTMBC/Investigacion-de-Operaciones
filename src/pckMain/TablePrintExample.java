/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckMain;import javax.swing.*;
import java.awt.*;

public class TablePrintExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Text Area Table Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            JTextArea textArea = new JTextArea();
            textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
            textArea.setEditable(false);

            String table = generateTable(3, 3);
            textArea.setText(table);

            frame.add(new JScrollPane(textArea));
            frame.setVisible(true);
        });
    }

    public static String generateTable(int rows, int cols) {
        StringBuilder table = new StringBuilder();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                table.append("+--------");
                if (j == cols - 1) {
                    table.append("+\n");
                }
            }

            for (int j = 0; j < cols; j++) {
                table.append("|   " + (i * cols + j) + "   ");
                if (j == cols - 1) {
                    table.append("|\n");
                }
            }

            if (i == rows - 1) {
                for (int j = 0; j < cols; j++) {
                    table.append("+--------");
                    if (j == cols - 1) {
                        table.append("+\n");
                    }
                }
            }
        }

        return table.toString();
    }
}
