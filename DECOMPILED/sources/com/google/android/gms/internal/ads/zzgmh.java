package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgmh extends zzgmj {
    private zzgmh(zzgmf zzgmfVar, Character ch) {
        super(zzgmfVar, ch);
        zzghc.zza(zzgmfVar.zzf().length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgmj, com.google.android.gms.internal.ads.zzgmk
    final void zza(Appendable appendable, byte[] bArr, int i7, int i8) throws IOException {
        int i9 = 0;
        zzghc.zzo(0, i8, bArr.length);
        for (int i10 = i8; i10 >= 3; i10 -= 3) {
            int i11 = bArr[i9] & 255;
            int i12 = bArr[i9 + 1] & 255;
            int i13 = bArr[i9 + 2] & 255;
            zzgmf zzgmfVar = this.zzb;
            int i14 = (i12 << 8) | (i11 << 16) | i13;
            appendable.append(zzgmfVar.zza(i14 >>> 18));
            appendable.append(zzgmfVar.zza((i14 >>> 12) & 63));
            appendable.append(zzgmfVar.zza((i14 >>> 6) & 63));
            appendable.append(zzgmfVar.zza(i14 & 63));
            i9 += 3;
        }
        if (i9 < i8) {
            zze(appendable, bArr, i9, i8 - i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmj, com.google.android.gms.internal.ads.zzgmk
    final int zzb(byte[] bArr, CharSequence charSequence) throws zzgmi {
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgmf zzgmfVar = this.zzb;
        if (!zzgmfVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            StringBuilder sb = new StringBuilder(String.valueOf(length2).length() + 21);
            sb.append("Invalid input length ");
            sb.append(length2);
            throw new zzgmi(sb.toString());
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequenceZzg.length()) {
            int i9 = i8 + 1;
            int iZzc = (zzgmfVar.zzc(charSequenceZzg.charAt(i7 + 1)) << 12) | (zzgmfVar.zzc(charSequenceZzg.charAt(i7)) << 18);
            bArr[i8] = (byte) (iZzc >>> 16);
            int i10 = i7 + 2;
            if (i10 < charSequenceZzg.length()) {
                int i11 = i7 + 3;
                int iZzc2 = iZzc | (zzgmfVar.zzc(charSequenceZzg.charAt(i10)) << 6);
                int i12 = i8 + 2;
                bArr[i9] = (byte) ((iZzc2 >>> 8) & 255);
                if (i11 < charSequenceZzg.length()) {
                    i7 += 4;
                    i8 += 3;
                    bArr[i12] = (byte) ((iZzc2 | zzgmfVar.zzc(charSequenceZzg.charAt(i11))) & 255);
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

    @Override // com.google.android.gms.internal.ads.zzgmj
    final zzgmk zzc(zzgmf zzgmfVar, Character ch) {
        return new zzgmh(zzgmfVar, ch);
    }

    zzgmh(String str, String str2, Character ch) {
        this(new zzgmf(str, str2.toCharArray()), ch);
    }
}
