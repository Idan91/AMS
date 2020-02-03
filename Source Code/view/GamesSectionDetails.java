package view;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


@SuppressWarnings("serial")
public class GamesSectionDetails extends JPanel {
	
	
	public JPanel panelSectionDetails;
	private JLabel titleSectionDetails;
	private JLabel lblSectionNumber;
	public JTextField tf_SectionNumber;
	private JLabel lblSectionName;
	public JTextField tf_SectionName;
	private JLabel lblSectionRanking;
	public JTextField tf_SectionRanking;
	private int lineSpacing = 7;
	private JLabel lblSectionType;
	public JTextField tf_SectionType;
	private JLabel lblTicketPrice;
	public JTextField tf_TicketPrice;
	private JLabel lblAttendance;
	public JTextField tf_Attendance;
	private JLabel lblIsRoofed;
	public JTextField tf_IsRoofed;
	public JButton btnAddTicketSale;
	public GamesAddTicketSale frameAddTicketSale;

	public GamesSectionDetails() {
		setBackground(UI_Elements.color_mainBackgroundColor);
		
		panelSectionDetails = new JPanel();
		panelSectionDetails.setBorder(null);
		panelSectionDetails.setBackground(UI_Elements.color_mainBackgroundColor);
		panelSectionDetails.setBounds(0, 5, 340, 352);
		panelSectionDetails.setLayout(null);
		panelSectionDetails.setVisible(false);
		
		titleSectionDetails = new JLabel("SECTION DETAILS:");
		titleSectionDetails.setVerticalAlignment(SwingConstants.TOP);
		titleSectionDetails.setBounds(35, 1, 265, 26);
		titleSectionDetails.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleSectionDetails.setForeground(Color.WHITE);
		titleSectionDetails.setFont(UI_Elements.font_AgencySmallPanelTitle);
		panelSectionDetails.add(titleSectionDetails);
		
		lblSectionNumber = new JLabel("Section Number:");
		lblSectionNumber.setBorder(null);
		lblSectionNumber.setForeground(Color.WHITE);
		lblSectionNumber.setFont(UI_Elements.font_bodyLabel);
		lblSectionNumber.setBounds(titleSectionDetails.getBounds().x, titleSectionDetails.getBounds().y+titleSectionDetails.getBounds().height+12, 115, 20);
		panelSectionDetails.add(lblSectionNumber);
		
		tf_SectionNumber = new JTextField();
		tf_SectionNumber.setBorder(null);
		tf_SectionNumber.setOpaque(false);
		tf_SectionNumber.setBounds(lblSectionNumber.getBounds().x+lblSectionNumber.getBounds().width+15, lblSectionNumber.getBounds().y, 150, 20);
		tf_SectionNumber.setForeground(Color.WHITE);
		tf_SectionNumber.setEnabled(true);
		tf_SectionNumber.setEditable(false);
		tf_SectionNumber.setHorizontalAlignment(SwingConstants.LEFT);
		tf_SectionNumber.setFont(UI_Elements.font_bodyLabel);
		panelSectionDetails.add(tf_SectionNumber);
		
		lblSectionName = new JLabel("Section Name:");
		lblSectionName.setBorder(null);
		lblSectionName.setForeground(Color.WHITE);
		lblSectionName.setFont(UI_Elements.font_bodyLabel);
		lblSectionName.setBounds(lblSectionNumber.getBounds().x, lblSectionNumber.getBounds().y+lblSectionNumber.getBounds().height+lineSpacing, 115, 20);
		panelSectionDetails.add(lblSectionName);
		
		tf_SectionName = new JTextField();
		tf_SectionName.setBorder(null);
		tf_SectionName.setOpaque(false);
		tf_SectionName.setBounds(lblSectionName.getBounds().x+lblSectionName.getBounds().width+15, lblSectionName.getBounds().y, 150, 20);
		tf_SectionName.setForeground(Color.WHITE);
		tf_SectionName.setEnabled(true);
		tf_SectionName.setEditable(false);
		tf_SectionName.setHorizontalAlignment(SwingConstants.LEFT);
		tf_SectionName.setFont(UI_Elements.font_bodyLabel);
		panelSectionDetails.add(tf_SectionName);
		
		lblSectionRanking = new JLabel("Section Ranking:");
		lblSectionRanking.setBorder(null);
		lblSectionRanking.setForeground(Color.WHITE);
		lblSectionRanking.setFont(UI_Elements.font_bodyLabel);
		lblSectionRanking.setBounds(lblSectionName.getBounds().x, lblSectionName.getBounds().y+lblSectionName.getBounds().height+lineSpacing, 115, 20);
		panelSectionDetails.add(lblSectionRanking);
		
		tf_SectionRanking = new JTextField();
		tf_SectionRanking.setBorder(null);
		tf_SectionRanking.setOpaque(false);
		tf_SectionRanking.setBounds(lblSectionRanking.getBounds().x+lblSectionRanking.getBounds().width+15, lblSectionRanking.getBounds().y, 150, 20);
		tf_SectionRanking.setForeground(Color.WHITE);
		tf_SectionRanking.setEnabled(true);
		tf_SectionRanking.setEditable(false);
		tf_SectionRanking.setHorizontalAlignment(SwingConstants.LEFT);
		tf_SectionRanking.setFont(UI_Elements.font_bodyLabel);
		panelSectionDetails.add(tf_SectionRanking);
	
		lblSectionType = new JLabel("Section Type:");
		lblSectionType.setBorder(null);
		lblSectionType.setForeground(Color.WHITE);
		lblSectionType.setFont(UI_Elements.font_bodyLabel);
		lblSectionType.setBounds(lblSectionRanking.getBounds().x, lblSectionRanking.getBounds().y+lblSectionRanking.getBounds().height+lineSpacing, 115, 20);
		panelSectionDetails.add(lblSectionType);
		
		tf_SectionType  = new JTextField();
		tf_SectionType.setBorder(null);
		tf_SectionType.setOpaque(false);
		tf_SectionType.setBounds(lblSectionType.getBounds().x+lblSectionType.getBounds().width+15, lblSectionType.getBounds().y, 150, 20);
		tf_SectionType.setForeground(Color.WHITE);
		tf_SectionType.setEnabled(true);
		tf_SectionType.setEditable(false);
		tf_SectionType.setHorizontalAlignment(SwingConstants.LEFT);
		tf_SectionType.setFont(UI_Elements.font_bodyLabel);
		panelSectionDetails.add(tf_SectionType);
		
		lblTicketPrice = new JLabel("Ticket Price:");
		lblTicketPrice.setBorder(null);
		lblTicketPrice.setForeground(Color.WHITE);
		lblTicketPrice.setFont(UI_Elements.font_bodyLabel);
		lblTicketPrice.setBounds(lblSectionType.getBounds().x, lblSectionType.getBounds().y+lblSectionType.getBounds().height+lineSpacing, 115, 20);
		panelSectionDetails.add(lblTicketPrice);
		
		tf_TicketPrice  = new JTextField();
		tf_TicketPrice.setBorder(null);
		tf_TicketPrice.setOpaque(false);
		tf_TicketPrice.setBounds(lblTicketPrice.getBounds().x+lblTicketPrice.getBounds().width+15, lblTicketPrice.getBounds().y, 150, 20);
		tf_TicketPrice.setForeground(Color.WHITE);
		tf_TicketPrice.setEnabled(true);
		tf_TicketPrice.setEditable(false);
		tf_TicketPrice.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TicketPrice.setFont(UI_Elements.font_bodyLabel);
		panelSectionDetails.add(tf_TicketPrice);
		
		lblAttendance = new JLabel("Attendance:");
		lblAttendance.setBorder(null);
		lblAttendance.setForeground(Color.WHITE);
		lblAttendance.setFont(UI_Elements.font_bodyLabel);
		lblAttendance.setBounds(lblTicketPrice.getBounds().x, lblTicketPrice.getBounds().y+lblTicketPrice.getBounds().height+lineSpacing, 115, 20);
		panelSectionDetails.add(lblAttendance);
		
		tf_Attendance  = new JTextField(); // 'takenSeats'/'numOfSeats'
		tf_Attendance.setBorder(null);
		tf_Attendance.setOpaque(false);
		tf_Attendance.setBounds(lblAttendance.getBounds().x+lblAttendance.getBounds().width+15, lblAttendance.getBounds().y, 150, 20);
		tf_Attendance.setForeground(Color.WHITE);
		tf_Attendance.setEnabled(true);
		tf_Attendance.setEditable(false);
		tf_Attendance.setHorizontalAlignment(SwingConstants.LEFT);
		tf_Attendance.setFont(UI_Elements.font_bodyLabel);
		panelSectionDetails.add(tf_Attendance);
		
		lblIsRoofed = new JLabel("Is Roofed?:");
		lblIsRoofed.setBorder(null);
		lblIsRoofed.setForeground(Color.WHITE);
		lblIsRoofed.setFont(UI_Elements.font_bodyLabel);
		lblIsRoofed.setBounds(lblAttendance.getBounds().x, lblAttendance.getBounds().y+lblAttendance.getBounds().height+lineSpacing, 115, 20);
		panelSectionDetails.add(lblIsRoofed);
		
		tf_IsRoofed  = new JTextField();
		tf_IsRoofed.setBorder(null);
		tf_IsRoofed.setOpaque(false);
		tf_IsRoofed.setBounds(lblIsRoofed.getBounds().x+lblIsRoofed.getBounds().width+15, lblIsRoofed.getBounds().y, 150, 20);
		tf_IsRoofed.setForeground(Color.WHITE);
		tf_IsRoofed.setEnabled(true);
		tf_IsRoofed.setEditable(false);
		tf_IsRoofed.setHorizontalAlignment(SwingConstants.LEFT);
		tf_IsRoofed.setFont(UI_Elements.font_bodyLabel);
		panelSectionDetails.add(tf_IsRoofed);
		
		btnAddTicketSale = new JButton("ADD TICKET SALE");
		btnAddTicketSale.setFocusPainted(false);
		btnAddTicketSale.setRequestFocusEnabled(false);
		btnAddTicketSale.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddTicketSale.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddTicketSale.setForeground(Color.WHITE);
		btnAddTicketSale.setOpaque(true);
		btnAddTicketSale.setBorder(null);
		btnAddTicketSale.setFont(UI_Elements.font_AgencyActionButton);
		btnAddTicketSale.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnAddTicketSale.setBounds(lblIsRoofed.getBounds().x, lblIsRoofed.getBounds().y+lblIsRoofed.getBounds().height+lineSpacing*2, 150, 25);
		btnAddTicketSale.setSelected(false);
		panelSectionDetails.add(btnAddTicketSale);
		btnAddTicketSale.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddTicketSale.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnAddTicketSale.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    }
		} );
		
		frameAddTicketSale = new GamesAddTicketSale();
		
	}

}
