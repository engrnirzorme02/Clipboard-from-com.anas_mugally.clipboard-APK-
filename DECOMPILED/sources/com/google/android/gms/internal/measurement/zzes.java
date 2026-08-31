package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p283k3.InterfaceC6018A;

/* JADX INFO: loaded from: classes2.dex */
final class zzes extends zzcz {
    private final InterfaceC6018A zza;

    zzes(InterfaceC6018A interfaceC6018A) {
        this.zza = interfaceC6018A;
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final void zze(String str, String str2, Bundle bundle, long j7) {
        this.zza.mo18430a(str, str2, bundle, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final int zzf() {
        return System.identityHashCode(this.zza);
    }
}
