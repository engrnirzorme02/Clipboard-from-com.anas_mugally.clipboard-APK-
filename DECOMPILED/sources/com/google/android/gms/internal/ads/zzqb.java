package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqb extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzu zzc;

    public zzqb(int i7, zzu zzuVar, boolean z7) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 25);
        sb.append("AudioTrack write failed: ");
        sb.append(i7);
        super(sb.toString());
        this.zzb = z7;
        this.zza = i7;
        this.zzc = zzuVar;
    }
}
