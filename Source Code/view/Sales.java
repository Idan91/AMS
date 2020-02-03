package view;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Sales extends JPanel {

	public JPanel panelSales;
	public SalesTickets ticketsPanel;
	public SalesSponsorship sponsorshipPanel;

	public JButton btnSponsorship;
	public JButton btnTickets;
	public JButton btnDisplayTicketData;
	
	private JLabel titleSales;
	private JLabel lblSeason;
	private JLabel lblGame;
	
	public JComboBox<String> cb_SalesSeason;
	public JComboBox<String> cb_SalesGame;
	
	public int selectedSeasonIndex;
	public int selectedGameIndex;

	
	public ArrayList<JComponent> comboList = new ArrayList<JComponent>();
	
	public Sales() {
		//Sales Panel Settings
		panelSales = new JPanel();
		panelSales.setBorder(null);
		panelSales.setBackground(UI_Elements.color_mainBackgroundColor);
		panelSales.setBounds(189, 0, 925, 617);
		panelSales.setLayout(null);
		//STARTUP STATE
		panelSales.setVisible(false);
		
		
		//Sales Page Title
		titleSales = new JLabel("SALES");
		titleSales.setVerticalAlignment(SwingConstants.TOP);
		titleSales.setBounds(25, 22, 246, 76);
		titleSales.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleSales.setForeground(Color.WHITE);
		titleSales.setFont(UI_Elements.font_AgencyPanelTitle);
		panelSales.add(titleSales);
		
		
		//Buttons
		btnSponsorship = new JButton("   SPONSORSHIP");
		btnSponsorship.setFocusPainted(false);
		btnSponsorship.setRequestFocusEnabled(false);
		btnSponsorship.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSponsorship.setHorizontalAlignment(SwingConstants.LEFT);
		btnSponsorship.setForeground(Color.WHITE);
		btnSponsorship.setOpaque(true);
		btnSponsorship.setBorder(null);
		btnSponsorship.setFont(UI_Elements.font_AgencyBodyButton);
		btnSponsorship.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnSponsorship.setBounds(35, 103, 265, 40);
		panelSales.add(btnSponsorship);
		btnSponsorship.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnSponsorship.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(sponsorshipPanel.isVisible() == true)
		    	{
		    		btnSponsorship.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnSponsorship.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    	}
		    }
		} );
		
		btnTickets = new JButton("   TICKETS");
		btnTickets.setFocusPainted(false);
		btnTickets.setRequestFocusEnabled(false);
		btnTickets.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTickets.setHorizontalAlignment(SwingConstants.LEFT);
		btnTickets.setForeground(Color.WHITE);
		btnTickets.setOpaque(true);
		btnTickets.setBorder(null);
		btnTickets.setFont(UI_Elements.font_AgencyBodyButton);
		btnTickets.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnTickets.setBounds(35, (btnSponsorship.getBounds().y)+55, btnSponsorship.getBounds().width, btnSponsorship.getBounds().height);
		panelSales.add(btnTickets);
		btnTickets.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnTickets.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(ticketsPanel.isVisible() == true)
		    	{
		    		btnTickets.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnTickets.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    	}
		    }
		} );
		
		
		
		//Comboboxes
		lblSeason = new JLabel("Season:");
		lblSeason.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblSeason.setForeground(Color.WHITE);
		lblSeason.setFont(UI_Elements.font_bodyLabel);
		lblSeason.setBorder(null);
		lblSeason.setBounds(btnTickets.getBounds().x, btnTickets.getBounds().y+60, 65, 20);
		panelSales.add(lblSeason);
		comboList.add(lblSeason);
		
		cb_SalesSeason = new JComboBox<String>();
		cb_SalesSeason.setFont(UI_Elements.font_bodyFillText);
		cb_SalesSeason.setModel(new DefaultComboBoxModel<String>(new String[] {}));
		cb_SalesSeason.setBounds(100, lblSeason.getBounds().y, 200, 20);
		panelSales.add(cb_SalesSeason);
		comboList.add(cb_SalesSeason);

		
		lblGame = new JLabel("Game:");
		lblGame.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblGame.setForeground(Color.WHITE);
		lblGame.setFont(UI_Elements.font_bodyLabel);
		lblGame.setBorder(null);
		lblGame.setBounds(lblSeason.getBounds().x, (lblSeason.getBounds().y)+30, lblSeason.getBounds().width, lblSeason.getBounds().height);
		panelSales.add(lblGame);
		comboList.add(lblGame);

		
		cb_SalesGame = new JComboBox<String>();
		cb_SalesGame.setFont(UI_Elements.font_bodyFillText);
		cb_SalesGame.setModel(new DefaultComboBoxModel<String>(new String[] {}));
		cb_SalesGame.setBounds(cb_SalesSeason.getBounds().x, (cb_SalesSeason.getBounds().y)+30, cb_SalesSeason.getBounds().width, cb_SalesSeason.getBounds().height);
		panelSales.add(cb_SalesGame);
		comboList.add(cb_SalesGame);

		btnDisplayTicketData = new JButton("DISPLAY TICKET DATA");
		btnDisplayTicketData.setVisible(true);
		btnDisplayTicketData.setBounds(lblGame.getBounds().x, (lblGame.getBounds().y)+35, 160, 30);
		btnDisplayTicketData.setFocusPainted(false);
		btnDisplayTicketData.setRequestFocusEnabled(false);
		btnDisplayTicketData.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDisplayTicketData.setHorizontalAlignment(SwingConstants.CENTER);
		btnDisplayTicketData.setForeground(Color.WHITE);
		btnDisplayTicketData.setOpaque(true);
		btnDisplayTicketData.setBorder(null);
		btnDisplayTicketData.setFont(UI_Elements.font_AgencyActionButton);
		btnDisplayTicketData.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnDisplayTicketData.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnDisplayTicketData.setBackground(UI_Elements.color_panelBodyButtonRollover);
			}

			public void mouseExited(MouseEvent e) {
				btnDisplayTicketData.setBackground(UI_Elements.color_panelBodyButtonDefault);

			}
		});
		panelSales.add(btnDisplayTicketData);
		
		btnDisplayTicketData.setVisible(false);
		
		for(JComponent component : comboList)
		{
			component.setVisible(false);
		}
		
		//Tickets sub-panel
		ticketsPanel = new SalesTickets();
		ticketsPanel.setBounds(330, 0, ticketsPanel.panelTickets.getBounds().width, ticketsPanel.panelTickets.getBounds().height);
		panelSales.add(ticketsPanel);
		ticketsPanel.add(ticketsPanel.panelTickets);
		ticketsPanel.setLayout(null);
		ticketsPanel.setVisible(false);
		
		
		//Sponsorship sub-panel
		
		sponsorshipPanel = new SalesSponsorship();
		sponsorshipPanel.setBounds(330, 0, sponsorshipPanel.panelSponsorship.getBounds().width, sponsorshipPanel.panelSponsorship.getBounds().height);
		panelSales.add(sponsorshipPanel);
		sponsorshipPanel.add(sponsorshipPanel.panelSponsorship);
		sponsorshipPanel.setLayout(null);
		sponsorshipPanel.setVisible(false);
		

		
		
		//Action listeners
		btnSponsorship.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ticketsPanel.setVisible(false);
				ticketsPanel.panelTickets.setVisible(false);
				btnTickets.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				sponsorshipPanel.setVisible(true);
				sponsorshipPanel.panelSponsorship.setVisible(true);
				btnSponsorship.setBackground(UI_Elements.color_panelBodyButtonSelected);
				
				if(comboList.get(0).isVisible())
				{
					for(JComponent component : comboList)
					{
						component.setVisible(false);
					}
				}
				btnDisplayTicketData.setVisible(false);
				sponsorshipPanel.revalidate();
			}
		});
		
		btnTickets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ticketsPanel.setVisible(true);
				ticketsPanel.panelTickets.setVisible(false);
				btnTickets.setBackground(UI_Elements.color_panelBodyButtonSelected);
				
				sponsorshipPanel.setVisible(false);
				sponsorshipPanel.panelSponsorship.setVisible(false);
				btnSponsorship.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				for(JComponent component : comboList)
				{
					component.setVisible(true);
				}
				btnDisplayTicketData.setVisible(true);
				ticketsPanel.revalidate();
			}
		});
		
		panelSales.setVisible(false);
	}
}
