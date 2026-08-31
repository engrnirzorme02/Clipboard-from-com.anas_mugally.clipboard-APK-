package p336q6;

import java.util.concurrent.CancellationException;
import p318o6.AbstractC6679n0;

/* JADX INFO: renamed from: q6.p */
/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class AbstractC6860p {
    /* JADX INFO: renamed from: a */
    public static final void m30064a(InterfaceC6867w interfaceC6867w, Throwable th) {
        CancellationException cancellationExceptionM28241a = null;
        if (th != null) {
            cancellationExceptionM28241a = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionM28241a == null) {
                cancellationExceptionM28241a = AbstractC6679n0.m28241a("Channel was consumed, consumer had failed", th);
            }
        }
        interfaceC6867w.cancel(cancellationExceptionM28241a);
    }
}
