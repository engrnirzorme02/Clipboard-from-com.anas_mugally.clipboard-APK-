package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Map;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbxt {
    public static String zza(String str, Context context, boolean z7, Map map) {
        String strZzj;
        if ((((Boolean) C3250D.m17200c().zzd(zzbci.zzaG)).booleanValue() && !z7) || !C7351t.m32346d().zza(context) || TextUtils.isEmpty(str) || (strZzj = C7351t.m32346d().zzj(context)) == null) {
            return str;
        }
        String str2 = (String) C3250D.m17200c().zzd(zzbci.zzaz);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzay)).booleanValue() && str.contains(str2)) {
            if (C7351t.m32349g().m17442S(str)) {
                C7351t.m32346d().zzk(context, strZzj, (Map) map.get("_ac"));
                return zzd(str, context).replace(str2, strZzj);
            }
            if (!C7351t.m32349g().m17443T(str)) {
                return str;
            }
            C7351t.m32346d().zzl(context, strZzj, (Map) map.get("_ai"));
            return zzd(str, context).replace(str2, strZzj);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzax)).booleanValue()) {
            return str;
        }
        if (C7351t.m32349g().m17442S(str)) {
            C7351t.m32346d().zzk(context, strZzj, (Map) map.get("_ac"));
            return zzc(zzd(str, context), "fbs_aeid", strZzj).toString();
        }
        if (!C7351t.m32349g().m17443T(str)) {
            return str;
        }
        C7351t.m32346d().zzl(context, strZzj, (Map) map.get("_ai"));
        return zzc(zzd(str, context), "fbs_aeid", strZzj).toString();
    }

    public static String zzb(Uri uri, Context context, Map map) {
        String strZzj;
        if (C7351t.m32346d().zza(context) && (strZzj = C7351t.m32346d().zzj(context)) != null) {
            String str = (String) C3250D.m17200c().zzd(zzbci.zzaz);
            String string = uri.toString();
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzay)).booleanValue() && string.contains(str)) {
                C7351t.m32346d().zzk(context, strZzj, (Map) map.get("_ac"));
                return zzd(string, context).replace(str, strZzj);
            }
            if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
                if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzax)).booleanValue()) {
                    String string2 = zzc(zzd(string, context), "fbs_aeid", strZzj).toString();
                    C7351t.m32346d().zzk(context, strZzj, (Map) map.get("_ac"));
                    return string2;
                }
            }
            return string;
        }
        return uri.toString();
    }

    static Uri zzc(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i7 = iIndexOf + 1;
        return Uri.parse(str.substring(0, i7) + str2 + "=" + str3 + "&" + str.substring(i7));
    }

    private static String zzd(String str, Context context) {
        String strZzh = C7351t.m32346d().zzh(context);
        String strZzi = C7351t.m32346d().zzi(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strZzh)) {
            str = zzc(str, "gmp_app_id", strZzh).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strZzi)) ? str : zzc(str, "fbs_aiid", strZzi).toString();
    }
}
