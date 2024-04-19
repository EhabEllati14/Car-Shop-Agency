package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class TOPPAGE {
	private BorderPane top = new BorderPane();
	private TableView<AdminTable3> toptable= new TableView();
	private Text toptxt;
	private Button done;
	Stage stage6;
	
   TOPPAGE(){
	   TableColumn<AdminTable3,String> Name2column =new TableColumn<AdminTable3, String>("~Name~");
   	Name2column.setCellValueFactory (new PropertyValueFactory<AdminTable3, String>("Name"));
   	
   	TableColumn<AdminTable3,String> Mobile2column =new TableColumn<AdminTable3, String>("~Mobile~");
   	Mobile2column .setCellValueFactory (new PropertyValueFactory<AdminTable3, String>("Mobile"));
   	
   	TableColumn<AdminTable3,String> Brand2column =new TableColumn<AdminTable3, String>("~Brand~");
   	Brand2column.setCellValueFactory (new PropertyValueFactory<AdminTable3, String>("Brand"));
   	
   	TableColumn<AdminTable3,String> Model2column =new TableColumn<AdminTable3, String>("~Model~");
   	Model2column.setCellValueFactory (new PropertyValueFactory<AdminTable3, String>("Model"));
   	
   	TableColumn<AdminTable3,String> Year2column =new TableColumn<AdminTable3, String>("~Year~");
   	Year2column.setCellValueFactory (new PropertyValueFactory<AdminTable3, String>("Year"));
   	
   	TableColumn<AdminTable3,String> Color2column =new TableColumn<AdminTable3, String>("~Color~");
   	Color2column.setCellValueFactory (new PropertyValueFactory<AdminTable3, String>("Color"));
   	
   	TableColumn<AdminTable3,Double> Price2column =new TableColumn<AdminTable3, Double>("~Price~");
   	Price2column.setCellValueFactory (new PropertyValueFactory<AdminTable3, Double>("Price"));
   	
   	TableColumn<AdminTable3,String> Date2column =new TableColumn<AdminTable3, String>("~Date~");
   	Date2column.setCellValueFactory (new PropertyValueFactory<AdminTable3, String>("Date"));
   	
   	TableColumn<AdminTable3,String> Status2column =new TableColumn<AdminTable3, String>("~Status~");
   	Status2column.setCellValueFactory (new PropertyValueFactory<AdminTable3, String>("Status"));
   	
   	toptable.getColumns().addAll(Name2column,Mobile2column,Brand2column,Model2column,Year2column,Color2column,Price2column,Date2column,Status2column);
   	
   	toptxt= new Text("Top 10 Of Solds Cars !!!! ");
   	toptxt.setTextAlignment(TextAlignment.CENTER);
   	toptxt.setFill(Color.BLACK);
   	toptxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
   	
   	done = new Button("Done");
   	done.setAlignment(Pos.CENTER);
   	done.setStyle("-fx-border-color:black;-fx-border-width:2");
	done.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	 Image img = new Image("file:///C:/Users/Ehab/eclipse-workspace/ProjectData2/src/application/filterbackg.jpg");
     ImageView view = new ImageView(img);
     view.setFitHeight(500);
     view.setFitWidth(800);
     top.getChildren().add(view);
	
	top.setTop(toptxt);
	top.setCenter(toptable);
	top.setBottom(done);
	
				
  }

public BorderPane getTop() {
	return top;
}

public TableView<AdminTable3> getToptable() {
	return toptable;
}

public Text getToptxt() {
	return toptxt;
}

public Button getDone() {
	return done;
}

public void setTop(BorderPane top) {
	this.top = top;
}

public void setToptable(TableView<AdminTable3> toptable) {
	this.toptable = toptable;
}

public void setToptxt(Text toptxt) {
	this.toptxt = toptxt;
}

public void setDone(Button done) {
	this.done = done;
}
	
	
	

}
