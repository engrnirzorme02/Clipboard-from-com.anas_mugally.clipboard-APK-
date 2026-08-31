package p202a6;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC6118n;
import p194Z5.AbstractC2166a;

/* JADX INFO: renamed from: a6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2235a extends AbstractC2166a {

    /* JADX INFO: renamed from: a6.a$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f7209a = new a();

        /* JADX INFO: renamed from: b */
        public static final Integer f7210b;

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
            f7210b = num2;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: c */
    private final boolean m9051c(int i7) {
        Integer num = a.f7210b;
        return num == null || num.intValue() >= i7;
    }

    @Override // p194Z5.AbstractC2166a
    /* JADX INFO: renamed from: a */
    public void mo8786a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        AbstractC6118n.m27187e(cause, "cause");
        AbstractC6118n.m27187e(exception, "exception");
        if (m9051c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.mo8786a(cause, exception);
        }
    }
}
