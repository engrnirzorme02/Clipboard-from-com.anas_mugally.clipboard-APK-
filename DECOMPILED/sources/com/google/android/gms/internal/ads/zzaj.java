package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaj {
    public final String zza;
    public final zzaf zzb;
    public final zzae zzc;
    public final zzam zzd;
    public final zzaa zze;
    public final zzah zzf;

    static {
        new zzy().zzc();
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    /* synthetic */ zzaj(String str, zzab zzabVar, zzaf zzafVar, zzae zzaeVar, zzam zzamVar, zzah zzahVar, byte[] bArr) {
        this.zza = str;
        this.zzb = zzafVar;
        this.zzc = zzaeVar;
        this.zzd = zzamVar;
        this.zze = zzabVar;
        this.zzf = zzahVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaj)) {
            return false;
        }
        zzaj zzajVar = (zzaj) obj;
        return Objects.equals(this.zza, zzajVar.zza) && this.zze.equals(zzajVar.zze) && Objects.equals(this.zzb, zzajVar.zzb) && Objects.equals(this.zzc, zzajVar.zzc) && Objects.equals(this.zzd, zzajVar.zzd) && Objects.equals(this.zzf, zzajVar.zzf);
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() * 31;
        zzaf zzafVar = this.zzb;
        return (((((((iHashCode + (zzafVar != null ? zzafVar.hashCode() : 0)) * 31) + this.zzc.hashCode()) * 31) + this.zze.hashCode()) * 31) + this.zzd.hashCode()) * 31;
    }
}
