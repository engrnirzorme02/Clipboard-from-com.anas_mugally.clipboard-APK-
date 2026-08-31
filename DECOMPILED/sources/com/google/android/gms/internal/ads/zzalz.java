package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zzalz implements zzamd {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzaeb zzi;
    private zzaeb zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzaeb zzw;
    private long zzx;
    private final zzee zzc = new zzee(new byte[7], 7);
    private final zzef zzd = new zzef(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = -9223372036854775807L;
    private long zzv = -9223372036854775807L;

    public zzalz(boolean z7, String str, int i7, String str2) {
        this.zzb = z7;
        this.zze = str;
        this.zzf = i7;
        this.zzg = str2;
        zzi();
    }

    public static boolean zzf(int i7) {
        return (i7 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzi();
    }

    private final boolean zzh(zzef zzefVar, byte[] bArr, int i7) {
        int iMin = Math.min(zzefVar.zzd(), i7 - this.zzl);
        zzefVar.zzm(bArr, this.zzl, iMin);
        int i8 = this.zzl + iMin;
        this.zzl = i8;
        return i8 == i7;
    }

    private final void zzi() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzj(zzaeb zzaebVar, long j7, int i7, int i8) {
        this.zzk = 4;
        this.zzl = i7;
        this.zzw = zzaebVar;
        this.zzx = j7;
        this.zzu = i8;
    }

    private final void zzk() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private static final boolean zzl(byte b7, byte b8) {
        return zzf((b8 & 255) | 65280);
    }

    private static final boolean zzm(zzef zzefVar, byte[] bArr, int i7) {
        if (zzefVar.zzd() < i7) {
            return false;
        }
        zzefVar.zzm(bArr, 0, i7);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzv = -9223372036854775807L;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzh = zzanrVar.zzc();
        zzaeb zzaebVarZzu = zzacxVar.zzu(zzanrVar.zzb(), 1);
        this.zzi = zzaebVarZzu;
        this.zzw = zzaebVarZzu;
        if (!this.zzb) {
            this.zzj = new zzacr();
            return;
        }
        zzanrVar.zza();
        zzaeb zzaebVarZzu2 = zzacxVar.zzu(zzanrVar.zzb(), 5);
        this.zzj = zzaebVarZzu2;
        zzs zzsVar = new zzs();
        zzsVar.zza(zzanrVar.zzc());
        zzsVar.zzl(this.zzg);
        zzsVar.zzm("application/id3");
        zzaebVarZzu2.zzu(zzsVar.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j7, int i7) {
        this.zzv = j7;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0260  */
    /* JADX WARN: Code duplicated, block: B:103:0x0267  */
    /* JADX WARN: Code duplicated, block: B:104:0x026d  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:99:0x025e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) {
        int i7;
        int i8;
        int i9;
        boolean z7;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 2;
        this.zzi.getClass();
        String str = zzeo.zza;
        while (zzefVar.zzd() > 0) {
            int i14 = this.zzk;
            char c7 = 7;
            int i15 = 3;
            if (i14 == 0) {
                byte[] bArrZzi = zzefVar.zzi();
                int iZzg = zzefVar.zzg();
                int iZze = zzefVar.zze();
                while (true) {
                    if (iZzg < iZze) {
                        int i16 = iZzg + 1;
                        byte b7 = bArrZzi[iZzg];
                        int i17 = b7 & 255;
                        int i18 = i15;
                        if (this.zzm == 512 && zzl((byte) -1, (byte) i17)) {
                            if (!this.zzo) {
                                int i19 = iZzg - 1;
                                zzefVar.zzh(iZzg);
                                zzee zzeeVar = this.zzc;
                                if (zzm(zzefVar, zzeeVar.zza, 1)) {
                                    zzeeVar.zzf(4);
                                    int iZzj = zzeeVar.zzj(1);
                                    int i20 = this.zzp;
                                    if (i20 == -1 || iZzj == i20) {
                                        if (this.zzq == -1) {
                                            i7 = i13;
                                        } else if (zzm(zzefVar, zzeeVar.zza, 1)) {
                                            zzeeVar.zzf(i13);
                                            i7 = i13;
                                            if (zzeeVar.zzj(4) == this.zzq) {
                                                zzefVar.zzh(iZzg + 1);
                                            }
                                        }
                                        if (zzm(zzefVar, zzeeVar.zza, 4)) {
                                            zzeeVar.zzf(14);
                                            int iZzj2 = zzeeVar.zzj(13);
                                            c7 = 7;
                                            if (iZzj2 >= 7) {
                                                byte[] bArrZzi2 = zzefVar.zzi();
                                                int iZze2 = zzefVar.zze();
                                                int i21 = i19 + iZzj2;
                                                if (i21 < iZze2) {
                                                    byte b8 = bArrZzi2[i21];
                                                    if (b8 == -1) {
                                                        int i22 = i21 + 1;
                                                        if (i22 != iZze2) {
                                                            byte b9 = bArrZzi2[i22];
                                                            if (!zzl((byte) -1, b9) || ((b9 & 8) >> 3) != iZzj) {
                                                            }
                                                        }
                                                    } else if (b8 != 73 || ((i10 = i21 + 1) != iZze2 && (bArrZzi2[i10] != 68 || ((i11 = i21 + 2) != iZze2 && bArrZzi2[i11] != 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                        this.zzr = (b7 & 8) >> 3;
                                        if (1 != ((b7 & 1) ^ 1)) {
                                            z7 = false;
                                        } else {
                                            z7 = true;
                                        }
                                        this.zzn = z7;
                                        if (this.zzo) {
                                            zzk();
                                        } else {
                                            this.zzk = 1;
                                            this.zzl = 0;
                                        }
                                        zzefVar.zzh(i16);
                                        i13 = i7;
                                        i12 = 0;
                                    } else {
                                        i7 = i13;
                                    }
                                    c7 = 7;
                                } else {
                                    i7 = i13;
                                    c7 = 7;
                                }
                            }
                            i7 = i13;
                            this.zzr = (b7 & 8) >> 3;
                            if (1 != ((b7 & 1) ^ 1)) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            this.zzn = z7;
                            if (this.zzo) {
                                this.zzk = 1;
                                this.zzl = 0;
                            } else {
                                zzk();
                            }
                            zzefVar.zzh(i16);
                            i13 = i7;
                            i12 = 0;
                        } else {
                            i7 = i13;
                            c7 = c7;
                        }
                        int i23 = this.zzm;
                        int i24 = i23 | i17;
                        if (i24 == 329) {
                            i8 = 0;
                            i9 = 768;
                        } else if (i24 == 511) {
                            i8 = 0;
                            i9 = 512;
                        } else if (i24 == 836) {
                            i8 = 0;
                            i9 = 1024;
                        } else if (i24 == 1075) {
                            int i25 = i7;
                            this.zzk = i25;
                            this.zzl = i18;
                            this.zzu = 0;
                            this.zzd.zzh(0);
                            zzefVar.zzh(i16);
                            i13 = i25;
                            i12 = 0;
                        } else if (i23 != 256) {
                            this.zzm = 256;
                            i15 = i18;
                            i13 = i7;
                            i12 = 0;
                        } else {
                            i18 = i18;
                            i7 = i7;
                            i8 = 0;
                            i12 = i8;
                            iZzg = i16;
                            i15 = i18;
                            i13 = i7;
                        }
                        this.zzm = i9;
                        i12 = i8;
                        iZzg = i16;
                        i15 = i18;
                        i13 = i7;
                    } else {
                        zzefVar.zzh(iZzg);
                    }
                }
            } else if (i14 != 1) {
                if (i14 == i13) {
                    zzef zzefVar2 = this.zzd;
                    if (zzh(zzefVar, zzefVar2.zzi(), 10)) {
                        this.zzj.zzz(zzefVar2, 10);
                        zzefVar2.zzh(6);
                        zzj(this.zzj, 0L, 10, zzefVar2.zzG() + 10);
                    }
                } else if (i14 != 3) {
                    int iMin = Math.min(zzefVar.zzd(), this.zzu - this.zzl);
                    this.zzw.zzz(zzefVar, iMin);
                    int i26 = this.zzl + iMin;
                    this.zzl = i26;
                    if (i26 == this.zzu) {
                        zzghc.zzh(this.zzv != -9223372036854775807L ? 1 : i12);
                        this.zzw.zzx(this.zzv, 1, this.zzu, 0, null);
                        this.zzv += this.zzx;
                        zzi();
                    }
                } else {
                    int i27 = true != this.zzn ? 5 : 7;
                    zzee zzeeVar2 = this.zzc;
                    if (zzh(zzefVar, zzeeVar2.zza, i27)) {
                        zzeeVar2.zzf(i12);
                        if (this.zzs) {
                            zzeeVar2.zzh(10);
                        } else {
                            int iZzj3 = zzeeVar2.zzj(i13) + 1;
                            if (iZzj3 != i13) {
                                StringBuilder sb = new StringBuilder(String.valueOf(iZzj3).length() + 50);
                                sb.append("Detected audio object type: ");
                                sb.append(iZzj3);
                                sb.append(", but assuming AAC LC.");
                                zzds.zzc("AdtsReader", sb.toString());
                            }
                            zzeeVar2.zzh(5);
                            int iZzj4 = zzeeVar2.zzj(3);
                            int i28 = this.zzq;
                            byte[] bArr = new byte[i13];
                            bArr[i12] = (byte) (((i28 >> 1) & 7) | 16);
                            bArr[1] = (byte) (((iZzj4 << 3) & 120) | ((i28 << 7) & 128));
                            zzabs zzabsVarZza = zzabt.zza(bArr);
                            zzs zzsVar = new zzs();
                            zzsVar.zza(this.zzh);
                            zzsVar.zzl(this.zzg);
                            zzsVar.zzm("audio/mp4a-latm");
                            zzsVar.zzj(zzabsVarZza.zzc);
                            zzsVar.zzE(zzabsVarZza.zzb);
                            zzsVar.zzF(zzabsVarZza.zza);
                            zzsVar.zzp(Collections.singletonList(bArr));
                            zzsVar.zze(this.zze);
                            zzsVar.zzg(this.zzf);
                            zzu zzuVarZzM = zzsVar.zzM();
                            this.zzt = 1024000000 / ((long) zzuVarZzM.zzH);
                            this.zzi.zzu(zzuVarZzM);
                            this.zzs = true;
                        }
                        zzeeVar2.zzh(4);
                        int iZzj5 = zzeeVar2.zzj(13);
                        int i29 = iZzj5 - 7;
                        if (this.zzn) {
                            i29 = iZzj5 - 9;
                        }
                        zzj(this.zzi, this.zzt, 0, i29);
                    }
                }
            } else if (zzefVar.zzd() != 0) {
                zzee zzeeVar3 = this.zzc;
                zzeeVar3.zza[i12] = zzefVar.zzi()[zzefVar.zzg()];
                zzeeVar3.zzf(i13);
                int iZzj6 = zzeeVar3.zzj(4);
                int i30 = this.zzq;
                if (i30 == -1 || iZzj6 == i30) {
                    if (!this.zzo) {
                        this.zzo = true;
                        this.zzp = this.zzr;
                        this.zzq = iZzj6;
                    }
                    zzk();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z7) {
    }
}
