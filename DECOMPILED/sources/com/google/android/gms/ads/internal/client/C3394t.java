package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbtt;
import java.util.Objects;
import p404z2.AbstractC7603t;
import p404z2.C7602s;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.t */
/* JADX INFO: loaded from: classes.dex */
final class C3394t extends AbstractC3241A {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f14090b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ zzbox f14091c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C3411y f14092d;

    C3394t(C3411y c3411y, Context context, zzbox zzboxVar) {
        this.f14090b = context;
        this.f14091c = zzboxVar;
        Objects.requireNonNull(c3411y);
        this.f14092d = c3411y;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo17185a() {
        C3411y.m17344l(this.f14090b, "ads_preloader");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: b */
    protected final /* bridge */ /* synthetic */ Object mo17186b() {
        InterfaceC3359k0 c3351i0;
        Context context = this.f14090b;
        InterfaceC3772a interfaceC3772aM18221N0 = BinderC3773b.m18221N0(context);
        zzbci.zza(context);
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzlx)).booleanValue()) {
            return this.f14092d.m17363t().m17229a(this.f14090b, this.f14091c);
        }
        try {
            C3363l0 c3363l0 = (C3363l0) AbstractC7603t.m33337a(context, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", C3390s.f14087a);
            zzbox zzboxVar = this.f14091c;
            IBinder iBinderM17241L0 = c3363l0.m17241L0(interfaceC3772aM18221N0, zzboxVar, ModuleDescriptor.MODULE_VERSION);
            if (iBinderM17241L0 == null) {
                c3351i0 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderM17241L0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                c3351i0 = iInterfaceQueryLocalInterface instanceof InterfaceC3359k0 ? (InterfaceC3359k0) iInterfaceQueryLocalInterface : new C3351i0(iBinderM17241L0);
            }
            c3351i0.zzl(zzboxVar);
            return c3351i0;
        } catch (RemoteException e7) {
            e = e7;
            C3411y c3411y = this.f14092d;
            c3411y.m17362s(zzbtt.zza(this.f14090b));
            c3411y.m17361r().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (NullPointerException e8) {
            e = e8;
            C3411y c3411y2 = this.f14092d;
            c3411y2.m17362s(zzbtt.zza(this.f14090b));
            c3411y2.m17361r().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (C7602s e9) {
            e = e9;
            C3411y c3411y3 = this.f14092d;
            c3411y3.m17362s(zzbtt.zza(this.f14090b));
            c3411y3.m17361r().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17187c(InterfaceC3387r0 interfaceC3387r0) {
        InterfaceC3772a interfaceC3772aM18221N0 = BinderC3773b.m18221N0(this.f14090b);
        zzbox zzboxVar = this.f14091c;
        InterfaceC3359k0 interfaceC3359k0Mo17168E0 = interfaceC3387r0.mo17168E0(interfaceC3772aM18221N0, zzboxVar, ModuleDescriptor.MODULE_VERSION);
        interfaceC3359k0Mo17168E0.zzl(zzboxVar);
        return interfaceC3359k0Mo17168E0;
    }
}
