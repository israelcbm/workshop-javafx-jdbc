package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{

	@FXML
	private MenuItem menuItamSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	private void onMenuitemSellerAction() {
		System.out.println("onMenuitemSellerAction");
	}
	
	@FXML
	private void onMenuitemDepartmentAction() {
		System.out.println("onMenuitemDepartmentAction");
	}
	
	@FXML
	private void onMenuitemAboutAction() {
		System.out.println("onMenuitemAboutAction");
	}
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		
	}	
}
