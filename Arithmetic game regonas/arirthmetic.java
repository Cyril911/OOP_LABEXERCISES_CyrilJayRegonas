import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class arirthmetic {
	private JFrame frame;
	private JLabel leftOperandLabel;
	private JLabel operatorLabel;
	private JLabel rightOperandLabel;
	private JTextField answerField;
	private JButton submitButton;
	private JLabel correctLabel;
	private JLabel incorrectLabel;
 	private int correctCount = 0;
 	private int incorrectCount = 0;

	private JRadioButton addRadio;
	private JRadioButton subRadio;
	private JRadioButton mulRadio;
	private JRadioButton divRadio;
	private JRadioButton modRadio;
	private JRadioButton level1Radio;
	private JRadioButton level2Radio;
	private JRadioButton level3Radio;

	private final Random random = new Random();

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new arirthmetic().show());
	}

	private void show() {
		frame = new JFrame("Arithmetic Game");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(900, 520);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());

		frame.add(createHeader(), BorderLayout.NORTH);
		frame.add(createCenterArea(), BorderLayout.CENTER);
		// Move all controls to the right and style them
		frame.add(createControlsPanel(), BorderLayout.EAST);
		frame.add(createFooter(), BorderLayout.SOUTH);

		generateUnfinishedQuestion();
		frame.setVisible(true);
	}

	private JComponent createHeader() {
		JPanel header = new JPanel(new BorderLayout());
		header.setBorder(new EmptyBorder(10, 12, 10, 12));
		header.setBackground(Color.MAGENTA);

		JLabel title = new JLabel("Arithmetic Game", SwingConstants.CENTER);
		title.setFont(title.getFont().deriveFont(Font.BOLD, 20f));
		title.setForeground(Color.WHITE);


		header.add(title, BorderLayout.CENTER);
		return header;
	}

	private JComponent createCenterArea() {
		JPanel center = new JPanel();
		center.setBorder(new EmptyBorder(16, 16, 16, 16));
		center.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(8, 8, 8, 8);
		center.setBackground(new Color(250, 250, 252));
		center.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createEmptyBorder(16, 16, 16, 16),
				BorderFactory.createCompoundBorder(
						BorderFactory.createLineBorder(new Color(220, 220, 230), 2, true),
						new EmptyBorder(12, 12, 12, 12))
		));

		leftOperandLabel = styledBoxLabel("?");
		rightOperandLabel = styledBoxLabel("?");
		operatorLabel = new JLabel("+");
		operatorLabel.setFont(operatorLabel.getFont().deriveFont(Font.BOLD, 28f));

		JLabel equalsLabel = new JLabel("=");
		equalsLabel.setFont(equalsLabel.getFont().deriveFont(Font.BOLD, 28f));

		answerField = new JTextField(8);
		answerField.setFont(answerField.getFont().deriveFont(22f));

		submitButton = new JButton("Submit");
		submitButton.setFont(submitButton.getFont().deriveFont(Font.BOLD));
		submitButton.addActionListener(this::onSubmit);
		answerField.addActionListener(this::onSubmit);

		int col = 0;
		gbc.gridx = col++; gbc.gridy = 0; center.add(leftOperandLabel, gbc);
		gbc.gridx = col++; gbc.gridy = 0; center.add(operatorLabel, gbc);
		gbc.gridx = col++; gbc.gridy = 0; center.add(rightOperandLabel, gbc);
		gbc.gridx = col++; gbc.gridy = 0; center.add(equalsLabel, gbc);
		gbc.gridx = col++; gbc.gridy = 0; center.add(answerField, gbc);
		gbc.gridx = col;   gbc.gridy = 1; center.add(submitButton, gbc);

		return center;
	}

	private JComponent createControlsPanel() {
		JPanel wrap = new JPanel();
		wrap.setLayout(new BoxLayout(wrap, BoxLayout.Y_AXIS));
		wrap.setBorder(new EmptyBorder(12, 12, 12, 12));
		wrap.setBackground(new Color(247, 249, 252));

		// Operations group (styled)
		JPanel ops = new JPanel();
		ops.setLayout(new BoxLayout(ops, BoxLayout.Y_AXIS));
		ops.setBorder(BorderFactory.createTitledBorder("Operations"));
		ops.setBackground(wrap.getBackground());

		addRadio = new JRadioButton("Addition", true);
		subRadio = new JRadioButton("Subtraction");
		mulRadio = new JRadioButton("Multiplication");
		divRadio = new JRadioButton("Division");
		modRadio = new JRadioButton("Modulo");

		ButtonGroup opsGroup = new ButtonGroup();
		opsGroup.add(addRadio);
		opsGroup.add(subRadio);
		opsGroup.add(mulRadio);
		opsGroup.add(divRadio);
		opsGroup.add(modRadio);

		ops.add(addRadio);
		ops.add(subRadio);
		ops.add(mulRadio);
		ops.add(divRadio);
		ops.add(modRadio);

		addRadio.addActionListener(e -> generateUnfinishedQuestion());
		subRadio.addActionListener(e -> generateUnfinishedQuestion());
		mulRadio.addActionListener(e -> generateUnfinishedQuestion());
		divRadio.addActionListener(e -> generateUnfinishedQuestion());
		modRadio.addActionListener(e -> generateUnfinishedQuestion());

		// Levels group (styled)
		JPanel levels = new JPanel();
		levels.setLayout(new BoxLayout(levels, BoxLayout.Y_AXIS));
		levels.setBorder(BorderFactory.createTitledBorder("Level"));
		levels.setBackground(wrap.getBackground());

		level1Radio = new JRadioButton("Level 1 (1-100)", true);
		level2Radio = new JRadioButton("Level 2 (101-500)");
		level3Radio = new JRadioButton("Level 3 (501-1000)");

		ButtonGroup levelGroup = new ButtonGroup();
		levelGroup.add(level1Radio);
		levelGroup.add(level2Radio);
		levelGroup.add(level3Radio);

		levels.add(level1Radio);
		levels.add(level2Radio);
		levels.add(level3Radio);

		level1Radio.addActionListener(e -> generateUnfinishedQuestion());
		level2Radio.addActionListener(e -> generateUnfinishedQuestion());
		level3Radio.addActionListener(e -> generateUnfinishedQuestion());

		JButton newBtn = new JButton("New Question");
		newBtn.setAlignmentX(Component.LEFT_ALIGNMENT);
		newBtn.addActionListener(e -> generateUnfinishedQuestion());

		wrap.add(ops);
		wrap.add(Box.createVerticalStrut(10));
		wrap.add(levels);
		wrap.add(Box.createVerticalStrut(10));
		wrap.add(newBtn);
		return wrap;
	}

	private JLabel styledBoxLabel(String text) {
		JLabel lbl = new JLabel(text, SwingConstants.CENTER);
		lbl.setPreferredSize(new Dimension(120, 90));
		lbl.setOpaque(true);
		lbl.setBackground(new Color(245, 245, 245));
		lbl.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2));
		lbl.setFont(lbl.getFont().deriveFont(Font.BOLD, 28f));
		return lbl;
	}

	private JComponent createSidebar() {
		JPanel left = new JPanel();
		left.setBorder(new EmptyBorder(10, 10, 10, 10));
		left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));

		JLabel operationsLabel = new JLabel("Operations");
		operationsLabel.setFont(operationsLabel.getFont().deriveFont(Font.BOLD));

		addRadio = new JRadioButton("Addition", true);
		subRadio = new JRadioButton("Subtraction");
		mulRadio = new JRadioButton("Multiplication");
		divRadio = new JRadioButton("Division");
		// Removed Modulo option per request

		ButtonGroup opsGroup = new ButtonGroup();
		opsGroup.add(addRadio);
		opsGroup.add(subRadio);
		opsGroup.add(mulRadio);
		opsGroup.add(divRadio);
		// No modulo in the operations group

		// Regenerate question whenever the operator changes
		addRadio.addActionListener(e -> generateUnfinishedQuestion());
		subRadio.addActionListener(e -> generateUnfinishedQuestion());
		mulRadio.addActionListener(e -> generateUnfinishedQuestion());
		divRadio.addActionListener(e -> generateUnfinishedQuestion());

		left.add(operationsLabel);
		left.add(Box.createVerticalStrut(6));
		left.add(addRadio);
		left.add(subRadio);
		left.add(mulRadio);
		left.add(divRadio);
		// modulo option removed

		return left;
	}

	private JComponent createRightBar() {
		JPanel right = new JPanel();
		right.setBorder(new EmptyBorder(10, 10, 10, 10));
		right.setLayout(new BoxLayout(right, BoxLayout.Y_AXIS));

		JLabel levelLabel = new JLabel("Level");
		levelLabel.setFont(levelLabel.getFont().deriveFont(Font.BOLD));

		level1Radio = new JRadioButton("Level 1 (1-100)", true);
		level2Radio = new JRadioButton("Level 2 (101-500)");
		level3Radio = new JRadioButton("Level 3 (501-1000)");

		ButtonGroup levelGroup = new ButtonGroup();
		levelGroup.add(level1Radio);
		levelGroup.add(level2Radio);
		levelGroup.add(level3Radio);

		right.add(levelLabel);
		right.add(Box.createVerticalStrut(6));
		right.add(level1Radio);
		right.add(level2Radio);
		right.add(level3Radio);

		// Regenerate question whenever difficulty changes
		level1Radio.addActionListener(e -> generateUnfinishedQuestion());
		level2Radio.addActionListener(e -> generateUnfinishedQuestion());
		level3Radio.addActionListener(e -> generateUnfinishedQuestion());

		return right;
	}

	private JComponent createFooter() {
		JPanel footer = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		footer.setBorder(new EmptyBorder(6, 10, 8, 10));

		JLabel scoreText = new JLabel("Score:");
		correctLabel = new JLabel("Correct: 0");
		incorrectLabel = new JLabel("Incorrect: 0");

		footer.add(scoreText);
		footer.add(Box.createHorizontalStrut(10));
		footer.add(correctLabel);
		footer.add(Box.createHorizontalStrut(10));
		footer.add(incorrectLabel);

		return footer;
	}

 	private void onSubmit(ActionEvent e) {
 		String text = answerField.getText().trim();
 		if (text.isEmpty()) {
 			Toolkit.getDefaultToolkit().beep();
 			return;
 		}
 		try {
 			long userAnswer = Long.parseLong(text);
 			long expected = computeCurrentAnswer();
 			if (userAnswer == expected) {
 				correctCount++;
 			} else {
 				incorrectCount++;
 			}
 			updateScoreLabels();
 			generateUnfinishedQuestion();
 		} catch (NumberFormatException ex) {
 			Toolkit.getDefaultToolkit().beep();
 		}
 	}

	private void generateUnfinishedQuestion() {
		int min = 1;
		int max;
		if (level1Radio != null && level1Radio.isSelected()) {
			max = 100;
		} else if (level2Radio != null && level2Radio.isSelected()) {
			min = 101; max = 500;
		} else if (level3Radio != null && level3Radio.isSelected()) {
			min = 501; max = 1000;
		} else {
			max = 100; // default
		}

		int a = randomInRange(min, max);
		int b = randomInRange(min, max);

		String op = "+";
		if (subRadio.isSelected()) op = "-";
		else if (mulRadio.isSelected()) op = "×";
		else if (divRadio.isSelected()) op = "÷";
		else if (modRadio.isSelected()) op = "%";


		if (divRadio.isSelected()) {
			b = Math.max(1, randomInRange(min, max));
			int quotient = randomInRange(1, 12);
			a = b * quotient; // ensure integer division
		}
		if (modRadio.isSelected()) {
			b = Math.max(1, randomInRange(min, max));
		}

		leftOperandLabel.setText(String.valueOf(a));
		rightOperandLabel.setText(String.valueOf(b));
		operatorLabel.setText(op);
		answerField.setText("");
		answerField.requestFocusInWindow();
	}

	private int randomInRange(int min, int max) {
		if (max < min) return min;
		return random.nextInt(max - min + 1) + min;
	}

	private long computeCurrentAnswer() {
		long a = Long.parseLong(leftOperandLabel.getText());
		long b = Long.parseLong(rightOperandLabel.getText());
		String op = operatorLabel.getText();
		switch (op) {
			case "+": return a + b;
			case "-": return a - b;
			case "×": return a * b;
			case "÷": return b == 0 ? 0 : a / b;
			case "%": return b == 0 ? 0 : a % b;

			default: return 0;
		}
	}

	private void updateScoreLabels() {
		correctLabel.setText("Correct: " + correctCount);
		incorrectLabel.setText("Incorrect: " + incorrectCount);
	}
}


