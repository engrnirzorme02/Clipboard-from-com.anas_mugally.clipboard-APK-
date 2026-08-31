package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zzamo implements zzamd {
    private final String zza;
    private final int zzb;
    private final String zzc = "video/mp2t";
    private final zzef zzd;
    private final zzee zze;
    private zzaeb zzf;
    private String zzg;
    private zzu zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private String zzw;

    public zzamo(String str, int i7, String str2) {
        this.zza = str;
        this.zzb = i7;
        zzef zzefVar = new zzef(1024);
        this.zzd = zzefVar;
        byte[] bArrZzi = zzefVar.zzi();
        this.zze = new zzee(bArrZzi, bArrZzi.length);
        this.zzm = -9223372036854775807L;
    }

    private final int zzf(zzee zzeeVar) throws zzas {
        int iZzc = zzeeVar.zzc();
        zzabs zzabsVarZzb = zzabt.zzb(zzeeVar, true);
        this.zzw = zzabsVarZzb.zzc;
        this.zzt = zzabsVarZzb.zza;
        this.zzv = zzabsVarZzb.zzb;
        return iZzc - zzeeVar.zzc();
    }

    private static long zzg(zzee zzeeVar) {
        return zzeeVar.zzj((zzeeVar.zzj(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzi = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzf = zzacxVar.zzu(zzanrVar.zzb(), 1);
        this.zzg = zzanrVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j7, int i7) {
        this.zzm = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) throws zzas {
        int i7;
        int i8;
        int iZzj;
        boolean zZzi;
        this.zzf.getClass();
        while (zzefVar.zzd() > 0) {
            int i9 = this.zzi;
            if (i9 != 0) {
                if (i9 == 1) {
                    int iZzs = zzefVar.zzs();
                    if ((iZzs & 224) == 224) {
                        this.zzl = iZzs;
                        this.zzi = 2;
                    } else if (iZzs != 86) {
                        this.zzi = 0;
                    }
                } else if (i9 != 2) {
                    int iMin = Math.min(zzefVar.zzd(), this.zzk - this.zzj);
                    zzee zzeeVar = this.zze;
                    zzefVar.zzm(zzeeVar.zza, this.zzj, iMin);
                    int i10 = this.zzj + iMin;
                    this.zzj = i10;
                    if (i10 == this.zzk) {
                        zzeeVar.zzf(0);
                        if (zzeeVar.zzi()) {
                            if (this.zzn) {
                            }
                            this.zzi = 0;
                        } else {
                            this.zzn = true;
                            int iZzj2 = zzeeVar.zzj(1);
                            if (iZzj2 == 1) {
                                iZzj = zzeeVar.zzj(1);
                                i8 = 1;
                            } else {
                                i8 = iZzj2;
                                iZzj = 0;
                            }
                            this.zzo = iZzj;
                            if (iZzj != 0) {
                                throw zzas.zzb(null, null);
                            }
                            if (i8 == 1) {
                                zzg(zzeeVar);
                                i8 = 1;
                            }
                            if (!zzeeVar.zzi()) {
                                throw zzas.zzb(null, null);
                            }
                            this.zzp = zzeeVar.zzj(6);
                            int iZzj3 = zzeeVar.zzj(4);
                            int iZzj4 = zzeeVar.zzj(3);
                            if (iZzj3 != 0 || iZzj4 != 0) {
                                throw zzas.zzb(null, null);
                            }
                            if (i8 == 0) {
                                int iZzd = zzeeVar.zzd();
                                int iZzf = zzf(zzeeVar);
                                zzeeVar.zzf(iZzd);
                                byte[] bArr = new byte[(iZzf + 7) / 8];
                                zzeeVar.zzl(bArr, 0, iZzf);
                                zzs zzsVar = new zzs();
                                zzsVar.zza(this.zzg);
                                zzsVar.zzl(this.zzc);
                                zzsVar.zzm("audio/mp4a-latm");
                                zzsVar.zzj(this.zzw);
                                zzsVar.zzE(this.zzv);
                                zzsVar.zzF(this.zzt);
                                zzsVar.zzp(Collections.singletonList(bArr));
                                zzsVar.zze(this.zza);
                                zzsVar.zzg(this.zzb);
                                zzu zzuVarZzM = zzsVar.zzM();
                                if (!zzuVarZzM.equals(this.zzh)) {
                                    this.zzh = zzuVarZzM;
                                    this.zzu = 1024000000 / ((long) zzuVarZzM.zzH);
                                    this.zzf.zzu(zzuVarZzM);
                                }
                            } else {
                                zzeeVar.zzh(((int) zzg(zzeeVar)) - zzf(zzeeVar));
                            }
                            int iZzj5 = zzeeVar.zzj(3);
                            this.zzq = iZzj5;
                            if (iZzj5 == 0) {
                                zzeeVar.zzh(8);
                            } else if (iZzj5 == 1) {
                                zzeeVar.zzh(9);
                            } else if (iZzj5 == 3 || iZzj5 == 4 || iZzj5 == 5) {
                                zzeeVar.zzh(6);
                            } else {
                                if (iZzj5 != 6 && iZzj5 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzeeVar.zzh(1);
                            }
                            boolean zZzi2 = zzeeVar.zzi();
                            this.zzr = zZzi2;
                            this.zzs = 0L;
                            if (zZzi2) {
                                if (i8 != 1) {
                                    do {
                                        zZzi = zzeeVar.zzi();
                                        this.zzs = (this.zzs << 8) + ((long) zzeeVar.zzj(8));
                                    } while (zZzi);
                                } else {
                                    this.zzs = zzg(zzeeVar);
                                }
                            }
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(8);
                            }
                        }
                        if (this.zzo != 0) {
                            throw zzas.zzb(null, null);
                        }
                        if (this.zzp != 0) {
                            throw zzas.zzb(null, null);
                        }
                        if (this.zzq != 0) {
                            throw zzas.zzb(null, null);
                        }
                        int i11 = 0;
                        while (true) {
                            int iZzj6 = zzeeVar.zzj(8);
                            i7 = i11 + iZzj6;
                            if (iZzj6 != 255) {
                                break;
                            } else {
                                i11 = i7;
                            }
                        }
                        int iZzd2 = zzeeVar.zzd();
                        if ((iZzd2 & 7) == 0) {
                            this.zzd.zzh(iZzd2 >> 3);
                        } else {
                            zzef zzefVar2 = this.zzd;
                            zzeeVar.zzl(zzefVar2.zzi(), 0, i7 * 8);
                            zzefVar2.zzh(0);
                        }
                        this.zzf.zzz(this.zzd, i7);
                        zzghc.zzh(this.zzm != -9223372036854775807L);
                        this.zzf.zzx(this.zzm, 1, i7, 0, null);
                        this.zzm += this.zzu;
                        if (this.zzr) {
                            zzeeVar.zzh((int) this.zzs);
                        }
                        this.zzi = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iZzs2 = ((this.zzl & (-225)) << 8) | zzefVar.zzs();
                    this.zzk = iZzs2;
                    zzef zzefVar3 = this.zzd;
                    if (iZzs2 > zzefVar3.zzi().length) {
                        zzefVar3.zza(iZzs2);
                        zzee zzeeVar2 = this.zze;
                        byte[] bArrZzi = zzefVar3.zzi();
                        zzeeVar2.zzb(bArrZzi, bArrZzi.length);
                    }
                    this.zzj = 0;
                    this.zzi = 3;
                }
            } else if (zzefVar.zzs() == 86) {
                this.zzi = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z7) {
    }
}
