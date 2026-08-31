package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcu;
import java.util.Objects;
import p283k3.InterfaceC6033d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.Z4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4180Z4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4039G f15535a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15536b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ zzcu f15537c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C4364w5 f15538d;

    RunnableC4180Z4(C4364w5 c4364w5, C4039G c4039g, String str, zzcu zzcuVar) {
        this.f15535a = c4039g;
        this.f15536b = str;
        this.f15537c = zzcuVar;
        Objects.requireNonNull(c4364w5);
        this.f15538d = c4364w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcu zzcuVar;
        C4389z6 c4389z6M18661C;
        byte[] bArrMo18731T = null;
        try {
            try {
                C4364w5 c4364w5 = this.f15538d;
                InterfaceC6033d interfaceC6033dM19215N = c4364w5.m19215N();
                if (interfaceC6033dM19215N == null) {
                    C4164X2 c4164x2 = c4364w5.f15066a;
                    c4164x2.mo18421a().m18851o().m18834a("Discarding data. Failed to send event to service to bundle");
                    c4389z6M18661C = c4164x2.m18661C();
                    zzcuVar = this.f15537c;
                } else {
                    bArrMo18731T = interfaceC6033dM19215N.mo18731T(this.f15535a, this.f15536b);
                    c4364w5.m19211J();
                    C4364w5 c4364w6 = this.f15538d;
                    zzcuVar = this.f15537c;
                    c4389z6M18661C = c4364w6.f15066a.m18661C();
                }
            } catch (RemoteException e7) {
                this.f15538d.f15066a.mo18421a().m18851o().m18835b("Failed to send event to the service to bundle", e7);
            }
            c4389z6M18661C.m19393d0(zzcuVar, bArrMo18731T);
        } catch (Throwable th) {
            C4364w5 c4364w7 = this.f15538d;
            c4364w7.f15066a.m18661C().m19393d0(this.f15537c, null);
            throw th;
        }
    }
}
