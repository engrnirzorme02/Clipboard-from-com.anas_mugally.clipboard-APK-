package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p012B2.AbstractC0082w;
import p340r2.AbstractC6886d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbqe extends zzbpl {
    private final AbstractC0082w zza;

    public zzbqe(AbstractC0082w abstractC0082w) {
        this.zza = abstractC0082w;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final float zzA() {
        return this.zza.m271g();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final float zzB() {
        return this.zza.m270f();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzC() {
        this.zza.m265a();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zze() {
        return this.zza.m273i();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final List zzf() {
        List<AbstractC6886d> listM275k = this.zza.m275k();
        ArrayList arrayList = new ArrayList();
        if (listM275k != null) {
            for (AbstractC6886d abstractC6886d : listM275k) {
                arrayList.add(new zzbfh(abstractC6886d.getDrawable(), abstractC6886d.getUri(), abstractC6886d.getScale(), abstractC6886d.zza(), abstractC6886d.zzb(), null));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzg() {
        return this.zza.m268d();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final zzbfw zzh() {
        AbstractC6886d abstractC6886dM274j = this.zza.m274j();
        if (abstractC6886dM274j != null) {
            return new zzbfh(abstractC6886dM274j.getDrawable(), abstractC6886dM274j.getUri(), abstractC6886dM274j.getScale(), abstractC6886dM274j.zza(), abstractC6886dM274j.zzb(), null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzi() {
        return this.zza.m269e();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzj() {
        return this.zza.m267c();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final double zzk() {
        AbstractC0082w abstractC0082w = this.zza;
        if (abstractC0082w.m280p() != null) {
            return abstractC0082w.m280p().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzl() {
        return this.zza.m281q();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzm() {
        return this.zza.m279o();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final InterfaceC3340f1 zzn() {
        AbstractC0082w abstractC0082w = this.zza;
        if (abstractC0082w.m262J() != null) {
            return abstractC0082w.m262J().m27870c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final zzbfp zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final InterfaceC3772a zzp() {
        View viewM266b = this.zza.m266b();
        if (viewM266b == null) {
            return null;
        }
        return BinderC3773b.m18221N0(viewM266b);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final InterfaceC3772a zzq() {
        View viewM263K = this.zza.m263K();
        if (viewM263K == null) {
            return null;
        }
        return BinderC3773b.m18221N0(viewM263K);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final InterfaceC3772a zzr() {
        Object objM264L = this.zza.m264L();
        if (objM264L == null) {
            return null;
        }
        return BinderC3773b.m18221N0(objM264L);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final Bundle zzs() {
        return this.zza.m272h();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final boolean zzt() {
        return this.zza.m278n();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final boolean zzu() {
        return this.zza.m277m();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzv() {
        this.zza.m284t();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzw(InterfaceC3772a interfaceC3772a) {
        this.zza.m282r((View) BinderC3773b.m18220M0(interfaceC3772a));
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzx(InterfaceC3772a interfaceC3772a, InterfaceC3772a interfaceC3772a2, InterfaceC3772a interfaceC3772a3) {
        HashMap map = (HashMap) BinderC3773b.m18220M0(interfaceC3772a2);
        HashMap map2 = (HashMap) BinderC3773b.m18220M0(interfaceC3772a3);
        this.zza.mo258F((View) BinderC3773b.m18220M0(interfaceC3772a), map, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzy(InterfaceC3772a interfaceC3772a) {
        this.zza.m259G((View) BinderC3773b.m18220M0(interfaceC3772a));
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final float zzz() {
        return this.zza.m276l();
    }
}
