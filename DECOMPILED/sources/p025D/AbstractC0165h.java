package p025D;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p033E.AbstractC0264s;
import p104N.AbstractC0905b;
import p104N.AbstractC0910g;

/* JADX INFO: renamed from: D.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0165h {

    /* JADX INFO: renamed from: a */
    private static final ThreadLocal f786a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    private static final WeakHashMap f787b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    private static final Object f788c = new Object();

    /* JADX INFO: renamed from: D.h$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static Drawable m823a(Resources resources, int i7, Resources.Theme theme) {
            return resources.getDrawable(i7, theme);
        }

        /* JADX INFO: renamed from: b */
        static Drawable m824b(Resources resources, int i7, int i8, Resources.Theme theme) {
            return resources.getDrawableForDensity(i7, i8, theme);
        }
    }

    /* JADX INFO: renamed from: D.h$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static ColorStateList m825a(Resources resources, int i7, Resources.Theme theme) {
            return resources.getColorStateList(i7, theme);
        }
    }

    /* JADX INFO: renamed from: D.h$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        final ColorStateList f789a;

        /* JADX INFO: renamed from: b */
        final Configuration f790b;

        /* JADX INFO: renamed from: c */
        final int f791c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f789a = colorStateList;
            this.f790b = configuration;
            this.f791c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: renamed from: D.h$d */
    private static final class d {

        /* JADX INFO: renamed from: a */
        final Resources f792a;

        /* JADX INFO: renamed from: b */
        final Resources.Theme f793b;

        d(Resources resources, Resources.Theme theme) {
            this.f792a = resources;
            this.f793b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f792a.equals(dVar.f792a) && AbstractC0905b.m4125a(this.f793b, dVar.f793b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return AbstractC0905b.m4126b(this.f792a, this.f793b);
        }
    }

    /* JADX INFO: renamed from: D.h$e */
    public static abstract class e {
        /* JADX INFO: renamed from: e */
        public static Handler m828e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* JADX INFO: renamed from: c */
        public final void m829c(final int i7, Handler handler) {
            m828e(handler).post(new Runnable() { // from class: D.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f799a.mo831f(i7);
                }
            });
        }

        /* JADX INFO: renamed from: d */
        public final void m830d(final Typeface typeface, Handler handler) {
            m828e(handler).post(new Runnable() { // from class: D.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f797a.mo832g(typeface);
                }
            });
        }

        /* JADX INFO: renamed from: f */
        public abstract void mo831f(int i7);

        /* JADX INFO: renamed from: g */
        public abstract void mo832g(Typeface typeface);
    }

    /* JADX INFO: renamed from: D.h$f */
    public static final class f {

        /* JADX INFO: renamed from: D.h$f$a */
        static class a {

            /* JADX INFO: renamed from: a */
            private static final Object f794a = new Object();

            /* JADX INFO: renamed from: b */
            private static Method f795b;

            /* JADX INFO: renamed from: c */
            private static boolean f796c;

            /* JADX WARN: Code duplicated, block: B:31:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX INFO: renamed from: a */
            static void m834a(Resources.Theme theme) {
                Method method;
                synchronized (f794a) {
                    if (f796c) {
                        method = f795b;
                        if (method != null) {
                            method.invoke(theme, new Object[0]);
                        }
                    } else {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f795b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e7) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e7);
                        }
                        f796c = true;
                        method = f795b;
                        if (method != null) {
                            try {
                                method.invoke(theme, new Object[0]);
                            } catch (IllegalAccessException | InvocationTargetException e8) {
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e8);
                                f795b = null;
                            }
                        }
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: D.h$f$b */
        static class b {
            /* JADX INFO: renamed from: a */
            static void m835a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m833a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.m835a(theme);
            } else {
                a.m834a(theme);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m809a(d dVar, int i7, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f788c) {
            try {
                WeakHashMap weakHashMap = f787b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i7, new c(colorStateList, dVar.f792a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f791c == r5.hashCode()) goto L22;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ColorStateList m810b(d dVar, int i7) {
        c cVar;
        synchronized (f788c) {
            try {
                SparseArray sparseArray = (SparseArray) f787b.get(dVar);
                if (sparseArray != null && sparseArray.size() > 0 && (cVar = (c) sparseArray.get(i7)) != null) {
                    if (cVar.f790b.equals(dVar.f792a.getConfiguration())) {
                        Resources.Theme theme = dVar.f793b;
                        if (theme != null || cVar.f791c != 0) {
                            if (theme != null) {
                            }
                        }
                        return cVar.f789a;
                    }
                    sparseArray.remove(i7);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static Typeface m811c(Context context, int i7) {
        if (context.isRestricted()) {
            return null;
        }
        return m821m(context, i7, new TypedValue(), 0, null, null, false, true);
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m812d(Resources resources, int i7, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList colorStateListM810b = m810b(dVar, i7);
        if (colorStateListM810b != null) {
            return colorStateListM810b;
        }
        ColorStateList colorStateListM819k = m819k(resources, i7, theme);
        if (colorStateListM819k == null) {
            return b.m825a(resources, i7, theme);
        }
        m809a(dVar, i7, colorStateListM819k, theme);
        return colorStateListM819k;
    }

    /* JADX INFO: renamed from: e */
    public static Drawable m813e(Resources resources, int i7, Resources.Theme theme) {
        return a.m823a(resources, i7, theme);
    }

    /* JADX INFO: renamed from: f */
    public static Drawable m814f(Resources resources, int i7, int i8, Resources.Theme theme) {
        return a.m824b(resources, i7, i8, theme);
    }

    /* JADX INFO: renamed from: g */
    public static Typeface m815g(Context context, int i7) {
        if (context.isRestricted()) {
            return null;
        }
        return m821m(context, i7, new TypedValue(), 0, null, null, false, false);
    }

    /* JADX INFO: renamed from: h */
    public static Typeface m816h(Context context, int i7, TypedValue typedValue, int i8, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m821m(context, i7, typedValue, i8, eVar, null, true, false);
    }

    /* JADX INFO: renamed from: i */
    public static void m817i(Context context, int i7, e eVar, Handler handler) {
        AbstractC0910g.m4139g(eVar);
        if (context.isRestricted()) {
            eVar.m829c(-4, handler);
        } else {
            m821m(context, i7, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    /* JADX INFO: renamed from: j */
    private static TypedValue m818j() {
        ThreadLocal threadLocal = f786a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* JADX INFO: renamed from: k */
    private static ColorStateList m819k(Resources resources, int i7, Resources.Theme theme) {
        if (m820l(resources, i7)) {
            return null;
        }
        try {
            return AbstractC0160c.m761a(resources, resources.getXml(i7), theme);
        } catch (Exception e7) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    private static boolean m820l(Resources resources, int i7) {
        TypedValue typedValueM818j = m818j();
        resources.getValue(i7, typedValueM818j, true);
        int i8 = typedValueM818j.type;
        return i8 >= 28 && i8 <= 31;
    }

    /* JADX INFO: renamed from: m */
    private static Typeface m821m(Context context, int i7, TypedValue typedValue, int i8, e eVar, Handler handler, boolean z7, boolean z8) {
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        Typeface typefaceM822n = m822n(context, resources, typedValue, i7, i8, eVar, handler, z7, z8);
        if (typefaceM822n != null || eVar != null || z8) {
            return typefaceM822n;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i7) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX INFO: renamed from: n */
    private static Typeface m822n(Context context, Resources resources, TypedValue typedValue, int i7, int i8, e eVar, Handler handler, boolean z7, boolean z8) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i7) + "\" (" + Integer.toHexString(i7) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (eVar != null) {
                eVar.m829c(-3, handler);
            }
            return null;
        }
        Typeface typefaceM1230g = AbstractC0264s.m1230g(resources, i7, string, typedValue.assetCookie, i8);
        if (typefaceM1230g != null) {
            if (eVar != null) {
                eVar.m830d(typefaceM1230g, handler);
            }
            return typefaceM1230g;
        }
        if (z8) {
            return null;
        }
        try {
            if (!string.toLowerCase().endsWith(".xml")) {
                Typeface typefaceM1228e = AbstractC0264s.m1228e(context, resources, i7, string, typedValue.assetCookie, i8);
                if (eVar != null) {
                    if (typefaceM1228e != null) {
                        eVar.m830d(typefaceM1228e, handler);
                        return typefaceM1228e;
                    }
                    eVar.m829c(-3, handler);
                }
                return typefaceM1228e;
            }
            AbstractC0162e.b bVarM782b = AbstractC0162e.m782b(resources.getXml(i7), resources);
            if (bVarM782b == null) {
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                if (eVar != null) {
                    eVar.m829c(-3, handler);
                }
                return null;
            }
            try {
                return AbstractC0264s.m1227d(context, bVarM782b, resources, i7, string, typedValue.assetCookie, i8, eVar, handler, z7);
            } catch (IOException e7) {
                e = e7;
                string = string;
                Log.e("ResourcesCompat", "Failed to read xml resource " + string, e);
                if (eVar != null) {
                    eVar.m829c(-3, handler);
                }
                return null;
            } catch (XmlPullParserException e8) {
                e = e8;
                string = string;
                Log.e("ResourcesCompat", "Failed to parse xml resource " + string, e);
                if (eVar != null) {
                    eVar.m829c(-3, handler);
                }
                return null;
            }
        } catch (IOException e9) {
            e = e9;
        } catch (XmlPullParserException e10) {
            e = e10;
        }
    }
}
