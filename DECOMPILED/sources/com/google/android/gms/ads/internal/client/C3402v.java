package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbtt;
import java.util.Objects;
import p404z2.AbstractC7603t;
import p404z2.C7602s;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.v */
/* JADX INFO: loaded from: classes.dex */
final class C3402v extends AbstractC3241A {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f14098b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C3411y f14099c;

    C3402v(C3411y c3411y, Context context) {
        this.f14098b = context;
        Objects.requireNonNull(c3411y);
        this.f14099c = c3411y;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo17185a() {
        C3411y.m17344l(this.f14098b, "mobile_ads_settings");
        return new BinderC3279M1();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17186b() {
        Context context = this.f14098b;
        zzbci.zza(context);
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzlx)).booleanValue()) {
            return this.f14099c.m17358o().m17207a(this.f14098b);
        }
        try {
            IBinder iBinderM17202L0 = ((C3251D0) AbstractC7603t.m33337a(context, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", C3398u.f14094a)).m17202L0(BinderC3773b.m18221N0(context), ModuleDescriptor.MODULE_VERSION);
            if (iBinderM17202L0 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM17202L0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3248C0 ? (InterfaceC3248C0) iInterfaceQueryLocalInterface : new C3415z0(iBinderM17202L0);
        } catch (RemoteException e7) {
            e = e7;
            C3411y c3411y = this.f14099c;
            c3411y.m17362s(zzbtt.zza(this.f14098b));
            c3411y.m17361r().zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e8) {
            e = e8;
            C3411y c3411y2 = this.f14099c;
            c3411y2.m17362s(zzbtt.zza(this.f14098b));
            c3411y2.m17361r().zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (C7602s e9) {
            e = e9;
            C3411y c3411y3 = this.f14099c;
            c3411y3.m17362s(zzbtt.zza(this.f14098b));
            c3411y3.m17361r().zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17187c(InterfaceC3387r0 interfaceC3387r0) {
        return interfaceC3387r0.mo17181v0(BinderC3773b.m18221N0(this.f14098b), ModuleDescriptor.MODULE_VERSION);
    }
}
