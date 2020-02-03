package view;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Menu extends JPanel {
	
	//---set menu panels---//
	public JPanel menuPanel;
	public JPanel overviewPanel;
	//---------------------//


	public JLabel HeaderBG;
	public ImageIcon HeaderLogo = new ImageIcon(Menu.class.getResource("/Images/LogoHeader_HighRes.png"));
	public JButton btnOverview;
	public JButton btnProperties;
	public JButton btnSales;
	public JButton btnFacilities;
	public JButton btnUserName;
	public JButton btnLogout;
	public JButton btnGames;
	
	public Menu() {
		
		menuPanel = new JPanel();
		menuPanel.setBackground(UI_Elements.color_menuBar);
		menuPanel.setBounds(0, 0, 1114, 600);
		menuPanel.setLayout(null);
		
		HeaderBG = new JLabel();
		HeaderBG.setBorder(null);
		HeaderBG.setBackground(new Color(28, 23, 92));
		HeaderBG.setBounds(0, 0, 190, 100);
		menuPanel.add(HeaderBG);
		HeaderBG.setIcon(UI_Elements.scaleImageToBox(HeaderLogo, HeaderBG));

		btnOverview = new JButton("OVERVIEW");
		btnOverview.setAlignmentY(0.0f);
		btnOverview.setFocusPainted(false);
		btnOverview.setRequestFocusEnabled(false);
		btnOverview.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOverview.setHorizontalAlignment(SwingConstants.CENTER);
		btnOverview.setForeground(UI_Elements.color_menuButtonText);
		btnOverview.setOpaque(true);
		btnOverview.setBorder(null);
		btnOverview.setFont(UI_Elements.font_AgencyMenu);
		btnOverview.setBackground(UI_Elements.color_menuButtonSelected);
		btnOverview.setBounds(0, 100, 189, 40);
		menuPanel.add(btnOverview);

		btnProperties = new JButton("PROPERTIES");
		btnProperties.setAlignmentY(0.0f);
		btnProperties.setFocusPainted(false);
		btnProperties.setRequestFocusEnabled(false);
		btnProperties.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProperties.setHorizontalAlignment(SwingConstants.CENTER);
		btnProperties.setForeground(UI_Elements.color_menuButtonText);
		btnProperties.setOpaque(true);
		btnProperties.setBorder(null);
		btnProperties.setFont(UI_Elements.font_AgencyMenu);
		btnProperties.setBackground(UI_Elements.color_menuBar);
		btnProperties.setBounds(0, (btnOverview.getBounds().y) + 40, 189, 40);
		menuPanel.add(btnProperties);


		btnSales = new JButton("SALES");
		btnSales.setAlignmentY(0.0f);
		btnSales.setFocusPainted(false);
		btnSales.setRequestFocusEnabled(false);
		btnSales.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSales.setHorizontalAlignment(SwingConstants.CENTER);
		btnSales.setForeground(UI_Elements.color_menuButtonText);
		btnSales.setOpaque(true);
		btnSales.setBorder(null);
		btnSales.setFont(UI_Elements.font_AgencyMenu);
		btnSales.setBackground(UI_Elements.color_menuBar);
		btnSales.setBounds(0, (btnOverview.getBounds().y) + 40 * 2, 189, 40);
		menuPanel.add(btnSales);

		btnFacilities = new JButton("FACILITIES");
		btnFacilities.setAlignmentY(0.0f);
		btnFacilities.setFocusPainted(false);
		btnFacilities.setRequestFocusEnabled(false);
		btnFacilities.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFacilities.setHorizontalAlignment(SwingConstants.CENTER);
		btnFacilities.setForeground(UI_Elements.color_menuButtonText);
		btnFacilities.setOpaque(true);
		btnFacilities.setBorder(null);
		btnFacilities.setFont(UI_Elements.font_AgencyMenu);
		btnFacilities.setBackground(UI_Elements.color_menuBar);
		btnFacilities.setBounds(0, (btnOverview.getBounds().y) + 40 * 3, 189, 40);
		menuPanel.add(btnFacilities);
		
		btnGames = new JButton("GAMES");
		btnGames.setAlignmentY(0.0f);
		btnGames.setFocusPainted(false);
		btnGames.setRequestFocusEnabled(false);
		btnGames.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGames.setHorizontalAlignment(SwingConstants.CENTER);
		btnGames.setForeground(UI_Elements.color_menuButtonText);
		btnGames.setOpaque(true);
		btnGames.setBorder(null);
		btnGames.setFont(UI_Elements.font_AgencyMenu);
		btnGames.setBackground(UI_Elements.color_menuBar);
		btnGames.setBounds(0, (btnOverview.getBounds().y) + 40 * 4, 189, 40);
		menuPanel.add(btnGames);
		
		
		btnUserName = new JButton("");
		btnUserName.setAlignmentY(0.0f);
		btnUserName.setFocusPainted(false);
		btnUserName.setRequestFocusEnabled(false);
		btnUserName.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUserName.setHorizontalAlignment(SwingConstants.CENTER);
		btnUserName.setForeground(UI_Elements.color_menuButtonText);
		btnUserName.setOpaque(true);
		btnUserName.setBorder(null);
		btnUserName.setFont(UI_Elements.font_AgencyMenu);
		btnUserName.setBackground(UI_Elements.color_menuBar);
		btnUserName.setBounds(0, (btnOverview.getBounds().y) + 41 * 10, 189, 40);
		menuPanel.add(btnUserName);
		btnUserName.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnUserName.setBackground(UI_Elements.color_menuButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(btnLogout.isVisible() == true)
		    	{
		    		btnUserName.setBackground(UI_Elements.color_menuButtonSelected);
		    	}
		    	else
		    	{
		    		btnUserName.setBackground(UI_Elements.color_menuBar);
		    	}
		    }
		} );

		
		btnLogout = new JButton("LOGOUT");
		btnLogout.setAlignmentY(0.0f);
		btnLogout.setFocusPainted(false);
		btnLogout.setRequestFocusEnabled(false);
		btnLogout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogout.setHorizontalAlignment(SwingConstants.CENTER);
		btnLogout.setForeground(UI_Elements.color_menuButtonText);
		btnLogout.setOpaque(true);
		btnLogout.setBorder(null);
		btnLogout.setFont(UI_Elements.font_AgencyMenuUsername);
		btnLogout.setBackground(UI_Elements.color_menuBar);
		btnLogout.setBounds(0, (btnUserName.getBounds().y) - 25, 189, 25);
		btnLogout.setVisible(false);
		menuPanel.add(btnLogout);
		btnLogout.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnLogout.setBackground(UI_Elements.color_menuButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    		btnLogout.setBackground(UI_Elements.color_menuBar);
		    }
		} );

	}
	
}
