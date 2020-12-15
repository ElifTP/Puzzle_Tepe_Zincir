package puzzle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static java.time.Clock.system;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author zinci
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLDocumentController controller = new FXMLDocumentController();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/puzzle/FXMLDocument.fxml"));
        loader.setController(controller);
        Parent root = loader.load();
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Jeu du Taquin");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        launch(args);
           
           
    }  
    
 
}
