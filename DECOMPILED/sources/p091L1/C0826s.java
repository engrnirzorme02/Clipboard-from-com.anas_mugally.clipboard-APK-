package p091L1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C3202b;
import java.security.MessageDigest;
import p019C1.InterfaceC0136l;
import p035E1.InterfaceC0301v;
import p043F1.InterfaceC0406d;

/* JADX INFO: renamed from: L1.s */
/* JADX INFO: loaded from: classes.dex */
public class C0826s implements InterfaceC0136l {

    /* JADX INFO: renamed from: b */
    private final InterfaceC0136l f3291b;

    /* JADX INFO: renamed from: c */
    private final boolean f3292c;

    public C0826s(InterfaceC0136l interfaceC0136l, boolean z7) {
        this.f3291b = interfaceC0136l;
        this.f3292c = z7;
    }

    /* JADX INFO: renamed from: d */
    private InterfaceC0301v m3873d(Context context, InterfaceC0301v interfaceC0301v) {
        return C0799T.m3741f(context.getResources(), interfaceC0301v);
    }

    @Override // p019C1.InterfaceC0130f
    /* JADX INFO: renamed from: a */
    public void mo590a(MessageDigest messageDigest) {
        this.f3291b.mo590a(messageDigest);
    }

    @Override // p019C1.InterfaceC0136l
    /* JADX INFO: renamed from: b */
    public InterfaceC0301v mo608b(Context context, InterfaceC0301v interfaceC0301v, int i7, int i8) {
        InterfaceC0406d interfaceC0406dM16998f = ComponentCallbacks2C3202b.m16988c(context).m16998f();
        Drawable drawable = (Drawable) interfaceC0301v.get();
        InterfaceC0301v interfaceC0301vM3871a = AbstractC0825r.m3871a(interfaceC0406dM16998f, drawable, i7, i8);
        if (interfaceC0301vM3871a != null) {
            InterfaceC0301v interfaceC0301vMo608b = this.f3291b.mo608b(context, interfaceC0301vM3871a, i7, i8);
            if (!interfaceC0301vMo608b.equals(interfaceC0301vM3871a)) {
                return m3873d(context, interfaceC0301vMo608b);
            }
            interfaceC0301vMo608b.mo1436b();
            return interfaceC0301v;
        }
        if (!this.f3292c) {
            return interfaceC0301v;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC0136l m3874c() {
        return this;
    }

    @Override // p019C1.InterfaceC0130f
    public boolean equals(Object obj) {
        if (obj instanceof C0826s) {
            return this.f3291b.equals(((C0826s) obj).f3291b);
        }
        return false;
    }

    @Override // p019C1.InterfaceC0130f
    public int hashCode() {
        return this.f3291b.hashCode();
    }
}
