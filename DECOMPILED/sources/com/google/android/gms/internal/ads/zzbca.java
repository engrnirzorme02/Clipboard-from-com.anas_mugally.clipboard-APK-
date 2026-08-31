package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbca {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final void zza(zzbbz zzbbzVar) {
        this.zza.add(zzbbzVar);
    }

    public final void zzb(zzbbz zzbbzVar) {
        this.zzb.add(zzbbzVar);
    }

    public final void zzc(zzbbz zzbbzVar) {
        this.zzc.add(zzbbzVar);
    }

    public final void zzd(SharedPreferences.Editor editor, int i7, JSONObject jSONObject) {
        for (zzbbz zzbbzVar : this.zza) {
            if (zzbbzVar.zzm() == 1) {
                zzbbzVar.zzb(editor, zzbbzVar.zzc(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            AbstractC7599p.m33328c("Flag Json is null.");
        }
    }

    public final List zze() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            String str = (String) C3250D.m17200c().zzd((zzbbz) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbcj.zza());
        return arrayList;
    }

    public final List zzf() {
        List listZze = zze();
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            String str = (String) C3250D.m17200c().zzd((zzbbz) it.next());
            if (!TextUtils.isEmpty(str)) {
                listZze.add(str);
            }
        }
        listZze.addAll(zzbcj.zzb());
        return listZze;
    }
}
