package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgmg extends zzgmj {
    final char[] zza;

    private zzgmg(zzgmf zzgmfVar) {
        super(zzgmfVar, null);
        this.zza = new char[512];
        zzghc.zza(zzgmfVar.zzf().length == 16);
        for (int i7 = 0; i7 < 256; i7++) {
            this.zza[i7] = zzgmfVar.zza(i7 >>> 4);
            this.zza[i7 | 256] = zzgmfVar.zza(i7 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmj, com.google.android.gms.internal.ads.zzgmk
    final void zza(Appendable appendable, byte[] bArr, int i7, int i8) throws IOException {
        zzghc.zzo(0, i8, bArr.length);
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = bArr[i9] & 255;
            char[] cArr = this.zza;
            appendable.append(cArr[i10]);
            appendable.append(cArr[i10 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmj, com.google.android.gms.internal.ads.zzgmk
    final int zzb(byte[] bArr, CharSequence charSequence) throws zzgmi {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 21);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new zzgmi(sb.toString());
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequence.length()) {
            zzgmf zzgmfVar = this.zzb;
            bArr[i8] = (byte) (zzgmfVar.zzc(charSequence.charAt(i7 + 1)) | (zzgmfVar.zzc(charSequence.charAt(i7)) << 4));
            i7 += 2;
            i8++;
        }
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    final zzgmk zzc(zzgmf zzgmfVar, Character ch) {
        return new zzgmg(zzgmfVar);
    }

    zzgmg(String str, String str2) {
        this(new zzgmf("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
