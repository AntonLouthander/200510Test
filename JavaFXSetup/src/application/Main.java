package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	  @Override
	  public void start(Stage primaryStage) {
	    try {
	      Parent root = FXMLLoader.load(getClass().getResource("/application/ProgramStart.fxml")); //h�mtar fxmlfilen vi vill ladda f�r att starta interrfacet
	      Scene scene = new Scene(root); // kan ta in tv� till argument, ett x och ett y-v�rde f�r att best�mma storleken. H�r g�r vi inte det eftersom vi vill ha storleken av Login.fxml
	      scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	      primaryStage.setScene(scene);
	      primaryStage.show();
	    } catch(Exception e) {
	      e.printStackTrace();
	    }
	  }
	  
	  public static void main(String[] args) {
	    launch(args);
	  }
	}
