package controller;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.ArrayList;

import model.*;
import view.*;

public class Controller {
	private View view;
	private Model model;
	
	//--ViewStadium Elements--//
	public ArrayList<JButton> stadiumButtonsOverview = new ArrayList<JButton>();
	public ArrayList<JButton> stadiumButtonsGames = new ArrayList<JButton>();
	public ArrayList<MouseAdapter> mouseAdaptersOverview = new ArrayList<MouseAdapter>();
	public ArrayList<MouseAdapter> mouseAdaptersGames = new ArrayList<MouseAdapter>();
	public ArrayList<ImageIcon> stadiumImages = new ArrayList<ImageIcon>();
	public ArrayList<ImageIcon> stadiumImagesRollover = new ArrayList<ImageIcon>();
	public ArrayList<ImageIcon> stadiumImagesSelected = new ArrayList<ImageIcon>();
	public ArrayList<String> stadiumImagePaths = new ArrayList<String>();
	
	public DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	private String path1;
	private String path2;
	private String path3;
	private String path4;
	private String path5;
	private String path6;
	private String path7;
	private String path8;
	private String path9;
	private String path10;
	private String path11;
	private String path12;
	private String path13;
	private String path14;
	private String path15;
	private String path16;
	private String path17;
	private String path18;
	private String path19;
	private String path20;
	private String path21;
	private String path22;
	private String path23;
	private String path24;
	private String path25;
	private String path26;
	private String path27;
	private String path28;
	private String path29;
	private String path30;
	private String path31;
	private String path32;
	private String path33;
	private String path34;
	private String path35;
	private String path36;
	private String path37;
	private String path38;
	private String path39;
	private String path40;
	private String path41;
	private String path42;
	private String path43;
	private String path44;
	
	public ImageIcon img_1;
	public ImageIcon img_2;
	public ImageIcon img_3;
	public ImageIcon img_4;
	public ImageIcon img_5;
	public ImageIcon img_6;
	public ImageIcon img_7;
	public ImageIcon img_8;
	public ImageIcon img_9;
	public ImageIcon img_10;
	public ImageIcon img_11;
	public ImageIcon img_12;
	public ImageIcon img_13;
	public ImageIcon img_14;
	public ImageIcon img_15;
	public ImageIcon img_16;
	public ImageIcon img_17;
	public ImageIcon img_18;
	public ImageIcon img_19;
	public ImageIcon img_20;
	public ImageIcon img_21;
	public ImageIcon img_22;
	public ImageIcon img_23;
	public ImageIcon img_24;
	public ImageIcon img_25;
	public ImageIcon img_26;
	public ImageIcon img_27;
	public ImageIcon img_28;
	public ImageIcon img_29;
	public ImageIcon img_30;
	public ImageIcon img_31;
	public ImageIcon img_32;
	public ImageIcon img_33;
	public ImageIcon img_34;
	public ImageIcon img_35;
	public ImageIcon img_36;
	public ImageIcon img_37;
	public ImageIcon img_38;
	public ImageIcon img_39;
	public ImageIcon img_40;
	public ImageIcon img_41;
	public ImageIcon img_42;
	public ImageIcon img_43;
	public ImageIcon img_44;
	
	public ImageIcon img_1_R;
	public ImageIcon img_2_R;
	public ImageIcon img_3_R;
	public ImageIcon img_4_R;
	public ImageIcon img_5_R;
	public ImageIcon img_6_R;
	public ImageIcon img_7_R;
	public ImageIcon img_8_R;
	public ImageIcon img_9_R;
	public ImageIcon img_10_R;
	public ImageIcon img_11_R;
	public ImageIcon img_12_R;
	public ImageIcon img_13_R;
	public ImageIcon img_14_R;
	public ImageIcon img_15_R;
	public ImageIcon img_16_R;
	public ImageIcon img_17_R;
	public ImageIcon img_18_R;
	public ImageIcon img_19_R;
	public ImageIcon img_20_R;
	public ImageIcon img_21_R;
	public ImageIcon img_22_R;
	public ImageIcon img_23_R;
	public ImageIcon img_24_R;
	public ImageIcon img_25_R;
	public ImageIcon img_26_R;
	public ImageIcon img_27_R;
	public ImageIcon img_28_R;
	public ImageIcon img_29_R;
	public ImageIcon img_30_R;
	public ImageIcon img_31_R;
	public ImageIcon img_32_R;
	public ImageIcon img_33_R;
	public ImageIcon img_34_R;
	public ImageIcon img_35_R;
	public ImageIcon img_36_R;
	public ImageIcon img_37_R;
	public ImageIcon img_38_R;
	public ImageIcon img_39_R;
	public ImageIcon img_40_R;
	public ImageIcon img_41_R;
	public ImageIcon img_42_R;
	public ImageIcon img_43_R;
	public ImageIcon img_44_R;
	
	public ImageIcon img_1_S;
	public ImageIcon img_2_S;
	public ImageIcon img_3_S;
	public ImageIcon img_4_S;
	public ImageIcon img_5_S;
	public ImageIcon img_6_S;
	public ImageIcon img_7_S;
	public ImageIcon img_8_S;
	public ImageIcon img_9_S;
	public ImageIcon img_10_S;
	public ImageIcon img_11_S;
	public ImageIcon img_12_S;
	public ImageIcon img_13_S;
	public ImageIcon img_14_S;
	public ImageIcon img_15_S;
	public ImageIcon img_16_S;
	public ImageIcon img_17_S;
	public ImageIcon img_18_S;
	public ImageIcon img_19_S;
	public ImageIcon img_20_S;
	public ImageIcon img_21_S;
	public ImageIcon img_22_S;
	public ImageIcon img_23_S;
	public ImageIcon img_24_S;
	public ImageIcon img_25_S;
	public ImageIcon img_26_S;
	public ImageIcon img_27_S;
	public ImageIcon img_28_S;
	public ImageIcon img_29_S;
	public ImageIcon img_30_S;
	public ImageIcon img_31_S;
	public ImageIcon img_32_S;
	public ImageIcon img_33_S;
	public ImageIcon img_34_S;
	public ImageIcon img_35_S;
	public ImageIcon img_36_S;
	public ImageIcon img_37_S;
	public ImageIcon img_38_S;
	public ImageIcon img_39_S;
	public ImageIcon img_40_S;
	public ImageIcon img_41_S;
	public ImageIcon img_42_S;
	public ImageIcon img_43_S;
	public ImageIcon img_44_S;
	
	private MouseAdapter ma1_Overview;
	private MouseAdapter ma2_Overview;
	private MouseAdapter ma3_Overview;
	private MouseAdapter ma4_Overview;
	private MouseAdapter ma5_Overview;
	private MouseAdapter ma6_Overview;
	private MouseAdapter ma7_Overview;
	private MouseAdapter ma8_Overview;
	private MouseAdapter ma9_Overview;
	private MouseAdapter ma10_Overview;
	private MouseAdapter ma11_Overview;
	private MouseAdapter ma12_Overview;
	private MouseAdapter ma13_Overview;
	private MouseAdapter ma14_Overview;
	private MouseAdapter ma15_Overview;
	private MouseAdapter ma16_Overview;
	private MouseAdapter ma17_Overview;
	private MouseAdapter ma18_Overview;
	private MouseAdapter ma19_Overview;
	private MouseAdapter ma20_Overview;
	private MouseAdapter ma21_Overview;
	private MouseAdapter ma22_Overview;
	private MouseAdapter ma23_Overview;
	private MouseAdapter ma24_Overview;
	private MouseAdapter ma25_Overview;
	private MouseAdapter ma26_Overview;
	private MouseAdapter ma27_Overview;
	private MouseAdapter ma28_Overview;
	private MouseAdapter ma29_Overview;
	private MouseAdapter ma30_Overview;
	private MouseAdapter ma31_Overview;
	private MouseAdapter ma32_Overview;
	private MouseAdapter ma33_Overview;
	private MouseAdapter ma34_Overview;
	private MouseAdapter ma35_Overview;
	private MouseAdapter ma36_Overview;
	private MouseAdapter ma37_Overview;
	private MouseAdapter ma38_Overview;
	private MouseAdapter ma39_Overview;
	private MouseAdapter ma40_Overview;
	private MouseAdapter ma41_Overview;
	private MouseAdapter ma42_Overview;
	private MouseAdapter ma43_Overview;
	private MouseAdapter ma44_Overview;
	
	private MouseAdapter ma1_Games;
	private MouseAdapter ma2_Games;
	private MouseAdapter ma3_Games;
	private MouseAdapter ma4_Games;
	private MouseAdapter ma5_Games;
	private MouseAdapter ma6_Games;
	private MouseAdapter ma7_Games;
	private MouseAdapter ma8_Games;
	private MouseAdapter ma9_Games;
	private MouseAdapter ma10_Games;
	private MouseAdapter ma11_Games;
	private MouseAdapter ma12_Games;
	private MouseAdapter ma13_Games;
	private MouseAdapter ma14_Games;
	private MouseAdapter ma15_Games;
	private MouseAdapter ma16_Games;
	private MouseAdapter ma17_Games;
	private MouseAdapter ma18_Games;
	private MouseAdapter ma19_Games;
	private MouseAdapter ma20_Games;
	private MouseAdapter ma21_Games;
	private MouseAdapter ma22_Games;
	private MouseAdapter ma23_Games;
	private MouseAdapter ma24_Games;
	private MouseAdapter ma25_Games;
	private MouseAdapter ma26_Games;
	private MouseAdapter ma27_Games;
	private MouseAdapter ma28_Games;
	private MouseAdapter ma29_Games;
	private MouseAdapter ma30_Games;
	private MouseAdapter ma31_Games;
	private MouseAdapter ma32_Games;
	private MouseAdapter ma33_Games;
	private MouseAdapter ma34_Games;
	private MouseAdapter ma35_Games;
	private MouseAdapter ma36_Games;
	private MouseAdapter ma37_Games;
	private MouseAdapter ma38_Games;
	private MouseAdapter ma39_Games;
	private MouseAdapter ma40_Games;
	private MouseAdapter ma41_Games;
	private MouseAdapter ma42_Games;
	private MouseAdapter ma43_Games;
	private MouseAdapter ma44_Games;
	//---------------------//
	
	
	
