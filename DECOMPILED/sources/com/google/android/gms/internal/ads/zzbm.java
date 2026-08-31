package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbm {
    public static final zzbm zza = new zzbm(zzgjz.zzi());
    private final zzgjz zzb;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
    }

    public zzbm(List list) {
        this.zzb = zzgjz.zzq(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbm.class != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzbm) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzgjz zza() {
        return this.zzb;
    }

    public final boolean zzb(int i7) {
        int i8 = 0;
        while (true) {
            zzgjz zzgjzVar = this.zzb;
            if (i8 >= zzgjzVar.size()) {
                return false;
            }
            zzbl zzblVar = (zzbl) zzgjzVar.get(i8);
            if (zzblVar.zzb() && zzblVar.zzd() == i7) {
                return true;
            }
            i8++;
        }
    }
}
