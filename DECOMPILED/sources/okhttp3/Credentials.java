package okhttp3;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC6118n;
import p072I6.C0651h;

/* JADX INFO: loaded from: classes.dex */
public final class Credentials {

    /* JADX INFO: renamed from: a */
    public static final Credentials f25247a = new Credentials();

    private Credentials() {
    }

    /* JADX INFO: renamed from: a */
    public static final String m28424a(String username, String password, Charset charset) {
        AbstractC6118n.m27187e(username, "username");
        AbstractC6118n.m27187e(password, "password");
        AbstractC6118n.m27187e(charset, "charset");
        return "Basic " + C0651h.f2562d.m3113c(username + ':' + password, charset).mo3096c();
    }
}
