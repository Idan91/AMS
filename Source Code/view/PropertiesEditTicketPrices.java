package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


@SuppressWarnings("serial")
public class PropertiesEditTicketPrices extends JFrame {

	public JPanel panelEditTicketPrices;
	private JLabel titleEditTicketPrices;
	private JLabel lblVIP;
	public JTextField tf_VIP;
	public JTextField tf_ClubLevel;
	private JLabel lblClubLevel;
	private JLabel lblBleachers;
	public JTextField tf_Bleachers;
	public JButton btnFinish;
	public JButton btnCancel;
	private JLabel lblErrorMessage_InavlidValue;

	private int lineSpacing = 12;
	private int boxHeightDifference = 2;
	
	public PropertiesEditTicketPrices() {
		//set Frame:
		setBounds(385, 55, 400, 310);
		this.setResizable(false);
		panelEditTicketPrices = new JPanel();
		panelEditTicketPrices.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelEditTicketPrices.setBackground(UI_Elements.color_menuBar);
		setContentPane(panelEditTicketPrices);
		panelEditTicketPrices.setLayout(null);
		panelEditTicketPrices.setVisible(true);
		this.setIconImage(UI_Elements.amsIcon.getImage());
		
		titleEditTicketPrices = new JLabel("EDIT TICKET PRICES");
		titleEditTicketPrices.setVerticalAlignment(SwingConstants.CENTER);
		titleEditTicketPrices.setBounds(25, 22, 265, 32);
		titleEditTicketPrices.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleEditTicketPrices.setForeground(Color.WHITE);
		titleEditTicketPrices.setFont(UI_Elements.font_AgencySubPanelTitle);
		panelEditTicketPrices.add(titleEditTicketPrices);
		
		lblVIP = new JLabel("VIP:");
		lblVIP.setAlignmentY(Component.CENTER_ALIGNMENT);
		lblVIP.setVerticalAlignment(SwingConstants.CENTER);
		lblVIP.setBorder(null);
		lblVIP.setForeground(Color.WHITE);
		lblVIP.setFont(UI_Elements.font_bodyOverviewSectionDetailsBold);
		lblVIP.setBounds(titleEditTicketPrices.getBounds().x, titleEditTicketPrices.getBounds().y+titleEditTicketPrices.getBounds().height+lineSpacing*2, 90, 25);
		panelEditTicketPrices.add(lblVIP);
		
		tf_VIP  = new JTextField();
		tf_VIP.setAlignmentY(Component.CENTER_ALIGNMENT);
		tf_VIP.setBounds(lblVIP.getBounds().x+lblVIP.getBounds().width+15, lblVIP.getBounds().y-boxHeightDifference, 150, lblVIP.getBounds().height);
		tf_VIP.setBorder(null);
		tf_VIP.setOpaque(true);
		tf_VIP.setDisabledTextColor(Color.BLACK);
		tf_VIP.setEnabled(true);
		tf_VIP.setEditable(true);
		tf_VIP.setHorizontalAlignment(SwingConstants.LEFT);
		tf_VIP.setFont(UI_Elements.font_bodyOverviewSectionDetails);
		tf_VIP.setColumns(10);
		panelEditTicketPrices.add(tf_VIP);
		
		lblClubLevel = new JLabel("Club Level:");
		lblClubLevel.setAlignmentY(Component.CENTER_ALIGNMENT);
		lblClubLevel.setVerticalAlignment(SwingConstants.CENTER);
		lblClubLevel.setBorder(null);
		lblClubLevel.setForeground(Color.WHITE);
		lblClubLevel.setFont(UI_Elements.font_bodyOverviewSectionDetailsBold);
		lblClubLevel.setBounds(lblVIP.getBounds().x, lblVIP.getBounds().y+lblVIP.getBounds().height+lineSpacing, lblVIP.getBounds().width, lblVIP.getBounds().height);
		panelEditTicketPrices.add(lblClubLevel);
		
		tf_ClubLevel  = new JTextField();
		tf_ClubLevel.setAlignmentY(Component.CENTER_ALIGNMENT);
		tf_ClubLevel.setBounds(lblClubLevel.getBounds().x+lblClubLevel.getBounds().width+15, lblClubLevel.getBounds().y-boxHeightDifference, tf_VIP.getBounds().width, lblVIP.getBounds().height);
		tf_ClubLevel.setBorder(null);
		tf_ClubLevel.setOpaque(true);
		tf_ClubLevel.setDisabledTextColor(Color.BLACK);
		tf_ClubLevel.setEnabled(true);
		tf_ClubLevel.setEditable(true);
		tf_ClubLevel.setHorizontalAlignment(SwingConstants.LEFT);
		tf_ClubLevel.setFont(UI_Elements.font_bodyOverviewSectionDetails);
		tf_ClubLevel.setColumns(10);
		panelEditTicketPrices.add(tf_ClubLevel);
		
		lblBleachers = new JLabel("Bleachers:");
		lblBleachers.setAlignmentY(Component.CENTER_ALIGNMENT);
		lblBleachers.setVerticalAlignment(SwingConstants.CENTER);
		lblBleachers.setBorder(null);
		lblBleachers.setForeground(Color.WHITE);
		lblBleachers.setFont(UI_Elements.font_bodyOverviewSectionDetailsBold);
		lblBleachers.setBounds(lblClubLevel.getBounds().x, lblClubLevel.getBounds().y+lblClubLevel.getBounds().height+lineSpacing, lblVIP.getBounds().width, lblVIP.getBounds().height);
		panelEditTicketPrices.add(lblBleachers);
		
		tf_Bleachers  = new JTextField();
		tf_Bleachers.setAlignmentY(Component.CENTER_ALIGNMENT);
		tf_Bleachers.setBounds(lblBleachers.getBounds().x+lblBleachers.getBounds().width+15, lblBleachers.getBounds().y-boxHeightDifference, tf_VIP.getBounds().width, lblVIP.getBounds().height);
		tf_Bleachers.setBorder(null);
		tf_Bleachers.setOpaque(true);
		tf_Bleachers.setDisabledTextColor(Color.BLACK);
		tf_Bleachers.setEnabled(true);
		tf_Bleachers.setEditable(true);
		tf_Bleachers.setHorizontalAlignment(SwingConstants.LEFT);
		tf_Bleachers.setFont(UI_Elements.font_bodyOverviewSectionDetails);
		tf_Bleachers.setColumns(10);
		panelEditTicketPrices.add(tf_Bleachers);
		
		btnFinish = new JButton("FINISH");
		btnFinish.setFocusPainted(false);
		btnFinish.setRequestFocusEnabled(false);
		btnFinish.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFinish.setHorizontalAlignment(SwingConstants.CENTER);
		btnFinish.setForeground(Color.WHITE);
		btnFinish.setOpaque(true);
		btnFinish.setBorder(null);
		btnFinish.setFont(UI_Elements.font_AgencyActionButton);
		btnFinish.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnFinish.setBounds(lblBleachers.getBounds().x, lblBleachers.getBounds().y+lblBleachers.getBounds().height+lineSpacing*2, 75, 25);
		btnFinish.setSelected(false);
		panelEditTicketPrices.add(btnFinish);
		btnFinish.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnFinish.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnFinish.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    }
		} );
		
		btnCancel = new JButton("CANCEL");
		btnCancel.setFocusPainted(false);
		btnCancel.setRequestFocusEnabled(false);
		btnCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancel.setHorizontalAlignment(SwingConstants.CENTER);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setOpaque(true);
		btnCancel.setBorder(null);
		btnCancel.setFont(UI_Elements.font_AgencyActionButton);
		btnCancel.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnCancel.setBounds(btnFinish.getBounds().x + btnFinish.getBounds().width + 7, btnFinish.getBounds().y, 75, 25);
		btnCancel.setSelected(false);
		panelEditTicketPrices.add(btnCancel);
		btnCancel.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnCancel.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnCancel.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    }
		} );
		
		lblErrorMessage_InavlidValue = new JLabel("Invalid Value! Please try again"); 
		lblErrorMessage_InavlidValue.setBounds(btnFinish.getBounds().x, btnFinish.getBounds().y+btnFinish.getBounds().height+lineSpacing+5, 325, 30);
		lblErrorMessage_InavlidValue.setHorizontalAlignment(SwingConstants.LEFT);
		lblErrorMessage_InavlidValue.setFont(UI_Elements.font_errorMessage);
		lblErrorMessage_InavlidValue.setForeground(Color.RED);
		lblErrorMessage_InavlidValue.setVisible(false);
		panelEditTicketPrices.add(lblErrorMessage_InavlidValue);

		
		
	}
	
}
