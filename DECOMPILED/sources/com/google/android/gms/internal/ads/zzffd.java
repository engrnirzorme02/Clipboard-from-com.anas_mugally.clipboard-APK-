package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzffd implements zzffb {
    private final String zza;

    public zzffd(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzffb
    public final boolean equals(Object obj) {
        if (obj instanceof zzffd) {
            return this.zza.equals(((zzffd) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzffb
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
