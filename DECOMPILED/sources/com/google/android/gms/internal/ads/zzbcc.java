package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbcc implements zzbey {
    final /* synthetic */ SharedPreferences zza;

    zzbcc(zzbcg zzbcgVar, SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
        Objects.requireNonNull(zzbcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final Boolean zza(String str, boolean z7) {
        try {
            return Boolean.valueOf(this.zza.getBoolean(str, z7));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.getString(str, String.valueOf(z7)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final Long zzb(String str, long j7) {
        try {
            return Long.valueOf(this.zza.getLong(str, j7));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.getInt(str, (int) j7));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final Double zzc(String str, double d7) {
        try {
            return Double.valueOf(this.zza.getFloat(str, (float) d7));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.zza.getString(str, String.valueOf(d7)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final String zzd(String str, String str2) {
        return this.zza.getString(str, str2);
    }
}
