package p283k3;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.measurement.internal.C4181Z5;

/* JADX INFO: renamed from: k3.i */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC6038i extends zzbm implements InterfaceC6039j {
    public AbstractBinderC6038i() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    protected final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 2) {
            return false;
        }
        C4181Z5 c4181z5 = (C4181Z5) zzbn.zzb(parcel, C4181Z5.CREATOR);
        zzbn.zzf(parcel);
        mo18612m0(c4181z5);
        return true;
    }
}
