import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class Chess extends Application
{
	@Override //override Application class' own start() method
	public void start(Stage primaryStage)
	{
		//create pane
		FlowPane pane = new FlowPane(Orientation.VERTICAL);
		pane.setPadding(new Insets(11, 12, 13, 14));
		pane.setHgap(5);
		pane.setVgap(5);
		
		//place nodes
		pane.getChildren().addAll(new Label("Text Field:"),
			new TextField());
		TextField txtInput = new TextField();
		txtInput.setPrefColumnCount(1);
		System.out.println("running");
		
		Scene scene = new Scene(pane, 800, 500);
		primaryStage.setTitle("Testing, testing, 1 2 3");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args)
	{
		Application.launch(args);
	}
}