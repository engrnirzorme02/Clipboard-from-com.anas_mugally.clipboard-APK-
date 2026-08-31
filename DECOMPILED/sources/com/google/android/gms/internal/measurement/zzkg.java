package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p122P3.InterfaceC1201e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkg {
    final Uri zza;
    final String zzb;
    final String zzc;
    final boolean zzd;
    final boolean zze;

    private zzkg(String str, Uri uri, String str2, String str3, boolean z7, boolean z8, boolean z9, boolean z10, InterfaceC1201e interfaceC1201e) {
        this.zza = uri;
        this.zzb = "";
        this.zzc = "";
        this.zzd = z7;
        this.zze = z9;
    }

    public final zzkg zza() {
        String str = this.zzb;
        if (str.isEmpty()) {
            return new zzkg(null, this.zza, str, this.zzc, true, false, this.zze, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzkg zzb() {
        return new zzkg(null, this.zza, this.zzb, this.zzc, this.zzd, false, true, false, null);
    }

    public final zzkm zzc(String str, long j7) {
        Long lValueOf = Long.valueOf(j7);
        int i7 = zzkm.zzc;
        return new zzkc(this, str, lValueOf, true);
    }

    public final zzkm zzd(String str, boolean z7) {
        Boolean boolValueOf = Boolean.valueOf(z7);
        int i7 = zzkm.zzc;
        return new zzkd(this, str, boolValueOf, true);
    }

    public final zzkm zze(String str, double d7) {
        Double dValueOf = Double.valueOf(-3.0d);
        int i7 = zzkm.zzc;
        return new zzke(this, "measurement.test.double_flag", dValueOf, true);
    }

    public final zzkm zzf(String str, String str2) {
        int i7 = zzkm.zzc;
        return new zzkf(this, str, str2, true);
    }

    public zzkg(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
