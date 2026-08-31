package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzafk implements zzacu {
    private zzacx zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzago zzg;
    private zzacv zzh;
    private zzafn zzi;
    private zzaim zzj;
    private final zzef zza = new zzef(2);
    private long zzf = -1;

    private final int zza(zzacv zzacvVar) {
        zzef zzefVar = this.zza;
        zzefVar.zza(2);
        ((zzacl) zzacvVar).zzh(zzefVar.zzi(), 0, 2, false);
        return zzefVar.zzt();
    }

    private final void zzb() {
        zzacx zzacxVar = this.zzb;
        zzacxVar.getClass();
        zzacxVar.zzv();
        this.zzb.zzw(new zzadu(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws EOFException, InterruptedIOException {
        if (zza(zzacvVar) != 65496) {
            return false;
        }
        int iZza = zza(zzacvVar);
        this.zzd = iZza;
        if (iZza == 65504) {
            zzef zzefVar = this.zza;
            zzefVar.zza(2);
            zzacl zzaclVar = (zzacl) zzacvVar;
            zzaclVar.zzh(zzefVar.zzi(), 0, 2, false);
            zzaclVar.zzj(zzefVar.zzt() - 2, false);
            iZza = zza(zzacvVar);
            this.zzd = iZza;
        }
        return iZza == 65505;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzb = zzacxVar;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x010b  */
    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws zzas {
        String strZzM;
        zzafm zzafmVarZza;
        zzago zzagoVar;
        long j7;
        byte b7 = -1;
        int i7 = this.zzc;
        long j8 = -1;
        if (i7 == 0) {
            zzef zzefVar = this.zza;
            zzefVar.zza(2);
            zzacvVar.zzc(zzefVar.zzi(), 0, 2);
            int iZzt = zzefVar.zzt();
            this.zzd = iZzt;
            if (iZzt == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                } else {
                    zzb();
                }
            } else if ((iZzt < 65488 || iZzt > 65497) && iZzt != 65281) {
                this.zzc = 1;
            }
            return 0;
        }
        if (i7 == 1) {
            zzef zzefVar2 = this.zza;
            zzefVar2.zza(2);
            zzacvVar.zzc(zzefVar2.zzi(), 0, 2);
            this.zze = zzefVar2.zzt() - 2;
            this.zzc = 2;
            return 0;
        }
        if (i7 != 2) {
            if (i7 != 4) {
                if (i7 != 5) {
                    if (i7 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzacvVar != this.zzh) {
                    this.zzh = zzacvVar;
                    this.zzi = new zzafn(zzacvVar, this.zzf);
                }
                zzaim zzaimVar = this.zzj;
                zzaimVar.getClass();
                int iZzg = zzaimVar.zzg(this.zzi, zzadsVar);
                if (iZzg == 1) {
                    zzadsVar.zza += this.zzf;
                }
                return iZzg;
            }
            long jZzn = zzacvVar.zzn();
            long j9 = this.zzf;
            if (jZzn != j9) {
                zzadsVar.zza = j9;
                return 1;
            }
            if (zzacvVar.zzh(this.zza.zzi(), 0, 1, true)) {
                zzacvVar.zzl();
                if (this.zzj == null) {
                    this.zzj = new zzaim(zzajt.zza, 8);
                }
                zzafn zzafnVar = new zzafn(zzacvVar, this.zzf);
                this.zzi = zzafnVar;
                if (this.zzj.zzd(zzafnVar)) {
                    zzaim zzaimVar2 = this.zzj;
                    long j10 = this.zzf;
                    zzacx zzacxVar = this.zzb;
                    zzacxVar.getClass();
                    zzaimVar2.zzf(new zzafp(j10, zzacxVar));
                    zzago zzagoVar2 = this.zzg;
                    zzagoVar2.getClass();
                    zzacx zzacxVar2 = this.zzb;
                    zzacxVar2.getClass();
                    zzaeb zzaebVarZzu = zzacxVar2.zzu(1024, 4);
                    zzs zzsVar = new zzs();
                    zzsVar.zzl("image/jpeg");
                    zzsVar.zzk(new zzao(-9223372036854775807L, zzagoVar2));
                    zzaebVarZzu.zzu(zzsVar.zzM());
                    this.zzc = 5;
                } else {
                    zzb();
                }
            } else {
                zzb();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzef zzefVar3 = new zzef(this.zze);
            zzacvVar.zzc(zzefVar3.zzi(), 0, this.zze);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzefVar3.zzM((char) 0)) && (strZzM = zzefVar3.zzM((char) 0)) != null) {
                long jZzo = zzacvVar.zzo();
                if (jZzo == -1 || (zzafmVarZza = zzafq.zza(strZzM)) == null) {
                    zzagoVar = null;
                } else {
                    List list = zzafmVarZza.zzb;
                    if (list.size() < 2) {
                        zzagoVar = null;
                    } else {
                        int size = list.size() - 1;
                        boolean z7 = false;
                        long j11 = -1;
                        long j12 = -1;
                        long j13 = -1;
                        long j14 = -1;
                        while (size >= 0) {
                            byte b8 = b7;
                            zzafl zzaflVar = (zzafl) list.get(size);
                            long j15 = j8;
                            boolean zEquals = "video/mp4".equals(zzaflVar.zza) | z7;
                            if (size == 0) {
                                jZzo -= zzaflVar.zzc;
                                j7 = 0;
                            } else {
                                j7 = jZzo - zzaflVar.zzb;
                            }
                            long j16 = j7;
                            long j17 = jZzo;
                            jZzo = j16;
                            if (!zEquals || jZzo == j17) {
                                z7 = zEquals;
                            } else {
                                j14 = j17 - jZzo;
                                z7 = false;
                                j13 = jZzo;
                            }
                            if (size == 0) {
                                j12 = j17;
                            }
                            if (size == 0) {
                                j11 = jZzo;
                            }
                            size--;
                            b7 = b8;
                            j8 = j15;
                        }
                        long j18 = j8;
                        if (j13 == j18 || j14 == j18 || j11 == j18 || j12 == j18) {
                            zzagoVar = null;
                        } else {
                            zzagoVar = new zzago(j11, j12, zzafmVarZza.zza, j13, j14);
                        }
                    }
                }
                this.zzg = zzagoVar;
                if (zzagoVar != null) {
                    this.zzf = zzagoVar.zzd;
                }
            }
        } else {
            zzacvVar.zzf(this.zze);
        }
        this.zzc = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j7, long j8) {
        if (j7 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzaim zzaimVar = this.zzj;
            zzaimVar.getClass();
            zzaimVar.zzh(j7, j8);
        }
    }
}
