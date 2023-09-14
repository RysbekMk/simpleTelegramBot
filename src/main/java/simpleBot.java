import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class simpleBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {

        //     System.out.println(update.getMessage().getText());
        //     System.out.println(update.getMessage().getFrom().getFirstName());

        String command = update.getMessage().getText();

        if (command.equals("/run")) {
            String message = "Assaloomu aleikum!";
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try {
                execute(response);
            } catch (TelegramApiException E) {
                System.out.println(E.getMessage());
            }
        }
        if  (command.equals("/can")) {
            String message = "what?";
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try {
                execute(response);
            }  catch (TelegramApiException R) {
                System.out.println(R.getMessage());
            }
            }
        }

    @Override
    public String getBotUsername() {
        // TODO
        return "RKMA98SimpleBot";
    }

    @Override
    public String getBotToken() {
        // TODO
        return "6058357084:AAGVGuEtJOxZjNMuUN_dJT848wE-vE5y4ok";
    }

}
