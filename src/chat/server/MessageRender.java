package chat.server;

import chat.server.client.Message;

public interface MessageRender {
    void renderMessage(Message message);
}
