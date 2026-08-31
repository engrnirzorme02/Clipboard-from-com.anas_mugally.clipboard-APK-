package com.google.android.material.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;
import p041F.AbstractC0400a;

/* JADX INFO: renamed from: com.google.android.material.drawable.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4498d {

    /* JADX INFO: renamed from: com.google.android.material.drawable.d$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static void m20444a(Outline outline, Path path) {
            outline.setConvexPath(path);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.drawable.d$b */
    private static class b {
        /* JADX INFO: renamed from: a */
        static void m20445a(Outline outline, Path path) {
            outline.setPath(path);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m20429a(Drawable drawable, Drawable drawable2) {
        return m20430b(drawable, drawable2, -1, -1);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m20430b(Drawable drawable, Drawable drawable2, int i7, int i8) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i7 == -1) {
            i7 = m20437i(drawable, drawable2);
        }
        if (i8 == -1) {
            i8 = m20436h(drawable, drawable2);
        }
        if (i7 > drawable.getIntrinsicWidth() || i8 > drawable.getIntrinsicHeight()) {
            float f7 = i7 / i8;
            if (f7 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i8 = (int) (intrinsicWidth / f7);
                i7 = intrinsicWidth;
            } else {
                i8 = drawable.getIntrinsicHeight();
                i7 = (int) (f7 * i8);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i7, i8);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m20431c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return m20433e(drawable, colorStateList, mode, false);
    }

    /* JADX INFO: renamed from: d */
    public static Drawable m20432d(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return m20433e(drawable, colorStateList, mode, false);
    }

    /* JADX INFO: renamed from: e */
    private static Drawable m20433e(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean z7) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            if (z7) {
                drawable.mutate();
            }
            return drawable;
        }
        Drawable drawableMutate = AbstractC0400a.m1712r(drawable).mutate();
        if (mode != null) {
            drawableMutate.setTintMode(mode);
        }
        return drawableMutate;
    }

    /* JADX INFO: renamed from: f */
    public static int[] m20434f(int[] iArr) {
        for (int i7 = 0; i7 < iArr.length; i7++) {
            int i8 = iArr[i7];
            if (i8 == 16842912) {
                return iArr;
            }
            if (i8 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i7] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    /* JADX INFO: renamed from: g */
    public static ColorStateList m20435g(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC4495a.m20426a(drawable)) {
            return null;
        }
        return AbstractC4496b.m20427a(drawable).getColorStateList();
    }

    /* JADX INFO: renamed from: h */
    private static int m20436h(Drawable drawable, Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : drawable.getIntrinsicHeight();
    }

    /* JADX INFO: renamed from: i */
    private static int m20437i(Drawable drawable, Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        return intrinsicWidth != -1 ? intrinsicWidth : drawable.getIntrinsicWidth();
    }

    /* JADX INFO: renamed from: j */
    public static int[] m20438j(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i7 = 0;
        for (int i8 : iArr) {
            if (i8 != 16842912) {
                iArr2[i7] = i8;
                i7++;
            }
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: k */
    public static AttributeSet m20439k(Context context, int i7, CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i7);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (TextUtils.equals(xml.getName(), charSequence)) {
                return Xml.asAttributeSet(xml);
            }
            throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
        } catch (IOException e7) {
            e = e7;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i7));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (XmlPullParserException e8) {
            e = e8;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i7));
            notFoundException2.initCause(e);
            throw notFoundException2;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m20440l(Outline outline, Path path) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            b.m20445a(outline, path);
            return;
        }
        if (i7 >= 29) {
            try {
                a.m20444a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            a.m20444a(outline, path);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m20441m(RippleDrawable rippleDrawable, int i7) {
        rippleDrawable.setRadius(i7);
    }

    /* JADX INFO: renamed from: n */
    public static void m20442n(Drawable drawable, int i7) {
        if (i7 != 0) {
            drawable.setTint(i7);
        } else {
            drawable.setTintList(null);
        }
    }

    /* JADX INFO: renamed from: o */
    public static PorterDuffColorFilter m20443o(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
