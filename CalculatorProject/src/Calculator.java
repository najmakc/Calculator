import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator  implements ActionListener {
	JFrame jf;
	boolean isOperatorClicked=false;
	int c; 
	float res=0;
	String oldValue,newValue; 
	JButton divisionButton;
	JButton multiplyButton;
	JButton equalButton;
	JButton subButton;
	JButton addButton;
	JButton dotButton;
	JLabel displayLabel;
	JButton clearButton;
	JButton sevenButton,eightButton,nineButton,fourButton,fiveButton,sixButton,firstButton,secondButton,thirdButton, zeroButton;
	public  Calculator()
	{
		jf=new JFrame("Calculator"); 
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(300, 150);
		
	    displayLabel=new JLabel("",SwingConstants.RIGHT);
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground( Color.GRAY );
		displayLabel.setOpaque(true);
		displayLabel.setForeground(Color.WHITE);
		
		jf.add(displayLabel);
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 140, 80, 80);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 30));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
	    eightButton=new JButton("8");
		eightButton.setBounds(130, 140, 80, 80);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 30));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		 nineButton=new JButton("9");
		nineButton.setBounds(230, 140, 80, 80);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 30));
		nineButton.addActionListener(this);
		jf.add(nineButton);
	    divisionButton=new JButton("/");
		divisionButton.setBounds(330, 140, 80, 80);
		divisionButton.setFont(new Font("Arial", Font.PLAIN, 30));
		divisionButton.addActionListener(this);
		jf.add(divisionButton);
		 fourButton=new JButton("4");
		fourButton.setBounds(30, 240, 80, 80);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 30));
		fourButton.addActionListener(this);
		jf.add(fourButton);
	     fiveButton=new JButton("5");
		fiveButton.setBounds(130, 240, 80, 80);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 30));
		sevenButton.addActionListener(this);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		 sixButton=new JButton("6");
		sixButton.setBounds(230, 240, 80, 80);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 30));
		sixButton.addActionListener(this);
		jf.add(sixButton);
	    multiplyButton=new JButton("*");
		multiplyButton.setBounds(330, 240, 80, 80);
		multiplyButton.setFont(new Font("Arial", Font.PLAIN, 30));
		multiplyButton.addActionListener(this);
		jf.add(multiplyButton);
		 firstButton=new JButton("1");
		firstButton.setBounds(30, 340, 80, 80);
		firstButton.setFont(new Font("Arial", Font.PLAIN, 30));
		firstButton.addActionListener(this);
		jf.add(firstButton);
		 secondButton=new JButton("2");
		secondButton.setBounds(130, 340, 80, 80);
		secondButton.setFont(new Font("Arial", Font.PLAIN, 30));
		secondButton.addActionListener(this);
		jf.add(secondButton);
		 thirdButton=new JButton("3");
		thirdButton.setBounds(230, 340, 80, 80);
		thirdButton.setFont(new Font("Arial", Font.PLAIN, 30));
		thirdButton.addActionListener(this);
		jf.add(thirdButton);
	    subButton=new JButton("-");
		subButton.setBounds(330, 340, 80, 80);
		subButton.setFont(new Font("Arial", Font.PLAIN, 30));
		subButton.addActionListener(this);
		jf.add(subButton);
	    dotButton=new JButton(".");
		dotButton.setBounds(30, 440, 80, 80);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 30));
		dotButton.addActionListener(this);
		jf.add(dotButton);
	    zeroButton=new JButton("0");
		zeroButton.setBounds(130, 440, 80, 80);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 30));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
	    equalButton=new JButton("=");
		equalButton.setBounds(230, 440, 80, 80);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 30));
		equalButton.addActionListener(this);
		jf.add(equalButton);
	    addButton=new JButton("+");
		addButton.setBounds(330, 440, 80, 80);
		addButton.setFont(new Font("Arial", Font.PLAIN, 30));
		addButton.addActionListener(this);
		jf.add(addButton);
	    clearButton=new JButton("C");
		clearButton.setBounds(430, 440, 80, 80);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 30));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==sevenButton) 
	    {	
			if(isOperatorClicked)
			{
				displayLabel.setText("7");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
		}
		else if(e.getSource()==eightButton)
			
		{
			if(isOperatorClicked)
			{
				displayLabel.setText("8");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
		}
		else if(e.getSource()==nineButton)
		{
			if(isOperatorClicked)
			{
				displayLabel.setText("9");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
		
		}
		else if(e.getSource()==fourButton)
		{
			if(isOperatorClicked)
			{
				displayLabel.setText("4");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}
		else if(e.getSource()==fiveButton)
		{
			if(isOperatorClicked)
			{
				displayLabel.setText("5");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}
		else if(e.getSource()==sixButton)
		{
			if(isOperatorClicked)
			{
				displayLabel.setText("6");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		}
		else if(e.getSource()==firstButton)
		{
			if(isOperatorClicked)
			{
				displayLabel.setText("1");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}
		else if(e.getSource()==secondButton)
		{
			if(isOperatorClicked)
			{
				displayLabel.setText("2");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}
		else if(e.getSource()==thirdButton)
		{
			if(isOperatorClicked)
			{
				displayLabel.setText("3");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
		}
		else if(e.getSource()==zeroButton)
		{
			if(isOperatorClicked)
			{
				displayLabel.setText("0");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
		}
		else if(e.getSource()==divisionButton)
		{
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			c=4;
		}
		else if(e.getSource()==multiplyButton)
		{
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			c=3;
		}
		else if(e.getSource()==subButton)
		{
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			c=2;
		}
		else if(e.getSource()==addButton)
		{
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			c=1;
			
		}
		else if(e.getSource()==dotButton)
		{
			if(isOperatorClicked)
			{
				displayLabel.setText(".");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+".");
			}
		}
		else if(e.getSource()==equalButton)
		{
			switch(c)
			{
			case 1:
				newValue=displayLabel.getText();
				res=Float.parseFloat(oldValue)+Float.parseFloat(newValue);
				displayLabel.setText(res+"");
				break;
			case 2:
				newValue=displayLabel.getText();
				res=Float.parseFloat(oldValue)-Float.parseFloat(newValue);
				displayLabel.setText(res+"");
				break;
			case 3:
				newValue=displayLabel.getText();
				res=Float.parseFloat(oldValue)*Float.parseFloat(newValue);
				displayLabel.setText(res+"");
				break;
			case 4:
				newValue=displayLabel.getText();
				res=Float.parseFloat(oldValue)/Float.parseFloat(newValue);
				displayLabel.setText(res+"");
				break;
			}
		}
		else if(e.getSource()==clearButton)
		{
			displayLabel.setText("");
		}
		
	
		
	}

}
