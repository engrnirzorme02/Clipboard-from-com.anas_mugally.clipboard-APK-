package p105N0;

import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import p088K6.AbstractC0764a;
import p098M0.AbstractC0871a;

/* JADX INFO: renamed from: N0.h */
/* JADX INFO: loaded from: classes.dex */
public class C0920h extends AbstractC0871a {

    /* JADX INFO: renamed from: a */
    private final JsReplyProxyBoundaryInterface f3557a;

    public C0920h(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f3557a = jsReplyProxyBoundaryInterface;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m4153a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        return new C0920h(jsReplyProxyBoundaryInterface);
    }

    /* JADX INFO: renamed from: b */
    public static C0920h m4154b(InvocationHandler invocationHandler) {
        final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) AbstractC0764a.m3594a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (C0920h) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable() { // from class: N0.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0920h.m4153a(jsReplyProxyBoundaryInterface);
            }
        });
    }
}
