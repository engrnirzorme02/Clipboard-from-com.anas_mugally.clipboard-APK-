package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcu;
import java.util.Objects;
import p283k3.EnumC6051v;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.a4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4187a4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ zzcu f15548a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4371x4 f15549b;

    RunnableC4187a4(C4371x4 c4371x4, zzcu zzcuVar) {
        this.f15548a = zzcuVar;
        Objects.requireNonNull(c4371x4);
        this.f15549b = c4371x4;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Long lValueOf;
        C4371x4 c4371x4 = this.f15549b;
        C4164X2 c4164x2 = c4371x4.f15066a.m18689z().f15066a;
        if (c4164x2.m18687x().m18495w().m18514o(EnumC6051v.ANALYTICS_STORAGE)) {
            if (!c4164x2.m18687x().m18486A(c4164x2.mo18425f().mo18159a()) && c4164x2.m18687x().f15184r.m18433a() != 0) {
                lValueOf = Long.valueOf(c4164x2.m18687x().f15184r.m18433a());
            }
            if (lValueOf == null) {
                c4371x4.f15066a.m18661C().m19391b0(this.f15548a, lValueOf.longValue());
            } else {
                try {
                    this.f15548a.zzb(null);
                    return;
                } catch (RemoteException e7) {
                    this.f15549b.f15066a.mo18421a().m18851o().m18835b("getSessionId failed with exception", e7);
                    return;
                }
            }
        }
        c4164x2.mo18421a().m18856t().m18834a("Analytics storage consent denied; will not get session id");
        lValueOf = null;
        if (lValueOf == null) {
            this.f15548a.zzb(null);
            return;
        }
        c4371x4.f15066a.m18661C().m19391b0(this.f15548a, lValueOf.longValue());
    }
}
