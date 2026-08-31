package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1423a;

/* JADX INFO: loaded from: classes.dex */
public final class RouteException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private final IOException f25705a;

    /* JADX INFO: renamed from: b */
    private IOException f25706b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException firstConnectException) {
        super(firstConnectException);
        AbstractC6118n.m27187e(firstConnectException, "firstConnectException");
        this.f25705a = firstConnectException;
        this.f25706b = firstConnectException;
    }

    /* JADX INFO: renamed from: a */
    public final void m29029a(IOException e7) {
        AbstractC6118n.m27187e(e7, "e");
        AbstractC1423a.m6060a(this.f25705a, e7);
        this.f25706b = e7;
    }

    /* JADX INFO: renamed from: b */
    public final IOException m29030b() {
        return this.f25705a;
    }

    /* JADX INFO: renamed from: c */
    public final IOException m29031c() {
        return this.f25706b;
    }
}
