package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.client.C3385q2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeee {
    private final String zzc;
    private zzfcm zzd = null;
    private zzfcj zze = null;
    private C3385q2 zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzeee(String str) {
        this.zzc = str;
    }

    private final synchronized void zzj(zzfcj zzfcjVar, int i7) {
        Map map = this.zzb;
        String strZzl = zzl(zzfcjVar);
        if (map.containsKey(strZzl)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = zzfcjVar.zzv;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        C3385q2 c3385q2 = new C3385q2(zzfcjVar.zzE, 0L, null, bundle, zzfcjVar.zzF, zzfcjVar.zzG, zzfcjVar.zzH, zzfcjVar.zzI);
        try {
            this.zza.add(i7, c3385q2);
        } catch (IndexOutOfBoundsException e7) {
            C7351t.m32354l().zzg(e7, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(strZzl, c3385q2);
    }

    private final void zzk(zzfcj zzfcjVar, long j7, C3324b1 c3324b1, boolean z7) {
        Map map = this.zzb;
        String strZzl = zzl(zzfcjVar);
        if (map.containsKey(strZzl)) {
            if (this.zze == null) {
                this.zze = zzfcjVar;
            }
            C3385q2 c3385q2 = (C3385q2) map.get(strZzl);
            c3385q2.f14076b = j7;
            c3385q2.f14077c = c3324b1;
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhh)).booleanValue() && z7) {
                this.zzf = c3385q2;
            }
        }
    }

    private static String zzl(zzfcj zzfcjVar) {
        return ((Boolean) C3250D.m17200c().zzd(zzbci.zzdZ)).booleanValue() ? zzfcjVar.zzap : zzfcjVar.zzw;
    }

    public final void zza(zzfcm zzfcmVar) {
        this.zzd = zzfcmVar;
    }

    public final void zzb(zzfcj zzfcjVar) {
        zzj(zzfcjVar, this.zza.size());
    }

    public final synchronized void zzc(String str, List list) {
        Map map = this.zzb;
        if (map.containsKey(str)) {
            C3385q2 c3385q2 = (C3385q2) map.get(str);
            List list2 = this.zza;
            int iIndexOf = list2.indexOf(c3385q2);
            try {
                list2.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e7) {
                C7351t.m32354l().zzg(e7, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzj((zzfcj) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    public final void zzd(zzfcj zzfcjVar, long j7, C3324b1 c3324b1) {
        zzk(zzfcjVar, j7, null, true);
    }

    public final void zze(zzfcj zzfcjVar, long j7, C3324b1 c3324b1) {
        zzk(zzfcjVar, j7, c3324b1, false);
    }

    public final zzcvl zzf() {
        return new zzcvl(this.zze, "", this, this.zzd, this.zzc);
    }

    public final C3385q2 zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zza;
    }

    public final void zzi(zzfcj zzfcjVar) {
        Map map = this.zzb;
        Object obj = map.get(zzl(zzfcjVar));
        List list = this.zza;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.zzf);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.zzf = (C3385q2) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            C3385q2 c3385q2 = (C3385q2) list.get(iIndexOf);
            c3385q2.f14076b = 0L;
            c3385q2.f14077c = null;
        }
    }
}
