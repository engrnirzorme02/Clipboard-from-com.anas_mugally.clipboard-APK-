package p382w4;

import p030D4.C0198b;
import p374v4.C7245j;
import p398y4.AbstractC7551l;
import p398y4.C7543d;

/* JADX INFO: renamed from: w4.a */
/* JADX INFO: loaded from: classes.dex */
public class C7353a extends AbstractC7356d {

    /* JADX INFO: renamed from: d */
    private final boolean f29302d;

    /* JADX INFO: renamed from: e */
    private final C7543d f29303e;

    public C7353a(C7245j c7245j, C7543d c7543d, boolean z7) {
        super(AbstractC7356d.a.AckUserWrite, C7357e.f29313d, c7245j);
        this.f29303e = c7543d;
        this.f29302d = z7;
    }

    @Override // p382w4.AbstractC7356d
    /* JADX INFO: renamed from: d */
    public AbstractC7356d mo32379d(C0198b c0198b) {
        if (!this.f29307c.isEmpty()) {
            AbstractC7551l.m33234g(this.f29307c.m32004z().equals(c0198b), "operationForChild called for unrelated child.");
            return new C7353a(this.f29307c.m31996C(), this.f29303e, this.f29302d);
        }
        if (this.f29303e.getValue() != null) {
            AbstractC7551l.m33234g(this.f29303e.m33199q().isEmpty(), "affectedTree should not have overlapping affected paths.");
            return this;
        }
        return new C7353a(C7245j.m31994y(), this.f29303e.m33190B(new C7245j(c0198b)), this.f29302d);
    }

    /* JADX INFO: renamed from: e */
    public C7543d m32380e() {
        return this.f29303e;
    }

    /* JADX INFO: renamed from: f */
    public boolean m32381f() {
        return this.f29302d;
    }

    public String toString() {
        return String.format("AckUserWrite { path=%s, revert=%s, affectedTree=%s }", m32383a(), Boolean.valueOf(this.f29302d), this.f29303e);
    }
}
