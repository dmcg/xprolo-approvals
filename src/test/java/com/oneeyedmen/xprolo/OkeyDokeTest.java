package com.oneeyedmen.xprolo;

import com.oneeyedmen.fakir.Faker;
import com.oneeyedmen.okeydoke.junit.ApprovalsRule;
import org.junit.Rule;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import static com.oneeyedmen.fakir.Faker.fakeA;
import static com.oneeyedmen.xprolo.Domain.*;
import static com.oneeyedmen.xprolo.JsonOrderRendererTest.*;

public class OkeyDokeTest {
    @Rule
    public ApprovalsRule approver = ApprovalsRule.fileSystemRule("src/test/java");

    @Test
    public void test() throws IOException {
        OutputStream os = new ByteArrayOutputStream();
        new JsonOrderRenderer().render(os, fakeA(Order.class));
        approver.assertApproved(os.toString());
    }
}
