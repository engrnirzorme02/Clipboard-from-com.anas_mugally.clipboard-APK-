package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p170W2.C1839d;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3613m0 extends AbstractC3583V {

    /* JADX INFO: renamed from: b */
    private final AbstractC3632w f14675b;

    /* JADX INFO: renamed from: c */
    private final TaskCompletionSource f14676c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC3628u f14677d;

    public C3613m0(int i7, AbstractC3632w abstractC3632w, TaskCompletionSource taskCompletionSource, InterfaceC3628u interfaceC3628u) {
        super(i7);
        this.f14676c = taskCompletionSource;
        this.f14675b = abstractC3632w;
        this.f14677d = interfaceC3628u;
        if (i7 == 2 && abstractC3632w.m17943c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3617o0
    /* JADX INFO: renamed from: a */
    public final void mo17908a(Status status) {
        this.f14676c.trySetException(this.f14677d.mo17854a(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3617o0
    /* JADX INFO: renamed from: b */
    public final void mo17909b(Exception exc) {
        this.f14676c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3617o0
    /* JADX INFO: renamed from: c */
    public final void mo17910c(C3574L c3574l) throws DeadObjectException {
        try {
            this.f14675b.mo17869b(c3574l.m17834s(), this.f14676c);
        } catch (DeadObjectException e7) {
            throw e7;
        } catch (RemoteException e8) {
            mo17908a(AbstractC3617o0.m17933e(e8));
        } catch (RuntimeException e9) {
            this.f14676c.trySetException(e9);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3617o0
    /* JADX INFO: renamed from: d */
    public final void mo17930d(C3563B c3563b, boolean z7) {
        c3563b.m17784d(this.f14676c, z7);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3583V
    /* JADX INFO: renamed from: f */
    public final boolean mo17850f(C3574L c3574l) {
        return this.f14675b.m17943c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3583V
    /* JADX INFO: renamed from: g */
    public final C1839d[] mo17851g(C3574L c3574l) {
        return this.f14675b.m17945e();
    }
}
