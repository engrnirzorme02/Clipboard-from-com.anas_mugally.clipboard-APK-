package p220c6;

import java.io.Closeable;
import java.io.IOException;
import p145S5.AbstractC1423a;

/* JADX INFO: renamed from: c6.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3026b {
    /* JADX INFO: renamed from: a */
    public static final void m14999a(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC1423a.m6060a(th, th2);
            }
        }
    }
}
