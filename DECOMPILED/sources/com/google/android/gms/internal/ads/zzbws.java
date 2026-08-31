package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3324b1;
import p314o2.AbstractC6560l;
import p314o2.InterfaceC6566r;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbws extends zzbwc {
    private AbstractC6560l zza;
    private InterfaceC6566r zzb;

    public final void zzb(AbstractC6560l abstractC6560l) {
        this.zza = abstractC6560l;
    }

    public final void zzc(InterfaceC6566r interfaceC6566r) {
        this.zzb = interfaceC6566r;
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zze() {
        AbstractC6560l abstractC6560l = this.zza;
        if (abstractC6560l != null) {
            abstractC6560l.mo16283e();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzf() {
        AbstractC6560l abstractC6560l = this.zza;
        if (abstractC6560l != null) {
            abstractC6560l.mo16281b();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzg(zzbvx zzbvxVar) {
        InterfaceC6566r interfaceC6566r = this.zzb;
        if (interfaceC6566r != null) {
            interfaceC6566r.onUserEarnedReward(new zzbwk(zzbvxVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzh(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzi(C3324b1 c3324b1) {
        AbstractC6560l abstractC6560l = this.zza;
        if (abstractC6560l != null) {
            abstractC6560l.mo16282c(c3324b1.m17220T());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzj() {
        AbstractC6560l abstractC6560l = this.zza;
        if (abstractC6560l != null) {
            abstractC6560l.mo16288d();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzk() {
        AbstractC6560l abstractC6560l = this.zza;
        if (abstractC6560l != null) {
            abstractC6560l.m27852a();
        }
    }
}
