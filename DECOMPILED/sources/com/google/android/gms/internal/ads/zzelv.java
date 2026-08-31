package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.client.InterfaceC3271K;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzelv {
    private final zzdje zza;
    private final zzeli zzb;
    private final zzcvv zzc;

    public zzelv(zzdje zzdjeVar, zzdsm zzdsmVar) {
        this.zza = zzdjeVar;
        final zzeli zzeliVar = new zzeli(zzdsmVar);
        this.zzb = zzeliVar;
        final zzbmf zzbmfVarZze = zzdjeVar.zze();
        this.zzc = new zzcvv() { // from class: com.google.android.gms.internal.ads.zzelu
            @Override // com.google.android.gms.internal.ads.zzcvv
            public final /* synthetic */ void zzdN(C3324b1 c3324b1) {
                zzeliVar.zzdN(c3324b1);
                zzbmf zzbmfVar = zzbmfVarZze;
                if (zzbmfVar != null) {
                    try {
                        zzbmfVar.zzg(c3324b1);
                    } catch (RemoteException e7) {
                        AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
                    }
                }
                if (zzbmfVar != null) {
                    try {
                        zzbmfVar.zzf(c3324b1.f13918a);
                    } catch (RemoteException e8) {
                        AbstractC7599p.m33334i("#007 Could not call remote method.", e8);
                    }
                }
            }
        };
    }

    public final void zza(InterfaceC3271K interfaceC3271K) {
        this.zzb.zzl(interfaceC3271K);
    }

    public final zzdgy zzb() {
        return new zzdgy(this.zza, this.zzb.zzi());
    }

    public final zzeli zzc() {
        return this.zzb;
    }

    public final zzcxg zzd() {
        return this.zzb;
    }

    public final zzcvv zze() {
        return this.zzc;
    }
}
