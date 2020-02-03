package view;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Games extends JPanel {
	
	public JPanel panelGames;
	private JLabel titleGames;
	public ViewStadium gamesStadiumPanel;
	
	private JLabel lblStadiumLegend;
	private ImageIcon stadiumLegend = new ImageIcon(Overview.class.getResource("/Images/StadiumLegend.png"));
	
	private JLabel lblSeason;
	private JLabel lblGame;
	public JComboBox<String> cb_Season;
	public JComboBox<String> cb_Game;
	private JButton btnAddSeason;
	private JButton btnAddGame;
	
	private List<JPanel> gamesPanelSubPanels = new ArrayList<JPanel>();
	private List<JButton> gamesPanelButtons = new ArrayList<JButton>();
	public GamesAddSeason addSeasonPanel;
	public GamesAddGame addGamePanel;
	public GamesSectionDetails sectionDetailsPanel;
	
	public Games(){
		
		panelGames = new JPanel();
		panelGames.setBorder(null);
		panelGames.setBackground(UI_Elements.color_mainBackgroundColor);
		panelGames.setBounds(189, 0, 925, 617);
		panelGames.setLayout(null);
		// Overview Page Title
		titleGames = new JLabel("GAMES");
		titleGames.setVerticalAlignment(SwingConstants.TOP);
		titleGames.setBounds(25, 22, 470, 76);
		titleGames.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleGames.setForeground(Color.WHITE);
		titleGames.setFont(UI_Elements.font_AgencyPanelTitle);
		panelGames.add(titleGames);
		
		gamesStadiumPanel = new ViewStadium();
		gamesStadiumPanel.setLayout(null);
		gamesStadiumPanel.setBounds((int) (panelGames.getBounds().width-gamesStadiumPanel.stadiumLblWidth)-30, 85, gamesStadiumPanel.panelViewStadium.getBounds().width, gamesStadiumPanel.panelViewStadium.getBounds().height);
		gamesStadiumPanel.setVisible(true);
		panelGames.add(gamesStadiumPanel);
		gamesStadiumPanel.add(gamesStadiumPanel.panelViewStadium);
		
		lblStadiumLegend = new JLabel();
		lblStadiumLegend.setBounds(gamesStadiumPanel.getBounds().x, gamesStadiumPanel.getBounds().y + gamesStadiumPanel.getBounds().height, 555, 60);
		lblStadiumLegend.setIcon(UI_Elements.scaleImageToBox(stadiumLegend, lblStadiumLegend));
		lblStadiumLegend.setOpaque(false);
		lblStadiumLegend.setBorder(null);
		panelGames.add(lblStadiumLegend);
		
		lblSeason = new JLabel("Season:");
		lblSeason.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblSeason.setForeground(Color.WHITE);
		lblSeason.setFont(UI_Elements.font_bodyLabel);
		lblSeason.setBorder(null);
		lblSeason.setBounds(35,gamesStadiumPanel.getBounds().y + 5 , 65, 20);
		panelGames.add(lblSeason);
		
		cb_Season = new JComboBox<String>();
		cb_Season.setFont(UI_Elements.font_bodyFillText);
		cb_Season.setModel(new DefaultComboBoxModel<String>(new String[] {}));
		cb_Season.setBounds(100, lblSeason.getBounds().y, 200, 20);
		panelGames.add(cb_Season);
		gamesStadiumPanel.observerComboboxes.add(cb_Season);
		
		lblGame = new JLabel("Game:");
		lblGame.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblGame.setForeground(Color.WHITE);
		lblGame.setFont(UI_Elements.font_bodyLabel);
		lblGame.setBorder(null);
		lblGame.setBounds(35, (lblSeason.getBounds().y)+30, 65, 20);
		panelGames.add(lblGame);
		
		cb_Game = new JComboBox<String>();
		cb_Game.setFont(UI_Elements.font_bodyFillText);
		cb_Game.setModel(new DefaultComboBoxModel<String>(new String[] {}));
		cb_Game.setBounds(100, (cb_Season.getBounds().y)+30, 200, 20);
		panelGames.add(cb_Game);
		gamesStadiumPanel.observerComboboxes.add(cb_Game);

		
		
		//Buttons
		btnAddSeason = new JButton("   ADD SEASON");
		btnAddSeason.setFocusPainted(false);
		btnAddSeason.setRequestFocusEnabled(false);
		btnAddSeason.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddSeason.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddSeason.setForeground(Color.WHITE);
		btnAddSeason.setOpaque(true);
		btnAddSeason.setBorder(null);
		btnAddSeason.setFont(UI_Elements.font_AgencyBodyButton);
		btnAddSeason.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnAddSeason.setBounds(35, lblGame.getBounds().y + lblGame.getBounds().height + 15, 265, 40);
		panelGames.add(btnAddSeason);
		btnAddSeason.setSelected(false);
		btnAddSeason.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddSeason.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(btnAddSeason.isSelected() == true)
		    	{
		    		btnAddSeason.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnAddSeason.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    	}
		    }
		} );
		gamesStadiumPanel.observerButtons.add(btnAddSeason);
		
		btnAddGame = new JButton("   ADD GAME");
		btnAddGame.setFocusPainted(false);
		btnAddGame.setRequestFocusEnabled(false);
		btnAddGame.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddGame.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddGame.setForeground(Color.WHITE);
		btnAddGame.setOpaque(true);
		btnAddGame.setBorder(null);
		btnAddGame.setFont(UI_Elements.font_AgencyBodyButton);
		btnAddGame.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnAddGame.setBounds(35, (btnAddSeason.getBounds().y)+55, 265, 40);
		panelGames.add(btnAddGame);
		btnAddGame.setSelected(false);
		btnAddGame.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddGame.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(btnAddGame.isSelected() == true)
		    	{
		    		btnAddGame.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnAddGame.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    	}
		    }
		} );
		gamesStadiumPanel.observerButtons.add(btnAddGame);

		
		//Sub-panels
		sectionDetailsPanel = new GamesSectionDetails();
		sectionDetailsPanel.setBounds(0, 265, sectionDetailsPanel.panelSectionDetails.getBounds().width, sectionDetailsPanel.panelSectionDetails.getBounds().height);
		panelGames.add(sectionDetailsPanel);
		sectionDetailsPanel.add(sectionDetailsPanel.panelSectionDetails);
		sectionDetailsPanel.setLayout(null);
		gamesStadiumPanel.assignDetailsPanel(sectionDetailsPanel.panelSectionDetails);
		
		addSeasonPanel = new GamesAddSeason();
		addSeasonPanel.setBounds(sectionDetailsPanel.getBounds().x, sectionDetailsPanel.getBounds().y, addSeasonPanel.panelAddSeason.getBounds().width, addSeasonPanel.panelAddSeason.getBounds().height);
		panelGames.add(addSeasonPanel);
		addSeasonPanel.add(addSeasonPanel.panelAddSeason);
		addSeasonPanel.setLayout(null);
		addSeasonPanel.addObserverButton(btnAddSeason);
		addSeasonPanel.addObserverButton(btnAddGame);
		
		
		addGamePanel = new GamesAddGame();
		addGamePanel.setBounds(addSeasonPanel.getBounds().x, addSeasonPanel.getBounds().y, addGamePanel.panelAddGame.getBounds().width, addGamePanel.panelAddGame.getBounds().height);
		panelGames.add(addGamePanel);
		addGamePanel.add(addGamePanel.panelAddGame);
		addGamePanel.setLayout(null);
		addGamePanel.addObserverButton(btnAddSeason);
		addGamePanel.addObserverButton(btnAddGame);
		
		
		gamesPanelButtons.add(btnAddSeason);
		gamesPanelButtons.add(btnAddGame);
		
		gamesPanelSubPanels.add(addSeasonPanel);
		gamesPanelSubPanels.add(addSeasonPanel.panelAddSeason);
		gamesPanelSubPanels.add(addGamePanel);
		gamesPanelSubPanels.add(addGamePanel.panelAddGame);
		gamesPanelSubPanels.add(sectionDetailsPanel);

		
		//Action Listeners
		btnAddSeason.addActionListener(GamesPanelButtonActions(btnAddSeason,addSeasonPanel,addSeasonPanel.panelAddSeason));
		btnAddGame.addActionListener(GamesPanelButtonActions(btnAddGame,addGamePanel,addGamePanel.panelAddGame));
		
	}
	
	
	private ActionListener GamesPanelButtonActions(JButton i_Button, JPanel i_OuterPanel, JPanel i_InnerPanel)
	{
		ActionListener ac = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(i_Button.isSelected() == false)
				{
					disableAllButtons(gamesPanelButtons);
					disableAllPanels(gamesPanelSubPanels);
					i_Button.setSelected(true);
					i_Button.setEnabled(true);
					i_Button.setBackground(UI_Elements.color_panelBodyButtonSelected);
					i_OuterPanel.setVisible(true);
					i_InnerPanel.setVisible(true);
					if(gamesStadiumPanel.detailsPanel != null)
					{
						gamesStadiumPanel.detailsPanel.setVisible(false);
					}
					gamesStadiumPanel.removeDetailsPanel(sectionDetailsPanel.panelSectionDetails);
				}
				else
				{
					disableAllPanels(gamesPanelSubPanels);
					revertButtonToDefault(i_Button, gamesPanelButtons);
					sectionDetailsPanel.setVisible(true);
					gamesStadiumPanel.assignDetailsPanel(sectionDetailsPanel.panelSectionDetails);
					if(gamesStadiumPanel.numOfSelected>0)
					{
						gamesStadiumPanel.detailsPanel.setVisible(true);
					}
				}
			}
		};
		
		return ac;
	}
	
	public void disableAllButtons(List<JButton> i_ButtonList)
	{
		for(JButton button : i_ButtonList)
		{
			button.setSelected(false);
			button.setEnabled(false);
			button.setBackground(UI_Elements.color_panelBodyButtonDefault);
		}
	}
	
	public void disableAllPanels(List<JPanel> i_PanelList)
	{
		for(JPanel panel : i_PanelList)
		{
			panel.setVisible(false);
		}
	}
	
	public void revertButtonToDefault(JButton i_Button ,List<JButton> i_ButtonList)
	{
		for(JButton button : i_ButtonList)
		{
			button.setSelected(false);
			button.setEnabled(true);
		}
		i_Button.setBackground(UI_Elements.color_panelBodyButtonDefault);
	}
}
