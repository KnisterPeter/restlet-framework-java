package org.restlet.example.book.restlet.ch04.sec3.server;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

/**
 * The reusable mail server application.
 */
public class MailServerApplication extends Application {

    /** List of accounts stored in memory. */
    private static final List<String> accounts = new CopyOnWriteArrayList<String>();

    /**
     * Returns the list of accounts stored in memory.
     * 
     * @return The list of accounts.
     */
    public static List<String> getAccounts() {
        return accounts;
    }

    /**
     * Constructor.
     */
    public MailServerApplication() {
        setName("RESTful Mail Server application");
        setDescription("Example application for 'Restlet in Action' book");
        setOwner("Noelios Technologies");
        setAuthor("The Restlet Team");
    }

    /**
     * Creates a root Router to dispatch call to server resources.
     */
    @Override
    public Restlet createInboundRoot() {
        Router router = new Router(getContext());
        router.attach("/", RootServerResource.class);
        router.attach("/accounts/", AccountsServerResource.class);
        router.attach("/accounts/{accountId}", AccountServerResource.class);
        return router;
    }
}
