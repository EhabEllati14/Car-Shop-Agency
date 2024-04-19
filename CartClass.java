package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CartClass {
	private BorderPane cartborder= new BorderPane();
	private GridPane cartgrid= new GridPane();
	private Text carttxt1,carttxt2,endtxt;
	private Label custname,custmobile;
	private TextField custnamef,custmobilef;
	private VBox cartvbox= new VBox(5);
	private HBox hbb= new HBox();
	private Button ok,clear;
	Stage stage4;
	
	CartClass(){
		carttxt1= new Text("Customer's Informations");
		carttxt1.setFill(Color.WHITE);
		carttxt1.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
		
		
		carttxt2= new Text("If You want to add to cart please enter the informations !!");
		carttxt2.setFill(Color.WHITE);
		carttxt2.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
		
		endtxt=new Text("Have A Nice Day !!");
		endtxt.setFill(Color.WHITE);
		endtxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
		
		custname=new Label("Customer Name: ");
		custname.setTextFill(Color.WHITE);
		custname.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		custname.setMaxWidth(200);
		
		custmobile=new Label("Customer Mobile: ");
		custmobile.setTextFill(Color.WHITE);
		custmobile.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		custmobile.setMaxWidth(200);
		
		custnamef=new TextField();
		custnamef.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
		
		custmobilef=new TextField();
		custmobilef.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
		
		 ok = new Button("OK");
		 ok.setStyle("-fx-border-color:black;-fx-border-width:2");
			ok.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
			
			clear = new Button("Clear");
			 clear.setStyle("-fx-border-color:black;-fx-border-width:2");
				clear.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
		
		cartgrid.add(custname, 0, 0);
		cartgrid.add(custmobile, 0, 1);
		cartgrid.add(custnamef, 1, 0);
		cartgrid.add(custmobilef, 1, 1);
		cartgrid.add(ok, 0, 2);
		cartgrid.add(clear, 1, 2);
		 Image img = new Image("file:///C:/Users/Ehab/eclipse-workspace/ProjectData2/src/application/filterbackg.jpg");
	      ImageView view = new ImageView(img);
	      view.setFitHeight(400);
	      view.setFitWidth(700);
		
		cartgrid.setHgap(10);
		cartgrid.setVgap(10);
		cartvbox.getChildren().addAll(carttxt1,carttxt2);
		cartvbox.setAlignment(Pos.CENTER);
		cartborder.getChildren().add(view);
		cartborder.setTop(cartvbox);
		cartgrid.setPadding(new Insets(10, 10, 10, 10));
		cartgrid.setAlignment(Pos.CENTER);
		cartborder.setCenter(cartgrid);
		hbb.getChildren().add(endtxt);
		hbb.setAlignment(Pos.CENTER);
		cartborder.setBottom(hbb);
			
		
	}

	public BorderPane getCartborder() {
		return cartborder;
	}

	public GridPane getCartgrid() {
		return cartgrid;
	}

	public Text getCarttxt1() {
		return carttxt1;
	}

	public Text getCarttxt2() {
		return carttxt2;
	}

	public Text getEndtxt() {
		return endtxt;
	}

	public Label getCustname() {
		return custname;
	}

	public Label getCustmobile() {
		return custmobile;
	}

	public TextField getCustnamef() {
		return custnamef;
	}

	public TextField getCustmobilef() {
		return custmobilef;
	}

	public VBox getCartvbox() {
		return cartvbox;
	}

	public Button getOk() {
		return ok;
	}

	public Button getClear() {
		return clear;
	}

	public void setCartborder(BorderPane cartborder) {
		this.cartborder = cartborder;
	}

	public void setCartgrid(GridPane cartgrid) {
		this.cartgrid = cartgrid;
	}

	public void setCarttxt1(Text carttxt1) {
		this.carttxt1 = carttxt1;
	}

	public void setCarttxt2(Text carttxt2) {
		this.carttxt2 = carttxt2;
	}

	public void setEndtxt(Text endtxt) {
		this.endtxt = endtxt;
	}

	public void setCustname(Label custname) {
		this.custname = custname;
	}

	public void setCustmobile(Label custmobile) {
		this.custmobile = custmobile;
	}

	public void setCustnamef(TextField custnamef) {
		this.custnamef = custnamef;
	}

	public void setCustmobilef(TextField custmobilef) {
		this.custmobilef = custmobilef;
	}

	public void setCartvbox(VBox cartvbox) {
		this.cartvbox = cartvbox;
	}

	public void setOk(Button ok) {
		this.ok = ok;
	}

	public void setClear(Button clear) {
		this.clear = clear;
	}
}
