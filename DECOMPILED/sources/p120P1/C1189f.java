package p120P1;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C3202b;
import java.security.MessageDigest;
import p019C1.InterfaceC0136l;
import p035E1.InterfaceC0301v;
import p091L1.C0814g;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: P1.f */
/* JADX INFO: loaded from: classes.dex */
public class C1189f implements InterfaceC0136l {

    /* JADX INFO: renamed from: b */
    private final InterfaceC0136l f4241b;

    public C1189f(InterfaceC0136l interfaceC0136l) {
        this.f4241b = (InterfaceC0136l) AbstractC2022k.m8408e(interfaceC0136l);
    }

    @Override // p019C1.InterfaceC0130f
    /* JADX INFO: renamed from: a */
    public void mo590a(MessageDigest messageDigest) {
        this.f4241b.mo590a(messageDigest);
    }

    @Override // p019C1.InterfaceC0136l
    /* JADX INFO: renamed from: b */
    public InterfaceC0301v mo608b(Context context, InterfaceC0301v interfaceC0301v, int i7, int i8) {
        C1186c c1186c = (C1186c) interfaceC0301v.get();
        InterfaceC0301v c0814g = new C0814g(c1186c.m5216e(), ComponentCallbacks2C3202b.m16988c(context).m16998f());
        InterfaceC0301v interfaceC0301vMo608b = this.f4241b.mo608b(context, c0814g, i7, i8);
        if (!c0814g.equals(interfaceC0301vMo608b)) {
            c0814g.mo1436b();
        }
        c1186c.m5221m(this.f4241b, (Bitmap) interfaceC0301vMo608b.get());
        return interfaceC0301v;
    }

    @Override // p019C1.InterfaceC0130f
    public boolean equals(Object obj) {
        if (obj instanceof C1189f) {
            return this.f4241b.equals(((C1189f) obj).f4241b);
        }
        return false;
    }

    @Override // p019C1.InterfaceC0130f
    public int hashCode() {
        return this.f4241b.hashCode();
    }
}
