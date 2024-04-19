package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Client {
	private BorderPane clientborder= new BorderPane();
	//private Pane clientin = new Pane();
	private  TabPane tabPane= new TabPane();
	private ComboBox<String> combo = new ComboBox();
	private Tab client;
	private Label brandsea;
	private TextField textsea;
	private Button filter,nextclient,previousclient,mainpage,carstatus,searchbutton ,search,clearb,ordered;
	private HBox clienthboxbottom= new HBox(20);
	private HBox clienthboxtop= new HBox(18);
	private TableView<CarTable> cilentstable = new TableView();

	//private VBox vbox = new VBox(10);
	Stage stage2;
	
	
	Client(){
		client = new Tab();
		client.setText("Client");
		client.setStyle("-fx-border-color:black;-fx-border-width:2");
		TableColumn<CarTable, String> modelcolumn = new TableColumn<CarTable, String>("~Model~");
		modelcolumn.setCellValueFactory(new PropertyValueFactory<CarTable, String>("Model"));
		
		TableColumn<CarTable, String> yearcolumn = new TableColumn<CarTable, String>("~Year~");
		yearcolumn.setCellValueFactory(new PropertyValueFactory<CarTable, String>("Year"));
		
		TableColumn<CarTable, String> colorcolumn = new TableColumn<CarTable, String>("~Color~");
		colorcolumn.setCellValueFactory(new PropertyValueFactory<CarTable, String>("Color"));
		
		TableColumn<CarTable, Double> pricecolumn = new TableColumn<CarTable, Double>(
				"~Price in K~");
		pricecolumn.setCellValueFactory(new PropertyValueFactory<CarTable, Double>("Price"));
		modelcolumn.setMinWidth(100);
		yearcolumn.setMinWidth(100);
		colorcolumn.setMinWidth(100);
		pricecolumn.setMinWidth(100);
	
		cilentstable.getColumns().addAll(modelcolumn,yearcolumn,colorcolumn,pricecolumn);
		
		cilentstable.setMaxHeight(600);
		cilentstable.setMaxWidth(600);
		
		 Image img = new Image("file:///C:/Users/Ehab/eclipse-workspace/ProjectData2/src/application/nextt.jpeg");
	      ImageView view = new ImageView(img);
	      view.setFitHeight(30);
	      view.setFitWidth(50);
		
	      Image img1 = new Image("file:///C:/Users/Ehab/eclipse-workspace/ProjectData2/src/application/previous.jpeg");
	      ImageView view1 = new ImageView(img1);
	      view1.setFitHeight(30);
	      view1.setFitWidth(50);
		
		
		ordered = new Button("Ordered");
		ordered.setStyle(
		        "-fx-background-radius: 5em; " +
		                "-fx-min-width: 25px; " +
		                "-fx-min-height: 30px; " +
		                "-fx-max-width:  150px; " +
		                "-fx-max-height: 35px; " +"-fx-background-color: white;"+"-fx-border-color:yellow"
		        );
		ordered.setText("Ordered");
		ordered.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		ordered.setMinSize(150, 50);
//		ordered.setStyle("-fx-border-color:black;-fx-border-width:2;-fx-background-color: white");
//		ordered.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
//		
		
		searchbutton = new Button("SEARCH");
		searchbutton.setStyle(
		        "-fx-background-radius: 5em; " +
		                "-fx-min-width: 25px; " +
		                "-fx-min-height: 30px; " +
		                "-fx-max-width:  150px; " +
		                "-fx-max-height: 35px; " +"-fx-background-color: white;"+"-fx-border-color:yellow"
		        );
		searchbutton.setText("Search");
		searchbutton.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		searchbutton.setMinSize(150, 50);
//		searchbutton.setStyle("-fx-border-color:black;-fx-border-width:2;-fx-background-color: white");
//		searchbutton.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		textsea= new TextField();
		textsea.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,16));
		
		search = new Button("Search");
		search.setStyle(
		        "-fx-background-radius: 5em; " +
		                "-fx-min-width: 25px; " +
		                "-fx-min-height: 30px; " +
		                "-fx-max-width:  150px; " +
		                "-fx-max-height: 35px; " +"-fx-background-color: white;"+"-fx-border-color:yellow"
		        );
		search.setText("Search");
		search.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		search.setMinSize(150, 50);
