package view;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class View extends JFrame {
	
	public JPanel mainPanel;

	//sign up frame declaration:
	public SignUp signUpFrame;
	//---panels declarations---//
	public Login loginPanel;
	public Menu menuPanel;
	public Overview  overviewPanel;
	public Properties propertiesPanel;
	public Sales salesPanel;
	public Facilities facilitiesPanel;
	public Games gamesPanel;
	//-------------------------//

	public View() {
		// set main JFrame:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1114, 600);
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		UI_Elements.createFonts();
		
		// set sign up frame:
		signUpFrame = new SignUp();
		// set all panels:
		loginPanel = new Login();
		overviewPanel = new Overview();
		propertiesPanel = new Properties();
		salesPanel = new Sales();
		facilitiesPanel= new Facilities();
		gamesPanel= new Games();
		menuPanel = new Menu();
		// -------------//
		setContentPane(mainPanel);
		getContentPane().add(loginPanel.panelLogin);
		getContentPane().add(overviewPanel.panelOverview);
		getContentPane().add(propertiesPanel.panelProperties);
		getContentPane().add(salesPanel.panelSales);
		getContentPane().add(facilitiesPanel.panelFacilities);
		getContentPane().add(gamesPanel.panelGames);
		getContentPane().add(menuPanel.menuPanel);
		
		displayLoginPage();

	} //end of constructor
	
	public void displayLoginPage() {
		loginPanel.panelLogin.setVisible(true);
		menuPanel.menuPanel.setVisible(false);
		overviewPanel.panelOverview.setVisible(false);
		propertiesPanel.panelProperties.setVisible(false);
		salesPanel.panelSales.setVisible(false);
		facilitiesPanel.panelFacilities.setVisible(false);
		gamesPanel.panelGames.setVisible(false);
	}


}
