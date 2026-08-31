package p019C1;

import androidx.collection.C2390a;
import java.security.MessageDigest;
import p183Y1.C2013b;

/* JADX INFO: renamed from: C1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0132h implements InterfaceC0130f {

    /* JADX INFO: renamed from: b */
    private final C2390a f695b = new C2013b();

    /* JADX INFO: renamed from: g */
    private static void m599g(C0131g c0131g, Object obj, MessageDigest messageDigest) {
        c0131g.m597g(obj, messageDigest);
    }

    @Override // p019C1.InterfaceC0130f
    /* JADX INFO: renamed from: a */
    public void mo590a(MessageDigest messageDigest) {
        for (int i7 = 0; i7 < this.f695b.size(); i7++) {
            m599g((C0131g) this.f695b.m10300f(i7), this.f695b.m10301k(i7), messageDigest);
        }
    }

    /* JADX INFO: renamed from: c */
    public Object m600c(C0131g c0131g) {
        return this.f695b.containsKey(c0131g) ? this.f695b.get(c0131g) : c0131g.m596c();
    }

    /* JADX INFO: renamed from: d */
    public void m601d(C0132h c0132h) {
        this.f695b.mo8380g(c0132h.f695b);
    }

    /* JADX INFO: renamed from: e */
    public C0132h m602e(C0131g c0131g) {
        this.f695b.remove(c0131g);
        return this;
    }

    @Override // p019C1.InterfaceC0130f
    public boolean equals(Object obj) {
        if (obj instanceof C0132h) {
            return this.f695b.equals(((C0132h) obj).f695b);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public C0132h m603f(C0131g c0131g, Object obj) {
        this.f695b.put(c0131g, obj);
        return this;
    }

    @Override // p019C1.InterfaceC0130f
    public int hashCode() {
        return this.f695b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f695b + '}';
    }
}
