package com.google.android.gms.internal.ads;

import p340r2.InterfaceC6894l;
import p340r2.InterfaceC6895m;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbhw {
    private final InterfaceC6895m zza;
    private final InterfaceC6894l zzb;
    private zzbgr zzc;

    public zzbhw(InterfaceC6895m interfaceC6895m, InterfaceC6894l interfaceC6894l) {
        this.zza = interfaceC6895m;
        this.zzb = interfaceC6894l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized zzbgr zze(zzbgq zzbgqVar) {
        zzbgr zzbgrVar = this.zzc;
        if (zzbgrVar != null) {
            return zzbgrVar;
        }
        zzbgr zzbgrVar2 = new zzbgr(zzbgqVar);
        this.zzc = zzbgrVar2;
        return zzbgrVar2;
    }

    public final zzbhd zza() {
        return new zzbhv(this, null);
    }

    public final zzbha zzb() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbhu(this, null);
    }

    final /* synthetic */ InterfaceC6895m zzc() {
        return this.zza;
    }

    final /* synthetic */ InterfaceC6894l zzd() {
        return this.zzb;
    }
}
