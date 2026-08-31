package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzui extends zzud {
    public static final Object zzc = new Object();
    private final Object zzd;
    private final Object zze;

    private zzui(zzbe zzbeVar, Object obj, Object obj2) {
        super(zzbeVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zzui zzp(zzaj zzajVar) {
        return new zzui(new zzuj(zzajVar), zzbd.zza, zzc);
    }

    public static zzui zzq(zzbe zzbeVar, Object obj, Object obj2) {
        return new zzui(zzbeVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzbe
    public final zzbd zzb(int i7, zzbd zzbdVar, long j7) {
        this.zzb.zzb(i7, zzbdVar, j7);
        if (Objects.equals(zzbdVar.zzb, this.zzd)) {
            zzbdVar.zzb = zzbd.zza;
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzbe
    public final zzbc zzd(int i7, zzbc zzbcVar, boolean z7) {
        this.zzb.zzd(i7, zzbcVar, z7);
        if (Objects.equals(zzbcVar.zzb, this.zze) && z7) {
            zzbcVar.zzb = zzc;
        }
        return zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzbe
    public final int zze(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzbe
    public final Object zzf(int i7) {
        Object objZzf = this.zzb.zzf(i7);
        return Objects.equals(objZzf, this.zze) ? zzc : objZzf;
    }

    public final zzui zzr(zzbe zzbeVar) {
        return new zzui(zzbeVar, this.zzd, this.zze);
    }

    final /* synthetic */ Object zzs() {
        return this.zze;
    }
}
