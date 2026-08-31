package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class zzgmj extends zzgmk {
    private volatile zzgmk zza;
    final zzgmf zzb;
    final Character zzc;

    zzgmj(zzgmf zzgmfVar, Character ch) {
        this.zzb = zzgmfVar;
        boolean z7 = true;
        if (ch != null && zzgmfVar.zze('=')) {
            z7 = false;
        }
        zzghc.zzf(z7, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgmj) {
            zzgmj zzgmjVar = (zzgmj) obj;
            if (this.zzb.equals(zzgmjVar.zzb) && Objects.equals(this.zzc, zzgmjVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        zzgmf zzgmfVar = this.zzb;
        sb.append(zzgmfVar);
        if (8 % zzgmfVar.zzb != 0) {
            Character ch = this.zzc;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    void zza(Appendable appendable, byte[] bArr, int i7, int i8) {
        int i9 = 0;
        zzghc.zzo(0, i8, bArr.length);
        while (i9 < i8) {
            int i10 = this.zzb.zzd;
            zze(appendable, bArr, i9, Math.min(i10, i8 - i9));
            i9 += i10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    int zzb(byte[] bArr, CharSequence charSequence) throws zzgmi {
        int i7;
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
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequenceZzg.length()) {
            long jZzc = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                i7 = zzgmfVar.zzc;
                if (i10 >= i7) {
                    break;
                }
                jZzc <<= zzgmfVar.zzb;
                if (i8 + i10 < charSequenceZzg.length()) {
                    jZzc |= (long) zzgmfVar.zzc(charSequenceZzg.charAt(i11 + i8));
                    i11++;
                }
                i10++;
            }
            int i12 = zzgmfVar.zzd;
            int i13 = i11 * zzgmfVar.zzb;
            int i14 = (i12 - 1) * 8;
            while (i14 >= (i12 * 8) - i13) {
                bArr[i9] = (byte) ((jZzc >>> i14) & 255);
                i14 -= 8;
                i9++;
            }
            i8 += i7;
        }
        return i9;
    }

    zzgmk zzc(zzgmf zzgmfVar, Character ch) {
        return new zzgmj(zzgmfVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    final int zzd(int i7) {
        zzgmf zzgmfVar = this.zzb;
        return zzgmfVar.zzc * zzgmx.zzb(i7, zzgmfVar.zzd, RoundingMode.CEILING);
    }

    final void zze(Appendable appendable, byte[] bArr, int i7, int i8) {
        zzghc.zzo(i7, i7 + i8, bArr.length);
        zzgmf zzgmfVar = this.zzb;
        int i9 = zzgmfVar.zzd;
        int i10 = 0;
        zzghc.zza(i8 <= i9);
        long j7 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            j7 = (j7 | ((long) (bArr[i7 + i11] & 255))) << 8;
        }
        int i12 = (i8 + 1) * 8;
        int i13 = zzgmfVar.zzb;
        while (i10 < i8 * 8) {
            appendable.append(zzgmfVar.zza(zzgmfVar.zza & ((int) (j7 >>> ((i12 - i13) - i10)))));
            i10 += i13;
        }
        if (this.zzc != null) {
            while (i10 < i9 * 8) {
                appendable.append('=');
                i10 += i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    final int zzf(int i7) {
        return (int) (((((long) this.zzb.zzb) * ((long) i7)) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    public final zzgmk zzh() {
        return this.zzc == null ? this : zzc(this.zzb, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    public final zzgmk zzi() {
        zzgmk zzgmkVarZzc = this.zza;
        if (zzgmkVarZzc == null) {
            zzgmf zzgmfVar = this.zzb;
            zzgmf zzgmfVarZzd = zzgmfVar.zzd();
            zzgmkVarZzc = zzgmfVarZzd == zzgmfVar ? this : zzc(zzgmfVarZzd, this.zzc);
            this.zza = zzgmkVarZzc;
        }
        return zzgmkVarZzc;
    }

    zzgmj(String str, String str2, Character ch) {
        this(new zzgmf(str, str2.toCharArray()), ch);
    }
}
