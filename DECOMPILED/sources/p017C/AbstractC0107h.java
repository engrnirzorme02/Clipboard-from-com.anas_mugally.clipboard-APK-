package p017C;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import p081K.C0718j;

/* JADX INFO: renamed from: C.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0107h {

    /* JADX INFO: renamed from: C.h$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static LocaleList m423a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0718j m421a(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return C0718j.m3472b(AbstractC0104e.m407b(context));
        }
        Object objM422b = m422b(context);
        return objM422b != null ? C0718j.m3474i(a.m423a(objM422b)) : C0718j.m3473d();
    }

    /* JADX INFO: renamed from: b */
    private static Object m422b(Context context) {
        return context.getSystemService("locale");
    }
}
