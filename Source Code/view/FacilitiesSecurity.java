package view;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class FacilitiesSecurity extends JPanel {

	public JPanel panelSecurity;
	private JLabel titleSecurity;
	
	public JScrollPane securityEmployeeTableScrollPane;
	public JTable securityTable;
	public String[] column_headers= {"Name","Contract start date","Job description","Salary"};
	public String[][] securityToDisplay=new String[100][4];
	
	public JButton btnAddSecurity;
	public JButton btnRemoveSecurity;
	
	private JLabel lblAddSecutirySecurityName;
	public JTextField tf_AddSecuritySecurityName;
	private JLabel lblAddSecurityContractStart;
	public JTextField tf_AddSecurityContractStart;
	private JLabel lblAddSecuritySalary;
	public JTextField tf_AddSecuritySalary;
	private JLabel lblAddSecurityJobDescription;
	public JTextField tf_AddSecurityJobDescription;
	public JButton btnAddSecurityFinish;
	public JButton btnAddSecurityCancel;
	
	private List<JComponent> addSecurityComponents = new ArrayList<JComponent>();
	private List<JComponent> removeSecurityComponents = new ArrayList<JComponent>();
	private JLabel lblRemoveSecuritySecurityName;
	public JComboBox<String> cb_RemoveSecuritySecurityName;
	public JButton btnRemoveSecurityFinish;
	private JButton btnRemoveSecurityCancel;

	private final int lineSpacing = 7;
	private final int boxSpacing = 12;
	public JDateChooser dateChooserContractStart;
	
	
	public FacilitiesSecurity(){
		
		panelSecurity = new JPanel();
		panelSecurity.setBorder(null);
		panelSecurity.setBackground(SystemColor.control);
		panelSecurity.setBounds(0, 0, 600, 617);
		panelSecurity.setLayout(null);
		panelSecurity.setVisible(true);
		
		titleSecurity = new JLabel("SECURITY");
		titleSecurity.setAlignmentY(Component.TOP_ALIGNMENT);
		titleSecurity.setVerticalAlignment(SwingConstants.TOP);
		titleSecurity.setBounds(30, 22, 346, 76);
		titleSecurity.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleSecurity.setForeground(UI_Elements.color_mainBackgroundColor);
		titleSecurity.setFont(UI_Elements.font_AgencySubPanelTitle);
		panelSecurity.add(titleSecurity);
		
	
		//Sponsor table from DB
		securityEmployeeTableScrollPane = new JScrollPane();
		securityEmployeeTableScrollPane.setBounds(titleSecurity.getBounds().x, titleSecurity.getBounds().y+titleSecurity.getBounds().height-20, panelSecurity.getBounds().width-titleSecurity.getBounds().x-40, 275);
		panelSecurity.add(securityEmployeeTableScrollPane);
		
		securityTable = new JTable(securityToDisplay,column_headers);
		securityEmployeeTableScrollPane.setViewportView(securityTable);
		securityTable.setEnabled(false);
		//
		
		btnAddSecurity = new JButton("ADD SECURITY");
		btnAddSecurity.setFocusPainted(false);
		btnAddSecurity.setRequestFocusEnabled(false);
		btnAddSecurity.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddSecurity.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddSecurity.setForeground(Color.WHITE);
		btnAddSecurity.setOpaque(true);
		btnAddSecurity.setBorder(null);
		btnAddSecurity.setFont(UI_Elements.font_AgencyBodyButton);
		btnAddSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
		btnAddSecurity.setBounds(securityEmployeeTableScrollPane.getBounds().x, securityEmployeeTableScrollPane.getBounds().y+securityEmployeeTableScrollPane.getBounds().height+20, securityEmployeeTableScrollPane.getBounds().width/2 - 5, 30);
		btnAddSecurity.setSelected(false);
		panelSecurity.add(btnAddSecurity);
		btnAddSecurity.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddSecurity.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(btnAddSecurity.isSelected() == true)
		    	{
		    		btnAddSecurity.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnAddSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
		    	}
		    }
		} );
		
		btnRemoveSecurity = new JButton("REMOVE SECURITY");
		btnRemoveSecurity.setFocusPainted(false);
		btnRemoveSecurity.setRequestFocusEnabled(false);
		btnRemoveSecurity.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemoveSecurity.setHorizontalAlignment(SwingConstants.CENTER);
		btnRemoveSecurity.setForeground(Color.WHITE);
		btnRemoveSecurity.setOpaque(true);
		btnRemoveSecurity.setBorder(null);
		btnRemoveSecurity.setFont(UI_Elements.font_AgencyBodyButton);
		btnRemoveSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
		btnRemoveSecurity.setBounds(securityEmployeeTableScrollPane.getBounds().x + securityEmployeeTableScrollPane.getBounds().width - btnAddSecurity.getBounds().width, btnAddSecurity.getBounds().y, securityEmployeeTableScrollPane.getBounds().width/2 - 5, btnAddSecurity.getBounds().height);
		btnRemoveSecurity.setSelected(false);
		panelSecurity.add(btnRemoveSecurity);
		btnRemoveSecurity.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnRemoveSecurity.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(btnRemoveSecurity.isSelected() == true)
		    	{
		    		btnRemoveSecurity.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnRemoveSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
		    	}
		    }
		} );
		
		lblAddSecutirySecurityName = new JLabel("Security Name:");
		lblAddSecutirySecurityName.setBorder(null);
		lblAddSecutirySecurityName.setForeground(UI_Elements.color_mainBackgroundColor);
		lblAddSecutirySecurityName.setFont(UI_Elements.font_bodyLabel);
		lblAddSecutirySecurityName.setBounds(btnAddSecurity.getBounds().x, btnAddSecurity.getBounds().y+btnAddSecurity.getBounds().height+20, 109, 26);
		panelSecurity.add(lblAddSecutirySecurityName);

		tf_AddSecuritySecurityName = new JTextField();
		tf_AddSecuritySecurityName.setDisabledTextColor(Color.BLACK);
		tf_AddSecuritySecurityName.setEnabled(true);
		tf_AddSecuritySecurityName.setEditable(false);
		tf_AddSecuritySecurityName.setHorizontalAlignment(SwingConstants.LEFT);
		tf_AddSecuritySecurityName.setFont(UI_Elements.font_bodyFillText);
		tf_AddSecuritySecurityName.setBounds(lblAddSecutirySecurityName.getBounds().x + lblAddSecutirySecurityName.getBounds().width + 12, lblAddSecutirySecurityName.getBounds().y, securityEmployeeTableScrollPane.getBounds().width-12-lblAddSecutirySecurityName.getBounds().width, 20);
		panelSecurity.add(tf_AddSecuritySecurityName);
		tf_AddSecuritySecurityName.setColumns(10);
		
		lblAddSecurityJobDescription = new JLabel("Job Description:");
		lblAddSecurityJobDescription.setBorder(null);
		lblAddSecurityJobDescription.setForeground(UI_Elements.color_mainBackgroundColor);
		lblAddSecurityJobDescription.setFont(UI_Elements.font_bodyLabel);
		lblAddSecurityJobDescription.setBounds(lblAddSecutirySecurityName.getBounds().x, lblAddSecutirySecurityName.getBounds().y+lblAddSecutirySecurityName.getBounds().height+lineSpacing, 109, 26);
		panelSecurity.add(lblAddSecurityJobDescription);

		tf_AddSecurityJobDescription = new JTextField();
		tf_AddSecurityJobDescription.setDisabledTextColor(Color.BLACK);
		tf_AddSecurityJobDescription.setEnabled(true);
		tf_AddSecurityJobDescription.setEditable(false);
		tf_AddSecurityJobDescription.setHorizontalAlignment(SwingConstants.LEFT);
		tf_AddSecurityJobDescription.setFont(UI_Elements.font_bodyFillText);
		tf_AddSecurityJobDescription.setBounds(tf_AddSecuritySecurityName.getBounds().x, lblAddSecurityJobDescription.getBounds().y , tf_AddSecuritySecurityName.getBounds().width, tf_AddSecuritySecurityName.getBounds().height);
		panelSecurity.add(tf_AddSecurityJobDescription);
		tf_AddSecurityJobDescription.setColumns(10);
		
		lblAddSecurityContractStart = new JLabel("Start Date:");
		lblAddSecurityContractStart.setBorder(null);
		lblAddSecurityContractStart.setForeground(UI_Elements.color_mainBackgroundColor);
		lblAddSecurityContractStart.setFont(UI_Elements.font_bodyLabel);
		lblAddSecurityContractStart.setBounds(lblAddSecurityJobDescription.getBounds().x, lblAddSecurityJobDescription.getBounds().y+lblAddSecurityJobDescription.getBounds().height+lineSpacing, 70, 26);
		panelSecurity.add(lblAddSecurityContractStart);
	
		tf_AddSecurityContractStart = new JTextField();
		tf_AddSecurityContractStart.setDisabledTextColor(Color.BLACK);
		tf_AddSecurityContractStart.setEnabled(true);
		tf_AddSecurityContractStart.setEditable(false);
		tf_AddSecurityContractStart.setHorizontalAlignment(SwingConstants.LEFT);
		tf_AddSecurityContractStart.setFont(UI_Elements.font_bodyFillText);
		tf_AddSecurityContractStart.setBounds(lblAddSecurityContractStart.getBounds().x + lblAddSecurityContractStart.getBounds().width + boxSpacing, lblAddSecurityContractStart.getBounds().y , 180, 20);
		panelSecurity.add(tf_AddSecurityContractStart);
		tf_AddSecurityContractStart.setColumns(10);
		tf_AddSecurityContractStart.setVisible(false);
		
		dateChooserContractStart = new JDateChooser();
		dateChooserContractStart.setBounds(lblAddSecurityContractStart.getBounds().x + lblAddSecurityContractStart.getBounds().width + boxSpacing, lblAddSecurityContractStart.getBounds().y , 170, 20);
		panelSecurity.add(dateChooserContractStart);
		dateChooserContractStart.setDateFormatString("dd/MM/yyyy");

		tf_AddSecuritySalary = new JTextField();
		tf_AddSecuritySalary.setDisabledTextColor(Color.BLACK);
		tf_AddSecuritySalary.setEnabled(true);
		tf_AddSecuritySalary.setEditable(false);
		tf_AddSecuritySalary.setHorizontalAlignment(SwingConstants.LEFT);
		tf_AddSecuritySalary.setFont(UI_Elements.font_bodyFillText);
		tf_AddSecuritySalary.setBounds(securityEmployeeTableScrollPane.getBounds().x + securityEmployeeTableScrollPane.getBounds().width - tf_AddSecurityContractStart.getBounds().width, lblAddSecurityContractStart.getBounds().y , tf_AddSecurityContractStart.getBounds().width, 20);
		panelSecurity.add(tf_AddSecuritySalary);
		tf_AddSecuritySalary.setColumns(10);
		
		lblAddSecuritySalary = new JLabel("Salary:");
		lblAddSecuritySalary.setBorder(null);
		lblAddSecuritySalary.setForeground(UI_Elements.color_mainBackgroundColor);
		lblAddSecuritySalary.setFont(UI_Elements.font_bodyLabel);
		lblAddSecuritySalary.setBounds(tf_AddSecuritySalary.getBounds().x - lblAddSecurityContractStart.getBounds().width + boxSpacing, tf_AddSecurityContractStart.getBounds().y, lblAddSecurityContractStart.getBounds().width-20, 26);
		panelSecurity.add(lblAddSecuritySalary);
		
		btnAddSecurityFinish = new JButton("FINISH");
		btnAddSecurityFinish.setFocusPainted(false);
		btnAddSecurityFinish.setRequestFocusEnabled(false);
		btnAddSecurityFinish.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddSecurityFinish.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddSecurityFinish.setForeground(Color.WHITE);
		btnAddSecurityFinish.setOpaque(true);
		btnAddSecurityFinish.setBorder(null);
		btnAddSecurityFinish.setFont(UI_Elements.font_AgencyActionButton);
		btnAddSecurityFinish.setBackground(UI_Elements.color_mainBackgroundColor);
		btnAddSecurityFinish.setBounds(221, lblAddSecurityContractStart.getBounds().y+lblAddSecurityContractStart.getBounds().height+12, 75, 25);
		btnAddSecurityFinish.setSelected(false);
		panelSecurity.add(btnAddSecurityFinish);
		btnAddSecurityFinish.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddSecurityFinish.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnAddSecurityFinish.setBackground(UI_Elements.color_mainBackgroundColor);
		    }
		} );
		
		btnAddSecurityCancel = new JButton("CANCEL");
		btnAddSecurityCancel.setFocusPainted(false);
		btnAddSecurityCancel.setRequestFocusEnabled(false);
		btnAddSecurityCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddSecurityCancel.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddSecurityCancel.setForeground(Color.WHITE);
		btnAddSecurityCancel.setOpaque(true);
		btnAddSecurityCancel.setBorder(null);
		btnAddSecurityCancel.setFont(UI_Elements.font_AgencyActionButton);
		btnAddSecurityCancel.setBackground(UI_Elements.color_mainBackgroundColor);
		btnAddSecurityCancel.setBounds(btnAddSecurityFinish.getBounds().x + btnAddSecurityFinish.getBounds().width + 7, btnAddSecurityFinish.getBounds().y, 75, 25);
		btnAddSecurityCancel.setSelected(false);
		panelSecurity.add(btnAddSecurityCancel);
		btnAddSecurityCancel.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddSecurityCancel.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnAddSecurityCancel.setBackground(UI_Elements.color_mainBackgroundColor);
		    }
		} );
		
		addSecurityComponents.add(lblAddSecutirySecurityName);
		addSecurityComponents.add(tf_AddSecuritySecurityName);
		addSecurityComponents.add(lblAddSecurityContractStart);
		addSecurityComponents.add(dateChooserContractStart);
		addSecurityComponents.add(lblAddSecuritySalary);
		addSecurityComponents.add(tf_AddSecuritySalary);
		addSecurityComponents.add(lblAddSecurityJobDescription);
		addSecurityComponents.add(tf_AddSecurityJobDescription);
		addSecurityComponents.add(btnAddSecurityFinish);
		addSecurityComponents.add(btnAddSecurityCancel);
		turnOffAddSecurityComponents();
		
		//Remove Sponsor
		lblRemoveSecuritySecurityName = new JLabel("Security Name:");
		lblRemoveSecuritySecurityName.setBorder(null);
		lblRemoveSecuritySecurityName.setForeground(UI_Elements.color_mainBackgroundColor);
		lblRemoveSecuritySecurityName.setFont(UI_Elements.font_bodyLabel);
		lblRemoveSecuritySecurityName.setBounds(btnAddSecurity.getBounds().x, btnAddSecurity.getBounds().y+btnAddSecurity.getBounds().height+20, 109, 26);
		panelSecurity.add(lblRemoveSecuritySecurityName);

		cb_RemoveSecuritySecurityName = new JComboBox<String>();
		cb_RemoveSecuritySecurityName.setEnabled(true);
		cb_RemoveSecuritySecurityName.setEditable(false);
		cb_RemoveSecuritySecurityName.setFont(UI_Elements.font_bodyFillText);
		cb_RemoveSecuritySecurityName.setBounds(lblAddSecutirySecurityName.getBounds().x + lblAddSecutirySecurityName.getBounds().width + 12, lblAddSecutirySecurityName.getBounds().y, securityEmployeeTableScrollPane.getBounds().width-12-lblAddSecutirySecurityName.getBounds().width, 25);
		panelSecurity.add(cb_RemoveSecuritySecurityName);

		btnRemoveSecurityFinish = new JButton("FINISH");
		btnRemoveSecurityFinish.setFocusPainted(false);
		btnRemoveSecurityFinish.setRequestFocusEnabled(false);
		btnRemoveSecurityFinish.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemoveSecurityFinish.setHorizontalAlignment(SwingConstants.CENTER);
		btnRemoveSecurityFinish.setForeground(Color.WHITE);
		btnRemoveSecurityFinish.setOpaque(true);
		btnRemoveSecurityFinish.setBorder(null);
		btnRemoveSecurityFinish.setFont(UI_Elements.font_AgencyActionButton);
		btnRemoveSecurityFinish.setBackground(UI_Elements.color_mainBackgroundColor);
		btnRemoveSecurityFinish.setBounds(221, lblRemoveSecuritySecurityName.getBounds().y+lblRemoveSecuritySecurityName.getBounds().height+12, 75, 25);
		btnRemoveSecurityFinish.setSelected(false);
		panelSecurity.add(btnRemoveSecurityFinish);
		btnRemoveSecurityFinish.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnRemoveSecurityFinish.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnRemoveSecurityFinish.setBackground(UI_Elements.color_mainBackgroundColor);
		    }
		} );
		
		btnRemoveSecurityCancel = new JButton("CANCEL");
		btnRemoveSecurityCancel.setFocusPainted(false);
		btnRemoveSecurityCancel.setRequestFocusEnabled(false);
		btnRemoveSecurityCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemoveSecurityCancel.setHorizontalAlignment(SwingConstants.CENTER);
		btnRemoveSecurityCancel.setForeground(Color.WHITE);
		btnRemoveSecurityCancel.setOpaque(true);
		btnRemoveSecurityCancel.setBorder(null);
		btnRemoveSecurityCancel.setFont(UI_Elements.font_AgencyActionButton);
		btnRemoveSecurityCancel.setBackground(UI_Elements.color_mainBackgroundColor);
		btnRemoveSecurityCancel.setBounds(btnAddSecurityFinish.getBounds().x + btnAddSecurityFinish.getBounds().width + 7, btnRemoveSecurityFinish.getBounds().y, 75, 25);
		btnRemoveSecurityCancel.setSelected(false);
		panelSecurity.add(btnRemoveSecurityCancel);
		btnRemoveSecurityCancel.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnRemoveSecurityCancel.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnRemoveSecurityCancel.setBackground(UI_Elements.color_mainBackgroundColor);
		    }
		} );

		removeSecurityComponents.add(lblRemoveSecuritySecurityName);
		removeSecurityComponents.add(cb_RemoveSecuritySecurityName);
		removeSecurityComponents.add(btnRemoveSecurityFinish);
		removeSecurityComponents.add(btnRemoveSecurityCancel);
		turnOffRemoveSecurityComponents();

		
		//Action Listeners
		btnAddSecurity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf_AddSecuritySecurityName.setEditable(true);
				tf_AddSecurityJobDescription.setEditable(true);
				tf_AddSecurityContractStart.setEditable(true);
				tf_AddSecuritySalary.setEditable(true);
				
				if(btnAddSecurity.isSelected() == false)
				{
					btnAddSecurity.setSelected(true);
					btnRemoveSecurity.setSelected(false);
					turnOnAddSecurityComponents();
					turnOffRemoveSecurityComponents();
					btnAddSecurity.setBackground(UI_Elements.color_panelBodyButtonSelected);
					
					btnRemoveSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
				}
				else
				{
					btnAddSecurity.setSelected(false);
					turnOffAddSecurityComponents();
					btnAddSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
					btnRemoveSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
				}
			}
		});
		
		btnRemoveSecurity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnRemoveSecurity.isSelected() == false)
				{
					btnAddSecurity.setSelected(false);
					btnRemoveSecurity.setSelected(true);
					turnOffAddSecurityComponents();
					turnOnRemoveSecurityComponents();
					btnAddSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
					btnRemoveSecurity.setBackground(UI_Elements.color_panelBodyButtonSelected);
				}
				else
				{
					turnOffRemoveSecurityComponents();
					btnRemoveSecurity.setSelected(false);
					btnAddSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
					btnRemoveSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
				}
			}
		});
		
		btnAddSecurityFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				turnOffAddSecurityComponents();
				btnAddSecurity.setSelected(false);
				btnRemoveSecurity.setSelected(false);
				btnAddSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
				btnRemoveSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
			}
		});
		
		btnAddSecurityCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				turnOffAddSecurityComponents();
				btnAddSecurity.setSelected(false);
				btnRemoveSecurity.setSelected(false);
				btnAddSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
				btnRemoveSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
				tf_AddSecuritySecurityName.setText("");
				tf_AddSecurityJobDescription.setText("");
				tf_AddSecurityContractStart.setText("");
				tf_AddSecuritySalary.setText("");
			}
		});
		
		btnRemoveSecurityFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				turnOffRemoveSecurityComponents();
				btnAddSecurity.setSelected(false);
				btnRemoveSecurity.setSelected(false);
				btnAddSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
				btnRemoveSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
			}
		});
		
		btnRemoveSecurityCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				turnOffRemoveSecurityComponents();
				btnAddSecurity.setSelected(false);
				btnRemoveSecurity.setSelected(false);
				btnAddSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
				btnRemoveSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
				
			}
		});
		
		
	}
	
	
	private void turnOnAddSecurityComponents()
	{
		for(JComponent component : addSecurityComponents)
		{
			component.setVisible(true);
		}
	}
	
	private void turnOffAddSecurityComponents()
	{
		for(JComponent component : addSecurityComponents)
		{
			component.setVisible(false);
		}
	}
	
	
	private void turnOnRemoveSecurityComponents()
	{
		for(JComponent component : removeSecurityComponents)
		{
			component.setVisible(true);
		}
	}
	
	private void turnOffRemoveSecurityComponents()
	{
		for(JComponent component : removeSecurityComponents)
		{
			component.setVisible(false);
		}
	}
}


