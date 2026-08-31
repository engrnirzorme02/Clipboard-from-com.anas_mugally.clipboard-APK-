package okhttp3;

import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.authenticator.JavaNetAuthenticator;

/* JADX INFO: loaded from: classes.dex */
public interface Authenticator {

    /* JADX INFO: renamed from: a */
    public static final Companion f25013a = Companion.f25016a;

    /* JADX INFO: renamed from: b */
    public static final Authenticator f25014b = new Companion.AuthenticatorNone();

    /* JADX INFO: renamed from: c */
    public static final Authenticator f25015c = new JavaNetAuthenticator(null, 1, null);

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f25016a = new Companion();

        private static final class AuthenticatorNone implements Authenticator {
            @Override // okhttp3.Authenticator
            /* JADX INFO: renamed from: a */
            public Request mo28312a(Route route, Response response) {
                AbstractC6118n.m27187e(response, "response");
                return null;
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    Request mo28312a(Route route, Response response);
}
