package p301m5;

import android.util.Log;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p198a2.AbstractC2188d;
import p198a2.C2187c;
import p198a2.InterfaceC2192h;
import p198a2.InterfaceC2194j;
import p211b5.InterfaceC2972b;
import p302m6.C6402d;

/* JADX INFO: renamed from: m5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6379g implements InterfaceC6380h {

    /* JADX INFO: renamed from: b */
    public static final a f24385b = new a(null);

    /* JADX INFO: renamed from: a */
    private final InterfaceC2972b f24386a;

    /* JADX INFO: renamed from: m5.g$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    public C6379g(InterfaceC2972b transportFactoryProvider) {
        AbstractC6118n.m27187e(transportFactoryProvider, "transportFactoryProvider");
        this.f24386a = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final byte[] m27494c(C6355I c6355i) {
        String strMo3507b = C6356J.f24229a.m27405c().mo3507b(c6355i);
        AbstractC6118n.m27186d(strMo3507b, "encode(...)");
        Log.d("FirebaseSessions", "Session Event Type: " + c6355i.m27400b().name());
        byte[] bytes = strMo3507b.getBytes(C6402d.f24428b);
        AbstractC6118n.m27186d(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // p301m5.InterfaceC6380h
    /* JADX INFO: renamed from: a */
    public void mo27495a(C6355I sessionEvent) {
        AbstractC6118n.m27187e(sessionEvent, "sessionEvent");
        ((InterfaceC2194j) this.f24386a.get()).mo8933a("FIREBASE_APPQUALITY_SESSION", C6355I.class, C2187c.m8925b("json"), new InterfaceC2192h() { // from class: m5.f
            @Override // p198a2.InterfaceC2192h
            public final Object apply(Object obj) {
                return this.f24384a.m27494c((C6355I) obj);
            }
        }).mo8932b(AbstractC2188d.m8927f(sessionEvent));
    }
}
