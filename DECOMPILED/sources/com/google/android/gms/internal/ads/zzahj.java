package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzahj implements zzahi {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzahj(long[] jArr, long[] jArr2, long j7, long j8, long j9, int i7) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j7;
        this.zzd = j9;
        this.zze = i7;
    }

    public static zzahj zzd(long j7, long j8, zzado zzadoVar, zzef zzefVar) {
        int iZzs;
        zzef zzefVar2 = zzefVar;
        zzefVar2.zzk(6);
        int iZzB = zzefVar2.zzB();
        long j9 = zzadoVar.zzc;
        long j10 = iZzB;
        int iZzB2 = zzefVar2.zzB();
        if (iZzB2 <= 0) {
            return null;
        }
        long jZzr = zzeo.zzr((((long) iZzB2) * ((long) zzadoVar.zzg)) - 1, zzadoVar.zzd);
        int iZzt = zzefVar2.zzt();
        int iZzt2 = zzefVar2.zzt();
        int iZzt3 = zzefVar2.zzt();
        zzefVar2.zzk(2);
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        int i7 = 0;
        long j11 = j8 + ((long) zzadoVar.zzc);
        while (i7 < iZzt) {
            long j12 = j9;
            jArr[i7] = (((long) i7) * jZzr) / ((long) iZzt);
            jArr2[i7] = j11;
            if (iZzt3 == 1) {
                iZzs = zzefVar2.zzs();
            } else if (iZzt3 == 2) {
                iZzs = zzefVar2.zzt();
            } else if (iZzt3 == 3) {
                iZzs = zzefVar2.zzx();
            } else {
                if (iZzt3 != 4) {
                    return null;
                }
                iZzs = zzefVar2.zzH();
            }
            j11 += ((long) iZzs) * ((long) iZzt2);
            i7++;
            zzefVar2 = zzefVar;
            iZzt = iZzt;
            j9 = j12;
        }
        long j13 = j8 + j9;
        long jMax = j13 + j10;
        if (j7 != -1 && j7 != jMax) {
            StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 27 + String.valueOf(jMax).length());
            sb.append("VBRI data size mismatch: ");
            sb.append(j7);
            sb.append(", ");
            sb.append(jMax);
            zzds.zzc("VbriSeeker", sb.toString());
        }
        if (jMax != j11) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(jMax).length() + 43 + String.valueOf(j11).length() + 28);
            sb2.append("VBRI bytes and ToC mismatch (using max): ");
            sb2.append(jMax);
            sb2.append(", ");
            sb2.append(j11);
            sb2.append("\nSeeking will be inaccurate.");
            zzds.zzc("VbriSeeker", sb2.toString());
            jMax = Math.max(jMax, j11);
        }
        return new zzahj(jArr, jArr2, jZzr, j13, jMax, zzadoVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j7) {
        long[] jArr = this.zza;
        int iZzm = zzeo.zzm(jArr, j7, true, true);
        long j8 = jArr[iZzm];
        long[] jArr2 = this.zzb;
        zzadw zzadwVar = new zzadw(j8, jArr2[iZzm]);
        if (zzadwVar.zzb >= j7 || iZzm == jArr.length - 1) {
            return new zzadt(zzadwVar, zzadwVar);
        }
        int i7 = iZzm + 1;
        return new zzadt(zzadwVar, new zzadw(jArr[i7], jArr2[i7]));
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zze(long j7) {
        return this.zza[zzeo.zzm(this.zzb, j7, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final int zzg() {
        return this.zze;
    }
}
