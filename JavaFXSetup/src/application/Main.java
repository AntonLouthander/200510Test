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
	      Parent root = FXMLLoader.load(getClass().getResource("/application/ProgramStart.fxml")); //hämtar fxmlfilen vi vill ladda för att starta interrfacet
	      Scene scene = new Scene(root); // kan ta in två till argument, ett x och ett y-värde för att bestämma storleken. Här gör vi inte det eftersom vi vill ha storleken av Login.fxml
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
