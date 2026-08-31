package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
class zzhgz extends zzhgy {
    protected final byte[] zza;

    zzhgz(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhhb) || zzc() != ((zzhhb) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzhgz)) {
            return obj.equals(this);
        }
        zzhgz zzhgzVar = (zzhgz) obj;
        int iZzy = zzy();
        int iZzy2 = zzhgzVar.zzy();
        if (iZzy == 0 || iZzy2 == 0 || iZzy == iZzy2) {
            return zzh(zzhgzVar, 0, zzc());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public byte zza(int i7) {
        return this.zza[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    byte zzb(int i7) {
        return this.zza[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public int zzc() {
        return this.zza.length;
    }

    protected int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    protected void zze(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(this.zza, i7, bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzhgy
    final boolean zzh(zzhhb zzhhbVar, int i7, int i8) {
        if (i8 > zzhhbVar.zzc()) {
            int iZzc = zzc();
            StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 18 + String.valueOf(iZzc).length());
            sb.append("Length too large: ");
            sb.append(i8);
            sb.append(iZzc);
            throw new IllegalArgumentException(sb.toString());
        }
        int i9 = i7 + i8;
        if (i9 > zzhhbVar.zzc()) {
            int iZzc2 = zzhhbVar.zzc();
            int length = String.valueOf(i7).length();
            StringBuilder sb2 = new StringBuilder(length + 24 + String.valueOf(i8).length() + 2 + String.valueOf(iZzc2).length());
            sb2.append("Ran off end of other: ");
            sb2.append(i7);
            sb2.append(", ");
            sb2.append(i8);
            sb2.append(", ");
            sb2.append(iZzc2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(zzhhbVar instanceof zzhgz)) {
            return zzhhbVar.zzi(i7, i9).equals(zzi(0, i8));
        }
        zzhgz zzhgzVar = (zzhgz) zzhhbVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzhgzVar.zza;
        int iZzd = zzd() + i8;
        int iZzd2 = zzd();
        int iZzd3 = zzhgzVar.zzd() + i7;
        while (iZzd2 < iZzd) {
            if (bArr[iZzd2] != bArr2[iZzd3]) {
                return false;
            }
            iZzd2++;
            iZzd3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final zzhhb zzi(int i7, int i8) {
        int iZzA = zzhhb.zzA(i7, i8, zzc());
        return iZzA == 0 ? zzhhb.zzb : new zzhgv(this.zza, zzd() + i7, iZzA);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final ByteBuffer zzj() {
        return ByteBuffer.wrap(this.zza, zzd(), zzc()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    final void zzk(zzhgs zzhgsVar) {
        zzhgsVar.zza(this.zza, zzd(), zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    protected final String zzl(Charset charset) {
        return new String(this.zza, zzd(), zzc(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final boolean zzm() {
        int iZzd = zzd();
        return zzhlh.zza(this.zza, iZzd, zzc() + iZzd);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    protected final int zzn(int i7, int i8, int i9) {
        int iZzd = zzd() + i8;
        return zzhlh.zzb(i7, this.zza, iZzd, i9 + iZzd);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    protected final int zzo(int i7, int i8, int i9) {
        return zzhiu.zzc(i7, this.zza, zzd() + i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final zzhhg zzp() {
        return zzhhg.zzG(this.zza, zzd(), zzc(), true);
    }
}
