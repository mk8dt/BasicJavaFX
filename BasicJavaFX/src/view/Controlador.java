package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class Controlador {

	@FXML
    private ImageView imageView; 
	
    @FXML
    private Button btnGo,btnBlur;

    @FXML
    void go(MouseEvent event) {

    System.exit(0);
    	
    }
    @FXML
    void blur(MouseEvent event) {
    	imageView.setEffect(new GaussianBlur(5));
    }
}
