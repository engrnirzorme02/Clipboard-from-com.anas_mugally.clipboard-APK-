package p157U3;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: U3.h */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1676h {
    /* JADX INFO: renamed from: a */
    public static Object m7040a(Future future) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
