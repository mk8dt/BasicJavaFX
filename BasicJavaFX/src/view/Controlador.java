package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Ellipse;

public class Controlador {

	@FXML
    private ImageView imageView; 
	private Ellipse ellipse;
	
    @FXML
    private Button go;

    @FXML
    void go(MouseEvent event) {

    System.exit(0);
    	
    }
    @FXML
    void blur(MouseEvent event) {
    	imageView.setEffect(new GaussianBlur(5));
    }
}
