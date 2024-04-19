package application;

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
import javafx.stage.Stage;

public class AddScreen {
	private TextField ins1, ins2, ins3, ins4, ins5;
	private Label inserlabel, namein, agein, datein, genderin, smin,yesnolabel;
	private Button yes, no;
    private BorderPane borderins = new BorderPane();
    private HBox hins = new HBox(10);
	private GridPane ginsert = new GridPane();
	Stage stage12;
	
	AddScreen() {
		ginsert.setHgap(5);
		ginsert.setVgap(10);
		
		yes= new Button("Yes");
		yes.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
	    yes.setMinWidth(200);
	    yes.setStyle("-fx-background:Green");
	    
		no= new Button("No");
		no.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
	    no.setMinWidth(200);
	    no.setStyle("-fx-background:Red");
		
		ins1 = new TextField();
		ins1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 18));
		ins1.setMinWidth(300);
		ins1.setMinHeight(40);

		ins2 = new TextField();
		ins2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		ins2.setMinWidth(300);
		ins2.setMinHeight(40);

		ins3 = new TextField();
		ins3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		ins3.setMinWidth(300);
		ins3.setMinHeight(40);

		ins4 = new TextField();
		ins4.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		ins4.setMinWidth(300);
		ins4.setMinHeight(40);

		
		ins5 = new TextField();
		ins5.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		ins5.setMinWidth(300);
		ins5.setMinHeight(40);
		
		inserlabel= new Label("Please Enter The Information Of The New Car !");
		inserlabel.setTextFill(Color.WHITE);
		inserlabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		inserlabel.setMinWidth(200);
		

		namein = new Label("Brand : ");
		namein.setTextFill(Color.WHITE);
		namein.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		namein.setMinWidth(200);

		agein = new Label("Model : ");
		agein.setTextFill(Color.WHITE);
		agein.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		agein.setMinWidth(200);

		datein = new Label("Year : ");
		datein.setTextFill(Color.WHITE);
		datein.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		datein.setMinWidth(200);

		genderin = new Label("Color : ");
		genderin.setTextFill(Color.WHITE);
		genderin.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		genderin.setMinWidth(200);

		smin = new Label("Price : ");
		smin.setTextFill(Color.WHITE);
		smin.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		smin.setMinWidth(200);
		
		yesnolabel = new Label("Are You Sure To Insert This Martyrs ?");
		yesnolabel.setTextFill(Color.WHITE);
		yesnolabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		yesnolabel.setMinWidth(200);
		
		
		
		
		ginsert.add(namein, 0, 0);
		ginsert.add(ins1, 1, 0);
		ginsert.add(agein, 0, 1);
		ginsert.add(ins2, 1, 1);
		ginsert.add(datein, 0, 2);
		ginsert.add(ins3, 1, 2);
		ginsert.add(genderin, 0, 3);
		ginsert.add(ins4, 1, 3);
		ginsert.add(smin, 0, 4);
		ginsert.add(ins5, 1, 4);
		ginsert.add(yesnolabel, 1, 6);
		 Image img = new Image("file:///C:/Users/Ehab/eclipse-workspace/ProjectData2/src/application/filterbackg.jpg");
	      ImageView view = new ImageView(img);
	      view.setFitHeight(400);
	      view.setFitWidth(600);
		 
		borderins.getChildren().add(view);
		hins.getChildren().addAll(yes,no);
		borderins.setTop(inserlabel);
		inserlabel.setAlignment(Pos.CENTER);
		borderins.setBottom(hins);
		borderins.setCenter(ginsert);
		borderins.setStyle("-fx-border-color:Black; -fx-border-width:10");
	
	}
	public TextField getIns1() {
		return ins1;
	}
	public TextField getIns2() {
		return ins2;
	}
	public TextField getIns3() {
		return ins3;
	}
	public TextField getIns4() {
		return ins4;
	}
	public TextField getIns5() {
		return ins5;
	}
	public Label getInserlabel() {
		return inserlabel;
	}
	public Label getNamein() {
		return namein;
	}
	public Label getAgein() {
		return agein;
	}
	public Label getDatein() {
		return datein;
	}
	public Label getGenderin() {
		return genderin;
	}
	public Label getSmin() {
		return smin;
	}
	public Label getYesnolabel() {
		return yesnolabel;
	}
	public Button getYes() {
		return yes;
	}
	public Button getNo() {
		return no;
	}
	public BorderPane getBorderins() {
		return borderins;
	}
	public HBox getHins() {
		return hins;
	}
	public GridPane getGinsert() {
		return ginsert;
	}
	public void setIns1(TextField ins1) {
		this.ins1 = ins1;
	}
	public void setIns2(TextField ins2) {
		this.ins2 = ins2;
	}
	public void setIns3(TextField ins3) {
		this.ins3 = ins3;
	}
	public void setIns4(TextField ins4) {
		this.ins4 = ins4;
	}
	public void setIns5(TextField ins5) {
		this.ins5 = ins5;
	}
	public void setInserlabel(Label inserlabel) {
		this.inserlabel = inserlabel;
	}
	public void setNamein(Label namein) {
		this.namein = namein;
	}
	public void setAgein(Label agein) {
		this.agein = agein;
	}
	public void setDatein(Label datein) {
		this.datein = datein;
	}
	public void setGenderin(Label genderin) {
		this.genderin = genderin;
	}
	public void setSmin(Label smin) {
		this.smin = smin;
	}
	public void setYesnolabel(Label yesnolabel) {
		this.yesnolabel = yesnolabel;
	}
	public void setYes(Button yes) {
		this.yes = yes;
	}
	public void setNo(Button no) {
		this.no = no;
	}
	public void setBorderins(BorderPane borderins) {
		this.borderins = borderins;
	}
	public void setHins(HBox hins) {
		this.hins = hins;
	}
	public void setGinsert(GridPane ginsert) {
		this.ginsert = ginsert;
	}
	
}
