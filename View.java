package application;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class View {
	private Group viewgroup= new Group();
	private Button client,admin,choosecar,chooseorder;
	private Text cartxt;
	private HBox viewhbox = new HBox(50);
	Stage satge1;
	
	View(){
		cartxt = new Text("Car Agency System");
		cartxt.setFill(Color.WHITE.brighter().brighter());
		cartxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 90));
		cartxt.setLayoutX(140);
		cartxt.setLayoutY(150);
		
		client = new Button();
		client .setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		client .setMinSize(150, 50);
		client.setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 90px; " +
		                "-fx-min-height: 20px; " +
		                "-fx-max-width: 200px; " +
		                "-fx-max-height: 100px; "+"-fx-background-color: white;" +"-fx-border-color: yellow;");
		client.setText("  Client  ");
		client .setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		client .setMinSize(150, 50);
		
		
		admin = new Button();
		admin .setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		admin .setMinSize(150, 50);
		admin.setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 90px; " +
		                "-fx-min-height: 20px; " +
		                "-fx-max-width: 200px; " +
		                "-fx-max-height: 100px; "+"-fx-background-color: white;"+"-fx-border-color: yellow;"
		        );
		admin.setText("  Admin  ");
		admin.setMinSize(150, 50);
		
		choosecar= new Button();
		choosecar .setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		choosecar .setMinSize(150, 50);
		choosecar.setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 90px; " +
		                "-fx-min-height: 20px; " +
		                "-fx-max-width: 200px; " +
		                "-fx-max-height: 100px; " +"-fx-background-color: white;"+"-fx-border-color: yellow;"
		        );
		choosecar.setText("  File Car  ");
		choosecar.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		choosecar.setMinSize(150, 50);
		
		chooseorder= new Button();
		chooseorder .setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		chooseorder .setMinSize(150, 50);
		chooseorder.setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 100px; " +
		                "-fx-min-height: 60px; " +
		                "-fx-max-width: 250px; " +
		                "-fx-max-height: 150px; " +"-fx-background-color: white;"+"-fx-border-color: yellow;"
		        );
		chooseorder.setText("File Order");
		chooseorder.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		chooseorder.setMinSize(150, 50);
		
		
		viewhbox.getChildren().addAll(client,admin,choosecar,chooseorder);
		
		viewhbox.setLayoutX(200);
		viewhbox.setLayoutY(500);
		
		
		
		
		
		Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/ProjectData2/src/agyp.jpg");
		 ImageView mg = new ImageView(m);
		 mg.setFitHeight(600);
		 mg.setFitWidth(1200);
		 
		 viewgroup.getChildren().addAll(mg,cartxt,viewhbox);
	}

	public Group getViewgroup() {
		return viewgroup;
	}

	public Button getClient() {
		return client;
	}

	public Button getAdmin() {
		return admin;
	}

	public Button getChoosecar() {
		return choosecar;
	}

	public Button getChooseorder() {
		return chooseorder;
	}

	public Text getCartxt() {
		return cartxt;
	}

	public Stage getSatge1() {
		return satge1;
	}

	public void setViewgroup(Group viewgroup) {
		this.viewgroup = viewgroup;
	}

	public void setClient(Button client) {
		this.client = client;
	}

	public void setAdmin(Button admin) {
		this.admin = admin;
	}

	public void setChoosecar(Button choosecar) {
		this.choosecar = choosecar;
	}

	public void setChooseorder(Button chooseorder) {
		this.chooseorder = chooseorder;
	}

	public void setCartxt(Text cartxt) {
		this.cartxt = cartxt;
	}

	public void setSatge1(Stage satge1) {
		this.satge1 = satge1;
	}
	
	
	

}