//		search.setStyle("-fx-border-color:black;-fx-border-width:2;-fx-background-color: white");
//		search.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		brandsea= new Label("Brand Search : ");
		brandsea.setTextFill(Color.WHITE);
		brandsea.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		brandsea.setMaxWidth(200);
		
		clearb = new Button("Clear");
		clearb.setStyle(
		        "-fx-background-radius: 5em; " +
		                "-fx-min-width: 25px; " +
		                "-fx-min-height: 30px; " +
		                "-fx-max-width:  150px; " +
		                "-fx-max-height: 35px; " +"-fx-background-color: white;"+"-fx-border-color:yellow"
		        );
		clearb.setText("Clear");
		clearb.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		clearb.setMinSize(150, 50);
//		clearb.setStyle("-fx-border-color:black;-fx-border-width:2;-fx-background-color: white");
//		clearb.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		
		filter= new Button("Filter");
		filter.setStyle(
		        "-fx-background-radius: 5em; " +
		                "-fx-min-width: 25px; " +
		                "-fx-min-height: 30px; " +
		                "-fx-max-width:  150px; " +
		                "-fx-max-height: 35px; " +"-fx-background-color: white;"+"-fx-border-color:yellow"
		        );
		filter.setText("Filter");
		filter.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		filter.setMinSize(150, 50);
//		filter.setStyle("-fx-border-color:black;-fx-border-width:2;-fx-background-color: white");
//	    filter.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
//		
	    nextclient= new Button();
	    nextclient.setPrefSize(50, 30);
	    nextclient.setGraphic(view);
	    nextclient.setStyle(
		        "-fx-background-color: white;"+"-fx-border-color:yellow"
		        );
	    
	
	    
	    previousclient= new Button();
	    previousclient.setPrefSize(50, 30);
	    previousclient.setGraphic(view1);
	    previousclient.setStyle(
		        "-fx-background-color: white;"+"-fx-border-color:yellow"
		        );
	    
	   
	    mainpage= new Button("Main page");
	    mainpage.setStyle(
		        "-fx-background-radius: 5em; " +
		                "-fx-min-width: 25px; " +
		                "-fx-min-height: 30px; " +
		                "-fx-max-width:  150px; " +
		                "-fx-max-height: 35px; " +"-fx-background-color: white;"+"-fx-border-color:yellow"
		        );
	    mainpage.setText("Main Page");
	    mainpage.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	    mainpage.setMinSize(150, 50);
//	    mainpage.setStyle("-fx-border-color:black;-fx-border-width:2;-fx-background-color: white");
//	    mainpage.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
//	    
	    carstatus= new Button("Add");
	    carstatus.setStyle(
		        "-fx-background-radius: 5em; " +
		                "-fx-min-width: 25px; " +
		                "-fx-min-height: 30px; " +
		                "-fx-max-width:  150px; " +
		                "-fx-max-height: 35px; " +"-fx-background-color: white;"+"-fx-border-color:yellow"
		        );
	    carstatus.setText("Add");
	    carstatus.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	    carstatus.setMinSize(150, 50);
