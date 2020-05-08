package team;
import java.io.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
class ImagePanel extends JPanel {

	private Image img;

  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());
  }

  public ImagePanel(Image img) {
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
     setLayout(null);
  }

  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }

}

public class JMGS extends JFrame {

private JPanel contentPane;
	private JTextField text;
	protected JTextComponent fw;
	public static void main(String[] args) throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 JMGS frame= new  JMGS ("Sports jaf managmeent system");
					 ImagePanel panel = new ImagePanel(
					 new ImageIcon("C:\\Users\\Imdad\\Desktop\\Project\\name.jpg").getImage());
					 panel.setBounds(0, 0, 1410, 750);
				     frame.getContentPane().add(panel);
					 frame.pack();
					 frame.setVisible(true);
					 frame.getContentPane().setLayout(null);
					 frame.setTitle("JAFF MANAGEMENT SYSTEM");
					 frame.setSize(1250, 700);
					 panel.setSize(1250, 700);
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
	 });
}
public JMGS(String s)   throws Exception {
		File file = new File("out.txt");
		 try {
			FileWriter fw = new FileWriter(file);
		} 
		 catch (IOException e2) {
			e2.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 450, 700, 700);
		contentPane = new JPanel();
	    contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		text = new JTextField();
		text.setForeground(new Color(255, 255, 255));
		text.setBackground(new Color(0, 0, 0));
		text.setBounds(357, 62, 235, 20);
		contentPane.add(text);
		text.setColumns(10);
		JLabel lblNewLabel = new JLabel("Name of the Team :");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		lblNewLabel.setBounds(83, 62, 150, 20);
		contentPane.add(lblNewLabel);
		JRadioButton indoor = new JRadioButton("INDOOR");
		indoor.setForeground(new Color(255, 255, 255));
		indoor.setBackground(new Color(0, 0, 0));
		JRadioButton outdoor = new JRadioButton("OUTDOOR");
		outdoor.setBackground(new Color(0, 0, 0));
		outdoor.setForeground(new Color(255, 255, 255));
		indoor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(indoor.isSelected())
				{
					outdoor.setSelected(false);
				}
				else if(outdoor.isSelected())
				{
					indoor.setSelected(false);
				}
			}
		});
		indoor.setBounds(252, 127, 109, 23);
		contentPane.add(indoor);
		outdoor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(outdoor.isSelected())
				{
					indoor.setSelected(false);
				}
			}
		});
		outdoor.setBounds(252, 160, 109, 23);
		contentPane.add(outdoor);
		JButton btnNewButton = new JButton("Category");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String selection=null;
				if(indoor.isSelected()) 
				{
					selection="indoor is selected";
					outdoor.setSelected(false);
				}
				if(outdoor.isSelected()) 
				{
					selection="outdoor is selected";
					indoor.setSelected(false);
				}
				try {    BufferedWriter writer = new BufferedWriter(
			        	new FileWriter(file, true)  
			        );  
					writer.newLine();   
                 writer.write(selection);
                 writer.close();
					} 
			        catch (Exception e1) { 
			         System.out.println(e1); 
			        } 
			   }
		});
		btnNewButton.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		btnNewButton.setBounds(83, 126, 136, 23);
		contentPane.add(btnNewButton);
		JRadioButton SLOT1 = new JRadioButton("7 AM TO 8:30 AM");
		SLOT1.setForeground(new Color(255, 255, 255));
		SLOT1.setBackground(new Color(0, 0, 0));
		JRadioButton SLOT2 = new JRadioButton("8:30 AM TO 10 AM");
		SLOT2.setForeground(new Color(255, 255, 255));
		SLOT2.setBackground(new Color(0, 0, 0));
		JRadioButton SLOT3 = new JRadioButton("10:30 AM TO 11 AM");
		SLOT3.setForeground(new Color(255, 255, 255));
		SLOT3.setBackground(new Color(0, 0, 0));
		JRadioButton SLOT4 = new JRadioButton("11 AM TO 12:30 PM");
		SLOT4.setForeground(new Color(255, 255, 255));
		SLOT4.setBackground(new Color(0, 0, 0));
		JRadioButton SLOT5 = new JRadioButton("12:30 PM TO 2 PM");
		SLOT5.setForeground(new Color(255, 255, 255));
		SLOT5.setBackground(new Color(0, 0, 0));
		JRadioButton SLOT6 = new JRadioButton("2 PM TO 3:30 PM");
		SLOT6.setForeground(new Color(255, 255, 255));
		SLOT6.setBackground(new Color(0, 0, 0));
		JRadioButton SLOT7 = new JRadioButton("3:30 PM TO 5 PM");
		SLOT7.setBackground(new Color(0, 0, 0));
		SLOT7.setForeground(new Color(255, 255, 255));
		JRadioButton SLOT8 = new JRadioButton("5 PM TO 6:30 PM");
		SLOT8.setForeground(new Color(255, 255, 255));
		SLOT8.setBackground(new Color(0, 0, 0));
		JRadioButton SLOT9 = new JRadioButton("6:30 PM TO 8 PM");
		SLOT9.setBackground(new Color(0, 0, 0));
		SLOT9.setForeground(new Color(255, 255, 255));
		
		SLOT2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(SLOT2.isSelected())
				{
					if(SLOT1.isSelected())
					{   SLOT3.setSelected(false);
						SLOT4.setSelected(false);
						SLOT5.setSelected(false);
						SLOT6.setSelected(false);
						SLOT7.setSelected(false);
						SLOT8.setSelected(false);
						SLOT9.setSelected(false);
					}
					else if(SLOT3.isSelected()) 
					{   SLOT1.setSelected(false);
						SLOT4.setSelected(false);
						SLOT5.setSelected(false);
						SLOT6.setSelected(false);
						SLOT7.setSelected(false);
						SLOT8.setSelected(false);
						SLOT9.setSelected(false);
					}
					else if(SLOT4.isSelected()) 
					{   SLOT1.setSelected(false);
						SLOT3.setSelected(false);
						SLOT5.setSelected(false);
						SLOT6.setSelected(false);
						SLOT7.setSelected(false);
						SLOT8.setSelected(false);
						SLOT9.setSelected(false);
					}
					else if(SLOT5.isSelected()) 
					{   SLOT1.setSelected(false);
						SLOT3.setSelected(false);
						SLOT4.setSelected(false);
						SLOT6.setSelected(false);
						SLOT7.setSelected(false);
						SLOT8.setSelected(false);
						SLOT9.setSelected(false);
						
					}
					else if(SLOT6.isSelected()) 
					{   SLOT1.setSelected(false);
						SLOT3.setSelected(false);
						SLOT4.setSelected(false);
						SLOT5.setSelected(false);
						SLOT7.setSelected(false);
						SLOT8.setSelected(false);
						SLOT9.setSelected(false);	
					}
					else if(SLOT7.isSelected()) 
					{    SLOT1.setSelected(false);
						SLOT3.setSelected(false);
						SLOT4.setSelected(false);
						SLOT5.setSelected(false);
						SLOT6.setSelected(false);
						SLOT8.setSelected(false);
						SLOT9.setSelected(false);
						
					}
					else if(SLOT8.isSelected()) 
					{	SLOT1.setSelected(false);
						SLOT3.setSelected(false);
						SLOT4.setSelected(false);
						SLOT5.setSelected(false);
						SLOT6.setSelected(false);
						SLOT7.setSelected(false);
						SLOT9.setSelected(false);
						
					}
					else if(SLOT9.isSelected()) 
					{	SLOT1.setSelected(false);
						SLOT3.setSelected(false);
						SLOT4.setSelected(false);
						SLOT5.setSelected(false);
						SLOT6.setSelected(false);
						SLOT7.setSelected(false);
						SLOT8.setSelected(false);
					}
				}
			}
		});
		SLOT2.setBounds(252, 272, 136, 23);
		contentPane.add(SLOT2);
		
		//JRadioButton SLOT3 = new JRadioButton("10:30 AM TO 11 AM");
		SLOT3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 {
						if(SLOT3.isSelected())
						{
							if(SLOT1.isSelected())
							{ SLOT2.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
							}
							else if(SLOT4.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
							}
							else if(SLOT5.isSelected()) 
							{SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT4.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
							}
							else if(SLOT6.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);	
							}
							else if(SLOT7.isSelected()) 
							{    SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
							 }
							else if(SLOT8.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
								SLOT9.setSelected(false);
							}
							else if(SLOT9.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
							}
						}
					}
			}
		});
		SLOT3.setBounds(252, 312, 136, 23);
		contentPane.add(SLOT3);
		SLOT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(SLOT1.isSelected())
				{
					if(SLOT2.isSelected())
					{  
						SLOT3.setSelected(false);
						SLOT4.setSelected(false);
						SLOT5.setSelected(false);
						SLOT6.setSelected(false);
						SLOT7.setSelected(false);
						SLOT8.setSelected(false);
						SLOT9.setSelected(false);
					}
					       else if(SLOT3.isSelected())
							{
								SLOT2.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
							
							}
							else if(SLOT4.isSelected()) 
							{  
								SLOT2.setSelected(false);
                                SLOT3.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
								
							}
							else if(SLOT5.isSelected()) 
							{
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
								
							}
							else if(SLOT6.isSelected()) 
							{ 
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);	
							}
							else if(SLOT7.isSelected()) 
							{ 
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
							}
							else if(SLOT8.isSelected()) 
							{   
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
								SLOT9.setSelected(false);
								
							}
							else if(SLOT9.isSelected()) 
							{  
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
							}
                      }
				}
		});
		SLOT1.setBounds(252, 229, 136, 23);
		contentPane.add(SLOT1);
		SLOT7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 {
					 if(SLOT7.isSelected())
						{
						 if(SLOT2.isSelected())
							{   SLOT1.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
							}
							else if(SLOT3.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
							}
							else if(SLOT4.isSelected()) 
							{        SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
							}
							else if(SLOT5.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT6.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
							}
							else if(SLOT6.isSelected()) 
							{        SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);					
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
							}
							else if(SLOT1.isSelected()) 
							{       
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
							}
							else if(SLOT8.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT9.setSelected(false);
							}
		                     else if(SLOT9.isSelected()) 
									{   SLOT1.setSelected(false);
										SLOT2.setSelected(false);
										SLOT3.setSelected(false);
										SLOT4.setSelected(false);
										SLOT5.setSelected(false);
										SLOT6.setSelected(false);
										SLOT8.setSelected(false);
									}
							}
					}
				}
		});
		SLOT7.setBounds(479, 272, 125, 23);
		contentPane.add(SLOT7);
		
		SLOT8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 {if(SLOT8.isSelected())
						{
							if(SLOT2.isSelected())
							{   SLOT1.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
								SLOT9.setSelected(false);
							}
							
							else if(SLOT1.isSelected()) 
							{  SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
								SLOT9.setSelected(false);
							}
							else if(SLOT3.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
								SLOT9.setSelected(false);
							}
							else if(SLOT4.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
								SLOT9.setSelected(false);
							}
							else if(SLOT5.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
								SLOT9.setSelected(false);
							}
							else if(SLOT6.isSelected()) 
							{    SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT7.setSelected(false);
							    SLOT9.setSelected(false);
							}
							else if(SLOT7.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT9.setSelected(false);
							}
							 else if(SLOT9.isSelected()) 
									{   SLOT1.setSelected(false);
										SLOT2.setSelected(false);
										SLOT3.setSelected(false);
										SLOT4.setSelected(false);
										SLOT5.setSelected(false);
										SLOT6.setSelected(false);
										SLOT7.setSelected(false);
								}
						}
					}
				}
		});
		SLOT8.setBounds(479, 312, 125, 23);
		contentPane.add(SLOT8);
		
		SLOT6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 { if(SLOT6.isSelected())
						{
						 if(SLOT1.isSelected())
							{   SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
							}
							else if(SLOT2.isSelected()) 
							{    SLOT1.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
							}
							else if(SLOT3.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
							}
							else if(SLOT4.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT5.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
								
							}
							else if(SLOT5.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
								
							}
							else if(SLOT7.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT8.setSelected(false);
								SLOT9.setSelected(false);
							}
							else if(SLOT8.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT7.setSelected(false);
								SLOT9.setSelected(false);
								
							}
							else if(SLOT9.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
							}
						}
					}
				}
		});
		SLOT6.setBounds(479, 229, 125, 23);
		contentPane.add(SLOT6);
		
		SLOT4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(SLOT4.isSelected())
				{if(SLOT1.isSelected())
					{    SLOT2.setSelected(false);
						SLOT3.setSelected(false);
						SLOT5.setSelected(false);
						SLOT6.setSelected(false);
						SLOT7.setSelected(false);
						SLOT8.setSelected(false);
						SLOT9.setSelected(false);
					}
					else if(SLOT2.isSelected()) 
					{   SLOT1.setSelected(false);
					    SLOT3.setSelected(false);
						SLOT5.setSelected(false);
						SLOT6.setSelected(false);
						SLOT7.setSelected(false);
						SLOT8.setSelected(false);
						SLOT9.setSelected(false);
					}
					else if(SLOT5.isSelected()) 
					{  SLOT1.setSelected(false);
						SLOT2.setSelected(false);
						SLOT3.setSelected(false);
						SLOT6.setSelected(false);
						SLOT7.setSelected(false);
						SLOT8.setSelected(false);
						SLOT9.setSelected(false);
					}
					else if(SLOT6.isSelected()) 
					{ 
						SLOT1.setSelected(false);
						SLOT2.setSelected(false);
						SLOT3.setSelected(false);
						SLOT5.setSelected(false);
						SLOT7.setSelected(false);
						SLOT8.setSelected(false);
						SLOT9.setSelected(false);	
					}
					else if(SLOT7.isSelected()) 
					{   SLOT1.setSelected(false);
						SLOT2.setSelected(false);
						SLOT3.setSelected(false);
						SLOT5.setSelected(false);
						SLOT6.setSelected(false);
						SLOT8.setSelected(false);
						SLOT9.setSelected(false);
					}
					else if(SLOT8.isSelected()) 
					{   SLOT1.setSelected(false);
						SLOT2.setSelected(false);
						SLOT3.setSelected(false);
						SLOT5.setSelected(false);
						SLOT6.setSelected(false);
						SLOT7.setSelected(false);
						SLOT9.setSelected(false);
					}
					else if(SLOT9.isSelected()) 
					{   SLOT1.setSelected(false);
						SLOT2.setSelected(false);
						SLOT3.setSelected(false);
						SLOT5.setSelected(false);
						SLOT6.setSelected(false);
						SLOT7.setSelected(false);
						SLOT8.setSelected(false);
					}
				}	
			}
		});
		SLOT4.setBounds(252, 353, 136, 23);
		contentPane.add(SLOT4);
		SLOT9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 {if(SLOT9.isSelected())
						{if(SLOT2.isSelected())
							{  SLOT1.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
							}
							else if(SLOT3.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
							    SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
								}
							else if(SLOT4.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
                             }
							else if(SLOT5.isSelected()) 
							{    SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
								}
							else if(SLOT6.isSelected()) 
							{    SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT7.setSelected(false);
								SLOT8.setSelected(false);
}
							else if(SLOT7.isSelected()) 
							{   SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
					            SLOT8.setSelected(false);
                             }
							else if(SLOT8.isSelected()) 
							{    SLOT1.setSelected(false);
								SLOT2.setSelected(false);
								SLOT3.setSelected(false);
								SLOT4.setSelected(false);
								SLOT5.setSelected(false);
								SLOT6.setSelected(false);
								SLOT7.setSelected(false);
                             }
		                       else if(SLOT1.isSelected()) 
									{  SLOT2.setSelected(false);
										SLOT3.setSelected(false);
										SLOT4.setSelected(false);
										SLOT5.setSelected(false);
										SLOT6.setSelected(false);
										SLOT7.setSelected(false);
										SLOT8.setSelected(false);
									}
						}	
				    }
				 }
		});
		SLOT9.setBounds(483, 353, 121, 23);
		contentPane.add(SLOT9);
		 
		SLOT5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(SLOT5.isSelected())
				{if(SLOT1.isSelected())
					{SLOT2.setSelected(false);
						SLOT3.setSelected(false);
						SLOT4.setSelected(false);
						SLOT6.setSelected(false);
						SLOT7.setSelected(false);
						SLOT8.setSelected(false);
						SLOT9.setSelected(false);
					}
					else if(SLOT2.isSelected()) 
					{   SLOT1.setSelected(false);
					    SLOT3.setSelected(false);
					    SLOT4.setSelected(false);
						SLOT6.setSelected(false);
						SLOT7.setSelected(false);
						SLOT8.setSelected(false);
						SLOT9.setSelected(false);
					}
					else if(SLOT3.isSelected()) 
					{SLOT1.setSelected(false);
						SLOT2.setSelected(false);
						SLOT4.setSelected(false);
						SLOT6.setSelected(false);
						SLOT7.setSelected(false);
						SLOT8.setSelected(false);
						SLOT9.setSelected(false);
					}
					else if(SLOT6.isSelected()) 
					{ 
						SLOT1.setSelected(false);
						SLOT2.setSelected(false);
						SLOT3.setSelected(false);
						SLOT4.setSelected(false);
						SLOT7.setSelected(false);
						SLOT8.setSelected(false);
						SLOT9.setSelected(false);	
					}
					else if(SLOT7.isSelected()) 
					{   SLOT1.setSelected(false);
						SLOT2.setSelected(false);
						SLOT3.setSelected(false);
						SLOT4.setSelected(false);
						SLOT6.setSelected(false);
						SLOT8.setSelected(false);
						SLOT9.setSelected(false);
					}
					else if(SLOT8.isSelected()) 
					{   SLOT1.setSelected(false);
						SLOT2.setSelected(false);
						SLOT3.setSelected(false);
						SLOT4.setSelected(false);
						SLOT6.setSelected(false);
						SLOT7.setSelected(false);
						SLOT9.setSelected(false);
					}
					else if(SLOT9.isSelected()) 
					{   SLOT1.setSelected(false);
						SLOT2.setSelected(false);
						SLOT3.setSelected(false);
						SLOT4.setSelected(false);
						SLOT6.setSelected(false);
						SLOT7.setSelected(false);
						SLOT8.setSelected(false);
					}
				}	
			}	
		});
		SLOT5.setBounds(252, 394, 136, 23);
		contentPane.add(SLOT5);
		JButton SUBMIT = new JButton("SUMIT");
		SUBMIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text1=text.getText();
				 try { 
					 sms jo =new sms();
					jo.setVisible(true);
					 BufferedWriter writer = new BufferedWriter(
                      new FileWriter(file, true)  //Set true for append mode
					);  
                 writer.newLine();  
                 writer.write(text1);
                 writer.close();
			        } 
			        catch (Exception e1) { 
			         System.out.println(e1); 
			        } 
			}
		});
		SUBMIT.setForeground(new Color(60, 179, 113));
		SUBMIT.setBackground(new Color(0, 0, 0));
		SUBMIT.setFont(new Font("Mongolian Baiti", Font.BOLD, 11));
		SUBMIT.setBounds(595, 616, 89, 23);
		contentPane.add(SUBMIT);
		
		JLabel lblNewLabel_1 = new JLabel("NOTE : A TEAM CAN CHOOSE MAXIMUM 2 SLOTS PER A DAY.");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setBounds(252, 434, 422, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PUT TEAM'S NAME IN A BLOCK LATTER ");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_2.setBounds(357, 38, 266, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton SLOT = new JButton("Slot :");
		SLOT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String slot=null;
				 if(SLOT1.isSelected())
					{
						slot="slot 1 is booked";
					}
				 else if(SLOT2.isSelected())
					{
						slot="slot 2 is booked";
					}
                 else if(SLOT3.isSelected()) 
					{
						slot="slot 3 is booked";
					}
					else if(SLOT4.isSelected()) 
					{
						slot="slot 4 is booked";
					}
					else if(SLOT5.isSelected()) 
					{
                 slot="slot  5 is booked";
					}
					else if(SLOT6.isSelected()) 
					{
					slot="slot 6 is booked";
					}
					else if(SLOT7.isSelected()) 
					{
						slot="slot  7 is booked";
					}
					else if(SLOT8.isSelected()) 
					{
						slot="slot  8 is booked";
						
					}
					else if(SLOT9.isSelected()) 
					{
						
					slot="slot 9 is booked";	
					}
					if(SLOT1.isSelected())
					{if(SLOT2.isSelected())
						{
							slot="slot 1 & slot 2 is booked";
						}
	                     else if(SLOT3.isSelected()) 
						{
							slot="slot 2 & slot 3 is booked";
						}
						else if(SLOT4.isSelected()) 
						{
							slot="slot 3 & slot 4 is booked";
						}
						else if(SLOT5.isSelected()) 
						{
	                     slot="slot 2 & slot 5 is booked";
						}
						else if(SLOT6.isSelected()) 
						{
						 slot="slot 2 & slot 6 is booked";
						}
						else if(SLOT7.isSelected()) 
						{
						 slot="slot 2 & slot 7 is booked";
						}
						else if(SLOT8.isSelected()) 
						{
							slot="slot2 & slot 8 is booked";
						}
						else if(SLOT9.isSelected()) 
						{
						slot="slot 2 & slot 9 is booked";	
						}
						}
					if(SLOT2.isSelected())
					{
						if(SLOT1.isSelected())
						{
							slot="slot 2 & slot 1 is booked";
						}
	                     else if(SLOT3.isSelected()) 
						{
							slot="slot 2 & slot 3 is booked";
						}
						else if(SLOT4.isSelected()) 
						{
							slot="slot 2 & slot 4 is booked";
						}
						else if(SLOT5.isSelected()) 
						{
	                     slot="slot 2 & slot 5 is booked";
						}
						else if(SLOT6.isSelected()) 
						{slot="slot 2 & slot 6 is booked";
						}
						else if(SLOT7.isSelected()) 
						{
							slot="slot 2 & slot 7 is booked";
						}
						else if(SLOT8.isSelected()) 
						{
							slot="slot 2 & slot 8 is booked";
						}
						else if(SLOT9.isSelected()) 
						{
							slot="slot 2 & slot 9 is booked";	
						}
					}
				 
				 if(SLOT3.isSelected())
					{
					 if(SLOT1.isSelected())
						{
							slot="slot 3 & slot 1 is booked";
						}
	                     else if(SLOT2.isSelected()) 
						{
							slot="slot 2 & slot 3 is booked";
						}
						else if(SLOT4.isSelected()) 
						{
							slot="slot 3 & slot 4 is booked";
						}
						else if(SLOT5.isSelected()) 
						{
	                     slot="slot 3 & slot 5 is booked";
						}
						else if(SLOT6.isSelected()) 
						{slot="slot 3 & slot 6 is booked";
						}
						else if(SLOT7.isSelected()) 
						{slot="slot 3 & slot 7 is booked";
						}
						else if(SLOT8.isSelected()) 
						{
							slot="slot 3 & slot 8 is booked";
							
						}
						else if(SLOT9.isSelected()) 
						{
							slot="slot 3 & slot 9 is booked";	
						}
					}
            
				 if(SLOT4.isSelected())
					{if(SLOT1.isSelected())
						{
							slot="slot 4 & slot 1 is booked";
						}
	                     else if(SLOT3.isSelected()) 
						{
							slot="slot 4 & slot 3 is booked";
						}
						else if(SLOT2.isSelected()) 
						{
							slot="slot 2 & slot 4 is booked";
						}
						else if(SLOT5.isSelected()) 
						{
	                     slot="slot 4 & slot 5 is booked";
						}
						else if(SLOT6.isSelected()) 
						{
						slot="slot 4 & slot 6 is booked";
						}
						else if(SLOT7.isSelected()) 
						{slot="slot 4 & slot 7 is booked";
						}
						else if(SLOT8.isSelected()) 
						{
							slot="slot 4 & slot 8 is booked";
						}
						else if(SLOT9.isSelected()) 
						{
						slot="slot 4 & slot 9 is booked";	
						}
					}
				 if(SLOT5.isSelected())
				  {
					if(SLOT1.isSelected())
					{
						slot="Slot 5 & Slot 1 is booked ";
					}
					else if(SLOT2.isSelected()) 
					{   
					 slot="Slot 5 & Slot 2 is booked ";
					}
					else if(SLOT3.isSelected()) 
					{
						slot="Slot 5 & Slot 3 is booked ";
					}
					else if(SLOT6.isSelected()) 
					{ 
						slot="Slot 5 & Slot 6 is booked ";
					}
					else if(SLOT7.isSelected()) 
					{  
						slot="Slot 5 & Slot 7 is booked ";
					}
					else if(SLOT8.isSelected()) 
					{   
                       slot="Slot 5 & Slot 8 is booked ";
					}
					else if(SLOT9.isSelected()) 
					{   
                       slot="Slot 5 & Slot 9 is booked ";
					}
					
					 if(SLOT6.isSelected())
						{if(SLOT1.isSelected())
							{
								slot="slot 6 & slot 1 is booked";
							}
		                     else if(SLOT3.isSelected()) 
							{
								slot="slot 6 & slot 3 is booked";
							}
							else if(SLOT4.isSelected()) 
							{
								slot="slot 6 & slot 4 is booked";
							}
							else if(SLOT5.isSelected()) 
							{
		                     slot="slot 6 & slot 5 is booked";
							}
							else if(SLOT2.isSelected()) 
							{slot="slot 2 & slot 6 is booked";
							}
							else if(SLOT7.isSelected()) 
							{
								slot="slot 6 & slot 7 is booked";
							}
							else if(SLOT8.isSelected()) 
							{
								slot="slot 6 & slot 8 is booked";
							}
							else if(SLOT9.isSelected()) 
							{
								slot="slot 6 & slot 9 is booked";	
							}
						}
					 
					 if(SLOT7.isSelected())
						{
						 if(SLOT1.isSelected())
							{
								slot="slot 7 & slot 1 is booked";
							}
		                     else if(SLOT3.isSelected()) 
							{
								slot="slot 7 & slot 3 is booked";
							}
							else if(SLOT4.isSelected()) 
							{
								slot="slot 7 & slot 4 is booked";
							}
							else if(SLOT5.isSelected()) 
							{
		                     slot="slot 7 & slot 5 is booked";
							}
							else if(SLOT6.isSelected()) 
							{
								slot="slot 7 & slot 6 is booked";
							}
							else if(SLOT2.isSelected()) 
							{
								slot="slot 7 & slot 2 is booked";
							}
							else if(SLOT8.isSelected()) 
							{
								slot="slot 7 & slot 8 is booked";
							}
							else if(SLOT9.isSelected()) 
							{
								slot="slot 7 & slot 9 is booked";	
							}
							
						}
			    }	
				 if(SLOT8.isSelected())
					{
					 if(SLOT1.isSelected())
						{
							slot="slot 8 & slot 1 is booked";
						}
	                     else if(SLOT3.isSelected()) 
						{
							slot="slot 8 & slot 3 is booked";
						}
						else if(SLOT4.isSelected()) 
						{
							slot="slot 8 & slot 4 is booked";
						}
						else if(SLOT5.isSelected()) 
						{
	                     slot="slot 8 & slot 5 is booked";
						}
						else if(SLOT6.isSelected()) 
						{
							slot="slot 8 & slot 6 is booked";
						}
						else if(SLOT7.isSelected()) 
						{
							slot="slot 8 & slot 7 is booked";
						}
						else if(SLOT2.isSelected()) 
						{
							slot="slot 8 & slot 8 is booked";
						}
						else if(SLOT9.isSelected()) 
						{
							slot="slot 8 & slot 9 is booked";	
						}
						
					}
				  if(SLOT9.isSelected())
					{if(SLOT1.isSelected())
						{
							slot="slot 9 & slot 1 is booked";
						}
	                     else if(SLOT3.isSelected()) 
						{
							slot="slot 9 & slot 3 is booked";
						}
						else if(SLOT4.isSelected()) 
						{
							slot="slot 9 & slot 4 is booked";
						}
						else if(SLOT5.isSelected()) 
						{
	                     slot="slot 9 & slot 5 is booked";
						}
						else if(SLOT6.isSelected()) 
						{slot="slot 9 & slot 6 is booked";
						}
						else if(SLOT7.isSelected()) 
						{slot="slot 2 & slot 7 is booked";
						}
						else if(SLOT8.isSelected()) 
						{
							slot="slot 2 & slot 8 is booked";
							
						}
						else if(SLOT2.isSelected()) 
						{
							
						slot="slot 2 & slot 9 is booked";	
						}
					}
				 String slot1=slot;
				System.out.println(slot);
			        try { 
			        	BufferedWriter writer = new BufferedWriter(
                        new FileWriter(file, true)  
			        			);  
			        	writer.newLine();   
                    writer.write(slot);
                    writer.close();
			        } 
			        catch (Exception e1) { 
			            System.out.println(e1); 
			        } 
			}
		});
		SLOT.setFont(new Font("Mongolian Baiti", Font.BOLD, 13));
		SLOT.setBounds(83, 229, 136, 23);
		contentPane.add(SLOT);
		}
}