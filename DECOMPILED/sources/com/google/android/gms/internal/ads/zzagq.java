package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagq implements zzan {
    public final List zza;

    public zzagq(List list) {
        this.zza = list;
        boolean z7 = false;
        if (!list.isEmpty()) {
            long j7 = ((zzagp) list.get(0)).zzb;
            for (int i7 = 1; i7 < list.size(); i7++) {
                if (((zzagp) list.get(i7)).zza < j7) {
                    z7 = true;
                    break;
                }
                j7 = ((zzagp) list.get(i7)).zzb;
            }
        }
        zzghc.zza(!z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzagq.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzagq) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }
}
