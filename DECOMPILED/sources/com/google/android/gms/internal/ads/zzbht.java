package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.AbstractC3774c;
import com.google.android.gms.dynamic.BinderC3773b;
import java.util.HashMap;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbht extends AbstractC3774c {
    public zzbht() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.AbstractC3774c
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof zzbgj ? (zzbgj) iInterfaceQueryLocalInterface : new zzbgh(iBinder);
    }

    public final zzbgg zza(View view, HashMap map, HashMap map2) {
        try {
            IBinder iBinderZze = ((zzbgj) getRemoteCreatorInstance(view.getContext())).zze(BinderC3773b.m18221N0(view), BinderC3773b.m18221N0(map), BinderC3773b.m18221N0(map2));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return iInterfaceQueryLocalInterface instanceof zzbgg ? (zzbgg) iInterfaceQueryLocalInterface : new zzbge(iBinderZze);
        } catch (RemoteException e7) {
            e = e7;
            AbstractC7599p.m33332g("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        } catch (AbstractC3774c.a e8) {
            e = e8;
            AbstractC7599p.m33332g("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
