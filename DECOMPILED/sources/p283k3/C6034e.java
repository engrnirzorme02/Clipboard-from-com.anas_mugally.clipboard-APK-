package p283k3;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbl;
import java.util.List;

/* JADX INFO: renamed from: k3.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C6034e extends zzbl implements InterfaceC6036g {
    C6034e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // p283k3.InterfaceC6036g
    public final void zze(List list) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzd(2, parcelZza);
    }
}
