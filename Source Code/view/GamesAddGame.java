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

import com.toedter.calendar.JDateChooser;

@SuppressWarnings("serial")
public class GamesAddGame extends JPanel {
	
	public JPanel panelAddGame;
	private JLabel titleAddGame;
	private JLabel lblGameName;
	public JTextField tf_GameName;
	private JLabel lblDate;
	public JTextField tf_Date;
	public JButton btnAddGameFinish;
	public JButton btnAddGameCancel;
	public JDateChooser dateChooserGameDate;
	
	private List<JButton> observerButtons = new ArrayList<JButton>();
	
	public GamesAddGame() {
		setBackground(UI_Elements.color_mainBackgroundColor);
		
		panelAddGame = new JPanel();
		panelAddGame.setBorder(null);
		panelAddGame.setBackground(UI_Elements.color_mainBackgroundColor);
		panelAddGame.setBounds(0, 5, 340, 352);
		panelAddGame.setLayout(null);
		panelAddGame.setVisible(false);
		
		titleAddGame = new JLabel("ADD GAME:");
		titleAddGame.setVerticalAlignment(SwingConstants.TOP);
		titleAddGame.setBounds(35, 1, 265, 26);
		titleAddGame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleAddGame.setForeground(Color.WHITE);
		titleAddGame.setFont(UI_Elements.font_AgencyHeader);
		panelAddGame.add(titleAddGame);
		
		lblGameName = new JLabel("Game Name:");
		lblGameName.setBorder(null);
		lblGameName.setForeground(Color.WHITE);
		lblGameName.setFont(UI_Elements.font_bodyLabel);
		lblGameName.setBounds(35, titleAddGame.getBounds().y+titleAddGame.getBounds().height+12, 250, 22);
		panelAddGame.add(lblGameName);
		
		tf_GameName = new JTextField();
		tf_GameName.setDisabledTextColor(Color.BLACK);
		tf_GameName.setEnabled(true);
		tf_GameName.setEditable(true);
		tf_GameName.setHorizontalAlignment(SwingConstants.LEFT);
		tf_GameName.setFont(UI_Elements.font_bodyFillText);
		tf_GameName.setBounds(lblGameName.getBounds().x, lblGameName.getBounds().y+lblGameName.getBounds().height, panelAddGame.getBounds().width-titleAddGame.getBounds().x-5, 30);
		panelAddGame.add(tf_GameName);
		tf_GameName.setColumns(10);
		
		lblDate = new JLabel("Date:");
		lblDate.setBorder(null);
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(UI_Elements.font_bodyLabel);
		lblDate.setBounds(lblGameName.getBounds().x, tf_GameName.getBounds().y+tf_GameName.getBounds().height+10, 250, 22);
		panelAddGame.add(lblDate);
		
		tf_Date = new JTextField();
		tf_Date.setDisabledTextColor(Color.BLACK);
		tf_Date.setEnabled(true);
		tf_Date.setEditable(true);
		tf_Date.setHorizontalAlignment(SwingConstants.LEFT);
		tf_Date.setFont(UI_Elements.font_bodyFillText);
		tf_Date.setBounds(lblDate.getBounds().x, lblDate.getBounds().y+lblDate.getBounds().height, panelAddGame.getBounds().width-titleAddGame.getBounds().x-5, 30);
		panelAddGame.add(tf_Date);
		tf_Date.setColumns(10);
		tf_Date.setVisible(false);
		
		dateChooserGameDate = new JDateChooser();
		dateChooserGameDate.setBounds(lblDate.getBounds().x, lblDate.getBounds().y+lblDate.getBounds().height, panelAddGame.getBounds().width-titleAddGame.getBounds().x-5, 30);
		panelAddGame.add(dateChooserGameDate);
		dateChooserGameDate.setDateFormatString("dd/MM/yyyy");
		
		btnAddGameFinish = new JButton("FINISH");
		btnAddGameFinish.setFocusPainted(false);
		btnAddGameFinish.setRequestFocusEnabled(false);
		btnAddGameFinish.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddGameFinish.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddGameFinish.setForeground(Color.WHITE);
		btnAddGameFinish.setOpaque(true);
		btnAddGameFinish.setBorder(null);
		btnAddGameFinish.setFont(UI_Elements.font_AgencyActionButton);
		btnAddGameFinish.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnAddGameFinish.setBounds(35, tf_Date.getBounds().y+tf_Date.getBounds().height+12, 75, 25);
		btnAddGameFinish.setSelected(false);
		panelAddGame.add(btnAddGameFinish);
		btnAddGameFinish.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddGameFinish.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnAddGameFinish.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    }
		} );
		
		btnAddGameCancel = new JButton("CANCEL");
		btnAddGameCancel.setFocusPainted(false);
		btnAddGameCancel.setRequestFocusEnabled(false);
		btnAddGameCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddGameCancel.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddGameCancel.setForeground(Color.WHITE);
		btnAddGameCancel.setOpaque(true);
		btnAddGameCancel.setBorder(null);
		btnAddGameCancel.setFont(UI_Elements.font_AgencyActionButton);
		btnAddGameCancel.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnAddGameCancel.setBounds(btnAddGameFinish.getBounds().x + btnAddGameFinish.getBounds().width + 15, btnAddGameFinish.getBounds().y, 75, 25);
		btnAddGameCancel.setSelected(false);
		panelAddGame.add(btnAddGameCancel);
		btnAddGameCancel.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddGameCancel.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnAddGameCancel.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    }
		} );
		
	}// end of constructor

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
