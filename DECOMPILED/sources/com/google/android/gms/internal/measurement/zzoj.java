package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzoj {
    private static final zzoj zza = new zzoj(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzoj(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.zze = -1;
        this.zzb = i7;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z7;
    }

    public static zzoj zza() {
        return zza;
    }

    static zzoj zzb() {
        return new zzoj(0, new int[8], new Object[8], true);
    }

    static zzoj zzc(zzoj zzojVar, zzoj zzojVar2) {
        int i7 = zzojVar.zzb + zzojVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzojVar.zzc, i7);
        System.arraycopy(zzojVar2.zzc, 0, iArrCopyOf, zzojVar.zzb, zzojVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzojVar.zzd, i7);
        System.arraycopy(zzojVar2.zzd, 0, objArrCopyOf, zzojVar.zzb, zzojVar2.zzb);
        return new zzoj(i7, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzm(int i7) {
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
        if (obj == null || !(obj instanceof zzoj)) {
            return false;
        }
        zzoj zzojVar = (zzoj) obj;
        int i7 = this.zzb;
        if (i7 == zzojVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzojVar.zzc;
            for (int i8 = 0; i8 < i7; i8++) {
                if (iArr[i8] == iArr2[i8]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzojVar.zzd;
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

    final void zzf(zzov zzovVar) {
        for (int i7 = 0; i7 < this.zzb; i7++) {
            zzovVar.zzv(this.zzc[i7] >>> 3, this.zzd[i7]);
        }
    }

    public final void zzg(zzov zzovVar) {
        if (this.zzb != 0) {
            for (int i7 = 0; i7 < this.zzb; i7++) {
                int i8 = this.zzc[i7];
                Object obj = this.zzd[i7];
                int i9 = i8 & 7;
                int i10 = i8 >>> 3;
                if (i9 == 0) {
                    zzovVar.zzc(i10, ((Long) obj).longValue());
                } else if (i9 == 1) {
                    zzovVar.zzj(i10, ((Long) obj).longValue());
                } else if (i9 == 2) {
                    zzovVar.zzn(i10, (zzlh) obj);
                } else if (i9 == 3) {
                    zzovVar.zzt(i10);
                    ((zzoj) obj).zzg(zzovVar);
                    zzovVar.zzu(i10);
                } else {
                    if (i9 != 5) {
                        throw new RuntimeException(new zzmq("Protocol message tag had invalid wire type."));
                    }
                    zzovVar.zzk(i10, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int iZzz = 0;
        for (int i8 = 0; i8 < this.zzb; i8++) {
            int i9 = this.zzc[i8] >>> 3;
            zzlh zzlhVar = (zzlh) this.zzd[i8];
            int iZzz2 = zzlm.zzz(8);
            int iZzz3 = zzlm.zzz(16) + zzlm.zzz(i9);
            int iZzz4 = zzlm.zzz(24);
            int iZzc = zzlhVar.zzc();
            iZzz += iZzz2 + iZzz2 + iZzz3 + iZzz4 + zzlm.zzz(iZzc) + iZzc;
        }
        this.zze = iZzz;
        return iZzz;
    }

    public final int zzi() {
        int iZzz;
        int iZzA;
        int iZzz2;
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
                    iZzz2 = zzlm.zzz(i11 << 3) + 8;
                } else if (i12 == 2) {
                    int i13 = i11 << 3;
                    zzlh zzlhVar = (zzlh) this.zzd[i9];
                    int iZzz3 = zzlm.zzz(i13);
                    int iZzc = zzlhVar.zzc();
                    iZzz2 = iZzz3 + zzlm.zzz(iZzc) + iZzc;
                } else if (i12 == 3) {
                    int iZzz4 = zzlm.zzz(i11 << 3);
                    iZzz = iZzz4 + iZzz4;
                    iZzA = ((zzoj) this.zzd[i9]).zzi();
                } else {
                    if (i12 != 5) {
                        throw new IllegalStateException(new zzmq("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i9]).getClass();
                    iZzz2 = zzlm.zzz(i11 << 3) + 4;
                }
                i8 += iZzz2;
            } else {
                int i14 = i11 << 3;
                long jLongValue = ((Long) this.zzd[i9]).longValue();
                iZzz = zzlm.zzz(i14);
                iZzA = zzlm.zzA(jLongValue);
            }
            iZzz2 = iZzz + iZzA;
            i8 += iZzz2;
        }
        this.zze = i8;
        return i8;
    }

    final void zzj(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.zzb; i8++) {
            zzno.zzb(sb, i7, String.valueOf(this.zzc[i8] >>> 3), this.zzd[i8]);
        }
    }

    final void zzk(int i7, Object obj) {
        zze();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i8 = this.zzb;
        iArr[i8] = i7;
        this.zzd[i8] = obj;
        this.zzb = i8 + 1;
    }

    final zzoj zzl(zzoj zzojVar) {
        if (zzojVar.equals(zza)) {
            return this;
        }
        zze();
        int i7 = this.zzb + zzojVar.zzb;
        zzm(i7);
        System.arraycopy(zzojVar.zzc, 0, this.zzc, this.zzb, zzojVar.zzb);
        System.arraycopy(zzojVar.zzd, 0, this.zzd, this.zzb, zzojVar.zzb);
        this.zzb = i7;
        return this;
    }

    private zzoj() {
        this(0, new int[8], new Object[8], true);
    }
}
