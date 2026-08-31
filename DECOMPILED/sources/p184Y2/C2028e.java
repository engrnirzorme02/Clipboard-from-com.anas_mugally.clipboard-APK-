package p184Y2;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC3598f;
import com.google.android.gms.common.api.internal.InterfaceC3616o;
import com.google.android.gms.common.internal.AbstractC3696h;
import com.google.android.gms.common.internal.C3690e;
import com.google.android.gms.common.internal.C3732z;
import com.google.android.gms.internal.base.zaf;
import p170W2.C1839d;

/* JADX INFO: renamed from: Y2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2028e extends AbstractC3696h {

    /* JADX INFO: renamed from: a */
    private final C3732z f6719a;

    public C2028e(Context context, Looper looper, C3690e c3690e, C3732z c3732z, InterfaceC3598f interfaceC3598f, InterfaceC3616o interfaceC3616o) {
        super(context, looper, 270, c3690e, interfaceC3598f, interfaceC3616o);
        this.f6719a = c3732z;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C2024a ? (C2024a) iInterfaceQueryLocalInterface : new C2024a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    public final C1839d[] getApiFeatures() {
        return zaf.zab;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final Bundle getGetServiceRequestExtraArgs() {
        return this.f6719a.m18112b();
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c, com.google.android.gms.common.api.C3553a.f
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final boolean getUseDynamicLookup() {
        return true;
    }
}
