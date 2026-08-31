package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwq {
    public static final zzwq zza = new zzwq(new zzbf[0]);
    public final int zzb;
    private final zzgjz zzc;
    private int zzd;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
    }

    public zzwq(zzbf... zzbfVarArr) {
        this.zzc = zzgjz.zzr(zzbfVarArr);
        this.zzb = zzbfVarArr.length;
        int i7 = 0;
        while (i7 < this.zzc.size()) {
            int i8 = i7 + 1;
            for (int i9 = i8; i9 < this.zzc.size(); i9++) {
                if (((zzbf) this.zzc.get(i7)).equals(this.zzc.get(i9))) {
                    zzds.zzf("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i7 = i8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzwq.class == obj.getClass()) {
            zzwq zzwqVar = (zzwq) obj;
            if (this.zzb == zzwqVar.zzb && this.zzc.equals(zzwqVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzd;
        if (i7 != 0) {
            return i7;
        }
        int iHashCode = this.zzc.hashCode();
        this.zzd = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzbf zza(int i7) {
        return (zzbf) this.zzc.get(i7);
    }

    public final int zzb(zzbf zzbfVar) {
        int iIndexOf = this.zzc.indexOf(zzbfVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final zzgjz zzc() {
        return zzgjz.zzq(zzgkp.zzc(this.zzc, zzwp.zza));
    }
}
