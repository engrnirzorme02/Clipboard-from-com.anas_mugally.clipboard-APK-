package p283k3;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.measurement.internal.C4132S5;
import java.util.ArrayList;

/* JADX INFO: renamed from: k3.f */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC6035f extends zzbm implements InterfaceC6036g {
    public AbstractBinderC6035f() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    protected final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(C4132S5.CREATOR);
        zzbn.zzf(parcel);
        zze(arrayListCreateTypedArrayList);
        return true;
    }
}
