package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC3596e;
import com.google.android.gms.location.AbstractC3976o;

/* JADX INFO: loaded from: classes2.dex */
final class zzaw extends zzaj {
    private InterfaceC3596e zza;

    public zzaw(InterfaceC3596e interfaceC3596e) {
        this.zza = interfaceC3596e;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i7, String[] strArr) {
        if (this.zza == null) {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times", new Exception());
            return;
        }
        this.zza.setResult(AbstractC3976o.m18405b(AbstractC3976o.m18404a(i7)));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i7, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult", new Exception());
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i7, PendingIntent pendingIntent) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult", new Exception());
    }
}
