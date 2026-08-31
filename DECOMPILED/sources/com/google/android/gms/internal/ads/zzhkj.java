package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.C3553a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzhkj extends zzhhb {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, C3553a.e.API_PRIORITY_OTHER};
    private final int zzc;
    private final zzhhb zzd;
    private final zzhhb zze;
    private final int zzf;
    private final int zzg;

    /* synthetic */ zzhkj(zzhhb zzhhbVar, zzhhb zzhhbVar2, byte[] bArr) {
        this(zzhhbVar, zzhhbVar2);
    }

    private static zzhhb zzD(zzhhb zzhhbVar, zzhhb zzhhbVar2) {
        int iZzc = zzhhbVar.zzc();
        int iZzc2 = zzhhbVar2.zzc();
        byte[] bArr = new byte[iZzc + iZzc2];
        zzhhbVar.zzu(bArr, 0, 0, iZzc);
        zzhhbVar2.zzu(bArr, 0, iZzc, iZzc2);
        return new zzhgz(bArr);
    }

    static zzhhb zzd(zzhhb zzhhbVar, zzhhb zzhhbVar2) {
        if (zzhhbVar2.zzc() == 0) {
            return zzhhbVar;
        }
        if (zzhhbVar.zzc() == 0) {
            return zzhhbVar2;
        }
        int iZzc = zzhhbVar.zzc() + zzhhbVar2.zzc();
        if (iZzc < 128) {
            return zzD(zzhhbVar, zzhhbVar2);
        }
        if (zzhhbVar instanceof zzhkj) {
            zzhkj zzhkjVar = (zzhkj) zzhhbVar;
            zzhhb zzhhbVar3 = zzhkjVar.zze;
            if (zzhhbVar3.zzc() + zzhhbVar2.zzc() < 128) {
                return new zzhkj(zzhkjVar.zzd, zzD(zzhhbVar3, zzhhbVar2));
            }
            zzhhb zzhhbVar4 = zzhkjVar.zzd;
            if (zzhhbVar4.zzf() > zzhhbVar3.zzf() && zzhkjVar.zzg > zzhhbVar2.zzf()) {
                return new zzhkj(zzhhbVar4, new zzhkj(zzhhbVar3, zzhhbVar2));
            }
        }
        return iZzc >= zzh(Math.max(zzhhbVar.zzf(), zzhhbVar2.zzf()) + 1) ? new zzhkj(zzhhbVar, zzhhbVar2) : zzhkh.zza(zzhhbVar, zzhhbVar2, new ArrayDeque());
    }

    static int zzh(int i7) {
        int[] iArr = zza;
        int length = iArr.length;
        return i7 >= 47 ? C3553a.e.API_PRIORITY_OTHER : iArr[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhhb)) {
            return false;
        }
        zzhhb zzhhbVar = (zzhhb) obj;
        int i7 = this.zzc;
        if (i7 != zzhhbVar.zzc()) {
            return false;
        }
        if (i7 == 0) {
            return true;
        }
        int iZzy = zzy();
        int iZzy2 = zzhhbVar.zzy();
        if (iZzy != 0 && iZzy2 != 0 && iZzy != iZzy2) {
            return false;
        }
        byte[] bArr = null;
        zzhki zzhkiVar = new zzhki(this, bArr);
        zzhgy zzhgyVarZza = zzhkiVar.next();
        zzhki zzhkiVar2 = new zzhki(zzhhbVar, bArr);
        zzhgy zzhgyVarZza2 = zzhkiVar2.next();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int iZzc = zzhgyVarZza.zzc() - i8;
            int iZzc2 = zzhgyVarZza2.zzc() - i9;
            int iMin = Math.min(iZzc, iZzc2);
            if (!(i8 == 0 ? zzhgyVarZza.zzh(zzhgyVarZza2, i9, iMin) : zzhgyVarZza2.zzh(zzhgyVarZza, i8, iMin))) {
                return false;
            }
            i10 += iMin;
            if (i10 >= i7) {
                if (i10 == i7) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzc) {
                zzhgyVarZza = zzhkiVar.next();
                i8 = 0;
            } else {
                i8 += iMin;
            }
            if (iMin == iZzc2) {
                zzhgyVarZza = zzhgyVarZza;
                zzhgyVarZza2 = zzhkiVar2.next();
                i9 = 0;
            } else {
                zzhgyVarZza = zzhgyVarZza;
                i9 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhb, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzhkg(this);
    }

    final /* synthetic */ zzhhb zzB() {
        return this.zzd;
    }

    final /* synthetic */ zzhhb zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final byte zza(int i7) {
        zzhhb.zzz(i7, this.zzc);
        return zzb(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    final byte zzb(int i7) {
        int i8 = this.zzf;
        return i7 < i8 ? this.zzd.zzb(i7) : this.zze.zzb(i7 - i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    protected final void zze(byte[] bArr, int i7, int i8, int i9) {
        int i10 = i7 + i9;
        int i11 = this.zzf;
        if (i10 <= i11) {
            this.zzd.zze(bArr, i7, i8, i9);
        } else {
            if (i7 >= i11) {
                this.zze.zze(bArr, i7 - i11, i8, i9);
                return;
            }
            int i12 = i11 - i7;
            this.zzd.zze(bArr, i7, i8, i12);
            this.zze.zze(bArr, 0, i8 + i12, i9 - i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    protected final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    protected final boolean zzg() {
        return this.zzc >= zzh(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final zzhhb zzi(int i7, int i8) {
        int i9 = this.zzc;
        int iZzA = zzhhb.zzA(i7, i8, i9);
        if (iZzA == 0) {
            return zzhhb.zzb;
        }
        if (iZzA == i9) {
            return this;
        }
        int i10 = this.zzf;
        if (i8 <= i10) {
            return this.zzd.zzi(i7, i8);
        }
        int i11 = i8 - i10;
        if (i7 >= i10) {
            return this.zze.zzi(i7 - i10, i11);
        }
        zzhhb zzhhbVar = this.zzd;
        return new zzhkj(zzhhbVar.zzi(i7, zzhhbVar.zzc()), this.zze.zzi(0, i11));
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final ByteBuffer zzj() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    final void zzk(zzhgs zzhgsVar) {
        this.zzd.zzk(zzhgsVar);
        this.zze.zzk(zzhgsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    protected final String zzl(Charset charset) {
        return new String(zzv(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final boolean zzm() {
        zzhhb zzhhbVar = this.zzd;
        zzhhb zzhhbVar2 = this.zze;
        return zzhhbVar2.zzn(zzhhbVar.zzn(0, 0, this.zzf), 0, zzhhbVar2.zzc()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    protected final int zzn(int i7, int i8, int i9) {
        int i10 = i8 + i9;
        int i11 = this.zzf;
        if (i10 <= i11) {
            return this.zzd.zzn(i7, i8, i9);
        }
        if (i8 >= i11) {
            return this.zze.zzn(i7, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return this.zze.zzn(this.zzd.zzn(i7, i8, i12), 0, i9 - i12);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    protected final int zzo(int i7, int i8, int i9) {
        int i10 = i8 + i9;
        int i11 = this.zzf;
        if (i10 <= i11) {
            return this.zzd.zzo(i7, i8, i9);
        }
        if (i8 >= i11) {
            return this.zze.zzo(i7, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return this.zze.zzo(this.zzd.zzo(i7, i8, i12), 0, i9 - i12);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final zzhhg zzp() {
        boolean z7 = true;
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        byte[] bArr = null;
        zzhki zzhkiVar = new zzhki(this, bArr);
        while (zzhkiVar.hasNext()) {
            arrayList.add(zzhkiVar.next().zzj());
        }
        int i7 = zzhhg.zzf;
        int i8 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i8 = byteBuffer.hasArray() ? i8 | 1 : byteBuffer.isDirect() ? i8 | 2 : i8 | 4;
        }
        return i8 == 2 ? new zzhhd(arrayList, iRemaining, z7, bArr) : zzhhg.zzF(new zzhix(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    /* JADX INFO: renamed from: zzq */
    public final zzhgw iterator() {
        return new zzhkg(this);
    }

    private zzhkj(zzhhb zzhhbVar, zzhhb zzhhbVar2) {
        this.zzd = zzhhbVar;
        this.zze = zzhhbVar2;
        int iZzc = zzhhbVar.zzc();
        this.zzf = iZzc;
        this.zzc = iZzc + zzhhbVar2.zzc();
        this.zzg = Math.max(zzhhbVar.zzf(), zzhhbVar2.zzf()) + 1;
    }
}
