package p035E1;

import java.security.MessageDigest;
import p019C1.InterfaceC0130f;

/* JADX INFO: renamed from: E1.d */
/* JADX INFO: loaded from: classes.dex */
final class C0283d implements InterfaceC0130f {

    /* JADX INFO: renamed from: b */
    private final InterfaceC0130f f1070b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0130f f1071c;

    C0283d(InterfaceC0130f interfaceC0130f, InterfaceC0130f interfaceC0130f2) {
        this.f1070b = interfaceC0130f;
        this.f1071c = interfaceC0130f2;
    }

    @Override // p019C1.InterfaceC0130f
    /* JADX INFO: renamed from: a */
    public void mo590a(MessageDigest messageDigest) {
        this.f1070b.mo590a(messageDigest);
        this.f1071c.mo590a(messageDigest);
    }

    @Override // p019C1.InterfaceC0130f
    public boolean equals(Object obj) {
        if (obj instanceof C0283d) {
            C0283d c0283d = (C0283d) obj;
            if (this.f1070b.equals(c0283d.f1070b) && this.f1071c.equals(c0283d.f1071c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p019C1.InterfaceC0130f
    public int hashCode() {
        return (this.f1070b.hashCode() * 31) + this.f1071c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f1070b + ", signature=" + this.f1071c + '}';
    }
}
