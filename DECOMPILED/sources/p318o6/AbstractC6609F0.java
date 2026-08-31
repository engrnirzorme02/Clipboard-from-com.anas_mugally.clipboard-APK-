package p318o6;

import p360t6.C7104D;

/* JADX INFO: renamed from: o6.F0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6609F0 {

    /* JADX INFO: renamed from: a */
    private static final C7104D f24897a = new C7104D("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b */
    public static final C7104D f24898b = new C7104D("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c */
    private static final C7104D f24899c = new C7104D("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d */
    private static final C7104D f24900d = new C7104D("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e */
    private static final C7104D f24901e = new C7104D("SEALED");

    /* JADX INFO: renamed from: f */
    private static final C6667h0 f24902f = new C6667h0(false);

    /* JADX INFO: renamed from: g */
    private static final C6667h0 f24903g = new C6667h0(true);

    /* JADX INFO: renamed from: g */
    public static final Object m28071g(Object obj) {
        return obj instanceof InterfaceC6693u0 ? new C6695v0((InterfaceC6693u0) obj) : obj;
    }

    /* JADX INFO: renamed from: h */
    public static final Object m28072h(Object obj) {
        InterfaceC6693u0 interfaceC6693u0;
        C6695v0 c6695v0 = obj instanceof C6695v0 ? (C6695v0) obj : null;
        return (c6695v0 == null || (interfaceC6693u0 = c6695v0.f24995a) == null) ? obj : interfaceC6693u0;
    }
}
