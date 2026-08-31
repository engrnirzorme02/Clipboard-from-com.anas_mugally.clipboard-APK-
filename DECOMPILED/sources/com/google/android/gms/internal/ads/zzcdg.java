package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzcdg implements zzga {
    private final zzga zza;
    private final long zzb;
    private final zzga zzc;
    private long zzd;
    private Uri zze;

    zzcdg(zzga zzgaVar, int i7, zzga zzgaVar2) {
        this.zza = zzgaVar;
        this.zzb = i7;
        this.zzc = zzgaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i7, int i8) {
        int i9;
        long j7 = this.zzd;
        long j8 = this.zzb;
        if (j7 < j8) {
            int iZza = this.zza.zza(bArr, i7, (int) Math.min(i8, j8 - j7));
            long j9 = this.zzd + ((long) iZza);
            this.zzd = j9;
            i9 = iZza;
            j7 = j9;
        } else {
            i9 = 0;
        }
        if (j7 < j8) {
            return i9;
        }
        int iZza2 = this.zzc.zza(bArr, i7 + i9, i8 - i9);
        int i10 = i9 + iZza2;
        this.zzd += (long) iZza2;
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) {
        Uri uri;
        zzge zzgeVar2;
        Uri uri2 = zzgeVar.zza;
        this.zze = uri2;
        long j7 = zzgeVar.zze;
        long j8 = this.zzb;
        zzge zzgeVar3 = null;
        if (j7 >= j8) {
            uri = uri2;
            zzgeVar2 = null;
        } else {
            long j9 = zzgeVar.zzf;
            long jMin = j8 - j7;
            if (j9 != -1) {
                jMin = Math.min(j9, jMin);
            }
            uri = uri2;
            zzgeVar2 = new zzge(uri, j7, jMin, null);
        }
        long j10 = zzgeVar.zzf;
        if (j10 == -1 || j7 + j10 > j8) {
            zzgeVar3 = new zzge(uri, Math.max(j8, j7), j10 != -1 ? Math.min(j10, (j7 + j10) - j8) : -1L, null);
        }
        long jZzb = zzgeVar2 != null ? this.zza.zzb(zzgeVar2) : 0L;
        long jZzb2 = zzgeVar3 != null ? this.zzc.zzb(zzgeVar3) : 0L;
        this.zzd = j7;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zze(zzgy zzgyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzga, com.google.android.gms.internal.ads.zzgt
    public final Map zzj() {
        return zzgkc.zza();
    }
}
