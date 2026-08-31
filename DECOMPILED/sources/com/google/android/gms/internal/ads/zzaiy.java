package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzaiy implements zzajf {
    private final zzaje zza;
    private final long zzb;
    private final long zzc;
    private final zzajj zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzaiy(zzajj zzajjVar, long j7, long j8, long j9, long j10, boolean z7) {
        zzghc.zza(j7 >= 0 && j8 > j7);
        this.zzd = zzajjVar;
        this.zzb = j7;
        this.zzc = j8;
        if (j9 == j8 - j7 || z7) {
            this.zzf = j10;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzaje();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    @Override // com.google.android.gms.internal.ads.zzajf
    public final long zza(zzacv zzacvVar) throws IOException {
        long j7;
        long j8;
        long jMax;
        int i7 = this.zze;
        if (i7 == 0) {
            long jZzn = zzacvVar.zzn();
            this.zzg = jZzn;
            this.zze = 1;
            long j9 = this.zzc - 65307;
            if (j9 > jZzn) {
                return j9;
            }
        } else if (i7 != 1) {
            if (i7 == 2) {
                long j10 = this.zzi;
                long j11 = this.zzj;
                if (j10 == j11) {
                    jMax = -1;
                    j8 = -1;
                } else {
                    long jZzn2 = zzacvVar.zzn();
                    zzaje zzajeVar = this.zza;
                    if (zzajeVar.zzb(zzacvVar, j11)) {
                        zzajeVar.zzc(zzacvVar, false);
                        zzacvVar.zzl();
                        long j12 = this.zzh;
                        j7 = 2;
                        long j13 = zzajeVar.zzb;
                        long j14 = j12 - j13;
                        int i8 = zzajeVar.zzd + zzajeVar.zze;
                        if (j14 < 0 || j14 >= 72000) {
                            if (j14 < 0) {
                                this.zzj = jZzn2;
                                this.zzl = j13;
                            } else {
                                this.zzi = zzacvVar.zzn() + ((long) i8);
                                this.zzk = j13;
                            }
                            long j15 = this.zzj;
                            long j16 = this.zzi;
                            long j17 = j15 - j16;
                            if (j17 < 100000) {
                                this.zzj = j16;
                                j8 = -1;
                                jMax = j16;
                            } else {
                                long jZzn3 = zzacvVar.zzn() - (((long) i8) * (j14 <= 0 ? 2L : 1L));
                                j8 = -1;
                                String str = zzeo.zza;
                                jMax = Math.max(j16, Math.min(jZzn3 + ((j14 * j17) / (this.zzl - this.zzk)), j15 - 1));
                            }
                        } else {
                            jMax = -1;
                            j8 = -1;
                        }
                    } else {
                        jMax = this.zzi;
                        if (jMax == jZzn2) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j8 = -1;
                    }
                    if (jMax != j8) {
                        return jMax;
                    }
                    this.zze = 3;
                }
                j7 = 2;
                if (jMax != j8) {
                    return jMax;
                }
                this.zze = 3;
            } else {
                if (i7 != 3) {
                    return -1L;
                }
                j8 = -1;
                j7 = 2;
            }
            while (true) {
                zzaje zzajeVar2 = this.zza;
                zzajeVar2.zzb(zzacvVar, j8);
                zzajeVar2.zzc(zzacvVar, false);
                if (zzajeVar2.zzb > this.zzh) {
                    zzacvVar.zzl();
                    this.zze = 4;
                    return -(this.zzk + j7);
                }
                zzacvVar.zzf(zzajeVar2.zzd + zzajeVar2.zze);
                this.zzi = zzacvVar.zzn();
                this.zzk = zzajeVar2.zzb;
                j8 = -1;
            }
        }
        zzaje zzajeVar3 = this.zza;
        zzajeVar3.zza();
        if (!zzajeVar3.zzb(zzacvVar, -1L)) {
            throw new EOFException();
        }
        zzajeVar3.zzc(zzacvVar, false);
        zzacvVar.zzf(zzajeVar3.zzd + zzajeVar3.zze);
        long j18 = zzajeVar3.zzb;
        while ((zzajeVar3.zza & 4) != 4 && zzajeVar3.zzb(zzacvVar, -1L) && zzacvVar.zzn() < this.zzc && zzajeVar3.zzc(zzacvVar, true) && zzacy.zzd(zzacvVar, zzajeVar3.zzd + zzajeVar3.zze)) {
            j18 = zzajeVar3.zzb;
        }
        this.zzf = j18;
        this.zze = 4;
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final void zzb(long j7) {
        long j8 = this.zzf - 1;
        String str = zzeo.zza;
        this.zzh = Math.max(0L, Math.min(j7, j8));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final /* bridge */ /* synthetic */ zzadv zzc() {
        byte[] bArr = null;
        if (this.zzf != 0) {
            return new zzaix(this, bArr);
        }
        return null;
    }

    final /* synthetic */ long zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ zzajj zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zzf;
    }
}
