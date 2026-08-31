package p374v4;

import p030D4.InterfaceC0210n;

/* JADX INFO: renamed from: v4.A */
/* JADX INFO: loaded from: classes.dex */
public final class C7230A {

    /* JADX INFO: renamed from: a */
    private final long f28814a;

    /* JADX INFO: renamed from: b */
    private final C7245j f28815b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0210n f28816c;

    /* JADX INFO: renamed from: d */
    private final C7236a f28817d;

    /* JADX INFO: renamed from: e */
    private final boolean f28818e;

    public C7230A(long j7, C7245j c7245j, InterfaceC0210n interfaceC0210n, boolean z7) {
        this.f28814a = j7;
        this.f28815b = c7245j;
        this.f28816c = interfaceC0210n;
        this.f28817d = null;
        this.f28818e = z7;
    }

    /* JADX INFO: renamed from: a */
    public C7236a m31881a() {
        C7236a c7236a = this.f28817d;
        if (c7236a != null) {
            return c7236a;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC0210n m31882b() {
        InterfaceC0210n interfaceC0210n = this.f28816c;
        if (interfaceC0210n != null) {
            return interfaceC0210n;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    /* JADX INFO: renamed from: c */
    public C7245j m31883c() {
        return this.f28815b;
    }

    /* JADX INFO: renamed from: d */
    public long m31884d() {
        return this.f28814a;
    }

    /* JADX INFO: renamed from: e */
    public boolean m31885e() {
        return this.f28816c != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7230A.class != obj.getClass()) {
            return false;
        }
        C7230A c7230a = (C7230A) obj;
        if (this.f28814a != c7230a.f28814a || !this.f28815b.equals(c7230a.f28815b) || this.f28818e != c7230a.f28818e) {
            return false;
        }
        InterfaceC0210n interfaceC0210n = this.f28816c;
        if (interfaceC0210n == null ? c7230a.f28816c != null : !interfaceC0210n.equals(c7230a.f28816c)) {
            return false;
        }
        C7236a c7236a = this.f28817d;
        C7236a c7236a2 = c7230a.f28817d;
        return c7236a == null ? c7236a2 == null : c7236a.equals(c7236a2);
    }

    /* JADX INFO: renamed from: f */
    public boolean m31886f() {
        return this.f28818e;
    }

    public int hashCode() {
        int iHashCode = ((((Long.valueOf(this.f28814a).hashCode() * 31) + Boolean.valueOf(this.f28818e).hashCode()) * 31) + this.f28815b.hashCode()) * 31;
        InterfaceC0210n interfaceC0210n = this.f28816c;
        int iHashCode2 = (iHashCode + (interfaceC0210n != null ? interfaceC0210n.hashCode() : 0)) * 31;
        C7236a c7236a = this.f28817d;
        return iHashCode2 + (c7236a != null ? c7236a.hashCode() : 0);
    }

    public String toString() {
        return "UserWriteRecord{id=" + this.f28814a + " path=" + this.f28815b + " visible=" + this.f28818e + " overwrite=" + this.f28816c + " merge=" + this.f28817d + "}";
    }

    public C7230A(long j7, C7245j c7245j, C7236a c7236a) {
        this.f28814a = j7;
        this.f28815b = c7245j;
        this.f28816c = null;
        this.f28817d = c7236a;
        this.f28818e = true;
    }
}