//	    carstatus.setStyle("-fx-border-color:black;-fx-border-width:2;-fx-background-color: white");
//	    carstatus.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	    
	    clienthboxtop.getChildren().addAll(combo,brandsea,textsea,searchbutton,clearb);
	    clienthboxtop.setAlignment(Pos.CENTER);
	    clienthboxbottom.getChildren().addAll(filter,search,previousclient,nextclient,carstatus,ordered,mainpage);
	    clienthboxbottom.setAlignment(Pos.CENTER);
	   // tabPane= new TabPane(client);
	    Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/ProjectData2/src/agyp.jpg");
		 ImageView mg = new ImageView(m);
		 mg.setFitHeight(600);
		 mg.setFitWidth(1200);
		 
		
		 
		 
		 clientborder.getChildren().add(mg);
	    clientborder.setTop(clienthboxtop);
	    clientborder.setBottom(clienthboxbottom);
	    clientborder.setCenter(cilentstable);
	    client.setContent(clientborder);
	    tabPane.getTabs().add(client);
	   
	}
	


	public Button getSearchbutton() {
		return searchbutton;
	}



	public Button getOrdered() {
		return ordered;
	}



	public void setSearchbutton(Button searchbutton) {
		this.searchbutton = searchbutton;
	}



	public void setOrdered(Button ordered) {
		this.ordered = ordered;
	}



	public Button getClearB() {
		return clearb;
	}


	public void setClearB(Button clear) {
		this.clearb = clear;
	}


	public TableView<CarTable> getCilentstable() {
		return cilentstable;
	}


	public void setCilentstable(TableView<CarTable> cilentstable) {
		this.cilentstable = cilentstable;
	}


	public TabPane getTabPane() {
		return tabPane;
	}


	public void setTabPane(TabPane tabPane) {
		this.tabPane = tabPane;
	}


	public BorderPane getClientborder() {
		return clientborder;
	}


	public Tab getClient() {
		return client;
	}


//	public Label getBrandlabel() {
//		return brandlabel;
//	}
//
//
//	public TextField getTextfbrand() {
//		return textfbrand;
//	}


	public Button getFilter() {
		return filter;
	}


	public Button getNextclient() {
		return nextclient;
	}


	public Button getPreviousclient() {
		return previousclient;
	}


	public Button getMainpage() {
		return mainpage;
	}


	public Button getCarstatus() {
		return carstatus;
	}


	public HBox getClienthboxbottom() {
		return clienthboxbottom;
	}


	public HBox getClienthboxtop() {
		return clienthboxtop;
	}


	public void setClientborder(BorderPane clientborder) {
		this.clientborder = clientborder;
	}


	public void setClient(Tab client) {
		this.client = client;
	}


//	public void setBrandlabel(Label brandlabel) {
//		this.brandlabel = brandlabel;
//	}
//
//
//	public void setTextfbrand(TextField textfbrand) {
//		this.textfbrand = textfbrand;
//	}


	public void setFilter(Button filter) {
		this.filter = filter;
	}


	public void setNextclient(Button nextclient) {
		this.nextclient = nextclient;
	}


	public void setPreviousclient(Button previousclient) {
		this.previousclient = previousclient;
	}


	public void setMainpage(Button mainpage) {
		this.mainpage = mainpage;
	}


	public void setCarstatus(Button carstatus) {
		this.carstatus = carstatus;
	}


	public void setClienthboxbottom(HBox clienthboxbottom) {
		this.clienthboxbottom = clienthboxbottom;
	}


	public void setClienthboxtop(HBox clienthboxtop) {
		this.clienthboxtop = clienthboxtop;
	}
	public ComboBox<String> getCombo() {
		return combo;
	}


	public Label getBrandsea() {
		return brandsea;
	}


	public TextField getTextsea() {
		return textsea;
	}


	public Button getSerachbutton() {
		return searchbutton;
	}


	public Button getSearch() {
		return search;
	}


	public void setCombo(ComboBox<String> combo) {
		this.combo = combo;
	}


	public void setBrandsea(Label brandsea) {
		this.brandsea = brandsea;
	}


	public void setTextsea(TextField textsea) {
		this.textsea = textsea;
	}


	public void setSerachbutton(Button searchbutton) {
		this.searchbutton = searchbutton;
	}


	public void setSearch(Button search) {
		this.search = search;
	}

	
	
	

}
