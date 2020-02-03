package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Properties extends JPanel {


	public JPanel panelProperties;

	public JTextField tf_Address;
	public JTextField tf_ArenaName;
	public JTextField tf_SectionNumOfSeats;
	public JTextField tf_ArenaNumOfSeats;
	public JTextField tf_TotalAttendance;
	public JTextField tf_TotalRevenue;
	public JTextField tf_TotalNumOfGameTickets;
	public JTextField tf_TotalNumOfSeasonTickets;
	public JTextField tf_TotalRevenueGameTickets;
	
	public int sectionIndex;
	public JComboBox<String> cb_SectionType;
	public JComboBox<String> cb_SectionRanking;
	public JComboBox<String> cb_SectionSelection;
	public JComboBox<String> cb_ArenaType;

	public JRadioButton rdbtnIsRoofedYes;
	public JRadioButton rdbtnIsRoofedNO;

	public JButton btnEditProperties;
	public JButton btnFinishEditingProperties;
	public JButton btnCancelEditing;
	
	public JLabel titleProperties;
	public JLabel lblArenaName;
	public JLabel lblArenaType;
	public JLabel lblAddress;
	public JLabel lblArenaNumOfSeats;
	public JLabel lblSectionManagement;
	public JLabel lblSectionType;
	public JLabel lblSectionNumOfSeats;
	public JLabel lblIsRoofed;
	public JLabel lblSectionRanking;
	
	public  JSeparator separatorProperties;
	
	private int lineSpacing = 5;

	public JButton btnEditTicketPrices;

	public PropertiesEditTicketPrices frameEditTicketPrices;
	
	
	public Properties() {
		panelProperties = new JPanel();
		panelProperties.setBorder(null);
		panelProperties.setBackground(UI_Elements.color_mainBackgroundColor);
		panelProperties.setBounds(189, 0, 925, 617);
		panelProperties.setLayout(null);
		// STARTUP STATE
		panelProperties.setVisible(false);

		// Properties Page Title
		titleProperties = new JLabel("PROPERTIES");
		titleProperties.setVerticalAlignment(SwingConstants.TOP);
		titleProperties.setBounds(25, 22, 470, 76);
		titleProperties.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleProperties.setForeground(Color.WHITE);
		titleProperties.setFont(UI_Elements.font_AgencyPanelTitle);
		panelProperties.add(titleProperties);

		lblArenaName = new JLabel("Arena Name:");
		lblArenaName.setBorder(null);
		lblArenaName.setForeground(Color.WHITE);
		lblArenaName.setFont(UI_Elements.font_bodyLabel);
		lblArenaName.setBounds(35, 103, 109, 25);
		panelProperties.add(lblArenaName);

		tf_ArenaName = new JTextField();
		tf_ArenaName.setDisabledTextColor(Color.BLACK);
		tf_ArenaName.setEnabled(false);
		tf_ArenaName.setEditable(false);
		tf_ArenaName.setHorizontalAlignment(SwingConstants.LEFT);
		tf_ArenaName.setFont(UI_Elements.font_bodyFillText);
		tf_ArenaName.setBounds(lblArenaName.getBounds().x+120, lblArenaName.getBounds().y, 265, 20);
		panelProperties.add(tf_ArenaName);
		tf_ArenaName.setColumns(10);

		lblArenaType = new JLabel("Arena Type:");
		lblArenaType.setBorder(null);
		lblArenaType.setForeground(Color.WHITE);
		lblArenaType.setFont(UI_Elements.font_bodyLabel);
		lblArenaType.setBounds(lblArenaName.getBounds().x, lblArenaName.getBounds().y+lblArenaName.getBounds().height+lineSpacing, lblArenaName.getBounds().width, lblArenaName.getBounds().height);
		panelProperties.add(lblArenaType);

		cb_ArenaType = new JComboBox<String>();
		cb_ArenaType.setModel(new DefaultComboBoxModel<String>(new String[] { "Stadium" }));
		cb_ArenaType.setBounds(tf_ArenaName.getBounds().x, lblArenaType.getBounds().y, tf_ArenaName.getBounds().width, tf_ArenaName.getBounds().height);
		cb_ArenaType.setFont(UI_Elements.font_bodyFillText);
		panelProperties.add(cb_ArenaType);

		lblAddress = new JLabel("Address:");
		lblAddress.setBorder(null);
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(UI_Elements.font_bodyLabel);
		lblAddress.setBounds(lblArenaType.getBounds().x, lblArenaType.getBounds().y+lblArenaType.getBounds().height+lineSpacing, lblArenaType.getBounds().width, lblArenaType.getBounds().height);
		panelProperties.add(lblAddress);

		tf_Address = new JTextField();
		tf_Address.setDisabledTextColor(Color.BLACK);
		tf_Address.setEnabled(false);
		tf_Address.setEditable(false);
		tf_Address.setHorizontalAlignment(SwingConstants.LEFT);
		tf_Address.setFont(UI_Elements.font_bodyFillText);
		tf_Address.setBounds(cb_ArenaType.getBounds().x, lblAddress.getBounds().y, cb_ArenaType.getBounds().width, cb_ArenaType.getBounds().height);
		panelProperties.add(tf_Address);
		tf_Address.setColumns(10);

		lblArenaNumOfSeats = new JLabel("Num. of Seats:");
		lblArenaNumOfSeats.setBorder(null);
		lblArenaNumOfSeats.setForeground(Color.WHITE);
		lblArenaNumOfSeats.setFont(UI_Elements.font_bodyLabel);
		lblArenaNumOfSeats.setBounds(lblAddress.getBounds().x, lblAddress.getBounds().y+lblAddress.getBounds().height+lineSpacing, lblAddress.getBounds().width, lblAddress.getBounds().height);
		panelProperties.add(lblArenaNumOfSeats);

		tf_ArenaNumOfSeats = new JTextField();
		tf_ArenaNumOfSeats.setDisabledTextColor(Color.BLACK);
		tf_ArenaNumOfSeats.setEnabled(false);
		tf_ArenaNumOfSeats.setEditable(false);
		tf_ArenaNumOfSeats.setHorizontalAlignment(SwingConstants.LEFT);
		tf_ArenaNumOfSeats.setFont(UI_Elements.font_bodyFillText);
		tf_ArenaNumOfSeats.setBounds(tf_Address.getBounds().x, lblArenaNumOfSeats.getBounds().y, tf_Address.getBounds().width, tf_Address.getBounds().height);
		panelProperties.add(tf_ArenaNumOfSeats);
		tf_ArenaNumOfSeats.setColumns(10);

		separatorProperties = new JSeparator();
		separatorProperties.setBounds(lblArenaNumOfSeats.getBounds().x,lblArenaNumOfSeats.getBounds().y+lblArenaNumOfSeats.getBounds().height+lineSpacing*2, 384, 10);
		panelProperties.add(separatorProperties);

		lblSectionManagement = new JLabel("SECTION MANAGEMENT");
		lblSectionManagement.setForeground(Color.WHITE);
		lblSectionManagement.setFont(UI_Elements.font_bodyLabel);
		lblSectionManagement.setBorder(null);
		lblSectionManagement.setBounds(separatorProperties.getBounds().x, separatorProperties.getBounds().y+separatorProperties.getBounds().height+lineSpacing*2, 170, lblArenaNumOfSeats.getBounds().height);
		panelProperties.add(lblSectionManagement);

		cb_SectionSelection = new JComboBox<String>();
		cb_SectionSelection.setModel(new DefaultComboBoxModel<String>(new String[] {}));
		cb_SectionSelection.setFont(UI_Elements.font_bodyFillText);
		cb_SectionSelection.setBorder(null);
		cb_SectionSelection.setBounds(lblSectionManagement.getBounds().x, lblSectionManagement.getBounds().y+lblSectionManagement.getBounds().height+lineSpacing*2, tf_ArenaNumOfSeats.getBounds().width, tf_ArenaNumOfSeats.getBounds().height);
		panelProperties.add(cb_SectionSelection);

		lblSectionType = new JLabel("Section Type:");
		lblSectionType.setForeground(Color.WHITE);
		lblSectionType.setFont(UI_Elements.font_bodyLabel);
		lblSectionType.setBorder(null);
		lblSectionType.setBounds(cb_SectionSelection.getBounds().x, cb_SectionSelection.getBounds().y+cb_SectionSelection.getBounds().height+lineSpacing*2, lblArenaNumOfSeats.getBounds().width, lblArenaNumOfSeats.getBounds().height);
		panelProperties.add(lblSectionType);

		cb_SectionType = new JComboBox<String>();
		cb_SectionType.setEnabled(false);
		cb_SectionType.setModel(new DefaultComboBoxModel<String>(new String[] { "Club Level", "Bleachers", "VIP" }));
		cb_SectionType.setFont(UI_Elements.font_bodyFillText);
		cb_SectionType.setBorder(null);
		cb_SectionType.setBounds(tf_ArenaNumOfSeats.getBounds().x, lblSectionType.getBounds().y, cb_SectionSelection.getBounds().width, cb_SectionSelection.getBounds().height);
		panelProperties.add(cb_SectionType);
		cb_SectionType.setRenderer(new DefaultListCellRenderer() { 
			public void paint(Graphics g) {
				setForeground(Color.BLACK);
				super.paint(g);
			}
		});

		lblSectionNumOfSeats = new JLabel("Num. of Seats:");
		lblSectionNumOfSeats.setBorder(null);
		lblSectionNumOfSeats.setForeground(Color.WHITE);
		lblSectionNumOfSeats.setFont(UI_Elements.font_bodyLabel);
		lblSectionNumOfSeats.setBounds(lblSectionType.getBounds().x, lblSectionType.getBounds().y+lblSectionType.getBounds().height+lineSpacing, lblSectionType.getBounds().width, lblSectionType.getBounds().height);
		panelProperties.add(lblSectionNumOfSeats);

		tf_SectionNumOfSeats = new JTextField();
		tf_SectionNumOfSeats.setDisabledTextColor(Color.BLACK);
		tf_SectionNumOfSeats.setEnabled(false);
		tf_SectionNumOfSeats.setEditable(false);
		tf_SectionNumOfSeats.setHorizontalAlignment(SwingConstants.LEFT);
		tf_SectionNumOfSeats.setFont(UI_Elements.font_bodyFillText);
		tf_SectionNumOfSeats.setBounds(cb_SectionType.getBounds().x, lblSectionNumOfSeats.getBounds().y, cb_SectionType.getBounds().width, cb_SectionType.getBounds().height);
		panelProperties.add(tf_SectionNumOfSeats);
		tf_SectionNumOfSeats.setColumns(10);

		lblIsRoofed = new JLabel("Is Roofed?:");
		lblIsRoofed.setBorder(null);
		lblIsRoofed.setForeground(Color.WHITE);
		lblIsRoofed.setFont(UI_Elements.font_bodyLabel);
		lblIsRoofed.setBounds(lblSectionNumOfSeats.getBounds().x, lblSectionNumOfSeats.getBounds().y+lblSectionNumOfSeats.getBounds().height+lineSpacing, lblSectionNumOfSeats.getBounds().width, lblSectionNumOfSeats.getBounds().height);
		panelProperties.add(lblIsRoofed);

		rdbtnIsRoofedYes = new JRadioButton("Yes");
		rdbtnIsRoofedYes.setEnabled(false);
		rdbtnIsRoofedYes.setOpaque(false);
		rdbtnIsRoofedYes.setActionCommand("");
		rdbtnIsRoofedYes.setVerticalAlignment(SwingConstants.TOP);
		rdbtnIsRoofedYes.setToolTipText("Yes");
		rdbtnIsRoofedYes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnIsRoofedYes.setForeground(Color.WHITE);
		rdbtnIsRoofedYes.setFont(UI_Elements.font_bodyFillText);
		rdbtnIsRoofedYes.setBounds(tf_SectionNumOfSeats.getBounds().x, lblIsRoofed.getBounds().y, 65, 26);
		panelProperties.add(rdbtnIsRoofedYes);

		rdbtnIsRoofedNO = new JRadioButton("No");
		rdbtnIsRoofedNO.setEnabled(false);
		rdbtnIsRoofedNO.setOpaque(false);
		rdbtnIsRoofedNO.setActionCommand("");
		rdbtnIsRoofedNO.setVerticalAlignment(SwingConstants.TOP);
		rdbtnIsRoofedNO.setToolTipText("No");
		rdbtnIsRoofedNO.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnIsRoofedNO.setForeground(Color.WHITE);
		rdbtnIsRoofedNO.setFont(UI_Elements.font_bodyFillText);
		rdbtnIsRoofedNO.setBounds(rdbtnIsRoofedYes.getBounds().x+rdbtnIsRoofedYes.getBounds().width, rdbtnIsRoofedYes.getBounds().y, rdbtnIsRoofedYes.getBounds().width, rdbtnIsRoofedYes.getBounds().height);
		panelProperties.add(rdbtnIsRoofedNO);

		lblSectionRanking = new JLabel("Section Ranking:");
		lblSectionRanking.setForeground(Color.WHITE);
		lblSectionRanking.setFont(UI_Elements.font_bodyLabel);
		lblSectionRanking.setBorder(null);
		lblSectionRanking.setBounds(lblIsRoofed.getBounds().x, lblIsRoofed.getBounds().y+lblIsRoofed.getBounds().height+lineSpacing, lblIsRoofed.getBounds().width, lblIsRoofed.getBounds().height);
		panelProperties.add(lblSectionRanking);

		cb_SectionRanking = new JComboBox<String>();
		cb_SectionRanking.setEnabled(false);
		cb_SectionRanking.setModel(new DefaultComboBoxModel<String>(new String[] { "High", "Medium", "Low" }));
		cb_SectionRanking.setFont(UI_Elements.font_bodyFillText);
		cb_SectionRanking.setBorder(null);
		cb_SectionRanking.setBounds(tf_SectionNumOfSeats.getBounds().x, lblSectionRanking.getBounds().y, tf_SectionNumOfSeats.getBounds().width, tf_SectionNumOfSeats.getBounds().height);
		panelProperties.add(cb_SectionRanking);
		cb_SectionRanking.setRenderer(new DefaultListCellRenderer() {
			public void paint(Graphics g) {
				setForeground(Color.BLACK);
				super.paint(g);
			}
		});

		//---Buttons---//
		
		// Buttons declaration:
		btnEditProperties = new JButton("EDIT");
		btnEditProperties.setVisible(true);
		btnEditProperties.setBounds(460, lblArenaName.getBounds().y-2, 112, 25);
		btnEditProperties.setFocusPainted(false);
		btnEditProperties.setRequestFocusEnabled(false);
		btnEditProperties.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEditProperties.setHorizontalAlignment(SwingConstants.CENTER);
		btnEditProperties.setForeground(Color.WHITE);
		btnEditProperties.setOpaque(true);
		btnEditProperties.setBorder(null);
		btnEditProperties.setFont(UI_Elements.font_AgencyActionButton);
		btnEditProperties.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnEditProperties.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnEditProperties.setBackground(UI_Elements.color_panelBodyButtonRollover);
			}

			public void mouseExited(MouseEvent e) {
				btnEditProperties.setBackground(UI_Elements.color_panelBodyButtonDefault);

			}
		});
		panelProperties.add(btnEditProperties);

		btnFinishEditingProperties = new JButton("FINISH");
		btnFinishEditingProperties.setVisible(false);
		btnFinishEditingProperties.setBounds(btnEditProperties.getBounds().x, cb_SectionRanking.getBounds().y+cb_SectionRanking.getBounds().height+lineSpacing*4, btnEditProperties.getBounds().width, btnEditProperties.getBounds().height);
		btnFinishEditingProperties.setFocusPainted(false);
		btnFinishEditingProperties.setRequestFocusEnabled(false);
		btnFinishEditingProperties.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFinishEditingProperties.setHorizontalAlignment(SwingConstants.CENTER);
		btnFinishEditingProperties.setForeground(Color.WHITE);
		btnFinishEditingProperties.setOpaque(true);
		btnFinishEditingProperties.setBorder(null);
		btnFinishEditingProperties.setFont(UI_Elements.font_AgencyActionButton);
		btnFinishEditingProperties.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnFinishEditingProperties.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnFinishEditingProperties.setBackground(UI_Elements.color_panelBodyButtonRollover);
			}

			public void mouseExited(MouseEvent e) {
				btnFinishEditingProperties.setBackground(UI_Elements.color_panelBodyButtonDefault);

			}
		});
		panelProperties.add(btnFinishEditingProperties);

		btnCancelEditing = new JButton("CANCEL");
		btnCancelEditing.setVisible(false);
		btnCancelEditing.setBounds(btnEditProperties.getBounds());
		btnCancelEditing.setFocusPainted(false);
		btnCancelEditing.setRequestFocusEnabled(false);
		btnCancelEditing.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelEditing.setHorizontalAlignment(SwingConstants.CENTER);
		btnCancelEditing.setForeground(Color.WHITE);
		btnCancelEditing.setOpaque(true);
		btnCancelEditing.setBorder(null);
		btnCancelEditing.setFont(UI_Elements.font_AgencyActionButton);;
		btnCancelEditing.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnCancelEditing.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnCancelEditing.setBackground(UI_Elements.color_panelBodyButtonRollover);
			}

			public void mouseExited(MouseEvent e) {
				btnCancelEditing.setBackground(UI_Elements.color_panelBodyButtonDefault);

			}
		});
		panelProperties.add(btnCancelEditing);
		
		btnEditTicketPrices = new JButton("EDIT TICKET PRICES");
		btnEditTicketPrices.setVisible(false);
		btnEditTicketPrices.setBounds(cb_SectionSelection.getBounds().x + cb_SectionSelection.getBounds().width+lineSpacing, cb_SectionSelection.getBounds().y-3, btnEditProperties.getBounds().width, btnEditProperties.getBounds().height);
		btnEditTicketPrices.setFocusPainted(false);
		btnEditTicketPrices.setRequestFocusEnabled(false);
		btnEditTicketPrices.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEditTicketPrices.setHorizontalAlignment(SwingConstants.CENTER);
		btnEditTicketPrices.setForeground(Color.WHITE);
		btnEditTicketPrices.setOpaque(true);
		btnEditTicketPrices.setBorder(null);
		btnEditTicketPrices.setFont(UI_Elements.font_AgencyActionButton);
		btnEditTicketPrices.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnEditTicketPrices.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnEditTicketPrices.setBackground(UI_Elements.color_panelBodyButtonRollover);
			}

			public void mouseExited(MouseEvent e) {
				btnEditTicketPrices.setBackground(UI_Elements.color_panelBodyButtonDefault);

			}
		});
		panelProperties.add(btnEditTicketPrices);
		
		frameEditTicketPrices = new PropertiesEditTicketPrices();
		
		// end buttons declarations

	}

	// methods:
	public void setProperties(boolean action) // Function that sets the properties page by a given action (true/false)
	{
		tf_ArenaName.setEnabled(action);
		tf_ArenaName.setEditable(action);
		tf_Address.setEnabled(action);
		tf_Address.setEditable(action);
		tf_SectionNumOfSeats.setEnabled(action);
		tf_SectionNumOfSeats.setEditable(action);
		cb_SectionType.setEnabled(action);
		cb_SectionRanking.setEnabled(action);
		rdbtnIsRoofedYes.setEnabled(action);
		rdbtnIsRoofedNO.setEnabled(action);
	}	

}
