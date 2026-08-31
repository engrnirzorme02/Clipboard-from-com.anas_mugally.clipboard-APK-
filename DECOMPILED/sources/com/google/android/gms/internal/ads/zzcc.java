package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcc {
    public static final zzcc zza = new zzcc(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzcc(int i7, int i8, int i9) {
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = i9;
        this.zze = zzeo.zzA(i9) ? zzeo.zzE(i9) * i8 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcc)) {
            return false;
        }
        zzcc zzccVar = (zzcc) obj;
        return this.zzb == zzccVar.zzb && this.zzc == zzccVar.zzc && this.zzd == zzccVar.zzd;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i7 = this.zzb;
        int length = String.valueOf(i7).length();
        int i8 = this.zzc;
        int length2 = String.valueOf(i8).length();
        int i9 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i9).length() + 1);
        sb.append("AudioFormat[sampleRate=");
        sb.append(i7);
        sb.append(", channelCount=");
        sb.append(i8);
        sb.append(", encoding=");
        sb.append(i9);
        sb.append("]");
        return sb.toString();
    }
}
