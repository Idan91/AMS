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
public class FacilitiesMaintenance extends JPanel {

	public JPanel panelMaintenance;
	private JLabel titleMaintenance;
	
	public JScrollPane maintenanceEmployeeTableScrollPane;
	public JTable maintenanceTable;
	public String[] colum_headers= {"Name","Maintenance start date","Maintenance reason","Priority"};
	public String[][] maintenanceToDisplay=new String[100][4];
	
	public JButton btnAddMaintenance;
	public JButton btnRemoveMaintenance;
	
	private JLabel lblAddmAddMaintenanceName;
	public JTextField tf_AddMaintenanceName;
	private JLabel lblAddMaintenanceStartDate;
	public JTextField tf_AddMaintenanceStartDate;
	private JLabel lblAddMaintenancePriority;
	public JTextField tf_AddMaintenancePriority;
	private JLabel lblAddMaintenanceReason;
	public JTextField tf_AddMaintenanceReason;
	public JButton btnAddMaintenanceFinish;
	public JButton btnAddMaintenanceCancel;
	
	private List<JComponent> addMaintenanceComponents = new ArrayList<JComponent>();
	private List<JComponent> removeMaintenanceComponents = new ArrayList<JComponent>();
	private JLabel lblRemoveMaintenanceMaintenanceName;
	public JComboBox<String> cb_RemoveMaintenanceMaintenanceName;
	public JButton btnRemoveMaintenanceFinish;
	private JButton btnRemoveMaintenanceCancel;
	
