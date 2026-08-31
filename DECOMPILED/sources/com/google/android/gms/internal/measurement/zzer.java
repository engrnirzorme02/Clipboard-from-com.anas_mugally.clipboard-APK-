package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p283k3.InterfaceC6055z;

/* JADX INFO: loaded from: classes2.dex */
final class zzer extends zzcz {
    private final InterfaceC6055z zza;

    zzer(InterfaceC6055z interfaceC6055z) {
        this.zza = interfaceC6055z;
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final void zze(String str, String str2, Bundle bundle, long j7) {
        this.zza.mo18781a(str, str2, bundle, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final int zzf() {
        return System.identityHashCode(this.zza);
    }
}
