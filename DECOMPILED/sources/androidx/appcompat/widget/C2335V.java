package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.collection.C2397h;
import androidx.collection.C2399j;
import androidx.collection.C2400k;
import androidx.collection.C2401l;
import androidx.core.content.AbstractC2436b;
import androidx.vectordrawable.graphics.drawable.C2865g;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p041F.AbstractC0400a;
import p279k.AbstractC5908a;

/* JADX INFO: renamed from: androidx.appcompat.widget.V */
/* JADX INFO: loaded from: classes.dex */
public final class C2335V {

    /* JADX INFO: renamed from: i */
    private static C2335V f8131i;

    /* JADX INFO: renamed from: a */
    private WeakHashMap f8133a;

    /* JADX INFO: renamed from: b */
    private C2400k f8134b;

    /* JADX INFO: renamed from: c */
    private C2401l f8135c;

    /* JADX INFO: renamed from: d */
    private final WeakHashMap f8136d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e */
    private TypedValue f8137e;

    /* JADX INFO: renamed from: f */
    private boolean f8138f;

    /* JADX INFO: renamed from: g */
    private c f8139g;

    /* JADX INFO: renamed from: h */
    private static final PorterDuff.Mode f8130h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j */
    private static final a f8132j = new a(6);

    /* JADX INFO: renamed from: androidx.appcompat.widget.V$a */
    private static class a extends C2399j {
        public a(int i7) {
            super(i7);
        }

        /* JADX INFO: renamed from: b */
        private static int m9966b(int i7, PorterDuff.Mode mode) {
            return ((i7 + 31) * 31) + mode.hashCode();
        }

        /* JADX INFO: renamed from: c */
        PorterDuffColorFilter m9967c(int i7, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(m9966b(i7, mode)));
        }

