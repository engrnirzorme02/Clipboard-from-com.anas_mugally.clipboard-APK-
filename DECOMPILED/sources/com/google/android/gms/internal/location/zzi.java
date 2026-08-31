package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.internal.AbstractC3696h;
import com.google.android.gms.common.internal.C3690e;
import com.google.android.gms.location.AbstractC3962a0;
import p170W2.C1839d;

/* JADX INFO: loaded from: classes2.dex */
public class zzi extends AbstractC3696h {
    protected final zzbg<zzam> zze;
    private final String zzf;

    public zzi(Context context, Looper looper, AbstractC3560h.b bVar, AbstractC3560h.c cVar, String str, C3690e c3690e) {
        super(context, looper, 23, c3690e, bVar, cVar);
        this.zze = new zzh(this);
        this.zzf = str;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof zzam ? (zzam) iInterfaceQueryLocalInterface : new zzal(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    public final C1839d[] getApiFeatures() {
        return AbstractC3962a0.f15015f;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.zzf);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c, com.google.android.gms.common.api.C3553a.f
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
