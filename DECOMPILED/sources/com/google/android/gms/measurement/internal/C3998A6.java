package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzda;
import java.util.Objects;
import p283k3.InterfaceC6018A;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.A6 */
/* JADX INFO: loaded from: classes2.dex */
final class C3998A6 implements InterfaceC6018A {

    /* JADX INFO: renamed from: a */
    public final zzda f15076a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f15077b;

    C3998A6(AppMeasurementDynamiteService appMeasurementDynamiteService, zzda zzdaVar) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f15077b = appMeasurementDynamiteService;
        this.f15076a = zzdaVar;
    }

    @Override // p283k3.InterfaceC6018A
    /* JADX INFO: renamed from: a */
    public final void mo18430a(String str, String str2, Bundle bundle, long j7) {
        try {
            this.f15076a.zze(str, str2, bundle, j7);
        } catch (RemoteException e7) {
            C4164X2 c4164x2 = this.f15077b.f15078a;
            if (c4164x2 != null) {
                c4164x2.mo18421a().m18854r().m18835b("Event listener threw exception", e7);
            }
        }
    }
}
