package com.mt.chatbot.views.chat;

import com.mt.chatbot.views.MainLayout;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.RouteAlias;

@Route(value = "chat", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@PageTitle("Chat")
public class ChatView extends Div {

    public ChatView() {
        addClassName("chat-view");
        add(new Text("Content placeholder"));
    }

}
