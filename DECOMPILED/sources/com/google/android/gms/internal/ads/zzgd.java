package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgd {
    private Uri zza;
    private Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    /* synthetic */ zzgd(zzge zzgeVar, byte[] bArr) {
        this.zza = zzgeVar.zza;
        this.zzb = zzgeVar.zzd;
        this.zzc = zzgeVar.zze;
        this.zzd = zzgeVar.zzf;
        this.zze = zzgeVar.zzg;
    }

    public final zzgd zza(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzgd zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzgd zzc(long j7) {
        this.zzc = j7;
        return this;
    }

    public final zzgd zzd(int i7) {
        this.zze = 6;
        return this;
    }

    public final zzge zze() {
        zzghc.zzk(this.zza, "The uri must be set.");
        return new zzge(this.zza, 0L, 1, null, this.zzb, this.zzc, this.zzd, null, this.zze, null, null);
    }

    public zzgd() {
        this.zzb = Collections.EMPTY_MAP;
        this.zzd = -1L;
    }
}
