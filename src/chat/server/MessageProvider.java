package chat.server;

import chat.server.client.Message;

import java.io.IOException;

public interface MessageProvider {
    void sendMessage(Message message) throws IOException;

    Message readMessage() throws IOException;
}
