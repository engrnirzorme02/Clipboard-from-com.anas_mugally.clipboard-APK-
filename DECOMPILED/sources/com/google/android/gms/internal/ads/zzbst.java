package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.AbstractC3774c;
import com.google.android.gms.dynamic.BinderC3773b;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbst extends AbstractC3774c {
    public zzbst() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.AbstractC3774c
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof zzbsz ? (zzbsz) iInterfaceQueryLocalInterface : new zzbsx(iBinder);
    }

    public final zzbsw zza(Activity activity) {
        try {
            IBinder iBinderZze = ((zzbsz) getRemoteCreatorInstance(activity)).zze(BinderC3773b.m18221N0(activity));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof zzbsw ? (zzbsw) iInterfaceQueryLocalInterface : new zzbsu(iBinderZze);
        } catch (RemoteException e7) {
            AbstractC7599p.m33332g("Could not create remote AdOverlay.", e7);
            return null;
        } catch (AbstractC3774c.a e8) {
            AbstractC7599p.m33332g("Could not create remote AdOverlay.", e8);
            return null;
        }
    }
}
