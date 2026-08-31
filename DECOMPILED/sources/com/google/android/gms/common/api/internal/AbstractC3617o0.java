package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.o0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3617o0 {

    /* JADX INFO: renamed from: a */
    public final int f14679a;

    public AbstractC3617o0(int i7) {
        this.f14679a = i7;
    }

    /* JADX INFO: renamed from: e */
    static /* bridge */ /* synthetic */ Status m17933e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo17908a(Status status);

    /* JADX INFO: renamed from: b */
    public abstract void mo17909b(Exception exc);

    /* JADX INFO: renamed from: c */
    public abstract void mo17910c(C3574L c3574l);

    /* JADX INFO: renamed from: d */
    public abstract void mo17930d(C3563B c3563b, boolean z7);
}
