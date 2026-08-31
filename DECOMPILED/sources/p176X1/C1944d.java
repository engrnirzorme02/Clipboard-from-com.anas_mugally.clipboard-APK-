package p176X1;

import java.security.MessageDigest;
import p019C1.InterfaceC0130f;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: X1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1944d implements InterfaceC0130f {

    /* JADX INFO: renamed from: b */
    private final Object f6435b;

    public C1944d(Object obj) {
        this.f6435b = AbstractC2022k.m8408e(obj);
    }

    @Override // p019C1.InterfaceC0130f
    /* JADX INFO: renamed from: a */
    public void mo590a(MessageDigest messageDigest) {
        messageDigest.update(this.f6435b.toString().getBytes(InterfaceC0130f.f689a));
    }

    @Override // p019C1.InterfaceC0130f
    public boolean equals(Object obj) {
        if (obj instanceof C1944d) {
            return this.f6435b.equals(((C1944d) obj).f6435b);
        }
        return false;
    }

    @Override // p019C1.InterfaceC0130f
    public int hashCode() {
        return this.f6435b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f6435b + '}';
    }
}
