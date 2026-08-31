package com.google.android.recaptcha.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzke extends zzkg {
    zzke(String str, String str2, Character ch) {
        zzkd zzkdVar = new zzkd(str, str2.toCharArray());
        super(zzkdVar, ch);
        zzjf.zza(zzkdVar.zzf.length == 64);
    }

    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    final int zza(byte[] bArr, CharSequence charSequence) throws zzkf {
        CharSequence charSequenceZze = zze(charSequence);
        if (!this.zza.zzc(charSequenceZze.length())) {
            throw new zzkf("Invalid input length " + charSequenceZze.length());
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequenceZze.length()) {
            int i9 = i8 + 1;
            int iZzb = (this.zza.zzb(charSequenceZze.charAt(i7)) << 18) | (this.zza.zzb(charSequenceZze.charAt(i7 + 1)) << 12);
            bArr[i8] = (byte) (iZzb >>> 16);
            int i10 = i7 + 2;
            if (i10 < charSequenceZze.length()) {
                int i11 = i7 + 3;
                int iZzb2 = iZzb | (this.zza.zzb(charSequenceZze.charAt(i10)) << 6);
                int i12 = i8 + 2;
                bArr[i9] = (byte) ((iZzb2 >>> 8) & 255);
                if (i11 < charSequenceZze.length()) {
                    i7 += 4;
                    i8 += 3;
                    bArr[i12] = (byte) ((iZzb2 | this.zza.zzb(charSequenceZze.charAt(i11))) & 255);
                } else {
                    i8 = i12;
                    i7 = i11;
                }
            } else {
                i7 = i10;
                i8 = i9;
            }
        }
        return i8;
    }

    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    final void zzb(Appendable appendable, byte[] bArr, int i7, int i8) throws IOException {
        int i9 = 0;
        zzjf.zzd(0, i8, bArr.length);
        for (int i10 = i8; i10 >= 3; i10 -= 3) {
            int i11 = bArr[i9] & 255;
            int i12 = ((bArr[i9 + 1] & 255) << 8) | (i11 << 16) | (bArr[i9 + 2] & 255);
            appendable.append(this.zza.zza(i12 >>> 18));
            appendable.append(this.zza.zza((i12 >>> 12) & 63));
            appendable.append(this.zza.zza((i12 >>> 6) & 63));
            appendable.append(this.zza.zza(i12 & 63));
            i9 += 3;
        }
        if (i9 < i8) {
            zzf(appendable, bArr, i9, i8 - i9);
        }
    }
}
