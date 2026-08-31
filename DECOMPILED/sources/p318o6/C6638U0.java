package p318o6;

import p360t6.AbstractC7112L;
import p360t6.C7104D;

/* JADX INFO: renamed from: o6.U0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6638U0 {

    /* JADX INFO: renamed from: a */
    public static final C6638U0 f24927a = new C6638U0();

    /* JADX INFO: renamed from: b */
    private static final ThreadLocal f24928b = AbstractC7112L.m31411a(new C7104D("ThreadLocalEventLoop"));

    private C6638U0() {
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC6669i0 m28127a() {
        return (AbstractC6669i0) f24928b.get();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC6669i0 m28128b() {
        ThreadLocal threadLocal = f24928b;
        AbstractC6669i0 abstractC6669i0 = (AbstractC6669i0) threadLocal.get();
        if (abstractC6669i0 != null) {
            return abstractC6669i0;
        }
        AbstractC6669i0 abstractC6669i0M28230a = AbstractC6675l0.m28230a();
        threadLocal.set(abstractC6669i0M28230a);
        return abstractC6669i0M28230a;
    }

    /* JADX INFO: renamed from: c */
    public final void m28129c() {
        f24928b.set(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m28130d(AbstractC6669i0 abstractC6669i0) {
        f24928b.set(abstractC6669i0);
    }
}
