package io.liftbridge;

import org.junit.Before;
import org.junit.After;
import org.junit.Ignore;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

@Ignore
public class BaseAPIClientTest {

    private static final String SERVER_ADDRESS = "localhost";
    private static final Integer SERVER_PORT = 9292;

    String streamName;
    ManagedAPIClient client;

    @Before
    public void setupStreamName() {
        this.streamName = randomAlphabetic(10);
    }

    @Before
    public void setupClient() {
        ManagedAPIClient.Builder builder = ManagedAPIClient.Builder.create(SERVER_ADDRESS + ":" + SERVER_PORT);
        this.client = builder.build();
    }

    @After
    public void tearDownClient() {
        this.client.close();
        this.client = null;
    }
}