	public Controller(View amsView, Model amsModel) {
		this.view = amsView;
		this.model = amsModel;
	
		//---login panel---//
		//	btnLogin pressed:
		view.loginPanel.btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (model.isUserExist(view.loginPanel.tf_loginUsername.getText(),view.loginPanel.passwordField_Login.getPassword())) {
					btnLoginPressed();
				}
				else
					view.loginPanel.lblLoginFailed.setVisible(true);

			}	
		});
		//btnSignUp pressed:
		view.loginPanel.btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.signUpFrame.setVisible(true);

			}	
		});
		
		//---sign up panel---//
		view.signUpFrame.btnFinishSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(model.isUserNameExist(view.signUpFrame.tf_enterUserName.getText())) {
					view.signUpFrame.lblUsernameAlreadyExist.setVisible(true);
					view.signUpFrame.lblPasswordMismatch.setVisible(false);
				}
				else if(!Arrays.equals(view.signUpFrame.pf_enterPassword.getPassword(),view.signUpFrame.pf_enterPasswordAgain.getPassword())) {
					view.signUpFrame.lblPasswordMismatch.setVisible(true);
					view.signUpFrame.lblUsernameAlreadyExist.setVisible(false);
				}
				else {
					view.signUpFrame.setVisible(false);
					model.addUser(view.signUpFrame.tf_enterUserName.getText(), view.signUpFrame.tf_enterFirstName.getText(), view.signUpFrame.tf_enterLastName.getText(), view.signUpFrame.pf_enterPassword.getPassword(), view.signUpFrame.tf_enterEmail.getText());
				}

			}	
		});
		view.signUpFrame.btnCancelSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.signUpFrame.setVisible(false);
			}	
		});
		
		//---menu panel---//
		//Menu Button behavior//		
		//btnOverview - press:
		view.menuPanel.btnOverview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchMainMenuPage(view.menuPanel.btnOverview);
			}
		});
		//btnOverview - Rollover:
		view.menuPanel.btnOverview.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	view.menuPanel.btnOverview.setBackground(UI_Elements.color_menuButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(view.overviewPanel.panelOverview.isVisible() == true)
		    	{
		    		view.menuPanel.btnOverview.setBackground(UI_Elements.color_menuButtonSelected);
		    	}
		    	else
		    	{
		    		view.menuPanel.btnOverview.setBackground(UI_Elements.color_menuBar);
		    	}
		    }
		} );
		
		//btnProperties - press:
		view.menuPanel.btnProperties.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			switchMainMenuPage(view.menuPanel.btnProperties);
			
			}
		});
		//btnProperties - Rollover:
		view.menuPanel.btnProperties.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	view.menuPanel.btnProperties.setBackground(UI_Elements.color_menuButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(view.propertiesPanel.panelProperties.isVisible() == true)
		    	{
		    		view.menuPanel.btnProperties.setBackground(UI_Elements.color_menuButtonSelected);
		    	}
		    	else
		    	{
		    		view.menuPanel.btnProperties.setBackground(UI_Elements.color_menuBar);
		    	}
		    }
		} );
		
		//btnSales - press:
		view.menuPanel.btnSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchMainMenuPage(view.menuPanel.btnSales);
			}
		});
		//btnSales - Rollover:
		view.menuPanel.btnSales.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	view.menuPanel.btnSales.setBackground(UI_Elements.color_menuButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(view.salesPanel.panelSales.isVisible() == true)
		    	{
		    		view.menuPanel.btnSales.setBackground(UI_Elements.color_menuButtonSelected);
		    	}
		    	else
		    	{
		    		view.menuPanel.btnSales.setBackground(UI_Elements.color_menuBar);
		    	}
		    }
		} );
		
		//btnFacilities - press:
		view.menuPanel.btnFacilities.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			switchMainMenuPage(view.menuPanel.btnFacilities);			
			}
		});
		//btnFacilities - Rollover:
		view.menuPanel.btnFacilities.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	view.menuPanel.btnFacilities.setBackground(UI_Elements.color_menuButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(view.facilitiesPanel.panelFacilities.isVisible() == true)
		    	{
		    		view.menuPanel.btnFacilities.setBackground(UI_Elements.color_menuButtonSelected);
		    	}
		    	else
		    	{
		    		view.menuPanel.btnFacilities.setBackground(UI_Elements.color_menuBar);
		    	}
		    }
		} );
		
		//btnGames - press:
		view.menuPanel.btnGames.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			switchMainMenuPage(view.menuPanel.btnGames);			
			}
		});
		//btnFacilities - Rollover:
		view.menuPanel.btnGames.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	view.menuPanel.btnGames.setBackground(UI_Elements.color_menuButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(view.gamesPanel.panelGames.isVisible() == true)
		    	{
		    		view.menuPanel.btnGames.setBackground(UI_Elements.color_menuButtonSelected);
		    	}
		    	else
		    	{
		    		view.menuPanel.btnGames.setBackground(UI_Elements.color_menuBar);
		    	}
		    }
		} );
		
		
		//button UserName:
		view.menuPanel.btnUserName.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			if (view.menuPanel.btnLogout.isVisible() == false)
			{
				view.menuPanel.btnLogout.setVisible(true);
				view.menuPanel.btnUserName.setBackground(UI_Elements.color_menuButtonSelected);
			}
			else {
				view.menuPanel.btnUserName.setBackground(UI_Elements.color_menuBar);
				view.menuPanel.btnLogout.setVisible(false);
			}

		}
	});
		
		//button logout:
		view.menuPanel.btnLogout.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			view.menuPanel.btnUserName.setBackground(UI_Elements.color_menuBar);
			view.menuPanel.btnLogout.setVisible(false);
			view.displayLoginPage();
		}
	});

		
		//---properties panel---//
		//text fields:
		view.propertiesPanel.tf_ArenaName.setText(model.stadium.getStadiumName());
		view.propertiesPanel.tf_Address.setText(model.stadium.getAddress());
		view.propertiesPanel.tf_ArenaNumOfSeats.setText(String.valueOf(model.stadium.getCapacity()));
		view.propertiesPanel.tf_SectionNumOfSeats.setText(String.valueOf(model.stadium.getArenaSection(1).getNumOfSeats()));
		//set sections in the combobox:
		for (int i = 0; i < model.db.sectionSize; i++) {
			view.propertiesPanel.cb_SectionSelection.addItem(model.db.section[i].getSectionName());
		}
		//set the first section in view:
		displaySectionDetails(0);
		// Actions:
		view.propertiesPanel.btnEditProperties.addActionListener(new ActionListener() {
			@SuppressWarnings("serial")
			public void actionPerformed(ActionEvent arg0) {
				view.propertiesPanel.btnEditProperties.setVisible(false);
				view.propertiesPanel.btnCancelEditing.setVisible(true);
				view.propertiesPanel.btnFinishEditingProperties.setVisible(true);
				view.propertiesPanel.btnEditTicketPrices.setVisible(true);
				view.propertiesPanel.setProperties(true);
				view.propertiesPanel.cb_SectionSelection.setEnabled(false);
				view.propertiesPanel.cb_SectionSelection.setRenderer(new DefaultListCellRenderer() {
					public void paint(Graphics g) {
						setForeground(Color.BLACK);
						super.paint(g);
					}
				});
			}
		});

		view.propertiesPanel.btnFinishEditingProperties.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				view.propertiesPanel.cb_SectionSelection.setEnabled(true);
				view.propertiesPanel.btnFinishEditingProperties.setVisible(false);
				view.propertiesPanel.btnEditProperties.setVisible(true);
				view.propertiesPanel.btnCancelEditing.setVisible(false);
				view.propertiesPanel.btnEditTicketPrices.setVisible(false);

				view.propertiesPanel.sectionIndex = view.propertiesPanel.cb_SectionSelection.getSelectedIndex(); // Gets the Section we want to edit
				
				model.stadium.setStadiumName(view.propertiesPanel.tf_ArenaName.getText());
				model.stadium.setAddress(view.propertiesPanel.tf_Address.getText());
				// -------------//
				String currentSectionType = model.stadium.getArenaSection(view.propertiesPanel.sectionIndex).getSectionType();
				String newSectionType = view.propertiesPanel.cb_SectionType.getModel().getSelectedItem().toString();
				
				model.stadium.getArenaSection(view.propertiesPanel.sectionIndex).setSectionType(view.propertiesPanel.cb_SectionType.getModel().getSelectedItem().toString());				
				model.stadium.getArenaSection(view.propertiesPanel.sectionIndex).setSectionRanking(view.propertiesPanel.cb_SectionRanking.getModel().getSelectedItem().toString());
				model.stadium.getArenaSection(view.propertiesPanel.sectionIndex).setNumOfSeats(Integer.valueOf(view.propertiesPanel.tf_SectionNumOfSeats.getText()).intValue(), model.stadium);
				if (view.propertiesPanel.rdbtnIsRoofedYes.isSelected()) {
					model.stadium.getArenaSection(view.propertiesPanel.sectionIndex).setRoofed(true);
					//set new Section properties in DB with "isRoofed" true:
					model.db.updateSections(view.propertiesPanel.sectionIndex+1, view.propertiesPanel.cb_SectionType.getModel().getSelectedItem().toString(),Integer.valueOf(view.propertiesPanel.tf_SectionNumOfSeats.getText()).intValue(), "true", view.propertiesPanel.cb_SectionRanking.getModel().getSelectedItem().toString());
				} else {
					model.stadium.getArenaSection(view.propertiesPanel.sectionIndex).setRoofed(false);
					//set new Section properties in DB with "isRoofed" false:
					model.db.updateSections(view.propertiesPanel.sectionIndex+1, view.propertiesPanel.cb_SectionType.getModel().getSelectedItem().toString(), Integer.valueOf(view.propertiesPanel.tf_SectionNumOfSeats.getText()).intValue(), "false", view.propertiesPanel.cb_SectionRanking.getModel().getSelectedItem().toString());

				}
				// -------------//
				//update changes in DB:
				model.db.updateProperties(1, view.propertiesPanel.tf_ArenaName.getText(), "Real Madrid", model.stadium.getCapacity(), view.propertiesPanel.tf_Address.getText(), 44);
				//--------------//

				view.propertiesPanel.tf_ArenaNumOfSeats.setText(String.valueOf(model.stadium.getCapacity())); //changes number of seats according to the section changes

				view.propertiesPanel.setProperties(false);
				
				if(currentSectionType.equals(newSectionType) == false)
				{
					redrawStadium(0);
				}
			}
		});

		view.propertiesPanel.btnCancelEditing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.propertiesPanel.cb_SectionSelection.setEnabled(true);
				view.propertiesPanel.btnCancelEditing.setVisible(false);
				view.propertiesPanel.btnEditProperties.setVisible(true);
				view.propertiesPanel.btnFinishEditingProperties.setVisible(false);
				view.propertiesPanel.btnEditTicketPrices.setVisible(false);

				view.propertiesPanel.sectionIndex = view.propertiesPanel.cb_SectionSelection.getSelectedIndex(); // Gets the Section we want to edit

				view.propertiesPanel.tf_ArenaName.setText(model.stadium.getStadiumName());
				view.propertiesPanel.tf_Address.setText(model.stadium.getAddress());
				view.propertiesPanel.tf_ArenaNumOfSeats.setText(String.valueOf(model.stadium.getCapacity()));
				// -------------//


				view.propertiesPanel.cb_SectionType.setSelectedItem(model.stadium.getArenaSection(view.propertiesPanel.sectionIndex).getSectionType());
				view.propertiesPanel.cb_SectionRanking.setSelectedItem(model.stadium.getArenaSection(view.propertiesPanel.sectionIndex).getSectionRanking());
				view.propertiesPanel.tf_SectionNumOfSeats.setText(String.valueOf(model.stadium.getArenaSection(view.propertiesPanel.sectionIndex).getNumOfSeats()));
				if (model.stadium.getArenaSection(view.propertiesPanel.sectionIndex).isRoofed()) {
					view.propertiesPanel.rdbtnIsRoofedYes.setSelected(true);
					view.propertiesPanel.rdbtnIsRoofedNO.setSelected(false);
				} else {
					view.propertiesPanel.rdbtnIsRoofedYes.setSelected(false);
					view.propertiesPanel.rdbtnIsRoofedNO.setSelected(true);
				}

				view.propertiesPanel.setProperties(false);
			}
		});
		
		view.propertiesPanel.btnEditTicketPrices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.propertiesPanel.frameEditTicketPrices.setVisible(true);
			}
		});
		
		view.propertiesPanel.cb_SectionSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				displaySectionDetails(view.propertiesPanel.cb_SectionSelection.getSelectedIndex()); // function which display the data on a
																				// given section
			}
		});

		view.propertiesPanel.rdbtnIsRoofedYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!view.propertiesPanel.rdbtnIsRoofedYes.isSelected()) {
					view.propertiesPanel.rdbtnIsRoofedYes.setSelected(true);
					view.propertiesPanel.rdbtnIsRoofedNO.setSelected(false);
				} else {
					view.propertiesPanel.rdbtnIsRoofedYes.setSelected(true);
					view.propertiesPanel.rdbtnIsRoofedNO.setSelected(false);
				}
			}
		});

		view.propertiesPanel.rdbtnIsRoofedNO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!view.propertiesPanel.rdbtnIsRoofedNO.isSelected()) {
					view.propertiesPanel.rdbtnIsRoofedNO.setSelected(true);
					view.propertiesPanel.rdbtnIsRoofedYes.setSelected(false);
				} else {
					view.propertiesPanel.rdbtnIsRoofedNO.setSelected(true);
					view.propertiesPanel.rdbtnIsRoofedYes.setSelected(false);
				}
			}
		});
		
		
		//Ticket sale panel:
		view.propertiesPanel.frameEditTicketPrices.btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.propertiesPanel.frameEditTicketPrices.setVisible(false);
				model.updateTicketPrice(Float.valueOf(view.propertiesPanel.frameEditTicketPrices.tf_VIP.getText()), Float.valueOf(view.propertiesPanel.frameEditTicketPrices.tf_ClubLevel.getText()), Float.valueOf(view.propertiesPanel.frameEditTicketPrices.tf_Bleachers.getText()));
				view.propertiesPanel.frameEditTicketPrices.tf_Bleachers.setText("");
				view.propertiesPanel.frameEditTicketPrices.tf_ClubLevel.setText("");
				view.propertiesPanel.frameEditTicketPrices.tf_VIP.setText("");
			}
		});
		view.propertiesPanel.frameEditTicketPrices.btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.propertiesPanel.frameEditTicketPrices.setVisible(false);
				view.propertiesPanel.frameEditTicketPrices.tf_Bleachers.setText("");
				view.propertiesPanel.frameEditTicketPrices.tf_ClubLevel.setText("");
				view.propertiesPanel.frameEditTicketPrices.tf_VIP.setText("");
			}
		});
		
		//---Sales Panel (in view)---//
		//
		for (int i = 0; i < model.seasonSize; i++) {
			view.salesPanel.cb_SalesSeason.addItem(model.season.get(i).getName() + " - " + model.season.get(i).getLeagueName());
		}
		displayAllGamesInSelectedSeason(2);//set up default
		//

		
		view.salesPanel.btnTickets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				displayGameRevenue(view.salesPanel.cb_SalesSeason.getSelectedIndex(),view.salesPanel.cb_SalesGame.getSelectedIndex());
				
			}
		});		
		view.salesPanel.cb_SalesSeason.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				displayAllGamesInSelectedSeason(2);		
			}
		});
		
				
		view.salesPanel.btnDisplayTicketData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.salesPanel.ticketsPanel.setVisible(true);
				displayGameRevenue(view.salesPanel.cb_SalesSeason.getSelectedIndex(), view.salesPanel.cb_SalesGame.getSelectedIndex());
				if(view.salesPanel.btnDisplayTicketData.isSelected())
				{
					view.salesPanel.ticketsPanel.panelTickets.setVisible(false);
					view.salesPanel.btnDisplayTicketData.setSelected(false);
					view.salesPanel.btnDisplayTicketData.setBackground(UI_Elements.color_panelBodyButtonDefault);
					
					for(JComponent component : view.salesPanel.comboList)
					{
						component.setEnabled(true);
					}

				}
				else 
				{
					//Simmulate panel change
					view.salesPanel.ticketsPanel.setVisible(false);
					view.salesPanel.ticketsPanel.panelTickets.setVisible(false);
					view.salesPanel.sponsorshipPanel.setVisible(true);
					view.salesPanel.sponsorshipPanel.panelSponsorship.setVisible(true);
					
					view.salesPanel.ticketsPanel.setVisible(true);
					view.salesPanel.ticketsPanel.panelTickets.setVisible(false);
					view.salesPanel.sponsorshipPanel.setVisible(false);
					view.salesPanel.sponsorshipPanel.panelSponsorship.setVisible(false);					
					//
					
					for(JComponent component : view.salesPanel.comboList)
					{
						component.setEnabled(false);
					}
					
					view.salesPanel.ticketsPanel.panelTickets.setVisible(true);
					view.salesPanel.btnDisplayTicketData.setSelected(true);
					view.salesPanel.btnDisplayTicketData.setBackground(UI_Elements.color_panelBodyButtonSelected);
				}
				
			}
		});
					
			
			//---Sponsors---//
			displaySponsorsToTable();
			
			for(int i=0; i<model.sponsorsSize;i++) {
				view.salesPanel.sponsorshipPanel.cb_RemoveSponsorSponsorName.addItem(model.sponsors.get(i).getName());
			}

			
			view.salesPanel.sponsorshipPanel.btnAddSponsorFinish.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					view.salesPanel.sponsorshipPanel.tf_AddSponsorContractStart.setText(dateFormat.format(view.salesPanel.sponsorshipPanel.dateChooserContractStart.getDate()));
					view.salesPanel.sponsorshipPanel.tf_AddSponsorContractEnd.setText(dateFormat.format(view.salesPanel.sponsorshipPanel.dateChooserContractEnd.getDate()));
					
					model.createNewSponsor(view.salesPanel.sponsorshipPanel.tf_AddSponsorSponsorName.getText(), view.salesPanel.sponsorshipPanel.tf_AddSponsorContractStart.getText(), view.salesPanel.sponsorshipPanel.tf_AddSponsorContractEnd.getText(),Float.valueOf(view.salesPanel.sponsorshipPanel.tf_AddSponsorContractValue.getText()));
					view.salesPanel.sponsorshipPanel.cb_RemoveSponsorSponsorName.addItem(view.salesPanel.sponsorshipPanel.tf_AddSponsorSponsorName.getText());
					displaySponsorsToTable();
					view.salesPanel.sponsorshipPanel.tf_AddSponsorSponsorName.setText("");
					view.salesPanel.sponsorshipPanel.tf_AddSponsorContractValue.setText("");
					view.salesPanel.sponsorshipPanel.tf_AddSponsorContractStart.setText("");
					view.salesPanel.sponsorshipPanel.tf_AddSponsorContractEnd.setText("");
				
				}
		});
			
			
			view.salesPanel.sponsorshipPanel.btnRemoveSponsorFinish.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				
					if(view.salesPanel.sponsorshipPanel.cb_RemoveSponsorSponsorName.getSelectedItem()!=null) {
					model.db.deleteGivenSponsorDB(view.salesPanel.sponsorshipPanel.cb_RemoveSponsorSponsorName.getSelectedItem().toString());
					model.deleteGivenSponsor(view.salesPanel.sponsorshipPanel.cb_RemoveSponsorSponsorName.getSelectedIndex());
					view.salesPanel.sponsorshipPanel.cb_RemoveSponsorSponsorName.removeItem(view.salesPanel.sponsorshipPanel.cb_RemoveSponsorSponsorName.getSelectedItem());
					deleteSponsorFromTable();
					}
			
				}
		});
			
			//---Security----//
			displaysSecurityToTable();
			for(int i=0; i<model.securitySize;i++) {
				view.facilitiesPanel.securityPanel.cb_RemoveSecuritySecurityName.addItem(model.security.get(i).getName());
			}

			
			view.facilitiesPanel.securityPanel.btnAddSecurityFinish.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					view.facilitiesPanel.securityPanel.tf_AddSecurityContractStart.setText(dateFormat.format(view.facilitiesPanel.securityPanel.dateChooserContractStart.getDate()));
					
					model.createNewSecurity(view.facilitiesPanel.securityPanel.tf_AddSecuritySecurityName.getText(), view.facilitiesPanel.securityPanel.tf_AddSecurityContractStart.getText(), view.facilitiesPanel.securityPanel.tf_AddSecurityJobDescription.getText(),Float.valueOf(view.facilitiesPanel.securityPanel.tf_AddSecuritySalary.getText()));
					view.facilitiesPanel.securityPanel.cb_RemoveSecuritySecurityName.addItem(view.facilitiesPanel.securityPanel.tf_AddSecuritySecurityName.getText());
					displaysSecurityToTable();
					view.facilitiesPanel.securityPanel.tf_AddSecuritySecurityName.setText("");
					view.facilitiesPanel.securityPanel.tf_AddSecurityContractStart.setText("");
					view.facilitiesPanel.securityPanel.tf_AddSecurityJobDescription.setText("");
					view.facilitiesPanel.securityPanel.tf_AddSecuritySalary.setText("");
				
				}
		});
			
			view.facilitiesPanel.securityPanel.btnRemoveSecurityFinish.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				
					if(view.facilitiesPanel.securityPanel.cb_RemoveSecuritySecurityName.getSelectedItem()!=null) {
					model.db.deleteGivenSecurityDB(view.facilitiesPanel.securityPanel.cb_RemoveSecuritySecurityName.getSelectedItem().toString());
					model.deleteGivenSecurity(view.facilitiesPanel.securityPanel.cb_RemoveSecuritySecurityName.getSelectedIndex());
					view.facilitiesPanel.securityPanel.cb_RemoveSecuritySecurityName.removeItem(view.facilitiesPanel.securityPanel.cb_RemoveSecuritySecurityName.getSelectedItem());
					deleteSecurityFromTable();
					}
			
				}
		});
			
			
			displaysMaintenanceToTable();
			for(int i=0; i<model.maintenanceSize;i++) {
				view.facilitiesPanel.maintenancePanel.cb_RemoveMaintenanceMaintenanceName.addItem(model.maintenance.get(i).getName());
			}
			
			
			view.facilitiesPanel.maintenancePanel.btnAddMaintenanceFinish.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					view.facilitiesPanel.maintenancePanel.tf_AddMaintenanceStartDate.setText(dateFormat.format(view.facilitiesPanel.maintenancePanel.dateChooserMaintenanceStartDate.getDate()));

					
					model.createNewMaintenance(view.facilitiesPanel.maintenancePanel.tf_AddMaintenanceName.getText(), view.facilitiesPanel.maintenancePanel.tf_AddMaintenanceStartDate.getText(), view.facilitiesPanel.maintenancePanel.tf_AddMaintenanceReason.getText(),Integer.valueOf(view.facilitiesPanel.maintenancePanel.tf_AddMaintenancePriority.getText()));
					view.facilitiesPanel.maintenancePanel.cb_RemoveMaintenanceMaintenanceName.addItem(view.facilitiesPanel.maintenancePanel.tf_AddMaintenanceName.getText());
					displaysMaintenanceToTable();
					view.facilitiesPanel.maintenancePanel.tf_AddMaintenanceName.setText("");
					view.facilitiesPanel.maintenancePanel.tf_AddMaintenanceReason.setText("");
					view.facilitiesPanel.maintenancePanel.tf_AddMaintenanceStartDate.setText("");
					view.facilitiesPanel.maintenancePanel.tf_AddMaintenancePriority.setText("");
				
				}
		});
			
			view.facilitiesPanel.maintenancePanel.btnRemoveMaintenanceFinish.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
									if(view.facilitiesPanel.maintenancePanel.cb_RemoveMaintenanceMaintenanceName.getSelectedItem()!=null) {
					model.db.deleteGivenMaintenaceDB(view.facilitiesPanel.maintenancePanel.cb_RemoveMaintenanceMaintenanceName.getSelectedItem().toString());
					model.deleteGivenMaintenace(view.facilitiesPanel.maintenancePanel.cb_RemoveMaintenanceMaintenanceName.getSelectedIndex());
					view.facilitiesPanel.maintenancePanel.cb_RemoveMaintenanceMaintenanceName.removeItem(view.facilitiesPanel.maintenancePanel.cb_RemoveMaintenanceMaintenanceName.getSelectedItem());
					deleteMaintenanceFromTable();
					}
			
				}
		});
		
		//---Games Panel (in view)---//
		for (int i = 0; i < model.seasonSize; i++) {
			view.gamesPanel.cb_Season.addItem(model.season.get(i).getName() + " - " + model.season.get(i).getLeagueName());
		}
		displayAllGamesInSelectedSeason(1);//set up default
		view.gamesPanel.cb_Season.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				displayAllGamesInSelectedSeason(1);
				
			}
		});
		view.gamesPanel.addGamePanel.btnAddGameFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.addGamePanel.tf_Date.setText(dateFormat.format(view.gamesPanel.addGamePanel.dateChooserGameDate.getDate()));

				view.gamesPanel.addGamePanel.panelAddGame.setVisible(false);
				model.createNewGame(view.gamesPanel.addGamePanel.tf_GameName.getText(), view.gamesPanel.addGamePanel.tf_Date.getText(), view.gamesPanel.cb_Season.getSelectedIndex(), model.stadium.getCapacity(), 100, 50, 20, 300, model.stadium);
				displayAllGamesInSelectedSeason(1);
				displayAllGamesInSelectedSeason(2);
				view.gamesPanel.addGamePanel.tf_GameName.setText("");
				view.gamesPanel.addGamePanel.tf_Date.setText("");
				view.gamesPanel.addGamePanel.setButtonsToDefault();
				view.gamesPanel.gamesStadiumPanel.assignDetailsPanel(view.gamesPanel.sectionDetailsPanel.panelSectionDetails);
				view.gamesPanel.sectionDetailsPanel.setVisible(true);
			}
		});
		
		view.gamesPanel.addGamePanel.btnAddGameCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.addGamePanel.panelAddGame.setVisible(false);
				view.gamesPanel.addGamePanel.setButtonsToDefault();
				view.gamesPanel.gamesStadiumPanel.assignDetailsPanel(view.gamesPanel.sectionDetailsPanel.panelSectionDetails);
				view.gamesPanel.sectionDetailsPanel.setVisible(true);
			}
		});
		
		view.gamesPanel.addSeasonPanel.btnAddSeasonFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.addSeasonPanel.panelAddSeason.setVisible(false);
				model.createNewSeason(view.gamesPanel.addSeasonPanel.tf_SeasonName.getText(), view.gamesPanel.addSeasonPanel.tf_LeagueName.getText());
				view.gamesPanel.cb_Season.addItem(view.gamesPanel.addSeasonPanel.tf_SeasonName.getText() + " - " + view.gamesPanel.addSeasonPanel.tf_LeagueName.getText());
				view.salesPanel.cb_SalesSeason.addItem(view.gamesPanel.addSeasonPanel.tf_SeasonName.getText() + " - " + view.gamesPanel.addSeasonPanel.tf_LeagueName.getText());
				view.gamesPanel.addSeasonPanel.tf_SeasonName.setText("");
				view.gamesPanel.addSeasonPanel.tf_LeagueName.setText("");
				view.gamesPanel.addSeasonPanel.setButtonsToDefault();
				view.gamesPanel.gamesStadiumPanel.assignDetailsPanel(view.gamesPanel.sectionDetailsPanel.panelSectionDetails);
				view.gamesPanel.sectionDetailsPanel.setVisible(true);
			}
		});
		
		view.gamesPanel.addSeasonPanel.btnAddSeasonCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.addSeasonPanel.panelAddSeason.setVisible(false);
				view.gamesPanel.addSeasonPanel.setButtonsToDefault();
				view.gamesPanel.gamesStadiumPanel.assignDetailsPanel(view.gamesPanel.sectionDetailsPanel.panelSectionDetails);
				view.gamesPanel.sectionDetailsPanel.setVisible(true);
			}
		});

		view.gamesPanel.sectionDetailsPanel.btnAddTicketSale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.sectionDetailsPanel.frameAddTicketSale.setVisible(true);
				viewStadiumSectionDetails(view.gamesPanel.cb_Season.getSelectedIndex(), view.gamesPanel.cb_Game.getSelectedIndex(),Integer.valueOf(view.gamesPanel.gamesStadiumPanel.lastSelectedButton.getName())-1,4);
			}
		});
		view.gamesPanel.sectionDetailsPanel.frameAddTicketSale.btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
						
				if(model.season.get(view.gamesPanel.cb_Season.getSelectedIndex()).games.get(view.gamesPanel.cb_Game.getSelectedIndex()).gameSections.get(Integer.valueOf(view.gamesPanel.gamesStadiumPanel.lastSelectedButton.getName())-1).getUnsoldTickets()<Integer.valueOf(view.gamesPanel.sectionDetailsPanel.frameAddTicketSale.tf_DesiredAmount.getText())) {
					view.gamesPanel.sectionDetailsPanel.frameAddTicketSale.lblErrorMessage_ValueOutOfRange.setVisible(true);
				}
				else {
					viewStadiumSectionDetails(view.gamesPanel.cb_Season.getSelectedIndex(), view.gamesPanel.cb_Game.getSelectedIndex(),Integer.valueOf(view.gamesPanel.gamesStadiumPanel.lastSelectedButton.getName()),3);
					view.gamesPanel.sectionDetailsPanel.frameAddTicketSale.setVisible(false);
					view.gamesPanel.sectionDetailsPanel.frameAddTicketSale.tf_DesiredAmount.setText("");
					view.gamesPanel.sectionDetailsPanel.frameAddTicketSale.lblErrorMessage_ValueOutOfRange.setVisible(false);

				}

			}
		});
		view.gamesPanel.sectionDetailsPanel.frameAddTicketSale.btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.sectionDetailsPanel.frameAddTicketSale.setVisible(false);
				view.gamesPanel.sectionDetailsPanel.frameAddTicketSale.tf_DesiredAmount.setText("");
				view.gamesPanel.sectionDetailsPanel.frameAddTicketSale.lblErrorMessage_ValueOutOfRange.setVisible(false);
			}
		});
		//---ViewStadium Image Manipulations---//
		
		addMouseAdaptersToArrayList();
		addImagePathsToArrayList();
		addImageIconsToArrayList();
		
		setStadiumImages(0);
		
		//Section 44
		view.overviewPanel.overviewStadiumPanel.viewStadium_44.setBounds(view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().x + (int)(535*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y + (int)(451*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio) , (int)(stadiumImages.get(44).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(44).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_44.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(44), view.overviewPanel.overviewStadiumPanel.viewStadium_44));
		view.gamesPanel.gamesStadiumPanel.viewStadium_44.setBounds(view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().x + (int)(535*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y + (int)(451*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio) , (int)(stadiumImages.get(44).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(44).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_44.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(44), view.gamesPanel.gamesStadiumPanel.viewStadium_44));
		//
		
		//Section 43
		view.overviewPanel.overviewStadiumPanel.viewStadium_43.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_44.getBounds().x, view.overviewPanel.overviewStadiumPanel.viewStadium_44.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_44.getBounds().height, (int)(stadiumImages.get(43).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(43).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_43.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(43), view.overviewPanel.overviewStadiumPanel.viewStadium_43));
		view.gamesPanel.gamesStadiumPanel.viewStadium_43.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_44.getBounds().x, view.gamesPanel.gamesStadiumPanel.viewStadium_44.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_44.getBounds().height, (int)(stadiumImages.get(43).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(43).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_43.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(43), view.gamesPanel.gamesStadiumPanel.viewStadium_43));
		//
		
		//Section 42
		view.overviewPanel.overviewStadiumPanel.viewStadium_42.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_43.getBounds().x, view.overviewPanel.overviewStadiumPanel.viewStadium_43.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_43.getBounds().height, (int)(stadiumImages.get(42).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(42).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_42.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(42), view.overviewPanel.overviewStadiumPanel.viewStadium_42));
		view.gamesPanel.gamesStadiumPanel.viewStadium_42.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_43.getBounds().x, view.gamesPanel.gamesStadiumPanel.viewStadium_43.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_43.getBounds().height, (int)(stadiumImages.get(42).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(42).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_42.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(42), view.gamesPanel.gamesStadiumPanel.viewStadium_42));
		//
		
		//Section 41
		view.overviewPanel.overviewStadiumPanel.viewStadium_41.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_42.getBounds().x, view.overviewPanel.overviewStadiumPanel.viewStadium_42.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_42.getBounds().height, (int)(stadiumImages.get(41).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(41).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_41.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(41), view.overviewPanel.overviewStadiumPanel.viewStadium_41));
		view.gamesPanel.gamesStadiumPanel.viewStadium_41.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_42.getBounds().x, view.gamesPanel.gamesStadiumPanel.viewStadium_42.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_42.getBounds().height, (int)(stadiumImages.get(41).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(41).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_41.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(41), view.gamesPanel.gamesStadiumPanel.viewStadium_41));
		//
		
		//Section 40
		view.overviewPanel.overviewStadiumPanel.viewStadium_40.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_42.getBounds().x, view.overviewPanel.overviewStadiumPanel.viewStadium_41.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_41.getBounds().height, (int)(stadiumImages.get(40).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(40).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_40.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(40), view.overviewPanel.overviewStadiumPanel.viewStadium_40));
		view.gamesPanel.gamesStadiumPanel.viewStadium_40.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_42.getBounds().x, view.gamesPanel.gamesStadiumPanel.viewStadium_41.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_41.getBounds().height, (int)(stadiumImages.get(40).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(40).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_40.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(40), view.gamesPanel.gamesStadiumPanel.viewStadium_40));
		//
		
		//Section 20
		view.overviewPanel.overviewStadiumPanel.viewStadium_20.setBounds(view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().x, view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y, (int)(stadiumImages.get(20).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(20).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_20.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(20), view.overviewPanel.overviewStadiumPanel.viewStadium_20));
		view.gamesPanel.gamesStadiumPanel.viewStadium_20.setBounds(view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().x, view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y, (int)(stadiumImages.get(20).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(20).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_20.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(20), view.gamesPanel.gamesStadiumPanel.viewStadium_20));
		//
		
		//Section 1
		view.overviewPanel.overviewStadiumPanel.viewStadium_1.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_20.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_20.getBounds().width, view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y, (int)(stadiumImages.get(1).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(1).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_1.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(1), view.overviewPanel.overviewStadiumPanel.viewStadium_1));
		view.gamesPanel.gamesStadiumPanel.viewStadium_1.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_20.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_20.getBounds().width, view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y, (int)(stadiumImages.get(1).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(1).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_1.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(1), view.gamesPanel.gamesStadiumPanel.viewStadium_1));
		//
		
		//Section 2
		view.overviewPanel.overviewStadiumPanel.viewStadium_2.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_1.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_1.getBounds().width, view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y, (int)(stadiumImages.get(2).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(2).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_2.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(2), view.overviewPanel.overviewStadiumPanel.viewStadium_2));
		view.gamesPanel.gamesStadiumPanel.viewStadium_2.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_1.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_1.getBounds().width, view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y, (int)(stadiumImages.get(2).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(2).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_2.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(2), view.gamesPanel.gamesStadiumPanel.viewStadium_2));
		//
		
		//Section 3
		view.overviewPanel.overviewStadiumPanel.viewStadium_3.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_2.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_2.getBounds().width, view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y, (int)(stadiumImages.get(3).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(3).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_3.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(3), view.overviewPanel.overviewStadiumPanel.viewStadium_3));
		view.gamesPanel.gamesStadiumPanel.viewStadium_3.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_2.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_2.getBounds().width, view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y, (int)(stadiumImages.get(3).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(3).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_3.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(3), view.gamesPanel.gamesStadiumPanel.viewStadium_3));
		//
		
		//Section 4
		view.overviewPanel.overviewStadiumPanel.viewStadium_4.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_3.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_3.getBounds().width, view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y, (int)(stadiumImages.get(4).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(4).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_4.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(4), view.overviewPanel.overviewStadiumPanel.viewStadium_4));
		view.gamesPanel.gamesStadiumPanel.viewStadium_4.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_3.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_3.getBounds().width, view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y, (int)(stadiumImages.get(4).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(4).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_4.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(4), view.gamesPanel.gamesStadiumPanel.viewStadium_4));
		//
		
		//Section 5
		view.overviewPanel.overviewStadiumPanel.viewStadium_5.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_4.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_4.getBounds().width, view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y, (int)(stadiumImages.get(5).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(5).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_5.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(5), view.overviewPanel.overviewStadiumPanel.viewStadium_5));
		view.gamesPanel.gamesStadiumPanel.viewStadium_5.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_4.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_4.getBounds().width, view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y, (int)(stadiumImages.get(5).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(5).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_5.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(5), view.gamesPanel.gamesStadiumPanel.viewStadium_5));
		//
		
		//Section 6
		view.overviewPanel.overviewStadiumPanel.viewStadium_6.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_5.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_5.getBounds().width, view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y, (int)(stadiumImages.get(6).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(6).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_6.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(6), view.overviewPanel.overviewStadiumPanel.viewStadium_6));
		view.gamesPanel.gamesStadiumPanel.viewStadium_6.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_5.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_5.getBounds().width, view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y, (int)(stadiumImages.get(6).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(6).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_6.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(6), view.gamesPanel.gamesStadiumPanel.viewStadium_6));
		//
		
		//Section 7
		view.overviewPanel.overviewStadiumPanel.viewStadium_7.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_6.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_6.getBounds().width, view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y, (int)(stadiumImages.get(7).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(7).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_7.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(7), view.overviewPanel.overviewStadiumPanel.viewStadium_7));
		view.gamesPanel.gamesStadiumPanel.viewStadium_7.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_6.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_6.getBounds().width, view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y, (int)(stadiumImages.get(7).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(7).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_7.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(7), view.gamesPanel.gamesStadiumPanel.viewStadium_7));
		//
		
		//Section 21
		view.overviewPanel.overviewStadiumPanel.viewStadium_21.setBounds(view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().x + (int)(1013*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), view.overviewPanel.overviewStadiumPanel.viewStadium_1.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_6.getBounds().height, (int)(stadiumImages.get(21).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(21).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_21.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(21), view.overviewPanel.overviewStadiumPanel.viewStadium_21));
		view.gamesPanel.gamesStadiumPanel.viewStadium_21.setBounds(view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().x + (int)(1013*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), view.gamesPanel.gamesStadiumPanel.viewStadium_1.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_6.getBounds().height, (int)(stadiumImages.get(21).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(21).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_21.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(21), view.gamesPanel.gamesStadiumPanel.viewStadium_21));
		//
		
		//Section 22
		view.overviewPanel.overviewStadiumPanel.viewStadium_22.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_21.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_21.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_1.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_6.getBounds().height, (int)(stadiumImages.get(22).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(22).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_22.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(22), view.overviewPanel.overviewStadiumPanel.viewStadium_22));
		view.gamesPanel.gamesStadiumPanel.viewStadium_22.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_21.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_21.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_1.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_6.getBounds().height, (int)(stadiumImages.get(22).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(22).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_22.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(22), view.gamesPanel.gamesStadiumPanel.viewStadium_22));
		//
		
		//Section 23
		view.overviewPanel.overviewStadiumPanel.viewStadium_23.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_22.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_22.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_1.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_6.getBounds().height, (int)(stadiumImages.get(23).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(23).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_23.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(23), view.overviewPanel.overviewStadiumPanel.viewStadium_23));
		view.gamesPanel.gamesStadiumPanel.viewStadium_23.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_22.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_22.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_1.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_6.getBounds().height, (int)(stadiumImages.get(23).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(23).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_23.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(23), view.gamesPanel.gamesStadiumPanel.viewStadium_23));
		//
		
		//Section 24
		view.overviewPanel.overviewStadiumPanel.viewStadium_24.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_23.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_23.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_1.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_6.getBounds().height, (int)(stadiumImages.get(24).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(24).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_24.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(24), view.overviewPanel.overviewStadiumPanel.viewStadium_24));
		view.gamesPanel.gamesStadiumPanel.viewStadium_24.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_23.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_23.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_1.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_6.getBounds().height, (int)(stadiumImages.get(24).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(24).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_24.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(24), view.gamesPanel.gamesStadiumPanel.viewStadium_24));
		//
		
		//Section 25
		view.overviewPanel.overviewStadiumPanel.viewStadium_25.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_24.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_24.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_1.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_6.getBounds().height, (int)(stadiumImages.get(25).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(25).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_25.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(25), view.overviewPanel.overviewStadiumPanel.viewStadium_25));
		view.gamesPanel.gamesStadiumPanel.viewStadium_25.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_24.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_24.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_1.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_6.getBounds().height, (int)(stadiumImages.get(25).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(25).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_25.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(25), view.gamesPanel.gamesStadiumPanel.viewStadium_25));
		//
		
		//Section 26
		view.overviewPanel.overviewStadiumPanel.viewStadium_26.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_25.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_25.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_1.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_6.getBounds().height, (int)(stadiumImages.get(26).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(26).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_26.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(26), view.overviewPanel.overviewStadiumPanel.viewStadium_26));	
		view.gamesPanel.gamesStadiumPanel.viewStadium_26.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_25.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_25.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_1.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_6.getBounds().height, (int)(stadiumImages.get(26).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(26).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_26.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(26), view.gamesPanel.gamesStadiumPanel.viewStadium_26));
		//
		
		//Section 27
		view.overviewPanel.overviewStadiumPanel.viewStadium_27.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_26.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_26.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_1.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_6.getBounds().height, (int)(stadiumImages.get(27).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(27).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_27.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(27), view.overviewPanel.overviewStadiumPanel.viewStadium_27));	
		view.gamesPanel.gamesStadiumPanel.viewStadium_27.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_26.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_26.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_1.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_6.getBounds().height, (int)(stadiumImages.get(27).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(27).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_27.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(27), view.gamesPanel.gamesStadiumPanel.viewStadium_27));
		//
		
		//Section 28
		view.overviewPanel.overviewStadiumPanel.viewStadium_28.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_7.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_7.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_44.getBounds().y, (int)(stadiumImages.get(28).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(28).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_28.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(28), view.overviewPanel.overviewStadiumPanel.viewStadium_28));
		view.gamesPanel.gamesStadiumPanel.viewStadium_28.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_7.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_7.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_44.getBounds().y, (int)(stadiumImages.get(28).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(28).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_28.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(28), view.gamesPanel.gamesStadiumPanel.viewStadium_28));
		//
		
		//Section 29
		view.overviewPanel.overviewStadiumPanel.viewStadium_29.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_28.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_28.getBounds().width - (int)(stadiumImages.get(29).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), view.overviewPanel.overviewStadiumPanel.viewStadium_28.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_28.getBounds().height, (int)(stadiumImages.get(29).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(29).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_29.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(29), view.overviewPanel.overviewStadiumPanel.viewStadium_29));
		view.gamesPanel.gamesStadiumPanel.viewStadium_29.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_28.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_28.getBounds().width - (int)(stadiumImages.get(29).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), view.gamesPanel.gamesStadiumPanel.viewStadium_28.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_28.getBounds().height, (int)(stadiumImages.get(29).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(29).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_29.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(29), view.gamesPanel.gamesStadiumPanel.viewStadium_29));
		//
		
		//Section 30
		view.overviewPanel.overviewStadiumPanel.viewStadium_30.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_29.getBounds().x, view.overviewPanel.overviewStadiumPanel.viewStadium_29.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_29.getBounds().height, (int)(stadiumImages.get(30).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(30).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_30.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(30), view.overviewPanel.overviewStadiumPanel.viewStadium_30));
		view.gamesPanel.gamesStadiumPanel.viewStadium_30.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_29.getBounds().x, view.gamesPanel.gamesStadiumPanel.viewStadium_29.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_29.getBounds().height, (int)(stadiumImages.get(30).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(30).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_30.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(30), view.gamesPanel.gamesStadiumPanel.viewStadium_30));
		//
		
		//Section 31
		view.overviewPanel.overviewStadiumPanel.viewStadium_31.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_30.getBounds().x, view.overviewPanel.overviewStadiumPanel.viewStadium_30.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_30.getBounds().height, (int)(stadiumImages.get(31).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(31).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_31.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(31), view.overviewPanel.overviewStadiumPanel.viewStadium_31));
		view.gamesPanel.gamesStadiumPanel.viewStadium_31.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_30.getBounds().x, view.gamesPanel.gamesStadiumPanel.viewStadium_30.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_30.getBounds().height, (int)(stadiumImages.get(31).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(31).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_31.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(31), view.gamesPanel.gamesStadiumPanel.viewStadium_31));
		//
		
		//Section 8
		view.overviewPanel.overviewStadiumPanel.viewStadium_8.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_28.getBounds().x, view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y, (int)(stadiumImages.get(8).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(8).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_8.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(8), view.overviewPanel.overviewStadiumPanel.viewStadium_8));
		view.gamesPanel.gamesStadiumPanel.viewStadium_8.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_28.getBounds().x, view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y, (int)(stadiumImages.get(8).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(8).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_8.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(8), view.gamesPanel.gamesStadiumPanel.viewStadium_8));
		//
		
		//Section 9
		view.overviewPanel.overviewStadiumPanel.viewStadium_9.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_31.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_31.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_8.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_8.getBounds().height, (int)(stadiumImages.get(9).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(9).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_9.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(9), view.overviewPanel.overviewStadiumPanel.viewStadium_9));
		view.gamesPanel.gamesStadiumPanel.viewStadium_9.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_31.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_31.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_8.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_8.getBounds().height, (int)(stadiumImages.get(9).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(9).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_9.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(9), view.gamesPanel.gamesStadiumPanel.viewStadium_9));
		//
		
		//Section 19
		view.overviewPanel.overviewStadiumPanel.viewStadium_19.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_20.getBounds().x, view.overviewPanel.overviewStadiumPanel.viewStadium_20.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_20.getBounds().height, (int)(stadiumImages.get(19).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(19).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_19.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(19), view.overviewPanel.overviewStadiumPanel.viewStadium_19));
		view.gamesPanel.gamesStadiumPanel.viewStadium_19.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_20.getBounds().x, view.gamesPanel.gamesStadiumPanel.viewStadium_20.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_20.getBounds().height, (int)(stadiumImages.get(19).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(19).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_19.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(19), view.gamesPanel.gamesStadiumPanel.viewStadium_19));
		//
		
		//Section 18
		view.overviewPanel.overviewStadiumPanel.viewStadium_18.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_19.getBounds().x, view.overviewPanel.overviewStadiumPanel.viewStadium_19.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_19.getBounds().height, (int)(stadiumImages.get(18).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(18).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_18.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(18), view.overviewPanel.overviewStadiumPanel.viewStadium_18));
		view.gamesPanel.gamesStadiumPanel.viewStadium_18.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_19.getBounds().x, view.gamesPanel.gamesStadiumPanel.viewStadium_19.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_19.getBounds().height, (int)(stadiumImages.get(18).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(18).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_18.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(18), view.gamesPanel.gamesStadiumPanel.viewStadium_18));
		//
		
		//Section 17
		view.overviewPanel.overviewStadiumPanel.viewStadium_17.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_18.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_18.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_18.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_18.getBounds().height - (int)(stadiumImages.get(17).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(17).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(17).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_17.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(17), view.overviewPanel.overviewStadiumPanel.viewStadium_17));
		view.gamesPanel.gamesStadiumPanel.viewStadium_17.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_18.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_18.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_18.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_18.getBounds().height - (int)(stadiumImages.get(17).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(17).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(17).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_17.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(17), view.gamesPanel.gamesStadiumPanel.viewStadium_17));
		//
		
		//Section 16
		view.overviewPanel.overviewStadiumPanel.viewStadium_16.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_17.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_17.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_17.getBounds().y, (int)(stadiumImages.get(16).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(16).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_16.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(16), view.overviewPanel.overviewStadiumPanel.viewStadium_16));
		view.gamesPanel.gamesStadiumPanel.viewStadium_16.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_17.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_17.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_17.getBounds().y, (int)(stadiumImages.get(16).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(16).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_16.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(16), view.gamesPanel.gamesStadiumPanel.viewStadium_16));
		//
		
		//Section 15
		view.overviewPanel.overviewStadiumPanel.viewStadium_15.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_16.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_16.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_16.getBounds().y, (int)(stadiumImages.get(15).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(15).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_15.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(15), view.overviewPanel.overviewStadiumPanel.viewStadium_15));
		view.gamesPanel.gamesStadiumPanel.viewStadium_15.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_16.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_16.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_16.getBounds().y, (int)(stadiumImages.get(15).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(15).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_15.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(15), view.gamesPanel.gamesStadiumPanel.viewStadium_15));
		//
		
		//Section 14
		view.overviewPanel.overviewStadiumPanel.viewStadium_14.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_15.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_15.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_15.getBounds().y, (int)(stadiumImages.get(14).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(14).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_14.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(14), view.overviewPanel.overviewStadiumPanel.viewStadium_14));
		view.gamesPanel.gamesStadiumPanel.viewStadium_14.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_15.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_15.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_15.getBounds().y, (int)(stadiumImages.get(14).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(14).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_14.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(14), view.gamesPanel.gamesStadiumPanel.viewStadium_14));
		//
		
		//Section 13
		view.overviewPanel.overviewStadiumPanel.viewStadium_13.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_14.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_14.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_14.getBounds().y, (int)(stadiumImages.get(13).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(13).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_13.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(13), view.overviewPanel.overviewStadiumPanel.viewStadium_13));
		view.gamesPanel.gamesStadiumPanel.viewStadium_13.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_14.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_14.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_14.getBounds().y, (int)(stadiumImages.get(13).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(13).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_13.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(13), view.gamesPanel.gamesStadiumPanel.viewStadium_13));
		//
		
		//Section 12
		view.overviewPanel.overviewStadiumPanel.viewStadium_12.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_13.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_13.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_13.getBounds().y, (int)(stadiumImages.get(12).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(12).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_12.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(12), view.overviewPanel.overviewStadiumPanel.viewStadium_12));
		view.gamesPanel.gamesStadiumPanel.viewStadium_12.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_13.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_13.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_13.getBounds().y, (int)(stadiumImages.get(12).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(12).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_12.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(12), view.gamesPanel.gamesStadiumPanel.viewStadium_12));
		//
		
		//Section 11
		view.overviewPanel.overviewStadiumPanel.viewStadium_11.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_12.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_12.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_12.getBounds().y, (int)(stadiumImages.get(11).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(11).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_11.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(11), view.overviewPanel.overviewStadiumPanel.viewStadium_11));
		view.gamesPanel.gamesStadiumPanel.viewStadium_11.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_12.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_12.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_12.getBounds().y, (int)(stadiumImages.get(11).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(11).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_11.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(11), view.gamesPanel.gamesStadiumPanel.viewStadium_11));
		//
		
		//Section 39
		view.overviewPanel.overviewStadiumPanel.viewStadium_39.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_17.getBounds().x, view.overviewPanel.overviewStadiumPanel.viewStadium_17.getBounds().y - (int)(stadiumImages.get(39).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio) - 2, (int)(stadiumImages.get(39).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(39).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_39.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(39), view.overviewPanel.overviewStadiumPanel.viewStadium_39));
		view.gamesPanel.gamesStadiumPanel.viewStadium_39.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_17.getBounds().x, view.gamesPanel.gamesStadiumPanel.viewStadium_17.getBounds().y - (int)(stadiumImages.get(39).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio) - 2, (int)(stadiumImages.get(39).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(39).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_39.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(39), view.gamesPanel.gamesStadiumPanel.viewStadium_39));
		//
		
		//Section 38
		view.overviewPanel.overviewStadiumPanel.viewStadium_38.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_39.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_39.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_39.getBounds().y, (int)(stadiumImages.get(38).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(38).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_38.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(38), view.overviewPanel.overviewStadiumPanel.viewStadium_38));
		view.gamesPanel.gamesStadiumPanel.viewStadium_38.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_39.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_39.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_39.getBounds().y, (int)(stadiumImages.get(38).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(38).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_38.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(38), view.gamesPanel.gamesStadiumPanel.viewStadium_38));
		//
		
		//Section 37
		view.overviewPanel.overviewStadiumPanel.viewStadium_37.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_38.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_38.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_38.getBounds().y, (int)(stadiumImages.get(37).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(37).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_37.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(37), view.overviewPanel.overviewStadiumPanel.viewStadium_37));
		view.gamesPanel.gamesStadiumPanel.viewStadium_37.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_38.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_38.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_38.getBounds().y, (int)(stadiumImages.get(37).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(37).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_37.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(37), view.gamesPanel.gamesStadiumPanel.viewStadium_37));
		//
		
		//Section 36
		view.overviewPanel.overviewStadiumPanel.viewStadium_36.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_37.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_37.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_37.getBounds().y, (int)(stadiumImages.get(36).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(36).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_36.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(36), view.overviewPanel.overviewStadiumPanel.viewStadium_36));
		view.gamesPanel.gamesStadiumPanel.viewStadium_36.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_37.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_37.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_37.getBounds().y, (int)(stadiumImages.get(36).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(36).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_36.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(36), view.gamesPanel.gamesStadiumPanel.viewStadium_36));
		//
		
		//Section 35
		view.overviewPanel.overviewStadiumPanel.viewStadium_35.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_36.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_36.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_36.getBounds().y, (int)(stadiumImages.get(35).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(35).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_35.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(35), view.overviewPanel.overviewStadiumPanel.viewStadium_35));
		view.gamesPanel.gamesStadiumPanel.viewStadium_35.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_36.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_36.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_36.getBounds().y, (int)(stadiumImages.get(35).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(35).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_35.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(35), view.gamesPanel.gamesStadiumPanel.viewStadium_35));
		//
		
		//Section 34
		view.overviewPanel.overviewStadiumPanel.viewStadium_34.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_35.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_35.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_35.getBounds().y, (int)(stadiumImages.get(34).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(34).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_34.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(34), view.overviewPanel.overviewStadiumPanel.viewStadium_34));
		view.gamesPanel.gamesStadiumPanel.viewStadium_34.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_35.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_35.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_35.getBounds().y, (int)(stadiumImages.get(34).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(34).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_34.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(34), view.gamesPanel.gamesStadiumPanel.viewStadium_34));
		//
		
		//Section 33
		view.overviewPanel.overviewStadiumPanel.viewStadium_33.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_34.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_34.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_34.getBounds().y, (int)(stadiumImages.get(33).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(33).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_33.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(33), view.overviewPanel.overviewStadiumPanel.viewStadium_33));
		view.gamesPanel.gamesStadiumPanel.viewStadium_33.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_34.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_34.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_34.getBounds().y, (int)(stadiumImages.get(33).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(33).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_33.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(33), view.gamesPanel.gamesStadiumPanel.viewStadium_33));
		//
		
		//Section 32
		view.overviewPanel.overviewStadiumPanel.viewStadium_32.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_33.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_33.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_40.getBounds().y, (int)(stadiumImages.get(32).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(32).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_32.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(32), view.overviewPanel.overviewStadiumPanel.viewStadium_32));
		view.gamesPanel.gamesStadiumPanel.viewStadium_32.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_33.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_33.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_40.getBounds().y, (int)(stadiumImages.get(32).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(32).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_32.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(32), view.gamesPanel.gamesStadiumPanel.viewStadium_32));
		//
		
		//Section 10
		view.overviewPanel.overviewStadiumPanel.viewStadium_10.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_33.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_33.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_18.getBounds().y, (int)(stadiumImages.get(10).getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(10).getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_10.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(10), view.overviewPanel.overviewStadiumPanel.viewStadium_10));
		view.gamesPanel.gamesStadiumPanel.viewStadium_10.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_33.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_33.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_18.getBounds().y, (int)(stadiumImages.get(10).getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(stadiumImages.get(10).getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_10.setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(10), view.gamesPanel.gamesStadiumPanel.viewStadium_10));
		//
		
		addSectionButtonsToArrayList();
		setStadiumMouseAdapters(0);
		setButtonListeners(0);
		//--------------------------//

		
	}//end of constructor
	
	//---controller methods---//
	//---Sales panel----//
	public void displaySponsorsToTable() {
		for(int i=0;i<model.sponsorsSize;i++) {
			view.salesPanel.sponsorshipPanel.sponsorsToDisplay[i]=new String[] {model.sponsors.get(i).getName().toString(),model.sponsors.get(i).getContractStartDate().toString(),model.sponsors.get(i).getContractEndDate().toString(),String.valueOf(UI_Elements.displayCurrencyValue(model.sponsors.get(i).getTotalContractValue()))};
			}
		view.salesPanel.sponsorshipPanel.sponsorTableScrollPane.repaint();
	}
	
	public void deleteSponsorFromTable() {
		
		for(int i=0;i<model.sponsorsSize;i++) {
			view.salesPanel.sponsorshipPanel.sponsorsToDisplay[i]=new String[] {model.sponsors.get(i).getName().toString(),model.sponsors.get(i).getContractStartDate().toString(),model.sponsors.get(i).getContractEndDate().toString(),String.valueOf(model.sponsors.get(i).getTotalContractValue())};
			}
		view.salesPanel.sponsorshipPanel.sponsorsToDisplay[model.sponsorsSize]=new String[] {"","","",""};
		view.salesPanel.sponsorshipPanel.sponsorTableScrollPane.repaint();

	}
	
	public void displayGameRevenue(int seasonIndex, int gameIndex) {
		view.salesPanel.ticketsPanel.tf_TotalAttendance.setText(String.valueOf(model.season.get(seasonIndex).games.get(gameIndex).getTotalSingleTickets()) +"/"+String.valueOf(model.stadium.getCapacity()));
		view.salesPanel.ticketsPanel.tf_TotalRevenue.setText(String.valueOf(UI_Elements.displayCurrencyValue(model.season.get(seasonIndex).games.get(gameIndex).getSingleTicketsRevenue())));
		view.salesPanel.ticketsPanel.tf_TotalNumOfGameTickets.setText(String.valueOf(model.season.get(seasonIndex).games.get(gameIndex).getTotalSingleTickets()));
		view.salesPanel.ticketsPanel.tf_TotalRevenueGameTickets.setText(String.valueOf(UI_Elements.displayCurrencyValue(model.season.get(seasonIndex).games.get(gameIndex).getSingleTicketsRevenue())));
		view.salesPanel.ticketsPanel.tf_TotalSingleVIP.setText(String.valueOf(UI_Elements.displayCurrencyValue(model.season.get(seasonIndex).games.get(gameIndex).getVipRevenue())));
		view.salesPanel.ticketsPanel.tf_TotalSingleClubLevel.setText(String.valueOf(UI_Elements.displayCurrencyValue(model.season.get(seasonIndex).games.get(gameIndex).getClubLevelRevenue())));
		view.salesPanel.ticketsPanel.tf_TotalSingleBleachers.setText(String.valueOf(UI_Elements.displayCurrencyValue(model.season.get(seasonIndex).games.get(gameIndex).getBleachersRevenue())));

	}
	//games panel:
	private void displayAllGamesInSelectedSeason(int flag/* 1= gamesPanel else salesPanel*/) {
		if(flag==1) {
			view.gamesPanel.cb_Game.removeAllItems();
			if (view.gamesPanel.cb_Season.getSelectedIndex()>-1) {
				for (int i = 0; i < model.season.get(view.gamesPanel.cb_Season.getSelectedIndex()).getNumOfGames(); i++) {
					view.gamesPanel.cb_Game.addItem(model.season.get(view.gamesPanel.cb_Season.getSelectedIndex()).games.get(i).getName() + " - " + model.season.get(view.gamesPanel.cb_Season.getSelectedIndex()).games.get(i).getDate());
				}
			}
		}
		else {
			view.salesPanel.cb_SalesGame.removeAllItems();
			if (view.salesPanel.cb_SalesSeason.getSelectedIndex()>-1) {
				for (int i = 0; i < model.season.get(view.salesPanel.cb_SalesSeason.getSelectedIndex()).getNumOfGames(); i++) {
					view.salesPanel.cb_SalesGame.addItem(model.season.get(view.salesPanel.cb_SalesSeason.getSelectedIndex()).games.get(i).getName());
				}
			}
		}
		}
		
		//login panel:
		public void btnLoginPressed() {
		view.loginPanel.panelLogin.setVisible(false);
		switchMainMenuPage(view.menuPanel.btnOverview); //Mimics use of btnOverview as startup view
		
		view.loginPanel.lblLoginFailed.setVisible(false);
		
		//set the logged in user:
		view.menuPanel.btnUserName.setText("Welcome "+model.signInUser.getFirstName()+"!");
		view.menuPanel.btnUserName.setBorder(null);
		
		}
		
		//properties panel:
		public void displaySectionDetails(int index) {

			view.propertiesPanel.cb_SectionType.setSelectedItem(model.stadium.getArenaSection(index).getSectionType());
			view.propertiesPanel.cb_SectionRanking.setSelectedItem(model.stadium.getArenaSection(index).getSectionRanking());
			view.propertiesPanel.tf_SectionNumOfSeats.setText(String.valueOf(model.stadium.getArenaSection(index).getNumOfSeats()));
			if (model.stadium.getArenaSection(index).isRoofed()) {
				view.propertiesPanel.rdbtnIsRoofedYes.setSelected(true);
				view.propertiesPanel.rdbtnIsRoofedNO.setSelected(false);
			} else {
				view.propertiesPanel.rdbtnIsRoofedYes.setSelected(false);
				view.propertiesPanel.rdbtnIsRoofedNO.setSelected(true);
			}

		}
		
		//-----------------------------------------------------------//
		 
		//ViewStadium
		public void viewStadiumSectionDetails(int seasonIndex, int gameIndex, int sectionToDisplay, int viewStadiumToDisplayIn/*  1=viewStadium in games panel, 2=viewStadium in overview panel, 3=details in ticket sale  */) {
			if (viewStadiumToDisplayIn==1) {
				view.gamesPanel.sectionDetailsPanel.tf_SectionNumber.setText(String.valueOf(model.stadium.getArenaSection(sectionToDisplay).getSectionNumber()));
				view.gamesPanel.sectionDetailsPanel.tf_SectionName.setText(String.valueOf(model.stadium.getArenaSection(sectionToDisplay).getSectionName()));
				view.gamesPanel.sectionDetailsPanel.tf_SectionRanking.setText(String.valueOf(model.stadium.getArenaSection(sectionToDisplay).getSectionRanking()));
				view.gamesPanel.sectionDetailsPanel.tf_SectionType.setText(String.valueOf(model.stadium.getArenaSection(sectionToDisplay).getSectionType()));
				view.gamesPanel.sectionDetailsPanel.tf_TicketPrice.setText(String.valueOf(UI_Elements.displayCurrencyValue(model.stadium.getArenaSection(sectionToDisplay).getTicketPrice())));
				view.gamesPanel.sectionDetailsPanel.tf_Attendance.setText(String.valueOf(model.season.get(seasonIndex).games.get(gameIndex).gameSections.get(sectionToDisplay).getSoldTickets()) + "/" + String.valueOf(model.stadium.getArenaSection(sectionToDisplay).getNumOfSeats()));
				//if for isRoofed:
				if (model.stadium.getArenaSection(sectionToDisplay).isRoofed()==true) {
					view.gamesPanel.sectionDetailsPanel.tf_IsRoofed.setText("Yes");
				} else {
					view.gamesPanel.sectionDetailsPanel.tf_IsRoofed.setText("No");
				}
			}
			else if(viewStadiumToDisplayIn==2) {
				view.overviewPanel.sectionDetailsPanel.lblSectionNumber.setText(String.valueOf(model.stadium.getArenaSection(sectionToDisplay).getSectionName()));
				view.overviewPanel.sectionDetailsPanel.tf_SectionRanking.setText(String.valueOf(model.stadium.getArenaSection(sectionToDisplay).getSectionRanking()));
				view.overviewPanel.sectionDetailsPanel.tf_SectionType.setText(String.valueOf(model.stadium.getArenaSection(sectionToDisplay).getSectionType()));
				view.overviewPanel.sectionDetailsPanel.tf_TicketPrice.setText(String.valueOf(UI_Elements.displayCurrencyValue(model.stadium.getArenaSection(sectionToDisplay).getTicketPrice())));
				view.overviewPanel.sectionDetailsPanel.tf_Capacity.setText(String.valueOf(model.stadium.getArenaSection(sectionToDisplay).getNumOfSeats()));
				//if for isRoofed:
				if (model.stadium.getArenaSection(sectionToDisplay).isRoofed()==true) {
					view.overviewPanel.sectionDetailsPanel.tf_IsRoofed.setText("Yes");
				} else {
					view.overviewPanel.sectionDetailsPanel.tf_IsRoofed.setText("No");
				}
			}
			else if(viewStadiumToDisplayIn==3){
				model.updateGameSection(sectionToDisplay, gameIndex, seasonIndex, Integer.valueOf(view.gamesPanel.sectionDetailsPanel.frameAddTicketSale.tf_DesiredAmount.getText()));
				view.gamesPanel.sectionDetailsPanel.tf_Attendance.setText(String.valueOf(model.season.get(seasonIndex).games.get(gameIndex).gameSections.get(sectionToDisplay-1).getSoldTickets()) + "/" + String.valueOf(model.stadium.getArenaSection(sectionToDisplay-1).getNumOfSeats()));
				if(model.season.get(seasonIndex).games.get(gameIndex).gameSections.get(sectionToDisplay-1).getSectionType().equals("VIP")) {
					model.season.get(seasonIndex).games.get(gameIndex).vipTicketsSold(Integer.valueOf(view.gamesPanel.sectionDetailsPanel.frameAddTicketSale.tf_DesiredAmount.getText()), sectionToDisplay-1);
				}
				else if (model.season.get(seasonIndex).games.get(gameIndex).gameSections.get(sectionToDisplay-1).getSectionType().equals("Club Level")) {
					model.season.get(seasonIndex).games.get(gameIndex).clubLevelTicketsSold(Integer.valueOf(view.gamesPanel.sectionDetailsPanel.frameAddTicketSale.tf_DesiredAmount.getText()), sectionToDisplay-1);
				}
				else {
					model.season.get(seasonIndex).games.get(gameIndex).bleachersTicketsSold(Integer.valueOf(view.gamesPanel.sectionDetailsPanel.frameAddTicketSale.tf_DesiredAmount.getText()), sectionToDisplay-1);
				}
			}
			else {
				view.gamesPanel.sectionDetailsPanel.frameAddTicketSale.lblSectionNumber.setText(model.stadium.getArenaSection(sectionToDisplay).getSectionName());
				view.gamesPanel.sectionDetailsPanel.frameAddTicketSale.lblSectionTypeValue.setText(model.stadium.getArenaSection(sectionToDisplay).getSectionType());
				view.gamesPanel.sectionDetailsPanel.frameAddTicketSale.lblTicketPriceValue.setText(String.valueOf(UI_Elements.displayCurrencyValue(model.stadium.getArenaSection(sectionToDisplay).getTicketPrice())));
				view.gamesPanel.sectionDetailsPanel.frameAddTicketSale.lblAvailableTicketsValue.setText(String.valueOf(model.season.get(view.gamesPanel.cb_Season.getSelectedIndex()).games.get(view.gamesPanel.cb_Game.getSelectedIndex()).gameSections.get(sectionToDisplay).getUnsoldTickets()));

			}
		}
		//facilities panel:
		public void displaysSecurityToTable() {
			for(int i=0;i<model.securitySize;i++) {
				view.facilitiesPanel.securityPanel.securityToDisplay[i]=new String[] {model.security.get(i).getName().toString(),model.security.get(i).getContractStartDate().toString(),model.security.get(i).getJobDescription().toString(),String.valueOf(UI_Elements.displayCurrencyValue(model.security.get(i).getSalary()))};			
			}
			view.facilitiesPanel.securityPanel.securityEmployeeTableScrollPane.repaint();
		}
		
		public void deleteSecurityFromTable() {
			
			for(int i=0;i<model.securitySize;i++) {
				view.facilitiesPanel.securityPanel.securityToDisplay[i]=new String[] {model.security.get(i).getName().toString(),model.security.get(i).getContractStartDate().toString(),model.security.get(i).getJobDescription().toString(),String.valueOf(model.security.get(i).getSalary())};
			}
			view.facilitiesPanel.securityPanel.securityToDisplay[model.securitySize]=new String[] {"","","",""};
			view.facilitiesPanel.securityPanel.securityEmployeeTableScrollPane.repaint();
		}
		
		
		public void displaysMaintenanceToTable() {
			for(int i=0;i<model.maintenanceSize;i++) {
				view.facilitiesPanel.maintenancePanel.maintenanceToDisplay[i]=new String[] {model.maintenance.get(i).getName().toString(),model.maintenance.get(i).getMaintenanceStartdate().toString(),model.maintenance.get(i).getMaintenanceReason().toString(),String.valueOf(model.maintenance.get(i).getPriority())};
				}
			view.facilitiesPanel.maintenancePanel.maintenanceEmployeeTableScrollPane.repaint();
		}
		
		public void deleteMaintenanceFromTable() {
			
			for(int i=0;i<model.maintenanceSize;i++) {
				view.facilitiesPanel.maintenancePanel.maintenanceToDisplay[i]=new String[] {model.maintenance.get(i).getName().toString(),model.maintenance.get(i).getMaintenanceStartdate().toString(),model.maintenance.get(i).getMaintenanceReason().toString(),String.valueOf(model.maintenance.get(i).getPriority())};
			}
			view.facilitiesPanel.maintenancePanel.maintenanceToDisplay[model.maintenanceSize]=new String[] {"","","",""};
			view.facilitiesPanel.maintenancePanel.maintenanceEmployeeTableScrollPane.repaint();
		}
	
	
	public String getViewStadiumSectionType(int i_SectionNum) {
		
		StringBuilder type = new StringBuilder();
		String sectionType = model.stadium.getArenaSection(i_SectionNum-1).getSectionType();	
		
		if(sectionType != null)
		{
			if(sectionType.equals("Club Level"))
			{
				type.append("_" + "ClubLevel");				
			}
			else
			{
				type.append("_" + sectionType);				

			}
		}
		return type.toString();
	}
	
	private void addMouseAdaptersToArrayList()
	{
		mouseAdaptersOverview.add(ma1_Overview); //dummy - so we'd use "real" section number
		mouseAdaptersOverview.add(ma1_Overview);
		mouseAdaptersOverview.add(ma2_Overview);
		mouseAdaptersOverview.add(ma3_Overview);
		mouseAdaptersOverview.add(ma4_Overview);
		mouseAdaptersOverview.add(ma5_Overview);
		mouseAdaptersOverview.add(ma6_Overview);
		mouseAdaptersOverview.add(ma7_Overview);
		mouseAdaptersOverview.add(ma8_Overview);
		mouseAdaptersOverview.add(ma9_Overview);
		mouseAdaptersOverview.add(ma10_Overview);
		mouseAdaptersOverview.add(ma11_Overview);
		mouseAdaptersOverview.add(ma12_Overview);
		mouseAdaptersOverview.add(ma13_Overview);
		mouseAdaptersOverview.add(ma14_Overview);
		mouseAdaptersOverview.add(ma15_Overview);
		mouseAdaptersOverview.add(ma16_Overview);
		mouseAdaptersOverview.add(ma17_Overview);
		mouseAdaptersOverview.add(ma18_Overview);
		mouseAdaptersOverview.add(ma19_Overview);
		mouseAdaptersOverview.add(ma20_Overview);
		mouseAdaptersOverview.add(ma21_Overview);
		mouseAdaptersOverview.add(ma22_Overview);
		mouseAdaptersOverview.add(ma23_Overview);
		mouseAdaptersOverview.add(ma24_Overview);
		mouseAdaptersOverview.add(ma25_Overview);
		mouseAdaptersOverview.add(ma26_Overview);
		mouseAdaptersOverview.add(ma27_Overview);
		mouseAdaptersOverview.add(ma28_Overview);
		mouseAdaptersOverview.add(ma29_Overview);
		mouseAdaptersOverview.add(ma30_Overview);
		mouseAdaptersOverview.add(ma31_Overview);
		mouseAdaptersOverview.add(ma32_Overview);
		mouseAdaptersOverview.add(ma33_Overview);
		mouseAdaptersOverview.add(ma34_Overview);
		mouseAdaptersOverview.add(ma35_Overview);
		mouseAdaptersOverview.add(ma36_Overview);
		mouseAdaptersOverview.add(ma37_Overview);
		mouseAdaptersOverview.add(ma38_Overview);
		mouseAdaptersOverview.add(ma39_Overview);
		mouseAdaptersOverview.add(ma40_Overview);
		mouseAdaptersOverview.add(ma41_Overview);
		mouseAdaptersOverview.add(ma42_Overview);
		mouseAdaptersOverview.add(ma43_Overview);
		mouseAdaptersOverview.add(ma44_Overview);
		
		mouseAdaptersGames.add(ma1_Games); //dummy - so we'd use "real" section number
		mouseAdaptersGames.add(ma1_Games);
		mouseAdaptersGames.add(ma2_Games);
		mouseAdaptersGames.add(ma3_Games);
		mouseAdaptersGames.add(ma4_Games);
		mouseAdaptersGames.add(ma5_Games);
		mouseAdaptersGames.add(ma6_Games);
		mouseAdaptersGames.add(ma7_Games);
		mouseAdaptersGames.add(ma8_Games);
		mouseAdaptersGames.add(ma9_Games);
		mouseAdaptersGames.add(ma10_Games);
		mouseAdaptersGames.add(ma11_Games);
		mouseAdaptersGames.add(ma12_Games);
		mouseAdaptersGames.add(ma13_Games);
		mouseAdaptersGames.add(ma14_Games);
		mouseAdaptersGames.add(ma15_Games);
		mouseAdaptersGames.add(ma16_Games);
		mouseAdaptersGames.add(ma17_Games);
		mouseAdaptersGames.add(ma18_Games);
		mouseAdaptersGames.add(ma19_Games);
		mouseAdaptersGames.add(ma20_Games);
		mouseAdaptersGames.add(ma21_Games);
		mouseAdaptersGames.add(ma22_Games);
		mouseAdaptersGames.add(ma23_Games);
		mouseAdaptersGames.add(ma24_Games);
		mouseAdaptersGames.add(ma25_Games);
		mouseAdaptersGames.add(ma26_Games);
		mouseAdaptersGames.add(ma27_Games);
		mouseAdaptersGames.add(ma28_Games);
		mouseAdaptersGames.add(ma29_Games);
		mouseAdaptersGames.add(ma30_Games);
		mouseAdaptersGames.add(ma31_Games);
		mouseAdaptersGames.add(ma32_Games);
		mouseAdaptersGames.add(ma33_Games);
		mouseAdaptersGames.add(ma34_Games);
		mouseAdaptersGames.add(ma35_Games);
		mouseAdaptersGames.add(ma36_Games);
		mouseAdaptersGames.add(ma37_Games);
		mouseAdaptersGames.add(ma38_Games);
		mouseAdaptersGames.add(ma39_Games);
		mouseAdaptersGames.add(ma40_Games);
		mouseAdaptersGames.add(ma41_Games);
		mouseAdaptersGames.add(ma42_Games);
		mouseAdaptersGames.add(ma43_Games);
		mouseAdaptersGames.add(ma44_Games);
	}
	
	private void addImagePathsToArrayList()
	{
		stadiumImagePaths.add(path1); //dummy - so we'd use "real" section number
		stadiumImagePaths.add(path1);
		stadiumImagePaths.add(path2);
		stadiumImagePaths.add(path3);
		stadiumImagePaths.add(path4);
		stadiumImagePaths.add(path5);
		stadiumImagePaths.add(path6);
		stadiumImagePaths.add(path7);
		stadiumImagePaths.add(path8);
		stadiumImagePaths.add(path9);
		stadiumImagePaths.add(path10);
		stadiumImagePaths.add(path11);
		stadiumImagePaths.add(path12);
		stadiumImagePaths.add(path13);
		stadiumImagePaths.add(path14);
		stadiumImagePaths.add(path15);
		stadiumImagePaths.add(path16);
		stadiumImagePaths.add(path17);
		stadiumImagePaths.add(path18);
		stadiumImagePaths.add(path19);
		stadiumImagePaths.add(path20);
		stadiumImagePaths.add(path21);
		stadiumImagePaths.add(path22);
		stadiumImagePaths.add(path23);
		stadiumImagePaths.add(path24);
		stadiumImagePaths.add(path25);
		stadiumImagePaths.add(path26);
		stadiumImagePaths.add(path27);
		stadiumImagePaths.add(path28);
		stadiumImagePaths.add(path29);
		stadiumImagePaths.add(path30);
		stadiumImagePaths.add(path31);
		stadiumImagePaths.add(path32);
		stadiumImagePaths.add(path33);
		stadiumImagePaths.add(path34);
		stadiumImagePaths.add(path35);
		stadiumImagePaths.add(path36);
		stadiumImagePaths.add(path37);
		stadiumImagePaths.add(path38);
		stadiumImagePaths.add(path39);
		stadiumImagePaths.add(path40);
		stadiumImagePaths.add(path41);
		stadiumImagePaths.add(path42);
		stadiumImagePaths.add(path43);
		stadiumImagePaths.add(path44);
	}
	
	private void addImageIconsToArrayList()
	{
		stadiumImages.add(img_1); //dummy - so we'd use "real" section number
		stadiumImages.add(img_1);
		stadiumImages.add(img_2);
		stadiumImages.add(img_3);
		stadiumImages.add(img_4);
		stadiumImages.add(img_5);
		stadiumImages.add(img_6);
		stadiumImages.add(img_7);
		stadiumImages.add(img_8);
		stadiumImages.add(img_9);
		stadiumImages.add(img_10);
		stadiumImages.add(img_11);
		stadiumImages.add(img_12);
		stadiumImages.add(img_13);
		stadiumImages.add(img_14);
		stadiumImages.add(img_15);
		stadiumImages.add(img_16);
		stadiumImages.add(img_17);
		stadiumImages.add(img_18);
		stadiumImages.add(img_19);
		stadiumImages.add(img_20);
		stadiumImages.add(img_21);
		stadiumImages.add(img_22);
		stadiumImages.add(img_23);
		stadiumImages.add(img_24);
		stadiumImages.add(img_25);
		stadiumImages.add(img_26);
		stadiumImages.add(img_27);
		stadiumImages.add(img_28);
		stadiumImages.add(img_29);
		stadiumImages.add(img_30);
		stadiumImages.add(img_31);
		stadiumImages.add(img_32);
		stadiumImages.add(img_33);
		stadiumImages.add(img_34);
		stadiumImages.add(img_35);
		stadiumImages.add(img_36);
		stadiumImages.add(img_37);
		stadiumImages.add(img_38);
		stadiumImages.add(img_39);
		stadiumImages.add(img_40);
		stadiumImages.add(img_41);
		stadiumImages.add(img_42);
		stadiumImages.add(img_43);
		stadiumImages.add(img_44);
	}
	
	private void addSectionButtonsToArrayList() {
		//add all buttons to list		
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_1); //dummy - so we'd use "real" section number
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_1);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_2);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_3);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_4);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_5);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_6);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_7);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_8);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_9);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_10);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_11);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_12);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_13);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_14);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_15);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_16);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_17);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_18);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_19);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_20);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_21);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_22);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_23);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_24);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_25);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_26);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_27);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_28);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_29);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_30);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_31);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_32);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_33);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_34);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_35);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_36);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_37);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_38);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_39);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_40);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_41);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_42);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_43);
				stadiumButtonsOverview.add(view.overviewPanel.overviewStadiumPanel.viewStadium_44);
				
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_1); //dummy - so we'd use "real" section number
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_1);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_2);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_3);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_4);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_5);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_6);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_7);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_8);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_9);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_10);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_11);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_12);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_13);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_14);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_15);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_16);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_17);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_18);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_19);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_20);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_21);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_22);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_23);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_24);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_25);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_26);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_27);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_28);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_29);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_30);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_31);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_32);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_33);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_34);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_35);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_36);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_37);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_38);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_39);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_40);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_41);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_42);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_43);
				stadiumButtonsGames.add(view.gamesPanel.gamesStadiumPanel.viewStadium_44);
	}
	private void setStadiumMouseAdapters(int i_Index)
	{
		if(i_Index == 0)
		{
			for(int i=1;i<stadiumImagePaths.size();i++)
			{
				JButton ButtonOverview = stadiumButtonsOverview.get(i);
				JButton ButtonGames = stadiumButtonsGames.get(i);
				
				MouseAdapter ma_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(ButtonOverview, stadiumImages.get(i), stadiumImagesRollover.get(i), stadiumImagesSelected.get(i));
				mouseAdaptersOverview.set(i, ma_Overview);
				MouseAdapter ma_Games = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(ButtonGames, stadiumImages.get(i), stadiumImagesRollover.get(i), stadiumImagesSelected.get(i));
				mouseAdaptersGames.set(i, ma_Games);
				
			}
		}
		else
		{
			JButton ButtonOverview = stadiumButtonsOverview.get(i_Index);
			JButton ButtonGames = stadiumButtonsGames.get(i_Index);

			MouseAdapter ma_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(ButtonOverview, stadiumImages.get(i_Index), stadiumImagesRollover.get(i_Index), stadiumImagesSelected.get(i_Index));
			mouseAdaptersOverview.set(i_Index, ma_Overview);
			MouseAdapter ma_Games = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(ButtonGames, stadiumImages.get(i_Index), stadiumImagesRollover.get(i_Index), stadiumImagesSelected.get(i_Index));
			mouseAdaptersGames.set(i_Index, ma_Games);
		}	
	}
	
	private void setButtonListeners(int i_Index)
	{
		if(i_Index == 0)
		{
			for(int i=1;i<mouseAdaptersOverview.size();i++)
			{
				final int currentIndex = i; //action listener needs a final value
				
				stadiumButtonsOverview.get(currentIndex).addMouseListener(mouseAdaptersOverview.get(currentIndex));
				stadiumButtonsGames.get(currentIndex).addMouseListener(mouseAdaptersGames.get(currentIndex));
				
				stadiumButtonsOverview.get(currentIndex).addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(stadiumButtonsOverview.get(currentIndex), mouseAdaptersOverview.get(currentIndex), stadiumImagesRollover.get(currentIndex));
						viewStadiumSectionDetails(0, 0, currentIndex-1, 2);
					}
				});
				stadiumButtonsGames.get(currentIndex).addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(stadiumButtonsGames.get(currentIndex), mouseAdaptersGames.get(currentIndex), stadiumImagesRollover.get(currentIndex));
						viewStadiumSectionDetails(view.gamesPanel.cb_Season.getSelectedIndex(), view.gamesPanel.cb_Game.getSelectedIndex(), currentIndex-1, 1);
					}
				});
			}
		}
		else
		{
			stadiumButtonsOverview.get(i_Index).addMouseListener(mouseAdaptersOverview.get(i_Index));
			stadiumButtonsGames.get(i_Index).addMouseListener(mouseAdaptersGames.get(i_Index));
			
			stadiumButtonsOverview.get(i_Index).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(stadiumButtonsOverview.get(i_Index), mouseAdaptersOverview.get(i_Index), stadiumImagesRollover.get(i_Index));
					viewStadiumSectionDetails(0, 0, i_Index-1, 2);
				}
			});
			stadiumButtonsGames.get(i_Index).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(stadiumButtonsGames.get(i_Index), mouseAdaptersGames.get(i_Index), stadiumImagesRollover.get(i_Index));
					viewStadiumSectionDetails(view.gamesPanel.cb_Season.getSelectedIndex(), view.gamesPanel.cb_Game.getSelectedIndex(), i_Index-1, 1);
				}
			});
		}
		
	}
	
	private void setStadiumImagePaths(int i_Index)
	{
		
		if(i_Index == 0)
		{
			for(int i=1;i<stadiumImagePaths.size();i++)
			{
				StringBuilder path = new StringBuilder();
				String sectionIndex = Integer.toString(i);
				path.append("/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(i) + "_" + sectionIndex + ".png");
				stadiumImagePaths.set(i, path.toString());
			}
		}
		else
		{
			StringBuilder path = new StringBuilder();
			String sectionIndex = Integer.toString(i_Index);
			path.append("/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(i_Index) + "_" + sectionIndex + ".png");
			stadiumImagePaths.set(i_Index, path.toString());
		}	
		
	}

	private void setStadiumImages(int i_Index)
	{
		setStadiumImagePaths(i_Index);
		if(i_Index == 0)
		{
			setStadiumAncillaryImages();
			for(int i=1;i<stadiumImages.size();i++)
			{
				ImageIcon img = new ImageIcon(Controller.class.getResource(stadiumImagePaths.get(i)));
				stadiumImages.set(i, img);
			}
		}
		else
		{
			ImageIcon img = new ImageIcon(Controller.class.getResource(stadiumImagePaths.get(i_Index)));
			stadiumImages.set(i_Index, img);
		}
	}
	
	private void setStadiumAncillaryImages() //set rollover and selected images
	{
		for(int i=1;i<stadiumImages.size();i++)
		{
			String sectionIndex = Integer.toString(i);
			StringBuilder path_R = new StringBuilder();
			path_R.append("/Images/StadiumSlices/Stadium_Rollover_" + sectionIndex + ".png");
			ImageIcon img_R = new ImageIcon(Controller.class.getResource(path_R.toString()));
			StringBuilder path_S = new StringBuilder();
			path_S.append("/Images/StadiumSlices/Stadium_Selected_" + sectionIndex + ".png");
			ImageIcon img_S = new ImageIcon(Controller.class.getResource(path_S.toString()));
			if(i==1) //Create Dummy
			{
				stadiumImagesRollover.add(img_R);
				stadiumImagesSelected.add(img_S);
			}
			stadiumImagesRollover.add(img_R);
			stadiumImagesSelected.add(img_S);
		}

	}
	
	public void redrawStadium(int i_Index)
	{
		setStadiumImages(i_Index);		
		if(i_Index == 0)

		{
			for(int i=1;i<stadiumButtonsOverview.size();i++)
			{
				stadiumButtonsOverview.get(i).setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(i), stadiumButtonsOverview.get(i)));
				stadiumButtonsGames.get(i).setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(i), stadiumButtonsGames.get(i)));
				
				stadiumButtonsOverview.get(i).removeMouseListener(mouseAdaptersOverview.get(i));
				stadiumButtonsGames.get(i).removeMouseListener(mouseAdaptersGames.get(i));
				setStadiumMouseAdapters(i);
				stadiumButtonsOverview.get(i).addMouseListener(mouseAdaptersOverview.get(i));
				stadiumButtonsGames.get(i).addMouseListener(mouseAdaptersGames.get(i));
			}
		}
		else
		{
			stadiumButtonsOverview.get(i_Index).setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(i_Index), stadiumButtonsOverview.get(i_Index)));
			stadiumButtonsGames.get(i_Index).setIcon(UI_Elements.scaleImageToBox(stadiumImages.get(i_Index), stadiumButtonsGames.get(i_Index)));
			
			stadiumButtonsOverview.get(i_Index).removeMouseListener(mouseAdaptersOverview.get(i_Index));
			stadiumButtonsGames.get(i_Index).removeMouseListener(mouseAdaptersGames.get(i_Index));
			setStadiumMouseAdapters(i_Index);
			stadiumButtonsOverview.get(i_Index).addMouseListener(mouseAdaptersOverview.get(i_Index));
			stadiumButtonsGames.get(i_Index).addMouseListener(mouseAdaptersGames.get(i_Index));
		}
	}
	///
	
	public void switchMainMenuPage(JButton i_PressedButton)
	{
		view.menuPanel.menuPanel.setVisible(true);
		//Make all panels invisible and all buttons set to default color
		view.overviewPanel.panelOverview.setVisible(false);
		view.menuPanel.btnOverview.setBackground(UI_Elements.color_menuBar);
		view.propertiesPanel.panelProperties.setVisible(false);
		view.menuPanel.btnProperties.setBackground(UI_Elements.color_menuBar);
		view.salesPanel.panelSales.setVisible(false);
		view.menuPanel.btnSales.setBackground(UI_Elements.color_menuBar);
		view.facilitiesPanel.panelFacilities.setVisible(false);
		view.menuPanel.btnFacilities.setBackground(UI_Elements.color_menuBar);
		view.gamesPanel.panelGames.setVisible(false);
		view.menuPanel.btnGames.setBackground(UI_Elements.color_menuBar);
		//switch page and button color based on the pressed one
		switch(i_PressedButton.getText())
		{
			case "OVERVIEW":
				view.overviewPanel.panelOverview.setVisible(true);
				view.menuPanel.btnOverview.setBackground(UI_Elements.color_menuButtonSelected);
				break;
			case "PROPERTIES":
				view.propertiesPanel.panelProperties.setVisible(true);
				view.menuPanel.btnProperties.setBackground(UI_Elements.color_menuButtonSelected);
				break;
			case "SALES":
				view.salesPanel.panelSales.setVisible(true);
				view.menuPanel.btnSales.setBackground(UI_Elements.color_menuButtonSelected);
				break;
			case "FACILITIES":
				view.facilitiesPanel.panelFacilities.setVisible(true);
				view.menuPanel.btnFacilities.setBackground(UI_Elements.color_menuButtonSelected);
				break;
			case "GAMES":
				view.gamesPanel.panelGames.setVisible(true);
				view.menuPanel.btnGames.setBackground(UI_Elements.color_menuButtonSelected);
				break;
		}
	}
	
	
	
	
}
