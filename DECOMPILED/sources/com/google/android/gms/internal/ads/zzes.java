package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzes implements zzan {
    public final int zza;

    public zzes(int i7) {
        this.zza = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzes) && this.zza == ((zzes) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final String toString() {
        int i7 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 19);
        sb.append("Mp4AlternateGroup: ");
        sb.append(i7);
        return sb.toString();
    }
}
