public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a circle with radius 50, initially filled white with a black stroke
        Circle circle = new Circle(50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        // When mouse is pressed on the circle, fill it black
        circle.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> circle.setFill(Color.BLACK));

        // When mouse is released on the circle, fill it white
        circle.addEventHandler(MouseEvent.MOUSE_RELEASED, e -> circle.setFill(Color.WHITE));

        // Place circle in a pane
        StackPane root = new StackPane(circle);
        root.setStyle("-fx-background-color: lightgray;");  // optional background

        // Create and show the scene
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setTitle("Change Color on Mouse Press/Release");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    