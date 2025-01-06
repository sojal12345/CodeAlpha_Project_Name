import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounter {
    public static void main(String[] args) {
        // Create a JFrame for the application window
        JFrame frame = new JFrame("Word Counter");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create a JTextArea for input
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        // Add the JTextArea to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Create a JPanel for buttons and output
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create a JButton to count words
        JButton countButton = new JButton("Count Words");
        panel.add(countButton, BorderLayout.WEST);

        // Create a JLabel to display the word count
        JLabel wordCountLabel = new JLabel("Word Count: 0");
        panel.add(wordCountLabel, BorderLayout.CENTER);

        frame.add(panel, BorderLayout.SOUTH);

        // Add an ActionListener to the button
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText().trim();
                if (text.isEmpty()) {
                    wordCountLabel.setText("Word Count: 0");
                } else {
                    String[] words = text.split("\\s+");
                    wordCountLabel.setText("Word Count: " + words.length);
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
