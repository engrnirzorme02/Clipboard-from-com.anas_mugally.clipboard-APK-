package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractRunnableC4764H;
import com.google.android.play.integrity.internal.C4777g;
import com.google.android.play.integrity.internal.InterfaceC4758B;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.af */
/* JADX INFO: loaded from: classes2.dex */
final class C4687af extends AbstractRunnableC4764H {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ byte[] f18239a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Long f18240b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ TaskCompletionSource f18241c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ IntegrityTokenRequest f18242d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4691aj f18243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4687af(C4691aj c4691aj, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l7, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f18243e = c4691aj;
        this.f18239a = bArr;
        this.f18240b = l7;
        this.f18241c = taskCompletionSource2;
        this.f18242d = integrityTokenRequest;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC4764H
    /* JADX INFO: renamed from: a */
    public final void mo21833a(Exception exc) {
        if (exc instanceof C4777g) {
            super.mo21833a(new IntegrityServiceException(-9, exc));
        } else {
            super.mo21833a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC4764H
    /* JADX INFO: renamed from: b */
    protected final void mo21834b() {
        try {
            ((InterfaceC4758B) this.f18243e.f18253a.m21918e()).mo21887i(C4691aj.m21837a(this.f18243e, this.f18239a, this.f18240b, null), new BinderC4690ai(this.f18243e, this.f18241c));
        } catch (RemoteException e7) {
            this.f18243e.f18254b.m21892c(e7, "requestIntegrityToken(%s)", this.f18242d);
            this.f18241c.trySetException(new IntegrityServiceException(-100, e7));
        }
    }
}
