package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzbp;
import com.google.android.gms.internal.measurement.zzbq;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.G2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ServiceConnectionC4042G2 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final String f15225a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4050H2 f15226b;

    ServiceConnectionC4042G2(C4050H2 c4050h2, String str) {
        Objects.requireNonNull(c4050h2);
        this.f15226b = c4050h2;
        this.f15225a = str;
    }

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String m18520a() {
        return this.f15225a;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f15226b.f15243a.mo18421a().m18854r().m18834a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzbq zzbqVarZzb = zzbp.zzb(iBinder);
            if (zzbqVarZzb == null) {
                this.f15226b.f15243a.mo18421a().m18854r().m18834a("Install Referrer Service implementation was not found");
                return;
            }
            C4164X2 c4164x2 = this.f15226b.f15243a;
            c4164x2.mo18421a().m18859w().m18834a("Install Referrer Service connected");
            c4164x2.mo18422b().m18639t(new RunnableC4034F2(this, zzbqVarZzb, this));
        } catch (RuntimeException e7) {
            this.f15226b.f15243a.mo18421a().m18854r().m18835b("Exception occurred while calling Install Referrer API", e7);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f15226b.f15243a.mo18421a().m18859w().m18834a("Install Referrer Service disconnected");
    }
}
