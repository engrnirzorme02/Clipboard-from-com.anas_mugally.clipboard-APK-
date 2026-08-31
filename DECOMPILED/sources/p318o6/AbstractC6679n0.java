package p318o6;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: o6.n0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6679n0 {
    /* JADX INFO: renamed from: a */
    public static final CancellationException m28241a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
