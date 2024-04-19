package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Warning {
	private BorderPane warningborder = new BorderPane();
	private Text wartxt;
	private Button yes,no;
	private VBox warvbox = new VBox(20);
	private HBox warhbox = new HBox(10);
	Stage stage9;

	Warning(){
		wartxt= new Text("Are You Sure To Delete The Brand");
		wartxt.setFill(Color.WHITE);
		wartxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 30));
		
		yes = new Button("Yes");
		yes.setStyle("-fx-border-color:black;-fx-border-width:2");
		yes.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
		
		no = new Button("No");
		no.setStyle("-fx-border-color:black;-fx-border-width:2");
		no.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
		Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/ProjectData2/src/warwarwar.jpeg");
		 ImageView mg = new ImageView(m);
		 mg.setFitHeight(200);
		 mg.setFitWidth(450);
		warhbox.getChildren().addAll(yes, no);
		
		warvbox.getChildren().addAll(wartxt,warhbox);
		 warningborder.getChildren().add(mg);
		 warvbox.setAlignment(Pos.CENTER);
		warningborder.setCenter(warvbox);
		
		
	}
	public BorderPane getWarningborder() {
		return warningborder;
	}

	public Text getWartxt() {
		return wartxt;
	}

	public Button getYes() {
		return yes;
	}

	public Button getNo() {
		return no;
	}

	public VBox getWarvbox() {
		return warvbox;
	}

	public HBox getWarhbox() {
		return warhbox;
	}

	public void setWarningborder(BorderPane warningborder) {
		this.warningborder = warningborder;
	}

	public void setWartxt(Text wartxt) {
		this.wartxt = wartxt;
	}

	public void setYes(Button yes) {
		this.yes = yes;
	}

	public void setNo(Button no) {
		this.no = no;
	}

	public void setWarvbox(VBox warvbox) {
		this.warvbox = warvbox;
	}

	public void setWarhbox(HBox warhbox) {
		this.warhbox = warhbox;
	}

}
