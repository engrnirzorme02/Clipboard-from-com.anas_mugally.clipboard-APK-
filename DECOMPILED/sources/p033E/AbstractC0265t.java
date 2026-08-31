package p033E;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p025D.AbstractC0162e;

/* JADX INFO: renamed from: E.t */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0265t extends AbstractC0270y {

    /* JADX INFO: renamed from: b */
    private static Class f997b = null;

    /* JADX INFO: renamed from: c */
    private static Constructor f998c = null;

    /* JADX INFO: renamed from: d */
    private static Method f999d = null;

    /* JADX INFO: renamed from: e */
    private static Method f1000e = null;

    /* JADX INFO: renamed from: f */
    private static boolean f1001f = false;

    AbstractC0265t() {
    }

    /* JADX INFO: renamed from: h */
    private static boolean m1236h(Object obj, String str, int i7, boolean z7) {
        m1238j();
        try {
            return ((Boolean) f999d.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z7))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX INFO: renamed from: i */
    private static Typeface m1237i(Object obj) {
        m1238j();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f997b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f1000e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX INFO: renamed from: j */
    private static void m1238j() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f1001f) {
            return;
        }
        f1001f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi21Impl", e7.getClass().getName(), e7);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f998c = constructor;
        f997b = cls;
        f999d = method2;
        f1000e = method;
    }

    /* JADX INFO: renamed from: k */
    private static Object m1239k() {
        m1238j();
        try {
            return f998c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // p033E.AbstractC0270y
    /* JADX INFO: renamed from: a */
    public Typeface mo1240a(Context context, AbstractC0162e.c cVar, Resources resources, int i7) {
        Object objM1239k = m1239k();
        for (AbstractC0162e.d dVar : cVar.m791a()) {
            File fileM1275d = AbstractC0271z.m1275d(context);
            if (fileM1275d == null) {
                return null;
            }
            try {
                if (!AbstractC0271z.m1273b(fileM1275d, resources, dVar.m793b())) {
                    return null;
                }
                if (!m1236h(objM1239k, fileM1275d.getPath(), dVar.m796e(), dVar.m797f())) {
                    return null;
                }
                fileM1275d.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileM1275d.delete();
            }
        }
        return m1237i(objM1239k);
    }
}
