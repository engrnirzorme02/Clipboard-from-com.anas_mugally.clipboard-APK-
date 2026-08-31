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

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.d2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3333d2 extends AbstractC3774c {
    public C3333d2() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC3300U m17223a(Context context, String str, zzbox zzboxVar) {
        try {
            IBinder iBinderZze = ((C3303V) getRemoteCreatorInstance(context)).zze(BinderC3773b.m18221N0(context), str, zzboxVar, ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3300U ? (InterfaceC3300U) iInterfaceQueryLocalInterface : new C3294S(iBinderZze);
        } catch (RemoteException e7) {
            e = e7;
            AbstractC7599p.m33332g("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (AbstractC3774c.a e8) {
            e = e8;
            AbstractC7599p.m33332g("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.AbstractC3774c
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof C3303V ? (C3303V) iInterfaceQueryLocalInterface : new C3303V(iBinder);
    }
}
