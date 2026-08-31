package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzvz {
    private final zzef zza = new zzef(32);
    private zzvy zzb;
    private zzvy zzc;
    private zzvy zzd;
    private long zze;
    private final zzyv zzf;

    public zzvz(zzyv zzyvVar) {
        this.zzf = zzyvVar;
        zzvy zzvyVar = new zzvy(0L, 65536);
        this.zzb = zzvyVar;
        this.zzc = zzvyVar;
        this.zzd = zzvyVar;
    }

    private final int zzi(int i7) {
        zzvy zzvyVar = this.zzd;
        if (zzvyVar.zzc == null) {
            zzyo zzyoVarZzc = this.zzf.zzc();
            zzvy zzvyVar2 = new zzvy(this.zzd.zzb, 65536);
            zzvyVar.zzc = zzyoVarZzc;
            zzvyVar.zzd = zzvyVar2;
        }
        return Math.min(i7, (int) (this.zzd.zzb - this.zze));
    }

    private final void zzj(int i7) {
        long j7 = this.zze + ((long) i7);
        this.zze = j7;
        zzvy zzvyVar = this.zzd;
        if (j7 == zzvyVar.zzb) {
            this.zzd = zzvyVar.zzd;
        }
    }

    private static zzvy zzk(zzvy zzvyVar, zzhg zzhgVar, zzwa zzwaVar, zzef zzefVar) {
        zzvy zzvyVarZzm;
        int iZzt;
        if (zzhgVar.zzk()) {
            long j7 = zzwaVar.zzb;
            zzefVar.zza(1);
            zzvy zzvyVarZzm2 = zzm(zzvyVar, j7, zzefVar.zzi(), 1);
            long j8 = j7 + 1;
            byte b7 = zzefVar.zzi()[0];
            int i7 = b7 & 128;
            int i8 = b7 & 127;
            zzhd zzhdVar = zzhgVar.zzb;
            byte[] bArr = zzhdVar.zza;
            if (bArr == null) {
                zzhdVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z7 = i7 != 0;
            zzvyVarZzm = zzm(zzvyVarZzm2, j8, zzhdVar.zza, i8);
            long j9 = j8 + ((long) i8);
            if (z7) {
                zzefVar.zza(2);
                zzvyVarZzm = zzm(zzvyVarZzm, j9, zzefVar.zzi(), 2);
                j9 += 2;
                iZzt = zzefVar.zzt();
            } else {
                iZzt = 1;
            }
            int[] iArr = zzhdVar.zzd;
            if (iArr == null || iArr.length < iZzt) {
                iArr = new int[iZzt];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhdVar.zze;
            if (iArr3 == null || iArr3.length < iZzt) {
                iArr3 = new int[iZzt];
            }
            int[] iArr4 = iArr3;
            if (z7) {
                int i9 = iZzt * 6;
                zzefVar.zza(i9);
                zzvyVarZzm = zzm(zzvyVarZzm, j9, zzefVar.zzi(), i9);
                j9 += (long) i9;
                zzefVar.zzh(0);
                for (int i10 = 0; i10 < iZzt; i10++) {
                    iArr2[i10] = zzefVar.zzt();
                    iArr4[i10] = zzefVar.zzH();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzwaVar.zza - ((int) (j9 - zzwaVar.zzb));
            }
            zzaea zzaeaVar = zzwaVar.zzc;
            String str = zzeo.zza;
            zzhdVar.zza(iZzt, iArr2, iArr4, zzaeaVar.zzb, zzhdVar.zza, zzaeaVar.zza, zzaeaVar.zzc, zzaeaVar.zzd);
            long j10 = zzwaVar.zzb;
            int i11 = (int) (j9 - j10);
            zzwaVar.zzb = j10 + ((long) i11);
            zzwaVar.zza -= i11;
        } else {
            zzvyVarZzm = zzvyVar;
        }
        if (!zzhgVar.zze()) {
            zzhgVar.zzj(zzwaVar.zza);
            return zzl(zzvyVarZzm, zzwaVar.zzb, zzhgVar.zzc, zzwaVar.zza);
        }
        zzefVar.zza(4);
        zzvy zzvyVarZzm3 = zzm(zzvyVarZzm, zzwaVar.zzb, zzefVar.zzi(), 4);
        int iZzH = zzefVar.zzH();
        zzwaVar.zzb += 4;
        zzwaVar.zza -= 4;
        zzhgVar.zzj(iZzH);
        zzvy zzvyVarZzl = zzl(zzvyVarZzm3, zzwaVar.zzb, zzhgVar.zzc, iZzH);
        zzwaVar.zzb += (long) iZzH;
        int i12 = zzwaVar.zza - iZzH;
        zzwaVar.zza = i12;
        ByteBuffer byteBuffer = zzhgVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i12) {
            zzhgVar.zzf = ByteBuffer.allocate(i12);
        } else {
            zzhgVar.zzf.clear();
        }
        return zzl(zzvyVarZzl, zzwaVar.zzb, zzhgVar.zzf, zzwaVar.zza);
    }

    private static zzvy zzl(zzvy zzvyVar, long j7, ByteBuffer byteBuffer, int i7) {
        zzvy zzvyVarZzn = zzn(zzvyVar, j7);
        while (i7 > 0) {
            int iMin = Math.min(i7, (int) (zzvyVarZzn.zzb - j7));
            byteBuffer.put(zzvyVarZzn.zzc.zza, zzvyVarZzn.zzb(j7), iMin);
            i7 -= iMin;
            j7 += (long) iMin;
            if (j7 == zzvyVarZzn.zzb) {
                zzvyVarZzn = zzvyVarZzn.zzd;
            }
        }
        return zzvyVarZzn;
    }

    private static zzvy zzm(zzvy zzvyVar, long j7, byte[] bArr, int i7) {
        zzvy zzvyVarZzn = zzn(zzvyVar, j7);
        int i8 = i7;
        while (i8 > 0) {
            int iMin = Math.min(i8, (int) (zzvyVarZzn.zzb - j7));
            System.arraycopy(zzvyVarZzn.zzc.zza, zzvyVarZzn.zzb(j7), bArr, i7 - i8, iMin);
            i8 -= iMin;
            j7 += (long) iMin;
            if (j7 == zzvyVarZzn.zzb) {
                zzvyVarZzn = zzvyVarZzn.zzd;
            }
        }
        return zzvyVarZzn;
    }

    private static zzvy zzn(zzvy zzvyVar, long j7) {
        while (j7 >= zzvyVar.zzb) {
            zzvyVar = zzvyVar.zzd;
        }
        return zzvyVar;
    }

    public final void zza() {
        zzvy zzvyVar = this.zzb;
        if (zzvyVar.zzc != null) {
            this.zzf.zze(zzvyVar);
            zzvyVar.zzc();
        }
        this.zzb.zza(0L, 65536);
        zzvy zzvyVar2 = this.zzb;
        this.zzc = zzvyVar2;
        this.zzd = zzvyVar2;
        this.zze = 0L;
        this.zzf.zzf();
    }

    public final void zzb() {
        this.zzc = this.zzb;
    }

    public final void zzc(zzhg zzhgVar, zzwa zzwaVar) {
        this.zzc = zzk(this.zzc, zzhgVar, zzwaVar, this.zza);
    }

    public final void zzd(zzhg zzhgVar, zzwa zzwaVar) {
        zzk(this.zzc, zzhgVar, zzwaVar, this.zza);
    }

    public final void zze(long j7) {
        zzvy zzvyVar;
        if (j7 != -1) {
            while (true) {
                zzvyVar = this.zzb;
                if (j7 < zzvyVar.zzb) {
                    break;
                }
                this.zzf.zzd(zzvyVar.zzc);
                this.zzb = this.zzb.zzc();
            }
            if (this.zzc.zza < zzvyVar.zza) {
                this.zzc = zzvyVar;
            }
        }
    }

    public final long zzf() {
        return this.zze;
    }

    public final int zzg(zzi zziVar, int i7, boolean z7) throws EOFException {
        int iZzi = zzi(i7);
        zzvy zzvyVar = this.zzd;
        int iZza = zziVar.zza(zzvyVar.zzc.zza, zzvyVar.zzb(this.zze), iZzi);
        if (iZza != -1) {
            zzj(iZza);
            return iZza;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzh(zzef zzefVar, int i7) {
        while (i7 > 0) {
            int iZzi = zzi(i7);
            zzvy zzvyVar = this.zzd;
            zzefVar.zzm(zzvyVar.zzc.zza, zzvyVar.zzb(this.zze), iZzi);
            i7 -= iZzi;
            zzj(iZzi);
        }
    }
}
