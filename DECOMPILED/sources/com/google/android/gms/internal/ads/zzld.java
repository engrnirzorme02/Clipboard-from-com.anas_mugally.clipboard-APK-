package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzld {
    private static final zzup zzu = new zzup(new Object(), -1);
    public final zzbe zza;
    public final zzup zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzhz zzf;
    public final boolean zzg;
    public final zzwq zzh;
    public final zzyn zzi;
    public final List zzj;
    public final zzup zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzau zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzld(zzbe zzbeVar, zzup zzupVar, long j7, long j8, int i7, zzhz zzhzVar, boolean z7, zzwq zzwqVar, zzyn zzynVar, List list, zzup zzupVar2, boolean z8, int i8, int i9, zzau zzauVar, long j9, long j10, long j11, long j12, boolean z9) {
        this.zza = zzbeVar;
        this.zzb = zzupVar;
        this.zzc = j7;
        this.zzd = j8;
        this.zze = i7;
        this.zzf = zzhzVar;
        this.zzg = z7;
        this.zzh = zzwqVar;
        this.zzi = zzynVar;
        this.zzj = list;
        this.zzk = zzupVar2;
        this.zzl = z8;
        this.zzm = i8;
        this.zzn = i9;
        this.zzo = zzauVar;
        this.zzq = j9;
        this.zzr = j10;
        this.zzs = j11;
        this.zzt = j12;
    }

    public static zzld zza(zzyn zzynVar) {
        zzbe zzbeVar = zzbe.zza;
        zzup zzupVar = zzu;
        return new zzld(zzbeVar, zzupVar, -9223372036854775807L, 0L, 1, null, false, zzwq.zza, zzynVar, zzgjz.zzi(), zzupVar, false, 1, 0, zzau.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzup zzb() {
        return zzu;
    }

    public final zzld zzc(zzup zzupVar, long j7, long j8, long j9, long j10, zzwq zzwqVar, zzyn zzynVar, List list) {
        zzup zzupVar2 = this.zzk;
        boolean z7 = this.zzl;
        int i7 = this.zzm;
        int i8 = this.zzn;
        zzau zzauVar = this.zzo;
        long j11 = this.zzq;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new zzld(this.zza, zzupVar, j8, j9, this.zze, this.zzf, this.zzg, zzwqVar, zzynVar, list, zzupVar2, z7, i7, i8, zzauVar, j11, j10, j7, jElapsedRealtime, false);
    }

    public final zzld zzd(zzbe zzbeVar) {
        return new zzld(zzbeVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzld zze(int i7) {
        return new zzld(this.zza, this.zzb, this.zzc, this.zzd, i7, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzld zzf(zzhz zzhzVar) {
        return new zzld(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzhzVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzld zzg(boolean z7) {
        return new zzld(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, z7, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzld zzh(zzup zzupVar) {
        return new zzld(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzupVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzld zzi(boolean z7, int i7, int i8) {
        return new zzld(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z7, i7, i8, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzj() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
