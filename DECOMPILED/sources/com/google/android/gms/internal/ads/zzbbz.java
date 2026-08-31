package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbbz {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    /* synthetic */ zzbbz(int i7, String str, Object obj, Object obj2, byte[] bArr) {
        this.zza = i7;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        C3250D.m17199b().zza(this);
    }

    public static zzbbz zzh(int i7, String str, int i8, int i9) {
        return new zzbbv(1, str, Integer.valueOf(i8), Integer.valueOf(i9));
    }

    public static zzbbz zzi(int i7, String str, long j7, long j8) {
        return new zzbbw(1, str, Long.valueOf(j7), Long.valueOf(j8));
    }

    public static zzbbz zzj(int i7, String str, float f7, float f8) {
        return new zzbbx(1, str, Float.valueOf(f7), Float.valueOf(f8));
    }

    public static zzbbz zzk(int i7, String str) {
        zzbby zzbbyVar = new zzbby(1, "gads:sdk_core_constants:experiment_id", null, null);
        C3250D.m17199b().zzb(zzbbyVar);
        return zzbbyVar;
    }

    public static zzbbz zzl(int i7, String str) {
        zzbby zzbbyVar = new zzbby(1, "gads:sdk_core_constants_service:experiment_id", null, null);
        C3250D.m17199b().zzc(zzbbyVar);
        return zzbbyVar;
    }

    public abstract Object zza(Bundle bundle);

    public abstract void zzb(SharedPreferences.Editor editor, Object obj);

    protected abstract Object zzc(JSONObject jSONObject);

    protected abstract Object zzd(SharedPreferences sharedPreferences);

    public final String zze() {
        return this.zzb;
    }

    public final Object zzf() {
        return C3250D.m17200c().zzb() ? this.zzd : this.zzc;
    }

    public final Object zzg() {
        return C3250D.m17200c().zzd(this);
    }

    public final int zzm() {
        return this.zza;
    }
}
