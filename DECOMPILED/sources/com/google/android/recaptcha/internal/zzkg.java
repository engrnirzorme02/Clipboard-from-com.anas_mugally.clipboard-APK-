package com.google.android.recaptcha.internal;

import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class zzkg extends zzkh {
    final zzkd zza;
    final Character zzb;

    zzkg(zzkd zzkdVar, Character ch) {
        this.zza = zzkdVar;
        if (ch != null && zzkdVar.zzd('=')) {
            throw new IllegalArgumentException(zzji.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzb = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzkg) {
            zzkg zzkgVar = (zzkg) obj;
            if (this.zza.equals(zzkgVar.zza) && Objects.equals(this.zzb, zzkgVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzb;
        return Objects.hashCode(ch) ^ this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zza);
        if (8 % this.zza.zzb != 0) {
            if (this.zzb == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzb);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    int zza(byte[] bArr, CharSequence charSequence) throws zzkf {
        zzkd zzkdVar;
        CharSequence charSequenceZze = zze(charSequence);
        if (!this.zza.zzc(charSequenceZze.length())) {
            throw new zzkf("Invalid input length " + charSequenceZze.length());
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequenceZze.length()) {
            long jZzb = 0;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                zzkdVar = this.zza;
                if (i9 >= zzkdVar.zzc) {
                    break;
                }
                jZzb <<= zzkdVar.zzb;
                if (i7 + i9 < charSequenceZze.length()) {
                    jZzb |= (long) this.zza.zzb(charSequenceZze.charAt(i10 + i7));
                    i10++;
                }
                i9++;
            }
            int i11 = zzkdVar.zzd;
            int i12 = i10 * zzkdVar.zzb;
            int i13 = (i11 - 1) * 8;
            while (i13 >= (i11 * 8) - i12) {
                bArr[i8] = (byte) ((jZzb >>> i13) & 255);
                i13 -= 8;
                i8++;
            }
            i7 += this.zza.zzc;
        }
        return i8;
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    void zzb(Appendable appendable, byte[] bArr, int i7, int i8) {
        int i9 = 0;
        zzjf.zzd(0, i8, bArr.length);
        while (i9 < i8) {
            zzf(appendable, bArr, i9, Math.min(this.zza.zzd, i8 - i9));
            i9 += this.zza.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    final int zzc(int i7) {
        return (int) (((((long) this.zza.zzb) * ((long) i7)) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    final int zzd(int i7) {
        zzkd zzkdVar = this.zza;
        return zzkdVar.zzc * zzkj.zza(i7, zzkdVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzb == null) {
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

    final void zzf(Appendable appendable, byte[] bArr, int i7, int i8) {
        zzjf.zzd(i7, i7 + i8, bArr.length);
        int i9 = 0;
        zzjf.zza(i8 <= this.zza.zzd);
        long j7 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            j7 = (j7 | ((long) (bArr[i7 + i10] & 255))) << 8;
        }
        int i11 = (i8 + 1) * 8;
        zzkd zzkdVar = this.zza;
        while (i9 < i8 * 8) {
            long j8 = j7 >>> ((i11 - zzkdVar.zzb) - i9);
            zzkd zzkdVar2 = this.zza;
            appendable.append(zzkdVar2.zza(((int) j8) & zzkdVar2.zza));
            i9 += this.zza.zzb;
        }
        if (this.zzb != null) {
            while (i9 < this.zza.zzd * 8) {
                this.zzb.getClass();
                appendable.append('=');
                i9 += this.zza.zzb;
            }
        }
    }

    zzkg(String str, String str2, Character ch) {
        this(new zzkd(str, str2.toCharArray()), ch);
    }
}
