package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzblq;
import com.google.android.gms.internal.ads.zzblr;
import com.google.android.gms.internal.ads.zzbow;
import com.google.android.gms.internal.ads.zzbox;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.B0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3245B0 extends zzaya implements InterfaceC3248C0 {
    public AbstractBinderC3245B0() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        InterfaceC3284O0 c3278m0;
        switch (i7) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                float f7 = parcel.readFloat();
                zzayb.zzh(parcel);
                zzf(f7);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                zzayb.zzh(parcel);
                zzg(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZza = zzayb.zza(parcel);
                zzayb.zzh(parcel);
                zzh(zZza);
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                String string2 = parcel.readString();
                zzayb.zzh(parcel);
                zzi(interfaceC3772aM18219L0, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                InterfaceC3772a interfaceC3772aM18219L1 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzj(string3, interfaceC3772aM18219L1);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzk);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                int i9 = zzayb.zza;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 10:
                String string4 = parcel.readString();
                zzayb.zzh(parcel);
                zzn(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbox zzboxVarZzf = zzbow.zzf(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzo(zzboxVarZzf);
                parcel2.writeNoException();
                return true;
            case 12:
                zzblr zzblrVarZzc = zzblq.zzc(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzp(zzblrVarZzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzq);
                return true;
            case 14:
                C3302U1 c3302u1 = (C3302U1) zzayb.zzb(parcel, C3302U1.CREATOR);
                zzayb.zzh(parcel);
                zzr(c3302u1);
                parcel2.writeNoException();
                return true;
            case 15:
                zzs();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c3278m0 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    c3278m0 = iInterfaceQueryLocalInterface instanceof InterfaceC3284O0 ? (InterfaceC3284O0) iInterfaceQueryLocalInterface : new C3278M0(strongBinder);
                }
                zzayb.zzh(parcel);
                zzt(c3278m0);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zZza2 = zzayb.zza(parcel);
                zzayb.zzh(parcel);
                zzu(zZza2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                zzayb.zzh(parcel);
                zzv(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
