package p179X4;

import com.google.protobuf.AbstractC5104i;
import p158U4.C1687k;
import p350s4.C7011e;

/* JADX INFO: renamed from: X4.S */
/* JADX INFO: loaded from: classes.dex */
public final class C1971S {

    /* JADX INFO: renamed from: a */
    private final AbstractC5104i f6508a;

    /* JADX INFO: renamed from: b */
    private final boolean f6509b;

    /* JADX INFO: renamed from: c */
    private final C7011e f6510c;

    /* JADX INFO: renamed from: d */
    private final C7011e f6511d;

    /* JADX INFO: renamed from: e */
    private final C7011e f6512e;

    public C1971S(AbstractC5104i abstractC5104i, boolean z7, C7011e c7011e, C7011e c7011e2, C7011e c7011e3) {
        this.f6508a = abstractC5104i;
        this.f6509b = z7;
        this.f6510c = c7011e;
        this.f6511d = c7011e2;
        this.f6512e = c7011e3;
    }

    /* JADX INFO: renamed from: a */
    public static C1971S m8224a(boolean z7, AbstractC5104i abstractC5104i) {
        return new C1971S(abstractC5104i, z7, C1687k.m7086j(), C1687k.m7086j(), C1687k.m7086j());
    }

    /* JADX INFO: renamed from: b */
    public C7011e m8225b() {
        return this.f6510c;
    }

    /* JADX INFO: renamed from: c */
    public C7011e m8226c() {
        return this.f6511d;
    }

    /* JADX INFO: renamed from: d */
    public C7011e m8227d() {
        return this.f6512e;
    }

    /* JADX INFO: renamed from: e */
    public AbstractC5104i m8228e() {
        return this.f6508a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1971S.class != obj.getClass()) {
            return false;
        }
        C1971S c1971s = (C1971S) obj;
        if (this.f6509b == c1971s.f6509b && this.f6508a.equals(c1971s.f6508a) && this.f6510c.equals(c1971s.f6510c) && this.f6511d.equals(c1971s.f6511d)) {
            return this.f6512e.equals(c1971s.f6512e);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m8229f() {
        return this.f6509b;
    }

    public int hashCode() {
        return (((((((this.f6508a.hashCode() * 31) + (this.f6509b ? 1 : 0)) * 31) + this.f6510c.hashCode()) * 31) + this.f6511d.hashCode()) * 31) + this.f6512e.hashCode();
    }
}
