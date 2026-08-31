package p091L1;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C3202b;
import p019C1.InterfaceC0136l;
import p035E1.InterfaceC0301v;
import p043F1.InterfaceC0406d;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: L1.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0815h implements InterfaceC0136l {
    @Override // p019C1.InterfaceC0136l
    /* JADX INFO: renamed from: b */
    public final InterfaceC0301v mo608b(Context context, InterfaceC0301v interfaceC0301v, int i7, int i8) {
        if (!AbstractC2023l.m8429t(i7, i8)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i7 + " or height: " + i8 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC0406d interfaceC0406dM16998f = ComponentCallbacks2C3202b.m16988c(context).m16998f();
        Bitmap bitmap = (Bitmap) interfaceC0301v.get();
        if (i7 == Integer.MIN_VALUE) {
            i7 = bitmap.getWidth();
        }
        if (i8 == Integer.MIN_VALUE) {
            i8 = bitmap.getHeight();
        }
        Bitmap bitmapMo3807c = mo3807c(interfaceC0406dM16998f, bitmap, i7, i8);
        return bitmap.equals(bitmapMo3807c) ? interfaceC0301v : C0814g.m3805f(bitmapMo3807c, interfaceC0406dM16998f);
    }

    /* JADX INFO: renamed from: c */
    protected abstract Bitmap mo3807c(InterfaceC0406d interfaceC0406d, Bitmap bitmap, int i7, int i8);
}
