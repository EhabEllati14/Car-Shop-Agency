package application;

import javax.swing.table.TableModel;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Adminscreen {
	
	public BorderPane getSummaryborder() {
		return summaryborder;
	}
	public Button getSavecars() {
		return savecars;
	}
	public Button getSaveorders() {
		return saveorders;
	}
	public Tab getSummary() {
		return summary;
	}
	public TableView<SummaryTable> getSummarytable() {
		return summarytable;
	}
	public void setSummaryborder(BorderPane summaryborder) {
		this.summaryborder = summaryborder;
	}
	public void setSavecars(Button savecars) {
		this.savecars = savecars;
	}
	public void setSaveorders(Button saveorders) {
		this.saveorders = saveorders;
	}
	public void setSummary(Tab summary) {
		this.summary = summary;
	}
	public void setSummarytable(TableView<SummaryTable> summarytable) {
		this.summarytable = summarytable;
	}

	private BorderPane adminborder = new BorderPane();
	private BorderPane stackborder = new BorderPane();
	private BorderPane queueborder = new BorderPane();
	private BorderPane userupdate = new BorderPane();
	private BorderPane summaryborder= new BorderPane();
	private ComboBox<String> comboup = new ComboBox();
	private TableView<AdminTable> stacktable = new TableView();
	private TableView<AdminTable2> queuetable = new TableView();
    private Button top10,remove,cancel,soldbutton,mainpage,savecar,saveorder,later,savecars,saveorders;
    private Button updatebrand,updatecar,next,previous;
    private Text soldtxt,inprocesstxt,updatetxt;
    private Tab sold,inprocess,update,summary;
    private TabPane admintab = new TabPane();
    private HBox queuehbox= new HBox(10);
    private HBox soldhbox= new HBox(10);
    private HBox updatehbox= new HBox(10);
    private HBox updatehbox2= new HBox(10);
    private HBox menu= new HBox(10);
    private TableView<CarTable> updateTable = new TableView();
    private TableView<SummaryTable> summarytable= new TableView();
    Stage stage5;
    
    

	Adminscreen(){
		TableColumn<SummaryTable,String> Brand1column =new TableColumn<SummaryTable, String>("~ Brand ~");
		Brand1column.setCellValueFactory (new PropertyValueFactory<SummaryTable, String>("brand"));
    	
    	TableColumn<SummaryTable,String> highmodelcolumn =new TableColumn<SummaryTable, String>("~ Highest Model ~");
    	highmodelcolumn.setCellValueFactory (new PropertyValueFactory<SummaryTable, String>("highmodel"));
    	
    	TableColumn<SummaryTable,String> lowestmodelcoulmn =new TableColumn<SummaryTable, String>("~ Lowest Model ~");
    	lowestmodelcoulmn.setCellValueFactory (new PropertyValueFactory<SummaryTable, String>("lowestmodel"));
    	
    	TableColumn<SummaryTable,Double> highpricecolumn =new TableColumn<SummaryTable, Double>("~ Highest Price ~");
    	highpricecolumn.setCellValueFactory (new PropertyValueFactory<SummaryTable, Double>("highprice"));
    	
    	TableColumn<SummaryTable,Double> lowestpricecolumn =new TableColumn<SummaryTable, Double>("~ Lowest Price ~");
    	 lowestpricecolumn.setCellValueFactory (new PropertyValueFactory<SummaryTable, Double>("lowestprice"));
    	
    	TableColumn<SummaryTable,Double> RangePAriceColumn =new TableColumn<SummaryTable, Double>("~ Range Of Price ~");
    	RangePAriceColumn.setCellValueFactory (new PropertyValueFactory<SummaryTable, Double>("rangeprice"));
    	
    	TableColumn<SummaryTable,Double> countcarscolumn=new TableColumn<SummaryTable, Double>("~ Count Of Cars ~");
    	countcarscolumn.setCellValueFactory (new PropertyValueFactory<SummaryTable, Double>("countcar"));
    	
    	Brand1column.setMinWidth(150);
    	highmodelcolumn.setMinWidth(150);
    	lowestmodelcoulmn.setMinWidth(150);
    	highpricecolumn.setMinWidth(150);
    	lowestpricecolumn.setMinWidth(150);
    	RangePAriceColumn.setMinWidth(150);
    	countcarscolumn.setMinWidth(150);
    	
		
    	summarytable.setMaxHeight(600);
    	summarytable.setMinWidth(600);
		
    	summarytable.getColumns().addAll(Brand1column,highmodelcolumn,lowestmodelcoulmn,highpricecolumn,lowestpricecolumn,RangePAriceColumn,countcarscolumn);
		
		
		
		
		
		
		////////////////////////////////////////////////////////////////////////////
		TableColumn<CarTable, String> model2column = new TableColumn<CarTable, String>("~Model~");
		model2column.setCellValueFactory(new PropertyValueFactory<CarTable, String>("Model"));
		
		TableColumn<CarTable, String> year2column = new TableColumn<CarTable, String>("~Year~");
		year2column.setCellValueFactory(new PropertyValueFactory<CarTable, String>("Year"));
		
		TableColumn<CarTable, String> color2column = new TableColumn<CarTable, String>("~Color~");
		color2column.setCellValueFactory(new PropertyValueFactory<CarTable, String>("Color"));
		
		TableColumn<CarTable, Double> price2column = new TableColumn<CarTable, Double>(
				"~Price in K~");
		price2column.setCellValueFactory(new PropertyValueFactory<CarTable, Double>("Price"));
		
		updateTable.getColumns().addAll(model2column,year2column,color2column,price2column);
		
		model2column.setMaxWidth(150);
		year2column.setMaxWidth(150);
		color2column.setMaxWidth(150);
		price2column.setMinWidth(150);
    	
		updateTable.setMaxHeight(600);
		updateTable.setMaxWidth(600);
		
		
    	TableColumn<AdminTable,String> Namecolumn =new TableColumn<AdminTable, String>("~Name~");
    	Namecolumn.setCellValueFactory (new PropertyValueFactory<AdminTable, String>("Name"));
    	
    	TableColumn<AdminTable,String> Mobilecolumn =new TableColumn<AdminTable, String>("~Mobile~");
    	Mobilecolumn .setCellValueFactory (new PropertyValueFactory<AdminTable, String>("Mobile"));
    	
    	TableColumn<AdminTable,String> Brandcolumn =new TableColumn<AdminTable, String>("~Brand~");
    	Brandcolumn.setCellValueFactory (new PropertyValueFactory<AdminTable, String>("Brand"));
    	
    	TableColumn<AdminTable,String> Modelcolumn =new TableColumn<AdminTable, String>("~Model~");
    	Modelcolumn.setCellValueFactory (new PropertyValueFactory<AdminTable, String>("Model"));
    	
    	TableColumn<AdminTable,String> Yearcolumn =new TableColumn<AdminTable, String>("~Year~");
    	Yearcolumn.setCellValueFactory (new PropertyValueFactory<AdminTable, String>("Year"));
    	
    	TableColumn<AdminTable,String> Colorcolumn =new TableColumn<AdminTable, String>("~Color~");
    	Colorcolumn.setCellValueFactory (new PropertyValueFactory<AdminTable, String>("Color"));
    	
    	TableColumn<AdminTable,Double> Pricecolumn =new TableColumn<AdminTable, Double>("~Price~ in K");
    	Pricecolumn.setCellValueFactory (new PropertyValueFactory<AdminTable, Double>("Price"));
    	
    	TableColumn<AdminTable,String> Datecolumn =new TableColumn<AdminTable, String>("~Date~");
    	Datecolumn.setCellValueFactory (new PropertyValueFactory<AdminTable, String>("Date"));
    	
    	TableColumn<AdminTable,String> Statuscolumn =new TableColumn<AdminTable, String>("~Status~");
    	Statuscolumn.setCellValueFactory (new PropertyValueFactory<AdminTable, String>("Status"));
    	
    	
    	Namecolumn.setMinWidth(150);
    	Mobilecolumn.setMinWidth(100);
    	Brandcolumn.setMinWidth(100);
    	Modelcolumn.setMinWidth(100);
    	Yearcolumn.setMinWidth(100);
    	Colorcolumn.setMinWidth(100);
    	Pricecolumn.setMinWidth(100);
    	Datecolumn.setMinWidth(100);
    	Statuscolumn.setMinWidth(100);
    	
		stacktable.setMaxHeight(600);
		stacktable.setMinWidth(800);
    	
    	
    	

    	TableColumn<AdminTable2,String> Name2column =new TableColumn<AdminTable2, String>("~Name~");
    	Name2column.setCellValueFactory (new PropertyValueFactory<AdminTable2, String>("Name"));
    	
    	TableColumn<AdminTable2,String> Mobile2column =new TableColumn<AdminTable2, String>("~Mobile~");
    	Mobile2column .setCellValueFactory (new PropertyValueFactory<AdminTable2, String>("Mobile"));
    	
    	TableColumn<AdminTable2,String> Brand2column =new TableColumn<AdminTable2, String>("~Brand~");
    	Brand2column.setCellValueFactory (new PropertyValueFactory<AdminTable2, String>("Brand"));
    	
    	TableColumn<AdminTable2,String> Model2column =new TableColumn<AdminTable2, String>("~Model~");
    	Model2column.setCellValueFactory (new PropertyValueFactory<AdminTable2, String>("Model"));
    	
    	TableColumn<AdminTable2,String> Year2column =new TableColumn<AdminTable2, String>("~Year~");
    	Year2column.setCellValueFactory (new PropertyValueFactory<AdminTable2, String>("Year"));
    	
    	TableColumn<AdminTable2,String> Color2column =new TableColumn<AdminTable2, String>("~Color~");
    	Color2column.setCellValueFactory (new PropertyValueFactory<AdminTable2, String>("Color"));
    	
    	TableColumn<AdminTable2,Double> Price2column =new TableColumn<AdminTable2, Double>("~Price~ in K");
    	Price2column.setCellValueFactory (new PropertyValueFactory<AdminTable2, Double>("Price"));
    	
    	TableColumn<AdminTable2,String> Date2column =new TableColumn<AdminTable2, String>("~Date~");
    	Date2column.setCellValueFactory (new PropertyValueFactory<AdminTable2, String>("Date"));
    	
    	TableColumn<AdminTable2,String> Status2column =new TableColumn<AdminTable2, String>("~Status~");
    	Status2column.setCellValueFactory (new PropertyValueFactory<AdminTable2, String>("Status"));
    	
    	
    	Name2column.setMinWidth(100);
    	Mobile2column.setMinWidth(100);
    	Brand2column.setMinWidth(100);
    	Model2column.setMinWidth(100);
    	Year2column.setMinWidth(100);
    	Color2column.setMinWidth(100);
    	Price2column.setMinWidth(100);
    	Date2column.setMinWidth(100);
    	Status2column.setMinWidth(100);
    	
    	queuetable.setMaxHeight(600);
    	queuetable.setMinWidth(800);
    	
    	
    	
    	
    	
    	stacktable.getColumns().addAll(Namecolumn,Mobilecolumn,Brandcolumn,Modelcolumn,Yearcolumn,Colorcolumn,Pricecolumn,Datecolumn,Statuscolumn);
    	queuetable.getColumns().addAll(Name2column,Mobile2column,Brand2column,Model2column,Year2column,Color2column,Price2column,Date2column,Status2column);
    	
    	sold= new Tab("Sold Orders");
    	sold.setStyle("-fx-border-color:black;-fx-border-width:2");
    	
    	inprocess= new Tab("InProcess Orders");
    	inprocess.setStyle("-fx-border-color:black;-fx-border-width:2");
    	
    	update= new Tab("Update Item");
    	update.setStyle("-fx-border-color:black;-fx-border-width:2");
    	
    	summary= new Tab("Summary Item");
    	summary.setStyle("-fx-border-color:black;-fx-border-width:2");
    	
    	later = new Button("Later");
    	later.setStyle("-fx-border-color:black;-fx-border-width:2;-fx-background-color:white");
		later.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
    	
    	
    	top10= new Button("Top 10");
    	top10.setStyle("-fx-border-color:black;-fx-border-width:2;-fx-background-color:white");
		top10.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		cancel= new Button("Cancel");
    	cancel.setStyle("-fx-border-color:black;-fx-border-width:2;-fx-background-color:white");
		cancel.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));

		
		savecars = new Button("Save Cars");
		savecars.setStyle("-fx-border-color:black;-fx-border-width:2;-fx-background-color:white");
		savecars.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		saveorders= new Button("Save Orders");
		saveorders.setStyle("-fx-border-color:black;-fx-border-width:2;-fx-background-color:white");
		saveorders.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		
		
		
		remove=new Button("Remove");
		remove.setStyle("-fx-border-color:black;-fx-border-width:2;-fx-background-color:white");
		remove.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		soldbutton= new Button("Sold");
    	soldbutton.setStyle("-fx-border-color:black;-fx-border-width:2;-fx-background-color:white");
		soldbutton.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		mainpage= new Button("Main Page");
    	mainpage.setStyle("-fx-border-color:black;-fx-border-width:2;-fx-background-color:white");
		mainpage.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		soldtxt= new Text("Sold Cars :-");
	    soldtxt.setFill(Color.BLACK);
		soldtxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
		
		inprocesstxt= new Text("InProcess Cars :-");
	    inprocesstxt.setFill(Color.BLACK);
		inprocesstxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
		
		updatetxt= new Text("Admin Updates Screen :-");
	    updatetxt.setFill(Color.BLACK);
		updatetxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
		
		
		
		next = new Button("Next");
		next.setAlignment(Pos.CENTER);
	   	next.setStyle("-fx-border-color:black;-fx-border-width:2;-fx-background-color:white");
		next.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		previous=new Button("Prvious");
		previous.setAlignment(Pos.CENTER);
		previous.setStyle("-fx-border-color:black;-fx-border-width:2;-fx-background-color:white");
		previous.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		updatebrand=new Button("Update Brand");
		updatebrand.setAlignment(Pos.CENTER);
		updatebrand.setStyle("-fx-border-color:black;-fx-border-width:2;-fx-background-color:white");
		updatebrand.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		updatecar=new Button("Update Car");
		updatecar.setAlignment(Pos.CENTER);
		updatecar.setStyle("-fx-border-color:black;-fx-border-width:2;-fx-background-color:white");
		updatecar.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		
		Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/ProjectData2/src/agyp.jpg");
		 ImageView mg = new ImageView(m);
		 mg.setFitHeight(600);
		 mg.setFitWidth(1200);
		 

			Image m1 = new Image("file:///C:/Users/Ehab/eclipse-workspace/ProjectData2/src/agyp.jpg");
			 ImageView mg1 = new ImageView(m1);
			 mg1.setFitHeight(600);
			 mg1.setFitWidth(1200);
			 
			 Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/ProjectData2/src/agyp.jpg");
			 ImageView mg2 = new ImageView(m2);
			 mg2.setFitHeight(600);
			 mg2.setFitWidth(1200);
			 
			 Image m3 = new Image("file:///C:/Users/Ehab/eclipse-workspace/ProjectData2/src/agyp.jpg");
			 ImageView mg3 = new ImageView(m3);
			 mg3.setFitHeight(600);
			 mg3.setFitWidth(1200);
			 
			 Image m4 = new Image("file:///C:/Users/Ehab/eclipse-workspace/ProjectData2/src/agyp.jpg");
			 ImageView mg4 = new ImageView(m4);
			 mg4.setFitHeight(600);
			 mg4.setFitWidth(1200);
		 
			 
		admintab.getTabs().addAll(sold,inprocess,update,summary);
		adminborder.getChildren().add(mg4);
		adminborder.setTop(admintab);
		mainpage.setAlignment(Pos.CENTER);
		
		menu.getChildren().addAll(mainpage,savecars,saveorders);
		menu.setAlignment(Pos.CENTER);
		adminborder.setBottom(menu);
		soldhbox.getChildren().addAll(top10,remove);
		
		stackborder.getChildren().add(mg);
		stackborder.setTop(soldtxt);
		stackborder.setCenter(stacktable);
		soldhbox.setAlignment(Pos.CENTER);
		stackborder.setBottom(soldhbox);
		
		summaryborder.getChildren().add(mg1);
		summaryborder.setCenter(summarytable);
		
		queueborder.getChildren().add(mg2);
		queuehbox.getChildren().addAll(cancel,soldbutton,later);
		queuehbox.setAlignment(Pos.CENTER);
		
		queueborder.setTop(inprocesstxt);
		queueborder.setCenter(queuetable);
		queueborder.setBottom(queuehbox);
		
		updatehbox.getChildren().addAll(updatetxt,comboup);
		
		updatehbox.setAlignment(Pos.CENTER);
		
		userupdate.getChildren().add(mg3);
		userupdate.setTop(updatehbox);
		userupdate.setCenter(updateTable);
		
		updatehbox2.getChildren().addAll(previous,next,updatebrand,updatecar);
		updatehbox2.setAlignment(Pos.CENTER);
		userupdate.setBottom(updatehbox2);
		sold.setContent(stackborder);
		
		inprocess.setContent(queueborder);
		
		update.setContent(userupdate);
		summary.setContent(summaryborder);
    }
	public Button getLater() {
		return later;
	}
	public void setLater(Button later) {
		this.later = later;
	}
	public Button getSavecar() {
		return savecars;
	}
	public Button getSaveorder() {
		return saveorders;
	}
	public HBox getMenu() {
		return menu;
	}
	public void setSavecar(Button savecars) {
		this.savecars = savecars;
	}
	public void setSaveorder(Button saveorders) {
		this.saveorders = saveorders;
	}
	public void setMenu(HBox menu) {
		this.menu = menu;
	}
	public ComboBox<String> getComboup() {
		return comboup;
	}
	public Button getUpdatebrand() {
		return updatebrand;
	}
	public Button getUpdatecar() {
		return updatecar;
	}
	public Button getNext() {
		return next;
	}
	public Button getPrevious() {
		return previous;
	}
	public HBox getSoldhbox() {
		return soldhbox;
	}
	public HBox getUpdatehbox() {
		return updatehbox;
	}
	public HBox getUpdatehbox2() {
		return updatehbox2;
	}
	public TableView<CarTable> getUpdateTable() {
		return updateTable;
	}
	public void setComboup(ComboBox<String> comboup) {
		this.comboup = comboup;
	}
	public void setRemove(Button remove) {
		this.remove = remove;
	}
	public void setUpdatebrand(Button updatebrand) {
		this.updatebrand = updatebrand;
	}
	public void setUpdatecar(Button updatecar) {
		this.updatecar = updatecar;
	}
	public void setNext(Button next) {
		this.next = next;
	}
	public void setPrevious(Button previous) {
		this.previous = previous;
	}
	public void setSoldhbox(HBox soldhbox) {
		this.soldhbox = soldhbox;
	}
	public void setUpdatehbox(HBox updatehbox) {
		this.updatehbox = updatehbox;
	}
	public void setUpdatehbox2(HBox updatehbox2) {
		this.updatehbox2 = updatehbox2;
	}
	public void setUpdateTable(TableView<CarTable> updateTable) {
		this.updateTable = updateTable;
	}
	public BorderPane getAdminborder() {
		return adminborder;
	}

	public BorderPane getStackborder() {
		return stackborder;
	}

	public BorderPane getQueueborder() {
		return queueborder;
	}

	public BorderPane getUserupdate() {
		return userupdate;
	}

	public TableView<AdminTable> getStacktable() {
		return stacktable;
	}

	public TableView<AdminTable2> getQueuetable() {
		return queuetable;
	}

	public Button getTop10() {
		return top10;
	}

	public Button getCancel() {
		return cancel;
	}
	public Button getRemove() {
		return remove;
	}
	


