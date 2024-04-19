package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Passwordscreen {
	private BorderPane passwordb = new BorderPane();
	private GridPane g= new GridPane();
	private Label passwordlabel;
	private PasswordField pass;
	private Button ok ,main,tryagain;
	private Label massg;
	private HBox passhbox= new HBox(15);
	Stage stage7;
	
	Passwordscreen(){
		
		passwordlabel=new Label("Password : ");
		passwordlabel.setTextFill(Color.WHITE);
		passwordlabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		passwordlabel.setMaxWidth(200);
		
		massg=new Label("Wrong Password ,,, Try again");
		massg.setTextFill(Color.RED.darker());
		massg.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		massg.setMinWidth(200);
		
		pass = new PasswordField();
		pass.setPrefColumnCount(10);
		
		ok= new Button("Ok");
		ok.setAlignment(Pos.CENTER);
	    ok.setStyle("-fx-border-color:black;-fx-border-width:2");
		ok.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,16));
		
		tryagain= new Button("Try Again");
		tryagain.setAlignment(Pos.CENTER);
		tryagain.setStyle("-fx-border-color:black;-fx-border-width:2");
		tryagain.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,16));
		
		main= new Button("Main Page");
		main.setAlignment(Pos.CENTER);
	    main.setStyle("-fx-border-color:black;-fx-border-width:2");
		main.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,16));
		
		 Image img = new Image("file:///C:/Users/Ehab/eclipse-workspace/ProjectData2/src/application/filterbackg.jpg");
	      ImageView view = new ImageView(img);
	      view.setFitHeight(300);
	      view.setFitWidth(500);
		
		g.setHgap(10);
		g.setVgap(10);
		
		g.add(passwordlabel, 0, 0);
		g.add(pass, 1, 0);
		passhbox.getChildren().addAll(main,ok,tryagain);
		
		g.add(passhbox, 1, 1);
		g.setPadding(new Insets(5, 5, 5, 5));
		
		passwordb.getChildren().add(view);
		passwordb.setCenter(g);
		passwordb.setBottom(massg);
	
	}

	public Button getTryagain() {
		return tryagain;
	}

	public void setTryagain(Button tryagain) {
		this.tryagain = tryagain;
	}

	public Button getMain() {
		return main;
	}

	public void setMain(Button main) {
		this.main = main;
	}

	public BorderPane getPasswordb() {
		return passwordb;
	}

	public GridPane getG() {
		return g;
	}

	public Label getPasswordlabel() {
		return passwordlabel;
	}

	public PasswordField getPass() {
		return pass;
	}

	public Button getOk() {
		return ok;
	}

	public Label getMassg() {
		return massg;
	}

	public void setPasswordb(BorderPane passwordb) {
		this.passwordb = passwordb;
	}

	public void setG(GridPane g) {
		this.g = g;
	}

	public void setPasswordlabel(Label passwordlabel) {
		this.passwordlabel = passwordlabel;
	}

	public void setPass(PasswordField pass) {
		this.pass = pass;
	}

	public void setOk(Button ok) {
		this.ok = ok;
	}

	public void setMassg(Label massg) {
		this.massg = massg;
	}
	
	
	

}
