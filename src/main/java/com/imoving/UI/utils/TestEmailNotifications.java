package com.imoving.UI.utils;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.SearchCriteria;

import java.io.IOException;

public class TestEmailNotifications {
    public static void main(String[] args) throws MailosaurException, IOException {
        String apiKey = "bY2whKloCiN6EbkG";
        String serverId = "ehepg2r9";
        String serverDomain = "ehepg2r9.mailosaur.net";

        MailosaurClient mailosaur = new MailosaurClient(apiKey);

        SearchCriteria criteria = new SearchCriteria();
        criteria.withSentFrom("jusik200@gmail.com");
        criteria.withSubject("Amazon link");

        Message message = mailosaur.messages().get(serverId, criteria);
        System.out.println(message.html().links().get(0).href());
        String link = message.html().links().get(0).href();


    }
}
