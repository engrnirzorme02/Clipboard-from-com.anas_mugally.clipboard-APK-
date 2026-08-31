package p041F;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: F.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0400a {

    /* JADX INFO: renamed from: F.a$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m1713a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* JADX INFO: renamed from: b */
        static boolean m1714b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* JADX INFO: renamed from: c */
        static ColorFilter m1715c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* JADX INFO: renamed from: d */
        static void m1716d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* JADX INFO: renamed from: e */
        static void m1717e(Drawable drawable, float f7, float f8) {
            drawable.setHotspot(f7, f8);
        }

        /* JADX INFO: renamed from: f */
        static void m1718f(Drawable drawable, int i7, int i8, int i9, int i10) {
            drawable.setHotspotBounds(i7, i8, i9, i10);
        }

        /* JADX INFO: renamed from: g */
        static void m1719g(Drawable drawable, int i7) {
            drawable.setTint(i7);
        }

        /* JADX INFO: renamed from: h */
        static void m1720h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* JADX INFO: renamed from: i */
        static void m1721i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: F.a$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static int m1722a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* JADX INFO: renamed from: b */
        static boolean m1723b(Drawable drawable, int i7) {
            return drawable.setLayoutDirection(i7);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1695a(Drawable drawable, Resources.Theme theme) {
        a.m1713a(drawable, theme);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1696b(Drawable drawable) {
        return a.m1714b(drawable);
    }

    /* JADX INFO: renamed from: c */
    public static void m1697c(Drawable drawable) {
        drawable.clearColorFilter();
    }

    /* JADX INFO: renamed from: d */
    public static int m1698d(Drawable drawable) {
        return drawable.getAlpha();
    }

    /* JADX INFO: renamed from: e */
    public static ColorFilter m1699e(Drawable drawable) {
        return a.m1715c(drawable);
    }

    /* JADX INFO: renamed from: f */
    public static int m1700f(Drawable drawable) {
        return b.m1722a(drawable);
    }

    /* JADX INFO: renamed from: g */
    public static void m1701g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        a.m1716d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1702h(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    /* JADX INFO: renamed from: i */
    public static void m1703i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* JADX INFO: renamed from: j */
    public static void m1704j(Drawable drawable, boolean z7) {
        drawable.setAutoMirrored(z7);
    }

    /* JADX INFO: renamed from: k */
    public static void m1705k(Drawable drawable, float f7, float f8) {
        a.m1717e(drawable, f7, f8);
    }

    /* JADX INFO: renamed from: l */
    public static void m1706l(Drawable drawable, int i7, int i8, int i9, int i10) {
        a.m1718f(drawable, i7, i8, i9, i10);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m1707m(Drawable drawable, int i7) {
        return b.m1723b(drawable, i7);
    }

    /* JADX INFO: renamed from: n */
    public static void m1708n(Drawable drawable, int i7) {
        a.m1719g(drawable, i7);
    }

    /* JADX INFO: renamed from: o */
    public static void m1709o(Drawable drawable, ColorStateList colorStateList) {
        a.m1720h(drawable, colorStateList);
    }

    /* JADX INFO: renamed from: p */
    public static void m1710p(Drawable drawable, PorterDuff.Mode mode) {
        a.m1721i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static Drawable m1711q(Drawable drawable) {
        return drawable instanceof InterfaceC0401b ? ((InterfaceC0401b) drawable).m1725b() : drawable;
    }

    /* JADX INFO: renamed from: r */
    public static Drawable m1712r(Drawable drawable) {
        return drawable;
    }
}
