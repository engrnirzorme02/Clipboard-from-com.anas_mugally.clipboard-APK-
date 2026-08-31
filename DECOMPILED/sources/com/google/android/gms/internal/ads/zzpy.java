package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpy extends Exception {
    public final int zza;
    public final boolean zzb;

    public zzpy(int i7, int i8, int i9, int i10, int i11, zzu zzuVar, boolean z7, Exception exc) {
        String strValueOf = String.valueOf(zzuVar);
        int length = String.valueOf(i7).length();
        int length2 = String.valueOf(i8).length();
        int length3 = String.valueOf(i9).length();
        int length4 = String.valueOf(i10).length();
        int length5 = String.valueOf(i11).length();
        int length6 = strValueOf.length();
        int i12 = length + 31 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2;
        String str = true != z7 ? "" : " (recoverable)";
        StringBuilder sb = new StringBuilder(i12 + length6 + str.length());
        sb.append("AudioTrack init failed ");
        sb.append(i7);
        sb.append(" Config(");
        sb.append(i8);
        sb.append(", ");
        sb.append(i9);
        sb.append(", ");
        sb.append(i10);
        sb.append(", ");
        sb.append(i11);
        sb.append(") ");
        sb.append(strValueOf);
        sb.append(str);
        super(sb.toString(), exc);
        this.zza = i7;
        this.zzb = z7;
    }
}
