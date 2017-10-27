package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

	private Pane mypane;
	
	/**
	 * modifica el método start de la clase principal
	 */
	
    @Override
    public void start(Stage stage) throws IOException {
    
    	/**
    	 * carga la vista fxml y opcionalmente un controlador para inicializar algún componente
    	 * sobre el panel mypane colocamos la vista   
    	 */
    	
    	FXMLLoader loader = new FXMLLoader(
            getClass().getResource(
                "../view/forest.fxml"
            )
        );
        mypane = (Pane) loader.load();

        /**
         * titula el stage y añade la escena al stage
         */
        stage.setTitle("Where's the squirrel?");
        stage.setScene(new Scene(mypane));
        stage.show();
    }
   
   
    /**
     * arranca la aplicación
     * @param args
     */
    
    public static void main(String[] args) {
        launch(args);
    }
    
}