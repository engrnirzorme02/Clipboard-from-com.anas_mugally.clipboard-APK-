package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.AbstractC3774c;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbtv;
import p404z2.AbstractC7599p;
import p404z2.AbstractC7603t;
import p404z2.C7602s;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.f2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3341f2 extends AbstractC3774c {

    /* JADX INFO: renamed from: a */
    private zzbtv f13932a;

    public C3341f2() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC3312Y m17226a(Context context, C3369m2 c3369m2, String str, zzbox zzboxVar, int i7) {
        zzbci.zza(context);
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzlx)).booleanValue()) {
            try {
                IBinder iBinderM17218L0 = ((C3315Z) getRemoteCreatorInstance(context)).m17218L0(BinderC3773b.m18221N0(context), c3369m2, str, zzboxVar, ModuleDescriptor.MODULE_VERSION, i7);
                if (iBinderM17218L0 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderM17218L0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterfaceQueryLocalInterface instanceof InterfaceC3312Y ? (InterfaceC3312Y) iInterfaceQueryLocalInterface : new C3306W(iBinderM17218L0);
            } catch (RemoteException e7) {
                e = e7;
                AbstractC7599p.m33327b("Could not create remote AdManager.", e);
                return null;
            } catch (AbstractC3774c.a e8) {
                e = e8;
                AbstractC7599p.m33327b("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder iBinderM17218L1 = ((C3315Z) AbstractC7603t.m33337a(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", C3337e2.f13929a)).m17218L0(BinderC3773b.m18221N0(context), c3369m2, str, zzboxVar, ModuleDescriptor.MODULE_VERSION, i7);
            if (iBinderM17218L1 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderM17218L1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface2 instanceof InterfaceC3312Y ? (InterfaceC3312Y) iInterfaceQueryLocalInterface2 : new C3306W(iBinderM17218L1);
        } catch (RemoteException e9) {
            e = e9;
            Throwable th = e;
            zzbtv zzbtvVarZza = zzbtt.zza(context);
            this.f13932a = zzbtvVarZza;
            zzbtvVarZza.zzh(th, "AdManagerCreator.newAdManagerByDynamiteLoader");
            AbstractC7599p.m33334i("#007 Could not call remote method.", th);
            return null;
        } catch (NullPointerException e10) {
            e = e10;
            Throwable th2 = e;
            zzbtv zzbtvVarZza2 = zzbtt.zza(context);
            this.f13932a = zzbtvVarZza2;
            zzbtvVarZza2.zzh(th2, "AdManagerCreator.newAdManagerByDynamiteLoader");
            AbstractC7599p.m33334i("#007 Could not call remote method.", th2);
            return null;
        } catch (C7602s e11) {
            e = e11;
            Throwable th3 = e;
            zzbtv zzbtvVarZza3 = zzbtt.zza(context);
            this.f13932a = zzbtvVarZza3;
            zzbtvVarZza3.zzh(th3, "AdManagerCreator.newAdManagerByDynamiteLoader");
            AbstractC7599p.m33334i("#007 Could not call remote method.", th3);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.AbstractC3774c
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof C3315Z ? (C3315Z) iInterfaceQueryLocalInterface : new C3315Z(iBinder);
    }
}
