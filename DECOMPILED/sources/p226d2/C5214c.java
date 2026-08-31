package p226d2;

import android.content.Context;
import p298m2.InterfaceC6328a;

/* JADX INFO: renamed from: d2.c */
/* JADX INFO: loaded from: classes.dex */
final class C5214c extends AbstractC5219h {

    /* JADX INFO: renamed from: a */
    private final Context f19925a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC6328a f19926b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC6328a f19927c;

    /* JADX INFO: renamed from: d */
    private final String f19928d;

    C5214c(Context context, InterfaceC6328a interfaceC6328a, InterfaceC6328a interfaceC6328a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f19925a = context;
        if (interfaceC6328a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f19926b = interfaceC6328a;
        if (interfaceC6328a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f19927c = interfaceC6328a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f19928d = str;
    }

    @Override // p226d2.AbstractC5219h
    /* JADX INFO: renamed from: b */
    public Context mo24124b() {
        return this.f19925a;
    }

    @Override // p226d2.AbstractC5219h
    /* JADX INFO: renamed from: c */
    public String mo24125c() {
        return this.f19928d;
    }

    @Override // p226d2.AbstractC5219h
    /* JADX INFO: renamed from: d */
    public InterfaceC6328a mo24126d() {
        return this.f19927c;
    }

    @Override // p226d2.AbstractC5219h
    /* JADX INFO: renamed from: e */
    public InterfaceC6328a mo24127e() {
        return this.f19926b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5219h) {
            AbstractC5219h abstractC5219h = (AbstractC5219h) obj;
            if (this.f19925a.equals(abstractC5219h.mo24124b()) && this.f19926b.equals(abstractC5219h.mo24127e()) && this.f19927c.equals(abstractC5219h.mo24126d()) && this.f19928d.equals(abstractC5219h.mo24125c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f19925a.hashCode() ^ 1000003) * 1000003) ^ this.f19926b.hashCode()) * 1000003) ^ this.f19927c.hashCode()) * 1000003) ^ this.f19928d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f19925a + ", wallClock=" + this.f19926b + ", monotonicClock=" + this.f19927c + ", backendName=" + this.f19928d + "}";
    }
}
