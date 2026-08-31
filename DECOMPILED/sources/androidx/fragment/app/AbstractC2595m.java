package androidx.fragment.app;

import androidx.collection.C2400k;

/* JADX INFO: renamed from: androidx.fragment.app.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2595m {

    /* JADX INFO: renamed from: a */
    private static final C2400k f10224a = new C2400k();

    /* JADX INFO: renamed from: b */
    static boolean m12264b(ClassLoader classLoader, String str) {
        try {
            return AbstractComponentCallbacksC2591i.class.isAssignableFrom(m12265c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private static Class m12265c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C2400k c2400k = f10224a;
        C2400k c2400k2 = (C2400k) c2400k.get(classLoader);
        if (c2400k2 == null) {
            c2400k2 = new C2400k();
            c2400k.put(classLoader, c2400k2);
        }
        Class cls = (Class) c2400k2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c2400k2.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: d */
    public static Class m12266d(ClassLoader classLoader, String str) {
        try {
            return m12265c(classLoader, str);
        } catch (ClassCastException e7) {
            throw new AbstractComponentCallbacksC2591i.l("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e7);
        } catch (ClassNotFoundException e8) {
            throw new AbstractComponentCallbacksC2591i.l("Unable to instantiate fragment " + str + ": make sure class name exists", e8);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractComponentCallbacksC2591i mo12267a(ClassLoader classLoader, String str);
}
