package p184Y2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.C3726w;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* JADX INFO: renamed from: Y2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2024a extends zaa implements IInterface {
    C2024a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    /* JADX INFO: renamed from: L0 */
    public final void m8434L0(C3726w c3726w) {
        Parcel parcelZaa = zaa();
        zac.zac(parcelZaa, c3726w);
        zad(1, parcelZaa);
    }
}
