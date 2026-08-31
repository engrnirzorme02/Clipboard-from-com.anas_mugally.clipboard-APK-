package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C3554b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.i0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC3605i0 extends AbstractC3583V {

    /* JADX INFO: renamed from: b */
    protected final TaskCompletionSource f14661b;

    public AbstractC3605i0(int i7, TaskCompletionSource taskCompletionSource) {
        super(i7);
        this.f14661b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3617o0
    /* JADX INFO: renamed from: a */
    public final void mo17908a(Status status) {
        this.f14661b.trySetException(new C3554b(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3617o0
    /* JADX INFO: renamed from: b */
    public final void mo17909b(Exception exc) {
        this.f14661b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3617o0
    /* JADX INFO: renamed from: c */
    public final void mo17910c(C3574L c3574l) throws DeadObjectException {
        try {
            mo17911h(c3574l);
        } catch (DeadObjectException e7) {
            mo17908a(AbstractC3617o0.m17933e(e7));
            throw e7;
        } catch (RemoteException e8) {
            mo17908a(AbstractC3617o0.m17933e(e8));
        } catch (RuntimeException e9) {
            this.f14661b.trySetException(e9);
        }
    }

    /* JADX INFO: renamed from: h */
    protected abstract void mo17911h(C3574L c3574l);
}
