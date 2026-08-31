package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewu {
    private final zzbuv zza;
    private final int zzb;

    public zzewu(zzbuv zzbuvVar, int i7) {
        this.zza = zzbuvVar;
        this.zzb = i7;
    }

    public final String zza() {
        return this.zza.zzd;
    }

    public final String zzb() {
        return zzghs.zza(this.zza.zza.getString("ms"));
    }

    public final PackageInfo zzc() {
        return this.zza.zzf;
    }

    public final List zzd() {
        return this.zza.zze;
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final int zzf() {
        return this.zzb;
    }

    final boolean zzg() {
        return this.zza.zzk;
    }

    final boolean zzh() {
        return this.zza.zzl;
    }

    final int zzi() {
        Bundle bundle = this.zza.zza.getBundle("extras");
        if (bundle != null && !bundle.isEmpty()) {
            switch (bundle.getString("query_info_type", "")) {
                case "requester_type_0":
                    return 0;
                case "requester_type_1":
                    return 1;
                case "requester_type_2":
                    return 2;
                case "requester_type_3":
                    return 3;
                case "requester_type_4":
                    return 4;
                case "requester_type_5":
                    return 5;
                case "requester_type_6":
                    return 6;
                case "requester_type_7":
                    return 7;
                case "requester_type_8":
                    return 8;
            }
        }
        return -1;
    }

    final int zzj() {
        return this.zza.zzo;
    }
}
