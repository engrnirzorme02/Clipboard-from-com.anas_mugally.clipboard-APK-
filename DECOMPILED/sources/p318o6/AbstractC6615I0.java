package p318o6;

import p360t6.AbstractC7128l;

/* JADX INFO: renamed from: o6.I0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6615I0 extends AbstractC6618K {
    @Override // p318o6.AbstractC6618K
    /* JADX INFO: renamed from: S0 */
    public AbstractC6618K mo28086S0(int i7, String str) {
        AbstractC7128l.m31467a(i7);
        return AbstractC7128l.m31468b(this, str);
    }

    /* JADX INFO: renamed from: U0 */
    public abstract AbstractC6615I0 mo28087U0();

    /* JADX INFO: renamed from: V0 */
    protected final String m28088V0() {
        AbstractC6615I0 abstractC6615I0Mo28087U0;
        AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
        if (this == abstractC6615I0M28164c) {
            return "Dispatchers.Main";
        }
        try {
            abstractC6615I0Mo28087U0 = abstractC6615I0M28164c.mo28087U0();
        } catch (UnsupportedOperationException unused) {
            abstractC6615I0Mo28087U0 = null;
        }
        if (this == abstractC6615I0Mo28087U0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
