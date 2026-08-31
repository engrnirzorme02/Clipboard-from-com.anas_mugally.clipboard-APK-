package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgd extends zzge {
    private zzgd(zzgb zzgbVar, Character ch) {
        super(zzgbVar, ch);
        zzbm.zzc(zzgbVar.zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzge
    final zzgf zza(zzgb zzgbVar, Character ch) {
        return new zzgd(zzgbVar, ch);
    }

    @Override // com.google.android.gms.internal.fido.zzge, com.google.android.gms.internal.fido.zzgf
    final void zzb(Appendable appendable, byte[] bArr, int i7, int i8) throws IOException {
        int i9 = 0;
        zzbm.zze(0, i8, bArr.length);
        for (int i10 = i8; i10 >= 3; i10 -= 3) {
            int i11 = bArr[i9] & 255;
            int i12 = ((bArr[i9 + 1] & 255) << 8) | (i11 << 16) | (bArr[i9 + 2] & 255);
            appendable.append(this.zzb.zza(i12 >>> 18));
            appendable.append(this.zzb.zza((i12 >>> 12) & 63));
            appendable.append(this.zzb.zza((i12 >>> 6) & 63));
            appendable.append(this.zzb.zza(i12 & 63));
            i9 += 3;
        }
        if (i9 < i8) {
            zze(appendable, bArr, i9, i8 - i9);
        }
    }

    zzgd(String str, String str2, Character ch) {
        this(new zzgb(str, str2.toCharArray()), ch);
    }
}
