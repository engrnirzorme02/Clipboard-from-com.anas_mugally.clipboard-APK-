package p122P3;

import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: renamed from: P3.l */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1208l {

    /* JADX INFO: renamed from: a */
    private static final Logger f4292a = Logger.getLogger(AbstractC1208l.class.getName());

    /* JADX INFO: renamed from: b */
    private static final InterfaceC1207k f4293b = m5287b();

    /* JADX INFO: renamed from: P3.l$b */
    private static final class b implements InterfaceC1207k {
        private b() {
        }
    }

    /* JADX INFO: renamed from: a */
    static String m5286a(double d7) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d7));
    }

    /* JADX INFO: renamed from: b */
    private static InterfaceC1207k m5287b() {
        return new b();
    }

    /* JADX INFO: renamed from: c */
    static boolean m5288c(String str) {
        return str == null || str.isEmpty();
    }
}
