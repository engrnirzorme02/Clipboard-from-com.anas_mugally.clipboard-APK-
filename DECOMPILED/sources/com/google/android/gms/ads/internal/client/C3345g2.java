package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.AbstractC3774c;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbox;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.g2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3345g2 extends AbstractC3774c {
    public C3345g2() {
        super("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl");
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC3359k0 m17229a(Context context, zzbox zzboxVar) {
        InterfaceC3359k0 c3351i0;
        try {
            IBinder iBinderM17241L0 = ((C3363l0) getRemoteCreatorInstance(context)).m17241L0(BinderC3773b.m18221N0(context), zzboxVar, ModuleDescriptor.MODULE_VERSION);
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
            AbstractC7599p.m33332g("Could not get remote AdPreloaderCreator.", e);
            return null;
        } catch (AbstractC3774c.a e8) {
            e = e8;
            AbstractC7599p.m33332g("Could not get remote AdPreloaderCreator.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.AbstractC3774c
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        return iInterfaceQueryLocalInterface instanceof C3363l0 ? (C3363l0) iInterfaceQueryLocalInterface : new C3363l0(iBinder);
    }
}
