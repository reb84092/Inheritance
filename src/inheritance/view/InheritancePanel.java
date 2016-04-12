package inheritance.view;

import inheritance.controller.InheritanceController;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import inheritance.model.DS;


public class InheritancePanel extends JPanel
{
	private InheritanceController baseController;
	private SpringLayout baseLayout;
	private JComboBox<String> phraseComboBox;
	private int maxClicks;
	private int startClick;
	private JTextArea theTextArea;
	private JButton theButton;
	
	public InheritancePanel(InheritanceController baseController)
	{
		
	}

}
