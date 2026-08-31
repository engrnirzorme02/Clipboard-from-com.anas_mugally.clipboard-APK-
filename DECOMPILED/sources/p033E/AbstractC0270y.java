package p033E;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.google.android.gms.common.api.C3553a;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p025D.AbstractC0162e;
import p089L.AbstractC0776l;

/* JADX INFO: renamed from: E.y */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0270y {

    /* JADX INFO: renamed from: a */
    private ConcurrentHashMap f1009a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: E.y$a */
    class a implements b {
        a() {
        }

        @Override // p033E.AbstractC0270y.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo1268a(AbstractC0776l.b bVar) {
            return bVar.m3651g();
        }

        @Override // p033E.AbstractC0270y.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo1269b(AbstractC0776l.b bVar) {
            return bVar.m3652h();
        }
    }

    /* JADX INFO: renamed from: E.y$b */
    private interface b {
        /* JADX INFO: renamed from: a */
        int mo1268a(Object obj);

        /* JADX INFO: renamed from: b */
        boolean mo1269b(Object obj);
    }

    AbstractC0270y() {
    }

    /* JADX INFO: renamed from: e */
    private static Object m1266e(Object[] objArr, int i7, b bVar) {
        return m1267f(objArr, (i7 & 1) == 0 ? 400 : 700, (i7 & 2) != 0, bVar);
    }

    /* JADX INFO: renamed from: f */
    private static Object m1267f(Object[] objArr, int i7, boolean z7, b bVar) {
        Object obj = null;
        int i8 = C3553a.e.API_PRIORITY_OTHER;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(bVar.mo1268a(obj2) - i7) * 2) + (bVar.mo1269b(obj2) == z7 ? 0 : 1);
            if (obj == null || i8 > iAbs) {
                obj = obj2;
                i8 = iAbs;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public abstract Typeface mo1240a(Context context, AbstractC0162e.c cVar, Resources resources, int i7);

    /* JADX INFO: renamed from: b */
    public abstract Typeface mo1247b(Context context, CancellationSignal cancellationSignal, AbstractC0776l.b[] bVarArr, int i7);

    /* JADX INFO: renamed from: c */
    public Typeface mo1248c(Context context, CancellationSignal cancellationSignal, List list, int i7) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /* JADX INFO: renamed from: d */
    public Typeface mo1249d(Context context, Resources resources, int i7, String str, int i8) {
        File fileM1275d = AbstractC0271z.m1275d(context);
        if (fileM1275d == null) {
            return null;
        }
        try {
            if (AbstractC0271z.m1273b(fileM1275d, resources, i7)) {
                return Typeface.createFromFile(fileM1275d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM1275d.delete();
        }
    }

    /* JADX INFO: renamed from: g */
    protected AbstractC0776l.b mo1262g(AbstractC0776l.b[] bVarArr, int i7) {
        return (AbstractC0776l.b) m1266e(bVarArr, i7, new a());
    }
}
