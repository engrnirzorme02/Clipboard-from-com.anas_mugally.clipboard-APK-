package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafd implements zzacu {
    private zzacx zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzafb zzo;
    private zzafh zzp;
    private final zzef zza = new zzef(4);
    private final zzef zzb = new zzef(9);
    private final zzef zzc = new zzef(11);
    private final zzef zzd = new zzef();
    private final zzafe zze = new zzafe();
    private int zzg = 1;

    static {
        int i7 = zzafc.zza;
    }

    private final zzef zza(zzacv zzacvVar) {
        zzef zzefVar = this.zzd;
        if (this.zzl > zzefVar.zzj()) {
            int iZzj = zzefVar.zzj();
            zzefVar.zzb(new byte[Math.max(iZzj + iZzj, this.zzl)], 0);
        } else {
            zzefVar.zzh(0);
        }
        zzefVar.zzf(this.zzl);
        zzacvVar.zzc(zzefVar.zzi(), 0, this.zzl);
        return zzefVar;
    }

    private final void zzb() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzw(new zzadu(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws EOFException, InterruptedIOException {
        zzef zzefVar = this.zza;
        zzacl zzaclVar = (zzacl) zzacvVar;
        zzaclVar.zzh(zzefVar.zzi(), 0, 3, false);
        zzefVar.zzh(0);
        if (zzefVar.zzx() != 4607062) {
            return false;
        }
        zzaclVar.zzh(zzefVar.zzi(), 0, 2, false);
        zzefVar.zzh(0);
        if ((zzefVar.zzt() & 250) != 0) {
            return false;
        }
        zzaclVar.zzh(zzefVar.zzi(), 0, 4, false);
        zzefVar.zzh(0);
        int iZzB = zzefVar.zzB();
        zzacvVar.zzl();
        zzacl zzaclVar2 = (zzacl) zzacvVar;
        zzaclVar2.zzj(iZzB, false);
        zzaclVar2.zzh(zzefVar.zzi(), 0, 4, false);
        zzefVar.zzh(0);
        return zzefVar.zzB() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzf = zzacxVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) {
        long j7;
        boolean zZzf;
        boolean z7;
        long j8;
        this.zzf.getClass();
        while (true) {
            int i7 = this.zzg;
            int i8 = 8;
            if (i7 == 1) {
                zzef zzefVar = this.zzb;
                if (!zzacvVar.zzb(zzefVar.zzi(), 0, 9, true)) {
                    return -1;
                }
                zzefVar.zzh(0);
                zzefVar.zzk(4);
                int iZzs = zzefVar.zzs();
                int i9 = iZzs & 4;
                int i10 = iZzs & 1;
                if (i9 != 0 && this.zzo == null) {
                    this.zzo = new zzafb(this.zzf.zzu(8, 1));
                }
                if (i10 != 0 && this.zzp == null) {
                    this.zzp = new zzafh(this.zzf.zzu(9, 2));
                }
                this.zzf.zzv();
                this.zzj = zzefVar.zzB() - 5;
                this.zzg = 2;
            } else if (i7 == 2) {
                zzacvVar.zzf(this.zzj);
                this.zzj = 0;
                this.zzg = 3;
            } else if (i7 == 3) {
                zzef zzefVar2 = this.zzc;
                if (!zzacvVar.zzb(zzefVar2.zzi(), 0, 11, true)) {
                    return -1;
                }
                zzefVar2.zzh(0);
                this.zzk = zzefVar2.zzs();
                this.zzl = zzefVar2.zzx();
                this.zzm = zzefVar2.zzx();
                this.zzm = (((long) (zzefVar2.zzs() << 24)) | this.zzm) * 1000;
                zzefVar2.zzk(3);
                this.zzg = 4;
            } else {
                if (i7 != 4) {
                    throw new IllegalStateException();
                }
                if (this.zzh) {
                    j7 = this.zzi + this.zzm;
                } else {
                    j7 = this.zze.zzc() == -9223372036854775807L ? 0L : this.zzm;
                }
                int i11 = this.zzk;
                if (i11 == 8) {
                    if (this.zzo != null) {
                        zzb();
                        zZzf = this.zzo.zzf(zza(zzacvVar), j7);
                    }
                    z7 = true;
                    if (!this.zzh && zZzf) {
                        this.zzh = true;
                        if (this.zze.zzc() == -9223372036854775807L) {
                            j8 = -this.zzm;
                        } else {
                            j8 = 0;
                        }
                        this.zzi = j8;
                    }
                    this.zzj = 4;
                    this.zzg = 2;
                    if (z7) {
                        return 0;
                    }
                } else {
                    i8 = i11;
                }
                if (i8 == 9) {
                    if (this.zzp != null) {
                        zzb();
                        zZzf = this.zzp.zzf(zza(zzacvVar), j7);
                        z7 = true;
                    } else {
                        zzacvVar.zzf(this.zzl);
                        zZzf = false;
                        z7 = false;
                    }
                } else if (i8 != 18 || this.zzn) {
                    zzacvVar.zzf(this.zzl);
                    zZzf = false;
                    z7 = false;
                } else {
                    zzafe zzafeVar = this.zze;
                    zZzf = zzafeVar.zzf(zza(zzacvVar), j7);
                    long jZzc = zzafeVar.zzc();
                    if (jZzc != -9223372036854775807L) {
                        this.zzf.zzw(new zzadn(zzafeVar.zze(), zzafeVar.zzd(), jZzc));
                        this.zzn = true;
                    }
                    z7 = true;
                }
                if (!this.zzh) {
                    this.zzh = true;
                    if (this.zze.zzc() == -9223372036854775807L) {
                        j8 = -this.zzm;
                    } else {
                        j8 = 0;
                    }
                    this.zzi = j8;
                }
                this.zzj = 4;
                this.zzg = 2;
                if (z7) {
                    return 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j7, long j8) {
        if (j7 == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }
}
