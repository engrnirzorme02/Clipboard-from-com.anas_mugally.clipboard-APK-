package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzls {
    public static final zzls zza = new zzls(new zzlr());
    public final zzgke zzb;
    public final Double zzc = null;
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = true;
    public final boolean zzg = true;
    public final boolean zzh = true;

    private zzls(zzlr zzlrVar) {
        this.zzb = zzlrVar.zza();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzls) && this.zzb.equals(((zzls) obj).zzb);
    }

    public final int hashCode() {
        zzgke zzgkeVar = this.zzb;
        Boolean bool = Boolean.TRUE;
        return Objects.hash(zzgkeVar, null, null, bool, bool, bool, bool);
    }
}
