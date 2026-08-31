package p283k3;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.measurement.internal.C4181Z5;

/* JADX INFO: renamed from: k3.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C6037h extends zzbl implements InterfaceC6039j {
    C6037h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // p283k3.InterfaceC6039j
    /* JADX INFO: renamed from: m0 */
    public final void mo18612m0(C4181Z5 c4181z5) {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, c4181z5);
        zzd(2, parcelZza);
    }
}
