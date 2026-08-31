package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeuw implements zzeun {
    private final int zza;
    private final int zzb;

    zzeuw(int i7, int i8) {
        this.zza = i7;
        this.zzb = i8;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i7;
        Bundle bundle = ((zzcuu) obj).zza;
        int i8 = this.zza;
        if (i8 == -1 || (i7 = this.zzb) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i8);
        bundle.putInt("crashes_without_flags", i7);
        int i9 = C3244B.f13870g;
        if (C3250D.m17200c().zzc()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
