package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.common.internal.AbstractC3686c;
import com.google.android.gms.common.util.AbstractC3747b;
import p170W2.C1839d;
import p314o2.AbstractC6548H;
import p380w2.AbstractC7334c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbas extends AbstractC7334c {
    zzbas(Context context, Looper looper, AbstractC3686c.a aVar, AbstractC3686c.b bVar) {
        super(zzbvf.zza(context), looper, 123, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof zzbav ? (zzbav) iInterfaceQueryLocalInterface : new zzbav(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    public final C1839d[] getApiFeatures() {
        return AbstractC6548H.f24720b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean zzp() {
        return ((Boolean) C3250D.m17200c().zzd(zzbci.zzcd)).booleanValue() && AbstractC3747b.m18145b(getAvailableFeatures(), AbstractC6548H.f24719a);
    }

    public final zzbav zzq() {
        return (zzbav) super.getService();
    }
}
