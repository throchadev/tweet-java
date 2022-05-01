import twitter4j.*;

public class App {

    public static void main(String[] args) throws TwitterException {

        Twitter twitter = TwitterFactory.getSingleton();
        Status status = twitter.updateStatus("Hello");
        System.out.println("Successfully updated the status to [" + status.getText() + "].");

    }
}
