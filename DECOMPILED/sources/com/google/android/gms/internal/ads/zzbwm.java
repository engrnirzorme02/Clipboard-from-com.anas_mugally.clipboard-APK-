package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p404z2.AbstractC7599p;
import p404z2.AbstractC7603t;
import p404z2.C7602s;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbwm {
    public static final zzbwa zza(Context context, String str, zzbox zzboxVar) {
        try {
            IBinder iBinderZze = ((zzbwe) AbstractC7603t.m33337a(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzbwl.zza)).zze(BinderC3773b.m18221N0(context), str, zzboxVar, ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof zzbwa ? (zzbwa) iInterfaceQueryLocalInterface : new zzbvy(iBinderZze);
        } catch (RemoteException e7) {
            e = e7;
            AbstractC7599p.m33334i("#007 Could not call remote method.", e);
            return null;
        } catch (C7602s e8) {
            e = e8;
            AbstractC7599p.m33334i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
