package p382w4;

import p030D4.C0198b;
import p374v4.C7245j;
import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: w4.b */
/* JADX INFO: loaded from: classes.dex */
public class C7354b extends AbstractC7356d {
    public C7354b(C7357e c7357e, C7245j c7245j) {
        super(AbstractC7356d.a.ListenComplete, c7357e, c7245j);
        AbstractC7551l.m33234g(!c7357e.m32390d(), "Can't have a listen complete from a user source");
    }

    @Override // p382w4.AbstractC7356d
    /* JADX INFO: renamed from: d */
    public AbstractC7356d mo32379d(C0198b c0198b) {
        return this.f29307c.isEmpty() ? new C7354b(this.f29306b, C7245j.m31994y()) : new C7354b(this.f29306b, this.f29307c.m31996C());
    }

    public String toString() {
        return String.format("ListenComplete { path=%s, source=%s }", m32383a(), m32384b());
    }
}
