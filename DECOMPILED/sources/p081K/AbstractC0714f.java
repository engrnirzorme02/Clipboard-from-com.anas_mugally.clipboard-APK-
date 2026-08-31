package p081K;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: renamed from: K.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0714f {

    /* JADX INFO: renamed from: K.f$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static LocaleList m3466a(Configuration configuration) {
            return configuration.getLocales();
        }

        /* JADX INFO: renamed from: b */
        static void m3467b(Configuration configuration, C0718j c0718j) {
            configuration.setLocales((LocaleList) c0718j.m3479h());
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0718j m3464a(Configuration configuration) {
        return C0718j.m3474i(a.m3466a(configuration));
    }

    /* JADX INFO: renamed from: b */
    public static void m3465b(Configuration configuration, C0718j c0718j) {
        a.m3467b(configuration, c0718j);
    }
}
