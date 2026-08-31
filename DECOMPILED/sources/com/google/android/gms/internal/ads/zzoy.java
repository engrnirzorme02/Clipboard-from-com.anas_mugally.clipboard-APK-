package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzoy {
    public static final zzoy zza;
    public final int zzb;
    public final int zzc;
    private final zzgke zzd;

    static {
        zzoy zzoyVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzgkd zzgkdVar = new zzgkd();
            for (int i7 = 1; i7 <= 10; i7++) {
                zzgkdVar.zzf(Integer.valueOf(zzeo.zzB(i7)));
            }
            zzoyVar = new zzoy(2, zzgkdVar.zzi());
        } else {
            zzoyVar = new zzoy(2, 10);
        }
        zza = zzoyVar;
    }

    public zzoy(int i7, int i8) {
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzoy)) {
            return false;
        }
        zzoy zzoyVar = (zzoy) obj;
        return this.zzb == zzoyVar.zzb && this.zzc == zzoyVar.zzc && Objects.equals(this.zzd, zzoyVar.zzd);
    }

    public final int hashCode() {
        zzgke zzgkeVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzgkeVar == null ? 0 : zzgkeVar.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int i7 = this.zzb;
        int length = String.valueOf(i7).length();
        int i8 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(i8).length() + 15 + strValueOf.length() + 1);
        sb.append("AudioProfile[format=");
        sb.append(i7);
        sb.append(", maxChannelCount=");
        sb.append(i8);
        sb.append(", channelMasks=");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    public final boolean zza(int i7) {
        zzgke zzgkeVar = this.zzd;
        if (zzgkeVar == null) {
            return i7 <= this.zzc;
        }
        int iZzB = zzeo.zzB(i7);
        if (iZzB == 0) {
            return false;
        }
        return zzgkeVar.contains(Integer.valueOf(iZzB));
    }

    public final int zzb(int i7, zzc zzcVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Integer num = (Integer) zzoz.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i8 = this.zzb;
        for (int i9 = 10; i9 > 0; i9--) {
            int iZzB = zzeo.zzB(i9);
            if (iZzB != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i8).setSampleRate(i7).setChannelMask(iZzB).build(), zzcVar.zza())) {
                return i9;
            }
        }
        return 0;
    }

    public zzoy(int i7, Set set) {
        this.zzb = i7;
        zzgke zzgkeVarZzo = zzgke.zzo(set);
        this.zzd = zzgkeVarZzo;
        zzgmd it = zzgkeVarZzo.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }
}
