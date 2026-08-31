package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.ads.internal.util.AbstractC3453S;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.dynamic.BinderC3773b;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;
import p314o2.AbstractC6543C;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzefd implements zzeef {
    private final Context zza;
    private final zzcpp zzb;
    private final Executor zzc;

    public zzefd(Context context, zzcpp zzcppVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcppVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj {
        C3369m2 c3369m2;
        zzfdc zzfdcVar = zzfcuVar.zza.zza;
        C3369m2 c3369m3 = zzfdcVar.zzf;
        if (c3369m3.f14035y) {
            c3369m2 = new C3369m2(this.zza, AbstractC6543C.m27790b(c3369m3.f14026e, c3369m3.f14023b));
        } else {
            c3369m2 = (((Boolean) C3250D.m17200c().zzd(zzbci.zziC)).booleanValue() && zzfcjVar.zzag) ? new C3369m2(this.zza, AbstractC6543C.m27791c(c3369m3.f14026e, c3369m3.f14023b)) : zzfdi.zza(this.zza, zzfcjVar.zzu);
        }
        C3369m2 c3369m4 = c3369m2;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zziC)).booleanValue() && zzfcjVar.zzag) {
            ((zzfea) zzeecVar.zzb).zzb(this.zza, c3369m4, zzfdcVar.zzd, zzfcjVar.zzv.toString(), AbstractC3453S.m17486m(zzfcjVar.zzs), (zzbpd) zzeecVar.zzc);
        } else {
            ((zzfea) zzeecVar.zzb).zzg(this.zza, c3369m4, zzfdcVar.zzd, zzfcjVar.zzv.toString(), AbstractC3453S.m17486m(zzfcjVar.zzs), (zzbpd) zzeecVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, final zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj {
        final View viewZza;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zziC)).booleanValue() && zzfcjVar.zzag) {
            zzbpg zzbpgVarZzc = ((zzfea) zzeecVar.zzb).zzc();
            if (zzbpgVarZzc == null) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33328c("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfdj(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) BinderC3773b.m18220M0(zzbpgVarZzc.zze());
                boolean zZzf = zzbpgVarZzc.zzf();
                if (viewZza == null) {
                    throw new zzfdj(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) zzgot.zzj(zzgot.zza(null), new zzgob() { // from class: com.google.android.gms.internal.ads.zzefb
                            @Override // com.google.android.gms.internal.ads.zzgob
                            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                                return this.zza.zzc(viewZza, zzfcjVar, obj);
                            }
                        }, zzbzh.zzf).get();
                    } catch (InterruptedException | ExecutionException e7) {
                        throw new zzfdj(e7);
                    }
                }
            } catch (RemoteException e8) {
                throw new zzfdj(e8);
            }
        } else {
            viewZza = ((zzfea) zzeecVar.zzb).zza();
        }
        zzcpp zzcppVar = this.zzb;
        zzcri zzcriVar = new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza);
        final zzfea zzfeaVar = (zzfea) zzeecVar.zzb;
        Objects.requireNonNull(zzfeaVar);
        zzcol zzcolVarZzf = zzcppVar.zzf(zzcriVar, new zzcor(viewZza, null, new zzcqq() { // from class: com.google.android.gms.internal.ads.zzefc
            @Override // com.google.android.gms.internal.ads.zzcqq
            public final /* synthetic */ InterfaceC3340f1 zza() {
                return zzfeaVar.zzt();
            }
        }, (zzfck) zzfcjVar.zzu.get(0)));
        zzcolVarZzf.zzk().zza(viewZza);
        zzcolVarZzf.zza().zzq(new zzcly(zzfeaVar), this.zzc);
        ((zzefo) zzeecVar.zzc).zzc(zzcolVarZzf.zzf());
        return zzcolVarZzf.zzi();
    }

    final /* synthetic */ InterfaceFutureC1673e zzc(View view, zzfcj zzfcjVar, Object obj) {
        return zzgot.zza(zzcqe.zza(this.zza, view, zzfcjVar));
    }
}
