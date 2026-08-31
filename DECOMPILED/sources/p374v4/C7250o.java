package p374v4;

import p078J4.AbstractC0686a;

/* JADX INFO: renamed from: v4.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7250o {

    /* JADX INFO: renamed from: a */
    public String f28959a;

    /* JADX INFO: renamed from: b */
    public boolean f28960b;

    /* JADX INFO: renamed from: c */
    public String f28961c;

    /* JADX INFO: renamed from: d */
    public String f28962d;

    /* JADX INFO: renamed from: a */
    public void m32084a(AbstractC0686a abstractC0686a) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7250o.class != obj.getClass()) {
            return false;
        }
        C7250o c7250o = (C7250o) obj;
        if (this.f28960b == c7250o.f28960b && this.f28959a.equals(c7250o.f28959a)) {
            return this.f28961c.equals(c7250o.f28961c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f28959a.hashCode() * 31) + (this.f28960b ? 1 : 0)) * 31) + this.f28961c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("http");
        sb.append(this.f28960b ? "s" : "");
        sb.append("://");
        sb.append(this.f28959a);
        return sb.toString();
    }
}
