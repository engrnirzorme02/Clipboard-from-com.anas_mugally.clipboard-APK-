package p382w4;

import p030D4.C0198b;
import p030D4.InterfaceC0210n;
import p374v4.C7245j;

/* JADX INFO: renamed from: w4.f */
/* JADX INFO: loaded from: classes.dex */
public class C7358f extends AbstractC7356d {

    /* JADX INFO: renamed from: d */
    private final InterfaceC0210n f29321d;

    public C7358f(C7357e c7357e, C7245j c7245j, InterfaceC0210n interfaceC0210n) {
        super(AbstractC7356d.a.Overwrite, c7357e, c7245j);
        this.f29321d = interfaceC0210n;
    }

    @Override // p382w4.AbstractC7356d
    /* JADX INFO: renamed from: d */
    public AbstractC7356d mo32379d(C0198b c0198b) {
        return this.f29307c.isEmpty() ? new C7358f(this.f29306b, C7245j.m31994y(), this.f29321d.mo1008l(c0198b)) : new C7358f(this.f29306b, this.f29307c.m31996C(), this.f29321d);
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC0210n m32393e() {
        return this.f29321d;
    }

    public String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", m32383a(), m32384b(), this.f29321d);
    }
}
