package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
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
import javafx.stage.Stage;

public class CarUpdate {
public BorderPane carborder = new BorderPane();
private Label modellabel,brandlabel,yearlabel,colorlabel,pricelabel;
private Text brandtxt,updatetxt;
private TextField modeltxt,yeartxt,colortxt,pricetxt;
private Button update,add,delete,updatebutton,mainpage;
private RadioButton model,year,color,price;
private HBox htop = new HBox(15);
private HBox hbottom = new HBox(15);
private GridPane cargrid = new GridPane();
Stage stage10;

CarUpdate(){
	
	modellabel= new Label("MODEL : ");
	modellabel.setStyle("-fx-border-color:white;-fx-border-width:2");
	modellabel.setTextFill(Color.WHITE);
	modellabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
	modellabel.setMinWidth(200);
	
	brandlabel= new Label("BRAND : ");
	brandlabel.setStyle("-fx-border-color:white;-fx-border-width:2");
	brandlabel.setTextFill(Color.WHITE);
	brandlabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
	brandlabel.setMinWidth(200);
	
	yearlabel= new Label("YEAR : ");
	yearlabel.setStyle("-fx-border-color:white;-fx-border-width:2");
	yearlabel.setTextFill(Color.WHITE);
	yearlabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
	yearlabel.setMinWidth(200);
	
	colorlabel= new Label("COLOR : ");
	colorlabel.setStyle("-fx-border-color:white;-fx-border-width:2");
	colorlabel.setTextFill(Color.WHITE);
	colorlabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
	colorlabel.setMinWidth(200);
	
	pricelabel= new Label("PRICE : ");
	pricelabel.setStyle("-fx-border-color:white;-fx-border-width:2");
	pricelabel.setTextFill(Color.WHITE);
	pricelabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
	pricelabel.setMinWidth(200);
	
	brandtxt= new Text();
	brandtxt.setFill(Color.WHITE);
	brandtxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
	
	modeltxt=new TextField();
	modeltxt.setMaxSize(140, 140);
	modeltxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
	
	yeartxt=new TextField();
	yeartxt.setMaxSize(140, 140);
	yeartxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
	
	colortxt=new TextField();
	colortxt.setMaxSize(140, 140);
	colortxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
	
	pricetxt=new TextField();
	pricetxt.setMaxSize(140, 140);
	pricetxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
	
	update= new Button("UPDATE");
	update.setStyle("-fx-border-color:white;-fx-border-width:2");
	update.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	
	add= new Button("ADD");
	add.setStyle("-fx-border-color:white;-fx-border-width:2");
	add.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	
	delete= new Button("DELETE");
	delete.setStyle("-fx-border-color:white;-fx-border-width:2");
	delete.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	
	mainpage= new Button("MAIN PAGE");
	mainpage.setStyle("-fx-border-color:white;-fx-border-width:2");
	mainpage.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	
	updatebutton= new Button("UPDATE");
	updatebutton.setStyle("-fx-border-color:white;-fx-border-width:2");
	updatebutton.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	
	updatetxt= new Text("Choose One Of The Options To Visbile Write !");
	updatetxt.setFill(Color.WHITE);
	updatetxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
	
	model = new RadioButton("Model");
	model.setTextFill(Color.WHITE);
	model.setMaxSize(100, 100);
	model.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
	
	year = new RadioButton("Year");
	year.setTextFill(Color.WHITE);
	year.setMaxSize(100, 100);
	year.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
	
	color = new RadioButton("Color");
	color.setTextFill(Color.WHITE);
	color.setMaxSize(100, 100);
	color.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
	
	price = new RadioButton("Price");
	price.setTextFill(Color.WHITE);
	price.setMaxSize(100, 100);
	price.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
	
	cargrid.add(modellabel, 0, 0);
	cargrid.add(modeltxt, 1, 0);
	cargrid.add(updatetxt, 2, 0);
	cargrid.add(yearlabel, 0, 1);
	cargrid.add(yeartxt, 1, 1);
	cargrid.add(model, 2, 1);
	cargrid.add(colorlabel, 0, 2);
	cargrid.add(colortxt, 1, 2);
	cargrid.add(year, 2, 2);
	cargrid.add(pricelabel, 0, 3);
	cargrid.add(pricetxt, 1, 3);
	cargrid.add(color, 2, 3);
	cargrid.add(price, 2, 4);
	cargrid.add(updatebutton, 2, 5);
	 Image img = new Image("file:///C:/Users/Ehab/eclipse-workspace/ProjectData2/src/application/filterbackg.jpg");
     ImageView view = new ImageView(img);
     view.setFitHeight(400);
     view.setFitWidth(800);
	
	cargrid.setPadding(new Insets(15, 15, 15, 15));
	cargrid.setHgap(15);
	cargrid.setVgap(15);
	
	htop.getChildren().addAll(brandlabel,brandtxt);
	hbottom.getChildren().addAll(update,add,delete,mainpage);
	
	htop.setAlignment(Pos.CENTER);
	hbottom.setAlignment(Pos.CENTER);
	carborder.getChildren().add(view);
	carborder.setTop(htop);
	carborder.setCenter(cargrid);
	carborder.setBottom(hbottom);

}
public BorderPane getCarborder() {
	return carborder;
}
public Label getModellabel() {
	return modellabel;
}
public Label getBrandlabel() {
	return brandlabel;
}
public Label getYearlabel() {
	return yearlabel;
}
public Label getColorlabel() {
	return colorlabel;
}
public Label getPricelabel() {
	return pricelabel;
}
public Text getBrandtxt() {
	return brandtxt;
}
public Text getUpdatetxt() {
	return updatetxt;
}
public TextField getModeltxt() {
	return modeltxt;
}
public TextField getYeartxt() {
	return yeartxt;
}
public TextField getColortxt() {
	return colortxt;
}
public TextField getPricetxt() {
	return pricetxt;
}
public Button getUpdate() {
	return update;
}
public Button getAdd() {
	return add;
}
public Button getDelete() {
	return delete;
}
public Button getUpdatebutton() {
	return updatebutton;
}

public Button getMainpage() {
	return mainpage;
}
public RadioButton getModel() {
	return model;
}
public RadioButton getYear() {
	return year;
}
public RadioButton getColor() {
	return color;
}
public RadioButton getPrice() {
	return price;
}
public HBox getHtop() {
	return htop;
}
public HBox getHbottom() {
	return hbottom;
}
public GridPane getCargrid() {
	return cargrid;
}
public void setCarborder(BorderPane carborder) {
	this.carborder = carborder;
}
public void setModellabel(Label modellabel) {
	this.modellabel = modellabel;
}
public void setBrandlabel(Label brandlabel) {
	this.brandlabel = brandlabel;
}
public void setYearlabel(Label yearlabel) {
	this.yearlabel = yearlabel;
}
public void setColorlabel(Label colorlabel) {
	this.colorlabel = colorlabel;
}
public void setPricelabel(Label pricelabel) {
	this.pricelabel = pricelabel;
}
public void setBrandtxt(Text brandtxt) {
	this.brandtxt = brandtxt;
}
public void setUpdatetxt(Text updatetxt) {
	this.updatetxt = updatetxt;
}
public void setModeltxt(TextField modeltxt) {
	this.modeltxt = modeltxt;
}
public void setYeartxt(TextField yeartxt) {
	this.yeartxt = yeartxt;
}
public void setColortxt(TextField colortxt) {
	this.colortxt = colortxt;
}
public void setPricetxt(TextField pricetxt) {
	this.pricetxt = pricetxt;
}
public void setUpdate(Button update) {
	this.update = update;
}
public void setAdd(Button add) {
	this.add = add;
}
public void setDelete(Button delete) {
	this.delete = delete;
}
public void setUpdatebutton(Button updatebutton) {
	this.updatebutton = updatebutton;
}

public void setMainpage(Button mainpage) {
	this.mainpage = mainpage;
}
public void setModel(RadioButton model) {
	this.model = model;
}
public void setYear(RadioButton year) {
	this.year = year;
}
public void setColor(RadioButton color) {
	this.color = color;
}
public void setPrice(RadioButton price) {
	this.price = price;
}
public void setHtop(HBox htop) {
	this.htop = htop;
}
public void setHbottom(HBox hbottom) {
	this.hbottom = hbottom;
}
public void setCargrid(GridPane cargrid) {
	this.cargrid = cargrid;
}


}
