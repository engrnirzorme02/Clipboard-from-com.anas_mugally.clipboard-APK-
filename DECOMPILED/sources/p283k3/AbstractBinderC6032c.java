package p283k3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.measurement.internal.C4006B6;
import com.google.android.gms.measurement.internal.C4039G;
import com.google.android.gms.measurement.internal.C4230g;
import com.google.android.gms.measurement.internal.C4246i;
import com.google.android.gms.measurement.internal.C4357v6;
import java.util.List;

/* JADX INFO: renamed from: k3.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC6032c extends zzbm implements InterfaceC6033d {
    public AbstractBinderC6032c() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    protected final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        InterfaceC6039j c6037h = null;
        InterfaceC6036g c6034e = null;
        switch (i7) {
            case 1:
                C4039G c4039g = (C4039G) zzbn.zzb(parcel, C4039G.CREATOR);
                C4006B6 c4006b6 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                zzbn.zzf(parcel);
                mo18727L(c4039g, c4006b6);
                parcel2.writeNoException();
                return true;
            case 2:
                C4357v6 c4357v6 = (C4357v6) zzbn.zzb(parcel, C4357v6.CREATOR);
                C4006B6 c4006b7 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                zzbn.zzf(parcel);
                mo18732Z(c4357v6, c4006b7);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                C4006B6 c4006b8 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                zzbn.zzf(parcel);
                mo18737k0(c4006b8);
                parcel2.writeNoException();
                return true;
            case 5:
                C4039G c4039g2 = (C4039G) zzbn.zzb(parcel, C4039G.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzbn.zzf(parcel);
                mo19352k(c4039g2, string, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                C4006B6 c4006b9 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                zzbn.zzf(parcel);
                mo18728N(c4006b9);
                parcel2.writeNoException();
                return true;
            case 7:
                C4006B6 c4006b10 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                boolean zZza = zzbn.zza(parcel);
                zzbn.zzf(parcel);
                List listMo19339I0 = mo19339I0(c4006b10, zZza);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo19339I0);
                return true;
            case 9:
                C4039G c4039g3 = (C4039G) zzbn.zzb(parcel, C4039G.CREATOR);
                String string3 = parcel.readString();
                zzbn.zzf(parcel);
                byte[] bArrMo18731T = mo18731T(c4039g3, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrMo18731T);
                return true;
            case 10:
                long j7 = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                zzbn.zzf(parcel);
                mo18738q(j7, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case 11:
                C4006B6 c4006b11 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                zzbn.zzf(parcel);
                String strMo18743x0 = mo18743x0(c4006b11);
                parcel2.writeNoException();
                parcel2.writeString(strMo18743x0);
                return true;
            case 12:
                C4246i c4246i = (C4246i) zzbn.zzb(parcel, C4246i.CREATOR);
                C4006B6 c4006b12 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                zzbn.zzf(parcel);
                mo18736e(c4246i, c4006b12);
                parcel2.writeNoException();
                return true;
            case 13:
                C4246i c4246i2 = (C4246i) zzbn.zzb(parcel, C4246i.CREATOR);
                zzbn.zzf(parcel);
                mo19348V(c4246i2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zZza2 = zzbn.zza(parcel);
                C4006B6 c4006b13 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                zzbn.zzf(parcel);
                List listMo18740t0 = mo18740t0(string7, string8, zZza2, c4006b13);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo18740t0);
                return true;
            case 15:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                boolean zZza3 = zzbn.zza(parcel);
                zzbn.zzf(parcel);
                List listMo18735d = mo18735d(string9, string10, string11, zZza3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo18735d);
                return true;
            case 16:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                C4006B6 c4006b14 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                zzbn.zzf(parcel);
                List listMo18745y0 = mo18745y0(string12, string13, c4006b14);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo18745y0);
                return true;
            case 17:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                zzbn.zzf(parcel);
                List listMo18744y = mo18744y(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo18744y);
                return true;
            case 18:
                C4006B6 c4006b15 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                zzbn.zzf(parcel);
                mo18741u(c4006b15);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
                C4006B6 c4006b16 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                zzbn.zzf(parcel);
                mo18734b0(bundle, c4006b16);
                parcel2.writeNoException();
                return true;
            case 20:
                C4006B6 c4006b17 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                zzbn.zzf(parcel);
                mo18726H0(c4006b17);
                parcel2.writeNoException();
                return true;
            case zzbbn.zzt.zzm /* 21 */:
                C4006B6 c4006b18 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                zzbn.zzf(parcel);
                C6030a c6030aMo18733a0 = mo18733a0(c4006b18);
                parcel2.writeNoException();
                if (c6030aMo18733a0 == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    c6030aMo18733a0.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                C4006B6 c4006b19 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                Bundle bundle2 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
                zzbn.zzf(parcel);
                List listMo19338I = mo19338I(c4006b19, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo19338I);
                return true;
            case 25:
                C4006B6 c4006b20 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                zzbn.zzf(parcel);
                mo18724D(c4006b20);
                parcel2.writeNoException();
                return true;
            case 26:
                C4006B6 c4006b21 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                zzbn.zzf(parcel);
                mo18729O(c4006b21);
                parcel2.writeNoException();
                return true;
            case 27:
                C4006B6 c4006b22 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                zzbn.zzf(parcel);
                mo18739r0(c4006b22);
                parcel2.writeNoException();
                return true;
            case 29:
                C4006B6 c4006b23 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                C6027J c6027j = (C6027J) zzbn.zzb(parcel, C6027J.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    c6037h = iInterfaceQueryLocalInterface instanceof InterfaceC6039j ? (InterfaceC6039j) iInterfaceQueryLocalInterface : new C6037h(strongBinder);
                }
                zzbn.zzf(parcel);
                mo18742w(c4006b23, c6027j, c6037h);
                parcel2.writeNoException();
                return true;
            case 30:
                C4006B6 c4006b24 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                C4230g c4230g = (C4230g) zzbn.zzb(parcel, C4230g.CREATOR);
                zzbn.zzf(parcel);
                mo18730R(c4006b24, c4230g);
                parcel2.writeNoException();
                return true;
            case 31:
                C4006B6 c4006b25 = (C4006B6) zzbn.zzb(parcel, C4006B6.CREATOR);
                Bundle bundle3 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    c6034e = iInterfaceQueryLocalInterface2 instanceof InterfaceC6036g ? (InterfaceC6036g) iInterfaceQueryLocalInterface2 : new C6034e(strongBinder2);
                }
                zzbn.zzf(parcel);
                mo18725E(c4006b25, bundle3, c6034e);
                parcel2.writeNoException();
                return true;
        }
    }
}
