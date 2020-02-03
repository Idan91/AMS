package view;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class GamesAddSeason extends JPanel {
	
	public JPanel panelAddSeason;
	private JLabel titleAddSeason;
	private JLabel lblSeasonName;
	public JTextField tf_SeasonName;
	private JLabel lblLeagueName;
	public JTextField tf_LeagueName;
	public JButton btnAddSeasonFinish;
	public JButton btnAddSeasonCancel;
	
	private List<JButton> observerButtons = new ArrayList<JButton>();
	
	public GamesAddSeason() {
		setBackground(UI_Elements.color_mainBackgroundColor);
		
		panelAddSeason = new JPanel();
		panelAddSeason.setBorder(null);
		panelAddSeason.setBackground(UI_Elements.color_mainBackgroundColor);
		panelAddSeason.setBounds(0, 5, 340, 352);
		panelAddSeason.setLayout(null);
		panelAddSeason.setVisible(false);
		
		titleAddSeason = new JLabel("ADD SEASON:");
		titleAddSeason.setVerticalAlignment(SwingConstants.TOP);
		titleAddSeason.setBounds(35, 1, 265, 26);
		titleAddSeason.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleAddSeason.setForeground(Color.WHITE);
		titleAddSeason.setFont(UI_Elements.font_AgencyHeader);
		panelAddSeason.add(titleAddSeason);
		
		lblSeasonName = new JLabel("Season Name (e. 2019/2020):");
		lblSeasonName.setBorder(null);
		lblSeasonName.setForeground(Color.WHITE);
		lblSeasonName.setFont(UI_Elements.font_bodyLabel);
		lblSeasonName.setBounds(35, titleAddSeason.getBounds().y+titleAddSeason.getBounds().height+12, 250, 22);
		panelAddSeason.add(lblSeasonName);
		
		tf_SeasonName = new JTextField(); //TODO - add name validation
		tf_SeasonName.setDisabledTextColor(Color.BLACK);
		tf_SeasonName.setEnabled(true);
		tf_SeasonName.setEditable(true);
		tf_SeasonName.setHorizontalAlignment(SwingConstants.LEFT);
		tf_SeasonName.setFont(UI_Elements.font_bodyFillText);
		tf_SeasonName.setBounds(lblSeasonName.getBounds().x, lblSeasonName.getBounds().y+lblSeasonName.getBounds().height, panelAddSeason.getBounds().width-titleAddSeason.getBounds().x-5, 30);
		panelAddSeason.add(tf_SeasonName);
		tf_SeasonName.setColumns(10);
		
		lblLeagueName = new JLabel("League Name:");
		lblLeagueName.setBorder(null);
		lblLeagueName.setForeground(Color.WHITE);
		lblLeagueName.setFont(UI_Elements.font_bodyLabel);
		lblLeagueName.setBounds(lblSeasonName.getBounds().x, tf_SeasonName.getBounds().y+tf_SeasonName.getBounds().height+10, 250, 22);
		panelAddSeason.add(lblLeagueName);
		
		tf_LeagueName = new JTextField(); //TODO - add name validation
		tf_LeagueName.setDisabledTextColor(Color.BLACK);
		tf_LeagueName.setEnabled(true);
		tf_LeagueName.setEditable(true);
		tf_LeagueName.setHorizontalAlignment(SwingConstants.LEFT);
		tf_LeagueName.setFont(UI_Elements.font_bodyFillText);
		tf_LeagueName.setBounds(lblLeagueName.getBounds().x, lblLeagueName.getBounds().y+lblLeagueName.getBounds().height, panelAddSeason.getBounds().width-titleAddSeason.getBounds().x-5, 30);
		panelAddSeason.add(tf_LeagueName);
		tf_LeagueName.setColumns(10);
		
		btnAddSeasonFinish = new JButton("FINISH");
		btnAddSeasonFinish.setFocusPainted(false);
		btnAddSeasonFinish.setRequestFocusEnabled(false);
		btnAddSeasonFinish.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddSeasonFinish.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddSeasonFinish.setForeground(Color.WHITE);
		btnAddSeasonFinish.setOpaque(true);
		btnAddSeasonFinish.setBorder(null);
		btnAddSeasonFinish.setFont(UI_Elements.font_AgencyActionButton);
		btnAddSeasonFinish.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnAddSeasonFinish.setBounds(35, tf_LeagueName.getBounds().y+tf_LeagueName.getBounds().height+12, 75, 25);
		btnAddSeasonFinish.setSelected(false);
		panelAddSeason.add(btnAddSeasonFinish);
		btnAddSeasonFinish.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddSeasonFinish.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnAddSeasonFinish.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    }
		} );
		
		btnAddSeasonCancel = new JButton("CANCEL");
		btnAddSeasonCancel.setFocusPainted(false);
		btnAddSeasonCancel.setRequestFocusEnabled(false);
		btnAddSeasonCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddSeasonCancel.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddSeasonCancel.setForeground(Color.WHITE);
		btnAddSeasonCancel.setOpaque(true);
		btnAddSeasonCancel.setBorder(null);
		btnAddSeasonCancel.setFont(UI_Elements.font_AgencyActionButton);
		btnAddSeasonCancel.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnAddSeasonCancel.setBounds(btnAddSeasonFinish.getBounds().x + btnAddSeasonFinish.getBounds().width + 15, btnAddSeasonFinish.getBounds().y, 75, 25);
		btnAddSeasonCancel.setSelected(false);
		panelAddSeason.add(btnAddSeasonCancel);
		btnAddSeasonCancel.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddSeasonCancel.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnAddSeasonCancel.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    }
		} );
		
		
	}//end of constructor

	public void addObserverButton(JButton i_Button)
	{
		this.observerButtons.add(i_Button);
	}

	public void removeObserverButton(JButton i_Button)
	{
		this.observerButtons.remove(i_Button);
	}
	
	public void setButtonsToDefault()
	{
		for(JButton button : observerButtons)
		{
			button.setEnabled(true);
			button.setSelected(false);
			button.setBackground(UI_Elements.color_panelBodyButtonDefault);
		}
	}
	
}