        /* JADX INFO: renamed from: d */
        PorterDuffColorFilter m9968d(int i7, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(m9966b(i7, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.V$b */
    private interface b {
        /* JADX INFO: renamed from: a */
        Drawable m9969a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.V$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        boolean mo9970a(Context context, int i7, Drawable drawable);

        /* JADX INFO: renamed from: b */
        PorterDuff.Mode mo9971b(int i7);

        /* JADX INFO: renamed from: c */
        Drawable mo9972c(C2335V c2335v, Context context, int i7);

        /* JADX INFO: renamed from: d */
        ColorStateList mo9973d(Context context, int i7);

        /* JADX INFO: renamed from: e */
        boolean mo9974e(Context context, int i7, Drawable drawable);
    }

    /* JADX INFO: renamed from: a */
    private synchronized boolean m9943a(Context context, long j7, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            C2397h c2397h = (C2397h) this.f8136d.get(context);
            if (c2397h == null) {
                c2397h = new C2397h();
                this.f8136d.put(context, c2397h);
            }
            c2397h.m10288h(j7, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m9944b(Context context, int i7, ColorStateList colorStateList) {
        if (this.f8133a == null) {
            this.f8133a = new WeakHashMap();
        }
        C2401l c2401l = (C2401l) this.f8133a.get(context);
        if (c2401l == null) {
            c2401l = new C2401l();
            this.f8133a.put(context, c2401l);
        }
        c2401l.m10302a(i7, colorStateList);
    }

    /* JADX INFO: renamed from: c */
    private void m9945c(Context context) {
        if (this.f8138f) {
            return;
        }
        this.f8138f = true;
        Drawable drawableM9958i = m9958i(context, AbstractC5908a.f23482a);
        if (drawableM9958i == null || !m9954p(drawableM9958i)) {
            this.f8138f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* JADX INFO: renamed from: d */
    private static long m9946d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* JADX INFO: renamed from: e */
    private Drawable m9947e(Context context, int i7) {
        if (this.f8137e == null) {
            this.f8137e = new TypedValue();
        }
        TypedValue typedValue = this.f8137e;
        context.getResources().getValue(i7, typedValue, true);
        long jM9946d = m9946d(typedValue);
        Drawable drawableM9950h = m9950h(context, jM9946d);
        if (drawableM9950h != null) {
            return drawableM9950h;
        }
        c cVar = this.f8139g;
        Drawable drawableMo9972c = cVar == null ? null : cVar.mo9972c(this, context, i7);
        if (drawableMo9972c != null) {
            drawableMo9972c.setChangingConfigurations(typedValue.changingConfigurations);
            m9943a(context, jM9946d, drawableMo9972c);
        }
        return drawableMo9972c;
    }

    /* JADX INFO: renamed from: f */
    private static PorterDuffColorFilter m9948f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m9951k(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* JADX INFO: renamed from: g */
    public static synchronized C2335V m9949g() {
        try {
            if (f8131i == null) {
                C2335V c2335v = new C2335V();
                f8131i = c2335v;
                m9953o(c2335v);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8131i;
    }

    /* JADX INFO: renamed from: h */
    private synchronized Drawable m9950h(Context context, long j7) {
        C2397h c2397h = (C2397h) this.f8136d.get(context);
        if (c2397h == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c2397h.m10284d(j7);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c2397h.m10289i(j7);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static synchronized PorterDuffColorFilter m9951k(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM9967c;
        a aVar = f8132j;
        porterDuffColorFilterM9967c = aVar.m9967c(i7, mode);
        if (porterDuffColorFilterM9967c == null) {
            porterDuffColorFilterM9967c = new PorterDuffColorFilter(i7, mode);
            aVar.m9968d(i7, mode, porterDuffColorFilterM9967c);
        }
        return porterDuffColorFilterM9967c;
    }

    /* JADX INFO: renamed from: m */
    private ColorStateList m9952m(Context context, int i7) {
        C2401l c2401l;
        WeakHashMap weakHashMap = this.f8133a;
        if (weakHashMap == null || (c2401l = (C2401l) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) c2401l.m10305d(i7);
    }

    /* JADX INFO: renamed from: o */
    private static void m9953o(C2335V c2335v) {
    }

    /* JADX INFO: renamed from: p */
    private static boolean m9954p(Drawable drawable) {
        return (drawable instanceof C2865g) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX INFO: renamed from: q */
    private Drawable m9955q(Context context, int i7) {
        int next;
        C2400k c2400k = this.f8134b;
        if (c2400k == null || c2400k.isEmpty()) {
            return null;
        }
        C2401l c2401l = this.f8135c;
        if (c2401l != null) {
            String str = (String) c2401l.m10305d(i7);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f8134b.get(str) == null)) {
                return null;
            }
        } else {
            this.f8135c = new C2401l();
        }
        if (this.f8137e == null) {
            this.f8137e = new TypedValue();
        }
        TypedValue typedValue = this.f8137e;
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        long jM9946d = m9946d(typedValue);
        Drawable drawableM9950h = m9950h(context, jM9946d);
        if (drawableM9950h != null) {
            return drawableM9950h;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i7);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f8135c.m10302a(i7, name);
                b bVar = (b) this.f8134b.get(name);
                if (bVar != null) {
                    drawableM9950h = bVar.m9969a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM9950h != null) {
                    drawableM9950h.setChangingConfigurations(typedValue.changingConfigurations);
                    m9943a(context, jM9946d, drawableM9950h);
                }
            } catch (Exception e7) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e7);
            }
        }
        if (drawableM9950h == null) {
            this.f8135c.m10302a(i7, "appcompat_skip_skip");
        }
        return drawableM9950h;
    }

    /* JADX INFO: renamed from: u */
    private Drawable m9956u(Context context, int i7, boolean z7, Drawable drawable) {
        ColorStateList colorStateListM9960l = m9960l(context, i7);
        if (colorStateListM9960l != null) {
            Drawable drawableM1712r = AbstractC0400a.m1712r(drawable.mutate());
            AbstractC0400a.m1709o(drawableM1712r, colorStateListM9960l);
            PorterDuff.Mode modeM9961n = m9961n(i7);
            if (modeM9961n != null) {
                AbstractC0400a.m1710p(drawableM1712r, modeM9961n);
            }
            return drawableM1712r;
        }
        c cVar = this.f8139g;
        if ((cVar == null || !cVar.mo9974e(context, i7, drawable)) && !m9965w(context, i7, drawable) && z7) {
            return null;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: v */
    static void m9957v(Drawable drawable, C2344b0 c2344b0, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z7 = c2344b0.f8182d;
        if (z7 || c2344b0.f8181c) {
            drawable.setColorFilter(m9948f(z7 ? c2344b0.f8179a : null, c2344b0.f8181c ? c2344b0.f8180b : f8130h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized Drawable m9958i(Context context, int i7) {
        return m9959j(context, i7, false);
    }

    /* JADX INFO: renamed from: j */
    synchronized Drawable m9959j(Context context, int i7, boolean z7) {
        Drawable drawableM9955q;
        try {
            m9945c(context);
            drawableM9955q = m9955q(context, i7);
            if (drawableM9955q == null) {
                drawableM9955q = m9947e(context, i7);
            }
            if (drawableM9955q == null) {
                drawableM9955q = AbstractC2436b.getDrawable(context, i7);
            }
            if (drawableM9955q != null) {
                drawableM9955q = m9956u(context, i7, z7, drawableM9955q);
            }
            if (drawableM9955q != null) {
                AbstractC2315M.m9768b(drawableM9955q);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM9955q;
    }

    /* JADX INFO: renamed from: l */
    synchronized ColorStateList m9960l(Context context, int i7) {
        ColorStateList colorStateListM9952m;
        colorStateListM9952m = m9952m(context, i7);
        if (colorStateListM9952m == null) {
            c cVar = this.f8139g;
            colorStateListM9952m = cVar == null ? null : cVar.mo9973d(context, i7);
            if (colorStateListM9952m != null) {
                m9944b(context, i7, colorStateListM9952m);
            }
        }
        return colorStateListM9952m;
    }

    /* JADX INFO: renamed from: n */
    PorterDuff.Mode m9961n(int i7) {
        c cVar = this.f8139g;
        if (cVar == null) {
            return null;
        }
        return cVar.mo9971b(i7);
    }

    /* JADX INFO: renamed from: r */
    public synchronized void m9962r(Context context) {
        C2397h c2397h = (C2397h) this.f8136d.get(context);
        if (c2397h != null) {
            c2397h.m10281a();
        }
    }

    /* JADX INFO: renamed from: s */
    synchronized Drawable m9963s(Context context, C2360j0 c2360j0, int i7) {
        try {
            Drawable drawableM9955q = m9955q(context, i7);
            if (drawableM9955q == null) {
                drawableM9955q = c2360j0.m9976a(i7);
            }
            if (drawableM9955q == null) {
                return null;
            }
            return m9956u(context, i7, false, drawableM9955q);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public synchronized void m9964t(c cVar) {
        this.f8139g = cVar;
    }

    /* JADX INFO: renamed from: w */
    boolean m9965w(Context context, int i7, Drawable drawable) {
        c cVar = this.f8139g;
        return cVar != null && cVar.mo9970a(context, i7, drawable);
    }
}
