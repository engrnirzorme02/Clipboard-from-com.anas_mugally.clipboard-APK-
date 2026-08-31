package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzbir implements zzbjl {
    zzbir() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(zzcekVar.getContext()).edit();
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                editorEdit.remove(jSONArray.getString(i7));
            }
            editorEdit.apply();
        } catch (JSONException e7) {
            C7351t.m32354l().zzg(e7, "GMSG clear local storage keys handler");
        }
    }
}
