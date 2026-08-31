package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhkw {
    private static final zzhkw zza = new zzhkw(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhkw(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.zze = -1;
        this.zzb = i7;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z7;
    }

    public static zzhkw zza() {
        return zza;
    }

    static zzhkw zzb() {
        return new zzhkw();
    }

    static zzhkw zzc(zzhkw zzhkwVar, zzhkw zzhkwVar2) {
        int i7 = zzhkwVar.zzb + zzhkwVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzhkwVar.zzc, i7);
        System.arraycopy(zzhkwVar2.zzc, 0, iArrCopyOf, zzhkwVar.zzb, zzhkwVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzhkwVar.zzd, i7);
        System.arraycopy(zzhkwVar2.zzd, 0, objArrCopyOf, zzhkwVar.zzb, zzhkwVar2.zzb);
        return new zzhkw(i7, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzn(int i7) {
        int[] iArr = this.zzc;
        if (i7 > iArr.length) {
            int i8 = this.zzb;
            int i9 = i8 + (i8 / 2);
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i7);
            this.zzd = Arrays.copyOf(this.zzd, i7);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhkw)) {
            return false;
        }
        zzhkw zzhkwVar = (zzhkw) obj;
        int i7 = this.zzb;
        if (i7 == zzhkwVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhkwVar.zzc;
            for (int i8 = 0; i8 < i7; i8++) {
                if (iArr[i8] == iArr2[i8]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzhkwVar.zzd;
            int i9 = this.zzb;
            for (int i10 = 0; i10 < i9; i10++) {
                if (objArr[i10].equals(objArr2[i10])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzb;
        int i8 = i7 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i9 = 17;
        for (int i10 = 0; i10 < i7; i10++) {
            i9 = (i9 * 31) + iArr[i10];
        }
        int i11 = ((i8 * 31) + i9) * 31;
        Object[] objArr = this.zzd;
        int i12 = this.zzb;
        for (int i13 = 0; i13 < i12; i13++) {
            iHashCode = (iHashCode * 31) + objArr[i13].hashCode();
        }
        return i11 + iHashCode;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    final void zzf(zzhlk zzhlkVar) {
        for (int i7 = 0; i7 < this.zzb; i7++) {
            zzhlkVar.zzv(this.zzc[i7] >>> 3, this.zzd[i7]);
        }
    }

    public final void zzg(zzhlk zzhlkVar) {
        if (this.zzb != 0) {
            for (int i7 = 0; i7 < this.zzb; i7++) {
                int i8 = this.zzc[i7];
                Object obj = this.zzd[i7];
                int i9 = i8 & 7;
                int i10 = i8 >>> 3;
                if (i9 == 0) {
                    zzhlkVar.zzc(i10, ((Long) obj).longValue());
                } else if (i9 == 1) {
                    zzhlkVar.zzj(i10, ((Long) obj).longValue());
                } else if (i9 == 2) {
                    zzhlkVar.zzn(i10, (zzhhb) obj);
                } else if (i9 == 3) {
                    zzhlkVar.zzt(i10);
                    ((zzhkw) obj).zzg(zzhlkVar);
                    zzhlkVar.zzu(i10);
                } else {
                    if (i9 != 5) {
                        throw new RuntimeException(new zzhiv("Protocol message tag had invalid wire type."));
                    }
                    zzhlkVar.zzk(i10, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int iZzA = 0;
        for (int i8 = 0; i8 < this.zzb; i8++) {
            int i9 = this.zzc[i8] >>> 3;
            zzhhb zzhhbVar = (zzhhb) this.zzd[i8];
            int iZzA2 = zzhhm.zzA(8);
            int iZzA3 = zzhhm.zzA(16) + zzhhm.zzA(i9);
            int iZzA4 = zzhhm.zzA(24);
            int iZzc = zzhhbVar.zzc();
            iZzA += iZzA2 + iZzA2 + iZzA3 + iZzA4 + zzhhm.zzA(iZzc) + iZzc;
        }
        this.zze = iZzA;
        return iZzA;
    }

    public final int zzi() {
        int iZzA;
        int iZzB;
        int iZzA2;
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.zzb; i9++) {
            int i10 = this.zzc[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 == 1) {
                    ((Long) this.zzd[i9]).getClass();
                    iZzA2 = zzhhm.zzA(i11 << 3) + 8;
                } else if (i12 == 2) {
                    int i13 = i11 << 3;
                    zzhhb zzhhbVar = (zzhhb) this.zzd[i9];
                    int iZzA3 = zzhhm.zzA(i13);
                    int iZzc = zzhhbVar.zzc();
                    iZzA2 = iZzA3 + zzhhm.zzA(iZzc) + iZzc;
                } else if (i12 == 3) {
                    int iZzA4 = zzhhm.zzA(i11 << 3);
                    iZzA = iZzA4 + iZzA4;
                    iZzB = ((zzhkw) this.zzd[i9]).zzi();
                } else {
                    if (i12 != 5) {
                        throw new IllegalStateException(new zzhiv("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i9]).getClass();
                    iZzA2 = zzhhm.zzA(i11 << 3) + 4;
                }
                i8 += iZzA2;
            } else {
                int i14 = i11 << 3;
                long jLongValue = ((Long) this.zzd[i9]).longValue();
                iZzA = zzhhm.zzA(i14);
                iZzB = zzhhm.zzB(jLongValue);
            }
            iZzA2 = iZzA + iZzB;
            i8 += iZzA2;
        }
        this.zze = i8;
        return i8;
    }

    final void zzj(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.zzb; i8++) {
            zzhju.zzb(sb, i7, String.valueOf(this.zzc[i8] >>> 3), this.zzd[i8]);
        }
    }

    final void zzk(int i7, Object obj) {
        zze();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i8 = this.zzb;
        iArr[i8] = i7;
        this.zzd[i8] = obj;
        this.zzb = i8 + 1;
    }

    final boolean zzl(int i7, zzhhg zzhhgVar) throws zzhiv {
        int iZza;
        zze();
        int i8 = i7 & 7;
        if (i8 == 0) {
            zzk(i7, Long.valueOf(zzhhgVar.zzg()));
            return true;
        }
        if (i8 == 1) {
            zzk(i7, Long.valueOf(zzhhgVar.zzi()));
            return true;
        }
        if (i8 == 2) {
            zzk(i7, zzhhgVar.zzn());
            return true;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                zzhhgVar.zzI();
                return false;
            }
            if (i8 != 5) {
                throw new zzhiv("Protocol message tag had invalid wire type.");
            }
            zzk(i7, Integer.valueOf(zzhhgVar.zzj()));
            return true;
        }
        zzhkw zzhkwVar = new zzhkw();
        do {
            iZza = zzhhgVar.zza();
            if (iZza == 0) {
                break;
            }
        } while (zzhkwVar.zzl(iZza, zzhhgVar));
        zzhhgVar.zzb(4 | ((i7 >>> 3) << 3));
        zzk(i7, zzhkwVar);
        return true;
    }

    final zzhkw zzm(zzhkw zzhkwVar) {
        if (zzhkwVar.equals(zza)) {
            return this;
        }
        zze();
        int i7 = this.zzb + zzhkwVar.zzb;
        zzn(i7);
        System.arraycopy(zzhkwVar.zzc, 0, this.zzc, this.zzb, zzhkwVar.zzb);
        System.arraycopy(zzhkwVar.zzd, 0, this.zzd, this.zzb, zzhkwVar.zzb);
        this.zzb = i7;
        return this;
    }

    private zzhkw() {
        this(0, new int[8], new Object[8], true);
    }
}
