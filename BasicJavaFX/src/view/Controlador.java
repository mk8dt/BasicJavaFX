package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Controlador {

	@FXML
    private ImageView imageView; 
	
	private Ellipse ellipse;
	
	@FXML
    private Button btnBlur;

	@FXML
    private Button btnClip;

    @FXML
    private Button btnGO;

    @FXML
    void blur(MouseEvent event) {
    	imageView.setEffect(new GaussianBlur(5));
    }
  
    @FXML
    void clip(MouseEvent event) {

    	ellipse = new Ellipse();
    	
    	ellipse.centerXProperty().setValue(70);
    	ellipse.centerYProperty().setValue(70);
    	ellipse.radiusXProperty().setValue(50);
    	ellipse.radiusYProperty().setValue(50);
    	
    	imageView.setClip(ellipse);
    	
    }
    @FXML
    void go(MouseEvent event) {
    	Stage thisStage = (Stage) btnGO.getScene().getWindow();
    	thisStage.close();
    }
}
