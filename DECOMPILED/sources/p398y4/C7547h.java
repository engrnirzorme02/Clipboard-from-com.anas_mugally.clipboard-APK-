package p398y4;

import p374v4.C7245j;
import p374v4.C7250o;

/* JADX INFO: renamed from: y4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7547h {

    /* JADX INFO: renamed from: a */
    public C7250o f30193a;

    /* JADX INFO: renamed from: b */
    public C7245j f30194b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7547h.class != obj.getClass()) {
            return false;
        }
        C7547h c7547h = (C7547h) obj;
        if (this.f30193a.equals(c7547h.f30193a)) {
            return this.f30194b.equals(c7547h.f30194b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f30193a.hashCode() * 31) + this.f30194b.hashCode();
    }
}
