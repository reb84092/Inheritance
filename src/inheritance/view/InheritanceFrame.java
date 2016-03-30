package inheritance.view;

import java.awt.Container;

import javax.swing.JFrame;

import inheritance.controller.InheritanceController;

import javax.swing.JOptionPane;

public class InheritanceFrame extends JFrame
{
	private InheritanceController baseController;
	private InheritancePanel basePanel;
	
	public InheritanceFrame(InheritanceController baseController)
	{
		this.baseController = baseController;
		basePanel = new InheritancePanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); //Must be a first line of setupFrame!
		this.setSize(500,500); //Find a good size for the app.
		this.setResizable(false); //Advisable, not required.
		this.setVisible(true); //Must be the last line of setupFrame!
	}
}
