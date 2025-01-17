package application;
import javafx.application.Application;
        import javafx.stage.Stage;
        import javafx.scene.Scene;
        import javafx.geometry.Pos;
        import javafx.scene.control.Button;
        import javafx.scene.layout.HBox;
        import javafx.scene.layout.Pane;
        import javafx.scene.layout.BorderPane;
        import javafx.scene.text.Text;
        import javafx.scene.control.RadioButton;
        import javafx.scene.control.ToggleGroup;
        import javafx.scene.paint.Color;
public class HelloWorld extends Application
{
    protected Text text = new Text(50, 50, "Hello I am  Mukhi Rahil");
    @Override
    public void start(Stage primaryStage) {
        HBox paneForButtons = new HBox(40);
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");
        paneForButtons.getChildren().addAll(btLeft, btRight);
        paneForButtons.setAlignment(Pos.CENTER);
        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);
        HBox paneForRadioButtons = new HBox(20);
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbYellow = new RadioButton("Blue");
        RadioButton rbBlack = new RadioButton("Black");
        RadioButton rbOrange = new RadioButton("Orange");
        RadioButton rbGreen = new RadioButton("Green");
        paneForRadioButtons.getChildren().addAll(rbRed, rbYellow,
                rbBlack, rbOrange, rbGreen);
        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbYellow.setToggleGroup(group);
        rbBlack.setToggleGroup(group);
        rbOrange.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        Pane paneForText = new Pane();
        paneForText.setStyle("-fx-border-color: red");
        paneForText.getChildren().add(text);
        pane.setCenter(paneForText);
        pane.setTop(paneForRadioButtons);
        btLeft.setOnAction(e -> text.setX(text.getX() - 10));
        btRight.setOnAction(e -> text.setX(text.getX() + 10));
        rbRed.setOnAction(e -> {
            if (rbRed.isSelected()) {
                text.setFill(Color.RED);
            }
        });
        rbYellow.setOnAction(e -> {
            if (rbYellow.isSelected()) {
                text.setFill(Color.BLUE);
            }
        });
        rbBlack.setOnAction(e -> {
            if (rbBlack.isSelected()) {
                text.setFill(Color.BLACK);
            }
        });
        rbOrange.setOnAction(e -> {
            if (rbOrange.isSelected()) {
                text.setFill(Color.ORANGE);
            }
        });
        rbGreen.setOnAction(e -> {
            if (rbGreen.isSelected()) {
                text.setFill(Color.GREEN);
            }
        });
        Scene scene = new Scene(pane, 450, 150);
        primaryStage.setTitle("Mukhi Rahil");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
