package view;

import java.awt.Color;
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
public class GamesAddTicketSale extends JFrame {

	public JPanel panelAddTicketSale;
	private JLabel titleAddTicketSale;
	private int lineSpacing = 10;
	public JLabel lblSectionNumber;
	private JLabel lblSectionType;
	public JLabel lblSectionTypeValue;
	public JLabel lblTicketPriceValue;
	private JLabel lblTicketPrice;
	private JLabel lblAvailableTickets;
	public JLabel lblAvailableTicketsValue;
	private JLabel lblDesiredAmount;
	public JTextField tf_DesiredAmount;
	public JButton btnFinish;
	public JButton btnCancel;
	public JLabel lblErrorMessage_InavlidValue;
	public JLabel lblErrorMessage_ValueOutOfRange;

	
	public GamesAddTicketSale() {
		//set Frame:
		setBounds(385, 55, 400, 350);
		this.setResizable(false);
		panelAddTicketSale = new JPanel();
		panelAddTicketSale.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelAddTicketSale.setBackground(UI_Elements.color_menuBar);
		setContentPane(panelAddTicketSale);
		panelAddTicketSale.setLayout(null);
		panelAddTicketSale.setVisible(true);
		this.setIconImage(UI_Elements.amsIcon.getImage());
		
		titleAddTicketSale = new JLabel("ADD TICKET SALE");
		titleAddTicketSale.setVerticalAlignment(SwingConstants.TOP);
		titleAddTicketSale.setBounds(25, 22, 265, 30);
		titleAddTicketSale.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleAddTicketSale.setForeground(Color.WHITE);
		titleAddTicketSale.setFont(UI_Elements.font_AgencyMediumPanelTitle);
		panelAddTicketSale.add(titleAddTicketSale);
		
		lblSectionNumber = new JLabel();
		lblSectionNumber.setVerticalAlignment(SwingConstants.TOP);
		lblSectionNumber.setBounds(titleAddTicketSale.getBounds().x, titleAddTicketSale.getBounds().y+titleAddTicketSale.getBounds().height+25, 265, 26);
		lblSectionNumber.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblSectionNumber.setForeground(Color.WHITE);
		lblSectionNumber.setFont(UI_Elements.font_AgencyHeader);
		panelAddTicketSale.add(lblSectionNumber);
		
		lblSectionType = new JLabel("Section Type:");
		lblSectionType.setBorder(null);
		lblSectionType.setForeground(Color.WHITE);
		lblSectionType.setFont(UI_Elements.font_bodyLabel);
		lblSectionType.setBounds(lblSectionNumber.getBounds().x, lblSectionNumber.getBounds().y+lblSectionNumber.getBounds().height+lineSpacing*2, 115, 20);
		panelAddTicketSale.add(lblSectionType);
		
		lblSectionTypeValue  = new JLabel();
		lblSectionTypeValue.setBorder(null);
		lblSectionTypeValue.setOpaque(false);
		lblSectionTypeValue.setBounds(lblSectionType.getBounds().x+lblSectionType.getBounds().width+15, lblSectionType.getBounds().y, 150, 20);
		lblSectionTypeValue.setForeground(Color.WHITE);
		lblSectionTypeValue.setEnabled(true);
		lblSectionTypeValue.setHorizontalAlignment(SwingConstants.LEFT);
		lblSectionTypeValue.setFont(UI_Elements.font_bodyLabel);
		panelAddTicketSale.add(lblSectionTypeValue);
		
		lblTicketPrice = new JLabel("Ticket Price:");
		lblTicketPrice.setBorder(null);
		lblTicketPrice.setForeground(Color.WHITE);
		lblTicketPrice.setFont(UI_Elements.font_bodyLabel);
		lblTicketPrice.setBounds(lblSectionType.getBounds().x, lblSectionType.getBounds().y+lblSectionType.getBounds().height+lineSpacing, 115, 20);
		panelAddTicketSale.add(lblTicketPrice);
		
		lblTicketPriceValue  = new JLabel();
		lblTicketPriceValue.setBorder(null);
		lblTicketPriceValue.setOpaque(false);
		lblTicketPriceValue.setBounds(lblTicketPrice.getBounds().x+lblTicketPrice.getBounds().width+15, lblTicketPrice.getBounds().y, 150, 20);
		lblTicketPriceValue.setForeground(Color.WHITE);
		lblTicketPriceValue.setEnabled(true);
		lblTicketPriceValue.setHorizontalAlignment(SwingConstants.LEFT);
		lblTicketPriceValue.setFont(UI_Elements.font_bodyLabel);
		panelAddTicketSale.add(lblTicketPriceValue);
		
		lblAvailableTickets = new JLabel("Available Tickets:");
		lblAvailableTickets.setBorder(null);
		lblAvailableTickets.setForeground(Color.WHITE);
		lblAvailableTickets.setFont(UI_Elements.font_bodyLabel);
		lblAvailableTickets.setBounds(lblTicketPrice.getBounds().x, lblTicketPrice.getBounds().y+lblTicketPrice.getBounds().height+lineSpacing, 115, 20);
		panelAddTicketSale.add(lblAvailableTickets);
		
		lblAvailableTicketsValue  = new JLabel();
		lblAvailableTicketsValue.setBorder(null);
		lblAvailableTicketsValue.setOpaque(false);
		lblAvailableTicketsValue.setBounds(lblAvailableTickets.getBounds().x+lblAvailableTickets.getBounds().width+15, lblAvailableTickets.getBounds().y, 150, 20);
		lblAvailableTicketsValue.setForeground(Color.WHITE);
		lblAvailableTicketsValue.setEnabled(true);
		lblAvailableTicketsValue.setHorizontalAlignment(SwingConstants.LEFT);
		lblAvailableTicketsValue.setFont(UI_Elements.font_bodyLabel);
		panelAddTicketSale.add(lblAvailableTicketsValue);
		
		lblDesiredAmount = new JLabel("Desired Amount:");
		lblDesiredAmount.setVerticalAlignment(SwingConstants.CENTER);
		lblDesiredAmount.setBorder(null);
		lblDesiredAmount.setForeground(Color.WHITE);
		lblDesiredAmount.setFont(UI_Elements.font_bodyLabel);
		lblDesiredAmount.setBounds(lblAvailableTickets.getBounds().x, lblAvailableTickets.getBounds().y+lblAvailableTickets.getBounds().height+lineSpacing, 115, 20);
		panelAddTicketSale.add(lblDesiredAmount);
		
		tf_DesiredAmount  = new JTextField();
		tf_DesiredAmount.setBorder(null);
		tf_DesiredAmount.setOpaque(true);
		tf_DesiredAmount.setBounds(lblDesiredAmount.getBounds().x+lblDesiredAmount.getBounds().width+15, lblDesiredAmount.getBounds().y-2, 150, 20);
		tf_DesiredAmount.setDisabledTextColor(Color.BLACK);
		tf_DesiredAmount.setEnabled(true);
		tf_DesiredAmount.setEditable(true);
		tf_DesiredAmount.setHorizontalAlignment(SwingConstants.LEFT);
		tf_DesiredAmount.setFont(UI_Elements.font_bodyFillText);
		tf_DesiredAmount.setColumns(10);
		panelAddTicketSale.add(tf_DesiredAmount);
		
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
		btnFinish.setBounds(lblDesiredAmount.getBounds().x, lblDesiredAmount.getBounds().y+lblDesiredAmount.getBounds().height+lineSpacing*2, 75, 25);
		btnFinish.setSelected(false);
		panelAddTicketSale.add(btnFinish);
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
		panelAddTicketSale.add(btnCancel);
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
		panelAddTicketSale.add(lblErrorMessage_InavlidValue);
		
		lblErrorMessage_ValueOutOfRange = new JLabel("Amount exceeds available tickets left in this section"); 
		lblErrorMessage_ValueOutOfRange.setBounds(btnFinish.getBounds().x, btnFinish.getBounds().y+btnFinish.getBounds().height+lineSpacing+5, 335, 30);
		lblErrorMessage_ValueOutOfRange.setHorizontalAlignment(SwingConstants.LEFT);
		lblErrorMessage_ValueOutOfRange.setFont(UI_Elements.font_errorMessage);;
		lblErrorMessage_ValueOutOfRange.setForeground(Color.RED);
		lblErrorMessage_ValueOutOfRange.setVisible(false);
		panelAddTicketSale.add(lblErrorMessage_ValueOutOfRange);
		
	}
}

