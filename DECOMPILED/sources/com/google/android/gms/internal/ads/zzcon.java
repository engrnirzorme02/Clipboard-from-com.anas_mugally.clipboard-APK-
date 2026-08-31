package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.InterfaceC3312Y;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.dynamic.BinderC3773b;
import java.util.concurrent.Executor;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzcon extends zzcok {
    private final Context zzc;
    private final View zzd;
    private final zzcek zze;
    private final zzfck zzf;
    private final zzcqq zzg;
    private final zzdje zzh;
    private final zzdeb zzi;
    private final zzhpr zzj;
    private final Executor zzk;
    private C3369m2 zzl;

    zzcon(zzcqr zzcqrVar, Context context, zzfck zzfckVar, View view, zzcek zzcekVar, zzcqq zzcqqVar, zzdje zzdjeVar, zzdeb zzdebVar, zzhpr zzhprVar, Executor executor) {
        super(zzcqrVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcekVar;
        this.zzf = zzfckVar;
        this.zzg = zzcqqVar;
        this.zzh = zzdjeVar;
        this.zzi = zzdebVar;
        this.zzj = zzhprVar;
        this.zzk = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final View zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final void zzb(ViewGroup viewGroup, C3369m2 c3369m2) {
        zzcek zzcekVar;
        if (viewGroup == null || (zzcekVar = this.zze) == null) {
            return;
        }
        zzcekVar.zzaf(zzcgt.zza(c3369m2));
        viewGroup.setMinimumHeight(c3369m2.f14024c);
        viewGroup.setMinimumWidth(c3369m2.f14027f);
        this.zzl = c3369m2;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final InterfaceC3340f1 zzc() {
        try {
            return this.zzg.zza();
        } catch (zzfdj unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final zzfck zze() {
        C3369m2 c3369m2 = this.zzl;
        if (c3369m2 != null) {
            return zzfdi.zzb(c3369m2);
        }
        zzfcj zzfcjVar = this.zzb;
        if (zzfcjVar.zzac) {
            for (String str : zzfcjVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfck(view.getWidth(), view.getHeight(), false);
        }
        return (zzfck) zzfcjVar.zzr.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final zzfck zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final int zzg() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zziC)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zziD)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final int zzh() {
        return this.zza.zzb.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final void zzi() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcqs
    public final void zzj() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcom
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk();
            }
        });
        super.zzj();
    }

    final /* synthetic */ void zzk() {
        zzbhh zzbhhVarZzd = this.zzh.zzd();
        if (zzbhhVarZzd == null) {
            return;
        }
        try {
            zzbhhVarZzd.zze((InterfaceC3312Y) this.zzj.zzb(), BinderC3773b.m18221N0(this.zzc));
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("RemoteException when notifyAdLoad is called", e7);
        }
    }
}
