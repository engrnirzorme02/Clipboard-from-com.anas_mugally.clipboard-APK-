package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbd {
    public static final Object zza = new Object();
    private static final zzaj zzp;

    @Deprecated
    public Object zzc;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;
    public zzae zzj;
    public boolean zzk;
    public long zzl;
    public long zzm;
    public int zzn;
    public int zzo;
    public Object zzb = zza;
    public zzaj zzd = zzp;

    static {
        zzy zzyVar = new zzy();
        zzyVar.zza("androidx.media3.common.Timeline");
        zzyVar.zzb(Uri.EMPTY);
        zzp = zzyVar.zzc();
        String str = zzeo.zza;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbd.class.equals(obj.getClass())) {
            zzbd zzbdVar = (zzbd) obj;
            if (Objects.equals(this.zzb, zzbdVar.zzb) && Objects.equals(this.zzd, zzbdVar.zzd) && Objects.equals(this.zzj, zzbdVar.zzj) && this.zze == zzbdVar.zze && this.zzf == zzbdVar.zzf && this.zzg == zzbdVar.zzg && this.zzh == zzbdVar.zzh && this.zzi == zzbdVar.zzi && this.zzk == zzbdVar.zzk && this.zzm == zzbdVar.zzm && this.zzn == zzbdVar.zzn && this.zzo == zzbdVar.zzo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.zzb.hashCode() + 217) * 31) + this.zzd.hashCode();
        zzae zzaeVar = this.zzj;
        int iHashCode2 = ((iHashCode * 961) + (zzaeVar == null ? 0 : zzaeVar.hashCode())) * 31;
        long j7 = this.zze;
        int i7 = (iHashCode2 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.zzf;
        int i8 = (i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.zzg;
        int i9 = ((((((i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzk ? 1 : 0);
        long j10 = this.zzm;
        return ((((((i9 * 961) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.zzn) * 31) + this.zzo) * 31;
    }

    public final zzbd zza(Object obj, zzaj zzajVar, Object obj2, long j7, long j8, long j9, boolean z7, boolean z8, zzae zzaeVar, long j10, long j11, int i7, int i8, long j12) {
        this.zzb = obj;
        if (zzajVar == null) {
            zzajVar = zzp;
        }
        this.zzd = zzajVar;
        this.zzc = null;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = z7;
        this.zzi = z8;
        this.zzj = zzaeVar;
        this.zzl = 0L;
        this.zzm = j11;
        this.zzn = 0;
        this.zzo = 0;
        this.zzk = false;
        return this;
    }

    public final boolean zzb() {
        return this.zzj != null;
    }
}
