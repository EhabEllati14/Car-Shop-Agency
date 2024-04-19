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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Brandup {
	private BorderPane brand = new BorderPane();
	private Label brandlabel,updatelabel,addlabel;
	private TextField brandtxt,updatetxt,addtxt;
	private Button updatebutton,addbutton,deletebutton,okup,okadd,mainpage;
	private GridPane brandgrid= new GridPane();
	private Text brandtext;
	private HBox brandhbox=  new HBox(15);
	Stage stage8;
	
	Brandup(){
		brandlabel= new Label("Brand : ");
		brandlabel.setTextFill(Color.WHITE);
		brandlabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		brandlabel.setMaxWidth(200);
		
		updatelabel =new Label("Update To :  ");
		updatelabel.setTextFill(Color.WHITE);
		updatelabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		updatelabel.setMaxWidth(200);
		
		addlabel = new Label("Add Brand :  ");
		addlabel.setTextFill(Color.WHITE);
		addlabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		addlabel.setMaxWidth(200);
		
		brandtxt=  new TextField();
		brandtxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,16));
		
		updatetxt=  new TextField();
		updatetxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,16));
		
		addtxt=  new TextField();
		addtxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,16));
		
		updatebutton = new Button("Update");
		updatebutton.setStyle("-fx-border-color:black;-fx-border-width:2");
		updatebutton.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		mainpage=new Button("Main Page");
		mainpage.setStyle("-fx-border-color:black;-fx-border-width:2");
		mainpage.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		
		addbutton = new Button("Add");
		addbutton.setStyle("-fx-border-color:black;-fx-border-width:2");
		addbutton.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		deletebutton = new Button("Delete");
		deletebutton.setStyle("-fx-border-color:black;-fx-border-width:2");
		deletebutton.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		okup = new Button("Ok Update ");
		okup.setStyle("-fx-border-color:black;-fx-border-width:2");
		okup.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		okadd = new Button("Ok Add");
		okadd.setStyle("-fx-border-color:black;-fx-border-width:2");
		okadd.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		brandtext= new Text(" Brand Updates ");
		brandtext.setTextAlignment(TextAlignment.CENTER);
	     brandtext.setFill(Color.BLACK);
		brandtext.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
		
		brandgrid.setHgap(10);
		brandgrid.setVgap(10);
		
		brandgrid.add(brandlabel, 0, 0);
		brandgrid.add(brandtxt, 1, 0);
		brandgrid.add(updatelabel, 0, 1);
		brandgrid.add(updatetxt, 1, 1);
		brandgrid.add(okup, 2, 1);
		brandgrid.add(addlabel, 0, 2);
		brandgrid.add(addtxt, 1, 2);
		brandgrid.add(okadd, 2, 2);
		brandgrid.setPadding(new Insets(10,10,10,10));
		 Image img = new Image("file:///C:/Users/Ehab/eclipse-workspace/ProjectData2/src/application/filterbackg.jpg");
	      ImageView view = new ImageView(img);
	      view.setFitHeight(300);
	      view.setFitWidth(500);
		
		
		brandhbox.getChildren().addAll(updatebutton,addbutton,deletebutton,mainpage);
		brandhbox.setAlignment(Pos.CENTER);
		
		brand.getChildren().add(view);
		brand.setTop(brandtext);
		brand.setCenter(brandgrid);
		brand.setBottom(brandhbox);
		
		
	}

	public Button getMainpage1() {
		return mainpage;
	}

	public void setMainpage1(Button mainpage) {
		this.mainpage = mainpage;
	}

	public BorderPane getBrand() {
		return brand;
	}

	public Label getBrandlabel() {
		return brandlabel;
	}

	public Label getUpdatelabel() {
		return updatelabel;
	}

	public Label getAddlabel() {
		return addlabel;
	}

	public TextField getBrandtxt() {
		return brandtxt;
	}

	public TextField getUpdatetxt() {
		return updatetxt;
	}

	public TextField getAddtxt() {
		return addtxt;
	}

	public Button getUpdatebutton() {
		return updatebutton;
	}

	public Button getAddbutton() {
		return addbutton;
	}

	public Button getDeletebutton() {
		return deletebutton;
	}

	public Button getOkup() {
		return okup;
	}

	public Button getOkadd() {
		return okadd;
	}

	public GridPane getBrandgrid() {
		return brandgrid;
	}

	public Text getBrandtext() {
		return brandtext;
	}

	public HBox getBrandhbox() {
		return brandhbox;
	}

	public void setBrand(BorderPane brand) {
		this.brand = brand;
	}

	public void setBrandlabel(Label brandlabel) {
		this.brandlabel = brandlabel;
	}

	public void setUpdatelabel(Label updatelabel) {
		this.updatelabel = updatelabel;
	}

	public void setAddlabel(Label addlabel) {
		this.addlabel = addlabel;
	}

	public void setBrandtxt(TextField brandtxt) {
		this.brandtxt = brandtxt;
	}

	public void setUpdatetxt(TextField updatetxt) {
		this.updatetxt = updatetxt;
	}

	public void setAddtxt(TextField addtxt) {
		this.addtxt = addtxt;
	}

	public void setUpdatebutton(Button updatebutton) {
		this.updatebutton = updatebutton;
	}

	public void setAddbutton(Button addbutton) {
		this.addbutton = addbutton;
	}

	public void setDeletebutton(Button deletebutton) {
		this.deletebutton = deletebutton;
	}

	public void setOkup(Button okup) {
		this.okup = okup;
	}

	public void setOkadd(Button okadd) {
		this.okadd = okadd;
	}

	public void setBrandgrid(GridPane brandgrid) {
		this.brandgrid = brandgrid;
	}

	public void setBrandtext(Text brandtext) {
		this.brandtext = brandtext;
	}

	public void setBrandhbox(HBox brandhbox) {
		this.brandhbox = brandhbox;
	}
	
	

}
