package p081K;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: renamed from: K.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0711c {

    /* JADX INFO: renamed from: K.c$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static Object m3457a(Bundle bundle, String str, Class cls) {
            return bundle.getParcelable(str, cls);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m3456a(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.m3457a(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }
}
