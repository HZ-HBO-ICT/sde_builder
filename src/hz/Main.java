
public class Main {

    public static void main(String[] args) {

        //
        ConsoleWriter writer = new ConsoleWriter();

        // Let's construct an email
        EmailBuilder builder = new EmailBuilder();
        builder.addressAMadam("Els");
        builder.talkAboutMe("<Set-Name>", "<Set-University>");
        builder.showInterest("<Set-Company>");
        builder.tellHowToContactMe();
        builder.sayThanks();

        String email = builder.getEmail();

        writer.writeLine(email);
    }
}
