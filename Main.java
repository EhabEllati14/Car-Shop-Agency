package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Main extends Application {
	public static DoubleList list = new DoubleList();
	public static ClientQueue clientqueue = new ClientQueue();
	public static StackAdmin stack = new StackAdmin();
	public static StackAdmin stackstackstack = new StackAdmin();
	static QueueAdmin queueadmin = new QueueAdmin();
	public static QueueNode w = null;
// we define the classes as a object
	View view1 = new View();
	Client client = new Client();
	Filters filter = new Filters();
	CartClass cart = new CartClass();
	Adminscreen admin = new Adminscreen();
	TOPPAGE top = new TOPPAGE();
	Passwordscreen password = new Passwordscreen();
	Brandup brand = new Brandup();
	Warning war = new Warning();
	CarUpdate carup = new CarUpdate();
	Chooseone choose = new Chooseone();
	AddScreen addscreen = new AddScreen();
	Warningcar carwar = new Warningcar();
// we define the stages for each stage have his own scene
	Stage stage1 = new Stage();
	Stage stage2 = new Stage();
	Stage stage3 = new Stage();
	Stage stage4 = new Stage();
	Stage stage5 = new Stage();
	Stage stage6 = new Stage();
	Stage stage7 = new Stage();
	Stage stage8 = new Stage();
	Stage stage9 = new Stage();
	Stage stage10 = new Stage();
	Stage stage11 = new Stage();
	Stage stage12 = new Stage();
	Stage stage13 = new Stage();

	Scene scene1 = new Scene(view1.getViewgroup(), 1200, 600);
	Scene scene2 = new Scene(client.getTabPane(), 1200, 600);
	Scene scene3 = new Scene(filter.getFilterborder(), 500, 300);
	Scene scene4 = new Scene(cart.getCartborder(), 700, 400);
	Scene scene5 = new Scene(admin.getAdminborder(), 1200, 600);
	Scene scene6 = new Scene(top.getTop(), 800, 500);
	Scene scene7 = new Scene(password.getPasswordb(), 400, 150);
	Scene scene8 = new Scene(brand.getBrand(), 450, 200);
	Scene scene9 = new Scene(war.getWarningborder(), 450, 200);
	Scene scene10 = new Scene(carup.getCarborder(), 800, 400);
	Scene scene11 = new Scene(choose.getChooseborder(), 450, 200);
	Scene scene12 = new Scene(addscreen.getBorderins(), 600, 400);
	Scene scene13 = new Scene(carwar.getWarningborder(), 450, 200);
	public static Node2 cur = null;

	@Override
	public void start(Stage primaryStage) {
		stage1.setTitle("Car Agency System ");
		stage2.setTitle("Client Page");
		stage3.setTitle("Filters Page");
		stage4.setTitle("Add To Cart Page");
		stage5.setTitle("Admin Page");
		stage6.setTitle("Top 10 Finished Process");
		stage7.setTitle("Password Page");
		stage8.setTitle("Update Brand Page");
		stage9.setTitle("Warning !!!!!");
		stage10.setTitle("Car Update Page");
		stage11.setTitle("Warning Page");
		stage12.setTitle("Add Car Page");
		stage13.setTitle(" Warning Page");

		stage1.setScene(scene1);
		stage1.show();

		ObservableList<CarTable> elements = FXCollections.observableArrayList();
		ObservableList<String> combolist = FXCollections.observableArrayList();
		ObservableList<String> year = FXCollections.observableArrayList();
		ObservableList<String> color = FXCollections.observableArrayList();
		ObservableList<String> model = FXCollections.observableArrayList();
		ObservableList<AdminTable> stacklist = FXCollections.observableArrayList();
		ObservableList<AdminTable2> queuelist = FXCollections.observableArrayList();
		ObservableList<AdminTable3> toplist = FXCollections.observableArrayList();
		ObservableList<SummaryTable> summ = FXCollections.observableArrayList();

		view1.getChoosecar().setOnAction(e -> {
			admin.getQueuetable().getItems().clear();
			admin.getStacktable().getItems().clear();
			queuelist.clear();
			stacklist.clear();
			admin.getQueuetable().refresh();
			admin.getStacktable().refresh();
			FileChooser fe = new FileChooser();
			File file1 = fe.showOpenDialog(stage1);
			// we use try&catch because if we have an error to handle the error
			// Like the user forget to choose the file so we print a message
			try (Scanner scan = new Scanner(file1)) {
				// while file have an next line we read it
				while (scan.hasNextLine()) {
					// we read line by line
					String s = scan.nextLine();
					// we use array to split the line by use tokens
					// we split by use comma
					String r = s.trim();
					String[] tokens = r.split(", ");
					double d = Double.parseDouble(tokens[4].replaceAll("K", "").trim());
					list.add(tokens[0], new Car(tokens[1], tokens[2], tokens[3], d));

				}

				scan.close();
			}

			catch (FileNotFoundException e1) {
				System.out.println(
						"error !! : please enter the file name \n if the file does not exsists the filewriter will create it !");

			} catch (Exception ex) {
				System.out.println("You are read from null ");

			}

			// list.PrintDoubleList();
			// System.out.println(list.getFirst().getNext().getNext().getNext().getSingle().printList().toString());
		});
		view1.getChooseorder().setOnAction(e -> {

			FileChooser f = new FileChooser();
			File file1 = f.showOpenDialog(stage1);

			try {
				Scanner scan = new Scanner(file1);
				while (scan.hasNextLine()) {
					String s = scan.nextLine();
					String r = s.trim();
					String[] tokens = r.split(", ");
					String h = tokens[8];
					double v = Double.parseDouble(tokens[6].replaceAll("K", "").trim());
					if (h.equalsIgnoreCase("Inprocess") || h.equalsIgnoreCase(" Inprocess")
							|| h.equalsIgnoreCase("  Inprocess")) {
						queueadmin.enQueueadmin(tokens[0], tokens[1], new Car(tokens[3], tokens[4], tokens[5], v),
								tokens[7], h, tokens[2]);
						queuelist.add(new AdminTable2(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5],
								v, tokens[7], h));
					} else {
						stack.push(tokens[0], tokens[1], new Car(tokens[3], tokens[4], tokens[5], v), tokens[7], h,
								tokens[2]);
					}
				}
				w = queueadmin.rear;
				// n = queueadmin.front;
				StackNode ss = stack.first;
				while (ss != null) {
					stacklist.add(new AdminTable(ss.getName(), ss.getMobile(), ss.getBrand(), ss.getCars().getModel(),
							ss.getCars().getYear(), ss.getCars().getColor(), ss.getCars().getPrice(), ss.getDate(),
							ss.getStatus()));
					ss = ss.getNext();
				}

				admin.getStacktable().setItems(FXCollections.observableList(stacklist));
				admin.getQueuetable().setItems(FXCollections.observableList(queuelist));
				scan.close();

			}

			catch (FileNotFoundException e1) {
				System.out.println(
						"error !! : please enter the file name \n if the file does not exsists the filewriter will create it !");
			}
			catch(Exception g) {
				System.out.println(" ");
			}
		});

		view1.getClient().setOnAction(e -> {
			try {
				client.getCombo().getItems().clear();
				combolist.clear();
				client.getBrandsea().setVisible(false);
				client.getSerachbutton().setVisible(false);
				client.getTextsea().setVisible(false);
				client.getClearB().setVisible(false);

				Node2 curr = list.getFirst();
				for (int i = 0; i < list.countd; i++) {
					combolist.add(curr.getBrand());
					curr = curr.getNext();
				}

				client.getCombo().setItems(combolist);
				stage1.close();
				stage2.setScene(scene2);
				stage2.show();
			} catch (NullPointerException w) {
				System.out.println("null");
			}
		});

		view1.getAdmin().setOnAction(e -> {
			admin.getComboup().getItems().clear();
			combolist.clear();
			Node2 curr = list.getFirst();
			for (int i = 0; i < list.countd; i++) {
				combolist.add(curr.getBrand());
				curr = curr.getNext();
			}
			admin.getComboup().setItems(combolist);

			password.getMassg().setVisible(false);
			password.getPass().setText(null);
			stage7.setScene(scene7);
			stage7.show();
		});

		password.getOk().setOnAction(e -> {
			try {
				password.getMassg().setVisible(false);
				if (password.getPass().getText().equals("Ehabbmw2124")) {
					stage1.close();
					stage7.close();
					stage5.setScene(scene5);
					stage5.show();
				} else {
					password.getMassg().setVisible(true);
					password.getPass().setText(null);
				}
			} catch (NullPointerException ex) {
				System.out.println("Null Password");
			}
		});

		password.getTryagain().setOnAction(e -> {
			password.getMassg().setVisible(false);
			password.getPass().setText(null);

		});

		password.getMain().setOnAction(e -> {
			stage7.close();
			stage1.setScene(scene1);
			stage1.show();
		});
		client.getNextclient().setOnAction(e -> {
			try {
				if (cur == null) {
					cur = list.firstd;
					Node1 current = cur.getSingle().getFirst();
					for (int i = 1; i <= cur.getSingle().count; i++) {
						elements.add(new CarTable(current.getCars().getModel(), current.getCars().getYear(),
								current.getCars().getColor(), current.getCars().getPrice()));
						current =current.getNext();
					}
					admin.getComboup().setValue(cur.getBrand());
					admin.getUpdateTable().setItems(FXCollections.observableArrayList(elements));
					client.getCombo().setValue(cur.getBrand());
					client.getCilentstable().setItems(FXCollections.observableArrayList(elements));

				} else {
					cur = cur.getNext();
					Node1 current = cur.getSingle().getFirst();
					admin.getUpdateTable().getItems().clear();
					client.getCilentstable().getItems().clear();
					elements.clear();
					admin.getUpdateTable().refresh();
					client.getCilentstable().refresh();
					for (int i = 1; i <= cur.getSingle().count; i++) {
						elements.add(new CarTable(current.getCars().getModel(), current.getCars().getYear(),
								current.getCars().getColor(), current.getCars().getPrice()));
						current = current.getNext();
					}
					admin.getComboup().setValue(cur.getBrand());
					admin.getUpdateTable().setItems(FXCollections.observableArrayList(elements));
					client.getCombo().setValue(cur.getBrand());
					client.getCilentstable().setItems(FXCollections.observableArrayList(elements));
				}
			} catch (Exception ex) {
				System.out.print("nulllll");
			}

		});

		client.getPreviousclient().setOnAction(e -> {
			try {
				if (cur == null) {
					cur = list.last;
					Node1 current = cur.getSingle().getFirst();
					for (int i = 1; i <= cur.getSingle().count; i++) {
						elements.add(new CarTable(current.getCars().getModel(), current.getCars().getYear(),
								current.getCars().getColor(), current.getCars().getPrice()));
						current = current.getNext();
					}
					admin.getComboup().setValue(cur.getBrand());
					admin.getUpdateTable().setItems(FXCollections.observableArrayList(elements));
					client.getCombo().setValue(cur.getBrand());
					client.getCilentstable().setItems(FXCollections.observableArrayList(elements));

				} else {
					cur = cur.getPrevious();
					client.getCombo().setPromptText(cur.getBrand());
					Node1 current = cur.getSingle().getFirst();
					admin.getUpdateTable().getItems().clear();
					client.getCilentstable().getItems().clear();
					elements.clear();
					admin.getUpdateTable().refresh();
					client.getCilentstable().refresh();
					for (int i = 1; i <= cur.getSingle().count; i++) {
						elements.add(new CarTable(current.getCars().getModel(), current.getCars().getYear(),
								current.getCars().getColor(), current.getCars().getPrice()));
						current = current.getNext();
					}
					admin.getComboup().setValue(cur.getBrand());
					admin.getUpdateTable().setItems(FXCollections.observableArrayList(elements));
					client.getCombo().setValue(cur.getBrand());
					client.getCilentstable().setItems(FXCollections.observableArrayList(elements));

				}
			} catch (Exception ex) {
				System.out.println("Null Pointer Exception");
			}

		});
		client.getCombo().setOnAction(e -> {
try {
			ArrayList<String> com = new ArrayList();
			for (int i = 0; i < combolist.size(); i++) {
				com.add(combolist.get(i));
			}

			for (int i = 0; i < com.size(); i++) {
				if (client.getCombo().getValue().equals(com.get(i))) {
					cur = list.firstd;
					for (int j = 1; j < list.countd; j++) {
						if (cur.getBrand().trim()
								.equals(client.getCombo().getSelectionModel().getSelectedItem().trim())) {
							break;
						} else {
							cur = cur.getNext();
						}
					}
				}
			}
			Node1 current = cur.getSingle().getFirst();
			admin.getUpdateTable().getItems().clear();
			client.getCilentstable().getItems().clear();
			elements.clear();
			admin.getUpdateTable().refresh();
			client.getCilentstable().refresh();
			for (int i = 1; i <= cur.getSingle().count; i++) {
				elements.add(new CarTable(current.getCars().getModel(), current.getCars().getYear(),
						current.getCars().getColor(), current.getCars().getPrice()));
				current = current.getNext();
			}
			admin.getComboup().setValue(cur.getBrand());
			admin.getUpdateTable().setItems(FXCollections.observableArrayList(elements));
			client.getCombo().setValue(cur.getBrand());
			client.getCilentstable().setItems(FXCollections.observableArrayList(elements));
}
catch(Exception w) {
	System.out.println(" ");
}
		});

		client.getSearch().setOnAction(e -> {
			client.getBrandsea().setVisible(true);
			client.getSerachbutton().setVisible(true);
			client.getTextsea().setVisible(true);
			client.getClearB().setVisible(true);
			client.getTextsea().setText(null);

		});
		client.getSerachbutton().setOnAction(e -> {
			try {
				cur = list.Search(client.getTextsea().getText());
				client.getCilentstable().getItems().clear();
				elements.clear();
				client.getCilentstable().refresh();
				Node1 current = cur.getSingle().getFirst();
				for (int i = 1; i <= cur.getSingle().count; i++) {
					elements.add(new CarTable(current.getCars().getModel(), current.getCars().getYear(),
							current.getCars().getColor(), current.getCars().getPrice()));
					current = current.getNext();
				}
				client.getTextsea().setText(cur.getBrand());
				client.getCombo().setValue(cur.getBrand());
				client.getCilentstable().setItems(FXCollections.observableArrayList(elements));
			} catch (Exception ex) {
				System.out.println("");
			}
		});
		client.getClearB().setOnAction(e -> {
			client.getBrandsea().setVisible(false);
			client.getSerachbutton().setVisible(false);
			client.getTextsea().setVisible(false);
			client.getClearB().setVisible(false);

		});
		client.getMainpage().setOnAction(e -> {
			stage2.close();
			stage1.setScene(scene1);
			stage1.show();

		});

		client.getFilter().setOnAction(e -> {
			year.clear();
			color.clear();
			model.clear();
			try {
				filter.getBrandt().setText(cur.getBrand());
				Node1 curr = cur.getSingle().getFirst();
				Node1 curr2 = cur.getSingle().getFirst();
				Node1 curr3 = cur.getSingle().getFirst();
				for (int i = 1; i <= cur.getSingle().count; i++) {
					if (!(year.contains(curr.getCars().getYear()))) {
						year.add(curr.getCars().getYear());
						curr = curr.getNext();
					} else {
						curr = curr.getNext();
					}
				}
				for (int i = 1; i <= cur.getSingle().count; i++) {
					if (!(color.contains(curr2.getCars().getColor()))) {
						color.add(curr2.getCars().getColor());
						curr2 = curr2.getNext();
					} else {
						curr2 = curr2.getNext();
					}
				}
				for (int i = 1; i <= cur.getSingle().count; i++) {
					if (!(model.contains(curr3.getCars().getModel()))) {
						model.add(curr3.getCars().getModel());
						curr3 = curr3.getNext();
					} else {
						curr3 = curr3.getNext();
					}
				}

				filter.getYearf().setItems(year);
				filter.getYeart().setItems(year);
				filter.getColort().setItems(color);
				filter.getModelt().setItems(model);
				stage3.setScene(scene3);
				stage3.show();
			} catch (Exception w) {
				System.out.println("");
			}
		});

		filter.getClearButton().setOnAction(e -> {
			year.clear();
			color.clear();
			model.clear();
			filter.getBrandt().setText("");
			filter.getPricef().setText(null);
			filter.getPricet().setText(null);
			filter.getOktxt().setText(null);
			filter.getCleartxt().setText(null);
			stage3.close();
		});
		filter.getOk().setOnAction(e -> {
			try {
				client.getCilentstable().getItems().clear();
				elements.clear();
				Node1 current = cur.getSingle().getFirst();
				for (int i = 1; i <= cur.getSingle().count; i++) {
					Double d1 = Double.parseDouble(filter.getPricef().getText());
					Double d2 = Double.parseDouble(filter.getPricet().getText());
					if (((filter.getYearf().getValue().equals(current.getCars().getYear()))
							|| (filter.getYeart().getValue().equals(current.getCars().getYear())))
							&& (filter.getColort().getValue().equals(current.getCars().getColor()))
							&& (filter.getModelt().getValue().equals(current.getCars().getModel()))
							&& ((d1 <= current.getCars().getPrice()) && (d2 >= current.getCars().getPrice()))) {
						elements.add(new CarTable(current.getCars().getModel(), current.getCars().getYear(),
								current.getCars().getColor(), current.getCars().getPrice()));
						current = current.getNext();
					} else {
						current = current.getNext();
					}
				}
				client.getCilentstable().setItems(FXCollections.observableArrayList(elements));
				stage3.close();
			} catch (Exception ex) {
				System.out.println("Null Text Feilds");
			}
		});

		client.getCarstatus().setOnAction(e -> {
			if (client.getCilentstable().getSelectionModel().getSelectedItem() == null) {
				stage11.setScene(scene11);
				stage11.show();
			} else {
				stage4.setScene(scene4);
				stage4.show();
			}
		});
		cart.getClear().setOnAction(e -> {
			stage4.close();
		});
		cart.getOk().setOnAction(e -> {
			try {

				String date = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
				String in = "InProcess";
				clientqueue.enQueue(cart.getCustnamef().getText(), cart.getCustmobilef().getText(),
						new Car(client.getCilentstable().getSelectionModel().getSelectedItem().getModel(),
								client.getCilentstable().getSelectionModel().getSelectedItem().getYear(),
								client.getCilentstable().getSelectionModel().getSelectedItem().getColor(),
								client.getCilentstable().getSelectionModel().getSelectedItem().getPrice()),
						date, in, cur.getBrand());
				cart.getCustnamef().setText(null);
				cart.getCustmobilef().setText(null);

		 
				stage4.close();

			} catch (Exception w) {
				System.out.println("text are null");
			}
		});
		client.getOrdered().setOnAction(e -> {
			try {
				FileWriter file = new FileWriter("C:\\Users\\Ehab\\Downloads\\orders.txt", true);
				PrintWriter fileout = new PrintWriter(file, true);
				fileout.append(clientqueue.PrintQueue().toString());
				fileout.close();
				for (int i = 1; i <= ClientQueue.countc; i++) {
					clientqueue.deQueue();
				}
			}

			catch (Exception e1) {

				e1.printStackTrace();
			}

		});
		admin.getMainpage().setOnAction(e -> {
			stage5.close();
			stage1.setScene(scene1);
			stage1.show();
		});

		admin.getTop10().setOnAction(e -> {
			try {
				toplist.clear();
				top.getToptable().getItems().clear();
				top.getToptable().refresh();
				for (int i = 1; i <= 10 && stack.first != null; i++) {
					StackNode node = stack.pop();
					stackstackstack.push(node.getName(), node.getMobile(), node.getCars(), node.getDate(),
							node.getStatus(), node.getBrand());
				}

				admin.getStacktable().getItems().clear();
				stacklist.clear();
				admin.getStacktable().refresh();
				StackNode sss = stack.first;
				while (sss != null) {
					stacklist.add(new AdminTable(sss.getName(), sss.getMobile(), sss.getBrand(),
							sss.getCars().getModel(), sss.getCars().getYear(), sss.getCars().getColor(),
							sss.getCars().getPrice(), sss.getDate(), sss.getStatus()));
					sss = sss.getNext();
				}
				admin.getStacktable().setItems(FXCollections.observableList(stacklist));
				admin.getStacktable().refresh();

				while (stackstackstack.first != null) {
					StackNode ss = stackstackstack.pop();
					stack.push(ss.getName(), ss.getMobile(), ss.getCars(), ss.getDate(), ss.getStatus(), ss.getBrand());
					toplist.add(new AdminTable3(ss.getName(), ss.getMobile(), ss.getBrand(), ss.getCars().getModel(),
							ss.getCars().getYear(), ss.getCars().getColor(), ss.getCars().getPrice(), ss.getDate(),
							ss.getStatus()));
				}

				top.getToptable().setItems(FXCollections.observableList(toplist));
				admin.getStacktable().refresh();
				stage6.setScene(scene6);
				stage6.show();
			} catch (Exception w) {
				System.out.println("null");
			}

		});
		top.getDone().setOnAction(e -> {
			admin.getStacktable().getItems().clear();
			// stacklist.clear();
			admin.getStacktable().refresh();
			StackNode r = stack.first;
			while (r != null) {
				stacklist.add(new AdminTable(r.getName(), r.getMobile(), r.getBrand(), r.getCars().getModel(),
						r.getCars().getYear(), r.getCars().getColor(), r.getCars().getPrice(), r.getDate(),
						r.getStatus()));
				r = r.getNext();
			}
			admin.getStacktable().setItems(FXCollections.observableList(stacklist));
			admin.getStacktable().refresh();
			stage6.close();
		});

		admin.getRemove().setOnAction(e -> {
			try {
			while (stack.first != null) {
				if (admin.getStacktable().getSelectionModel().getSelectedItem().getName().equals(stack.first.getName())
						&& admin.getStacktable().getSelectionModel().getSelectedItem().getMobile()
								.equals(stack.first.getMobile())
						&& admin.getStacktable().getSelectionModel().getSelectedItem().getBrand()
								.equals(stack.first.getBrand())
						&& admin.getStacktable().getSelectionModel().getSelectedItem().getModel()
								.equals(stack.first.getCars().getModel())
						&& admin.getStacktable().getSelectionModel().getSelectedItem().getYear()
								.equals(stack.first.getCars().getYear())
						&& admin.getStacktable().getSelectionModel().getSelectedItem().getColor()
								.equals(stack.first.getCars().getColor())
						&& admin.getStacktable().getSelectionModel().getSelectedItem().getPrice() == stack.first
								.getCars().getPrice()
						&& admin.getStacktable().getSelectionModel().getSelectedItem().getDate()
								.equals(stack.first.getDate())
						&& admin.getStacktable().getSelectionModel().getSelectedItem().getStatus()
								.equals(stack.first.getStatus())) {
					stack.pop();
					break;
				} else {
					StackNode node = stack.pop();
					stackstackstack.push(node.getName(), node.getMobile(), node.getCars(), node.getDate(),
							node.getStatus(), node.getBrand());
				}
			}
			

			while (stackstackstack.first != null) {

				stack.push(stackstackstack.first.getName(), stackstackstack.first.getMobile(),
						stackstackstack.first.getCars(), stackstackstack.first.getDate(),
						stackstackstack.first.getStatus(), stackstackstack.first.getBrand());
				stackstackstack.pop();

			}

			admin.getStacktable().getItems().clear();
			admin.getStacktable().refresh();
			stacklist.clear();

			StackNode r = stack.first;

			while (r != null) {
				stacklist.add(new AdminTable(r.getName(), r.getMobile(), r.getBrand(), r.getCars().getModel(),
						r.getCars().getYear(), r.getCars().getColor(), r.getCars().getPrice(), r.getDate(),
						r.getStatus()));
				r = r.getNext();
			}

			admin.getStacktable().setItems(FXCollections.observableList(stacklist));
			admin.getStacktable().refresh();
			}catch(Exception a) {
				System.out.println(" ");
			}
		});

//		admin.getCancel().setOnAction(e -> {
//			try {
//				QueueNode n = queueadmin.front;
//				QueueNode w = queueadmin.rear;
//
//				while (QueueAdmin.count > 0) {
//					if (admin.getQueuetable().getSelectionModel().getSelectedItem().getName().trim().equals(n.getName())
//							|| admin.getQueuetable().getSelectionModel().getSelectedItem().getBrand().trim()
//									.equals(n.getBrand())) {
//						queueadmin.deQueueadmin();
//						break;
//					} else {
//						QueueNode q = queueadmin.deQueueadmin();
//
//						clientqueue.enQueue(q.getName(), q.getMobile(), q.getCars(), q.getDate(), q.getStatus(),
//								q.getBrand());
//					}
//					n = queueadmin.front;
//					w = queueadmin.rear;
//
//				}
//				n = queueadmin.front;
//				w = queueadmin.rear;
//				if (n == null || w == null) {
//					while (clientqueue.front != null && clientqueue.rear != null) {
//						QueueNode f = clientqueue.deQueue();
//						queueadmin.enQueueadmin(f.getName(), f.getMobile(), f.getCars(), f.getDate(), f.getStatus(),
//								f.getBrand());
//					}
//				} else {
//					QueueNode t = queueadmin.rear;
//					while (clientqueue.front != null && clientqueue.rear != null) {
//						QueueNode f = clientqueue.deQueue();
//						queueadmin.enQueueadmin(f.getName(), f.getMobile(), f.getCars(), f.getDate(), f.getStatus(),
//								f.getBrand());
//					}
//
//					w = t;
//					n = t.getNext();
//					queueadmin.front = n;
//					queueadmin.rear = w;
//				}
//				admin.getQueuetable().getItems().clear();
//				admin.getQueuetable().refresh();
//				queuelist.clear();
//				QueueNode r = queueadmin.front;
//				do {
//					queuelist.add(new AdminTable2(r.getName(), r.getMobile(), r.getBrand(), r.getCars().getModel(),
//							r.getCars().getYear(), r.getCars().getColor(), r.getCars().getPrice(), r.getDate(),
//							r.getStatus()));
//					r = r.getNext();
//				} while (r != queueadmin.front);
//				admin.getQueuetable().setItems(FXCollections.observableList(queuelist));
//				admin.getQueuetable().refresh();
//			}
//
//			catch (NullPointerException w) {
//				System.out.println("  null ");
//			}
//
//		});

		admin.getLater().setOnAction(e -> {
			try {
				if (queueadmin.front != w) {
					QueueNode s = queueadmin.deQueueadmin();
					queueadmin.enQueueadmin(s.getName(), s.getMobile(), s.getCars(), s.getDate(), s.getStatus(),
							s.getBrand());
					admin.getQueuetable().getItems().clear();
					admin.getQueuetable().refresh();
					queuelist.clear();
					QueueNode j = queueadmin.front;
					int countt = QueueAdmin.count;
					while (countt > 0) {
						queuelist.add(new AdminTable2(j.getName(), j.getMobile(), j.getBrand().trim(),
								j.getCars().getModel(), j.getCars().getYear(), j.getCars().getColor(),
								j.getCars().getPrice(), j.getDate(), j.getStatus()));
						j = j.getNext();
						countt--;
					}
//				QueueNode r = queueadmin.front;
//				do {
//					queuelist.add(new AdminTable2(r.getName(), r.getMobile(), r.getBrand(), r.getCars().getModel(),
//							r.getCars().getYear(), r.getCars().getColor(), r.getCars().getPrice(), r.getDate(),
//							r.getStatus()));
//					r = r.getNext();
//				} while (r != queueadmin.front);
					admin.getQueuetable().setItems(FXCollections.observableList(queuelist));
					admin.getQueuetable().refresh();
				} else {
					w = queueadmin.rear;
					QueueNode s = queueadmin.deQueueadmin();
					queueadmin.enQueueadmin(s.getName(), s.getMobile(), s.getCars(), s.getDate(), s.getStatus(),
							s.getBrand());
					w = queueadmin.rear;
					admin.getQueuetable().getItems().clear();
					admin.getQueuetable().refresh();
					queuelist.clear();
					QueueNode j = queueadmin.front;
					int countt = QueueAdmin.count;
					while (countt > 0) {
						queuelist.add(new AdminTable2(j.getName(), j.getMobile(), j.getBrand().trim(),
								j.getCars().getModel(), j.getCars().getYear(), j.getCars().getColor(),
								j.getCars().getPrice(), j.getDate(), j.getStatus()));
						j = j.getNext();
						countt--;
					}
//				QueueNode r = queueadmin.front;
//				do {
//					queuelist.add(new AdminTable2(r.getName(), r.getMobile(), r.getBrand(), r.getCars().getModel(),
//							r.getCars().getYear(), r.getCars().getColor(), r.getCars().getPrice(), r.getDate(),
//							r.getStatus()));
//					r = r.getNext();
//				} while (r != queueadmin.front);
					admin.getQueuetable().setItems(FXCollections.observableList(queuelist));
					admin.getQueuetable().refresh();
				}
			} catch (Exception f) {
				System.out.println(" ");
			}
		});
		admin.getCancel().setOnAction(e -> {
			try {
				if (queueadmin.front != w) {
					queueadmin.deQueueadmin();
					queueadmin.rear = w;
					queueadmin.front = w.getNext();
					admin.getQueuetable().getItems().clear();
					admin.getQueuetable().refresh();
					queuelist.clear();

					QueueNode j = queueadmin.front;
					int countt = QueueAdmin.count;
					while (countt > 0) {
						queuelist.add(new AdminTable2(j.getName(), j.getMobile(), j.getBrand().trim(),
								j.getCars().getModel(), j.getCars().getYear(), j.getCars().getColor(),
								j.getCars().getPrice(), j.getDate(), j.getStatus()));
						j = j.getNext();
						countt--;
					}
//				do {
//					queuelist.add(new AdminTable2(j.getName(), j.getMobile(), j.getBrand().trim(),
//							j.getCars().getModel(), j.getCars().getYear(), j.getCars().getColor(),
//							j.getCars().getPrice(), j.getDate(), j.getStatus()));
//					j = j.getNext();
//				} while (j != queueadmin.front);
					admin.getQueuetable().setItems(FXCollections.observableList(queuelist));
					admin.getQueuetable().refresh();

				} else {
					w = queueadmin.rear;
					queueadmin.deQueueadmin();
					admin.getQueuetable().getItems().clear();
					admin.getQueuetable().refresh();
					queuelist.clear();
					QueueNode j = queueadmin.front;
					int countt = QueueAdmin.count;
//				do {
//					queuelist.add(new AdminTable2(j.getName(), j.getMobile(), j.getBrand().trim(),
//							j.getCars().getModel(), j.getCars().getYear(), j.getCars().getColor(),
//							j.getCars().getPrice(), j.getDate(), j.getStatus()));
//					j = j.getNext();
//				} while (j!=queueadmin.front);
					while (countt > 0) {
						queuelist.add(new AdminTable2(j.getName(), j.getMobile(), j.getBrand().trim(),
								j.getCars().getModel(), j.getCars().getYear(), j.getCars().getColor(),
								j.getCars().getPrice(), j.getDate(), j.getStatus()));
						j = j.getNext();
						countt--;
					}
					admin.getQueuetable().setItems(FXCollections.observableList(queuelist));
					admin.getQueuetable().refresh();
				}
				// System.out.println(queueadmin.PrintQueue());

			}

			catch (Exception r) {
				System.out.println("End");
			}
		});
		admin.getSoldbutton().setOnAction(e -> {
			try {
				int counta = 0;

				Node2 current = list.firstd;
				for (int i = 1; i <= list.countd; i++) {
					if (current.getBrand().trim().equals(queueadmin.front.getBrand().trim())) {
						break;
					} else {
						current = current.getNext();
					}
				}
				String b = queueadmin.front.getCars().getModel().trim();
				String c = queueadmin.front.getCars().getYear().trim();
				String d = queueadmin.front.getCars().getColor().trim();
				double f = queueadmin.front.getCars().getPrice();
				Node1 curr = current.getSingle().first;
				for (int k = 1; k <= current.getSingle().count; k++) {
					if (curr.getCars().getModel().trim().equals(b) && curr.getCars().getYear().trim().equals(c)
							&& curr.getCars().getColor().trim().equals(d) && curr.getCars().getPrice() == f) {
						current.getSingle().remove(curr.getCars());
						counta = 0;
						break;
					} else {
						curr = curr.getNext();
						counta++;
					}
				}
				if (counta == 0) {

					if (queueadmin.front != w) {
						QueueNode a = queueadmin.deQueueadmin();
						stack.push(a.getName(), a.getMobile(), a.getCars(), a.getDate(), "Finished",
								a.getBrand().trim());

						admin.getStacktable().getItems().clear();
						stacklist.clear();
						admin.getStacktable().refresh();
						StackNode r = stack.first;
						while (r != null) {
							stacklist.add(new AdminTable(r.getName(), r.getMobile(), r.getBrand().trim(),
									r.getCars().getModel(), r.getCars().getYear(), r.getCars().getColor(),
									r.getCars().getPrice(), r.getDate(), r.getStatus()));
							r = r.getNext();
						}

						admin.getStacktable().setItems(FXCollections.observableList(stacklist));
						admin.getStacktable().refresh();

						queueadmin.rear = w;
						queueadmin.front = w.getNext();
						admin.getQueuetable().getItems().clear();
						admin.getQueuetable().refresh();
						queuelist.clear();
						QueueNode j = queueadmin.front;
						int countt = QueueAdmin.count;
						while (countt > 0) {
							queuelist.add(new AdminTable2(j.getName(), j.getMobile(), j.getBrand().trim(),
									j.getCars().getModel(), j.getCars().getYear(), j.getCars().getColor(),
									j.getCars().getPrice(), j.getDate(), j.getStatus()));
							j = j.getNext();
							countt--;
						}

						admin.getQueuetable().setItems(FXCollections.observableList(queuelist));
						admin.getQueuetable().refresh();

					} else {

						w = queueadmin.rear;
						QueueNode a = queueadmin.deQueueadmin();
						stack.push(a.getName(), a.getMobile(), a.getCars(), a.getDate(), "Finished",
								a.getBrand().trim());

						admin.getStacktable().getItems().clear();
						stacklist.clear();
						admin.getStacktable().refresh();
						StackNode r = stack.first;
						while (r != null) {
							stacklist.add(new AdminTable(r.getName(), r.getMobile(), r.getBrand().trim(),
									r.getCars().getModel(), r.getCars().getYear(), r.getCars().getColor(),
									r.getCars().getPrice(), r.getDate(), r.getStatus()));
							r = r.getNext();
						}

						admin.getStacktable().setItems(FXCollections.observableList(stacklist));
						admin.getStacktable().refresh();
						admin.getQueuetable().getItems().clear();
						admin.getQueuetable().refresh();
						queuelist.clear();
						QueueNode j = queueadmin.front;
						int countt = QueueAdmin.count;
						while (countt > 0) {
							queuelist.add(new AdminTable2(j.getName(), j.getMobile(), j.getBrand().trim(),
									j.getCars().getModel(), j.getCars().getYear(), j.getCars().getColor(),
									j.getCars().getPrice(), j.getDate(), j.getStatus()));
							j = j.getNext();
							countt--;
						}
//					QueueNode o = queueadmin.front;
//					do {
//						queuelist.add(new AdminTable2(o.getName(), o.getMobile(), o.getBrand(), o.getCars().getModel(),
//								o.getCars().getYear(), o.getCars().getColor(), o.getCars().getPrice(), o.getDate(),
//								o.getStatus()));
//						o = o.getNext();
//					} while (o != queueadmin.front);
						admin.getQueuetable().setItems(FXCollections.observableList(queuelist));
						admin.getQueuetable().refresh();
					}

				} else {
					QueueNode h = queueadmin.deQueueadmin();
					queueadmin.enQueueadmin(h.getName(), h.getMobile(), h.getCars(), h.getDate(), h.getStatus(),
							h.getBrand().trim());
					admin.getQueuetable().getItems().clear();
					admin.getQueuetable().refresh();
					queuelist.clear();
					QueueNode j = queueadmin.front;
					int countt = QueueAdmin.count;
					while (countt > 0) {
						queuelist.add(new AdminTable2(j.getName(), j.getMobile(), j.getBrand().trim(),
								j.getCars().getModel(), j.getCars().getYear(), j.getCars().getColor(),
								j.getCars().getPrice(), j.getDate(), j.getStatus()));
						j = j.getNext();
						countt--;
					}
//				QueueNode j = queueadmin.front;
//				do {
//					queuelist.add(new AdminTable2(j.getName(), j.getMobile(), j.getBrand().trim(),
//							j.getCars().getModel(), j.getCars().getYear(), j.getCars().getColor(),
//							j.getCars().getPrice(), j.getDate(), j.getStatus()));
//					j = j.getNext();
//				} while (j != queueadmin.front);

					admin.getQueuetable().setItems(FXCollections.observableList(queuelist));
					admin.getQueuetable().refresh();

				}
//			admin.getQueuetable().getItems().clear();
//			admin.getQueuetable().refresh();
//			queuelist.clear();
//			QueueNode r = queueadmin.front;
//			do {
//				queuelist.add(new AdminTable2(r.getName(), r.getMobile(), r.getBrand(), r.getCars().getModel(),
//						r.getCars().getYear(), r.getCars().getColor(), r.getCars().getPrice(), r.getDate(),
//						r.getStatus()));
//				r = r.getNext();
//			} while (r != queueadmin.front);
//			admin.getQueuetable().setItems(FXCollections.observableList(queuelist));
//			admin.getQueuetable().refresh();

			} catch (Exception w) {
				System.out.println("No More in queueeeeeeeee");
			}
		});
////		
//		admin.getSoldbutton().setOnAction(e->{
//			try {
//		 int counta=0;
//			QueueNode s=queueadmin.front;
//			Node2 current=list.firstd;
//			for(int i=1;i<=list.countd;i++) {
//				if(current.getBrand().trim().equals(s.getBrand().trim())) {
//					break;
//					} else {
//						current = current.getNext();
//					}
//			}
//				System.out.println("1");
//				
//				String b=s.getCars().getModel().trim();
//				String c= s.getCars().getYear().trim();
//				String d=s.getCars().getColor().trim();
//				double f=s.getCars().getPrice();
//				Node1 curr = current.getSingle().first;
//				for (int k = 1; k <= current.getSingle().count; k++) {
//					if (curr.getCars().getModel().trim().equals(b) && curr.getCars().getYear().trim().equals(c)
//							&& curr.getCars().getColor().trim().equals(d) && curr.getCars().getPrice() == f) {
//						current.getSingle().remove(curr.getCars());
//						counta = 0;
//						break;
//					} else {
//						curr = curr.getNext();
//						counta++;
//					}
//				}
//				System.out.println("2");
//				if (counta == 0) {
//					System.out.println("3");
//					QueueNode a = queueadmin.deQueueadmin();
//					stack.push(a.getName(), a.getMobile(), a.getCars(), a.getMobile(), "Finished",
//							a.getBrand().trim());
//					System.out.println("4");
//					admin.getStacktable().getItems().clear();
//					stacklist.clear();
//					admin.getStacktable().refresh();
//					StackNode r = stack.first;
//					while (r != null) {
//						stacklist.add(new AdminTable(r.getName(), r.getMobile(), r.getBrand().trim(),
//								r.getCars().getModel(), r.getCars().getYear(), r.getCars().getColor(),
//								r.getCars().getPrice(), r.getDate(), r.getStatus()));
//						r = r.getNext();
//					}
//					admin.getStacktable().setItems(FXCollections.observableList(stacklist));
//					admin.getStacktable().refresh();
//					while(queueadmin.front!=w) {
//						QueueNode l=queueadmin.deQueueadmin();
//						clientqueue.enQueue(l.getName().trim(), l.getMobile().trim(), l.getCars(), l.getDate().trim(), l.getStatus().trim(), l.getBrand().trim());	
//					}
//
//					if(queueadmin.front!=queueadmin.rear) {
//					
//					while(queueadmin.front!=queueadmin.rear) {
//						queueadmin.deQueueadmin();	
//					}
//					}
//					
//				} else {
//					QueueNode h = queueadmin.deQueueadmin();
//					System.out.println("6");
//					queueadmin.enQueueadmin(h.getName(), h.getMobile(), h.getCars(), h.getDate(), h.getStatus(),
//							h.getBrand().trim());
//					clientqueue.enQueue(h.getName(), h.getMobile(), h.getCars(), h.getDate(), h.getStatus(),
//							h.getBrand().trim());
//					
//					while(queueadmin.front!=w) {
//						System.out.println("7");
//						QueueNode l=queueadmin.deQueueadmin();
//						clientqueue.enQueue(l.getName().trim(), l.getMobile().trim(), l.getCars(), l.getDate().trim(), l.getStatus().trim(), l.getBrand().trim());	
//					}
//				}
//	
//			
//			
//			while (clientqueue.front != null || clientqueue.rear != null) {
//				QueueNode z = clientqueue.deQueue();
//				queueadmin.enQueueadmin(z.getName(), z.getMobile(), z.getCars(), z.getDate(), z.getStatus(),
//						z.getBrand().trim());
//			}
//			admin.getQueuetable().getItems().clear();
//			admin.getQueuetable().refresh();
//			queuelist.clear();
//			QueueNode j = queueadmin.front;
//			do {
//				queuelist.add(new AdminTable2(j.getName(), j.getMobile(), j.getBrand().trim(),
//						j.getCars().getModel(), j.getCars().getYear(), j.getCars().getColor(),
//						j.getCars().getPrice(), j.getDate(), j.getStatus()));
//				j = j.getNext();
//			} while (j != queueadmin.front);
//			admin.getQueuetable().setItems(FXCollections.observableList(queuelist));
//			admin.getQueuetable().refresh();
//			
//			
//			admin.getUpdateTable().getItems().clear();
//			client.getCilentstable().getItems().clear();
//			elements.clear();
//			admin.getUpdateTable().refresh();
//			client.getCilentstable().refresh();
//			cur = list.firstd;
//			Node1 curent = cur.getSingle().getFirst();
//			for (int k = 1; k <= cur.getSingle().count; k++) {
//				elements.add(new CarTable(curent.getCars().getModel(), curent.getCars().getYear(),
//						curent.getCars().getColor(), curent.getCars().getPrice()));
//				current = current.getNext();
//
//			}
//			client.getCombo().setPromptText(list.firstd.getBrand());
//			client.getCilentstable().setItems(FXCollections.observableList(elements));
//			admin.getComboup().setValue(list.firstd.getBrand());
//			admin.getUpdateTable().setItems(FXCollections.observableArrayList(elements));
//			client.getCilentstable().refresh();
//			admin.getUpdateTable().refresh();
//				}
//			
//			
//
//		catch (NullPointerException w) {
//			System.out.println("  null pointer !!! you point at null ");
//		}
//			
//				
//				
//		
//		});

//		admin.getSoldbutton().setOnAction(e -> {
//			int counta = 0;
//			try {
//				QueueNode n;
//				QueueNode w ;
//				while (QueueAdmin.count >= 0) {
//					if (admin.getQueuetable().getSelectionModel().getSelectedItem().getName().trim()
//							.equals(queueadmin.front.getName().trim())) {
//						Node2 current = list.firstd;
//						for (int j = 1; j <= list.countd; j++) {
//							if (current.getBrand().trim().equalsIgnoreCase(
//									admin.getQueuetable().getSelectionModel().getSelectedItem().getBrand().trim())) {
//								break;
//							} else {
//								current = current.getNext();
//							}
//						}
//						Node1 curr = current.getSingle().first;
//						String b = admin.getQueuetable().getSelectionModel().getSelectedItem().getModel().trim();
//						String c = admin.getQueuetable().getSelectionModel().getSelectedItem().getYear().trim();
//						String d = admin.getQueuetable().getSelectionModel().getSelectedItem().getColor().trim();
//						double f = admin.getQueuetable().getSelectionModel().getSelectedItem().getPrice();
//						for (int k = 1; k <= current.getSingle().count; k++) {
//							if (curr.getCars().getModel().trim().equals(b) && curr.getCars().getYear().trim().equals(c)
//									&& curr.getCars().getColor().trim().equals(d) && curr.getCars().getPrice() == f) {
//								current.getSingle().remove(curr.getCars());
//								counta = 0;
//								break;
//							} else {
//								curr = curr.getNext();
//								counta++;
//							}
//						}
//						if (counta == 0) {
//							QueueNode a = queueadmin.deQueueadmin();
//							stack.push(a.getName(), a.getMobile(), a.getCars(), a.getMobile(), "Finished",
//									a.getBrand().trim());
//							admin.getStacktable().getItems().clear();
//							stacklist.clear();
//							admin.getStacktable().refresh();
//							StackNode r = stack.first;
//							while (r != null) {
//								stacklist.add(new AdminTable(r.getName(), r.getMobile(), r.getBrand().trim(),
//										r.getCars().getModel(), r.getCars().getYear(), r.getCars().getColor(),
//										r.getCars().getPrice(), r.getDate(), r.getStatus()));
//								r = r.getNext();
//							}
//							admin.getStacktable().setItems(FXCollections.observableList(stacklist));
//							admin.getStacktable().refresh();
//						} else {
//							QueueNode h = queueadmin.deQueueadmin();
//							queueadmin.enQueueadmin(h.getName(), h.getMobile(), h.getCars(), h.getDate(), h.getStatus(),
//									h.getBrand().trim());
//						}
//						break;
//					} else {
//						QueueNode q = queueadmin.deQueueadmin();
//						clientqueue.enQueue(q.getName(), q.getMobile(), q.getCars(), q.getDate(), q.getStatus(),
//								q.getBrand());
//						queueadmin.enQueueadmin(q.getName(), q.getMobile(), q.getCars(), q.getDate(), q.getStatus(),
//								q.getBrand());
//					}
//
//				}
////				admin.getQueuetable().getItems().clear();
////				admin.getQueuetable().refresh();
////				queuelist.clear();
////				QueueNode p = queueadmin.front;
////				do {
////					queuelist.add(new AdminTable2(p.getName(), p.getMobile(), p.getBrand().trim(),
////							p.getCars().getModel(), p.getCars().getYear(), p.getCars().getColor(),
////							p.getCars().getPrice(), p.getDate(), p.getStatus()));
////					p = p.getNext();
////				} while (p != queueadmin.front);
////				admin.getQueuetable().setItems(FXCollections.observableList(queuelist));
////				admin.getQueuetable().refresh();
//				
//
//				if (queueadmin.front == null || queueadmin.rear == null) {
//					while (clientqueue.front != null && clientqueue.rear != null) {
//						QueueNode f = clientqueue.deQueue();
//						queueadmin.enQueueadmin(f.getName(), f.getMobile(), f.getCars(), f.getDate(), f.getStatus(),
//								f.getBrand().trim());
//					}
//				} else {
//					QueueNode t = queueadmin.rear;
//					while (clientqueue.front != null && clientqueue.rear != null) {
//						QueueNode f = clientqueue.deQueue();
//						queueadmin.enQueueadmin(f.getName(), f.getMobile(), f.getCars(), f.getDate(), f.getStatus(),
//								f.getBrand().trim());
//					}
//
//					queueadmin.rear = t;
//					queueadmin.front = t.getNext();
//				}
//				admin.getQueuetable().getItems().clear();
//				admin.getQueuetable().refresh();
//				queuelist.clear();
//				QueueNode r = queueadmin.front;
//				do {
//					queuelist.add(new AdminTable2(r.getName(), r.getMobile(), r.getBrand().trim(),
//							r.getCars().getModel(), r.getCars().getYear(), r.getCars().getColor(),
//							r.getCars().getPrice(), r.getDate(), r.getStatus()));
//					r = r.getNext();
//				} while (r != queueadmin.front);
//				admin.getQueuetable().setItems(FXCollections.observableList(queuelist));
//				admin.getQueuetable().refresh();
//				admin.getUpdateTable().getItems().clear();
//				client.getCilentstable().getItems().clear();
//				elements.clear();
//				admin.getUpdateTable().refresh();
//				client.getCilentstable().refresh();
//				cur = list.firstd;
//				Node1 current = cur.getSingle().getFirst();
//				for (int k = 1; k <= cur.getSingle().count; k++) {
//					elements.add(new CarTable(current.getCars().getModel(), current.getCars().getYear(),
//							current.getCars().getColor(), current.getCars().getPrice()));
//					current = current.getNext();
//
//				}
//				client.getCombo().setPromptText(list.firstd.getBrand());
//				client.getCilentstable().setItems(FXCollections.observableList(elements));
//				admin.getComboup().setValue(list.firstd.getBrand());
//				admin.getUpdateTable().setItems(FXCollections.observableArrayList(elements));
//				client.getCilentstable().refresh();
//				admin.getUpdateTable().refresh();
//			}
//
//			catch (NullPointerException w) {
//				System.out.println("  null pointer !!! you point at null ");
//			}
//		});
		admin.getNext().setOnAction(e -> {
			try {
				if (cur == null) {
					cur = list.firstd;
					Node1 current = cur.getSingle().getFirst();
					for (int i = 1; i <= cur.getSingle().count; i++) {
						elements.add(new CarTable(current.getCars().getModel(), current.getCars().getYear(),
								current.getCars().getColor(), current.getCars().getPrice()));
						current = current.getNext();
					}
					admin.getComboup().setValue(cur.getBrand());
					admin.getUpdateTable().setItems(FXCollections.observableArrayList(elements));
					client.getCombo().setValue(cur.getBrand());
					client.getCilentstable().setItems(FXCollections.observableArrayList(elements));
				} else {
					cur = cur.getNext();
					Node1 current = cur.getSingle().getFirst();
					admin.getUpdateTable().getItems().clear();
					client.getCilentstable().getItems().clear();
					elements.clear();
					admin.getUpdateTable().refresh();
					client.getCilentstable().refresh();
					for (int i = 1; i <= cur.getSingle().count; i++) {
						elements.add(new CarTable(current.getCars().getModel(), current.getCars().getYear(),
								current.getCars().getColor(), current.getCars().getPrice()));
						current = current.getNext();
					}
					admin.getComboup().setValue(cur.getBrand());
					client.getCombo().setValue(cur.getBrand());
					admin.getUpdateTable().setItems(FXCollections.observableArrayList(elements));
					client.getCilentstable().setItems(FXCollections.observableArrayList(elements));
				}

			} catch (Exception ex) {
				System.out.print("nulllll");
			}
		});
		admin.getComboup().setOnAction(e -> {
			try {
			ArrayList<String> com = new ArrayList<>();
			for (int i = 0; i < combolist.size(); i++) {
				com.add(combolist.get(i));
			}
			for (int i = 0; i < com.size(); i++) {
				if (admin.getComboup().getValue().equals(com.get(i))) {
					cur = list.firstd;
					for (int j = 1; j < list.countd; j++) {
						if (cur.getBrand().trim()
								.equals(admin.getComboup().getSelectionModel().getSelectedItem().trim())) {
							break;
						} else {
							cur = cur.getNext();
						}
					}
				}
			}
			Node1 current = cur.getSingle().getFirst();
			admin.getUpdateTable().getItems().clear();
			client.getCilentstable().getItems().clear();
			elements.clear();
			admin.getUpdateTable().refresh();
			client.getCilentstable().refresh();
			for (int i = 1; i <= cur.getSingle().count; i++) {
				elements.add(new CarTable(current.getCars().getModel(), current.getCars().getYear(),
						current.getCars().getColor(), current.getCars().getPrice()));
				current = current.getNext();
			}
			admin.getComboup().setValue(cur.getBrand());
			client.getCombo().setValue(cur.getBrand());
			client.getCilentstable().setItems(FXCollections.observableArrayList(elements));
			admin.getUpdateTable().setItems(FXCollections.observableArrayList(elements));
			}
			catch(Exception h) {
				System.out.println(" ");
			}
		});
		admin.getPrevious().setOnAction(e -> {
			try {
				if (cur == null) {
					cur = list.last;
					Node1 current = cur.getSingle().getFirst();
					for (int i = 1; i <= cur.getSingle().count; i++) {
						elements.add(new CarTable(current.getCars().getModel(), current.getCars().getYear(),
								current.getCars().getColor(), current.getCars().getPrice()));
						current = current.getNext();
					}
					admin.getComboup().setValue(cur.getBrand());
					admin.getUpdateTable().setItems(FXCollections.observableArrayList(elements));
					client.getCombo().setValue(cur.getBrand());
					client.getCilentstable().setItems(FXCollections.observableArrayList(elements));

				} else {
					cur = cur.getPrevious();
					Node1 current = cur.getSingle().getFirst();
					admin.getUpdateTable().getItems().clear();
					client.getCilentstable().getItems().clear();
					elements.clear();
					admin.getUpdateTable().refresh();
					client.getCilentstable().refresh();
					for (int i = 1; i <= cur.getSingle().count; i++) {
						elements.add(new CarTable(current.getCars().getModel(), current.getCars().getYear(),
								current.getCars().getColor(), current.getCars().getPrice()));
						current = current.getNext();
					}
					admin.getComboup().setValue(cur.getBrand());
					admin.getUpdateTable().setItems(FXCollections.observableArrayList(elements));
					client.getCombo().setValue(cur.getBrand());
					client.getCilentstable().setItems(FXCollections.observableArrayList(elements));

				}
			} catch (Exception ex) {
				System.out.println("Null Pointer Exception");
			}
		});

		admin.getUpdatebrand().setOnAction(e -> {
			try {
				brand.getBrandtxt().setEditable(false);
				brand.getAddlabel().setVisible(false);
				brand.getAddtxt().setVisible(false);
				brand.getOkadd().setVisible(false);
				brand.getUpdatelabel().setVisible(false);
				brand.getUpdatetxt().setVisible(false);
				brand.getOkup().setVisible(false);
				brand.getBrandtxt().setText(cur.getBrand());
				stage8.setScene(scene8);
				stage8.show();
			} catch (NullPointerException w) {
				System.out.println("null pointer");
			}
		});
		brand.getUpdatebutton().setOnAction(e -> {
			brand.getBrandtxt().setEditable(false);
			brand.getUpdatelabel().setVisible(true);
			brand.getUpdatetxt().setVisible(true);
			brand.getOkup().setVisible(true);
			brand.getAddlabel().setVisible(false);
			brand.getAddtxt().setVisible(false);
			brand.getAddtxt().setText(null);
			brand.getOkadd().setVisible(false);
		});
		brand.getOkup().setOnAction(e -> {
			try {
			brand.getBrandtxt().setEditable(false);
			Node2 r = cur.getNext();
			list.Update(brand.getUpdatetxt().getText(), cur);
			cur = r;
			admin.getComboup().getItems().clear();
			combolist.clear();
			Node2 curr = list.getFirst();
			for (int i = 0; i < list.countd; i++) {
				combolist.add(curr.getBrand());
				curr = curr.getNext();
			}
			admin.getComboup().setItems(combolist);
			stage8.close();
			}
			catch(Exception j) {
				System.out.println(" ");
			}
		});
		brand.getAddbutton().setOnAction(e -> {
			brand.getBrandtxt().setEditable(false);
			brand.getAddlabel().setVisible(true);
			brand.getAddtxt().setVisible(true);
			brand.getOkadd().setVisible(true);
			brand.getOkup().setVisible(false);
			brand.getUpdatelabel().setVisible(false);
			brand.getUpdatetxt().setText(null);
			brand.getUpdatetxt().setVisible(false);
		});
		brand.getOkadd().setOnAction(e -> {
			try {
				brand.getBrandtxt().setEditable(false);
				String r = brand.getAddtxt().getText();
				list.add(r);
				admin.getComboup().getItems().clear();
				combolist.clear();
				Node2 curr = list.getFirst();
				for (int i = 0; i < list.countd; i++) {
					combolist.add(curr.getBrand());
					curr = curr.getNext();
				}
				admin.getComboup().setItems(combolist);
				client.getCombo().setItems(combolist);
				stage8.close();
			} catch (Exception w) {
System.out.println(" ");
			}

		});
		brand.getDeletebutton().setOnAction(e -> {
			brand.getBrandtxt().setEditable(false);
			stage9.setScene(scene9);
			stage9.show();
		});
		war.getYes().setOnAction(e -> {
			try {
				brand.getBrandtxt().setEditable(false);
				Node2 r = cur.getNext();
				list.remove(cur.getBrand());
				cur = r;
				stage9.close();
				stage8.close();
				admin.getComboup().getItems().clear();
				combolist.clear();
				Node2 curr = list.getFirst();
				for (int i = 0; i < list.countd; i++) {
					combolist.add(curr.getBrand());
					curr = curr.getNext();
				}
				admin.getComboup().setItems(combolist);
				client.getCombo().setItems(combolist);
			} catch (NullPointerException w) {
				System.out.println("Null Pointer Exception !!!");
			}
		});
		war.getNo().setOnAction(e -> {
			brand.getBrandtxt().setEditable(false);
			stage9.close();
			stage8.close();
		});
		admin.getUpdatecar().setOnAction(e -> {
			try {
				if (admin.getUpdateTable().getSelectionModel().getSelectedItem() == null) {
					stage11.setScene(scene11);
					stage11.show();
				} else {
					carup.getBrandtxt().setText(cur.getBrand());
					carup.getUpdatebutton().setVisible(false);
					carup.getUpdatetxt().setVisible(false);
					carup.getModel().setVisible(false);
					carup.getYear().setVisible(false);
					carup.getColor().setVisible(false);
					carup.getPrice().setVisible(false);
					carup.getModeltxt().setEditable(false);
					carup.getYeartxt().setEditable(false);
					carup.getColortxt().setEditable(false);
					carup.getPricetxt().setEditable(false);
					carup.getModeltxt()
							.setText(admin.getUpdateTable().getSelectionModel().getSelectedItem().getModel().trim());
					carup.getYeartxt()
							.setText(admin.getUpdateTable().getSelectionModel().getSelectedItem().getYear().trim());
					carup.getColortxt()
							.setText(admin.getUpdateTable().getSelectionModel().getSelectedItem().getColor().trim());
					carup.getPricetxt().setText(
							String.valueOf(admin.getUpdateTable().getSelectionModel().getSelectedItem().getPrice()));
					stage10.setScene(scene10);
					stage10.show();
				}
			} catch (NullPointerException ew) {
				System.out.println("Null Pointer!");
			}

		});

		choose.getOk().setOnAction(e -> {
			stage11.close();
		});

		carup.getUpdate().setOnAction(e -> {
			carup.getUpdatetxt().setVisible(true);
			carup.getModel().setVisible(true);
			carup.getYear().setVisible(true);
			carup.getColor().setVisible(true);
			carup.getPrice().setVisible(true);
			carup.getUpdatebutton().setVisible(true);
			String a = carup.getModeltxt().getText().trim();
			String b = carup.getYeartxt().getText().trim();
			String c = carup.getColortxt().getText().trim();
			double d = Double.parseDouble(carup.getPricetxt().getText().trim());
			Node1 g = null;
			g = list.SearchCar(cur, a, b, c, d);
			Car v = g.getCars();
			cur.getSingle().remove(g.getCars());

			carup.getUpdatebutton().setOnAction(ev -> {
				try {
					v.setModel(carup.getModeltxt().getText());
					v.setYear(carup.getYeartxt().getText());
					v.setColor(carup.getColortxt().getText());
					v.setPrice((double) (Double.parseDouble(carup.getPricetxt().getText())));
					cur.getSingle().add(v);
					stage10.close();
					admin.getUpdateTable().getItems().clear();
					client.getCilentstable().getItems().clear();
					elements.clear();
					admin.getUpdateTable().refresh();
					client.getCilentstable().refresh();
					Node1 current = cur.getSingle().getFirst();
					for (int i = 1; i <= cur.getSingle().count; i++) {
						elements.add(new CarTable(current.getCars().getModel(), current.getCars().getYear(),
								current.getCars().getColor(), current.getCars().getPrice()));
						current = current.getNext();
					}
					admin.getComboup().setValue(cur.getBrand());
					admin.getUpdateTable().setItems(FXCollections.observableArrayList(elements));
					client.getCombo().setValue(cur.getBrand());
					client.getCilentstable().setItems(FXCollections.observableArrayList(elements));

				} catch (NullPointerException ex) {
					System.out.println("null pointer");
				}

			});
		});

		carup.getModel().setOnAction(e -> {
			if (carup.getModel().isSelected() == true) {
				carup.getModeltxt().setEditable(true);
			} else {
				carup.getModeltxt().setEditable(false);
			}
		});

		carup.getYear().setOnAction(e -> {
			if (carup.getYear().isSelected() == true) {
				carup.getYeartxt().setEditable(true);
			} else {
				carup.getYeartxt().setEditable(false);
			}
		});

		carup.getColor().setOnAction(e -> {
			if (carup.getColor().isSelected() == true) {
				carup.getColortxt().setEditable(true);
			} else {
				carup.getColortxt().setEditable(false);
			}
		});

		carup.getPrice().setOnAction(e -> {
			if (carup.getPrice().isSelected() == true) {
				carup.getPricetxt().setEditable(true);
			} else {
				carup.getPricetxt().setEditable(false);
			}
		});

		carup.getAdd().setOnAction(e -> {
			try {
				carup.getModeltxt().setText(null);
				carup.getYeartxt().setText(null);
				carup.getColor().setText(null);
				carup.getPricetxt().setText(null);
				carup.getColortxt().setText(null);
				addscreen.getIns1().setText(cur.getBrand());
				stage12.setScene(scene12);
				stage12.show();
			} catch (Exception d) {
				System.out.println("");
			}

		});
		addscreen.getYes().setOnAction(e -> {
			try {
				String a = addscreen.getIns2().getText().trim();
				String b = addscreen.getIns3().getText().trim();
				String c = addscreen.getIns4().getText().trim();
				double d = (double) Double.parseDouble(addscreen.getIns5().getText().trim());

				list.add(cur.getBrand(), new Car(a, b, c, d));
				addscreen.getIns2().setText(null);
				addscreen.getIns3().setText(null);
				addscreen.getIns4().setText(null);
				addscreen.getIns5().setText(null);
				stage12.close();
				stage10.close();
				admin.getUpdateTable().getItems().clear();
				client.getCilentstable().getItems().clear();
				elements.clear();
				admin.getUpdateTable().refresh();
				client.getCilentstable().refresh();
				Node1 current = cur.getSingle().getFirst();
				for (int i = 1; i <= cur.getSingle().count; i++) {
					elements.add(new CarTable(current.getCars().getModel(), current.getCars().getYear(),
							current.getCars().getColor(), current.getCars().getPrice()));
					current = current.getNext();
				}
				admin.getComboup().setValue(cur.getBrand());
				admin.getUpdateTable().setItems(FXCollections.observableArrayList(elements));
				client.getCombo().setValue(cur.getBrand());
				client.getCilentstable().setItems(FXCollections.observableArrayList(elements));

			} catch (Exception d) {
				System.out.println("error");
			}
		});

		addscreen.getNo().setOnAction(e -> {
			stage12.close();
		});

		carup.getMainpage().setOnAction(e -> {
			stage10.close();
		});

		carup.getDelete().setOnAction(e -> {
			stage13.setScene(scene13);
			stage13.show();
		});

		carwar.getYes().setOnAction(e -> {
			try {
				String a = carup.getModeltxt().getText().trim();
				String b = carup.getYeartxt().getText().trim();
				String c = carup.getColortxt().getText().trim();
				double d = Double.parseDouble(carup.getPricetxt().getText().trim());
				Node1 g = null;
				g = list.SearchCar(cur, a, b, c, d);
				cur.getSingle().remove(g.getCars());
				client.getCilentstable().getItems().clear();
				elements.clear();
				admin.getUpdateTable().refresh();
				client.getCilentstable().refresh();
				stage13.close();
				stage10.close();
				Node1 current = cur.getSingle().getFirst();
				for (int i = 1; i <= cur.getSingle().count; i++) {
					elements.add(new CarTable(current.getCars().getModel(), current.getCars().getYear(),
							current.getCars().getColor(), current.getCars().getPrice()));
					current = current.getNext();
				}
				admin.getComboup().setValue(cur.getBrand());
				admin.getUpdateTable().setItems(FXCollections.observableArrayList(elements));
				client.getCombo().setValue(cur.getBrand());
				client.getCilentstable().setItems(FXCollections.observableArrayList(elements));

			} catch (Exception b) {
				System.out.println("null");
			}

		});
		carwar.getNo().setOnAction(e -> {
			stage13.close();
			stage10.close();
		});
		admin.getSavecar().setOnAction(e -> {
			cur = list.firstd;
			int d = list.countd;
			// Node2 current = list.last;
			PrintWriter file;
			try {
				file = new PrintWriter("C:\\Users\\Ehab\\Downloads\\cars (1).txt");
				while (d > 0) {
					file.write(cur.getSingle().printList());
					cur = cur.getNext();
					d--;
				}
//		do {
//			file.write(cur.getSingle().printList());
//			cur = cur.getNext();
//		}while (cur !=current );
				// fileout.close();
				file.close();
			} catch (IOException e1) {
				System.out.println("error");
			}

		});
		admin.getSaveorder().setOnAction(e -> {
			PrintWriter file;
			try {
				file = new PrintWriter("C:\\Users\\Ehab\\Downloads\\orders.txt");
				StackNode r = stack.first;
				while (r != null) {
					file.write(r.getName() + ", " + r.getMobile() + ", " + r.getBrand() + ", "
							+ r.getCars().PrintwithoutBrand() + ", " + r.getDate() + ", " + r.getStatus() + "\n");
					r = r.getNext();
				}
				file.append(queueadmin.PrintQueue());
				file.close();
			} catch (Exception ev) {
				System.out.println("error");
			}
		});

		brand.getMainpage1().setOnAction(e -> {
			brand.getAddbutton().setVisible(true);
			brand.getUpdatebutton().setVisible(true);
			brand.getAddlabel().setVisible(false);
			brand.getOkadd().setVisible(false);
			brand.getOkup().setVisible(false);
			brand.getAddtxt().setText(null);
			brand.getUpdatetxt().setText(null);
			brand.getUpdatetxt().setText(null);
			stage8.close();
			stage5.setScene(scene5);
			stage5.show();
		});
		admin.getSummary().setOnSelectionChanged(e -> {
			try {
			summ.clear();
			admin.getSummarytable().getItems().clear();
			double hp = 0;
			double lp = 0;
			int countc = 0;
			int pro = 0;
			double avg = 0;

			Node2 ff = list.firstd;
			// We go throw the for loop
			// The Time complexity for the the for loop is n
			// --> O(n) because we stop the loop when i is equal the count of the double
			// linked list
			for (int i = 1; i <= list.countd; i++) {
				hp = hp + ff.getSingle().getHighprice();
				lp = lp + ff.getSingle().getLowprice();
				countc = countc + ff.getSingle().getCarcount();
				avg = avg + ff.getSingle().AvgPrice();
				summ.add(new SummaryTable(ff.getBrand(), ff.getSingle().getLowmodel(), ff.getSingle().getHighmodel(),
						ff.getSingle().AvgPrice(), ff.getSingle().getLowprice(), ff.getSingle().getHighprice(),
						ff.getSingle().getCarcount()));
				ff = ff.getNext();
			}
			summ.add(new SummaryTable("Total", "------", "------", avg, lp, hp, countc));
			summ.add(new SummaryTable("Total Profit", "------", "------", 0.0, 0.0, 0.0, StackAdmin.profit));

			admin.getSummarytable().setItems(FXCollections.observableList(summ));
			admin.getSummarytable().refresh();
			}
			catch(Exception l) {
				System.out.println(" ");
			}
		});

	}

	public static void main(String[] args) {

		launch(args);
	}
}
