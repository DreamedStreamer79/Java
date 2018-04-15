package Run.Test;

import javafx.application.Application;

import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;



public class CurrencyFX extends Application {
    public Text hidden = new Text();
    public Text result = new Text();
    public Text getresult() {
        return this.result;
    }
    public Text getHidden() {
        return this.hidden;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Text greeting = new Text("Welcome to the currency converter");
        greeting.setFont(Font.font("Gill Sans Light", 60));


        BorderPane borderPane = new BorderPane();


        //Questions and Answers
        Text start_que = new Text("Select your Currency Conversion");
        start_que.setFill(Color.BLACK);
        start_que.setFont(Font.font("Optima", 40));
        Text quantity_que = new Text("How many would you like to convert? ");
        quantity_que.setFill(Color.BLACK);
        start_que.setFont(Font.font("Optima", 40));
        ChoiceBox<String> start_ans = new ChoiceBox<>();
        start_ans.getItems().addAll("US Dollars $ to Euros €", "US Dollars $ to Japanese Yens ¥",
                "US Dollars $ to The Great British Pounds £", "Euros € to US Dollars $", "Euros € to Japanese Yens ¥",
                "Euros € to The Great British Pounds £", "Japanese Yens ¥ to US Dollars $",
                "Japanese Yens ¥ to Euros €", "Japanese Yens ¥ to The Great British Pounds £", "The Great British Pounds £ to US Dollars $",
                "The Great British Pounds £ to Euros €", "The Great British Pounds £ to Japanese Yens ¥");
        start_ans.setValue("US Dollars $ to Euros €");

        TextField quantitystr = new TextField();
        Button select = new Button("Submit");
        select.setOnAction(e -> getChoice(start_ans, quantitystr)
        );


        //Putting it all together
        VBox vBox2 = new VBox(20);
        vBox2.setSpacing(8);
        vBox2.setPadding(new Insets(10));
        vBox2.getChildren().addAll(greeting, start_que, start_ans, quantity_que, quantitystr, select);


        //Image on the left

        ImageView imv = new ImageView();
        Image image2 = new Image(Main.class.getResourceAsStream("icon.png"));
        imv.setImage(image2);
        imv.setFitHeight(250);
        imv.setFitWidth(300);
        ImageView imv1 = new ImageView();
        Image image3 = new Image(Main.class.getResourceAsStream("1.jpg"));
        imv1.setImage(image3);
        imv1.setFitHeight(250);
        imv1.setFitWidth(300);

        ImageView imv2 = new ImageView();
        Image image4 = new Image(Main.class.getResourceAsStream("2.jpg"));
        imv2.setImage(image4);
        imv2.setFitHeight(250);
        imv2.setFitWidth(300);

        ImageView imv3 = new ImageView();
        Image image5 = new Image(Main.class.getResourceAsStream("3.jpg"));
        imv3.setImage(image5);
        imv3.setFitHeight(250);
        imv3.setFitWidth(300);



        HBox imgs = new HBox();
        imgs.getChildren().addAll(imv, imv1, imv2, imv3);


        //Hidden Text and result

        result.setFont(Font.font("Gill Sans Light", 20));
        hidden.setFont(Font.font("Helvetica Neue Light", 30));
        result.setTextAlignment(TextAlignment.CENTER);
        hidden.setTextAlignment(TextAlignment.CENTER);
        result.setFill(Color.BLACK);
        hidden.setFill(Color.BLACK);
        VBox hiddenresult = new VBox();
        hiddenresult.getChildren().addAll(result, hidden);

        //Deciding Alignments in BorderPane
        Stage window = new Stage();
        window = primaryStage;

        borderPane.setTop(imgs);
        borderPane.setCenter(vBox2);
        borderPane.setBottom(hiddenresult);


        //Running Scene and Window
        Scene scene1 = new Scene(borderPane, 320, 568);
        window.setScene(scene1);
        window.setTitle("Currency Converter");
        window.show();
        window.setResizable(true);
        window.setFullScreen(true);
        window.setMinHeight(700);
        window.setMinWidth(800);
        BackgroundImage myBI= new BackgroundImage(new Image("https://i0.wp.com/ficedu.org/wp-content/uploads/2016/07/Savin-NY-Website-Background-Web.jpg"),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background myB = new Background(myBI);
        borderPane.setBackground(myB);



    }

    private void getChoice(ChoiceBox<String> start_ans, TextField quantitystr) {
        String decision = start_ans.getValue();
        String startCurrency;
        String endCurrency;
        String string = quantitystr.getText();
        int quantity = Integer.parseInt(string);

        if (decision == "US Dollars $ to Euros €") {
            startCurrency = "US Dollars";
            endCurrency = "Euros";
            double multiplier = 0.81;
            double resultado = multiplier*quantity;
            String finale = Double.toString(resultado);
            Text resulter = getresult();
            Text hiddentext = getHidden();
            hiddentext.setText(finale+ " " + endCurrency);
            resulter.setText("You converted " + startCurrency + " to " + endCurrency + " and your total was:   ");
        } else if (decision == "US Dollars $ to Japanese Yens ¥") {
            startCurrency = "US Dollars";
            endCurrency = "Yens";
            double multiplier = 106.7;
            double resultado = multiplier*quantity;
            String finale = Double.toString(resultado);
            Text hiddentext = getHidden();
            hiddentext.setText(finale+" "+endCurrency);
            Text resulter = getresult();
            resulter.setText("You converted " + startCurrency + " to " + endCurrency + " and your total was:   ");
        } else if (decision == "US Dollars $ to The Great British Pounds £") {
            startCurrency = "US Dollars";
            endCurrency = "Pounds";
            double multiplier = 0.71;
            double resultado = multiplier*quantity;
            String finale = Double.toString(resultado);
            Text hiddentext = getHidden();
            hiddentext.setText(finale+" "+endCurrency);
            Text resulter = getresult();
            resulter.setText("You converted " + startCurrency + " to " + endCurrency + " and your total was:   ");

        } else if (decision == "Euros € to US Dollars $") {
            startCurrency = "Euros";
            endCurrency = "US Dollars";
            double multiplier = 1.2;
            double resultado = multiplier*quantity;
            String finale = Double.toString(resultado);
            Text hiddentext = getHidden();
            hiddentext.setText(finale+" "+endCurrency);
            Text resulter = getresult();
            resulter.setText("You converted " + startCurrency + " to " + endCurrency + " and your total was:   ");

        } else if (decision == "Euros € to Japanese Yens ¥") {
            startCurrency = "Euros";
            endCurrency = "Yens";
            double multiplier = 131;
            double resultado = multiplier*quantity;
            String finale = Double.toString(resultado);
            Text hiddentext = getHidden();
            hiddentext.setText(finale+" "+endCurrency);
            Text resulter = getresult();
            resulter.setText("You converted " + startCurrency + " to " + endCurrency + " and your total was:   ");

        } else if (decision == "Euros € to The Great British Pounds £") {
            startCurrency = "Euros";
            endCurrency = "Pounds";
            double multiplier = 0.87;
            double resultado = multiplier*quantity;
            String finale = Double.toString(resultado);
            Text hiddentext = getHidden();
            hiddentext.setText(finale+" "+endCurrency);
            Text resulter = getresult();
            resulter.setText("You converted " + startCurrency + " to " + endCurrency + " and your total was:   ");

        } else if (decision == "Japanese Yens ¥ to US Dollars $") {
            startCurrency = "Yens";
            endCurrency = "US Dollars";
            double multiplier = 0.00936;
            double resultado = multiplier*quantity;
            String finale = Double.toString(resultado);
            Text hiddentext = getHidden();
            hiddentext.setText(finale +  " " +endCurrency);
            Text resulter = getresult();
            resulter.setText("You converted " + startCurrency + " to " + endCurrency + " and your total was:   ");

        } else if (decision == "Japanese Yens ¥ to Euros €") {
            startCurrency = "Yens";
            endCurrency = "Euros";
            double multiplier = 0.00762;
            double resultado = multiplier*quantity;
            String finale = Double.toString(resultado);
            Text hiddentext = getHidden();
            hiddentext.setText(finale + " "+endCurrency);
            Text resulter = getresult();
            resulter.setText("You converted " + startCurrency + " to " + endCurrency + " and your total was:   ");
        } else if (decision == "Japanese Yens ¥ to The Great British Pounds £") {
            startCurrency = "Yens";
            endCurrency = "Pounds";
            double multiplier = 0.00665;
            double resultado = multiplier*quantity;
            String finale = Double.toString(resultado);
            Text hiddentext = getHidden();
            hiddentext.setText(finale +" "+endCurrency);
            Text resulter = getresult();
            resulter.setText("You converted " + startCurrency + " to " + endCurrency + " and your total was:   ");
        } else if (decision == "The Great British Pounds £ to US Dollars $") {
            startCurrency = "Yens";
            endCurrency = "US Dollars";
            double multiplier = 1.4;
            double resultado = multiplier*quantity;
            String finale = Double.toString(resultado);
            Text hiddentext = getHidden();
            hiddentext.setText(finale + " " +endCurrency);
            Text resulter = getresult();
            resulter.setText("You converted " + startCurrency + " to " + endCurrency + " and your total was:   ");
        } else if (decision == "The Great British Pounds £ to Euros €") {
            startCurrency = "Yens";
            endCurrency = "Euros";
            double multiplier = 1.14;
            double resultado = multiplier*quantity;
            String finale = Double.toString(resultado);
            Text hiddentext = getHidden();
            hiddentext.setText(finale + " "+ endCurrency);
            Text resulter = getresult();
            resulter.setText("You converted " + startCurrency + " to " + endCurrency + " and your total was:   ");
        } else if (decision == "The Great British Pounds £ to Japanese Yens ¥") {
            startCurrency = "Yens";
            endCurrency = "Yens";
            double multiplier = 150.35;
            double resultado = multiplier*quantity;
            String finale = Double.toString(resultado);
            Text hiddentext = getHidden();
            hiddentext.setText(finale +" "+endCurrency);
            Text resulter = getresult();
            resulter.setText("You converted " + startCurrency + " to " + endCurrency + " and your total was:   ");
        }


    }
}






















