package p033E;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p025D.AbstractC0162e;
import p089L.AbstractC0776l;

/* JADX INFO: renamed from: E.u */
/* JADX INFO: loaded from: classes.dex */
public class C0266u extends AbstractC0265t {

    /* JADX INFO: renamed from: g */
    protected final Class f1002g;

    /* JADX INFO: renamed from: h */
    protected final Constructor f1003h;

    /* JADX INFO: renamed from: i */
    protected final Method f1004i;

    /* JADX INFO: renamed from: j */
    protected final Method f1005j;

    /* JADX INFO: renamed from: k */
    protected final Method f1006k;

    /* JADX INFO: renamed from: l */
    protected final Method f1007l;

    /* JADX INFO: renamed from: m */
    protected final Method f1008m;

    public C0266u() {
        Class clsM1255u;
        Constructor constructorM1256v;
        Method methodM1252r;
        Method methodM1253s;
        Method methodM1257w;
        Method methodM1251q;
        Method methodMo1254t;
        try {
            clsM1255u = m1255u();
            constructorM1256v = m1256v(clsM1255u);
            methodM1252r = m1252r(clsM1255u);
            methodM1253s = m1253s(clsM1255u);
            methodM1257w = m1257w(clsM1255u);
            methodM1251q = m1251q(clsM1255u);
            methodMo1254t = mo1254t(clsM1255u);
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e7.getClass().getName(), e7);
            clsM1255u = null;
            constructorM1256v = null;
            methodM1252r = null;
            methodM1253s = null;
            methodM1257w = null;
            methodM1251q = null;
            methodMo1254t = null;
        }
        this.f1002g = clsM1255u;
        this.f1003h = constructorM1256v;
        this.f1004i = methodM1252r;
        this.f1005j = methodM1253s;
        this.f1006k = methodM1257w;
        this.f1007l = methodM1251q;
        this.f1008m = methodMo1254t;
    }

    /* JADX INFO: renamed from: k */
    private Object m1241k() {
        try {
            return this.f1003h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    private void m1242l(Object obj) {
        try {
            this.f1007l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: m */
    private boolean m1243m(Context context, Object obj, String str, int i7, int i8, int i9, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1004i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    private boolean m1244n(Object obj, ByteBuffer byteBuffer, int i7, int i8, int i9) {
        try {
            return ((Boolean) this.f1005j.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i8), Integer.valueOf(i9))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: o */
    private boolean m1245o(Object obj) {
        try {
            return ((Boolean) this.f1006k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    private boolean m1246p() {
        if (this.f1004i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f1004i != null;
    }

    @Override // p033E.AbstractC0265t, p033E.AbstractC0270y
    /* JADX INFO: renamed from: a */
    public Typeface mo1240a(Context context, AbstractC0162e.c cVar, Resources resources, int i7) {
        if (!m1246p()) {
            return super.mo1240a(context, cVar, resources, i7);
        }
        Object objM1241k = m1241k();
        if (objM1241k == null) {
            return null;
        }
        AbstractC0162e.d[] dVarArrM791a = cVar.m791a();
        int length = dVarArrM791a.length;
        int i8 = 0;
        while (i8 < length) {
            AbstractC0162e.d dVar = dVarArrM791a[i8];
            Context context2 = context;
            if (!m1243m(context2, objM1241k, dVar.m792a(), dVar.m794c(), dVar.m796e(), dVar.m797f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.m795d()))) {
                m1242l(objM1241k);
                return null;
            }
            i8++;
            context = context2;
        }
        if (m1245o(objM1241k)) {
            return mo1250i(objM1241k);
        }
        return null;
    }

    @Override // p033E.AbstractC0270y
    /* JADX INFO: renamed from: b */
    public Typeface mo1247b(Context context, CancellationSignal cancellationSignal, AbstractC0776l.b[] bVarArr, int i7) {
        Typeface typefaceMo1250i;
        Object obj;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m1246p()) {
            AbstractC0776l.b bVarMo1262g = mo1262g(bVarArr, i7);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarMo1262g.m3649e(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarMo1262g.m3651g()).setItalic(bVarMo1262g.m3652h()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map mapM1277f = AbstractC0271z.m1277f(context, bVarArr, cancellationSignal);
        Object objM1241k = m1241k();
        if (objM1241k == null) {
            return null;
        }
        int length = bVarArr.length;
        int i8 = 0;
        boolean z7 = false;
        while (i8 < length) {
            AbstractC0776l.b bVar = bVarArr[i8];
            ByteBuffer byteBuffer = (ByteBuffer) mapM1277f.get(bVar.m3649e());
            if (byteBuffer == null) {
                obj = objM1241k;
            } else {
                boolean zM1244n = m1244n(objM1241k, byteBuffer, bVar.m3648d(), bVar.m3651g(), bVar.m3652h() ? 1 : 0);
                obj = objM1241k;
                if (!zM1244n) {
                    m1242l(obj);
                    return null;
                }
                z7 = true;
            }
            i8++;
            objM1241k = obj;
            z7 = z7;
        }
        Object obj2 = objM1241k;
        if (!z7) {
            m1242l(obj2);
            return null;
        }
        if (m1245o(obj2) && (typefaceMo1250i = mo1250i(obj2)) != null) {
            return Typeface.create(typefaceMo1250i, i7);
        }
        return null;
    }

    @Override // p033E.AbstractC0270y
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ Typeface mo1248c(Context context, CancellationSignal cancellationSignal, List list, int i7) {
        return super.mo1248c(context, cancellationSignal, list, i7);
    }

    @Override // p033E.AbstractC0270y
    /* JADX INFO: renamed from: d */
    public Typeface mo1249d(Context context, Resources resources, int i7, String str, int i8) {
        if (!m1246p()) {
            return super.mo1249d(context, resources, i7, str, i8);
        }
        Object objM1241k = m1241k();
        if (objM1241k == null) {
            return null;
        }
        if (!m1243m(context, objM1241k, str, 0, -1, -1, null)) {
            m1242l(objM1241k);
            return null;
        }
        if (m1245o(objM1241k)) {
            return mo1250i(objM1241k);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    protected Typeface mo1250i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f1002g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f1008m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    protected Method m1251q(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* JADX INFO: renamed from: r */
    protected Method m1252r(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: s */
    protected Method m1253s(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* JADX INFO: renamed from: t */
    protected Method mo1254t(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: u */
    protected Class m1255u() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* JADX INFO: renamed from: v */
    protected Constructor m1256v(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* JADX INFO: renamed from: w */
    protected Method m1257w(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
