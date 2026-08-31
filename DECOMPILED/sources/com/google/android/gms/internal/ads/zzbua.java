package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC3686c;
import p380w2.AbstractC7334c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbua extends AbstractC7334c {
    public zzbua(Context context, Looper looper, AbstractC3686c.a aVar, AbstractC3686c.b bVar) {
        super(zzbvf.zza(context), looper, 8, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof zzbuj ? (zzbuj) iInterfaceQueryLocalInterface : new zzbuh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c, com.google.android.gms.common.api.C3553a.f
    public final int getMinApkVersion() {
        return 244933000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }

    public final zzbuj zzp() {
        return (zzbuj) super.getService();
    }
}
