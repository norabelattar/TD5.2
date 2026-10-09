package ocp;

public class ReportSenderFactory {
    public ReportSender creat() {
        return new EmailReportSender();
    }
}
