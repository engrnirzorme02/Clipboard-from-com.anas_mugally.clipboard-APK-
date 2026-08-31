package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzftm;
import com.google.android.gms.internal.ads.zzftn;
import com.google.android.gms.internal.ads.zzfto;
import com.google.android.gms.internal.ads.zzggo;
import com.google.android.gms.internal.ads.zzghq;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3467d {
    /* JADX INFO: renamed from: a */
    public static void m17522a(Context context) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgF)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            zzftm zzftmVarZzh = zzftm.zzh(context);
            zzftn zzftnVarZzh = zzftn.zzh(context);
            zzfto zzftoVarZza = zzfto.zza(context);
            zzftmVarZzh.zzk();
            zzftmVarZzh.zzl();
            zzftnVarZzh.zzj();
            zzftoVarZza.zzb(null);
        } catch (IOException e7) {
            C7351t.m32354l().zzg(e7, "clearStorageOnIdlessMode");
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e8) {
            C7351t.m32354l().zzg(e8, "clearStorageOnIdlessMode_scar");
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m17523b(Context context, String str) {
        JSONArray jSONArray;
        int i7;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e7) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33327b("JSON parsing error", e7);
                jSONArray = null;
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            if (iOptInt == 0) {
                i7 = 1;
            } else if (iOptInt != 1) {
                i7 = iOptInt != 2 ? 0 : 3;
            } else {
                i7 = 2;
            }
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i7 != 0) {
                List listZze = zzghq.zza(zzggo.zzc('/')).zze(strOptString2);
                if (listZze.size() > 2 || listZze.isEmpty()) {
                    obj = null;
                } else {
                    if (listZze.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listZze.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listZze.get(0), 0);
                        str2 = (String) listZze.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i10 = i7 - 1;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public static Bundle m17524c(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return m17523b(context, str);
    }
}
