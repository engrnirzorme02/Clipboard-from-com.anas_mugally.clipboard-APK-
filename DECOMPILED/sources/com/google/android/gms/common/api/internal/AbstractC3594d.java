package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.InterfaceC3643m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3594d extends BasePendingResult implements InterfaceC3596e {
    private final C3553a api;
    private final C3553a.c clientKey;

    protected AbstractC3594d(C3553a c3553a, AbstractC3560h abstractC3560h) {
        super((AbstractC3560h) AbstractC3718s.m18084m(abstractC3560h, "GoogleApiClient must not be null"));
        AbstractC3718s.m18084m(c3553a, "Api must not be null");
        this.clientKey = c3553a.m17749b();
        this.api = c3553a;
    }

    /* JADX INFO: renamed from: c */
    private void m17863c(RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    protected abstract void doExecute(C3553a.b bVar);

    public final C3553a getApi() {
        return this.api;
    }

    public final C3553a.c getClientKey() {
        return this.clientKey;
    }

    protected void onSetFailedResult(InterfaceC3643m interfaceC3643m) {
    }

    public final void run(C3553a.b bVar) throws DeadObjectException {
        try {
            doExecute(bVar);
        } catch (DeadObjectException e7) {
            m17863c(e7);
            throw e7;
        } catch (RemoteException e8) {
            m17863c(e8);
        }
    }

    public final void setFailedResult(Status status) {
        AbstractC3718s.m18073b(!status.m17747X(), "Failed result must not be success");
        InterfaceC3643m interfaceC3643mCreateFailedResult = createFailedResult(status);
        setResult(interfaceC3643mCreateFailedResult);
        onSetFailedResult(interfaceC3643mCreateFailedResult);
    }
}
