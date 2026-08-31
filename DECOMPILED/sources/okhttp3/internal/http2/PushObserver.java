package okhttp3.internal.http2;

import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p072I6.InterfaceC0650g;

/* JADX INFO: loaded from: classes.dex */
public interface PushObserver {

    /* JADX INFO: renamed from: a */
    public static final Companion f25968a = Companion.f25970a;

    /* JADX INFO: renamed from: b */
    public static final PushObserver f25969b = new Companion.PushObserverCancel();

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f25970a = new Companion();

        private static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            /* JADX INFO: renamed from: a */
            public boolean mo29322a(int i7, InterfaceC0650g source, int i8, boolean z7) {
                AbstractC6118n.m27187e(source, "source");
                source.mo3052l(i8);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            /* JADX INFO: renamed from: b */
            public boolean mo29323b(int i7, List requestHeaders) {
                AbstractC6118n.m27187e(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            /* JADX INFO: renamed from: c */
            public boolean mo29324c(int i7, List responseHeaders, boolean z7) {
                AbstractC6118n.m27187e(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            /* JADX INFO: renamed from: d */
            public void mo29325d(int i7, ErrorCode errorCode) {
                AbstractC6118n.m27187e(errorCode, "errorCode");
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo29322a(int i7, InterfaceC0650g interfaceC0650g, int i8, boolean z7);

    /* JADX INFO: renamed from: b */
    boolean mo29323b(int i7, List list);

    /* JADX INFO: renamed from: c */
    boolean mo29324c(int i7, List list, boolean z7);

    /* JADX INFO: renamed from: d */
    void mo29325d(int i7, ErrorCode errorCode);
}
