package com.google.android.gms.internal.location;

import androidx.appcompat.app.AbstractC2263x;
import com.google.android.gms.common.api.internal.C3610l;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: loaded from: classes2.dex */
final class zzaq implements C3610l.b {
    final /* synthetic */ LocationAvailability zza;

    zzaq(zzar zzarVar, LocationAvailability locationAvailability) {
        this.zza = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.C3610l.b
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        AbstractC2263x.m9328a(obj);
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.C3610l.b
    public final void onNotifyListenerFailed() {
    }
}
