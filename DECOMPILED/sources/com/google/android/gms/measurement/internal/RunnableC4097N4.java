package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzcu;
import java.util.List;
import java.util.Objects;
import p283k3.InterfaceC6033d;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.N4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4097N4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f15326a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15327b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4006B6 f15328c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ boolean f15329d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ zzcu f15330e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C4364w5 f15331f;

    RunnableC4097N4(C4364w5 c4364w5, String str, String str2, C4006B6 c4006b6, boolean z7, zzcu zzcuVar) {
        this.f15326a = str;
        this.f15327b = str2;
        this.f15328c = c4006b6;
        this.f15329d = z7;
        this.f15330e = zzcuVar;
        Objects.requireNonNull(c4364w5);
        this.f15331f = c4364w5;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e7;
        Bundle bundle2 = new Bundle();
        try {
            C4364w5 c4364w5 = this.f15331f;
            InterfaceC6033d interfaceC6033dM19215N = c4364w5.m19215N();
            if (interfaceC6033dM19215N == null) {
                C4164X2 c4164x2 = c4364w5.f15066a;
                c4164x2.mo18421a().m18851o().m18836c("Failed to get user properties; not connected to service", this.f15326a, this.f15327b);
                c4164x2.m18661C().m19395f0(this.f15330e, bundle2);
                return;
            }
            C4006B6 c4006b6 = this.f15328c;
            AbstractC3718s.m18083l(c4006b6);
            List<C4357v6> listMo18740t0 = interfaceC6033dM19215N.mo18740t0(this.f15326a, this.f15327b, this.f15329d, c4006b6);
            int i7 = C4389z6.f16275k;
            bundle = new Bundle();
            if (listMo18740t0 != null) {
                for (C4357v6 c4357v6 : listMo18740t0) {
                    String str = c4357v6.f16127e;
                    if (str != null) {
                        bundle.putString(c4357v6.f16124b, str);
                    } else {
                        Long l7 = c4357v6.f16126d;
                        if (l7 != null) {
                            bundle.putLong(c4357v6.f16124b, l7.longValue());
                        } else {
                            Double d7 = c4357v6.f16129r;
                            if (d7 != null) {
                                bundle.putDouble(c4357v6.f16124b, d7.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    c4364w5.m19211J();
                    C4164X2 c4164x3 = c4364w5.f15066a;
                    c4164x3.m18661C().m19395f0(this.f15330e, bundle);
                } catch (RemoteException e8) {
                    e7 = e8;
                    this.f15331f.f15066a.mo18421a().m18851o().m18836c("Failed to get user properties; remote exception", this.f15326a, e7);
                    C4364w5 c4364w6 = this.f15331f;
                    c4364w6.f15066a.m18661C().m19395f0(this.f15330e, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                C4364w5 c4364w7 = this.f15331f;
                c4364w7.f15066a.m18661C().m19395f0(this.f15330e, bundle2);
                throw th;
            }
        } catch (RemoteException e9) {
            bundle = bundle2;
            e7 = e9;
        } catch (Throwable th2) {
            th = th2;
            C4364w5 c4364w8 = this.f15331f;
            c4364w8.f15066a.m18661C().m19395f0(this.f15330e, bundle2);
            throw th;
        }
    }
}
