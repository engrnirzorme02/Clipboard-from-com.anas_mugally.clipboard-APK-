package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.U */
/* JADX INFO: loaded from: classes.dex */
final class C2496U {

    /* JADX INFO: renamed from: c */
    private static final C2496U f9471c = new C2496U();

    /* JADX INFO: renamed from: d */
    static boolean f9472d = false;

    /* JADX INFO: renamed from: b */
    private final ConcurrentMap f9474b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    private final InterfaceC2501Z f9473a = new C2478B();

    private C2496U() {
    }

    /* JADX INFO: renamed from: a */
    public static C2496U m10984a() {
        return f9471c;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC2500Y m10985b(Class cls, InterfaceC2500Y interfaceC2500Y) {
        AbstractC2534u.m11638b(cls, "messageType");
        AbstractC2534u.m11638b(interfaceC2500Y, "schema");
        return (InterfaceC2500Y) this.f9474b.putIfAbsent(cls, interfaceC2500Y);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC2500Y m10986c(Class cls) {
        InterfaceC2500Y interfaceC2500YM10985b;
        AbstractC2534u.m11638b(cls, "messageType");
        InterfaceC2500Y interfaceC2500YMo10861a = (InterfaceC2500Y) this.f9474b.get(cls);
        return (interfaceC2500YMo10861a != null || (interfaceC2500YM10985b = m10985b(cls, (interfaceC2500YMo10861a = this.f9473a.mo10861a(cls)))) == null) ? interfaceC2500YMo10861a : interfaceC2500YM10985b;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC2500Y m10987d(Object obj) {
        return m10986c(obj.getClass());
    }
}
