package p212b6;

import p202a6.AbstractC2235a;
import p262h6.AbstractC5657c;
import p270i6.C5721a;

/* JADX INFO: renamed from: b6.a */
/* JADX INFO: loaded from: classes.dex */
public class C2973a extends AbstractC2235a {

    /* JADX INFO: renamed from: b6.a$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f12271a = new a();

        /* JADX INFO: renamed from: b */
        public static final Integer f12272b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f12272b = num2;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: c */
    private final boolean m14821c(int i7) {
        Integer num = a.f12272b;
        return num == null || num.intValue() >= i7;
    }

    @Override // p194Z5.AbstractC2166a
    /* JADX INFO: renamed from: b */
    public AbstractC5657c mo8787b() {
        return m14821c(34) ? new C5721a() : super.mo8787b();
    }
}
