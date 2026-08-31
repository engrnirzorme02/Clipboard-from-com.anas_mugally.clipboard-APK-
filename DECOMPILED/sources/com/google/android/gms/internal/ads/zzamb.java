package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzamb implements zzamd {
    private final zzef zza;
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzaeb zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzu zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final String zze = "video/mp2t";

    public zzamb(String str, int i7, int i8, String str2) {
        this.zza = new zzef(new byte[i8]);
        this.zzc = str;
        this.zzd = i7;
    }

    private final boolean zzf(zzef zzefVar, byte[] bArr, int i7) {
        int iMin = Math.min(zzefVar.zzd(), i7 - this.zzi);
        zzefVar.zzm(bArr, this.zzi, iMin);
        int i8 = this.zzi + iMin;
        this.zzi = i8;
        return i8 == i7;
    }

    private final void zzg(zzacs zzacsVar) {
        int i7;
        int i8 = zzacsVar.zzb;
        if (i8 == -2147483647 || (i7 = zzacsVar.zzc) == -1) {
            return;
        }
        zzu zzuVar = this.zzl;
        if (zzuVar != null && i7 == zzuVar.zzG && i8 == zzuVar.zzH && Objects.equals(zzacsVar.zza, zzuVar.zzo)) {
            return;
        }
        zzu zzuVar2 = this.zzl;
        zzs zzsVar = zzuVar2 == null ? new zzs() : zzuVar2.zza();
        zzsVar.zza(this.zzf);
        zzsVar.zzl(this.zze);
        zzsVar.zzm(zzacsVar.zza);
        zzsVar.zzE(i7);
        zzsVar.zzF(i8);
        zzsVar.zze(this.zzc);
        zzsVar.zzg(this.zzd);
        zzu zzuVarZzM = zzsVar.zzM();
        this.zzl = zzuVarZzM;
        this.zzg.zzu(zzuVarZzM);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = -9223372036854775807L;
        this.zzb.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzf = zzanrVar.zzc();
        this.zzg = zzacxVar.zzu(zzanrVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j7, int i7) {
        this.zzq = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) throws zzas {
        int i7;
        byte b7;
        int i8;
        byte b8;
        this.zzg.getClass();
        while (zzefVar.zzd() > 0) {
            int i9 = this.zzh;
            if (i9 == 0) {
                while (zzefVar.zzd() > 0) {
                    int i10 = this.zzj << 8;
                    this.zzj = i10;
                    int iZzs = i10 | zzefVar.zzs();
                    this.zzj = iZzs;
                    int iZza = zzact.zza(iZzs);
                    this.zzn = iZza;
                    if (iZza != 0) {
                        byte[] bArrZzi = this.zza.zzi();
                        int i11 = this.zzj;
                        bArrZzi[0] = (byte) ((i11 >> 24) & 255);
                        bArrZzi[1] = (byte) ((i11 >> 16) & 255);
                        bArrZzi[2] = (byte) ((i11 >> 8) & 255);
                        bArrZzi[3] = (byte) (i11 & 255);
                        this.zzi = 4;
                        this.zzj = 0;
                        if (iZza != 3 && iZza != 4) {
                            if (iZza != 1) {
                                this.zzh = 2;
                                break;
                            } else {
                                this.zzh = 1;
                                break;
                            }
                        }
                        this.zzh = 4;
                        break;
                    }
                }
            } else if (i9 == 1) {
                zzef zzefVar2 = this.zza;
                if (zzf(zzefVar, zzefVar2.zzi(), 18)) {
                    byte[] bArrZzi2 = zzefVar2.zzi();
                    if (this.zzl == null) {
                        zzu zzuVarZzb = zzact.zzb(bArrZzi2, this.zzf, this.zzc, this.zzd, this.zze, null);
                        this.zzl = zzuVarZzb;
                        this.zzg.zzu(zzuVarZzb);
                    }
                    this.zzm = zzact.zzc(bArrZzi2);
                    byte b9 = bArrZzi2[0];
                    if (b9 != -2) {
                        if (b9 == -1) {
                            i7 = (bArrZzi2[4] & 7) << 4;
                            b8 = bArrZzi2[7];
                        } else if (b9 != 31) {
                            i7 = (bArrZzi2[4] & 1) << 6;
                            b7 = bArrZzi2[5];
                        } else {
                            i7 = (bArrZzi2[5] & 7) << 4;
                            b8 = bArrZzi2[6];
                        }
                        i8 = b8 & 60;
                        this.zzk = zzgne.zza(zzeo.zzr(((i7 | (i8 >> 2)) + 1) * 32, this.zzl.zzH));
                        zzefVar2.zzh(0);
                        this.zzg.zzz(zzefVar2, 18);
                        this.zzh = 6;
                    } else {
                        i7 = (bArrZzi2[5] & 1) << 6;
                        b7 = bArrZzi2[4];
                    }
                    i8 = b7 & 252;
                    this.zzk = zzgne.zza(zzeo.zzr(((i7 | (i8 >> 2)) + 1) * 32, this.zzl.zzH));
                    zzefVar2.zzh(0);
                    this.zzg.zzz(zzefVar2, 18);
                    this.zzh = 6;
                }
            } else if (i9 != 2) {
                if (i9 == 3) {
                    zzef zzefVar3 = this.zza;
                    if (zzf(zzefVar, zzefVar3.zzi(), this.zzo)) {
                        zzacs zzacsVarZzd = zzact.zzd(zzefVar3.zzi());
                        zzg(zzacsVarZzd);
                        this.zzm = zzacsVarZzd.zzd;
                        long j7 = zzacsVarZzd.zze;
                        this.zzk = j7 != -9223372036854775807L ? j7 : 0L;
                        zzefVar3.zzh(0);
                        this.zzg.zzz(zzefVar3, this.zzo);
                        this.zzh = 6;
                    }
                } else if (i9 == 4) {
                    zzef zzefVar4 = this.zza;
                    if (zzf(zzefVar, zzefVar4.zzi(), 6)) {
                        int iZzg = zzact.zzg(zzefVar4.zzi());
                        this.zzp = iZzg;
                        int i12 = this.zzi;
                        if (i12 > iZzg) {
                            int i13 = i12 - iZzg;
                            this.zzi = i12 - i13;
                            zzefVar.zzh(zzefVar.zzg() - i13);
                        }
                        this.zzh = 5;
                    }
                } else if (i9 != 5) {
                    int iMin = Math.min(zzefVar.zzd(), this.zzm - this.zzi);
                    this.zzg.zzz(zzefVar, iMin);
                    int i14 = this.zzi + iMin;
                    this.zzi = i14;
                    if (i14 == this.zzm) {
                        zzghc.zzh(this.zzq != -9223372036854775807L);
                        this.zzg.zzx(this.zzq, this.zzn == 4 ? 0 : 1, this.zzm, 0, null);
                        this.zzq += this.zzk;
                        this.zzh = 0;
                    }
                } else {
                    zzef zzefVar5 = this.zza;
                    if (zzf(zzefVar, zzefVar5.zzi(), this.zzp)) {
                        zzacs zzacsVarZzf = zzact.zzf(zzefVar5.zzi(), this.zzb);
                        if (this.zzn == 3) {
                            zzg(zzacsVarZzf);
                        }
                        this.zzm = zzacsVarZzf.zzd;
                        long j8 = zzacsVarZzf.zze;
                        this.zzk = j8 != -9223372036854775807L ? j8 : 0L;
                        zzefVar5.zzh(0);
                        this.zzg.zzz(zzefVar5, this.zzp);
                        this.zzh = 6;
                    }
                }
            } else {
                zzef zzefVar6 = this.zza;
                if (zzf(zzefVar, zzefVar6.zzi(), 7)) {
                    this.zzo = zzact.zze(zzefVar6.zzi());
                    this.zzh = 3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z7) {
    }
}
