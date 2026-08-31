package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC3686c;
import p380w2.AbstractC7334c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbkw extends AbstractC7334c {
    zzbkw(Context context, Looper looper, AbstractC3686c.a aVar, AbstractC3686c.b bVar) {
        super(zzbvf.zza(context), looper, 166, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return iInterfaceQueryLocalInterface instanceof zzbld ? (zzbld) iInterfaceQueryLocalInterface : new zzbld(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final zzbld zzp() {
        return (zzbld) super.getService();
    }
}
