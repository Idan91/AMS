package AMS;

import java.awt.EventQueue;

import view.*;
import controller.*;
import model.*;
import java.awt.Toolkit;

public class Main {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("unused")
			public void run() {				
				try {
					Model amsModel = new Model();
					View amsView = new View();
					Controller amsController = new Controller(amsView, amsModel);
								
					amsView.setVisible(true);
					amsView.setResizable(false);
					amsView.setTitle("AMS - Arena Management System");
					amsView.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/Images/Icon.jpg")));
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
