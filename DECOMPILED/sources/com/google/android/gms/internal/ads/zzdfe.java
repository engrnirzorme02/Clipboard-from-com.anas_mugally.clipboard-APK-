package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import p396y2.AbstractBinderC7534v;

/* JADX INFO: loaded from: classes2.dex */
public class zzdfe {
    private final zzdgp zza;
    private final zzcek zzb;

    public zzdfe(zzdgp zzdgpVar, zzcek zzcekVar) {
        this.zza = zzdgpVar;
        this.zzb = zzcekVar;
    }

    public final zzdgp zza() {
        return this.zza;
    }

    public final zzcek zzb() {
        return this.zzb;
    }

    public final View zzc() {
        zzcek zzcekVar = this.zzb;
        if (zzcekVar != null) {
            return zzcekVar.zzD();
        }
        return null;
    }

    public final View zzd() {
        zzcek zzcekVar = this.zzb;
        if (zzcekVar == null) {
            return null;
        }
        return zzcekVar.zzD();
    }

    public Set zze(zzcuj zzcujVar) {
        return Collections.singleton(new zzddr(zzcujVar, zzbzh.zzg));
    }

    public Set zzf(zzcuj zzcujVar) {
        return Collections.singleton(new zzddr(zzcujVar, zzbzh.zzg));
    }

    public final zzddr zzg(Executor executor) {
        final zzcek zzcekVar = this.zzb;
        return new zzddr(new zzdap() { // from class: com.google.android.gms.internal.ads.zzdfc
            @Override // com.google.android.gms.internal.ads.zzdap
            public final /* synthetic */ void zza() {
                AbstractBinderC7534v abstractBinderC7534vZzL;
                zzcek zzcekVar2 = zzcekVar;
                if (zzcekVar2 == null || (abstractBinderC7534vZzL = zzcekVar2.zzL()) == null) {
                    return;
                }
                abstractBinderC7534vZzL.zzb();
            }
        }, executor);
    }
}
