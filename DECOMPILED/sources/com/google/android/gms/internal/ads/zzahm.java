package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahm implements zzadz {
    public final int zza;
    public final long zzb;
    public final int zzc;

    public zzahm(int i7, long j7, int i8) {
        this.zza = i7;
        this.zzb = j7;
        this.zzc = i8;
    }

    public final String toString() {
        String strZzx = zzeo.zzx(this.zza);
        int length = strZzx.length();
        long j7 = this.zzb;
        int length2 = String.valueOf(j7).length();
        int i7 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 29 + length2 + 16 + String.valueOf(i7).length() + 1);
        sb.append("AtomSizeTooSmall{type=");
        sb.append(strZzx);
        sb.append(", size=");
        sb.append(j7);
        sb.append(", minHeaderSize=");
        sb.append(i7);
        sb.append("}");
        return sb.toString();
    }
}
