package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;
import p404z2.C7596m;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfjr {
    private final zzehk zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfcv zzf;
    private final zzfcw zzg;
    private final InterfaceC3750e zzh;
    private final zzauu zzi;

    public zzfjr(zzehk zzehkVar, C7584a c7584a, String str, String str2, Context context, zzfcv zzfcvVar, zzfcw zzfcwVar, InterfaceC3750e interfaceC3750e, zzauu zzauuVar) {
        this.zza = zzehkVar;
        this.zzb = c7584a.f30226a;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfcvVar;
        this.zzg = zzfcwVar;
        this.zzh = interfaceC3750e;
        this.zzi = zzauuVar;
    }

    public static String zzd(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzg(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return C7596m.m33304j() ? "fakeForAdDebugLog" : str;
    }

    public final List zza(zzfcu zzfcuVar, zzfcj zzfcjVar, List list) {
        return zzb(zzfcuVar, zzfcjVar, false, "", "", list, null);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    public final List zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, boolean z7, String str, String str2, List list, zzcum zzcumVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z8 = true;
            String strZzd = zzd(zzd(zzd((String) it.next(), "@gw_adlocid@", zzfcuVar.zza.zza.zzg), "@gw_adnetrefresh@", true != z7 ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzfcjVar != null) {
                String strZzd2 = zzd(zzd(zzd(strZzd, "@gw_qdata@", zzfcjVar.zzy), "@gw_adnetid@", zzfcjVar.zzx), "@gw_allocid@", zzfcjVar.zzw);
                Context context = this.zze;
                strZzd = zzbxt.zza(strZzd2, context, zzfcjVar.zzW, zzfcjVar.zzaw);
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoj)).booleanValue() && zzfcjVar.zze == 4) {
                    C7351t.m32349g();
                    strZzd = zzd(strZzd, "@gw_aps@", true != C3431F0.m17420k(context) ? "0" : "1");
                }
            }
            zzehk zzehkVar = this.zza;
            String strZzd3 = zzd(zzd(zzd(zzd(strZzd, "@gw_adnetstatus@", zzehkVar.zzg()), "@gw_ttr@", Long.toString(zzehkVar.zzh(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzos)).booleanValue()) {
                strZzd3 = (zzcumVar == null || zzcumVar.zza() <= 0) ? zzd(strZzd3, "@gw_placement_id@", "") : zzd(strZzd3, "@gw_placement_id@", Long.toString(zzcumVar.zza(), 10));
            }
            boolean z9 = false;
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdW)).booleanValue() && !TextUtils.isEmpty(str)) {
                z9 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z10 = !zIsEmpty;
            if (z9) {
                z8 = z10;
            } else {
                if (!zIsEmpty) {
                }
                arrayList.add(strZzd3);
            }
            if (this.zzi.zza(Uri.parse(strZzd3))) {
                Uri.Builder builderBuildUpon = Uri.parse(strZzd3).buildUpon();
                if (z9) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z8) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strZzd3 = builderBuildUpon.build().toString();
            }
            arrayList.add(strZzd3);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060 A[LOOP:0: B:13:0x005a->B:15:0x0060, LOOP_END] */
    public final List zzc(zzfcj zzfcjVar, List list, zzbvh zzbvhVar) {
        zzfcv zzfcvVar;
        zzgha zzghaVarZzd;
        String str;
        String str2;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long jMo18159a = this.zzh.mo18159a();
        try {
            String strZzb = zzbvhVar.zzb();
            String string = Integer.toString(zzbvhVar.zzc());
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdX)).booleanValue()) {
                zzfcw zzfcwVar = this.zzg;
                if (zzfcwVar == null) {
                    zzghaVarZzd = zzgha.zzc();
                } else {
                    zzfcvVar = zzfcwVar.zza;
                }
                str = (String) zzghaVarZzd.zzb(zzfjq.zza).zza("");
                str2 = (String) zzghaVarZzd.zzb(zzfjp.zza).zza("");
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(zzbxt.zza(zzd(zzd(zzd(zzd(zzd(zzd((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jMo18159a)), "@gw_rwd_itm@", Uri.encode(strZzb)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfcjVar.zzW, zzfcjVar.zzaw));
                }
                return arrayList;
            }
            zzfcvVar = this.zzf;
            zzghaVarZzd = zzgha.zzd(zzfcvVar);
            str = (String) zzghaVarZzd.zzb(zzfjq.zza).zza("");
            str2 = (String) zzghaVarZzd.zzb(zzfjp.zza).zza("");
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzbxt.zza(zzd(zzd(zzd(zzd(zzd(zzd((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jMo18159a)), "@gw_rwd_itm@", Uri.encode(strZzb)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfcjVar.zzW, zzfcjVar.zzaw));
            }
            return arrayList;
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Unable to determine award type and amount.", e7);
            return arrayList;
        }
    }
}
