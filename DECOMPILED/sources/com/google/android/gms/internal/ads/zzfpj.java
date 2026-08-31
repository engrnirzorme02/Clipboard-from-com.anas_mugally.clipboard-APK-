package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC3686c;
import p380w2.AbstractC7334c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfpj extends AbstractC7334c {
    private final int zze;

    public zzfpj(Context context, Looper looper, AbstractC3686c.a aVar, AbstractC3686c.b bVar, int i7) {
        super(context, looper, 116, aVar, bVar, null);
        this.zze = i7;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof zzfpo ? (zzfpo) iInterfaceQueryLocalInterface : new zzfpo(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c, com.google.android.gms.common.api.C3553a.f
    public final int getMinApkVersion() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }

    public final zzfpo zzp() {
        return (zzfpo) super.getService();
    }
}