	private int lineSpacing = 7;
	private int boxSpacing = 12;
	public JDateChooser dateChooserMaintenanceStartDate;
	
	
	public FacilitiesMaintenance(){
		
		panelMaintenance = new JPanel();
		panelMaintenance.setBorder(null);
		panelMaintenance.setBackground(SystemColor.control);
		panelMaintenance.setBounds(0, 0, 600, 617);
		panelMaintenance.setLayout(null);
		panelMaintenance.setVisible(true);
		
		titleMaintenance = new JLabel("MAINTENANCE");
		titleMaintenance.setAlignmentY(Component.TOP_ALIGNMENT);
		titleMaintenance.setVerticalAlignment(SwingConstants.TOP);
		titleMaintenance.setBounds(30, 22, 346, 76);
		titleMaintenance.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleMaintenance.setForeground(UI_Elements.color_mainBackgroundColor);
		titleMaintenance.setFont(UI_Elements.font_AgencySubPanelTitle);
		panelMaintenance.add(titleMaintenance);
		
	
		//Sponsor table from DB
		maintenanceEmployeeTableScrollPane = new JScrollPane();
		maintenanceEmployeeTableScrollPane.setBounds(titleMaintenance.getBounds().x, titleMaintenance.getBounds().y+titleMaintenance.getBounds().height-20, panelMaintenance.getBounds().width-titleMaintenance.getBounds().x-40, 275);
		panelMaintenance.add(maintenanceEmployeeTableScrollPane);
		
		maintenanceTable = new JTable(maintenanceToDisplay,colum_headers);
		maintenanceEmployeeTableScrollPane.setViewportView(maintenanceTable);
		maintenanceTable.setEnabled(false);
		//
		
		btnAddMaintenance = new JButton("ADD MAINTENANCE");
		btnAddMaintenance.setFocusPainted(false);
		btnAddMaintenance.setRequestFocusEnabled(false);
		btnAddMaintenance.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddMaintenance.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddMaintenance.setForeground(Color.WHITE);
		btnAddMaintenance.setOpaque(true);
		btnAddMaintenance.setBorder(null);
		btnAddMaintenance.setFont(UI_Elements.font_AgencyBodyButton);
		btnAddMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
		btnAddMaintenance.setBounds(maintenanceEmployeeTableScrollPane.getBounds().x, maintenanceEmployeeTableScrollPane.getBounds().y+maintenanceEmployeeTableScrollPane.getBounds().height+20, maintenanceEmployeeTableScrollPane.getBounds().width/2 - 5, 30);
		btnAddMaintenance.setSelected(false);
		panelMaintenance.add(btnAddMaintenance);
		btnAddMaintenance.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddMaintenance.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(btnAddMaintenance.isSelected() == true)
		    	{
		    		btnAddMaintenance.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnAddMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
		    	}
		    }
		} );
		
		btnRemoveMaintenance = new JButton("REMOVE MAINTENANCE");
		btnRemoveMaintenance.setFocusPainted(false);
		btnRemoveMaintenance.setRequestFocusEnabled(false);
		btnRemoveMaintenance.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemoveMaintenance.setHorizontalAlignment(SwingConstants.CENTER);
		btnRemoveMaintenance.setForeground(Color.WHITE);
		btnRemoveMaintenance.setOpaque(true);
		btnRemoveMaintenance.setBorder(null);
		btnRemoveMaintenance.setFont(UI_Elements.font_AgencyBodyButton);
		btnRemoveMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
		btnRemoveMaintenance.setBounds(maintenanceEmployeeTableScrollPane.getBounds().x + maintenanceEmployeeTableScrollPane.getBounds().width - btnAddMaintenance.getBounds().width, btnAddMaintenance.getBounds().y, maintenanceEmployeeTableScrollPane.getBounds().width/2 - 5, btnAddMaintenance.getBounds().height);
		btnRemoveMaintenance.setSelected(false);
		panelMaintenance.add(btnRemoveMaintenance);
		btnRemoveMaintenance.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnRemoveMaintenance.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(btnRemoveMaintenance.isSelected() == true)
		    	{
		    		btnRemoveMaintenance.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnRemoveMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
		    	}
		    }
		} );
		
		lblAddmAddMaintenanceName = new JLabel("Maintenance Name:");
		lblAddmAddMaintenanceName.setBorder(null);
		lblAddmAddMaintenanceName.setForeground(UI_Elements.color_mainBackgroundColor);
		lblAddmAddMaintenanceName.setFont(UI_Elements.font_bodyLabel);
		lblAddmAddMaintenanceName.setBounds(btnAddMaintenance.getBounds().x, btnAddMaintenance.getBounds().y+btnAddMaintenance.getBounds().height+20, 140, 26);
		panelMaintenance.add(lblAddmAddMaintenanceName);

		tf_AddMaintenanceName = new JTextField();
		tf_AddMaintenanceName.setDisabledTextColor(Color.BLACK);
		tf_AddMaintenanceName.setEnabled(true);
		tf_AddMaintenanceName.setEditable(false);
		tf_AddMaintenanceName.setHorizontalAlignment(SwingConstants.LEFT);
		tf_AddMaintenanceName.setFont(UI_Elements.font_bodyFillText);
		tf_AddMaintenanceName.setBounds(lblAddmAddMaintenanceName.getBounds().x + lblAddmAddMaintenanceName.getBounds().width + boxSpacing, lblAddmAddMaintenanceName.getBounds().y, maintenanceEmployeeTableScrollPane.getBounds().width-12-lblAddmAddMaintenanceName.getBounds().width, 20);
		panelMaintenance.add(tf_AddMaintenanceName);
		tf_AddMaintenanceName.setColumns(10);
		
		lblAddMaintenanceReason = new JLabel("Maintenance Reason:");
		lblAddMaintenanceReason.setBorder(null);
		lblAddMaintenanceReason.setForeground(UI_Elements.color_mainBackgroundColor);
		lblAddMaintenanceReason.setFont(UI_Elements.font_bodyLabel);
		lblAddMaintenanceReason.setBounds(lblAddmAddMaintenanceName.getBounds().x, lblAddmAddMaintenanceName.getBounds().y+lblAddmAddMaintenanceName.getBounds().height+lineSpacing, lblAddmAddMaintenanceName.getBounds().width, 26);
		panelMaintenance.add(lblAddMaintenanceReason);

		tf_AddMaintenanceReason = new JTextField();
		tf_AddMaintenanceReason.setDisabledTextColor(Color.BLACK);
		tf_AddMaintenanceReason.setEnabled(true);
		tf_AddMaintenanceReason.setEditable(false);
		tf_AddMaintenanceReason.setHorizontalAlignment(SwingConstants.LEFT);
		tf_AddMaintenanceReason.setFont(UI_Elements.font_bodyFillText);
		tf_AddMaintenanceReason.setBounds(tf_AddMaintenanceName.getBounds().x, lblAddMaintenanceReason.getBounds().y , tf_AddMaintenanceName.getBounds().width, tf_AddMaintenanceName.getBounds().height);
		panelMaintenance.add(tf_AddMaintenanceReason);
		tf_AddMaintenanceReason.setColumns(10);
		
		lblAddMaintenanceStartDate = new JLabel("Start Date:");
		lblAddMaintenanceStartDate.setBorder(null);
		lblAddMaintenanceStartDate.setForeground(UI_Elements.color_mainBackgroundColor);
		lblAddMaintenanceStartDate.setFont(UI_Elements.font_bodyLabel);
		lblAddMaintenanceStartDate.setBounds(lblAddMaintenanceReason.getBounds().x, lblAddMaintenanceReason.getBounds().y+lblAddMaintenanceReason.getBounds().height+lineSpacing, 70, 26);
		panelMaintenance.add(lblAddMaintenanceStartDate);
	
		tf_AddMaintenanceStartDate = new JTextField();
		tf_AddMaintenanceStartDate.setDisabledTextColor(Color.BLACK);
		tf_AddMaintenanceStartDate.setEnabled(true);
		tf_AddMaintenanceStartDate.setEditable(false);
		tf_AddMaintenanceStartDate.setHorizontalAlignment(SwingConstants.LEFT);
		tf_AddMaintenanceStartDate.setFont(UI_Elements.font_bodyFillText);
		tf_AddMaintenanceStartDate.setBounds(lblAddMaintenanceStartDate.getBounds().x + lblAddMaintenanceStartDate.getBounds().width + boxSpacing, lblAddMaintenanceStartDate.getBounds().y , 180, 20);
		panelMaintenance.add(tf_AddMaintenanceStartDate);
		tf_AddMaintenanceStartDate.setColumns(10);
		tf_AddMaintenanceStartDate.setVisible(false);
		
		dateChooserMaintenanceStartDate = new JDateChooser();
		dateChooserMaintenanceStartDate.setBounds(lblAddMaintenanceStartDate.getBounds().x + lblAddMaintenanceStartDate.getBounds().width + boxSpacing, lblAddMaintenanceStartDate.getBounds().y  , 170, 20);
		panelMaintenance.add(dateChooserMaintenanceStartDate);
		dateChooserMaintenanceStartDate.setDateFormatString("dd/MM/yyyy");
		
		
		tf_AddMaintenancePriority = new JTextField();
		tf_AddMaintenancePriority.setDisabledTextColor(Color.BLACK);
		tf_AddMaintenancePriority.setEnabled(true);
		tf_AddMaintenancePriority.setEditable(false);
		tf_AddMaintenancePriority.setHorizontalAlignment(SwingConstants.LEFT);
		tf_AddMaintenancePriority.setFont(UI_Elements.font_bodyFillText);
		tf_AddMaintenancePriority.setBounds(maintenanceEmployeeTableScrollPane.getBounds().x + maintenanceEmployeeTableScrollPane.getBounds().width - tf_AddMaintenanceStartDate.getBounds().width, lblAddMaintenanceStartDate.getBounds().y , tf_AddMaintenanceStartDate.getBounds().width, 20);
		panelMaintenance.add(tf_AddMaintenancePriority);
		tf_AddMaintenancePriority.setColumns(10);
		
		lblAddMaintenancePriority = new JLabel("Priority (#):");
		lblAddMaintenancePriority.setBorder(null);
		lblAddMaintenancePriority.setForeground(UI_Elements.color_mainBackgroundColor);
		lblAddMaintenancePriority.setFont(UI_Elements.font_bodyLabel);
		lblAddMaintenancePriority.setBounds(tf_AddMaintenancePriority.getBounds().x - lblAddMaintenanceStartDate.getBounds().width-10, tf_AddMaintenanceStartDate.getBounds().y, lblAddMaintenanceStartDate.getBounds().width+10, 26);
		panelMaintenance.add(lblAddMaintenancePriority);
		
		btnAddMaintenanceFinish = new JButton("FINISH");
		btnAddMaintenanceFinish.setFocusPainted(false);
		btnAddMaintenanceFinish.setRequestFocusEnabled(false);
		btnAddMaintenanceFinish.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddMaintenanceFinish.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddMaintenanceFinish.setForeground(Color.WHITE);
		btnAddMaintenanceFinish.setOpaque(true);
		btnAddMaintenanceFinish.setBorder(null);
		btnAddMaintenanceFinish.setFont(UI_Elements.font_AgencyActionButton);
		btnAddMaintenanceFinish.setBackground(UI_Elements.color_mainBackgroundColor);
		btnAddMaintenanceFinish.setBounds(221, lblAddMaintenanceStartDate.getBounds().y+lblAddMaintenanceStartDate.getBounds().height+12, 75, 25);
		btnAddMaintenanceFinish.setSelected(false);
		panelMaintenance.add(btnAddMaintenanceFinish);
		btnAddMaintenanceFinish.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddMaintenanceFinish.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnAddMaintenanceFinish.setBackground(UI_Elements.color_mainBackgroundColor);
		    }
		} );
		
		btnAddMaintenanceCancel = new JButton("CANCEL");
		btnAddMaintenanceCancel.setFocusPainted(false);
		btnAddMaintenanceCancel.setRequestFocusEnabled(false);
		btnAddMaintenanceCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddMaintenanceCancel.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddMaintenanceCancel.setForeground(Color.WHITE);
		btnAddMaintenanceCancel.setOpaque(true);
		btnAddMaintenanceCancel.setBorder(null);
		btnAddMaintenanceCancel.setFont(UI_Elements.font_AgencyActionButton);
		btnAddMaintenanceCancel.setBackground(UI_Elements.color_mainBackgroundColor);
		btnAddMaintenanceCancel.setBounds(btnAddMaintenanceFinish.getBounds().x + btnAddMaintenanceFinish.getBounds().width + 7, btnAddMaintenanceFinish.getBounds().y, 75, 25);
		btnAddMaintenanceCancel.setSelected(false);
		panelMaintenance.add(btnAddMaintenanceCancel);
		btnAddMaintenanceCancel.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddMaintenanceCancel.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnAddMaintenanceCancel.setBackground(UI_Elements.color_mainBackgroundColor);
		    }
		} );
		
		addMaintenanceComponents.add(lblAddmAddMaintenanceName);
		addMaintenanceComponents.add(tf_AddMaintenanceName);
		addMaintenanceComponents.add(lblAddMaintenanceStartDate);
		addMaintenanceComponents.add(dateChooserMaintenanceStartDate);
		addMaintenanceComponents.add(lblAddMaintenancePriority);
		addMaintenanceComponents.add(tf_AddMaintenancePriority);
		addMaintenanceComponents.add(lblAddMaintenanceReason);
		addMaintenanceComponents.add(tf_AddMaintenanceReason);
		addMaintenanceComponents.add(btnAddMaintenanceFinish);
		addMaintenanceComponents.add(btnAddMaintenanceCancel);
		turnOffAddMaintenanceComponents();
		
		//Remove Sponsor
		lblRemoveMaintenanceMaintenanceName = new JLabel("Maintenance Name:");
		lblRemoveMaintenanceMaintenanceName.setBorder(null);
		lblRemoveMaintenanceMaintenanceName.setForeground(UI_Elements.color_mainBackgroundColor);
		lblRemoveMaintenanceMaintenanceName.setFont(UI_Elements.font_bodyLabel);
		lblRemoveMaintenanceMaintenanceName.setBounds(btnAddMaintenance.getBounds().x, btnAddMaintenance.getBounds().y+btnAddMaintenance.getBounds().height+20, lblAddmAddMaintenanceName.getBounds().width, 26);
		panelMaintenance.add(lblRemoveMaintenanceMaintenanceName);

		cb_RemoveMaintenanceMaintenanceName = new JComboBox<String>();
		cb_RemoveMaintenanceMaintenanceName.setEnabled(true);
		cb_RemoveMaintenanceMaintenanceName.setEditable(false);
		cb_RemoveMaintenanceMaintenanceName.setFont(UI_Elements.font_bodyFillText);
		cb_RemoveMaintenanceMaintenanceName.setBounds(lblAddmAddMaintenanceName.getBounds().x + lblAddmAddMaintenanceName.getBounds().width + lineSpacing, lblAddmAddMaintenanceName.getBounds().y, maintenanceEmployeeTableScrollPane.getBounds().width-12-lblAddmAddMaintenanceName.getBounds().width, 25);
		panelMaintenance.add(cb_RemoveMaintenanceMaintenanceName);

		btnRemoveMaintenanceFinish = new JButton("FINISH");
		btnRemoveMaintenanceFinish.setFocusPainted(false);
		btnRemoveMaintenanceFinish.setRequestFocusEnabled(false);
		btnRemoveMaintenanceFinish.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemoveMaintenanceFinish.setHorizontalAlignment(SwingConstants.CENTER);
		btnRemoveMaintenanceFinish.setForeground(Color.WHITE);
		btnRemoveMaintenanceFinish.setOpaque(true);
		btnRemoveMaintenanceFinish.setBorder(null);
		btnRemoveMaintenanceFinish.setFont(UI_Elements.font_AgencyActionButton);
		btnRemoveMaintenanceFinish.setBackground(UI_Elements.color_mainBackgroundColor);
		btnRemoveMaintenanceFinish.setBounds(221, lblRemoveMaintenanceMaintenanceName.getBounds().y+lblRemoveMaintenanceMaintenanceName.getBounds().height+lineSpacing, 75, 25);
		btnRemoveMaintenanceFinish.setSelected(false);
		panelMaintenance.add(btnRemoveMaintenanceFinish);
		btnRemoveMaintenanceFinish.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnRemoveMaintenanceFinish.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnRemoveMaintenanceFinish.setBackground(UI_Elements.color_mainBackgroundColor);
		    }
		} );
		
		btnRemoveMaintenanceCancel = new JButton("CANCEL");
		btnRemoveMaintenanceCancel.setFocusPainted(false);
		btnRemoveMaintenanceCancel.setRequestFocusEnabled(false);
		btnRemoveMaintenanceCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemoveMaintenanceCancel.setHorizontalAlignment(SwingConstants.CENTER);
		btnRemoveMaintenanceCancel.setForeground(Color.WHITE);
		btnRemoveMaintenanceCancel.setOpaque(true);
		btnRemoveMaintenanceCancel.setBorder(null);
		btnRemoveMaintenanceCancel.setFont(UI_Elements.font_AgencyActionButton);
		btnRemoveMaintenanceCancel.setBackground(UI_Elements.color_mainBackgroundColor);
		btnRemoveMaintenanceCancel.setBounds(btnAddMaintenanceFinish.getBounds().x + btnAddMaintenanceFinish.getBounds().width + 7, btnRemoveMaintenanceFinish.getBounds().y, 75, 25);
		btnRemoveMaintenanceCancel.setSelected(false);
		panelMaintenance.add(btnRemoveMaintenanceCancel);
		btnRemoveMaintenanceCancel.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnRemoveMaintenanceCancel.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnRemoveMaintenanceCancel.setBackground(UI_Elements.color_mainBackgroundColor);
		    }
		} );

		removeMaintenanceComponents.add(lblRemoveMaintenanceMaintenanceName);
		removeMaintenanceComponents.add(cb_RemoveMaintenanceMaintenanceName);
		removeMaintenanceComponents.add(btnRemoveMaintenanceFinish);
		removeMaintenanceComponents.add(btnRemoveMaintenanceCancel);
		turnOffRemoveMaintenanceComponents();
		

		
		//Action Listeners
		btnAddMaintenance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf_AddMaintenanceName.setEditable(true);
				tf_AddMaintenanceReason.setEditable(true);
				tf_AddMaintenanceStartDate.setEditable(true);
				tf_AddMaintenancePriority.setEditable(true);
				
				if(btnAddMaintenance.isSelected() == false)
				{
					btnAddMaintenance.setSelected(true);
					btnRemoveMaintenance.setSelected(false);
					turnOnAddMaintenanceComponents();
					turnOffRemoveMaintenanceComponents();
					btnAddMaintenance.setBackground(UI_Elements.color_panelBodyButtonSelected);
					
					btnRemoveMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
				}
				else
				{
					btnAddMaintenance.setSelected(false);
					turnOffAddMaintenanceComponents();
					btnAddMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
					btnRemoveMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
				}
			}
		});
		
		btnRemoveMaintenance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnRemoveMaintenance.isSelected() == false)
				{
					btnAddMaintenance.setSelected(false);
					btnRemoveMaintenance.setSelected(true);
					turnOffAddMaintenanceComponents();
					turnOnRemoveMaintenanceComponents();
					btnAddMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
					btnRemoveMaintenance.setBackground(UI_Elements.color_panelBodyButtonSelected);
				}
				else
				{
					turnOffRemoveMaintenanceComponents();
					btnRemoveMaintenance.setSelected(false);
					btnAddMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
					btnRemoveMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
				}
			}
		});
		
		btnAddMaintenanceFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				turnOffAddMaintenanceComponents();
				btnAddMaintenance.setSelected(false);
				btnRemoveMaintenance.setSelected(false);
				btnAddMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
				btnRemoveMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
			}
		});
		
		btnAddMaintenanceCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				turnOffAddMaintenanceComponents();
				btnAddMaintenance.setSelected(false);
				btnRemoveMaintenance.setSelected(false);
				btnAddMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
				btnRemoveMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
				tf_AddMaintenanceName.setText("");
				tf_AddMaintenanceReason.setText("");
				tf_AddMaintenanceStartDate.setText("");
				tf_AddMaintenancePriority.setText("");
			}
		});
		
		btnRemoveMaintenanceFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				turnOffRemoveMaintenanceComponents();
				btnAddMaintenance.setSelected(false);
				btnRemoveMaintenance.setSelected(false);
				btnAddMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
				btnRemoveMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
			}
		});
		
		btnRemoveMaintenanceCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				turnOffRemoveMaintenanceComponents();
				btnAddMaintenance.setSelected(false);
				btnRemoveMaintenance.setSelected(false);
				btnAddMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
				btnRemoveMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
				
			}
		});
		
	}
	
	private void turnOnAddMaintenanceComponents()
	{
		for(JComponent component : addMaintenanceComponents)
		{
			component.setVisible(true);
		}
	}
	
	private void turnOffAddMaintenanceComponents()
	{
		for(JComponent component : addMaintenanceComponents)
		{
			component.setVisible(false);
		}
	}
	
	
	private void turnOnRemoveMaintenanceComponents()
	{
		for(JComponent component : removeMaintenanceComponents)
		{
			component.setVisible(true);
		}
	}
	
	private void turnOffRemoveMaintenanceComponents()
	{
		for(JComponent component : removeMaintenanceComponents)
		{
			component.setVisible(false);
		}
	}
}
