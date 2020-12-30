package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Maincontroller {
	@FXML
	private Button calbmi;
	
	@FXML
	private Button login;
	
	public void changescreentoBMI(ActionEvent event) throws IOException {
		Parent new_root = FXMLLoader.load(getClass().getResource("calculateBMI.fxml"));
		Scene new_rootscene = new Scene(new_root);
		
		// Getting Stage Information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(new_rootscene);
		window.show();
		
	}
	
	public void changescreentologin(ActionEvent event) throws IOException {
		Parent new_root = FXMLLoader.load(getClass().getResource("login.fxml"));
		Scene new_rootscene = new Scene(new_root);
		
		// Getting Stage Information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(new_rootscene);
		window.show();
		
	}
	
	
	
}
