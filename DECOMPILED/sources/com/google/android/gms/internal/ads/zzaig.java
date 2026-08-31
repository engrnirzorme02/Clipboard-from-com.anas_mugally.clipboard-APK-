package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaig implements zzadz {
    public static final zzaig zza = new zzaig(true);
    public static final zzaig zzb = new zzaig(false);
    public final boolean zzc;

    private zzaig(boolean z7) {
        this.zzc = z7;
    }

    public final String toString() {
        boolean z7 = !this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(z7).length() + 33);
        sb.append("IncorrectFragmentation{expected=");
        sb.append(z7);
        sb.append("}");
        return sb.toString();
    }
}
