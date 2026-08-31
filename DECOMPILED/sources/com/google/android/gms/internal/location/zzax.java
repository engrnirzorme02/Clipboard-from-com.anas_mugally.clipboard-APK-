package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC3596e;
import com.google.android.gms.location.AbstractC3976o;

/* JADX INFO: loaded from: classes2.dex */
final class zzax extends zzaj {
    private InterfaceC3596e zza;

    public zzax(InterfaceC3596e interfaceC3596e) {
        this.zza = interfaceC3596e;
    }

    private final void zze(int i7) {
        if (this.zza == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times", new Exception());
            return;
        }
        this.zza.setResult(AbstractC3976o.m18405b(AbstractC3976o.m18404a(i7)));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i7, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult", new Exception());
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i7, String[] strArr) {
        zze(i7);
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i7, PendingIntent pendingIntent) {
        zze(i7);
    }
}
