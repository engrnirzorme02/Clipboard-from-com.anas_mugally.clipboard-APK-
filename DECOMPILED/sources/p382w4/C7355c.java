package p382w4;

import p030D4.C0198b;
import p374v4.C7236a;
import p374v4.C7245j;

/* JADX INFO: renamed from: w4.c */
/* JADX INFO: loaded from: classes.dex */
public class C7355c extends AbstractC7356d {

    /* JADX INFO: renamed from: d */
    private final C7236a f29304d;

    public C7355c(C7357e c7357e, C7245j c7245j, C7236a c7236a) {
        super(AbstractC7356d.a.Merge, c7357e, c7245j);
        this.f29304d = c7236a;
    }

    @Override // p382w4.AbstractC7356d
    /* JADX INFO: renamed from: d */
    public AbstractC7356d mo32379d(C0198b c0198b) {
        if (!this.f29307c.isEmpty()) {
            if (this.f29307c.m32004z().equals(c0198b)) {
                return new C7355c(this.f29306b, this.f29307c.m31996C(), this.f29304d);
            }
            return null;
        }
        C7236a c7236aM31938k = this.f29304d.m31938k(new C7245j(c0198b));
        if (c7236aM31938k.isEmpty()) {
            return null;
        }
        return c7236aM31938k.m31933A() != null ? new C7358f(this.f29306b, C7245j.m31994y(), c7236aM31938k.m31933A()) : new C7355c(this.f29306b, C7245j.m31994y(), c7236aM31938k);
    }

    /* JADX INFO: renamed from: e */
    public C7236a m32382e() {
        return this.f29304d;
    }

    public String toString() {
        return String.format("Merge { path=%s, source=%s, children=%s }", m32383a(), m32384b(), this.f29304d);
    }
}
