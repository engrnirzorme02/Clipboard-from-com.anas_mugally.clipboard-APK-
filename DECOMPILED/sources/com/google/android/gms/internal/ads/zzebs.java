package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import java.util.ArrayList;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzebs extends zzebt {
    private static final SparseArray zzg;
    private final Context zzb;
    private final zzcuw zzc;
    private final TelephonyManager zzd;
    private final zzebk zze;
    private zzbbn.zzq zzf;

    static {
        SparseArray sparseArray = new SparseArray();
        zzg = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbbn.zzaf.zzd.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbbn.zzaf.zzd zzdVar = zzbbn.zzaf.zzd.CONNECTING;
        sparseArray.put(iOrdinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbbn.zzaf.zzd.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbbn.zzaf.zzd zzdVar2 = zzbbn.zzaf.zzd.DISCONNECTED;
        sparseArray.put(iOrdinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbbn.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    zzebs(Context context, zzcuw zzcuwVar, zzebk zzebkVar, zzebg zzebgVar, InterfaceC3494q0 interfaceC3494q0) {
        super(zzebgVar, interfaceC3494q0);
        this.zzb = context;
        this.zzc = zzcuwVar;
        this.zze = zzebkVar;
        this.zzd = (TelephonyManager) context.getSystemService("phone");
    }

    static final /* synthetic */ zzbbn.zzaf.zzd zze(Bundle bundle) {
        return (zzbbn.zzaf.zzd) zzg.get(zzfdr.zza(zzfdr.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbbn.zzaf.zzd.UNSPECIFIED);
    }

    private static final zzbbn.zzq zzg(boolean z7) {
        return z7 ? zzbbn.zzq.ENUM_TRUE : zzbbn.zzq.ENUM_FALSE;
    }

    public final void zza(boolean z7) {
        zzgot.zzq(this.zzc.zza(new Bundle()), new zzebr(this, z7), zzbzh.zzg);
    }

    final /* synthetic */ zzbbn.zzab zzb(Bundle bundle) {
        zzbbn.zzab.zzb zzbVar;
        zzbbn.zzab.zza zzaVarZzq = zzbbn.zzab.zzq();
        int i7 = bundle.getInt("cnt", -2);
        int i8 = bundle.getInt("gnt", 0);
        if (i7 == -1) {
            this.zzf = zzbbn.zzq.ENUM_TRUE;
        } else {
            this.zzf = zzbbn.zzq.ENUM_FALSE;
            if (i7 == 0) {
                zzaVarZzq.zzc(zzbbn.zzab.zzc.CELL);
            } else if (i7 != 1) {
                zzaVarZzq.zzc(zzbbn.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzaVarZzq.zzc(zzbbn.zzab.zzc.WIFI);
            }
            switch (i8) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbbn.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzbbn.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbbn.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbbn.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzaVarZzq.zzg(zzbVar);
        }
        return zzaVarZzq.zzbu();
    }

    final /* synthetic */ byte[] zzc(boolean z7, ArrayList arrayList, zzbbn.zzab zzabVar, zzbbn.zzaf.zzd zzdVar) {
        zzbbn.zzaf.zza.C7683zza c7683zzaZzz = zzbbn.zzaf.zza.zzz();
        c7683zzaZzz.zzv(arrayList);
        Context context = this.zzb;
        c7683zzaZzz.zzJ(zzg(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0));
        c7683zzaZzz.zzN(C7351t.m32352j().mo17460e(context, this.zzd));
        zzebk zzebkVar = this.zze;
        c7683zzaZzz.zzk(zzebkVar.zzf());
        c7683zzaZzz.zzo(zzebkVar.zzj());
        c7683zzaZzz.zzR(zzebkVar.zzd());
        c7683zzaZzz.zzZ(zzdVar);
        c7683zzaZzz.zzz(zzabVar);
        c7683zzaZzz.zzV(this.zzf);
        c7683zzaZzz.zzg(zzg(z7));
        c7683zzaZzz.zzad(zzebkVar.zzb());
        c7683zzaZzz.zzc(C7351t.m32357o().mo18159a());
        c7683zzaZzz.zzF(zzg(Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0));
        return c7683zzaZzz.zzbu().zzaN();
    }

    final /* synthetic */ zzebk zzd() {
        return this.zze;
    }
}
