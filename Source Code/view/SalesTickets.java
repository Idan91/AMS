package view;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class SalesTickets extends JPanel {

	
	public JPanel panelTickets;
	
	private JLabel titleTickets;
	private JLabel lblTotalAttendance;
	
	public JTextField tf_TotalAttendance;
	private JLabel lblTotalRevenue;
	public JTextField tf_TotalRevenue;
	private JSeparator sprtrTickets1;
	private JLabel lblTotalNumOfGameTickets;
	public JTextField tf_TotalNumOfGameTickets;
	private JLabel lblTotalGameTicketRevenue;
	public JTextField tf_TotalRevenueGameTickets;
	private JLabel lblTotalSingleVIP;
	public JTextField tf_TotalSingleVIP;
	private JLabel lblTotalSingleClubLevel;
	public JTextField tf_TotalSingleClubLevel;
	private JLabel lblTotalSingleBleachers;
	public JTextField tf_TotalSingleBleachers;
	
	private final int lineSpacing = 7;

	SalesTickets(){
		panelTickets = new JPanel();
		panelTickets.setBorder(null);
		panelTickets.setBackground(SystemColor.control);
		panelTickets.setBounds(0, 0, 600, 617);
		panelTickets.setLayout(null);
		
		titleTickets = new JLabel("TICKETS");
		titleTickets.setAlignmentY(Component.TOP_ALIGNMENT);
		titleTickets.setVerticalAlignment(SwingConstants.TOP);
		titleTickets.setBounds(30, 22, 346, 76);
		titleTickets.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		titleTickets.setFont(UI_Elements.font_AgencySubPanelTitle);
		panelTickets.add(titleTickets);
		
		lblTotalAttendance = new JLabel("Total Attendance:");
		lblTotalAttendance.setVerticalAlignment(SwingConstants.TOP);
		lblTotalAttendance.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalAttendance.setFont(UI_Elements.font_bodyLabel);
		lblTotalAttendance.setBorder(null);
		lblTotalAttendance.setBounds(30, 103, 180, 15);
		panelTickets.add(lblTotalAttendance);
		
		tf_TotalAttendance = new JTextField();
		tf_TotalAttendance.setAlignmentY(Component.TOP_ALIGNMENT);
		tf_TotalAttendance.setBorder(null);
		tf_TotalAttendance.setOpaque(false);
		tf_TotalAttendance.setBackground(Color.WHITE);
		tf_TotalAttendance.setBounds(275, 103, 150, 17);
		tf_TotalAttendance.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalAttendance.setEnabled(true);
		tf_TotalAttendance.setEditable(false);
		tf_TotalAttendance.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalAttendance.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalAttendance);
		
		lblTotalRevenue = new JLabel("Total Ticket Revenue:");
		lblTotalRevenue.setAlignmentY(Component.TOP_ALIGNMENT);
		lblTotalRevenue.setVerticalAlignment(SwingConstants.TOP);
		lblTotalRevenue.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalRevenue.setFont(UI_Elements.font_bodyLabel);
		lblTotalRevenue.setBorder(null);
		lblTotalRevenue.setBounds(lblTotalAttendance.getBounds().x, lblTotalAttendance.getBounds().y+lblTotalAttendance.getBounds().height+lineSpacing, 180, lblTotalAttendance.getBounds().height);
		panelTickets.add(lblTotalRevenue);
		
		tf_TotalRevenue = new JTextField();
		tf_TotalRevenue.setAlignmentY(Component.TOP_ALIGNMENT);
		tf_TotalRevenue.setBorder(null);
		tf_TotalRevenue.setOpaque(false);
		tf_TotalRevenue.setBackground(Color.WHITE);
		tf_TotalRevenue.setBounds(tf_TotalAttendance.getBounds().x, lblTotalRevenue.getBounds().y, 150, tf_TotalAttendance.getBounds().height);
		tf_TotalRevenue.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalRevenue.setEnabled(true);
		tf_TotalRevenue.setEditable(false);
		tf_TotalRevenue.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalRevenue.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalRevenue);
		
		sprtrTickets1 = new JSeparator();
		sprtrTickets1.setForeground(UI_Elements.color_mainBackgroundColor);
		sprtrTickets1.setBounds(lblTotalRevenue.getBounds().x, lblTotalRevenue.getBounds().y+lblTotalRevenue.getBounds().height+lineSpacing*2, 533, 10);
		panelTickets.add(sprtrTickets1);
		
		lblTotalNumOfGameTickets = new JLabel("Total Num. of Single Tickets:");
		lblTotalNumOfGameTickets.setAlignmentY(Component.TOP_ALIGNMENT);
		lblTotalNumOfGameTickets.setVerticalAlignment(SwingConstants.TOP);
		lblTotalNumOfGameTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalNumOfGameTickets.setFont(UI_Elements.font_bodyLabel);
		lblTotalNumOfGameTickets.setBorder(null);
		lblTotalNumOfGameTickets.setBounds(sprtrTickets1.getBounds().x, sprtrTickets1.getBounds().y+sprtrTickets1.getBounds().height+lineSpacing*2, 250, lblTotalAttendance.getBounds().height);
		panelTickets.add(lblTotalNumOfGameTickets);
		
		tf_TotalNumOfGameTickets = new JTextField();
		tf_TotalNumOfGameTickets.setAlignmentY(Component.TOP_ALIGNMENT);
		tf_TotalNumOfGameTickets.setBorder(null);
		tf_TotalNumOfGameTickets.setOpaque(false);
		tf_TotalNumOfGameTickets.setBackground(Color.WHITE);
		tf_TotalNumOfGameTickets.setBounds(tf_TotalAttendance.getBounds().x, lblTotalNumOfGameTickets.getBounds().y, 150, tf_TotalRevenue.getBounds().height);
		tf_TotalNumOfGameTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalNumOfGameTickets.setEnabled(true);
		tf_TotalNumOfGameTickets.setEditable(false);
		tf_TotalNumOfGameTickets.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalNumOfGameTickets.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalNumOfGameTickets);
		
		lblTotalGameTicketRevenue = new JLabel("Total Single Ticket Revenue:");
		lblTotalGameTicketRevenue.setAlignmentY(Component.TOP_ALIGNMENT);
		lblTotalGameTicketRevenue.setVerticalAlignment(SwingConstants.TOP);
		lblTotalGameTicketRevenue.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalGameTicketRevenue.setFont(UI_Elements.font_bodyLabel);
		lblTotalGameTicketRevenue.setBorder(null);
		lblTotalGameTicketRevenue.setBounds(lblTotalNumOfGameTickets.getBounds().x, lblTotalNumOfGameTickets.getBounds().y+lblTotalNumOfGameTickets.getBounds().height+lineSpacing*2, 250, lblTotalNumOfGameTickets.getBounds().height);
		panelTickets.add(lblTotalGameTicketRevenue);
		
		tf_TotalRevenueGameTickets = new JTextField();
		tf_TotalRevenueGameTickets.setAlignmentY(Component.TOP_ALIGNMENT);
		tf_TotalRevenueGameTickets.setBorder(null);
		tf_TotalRevenueGameTickets.setOpaque(false);
		tf_TotalRevenueGameTickets.setBackground(Color.WHITE);
		tf_TotalRevenueGameTickets.setBounds(tf_TotalAttendance.getBounds().x, lblTotalGameTicketRevenue.getBounds().y, 150, 20);
		tf_TotalRevenueGameTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalRevenueGameTickets.setEnabled(true);
		tf_TotalRevenueGameTickets.setEditable(false);
		tf_TotalRevenueGameTickets.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalRevenueGameTickets.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalRevenueGameTickets);
		
		lblTotalSingleVIP = new JLabel("Total VIP:");
		lblTotalSingleVIP.setAlignmentY(Component.TOP_ALIGNMENT);
		lblTotalSingleVIP.setVerticalAlignment(SwingConstants.TOP);
		lblTotalSingleVIP.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalSingleVIP.setFont(UI_Elements.font_bodyLabel);
		lblTotalSingleVIP.setBorder(null);
		lblTotalSingleVIP.setBounds(lblTotalGameTicketRevenue.getBounds().x+20, lblTotalGameTicketRevenue.getBounds().y+lblTotalGameTicketRevenue.getBounds().height+lineSpacing, 250, lblTotalGameTicketRevenue.getBounds().height);
		panelTickets.add(lblTotalSingleVIP);
		
		tf_TotalSingleVIP = new JTextField();
		tf_TotalSingleVIP.setAlignmentY(Component.TOP_ALIGNMENT);
		tf_TotalSingleVIP.setBorder(null);
		tf_TotalSingleVIP.setOpaque(false);
		tf_TotalSingleVIP.setBackground(Color.WHITE);
		tf_TotalSingleVIP.setBounds(tf_TotalRevenueGameTickets.getBounds().x, lblTotalSingleVIP.getBounds().y, 150, tf_TotalRevenueGameTickets.getBounds().height);
		tf_TotalSingleVIP.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalSingleVIP.setEnabled(true);
		tf_TotalSingleVIP.setEditable(false);
		tf_TotalSingleVIP.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalSingleVIP.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalSingleVIP);
		
		lblTotalSingleClubLevel = new JLabel("Total Club Level:");
		lblTotalSingleClubLevel.setAlignmentY(Component.TOP_ALIGNMENT);
		lblTotalSingleClubLevel.setVerticalAlignment(SwingConstants.TOP);
		lblTotalSingleClubLevel.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalSingleClubLevel.setFont(UI_Elements.font_bodyLabel);
		lblTotalSingleClubLevel.setBorder(null);
		lblTotalSingleClubLevel.setBounds(lblTotalSingleVIP.getBounds().x, lblTotalSingleVIP.getBounds().y+lblTotalSingleVIP.getBounds().height+lineSpacing, 180, lblTotalSingleVIP.getBounds().height);
		panelTickets.add(lblTotalSingleClubLevel);
		
		tf_TotalSingleClubLevel = new JTextField();
		tf_TotalSingleClubLevel.setAlignmentY(Component.TOP_ALIGNMENT);
		tf_TotalSingleClubLevel.setBorder(null);
		tf_TotalSingleClubLevel.setOpaque(false);
		tf_TotalSingleClubLevel.setBackground(Color.WHITE);
		tf_TotalSingleClubLevel.setBounds(tf_TotalSingleVIP.getBounds().x, lblTotalSingleClubLevel.getBounds().y, 150, tf_TotalSingleVIP.getBounds().height);
		tf_TotalSingleClubLevel.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalSingleClubLevel.setEnabled(true);
		tf_TotalSingleClubLevel.setEditable(false);
		tf_TotalSingleClubLevel.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalSingleClubLevel.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalSingleClubLevel);
		
		
		lblTotalSingleBleachers = new JLabel("Total Bleachers:");
		lblTotalSingleBleachers.setAlignmentY(Component.TOP_ALIGNMENT);
		lblTotalSingleBleachers.setVerticalAlignment(SwingConstants.TOP);
		lblTotalSingleBleachers.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalSingleBleachers.setFont(UI_Elements.font_bodyLabel);
		lblTotalSingleBleachers.setBorder(null);
		lblTotalSingleBleachers.setBounds(lblTotalSingleClubLevel.getBounds().x, lblTotalSingleClubLevel.getBounds().y+lblTotalSingleClubLevel.getBounds().height+lineSpacing, 180, lblTotalSingleClubLevel.getBounds().height);
		panelTickets.add(lblTotalSingleBleachers);
		
		tf_TotalSingleBleachers = new JTextField();
		tf_TotalSingleBleachers.setAlignmentY(Component.TOP_ALIGNMENT);
		tf_TotalSingleBleachers.setBorder(null);
		tf_TotalSingleBleachers.setOpaque(false);
		tf_TotalSingleBleachers.setBackground(Color.WHITE);
		tf_TotalSingleBleachers.setBounds(tf_TotalSingleClubLevel.getBounds().x, lblTotalSingleBleachers.getBounds().y, 150, tf_TotalSingleClubLevel.getBounds().height);
		tf_TotalSingleBleachers.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalSingleBleachers.setEnabled(true);
		tf_TotalSingleBleachers.setEditable(false);
		tf_TotalSingleBleachers.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalSingleBleachers.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalSingleBleachers);
		
	}
	
}
