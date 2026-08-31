package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3611l0 extends AbstractC3617o0 {

    /* JADX INFO: renamed from: b */
    protected final AbstractC3594d f14674b;

    public C3611l0(int i7, AbstractC3594d abstractC3594d) {
        super(i7);
        this.f14674b = (AbstractC3594d) AbstractC3718s.m18084m(abstractC3594d, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3617o0
    /* JADX INFO: renamed from: a */
    public final void mo17908a(Status status) {
        try {
            this.f14674b.setFailedResult(status);
        } catch (IllegalStateException e7) {
            Log.w("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3617o0
    /* JADX INFO: renamed from: b */
    public final void mo17909b(Exception exc) {
        try {
            this.f14674b.setFailedResult(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e7) {
            Log.w("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3617o0
    /* JADX INFO: renamed from: c */
    public final void mo17910c(C3574L c3574l) throws DeadObjectException {
        try {
            this.f14674b.run(c3574l.m17834s());
        } catch (RuntimeException e7) {
            mo17909b(e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3617o0
    /* JADX INFO: renamed from: d */
    public final void mo17930d(C3563B c3563b, boolean z7) {
        c3563b.m17783c(this.f14674b, z7);
    }
}
