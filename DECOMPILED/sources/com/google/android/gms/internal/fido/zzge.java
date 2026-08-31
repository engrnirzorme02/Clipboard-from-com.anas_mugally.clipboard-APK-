package com.google.android.gms.internal.fido;

import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class zzge extends zzgf {
    private volatile zzgf zza;
    final zzgb zzb;
    final Character zzc;

    zzge(zzgb zzgbVar, Character ch) {
        this.zzb = zzgbVar;
        if (ch != null && zzgbVar.zzc('=')) {
            throw new IllegalArgumentException(zzbo.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzge) {
            zzge zzgeVar = (zzge) obj;
            if (this.zzb.equals(zzgeVar.zzb) && Objects.equals(this.zzc, zzgeVar.zzc)) {
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
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    zzgf zza(zzgb zzgbVar, Character ch) {
        return new zzge(zzgbVar, ch);
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    void zzb(Appendable appendable, byte[] bArr, int i7, int i8) {
        int i9 = 0;
        zzbm.zze(0, i8, bArr.length);
        while (i9 < i8) {
            zze(appendable, bArr, i9, Math.min(this.zzb.zzd, i8 - i9));
            i9 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    final int zzc(int i7) {
        zzgb zzgbVar = this.zzb;
        return zzgbVar.zzc * zzgh.zza(i7, zzgbVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    public final zzgf zzd() {
        zzgf zzgfVarZza = this.zza;
        if (zzgfVarZza == null) {
            zzgb zzgbVar = this.zzb;
            zzgb zzgbVarZzb = zzgbVar.zzb();
            zzgfVarZza = zzgbVarZzb == zzgbVar ? this : zza(zzgbVarZzb, this.zzc);
            this.zza = zzgfVarZza;
        }
        return zzgfVarZza;
    }

    final void zze(Appendable appendable, byte[] bArr, int i7, int i8) {
        zzbm.zze(i7, i7 + i8, bArr.length);
        int i9 = 0;
        zzbm.zzc(i8 <= this.zzb.zzd);
        long j7 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            j7 = (j7 | ((long) (bArr[i7 + i10] & 255))) << 8;
        }
        int i11 = (i8 + 1) * 8;
        zzgb zzgbVar = this.zzb;
        while (i9 < i8 * 8) {
            long j8 = j7 >>> ((i11 - zzgbVar.zzb) - i9);
            zzgb zzgbVar2 = this.zzb;
            appendable.append(zzgbVar2.zza(((int) j8) & zzgbVar2.zza));
            i9 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i9 < this.zzb.zzd * 8) {
                this.zzc.getClass();
                appendable.append('=');
                i9 += this.zzb.zzb;
            }
        }
    }

    zzge(String str, String str2, Character ch) {
        this(new zzgb(str, str2.toCharArray()), ch);
    }
}