//	public Button getLater() {
//		return later;
//	}
//	public Button getOkButton() {
//		return okbutton;
//	}
	
	
	
	public Button getSoldbutton() {
		return soldbutton;
	}

	public Button getMainpage() {
		return mainpage;
	}

	public Text getSoldtxt() {
		return soldtxt;
	}

	public Text getInprocesstxt() {
		return inprocesstxt;
	}

	public Text getUpdatetxt() {
		return updatetxt;
	}

	public Tab getSold() {
		return sold;
	}

	public Tab getInprocess() {
		return inprocess;
	}

	public Tab getUpdate() {
		return update;
	}

	public TabPane getAdmintab() {
		return admintab;
	}

	public HBox getQueuehbox() {
		return queuehbox;
	}

	public void setAdminborder(BorderPane adminborder) {
		this.adminborder = adminborder;
	}

	public void setStackborder(BorderPane stackborder) {
		this.stackborder = stackborder;
	}

	public void setQueueborder(BorderPane queueborder) {
		this.queueborder = queueborder;
	}

	public void setUserupdate(BorderPane userupdate) {
		this.userupdate = userupdate;
	}

	public void setStacktable(TableView<AdminTable> stacktable) {
		this.stacktable = stacktable;
	}

	public void setQueuetable(TableView<AdminTable2> queuetable) {
		this.queuetable = queuetable;
	}

	public void setTop10(Button top10) {
		this.top10 = top10;
	}
	
	public void setremove(Button remove) {
		this.remove = remove;
	}
	public void setCancel(Button cancel) {
		this.cancel = cancel;
	}

	public void setSoldbutton(Button soldbutton) {
		this.soldbutton = soldbutton;
	}

	public void setMainpage(Button mainpage) {
		this.mainpage = mainpage;
	}

	public void setSoldtxt(Text soldtxt) {
		this.soldtxt = soldtxt;
	}

	public void setInprocesstxt(Text inprocesstxt) {
		this.inprocesstxt = inprocesstxt;
	}

	public void setUpdatetxt(Text updatetxt) {
		this.updatetxt = updatetxt;
	}

	public void setSold(Tab sold) {
		this.sold = sold;
	}

	public void setInprocess(Tab inprocess) {
		this.inprocess = inprocess;
	}

	public void setUpdate(Tab update) {
		this.update = update;
	}

	public void setAdmintab(TabPane admintab) {
		this.admintab = admintab;
	}

	public void setQueuehbox(HBox queuehbox) {
		this.queuehbox = queuehbox;
	}
    

	
	
	
	

}
