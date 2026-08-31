package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.AbstractC3774c;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.F1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3258F1 extends AbstractC3774c {
    public C3258F1() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC3248C0 m17207a(Context context) {
        try {
            IBinder iBinderM17202L0 = ((C3251D0) getRemoteCreatorInstance(context)).m17202L0(BinderC3773b.m18221N0(context), ModuleDescriptor.MODULE_VERSION);
            if (iBinderM17202L0 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM17202L0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3248C0 ? (InterfaceC3248C0) iInterfaceQueryLocalInterface : new C3415z0(iBinderM17202L0);
        } catch (RemoteException e7) {
            e = e7;
            AbstractC7599p.m33332g("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (AbstractC3774c.a e8) {
            e = e8;
            AbstractC7599p.m33332g("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.AbstractC3774c
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof C3251D0 ? (C3251D0) iInterfaceQueryLocalInterface : new C3251D0(iBinder);
    }
}
