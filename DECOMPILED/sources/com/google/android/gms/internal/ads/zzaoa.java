package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaoa implements zzacu {
    private zzacx zza;
    private zzaeb zzb;
    private zzanx zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    static {
        int i7 = zzanz.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) {
        return zzaod.zza(zzacvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zza = zzacxVar;
        this.zzb = zzacxVar.zzu(0, 1);
        zzacxVar.zzv();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws zzas {
        int i7;
        this.zzb.getClass();
        String str = zzeo.zza;
        int i8 = this.zzc;
        int iZzz = 4;
        if (i8 == 0) {
            zzghc.zzh(zzacvVar.zzn() == 0);
            int i9 = this.zzf;
            if (i9 != -1) {
                zzacvVar.zzf(i9);
                this.zzc = 4;
            } else {
                if (!zzaod.zza(zzacvVar)) {
                    throw zzas.zzb("Unsupported or unrecognized wav file type.", null);
                }
                zzacvVar.zzf((int) (zzacvVar.zzm() - zzacvVar.zzn()));
                this.zzc = 1;
            }
            return 0;
        }
        long jZzE = -1;
        if (i8 == 1) {
            int i10 = zzaod.zza;
            zzef zzefVar = new zzef(8);
            zzaoc zzaocVarZza = zzaoc.zza(zzacvVar, zzefVar);
            if (zzaocVarZza.zza != 1685272116) {
                zzacvVar.zzl();
            } else {
                zzacvVar.zzk(8);
                zzefVar.zzh(0);
                zzacvVar.zzi(zzefVar.zzi(), 0, 8);
                jZzE = zzefVar.zzE();
                zzacvVar.zzf(((int) zzaocVarZza.zzb) + 8);
            }
            this.zzd = jZzE;
            this.zzc = 2;
            return 0;
        }
        if (i8 == 2) {
            zzaob zzaobVarZzb = zzaod.zzb(zzacvVar);
            int i11 = zzaobVarZzb.zza;
            if (i11 == 17) {
                this.zze = new zzanw(this.zza, this.zzb, zzaobVarZzb);
            } else if (i11 == 6) {
                this.zze = new zzany(this.zza, this.zzb, zzaobVarZzb, "audio/g711-alaw", -1);
            } else if (i11 == 7) {
                this.zze = new zzany(this.zza, this.zzb, zzaobVarZzb, "audio/g711-mlaw", -1);
            } else {
                int i12 = zzaobVarZzb.zze;
                if (i11 == 1) {
                    iZzz = zzeo.zzz(i12, ByteOrder.LITTLE_ENDIAN);
                    i7 = iZzz;
                } else {
                    if (i11 != 3) {
                        if (i11 == 65534) {
                            iZzz = zzeo.zzz(i12, ByteOrder.LITTLE_ENDIAN);
                            i7 = iZzz;
                        }
                    } else if (i12 == 32) {
                        i7 = iZzz;
                    }
                    i7 = 0;
                }
                if (i7 == 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 29);
                    sb.append("Unsupported WAV format type: ");
                    sb.append(i11);
                    throw zzas.zzc(sb.toString());
                }
                this.zze = new zzany(this.zza, this.zzb, zzaobVarZzb, "audio/raw", i7);
            }
            this.zzc = 3;
            return 0;
        }
        if (i8 != 3) {
            zzghc.zzh(this.zzg != -1);
            long jZzn = this.zzg - zzacvVar.zzn();
            zzanx zzanxVar = this.zze;
            zzanxVar.getClass();
            return zzanxVar.zzc(zzacvVar, jZzn) ? -1 : 0;
        }
        Pair pairZzc = zzaod.zzc(zzacvVar);
        this.zzf = ((Long) pairZzc.first).intValue();
        long jLongValue = ((Long) pairZzc.second).longValue();
        long j7 = this.zzd;
        if (j7 != -1 && jLongValue == 4294967295L) {
            jLongValue = j7;
        }
        long j8 = ((long) this.zzf) + jLongValue;
        this.zzg = j8;
        long jZzo = zzacvVar.zzo();
        if (jZzo != -1 && j8 > jZzo) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + 29 + String.valueOf(jZzo).length());
            sb2.append("Data exceeds input length: ");
            sb2.append(j8);
            sb2.append(", ");
            sb2.append(jZzo);
            zzds.zzc("WavExtractor", sb2.toString());
            this.zzg = jZzo;
            j8 = jZzo;
        }
        zzanx zzanxVar2 = this.zze;
        zzanxVar2.getClass();
        zzanxVar2.zzb(this.zzf, j8);
        this.zzc = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j7, long j8) {
        this.zzc = j7 == 0 ? 0 : 4;
        zzanx zzanxVar = this.zze;
        if (zzanxVar != null) {
            zzanxVar.zza(j8);
        }
    }
}
