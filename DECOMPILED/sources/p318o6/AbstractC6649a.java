package p318o6;

import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p238e6.InterfaceC5371p;

/* JADX INFO: renamed from: o6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6649a extends C6607E0 implements InterfaceC6701y0, InterfaceC1875e, InterfaceC6624N {

    /* JADX INFO: renamed from: c */
    private final InterfaceC1879i f24934c;

    public AbstractC6649a(InterfaceC1879i interfaceC1879i, boolean z7, boolean z8) {
        super(z8);
        if (z7) {
            m28029Y((InterfaceC6701y0) interfaceC1879i.get(InterfaceC6701y0.f24999p));
        }
        this.f24934c = interfaceC1879i.plus(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p318o6.C6607E0
    /* JADX INFO: renamed from: D */
    public String mo28020D() {
        return AbstractC6633S.m28108a(this) + " was cancelled";
    }

    /* JADX INFO: renamed from: I0 */
    protected void mo28142I0(Object obj) {
        mo28038u(obj);
    }

    /* JADX INFO: renamed from: J0 */
    protected void mo28146J0(Throwable th, boolean z7) {
    }

    /* JADX INFO: renamed from: L0 */
    protected void mo28147L0(Object obj) {
    }

    /* JADX INFO: renamed from: M0 */
    public final void m28148M0(EnumC6628P enumC6628P, Object obj, InterfaceC5371p interfaceC5371p) {
        enumC6628P.m28106d(interfaceC5371p, obj, this);
    }

    @Override // p318o6.InterfaceC6624N
    /* JADX INFO: renamed from: Q */
    public InterfaceC1879i mo12635Q() {
        return this.f24934c;
    }

    @Override // p318o6.C6607E0
    /* JADX INFO: renamed from: X */
    public final void mo28028X(Throwable th) {
        AbstractC6622M.m28096a(this.f24934c, th);
    }

    @Override // p173W5.InterfaceC1875e
    public final InterfaceC1879i getContext() {
        return this.f24934c;
    }

    @Override // p318o6.C6607E0
    /* JADX INFO: renamed from: h0 */
    public String mo28034h0() {
        String strM28079g = AbstractC6614I.m28079g(this.f24934c);
        if (strM28079g == null) {
            return super.mo28034h0();
        }
        return '\"' + strM28079g + "\":" + super.mo28034h0();
    }

    @Override // p318o6.C6607E0, p318o6.InterfaceC6701y0
    public boolean isActive() {
        return super.isActive();
    }

    @Override // p318o6.C6607E0
    /* JADX INFO: renamed from: q0 */
    protected final void mo28036q0(Object obj) {
        if (!(obj instanceof C6602C)) {
            mo28147L0(obj);
        } else {
            C6602C c6602c = (C6602C) obj;
            mo28146J0(c6602c.f24874a, c6602c.m27957a());
        }
    }

    @Override // p173W5.InterfaceC1875e
    public final void resumeWith(Object obj) {
        Object objM28033g0 = m28033g0(AbstractC6606E.m27978b(obj));
        if (objM28033g0 == AbstractC6609F0.f24898b) {
            return;
        }
        mo28142I0(objM28033g0);
    }
}
