package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbtt;
import java.util.Objects;
import p404z2.AbstractC7603t;
import p404z2.C7602s;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.r */
/* JADX INFO: loaded from: classes.dex */
final class C3386r extends AbstractC3241A {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f14083b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f14084c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ zzbox f14085d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C3411y f14086e;

    C3386r(C3411y c3411y, Context context, String str, zzbox zzboxVar) {
        this.f14083b = context;
        this.f14084c = str;
        this.f14085d = zzboxVar;
        Objects.requireNonNull(c3411y);
        this.f14086e = c3411y;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo17185a() {
        C3411y.m17344l(this.f14083b, "native_ad");
        return new BinderC3267I1();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17186b() {
        Context context = this.f14083b;
        zzbci.zza(context);
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzlx)).booleanValue()) {
            return this.f14086e.m17357n().m17223a(this.f14083b, this.f14084c, this.f14085d);
        }
        try {
            IBinder iBinderZze = ((C3303V) AbstractC7603t.m33337a(context, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", C3382q.f14074a)).zze(BinderC3773b.m18221N0(context), this.f14084c, this.f14085d, ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3300U ? (InterfaceC3300U) iInterfaceQueryLocalInterface : new C3294S(iBinderZze);
        } catch (RemoteException e7) {
            e = e7;
            C3411y c3411y = this.f14086e;
            c3411y.m17362s(zzbtt.zza(this.f14083b));
            c3411y.m17361r().zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (NullPointerException e8) {
            e = e8;
            C3411y c3411y2 = this.f14086e;
            c3411y2.m17362s(zzbtt.zza(this.f14083b));
            c3411y2.m17361r().zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (C7602s e9) {
            e = e9;
            C3411y c3411y3 = this.f14086e;
            c3411y3.m17362s(zzbtt.zza(this.f14083b));
            c3411y3.m17361r().zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17187c(InterfaceC3387r0 interfaceC3387r0) {
        return interfaceC3387r0.mo17175j(BinderC3773b.m18221N0(this.f14083b), this.f14084c, this.f14085d, ModuleDescriptor.MODULE_VERSION);
    }
}
