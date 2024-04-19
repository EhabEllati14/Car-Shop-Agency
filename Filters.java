package application;

import java.awt.Insets;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Filters {
	private BorderPane filterborder = new BorderPane();
	private GridPane filtergrid = new GridPane();
	private VBox filtervbox = new VBox(10);
	private Label brandfil,yearfil,colorfil,modelfil,pricefil;
	private TextField pricef,pricet;
	private ComboBox<String> yearf= new ComboBox<>();
	private ComboBox<String> yeart= new ComboBox<>();
	private ComboBox<String> modelt = new ComboBox<>();
	private ComboBox<String> colort = new ComboBox<>();
	
	private Text  brandt,yeartxt,pricetxt ,oktxt,cleartxt;
	private Button ok,clearbutton;
	Stage stage3;
	
	
	Filters(){
		brandfil= new Label("BRAND : ");
		brandfil.setTextFill(Color.WHITE);
		brandfil.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		brandfil.setMaxWidth(200);
		
		yearfil= new Label("YEAR : ");
		yearfil.setTextFill(Color.WHITE);
		yearfil.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		yearfil.setMaxWidth(200);
		
		colorfil=new Label("COLOR : ");
		colorfil.setTextFill(Color.WHITE);
		colorfil.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		colorfil.setMaxWidth(200);
		
		modelfil=new Label("MODEL : ");
		modelfil.setTextFill(Color.WHITE);
		modelfil.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		modelfil.setMaxWidth(200);
		
		pricefil= new Label("PRICE : ");
		pricefil.setTextFill(Color.WHITE);
		pricefil.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		pricefil.setMaxWidth(200);
		

		pricef=new TextField();
		pricef.setPrefSize(20, 20);
		pricef.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
		
		pricet=new TextField();
		pricet.setPrefSize(20, 20);
		pricet.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
		
		brandt= new Text();
	     brandt.setFill(Color.WHITE);
		brandt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
		
		yeartxt= new Text("TO");
		yeartxt.setFill(Color.WHITE);
		yeartxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
		
		pricetxt= new Text("TO");
		pricetxt.setFill(Color.WHITE);
		pricetxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
		
		oktxt= new Text("Ok Option : if you want to search about car .");
		oktxt.setFill(Color.WHITE);
		oktxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
		
		cleartxt= new Text("Clear Option : if dont want to search about car .");
		cleartxt.setFill(Color.WHITE);
		cleartxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
		
		
		 Image img = new Image("file:///C:/Users/Ehab/eclipse-workspace/ProjectData2/src/application/filterbackg.jpg");
	      ImageView view = new ImageView(img);
	      view.setFitHeight(300);
	      view.setFitWidth(500);
		
		
		
		
		ok = new Button("OK");
		ok.setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 90px; " +
		                "-fx-min-height: 40px; " +
		                "-fx-max-width: 150px; " +
		                "-fx-max-height: 100px; " +"-fx-background-color: white;"+"-fx-border-color:white"
		        );
		ok.setText("OK");
		ok.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		ok.setMinSize(150, 50);
		
		clearbutton = new Button();
		clearbutton.setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 90px; " +
		                "-fx-min-height: 40px; " +
		                "-fx-max-width: 150px; " +
		                "-fx-max-height: 100px; " +"-fx-background-color: white;"+"-fx-border-color:white"
		        );
		clearbutton.setText("Clear");
		clearbutton.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		clearbutton.setMinSize(150, 50);
		
		filtervbox.getChildren().addAll(oktxt,cleartxt);
		
		filtergrid.add(brandfil, 0, 0);
		filtergrid.add(brandt, 1, 0);
		filtergrid.add(yearfil, 0, 1);
		filtergrid.add(yearf, 1, 1);
		filtergrid.add(yeartxt, 2, 1);
		filtergrid.add(yeart, 3, 1);
		filtergrid.add(colorfil, 0, 2);
		filtergrid.add(colort, 1, 2);
		filtergrid.add(modelfil, 0, 3);
		filtergrid.add(modelt, 1, 3);
		filtergrid.add(pricefil, 0, 4);
		filtergrid.add(pricef, 1, 4);
		filtergrid.add(pricetxt, 2, 4);
		filtergrid.add(pricet, 3, 4);
		filtergrid.add(ok, 1, 5);
		filtergrid.add(clearbutton, 2, 5);
		
		filtergrid.setHgap(10);
		filtergrid.setVgap(10);
		filterborder.getChildren().add(view);
		filterborder.setCenter(filtergrid);
		filterborder.setBottom(filtervbox);
	
	}
	
	
	
	
	public BorderPane getFilterborder() {
		return filterborder;
	}




	public VBox getFiltervbox() {
		return filtervbox;
	}




	public ComboBox<String> getYearf() {
		return yearf;
	}




	public ComboBox<String> getYeart() {
		return yeart;
	}




	public ComboBox<String> getModelt() {
		return modelt;
	}




	public ComboBox<String> getColort() {
		return colort;
	}








	public void setFilterborder(BorderPane filterborder) {
		this.filterborder = filterborder;
	}




	public void setFiltervbox(VBox filtervbox) {
		this.filtervbox = filtervbox;
	}




	public void setYearf(ComboBox<String> yearf) {
		this.yearf = yearf;
	}




	public void setYeart(ComboBox<String> yeart) {
		this.yeart = yeart;
	}




	public void setModelt(ComboBox<String> modelt) {
		this.modelt = modelt;
	}




	public void setColort(ComboBox<String> colort) {
		this.colort = colort;
	}




	



	public GridPane getFiltergrid() {
		return filtergrid;
	}
	public Label getBrandfil() {
		return brandfil;
	}
	public Label getYearfil() {
		return yearfil;
	}
	public Label getColorfil() {
		return colorfil;
	}
	public Label getModelfil() {
		return modelfil;
	}
	public Label getPricefil() {
		return pricefil;
	}
	public Text getBrandt() {
		return brandt;
	}
	
	
	public TextField getPricef() {
		return pricef;
	}
	public TextField getPricet() {
		return pricet;
	}
	public Text getYeartxt() {
		return yeartxt;
	}
	public Text getPricetxt() {
		return pricetxt;
	}
	public Text getOktxt() {
		return oktxt;
	}
	public Text getCleartxt() {
		return cleartxt;
	}
	public Button getOk() {
		return ok;
	}
	public Button getClearButton() {
		return clearbutton;
	}
	public void setFiltergrid(GridPane filtergrid) {
		this.filtergrid = filtergrid;
	}
	public void setBrandfil(Label brandfil) {
		this.brandfil = brandfil;
	}
	public void setYearfil(Label yearfil) {
		this.yearfil = yearfil;
	}
	public void setColorfil(Label colorfil) {
		this.colorfil = colorfil;
	}
	public void setModelfil(Label modelfil) {
		this.modelfil = modelfil;
	}
	public void setPricefil(Label pricefil) {
		this.pricefil = pricefil;
	}
	public void setBrandt(Text brandt) {
		this.brandt = brandt;
	}
	
	
	public void setPricef(TextField pricef) {
		this.pricef = pricef;
	}
	public void setPricet(TextField pricet) {
		this.pricet = pricet;
	}
	public void setYeartxt(Text yeartxt) {
		this.yeartxt = yeartxt;
	}
	public void setPricetxt(Text pricetxt) {
		this.pricetxt = pricetxt;
	}
	public void setOktxt(Text oktxt) {
		this.oktxt = oktxt;
	}
	public void setCleartxt(Text cleartxt) {
		this.cleartxt = cleartxt;
	}
	public void setOk(Button ok) {
		this.ok = ok;
	}
	public void setClearButton(Button clear) {
		this.clearbutton = clear;
	}
	
	
	
	

}
