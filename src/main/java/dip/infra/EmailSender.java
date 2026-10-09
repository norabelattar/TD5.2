package dip.infra;

import dip.application.Notifier;

public class EmailSender implements Notifier {
    public void notify(String message) {
        // sends an email with message to application admin
    }
}
