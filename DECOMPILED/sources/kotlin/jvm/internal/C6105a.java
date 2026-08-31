package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: renamed from: kotlin.jvm.internal.a */
/* JADX INFO: loaded from: classes.dex */
public class C6105a implements InterfaceC6114j, Serializable {

    /* JADX INFO: renamed from: a */
    protected final Object f23864a;

    /* JADX INFO: renamed from: b */
    private final Class f23865b;

    /* JADX INFO: renamed from: c */
    private final String f23866c;

    /* JADX INFO: renamed from: d */
    private final String f23867d;

    /* JADX INFO: renamed from: e */
    private final boolean f23868e;

    /* JADX INFO: renamed from: f */
    private final int f23869f;

    /* JADX INFO: renamed from: r */
    private final int f23870r;

    public C6105a(int i7, Object obj, Class cls, String str, String str2, int i8) {
        this.f23864a = obj;
        this.f23865b = cls;
        this.f23866c = str;
        this.f23867d = str2;
        this.f23868e = (i8 & 1) == 1;
        this.f23869f = i7;
        this.f23870r = i8 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6105a)) {
            return false;
        }
        C6105a c6105a = (C6105a) obj;
        return this.f23868e == c6105a.f23868e && this.f23869f == c6105a.f23869f && this.f23870r == c6105a.f23870r && AbstractC6118n.m27183a(this.f23864a, c6105a.f23864a) && AbstractC6118n.m27183a(this.f23865b, c6105a.f23865b) && this.f23866c.equals(c6105a.f23866c) && this.f23867d.equals(c6105a.f23867d);
    }

    @Override // kotlin.jvm.internal.InterfaceC6114j
    public int getArity() {
        return this.f23869f;
    }

    public int hashCode() {
        Object obj = this.f23864a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f23865b;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f23866c.hashCode()) * 31) + this.f23867d.hashCode()) * 31) + (this.f23868e ? 1231 : 1237)) * 31) + this.f23869f) * 31) + this.f23870r;
    }

    public String toString() {
        return AbstractC6100C.m27144g(this);
    }
}
