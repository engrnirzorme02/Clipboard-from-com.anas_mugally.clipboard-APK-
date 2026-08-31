package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.AbstractC2867a;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC2867a abstractC2867a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f9297a = abstractC2867a.m14308p(iconCompat.f9297a, 1);
        iconCompat.f9299c = abstractC2867a.m14302j(iconCompat.f9299c, 2);
        iconCompat.f9300d = abstractC2867a.m14310r(iconCompat.f9300d, 3);
        iconCompat.f9301e = abstractC2867a.m14308p(iconCompat.f9301e, 4);
        iconCompat.f9302f = abstractC2867a.m14308p(iconCompat.f9302f, 5);
        iconCompat.f9303g = (ColorStateList) abstractC2867a.m14310r(iconCompat.f9303g, 6);
        iconCompat.f9305i = abstractC2867a.m14312t(iconCompat.f9305i, 7);
        iconCompat.f9306j = abstractC2867a.m14312t(iconCompat.f9306j, 8);
        iconCompat.m10611j();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC2867a abstractC2867a) {
        abstractC2867a.m14316x(true, true);
        iconCompat.m10612k(abstractC2867a.m14298f());
        int i7 = iconCompat.f9297a;
        if (-1 != i7) {
            abstractC2867a.m14288F(i7, 1);
        }
        byte[] bArr = iconCompat.f9299c;
        if (bArr != null) {
            abstractC2867a.m14284B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f9300d;
        if (parcelable != null) {
            abstractC2867a.m14290H(parcelable, 3);
        }
        int i8 = iconCompat.f9301e;
        if (i8 != 0) {
            abstractC2867a.m14288F(i8, 4);
        }
        int i9 = iconCompat.f9302f;
        if (i9 != 0) {
            abstractC2867a.m14288F(i9, 5);
        }
        ColorStateList colorStateList = iconCompat.f9303g;
        if (colorStateList != null) {
            abstractC2867a.m14290H(colorStateList, 6);
        }
        String str = iconCompat.f9305i;
        if (str != null) {
            abstractC2867a.m14292J(str, 7);
        }
        String str2 = iconCompat.f9306j;
        if (str2 != null) {
            abstractC2867a.m14292J(str2, 8);
        }
    }
}
