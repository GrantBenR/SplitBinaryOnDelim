import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame
{
    public JOptionPane optionPane;
    private JPanel mainPanel;
    private JPanel optionsPanel;
    private JPanel fileSelectPanel;
    private JButton quitButton;
    private JButton runButton;
    private JTextField filePathField;
    private SplitBinOnDelim mainProgram = new SplitBinOnDelim();
    private String selectedFilePath;

    public Gui()
    {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2,1));

        fileSelectPanel = new JPanel();
        fileSelectPanel.setLayout(new GridLayout(1,2));
        filePathField = new JTextField("INPUT FILE");
        filePathField.add(filePathField);

        quitButton = new JButton("QUIT");
        quitButton.addActionListener(e -> System.exit(0));

        runButton = new JButton("RUN");
        runButton.addActionListener(e -> {
            mainProgram.Run(selectedFilePath);
        });

        optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(1,2));
        optionsPanel.add(runButton);
        optionsPanel.add(quitButton);


        mainPanel.add(optionsPanel);
    }
}
