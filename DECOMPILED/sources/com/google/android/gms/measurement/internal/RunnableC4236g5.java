package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzcu;
import java.util.ArrayList;
import java.util.Objects;
import p283k3.InterfaceC6033d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g5 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4236g5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f15782a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15783b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4006B6 f15784c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ zzcu f15785d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4364w5 f15786e;

    RunnableC4236g5(C4364w5 c4364w5, String str, String str2, C4006B6 c4006b6, zzcu zzcuVar) {
        this.f15782a = str;
        this.f15783b = str2;
        this.f15784c = c4006b6;
        this.f15785d = zzcuVar;
        Objects.requireNonNull(c4364w5);
        this.f15786e = c4364w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcu zzcuVar;
        C4389z6 c4389z6M18661C;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                C4364w5 c4364w5 = this.f15786e;
                InterfaceC6033d interfaceC6033dM19215N = c4364w5.m19215N();
                if (interfaceC6033dM19215N == null) {
                    C4164X2 c4164x2 = c4364w5.f15066a;
                    c4164x2.mo18421a().m18851o().m18836c("Failed to get conditional properties; not connected to service", this.f15782a, this.f15783b);
                    c4389z6M18661C = c4164x2.m18661C();
                    zzcuVar = this.f15785d;
                } else {
                    C4006B6 c4006b6 = this.f15784c;
                    AbstractC3718s.m18083l(c4006b6);
                    arrayList = C4389z6.m19360h0(interfaceC6033dM19215N.mo18745y0(this.f15782a, this.f15783b, c4006b6));
                    c4364w5.m19211J();
                    C4364w5 c4364w6 = this.f15786e;
                    zzcuVar = this.f15785d;
                    c4389z6M18661C = c4364w6.f15066a.m18661C();
                }
            } catch (RemoteException e7) {
                this.f15786e.f15066a.mo18421a().m18851o().m18837d("Failed to get conditional properties; remote exception", this.f15782a, this.f15783b, e7);
            }
            c4389z6M18661C.m19396g0(zzcuVar, arrayList);
        } catch (Throwable th) {
            C4364w5 c4364w7 = this.f15786e;
            c4364w7.f15066a.m18661C().m19396g0(this.f15785d, arrayList);
            throw th;
        }
    }
}
