package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzl {
    private final zzam zza;
    private final Context zzb;

    zzl(Application application, zzam zzamVar) {
        this.zza = zzamVar;
        this.zzb = application.getApplicationContext();
    }

    public final void zza(Map map) {
        byte b7;
        String str;
        String str2;
        zzam zzamVar = this.zza;
        if (zzamVar.zzd()) {
            zzamVar.zzb(this.zzb);
            Integer num = (Integer) map.get("IABTCF_gdprApplies");
            HashMap map2 = new HashMap();
            for (String str3 : map.keySet()) {
                if (!str3.equals("IABTCF_gdprApplies")) {
                    switch (str3) {
                        case "UMP_CoMoAdPersonalizationPurposeConsentStatus":
                            b7 = 2;
                            break;
                        case "UMP_CoMoAnalyticsStoragePurposeConsentStatus":
                            b7 = 3;
                            break;
                        case "UMP_CoMoAdStoragePurposeConsentStatus":
                            b7 = 0;
                            break;
                        case "UMP_CoMoAdUserDataPurposeConsentStatus":
                            b7 = 1;
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    if (b7 == 0) {
                        str = "google_analytics_default_allow_ad_storage";
                        str2 = "AD_STORAGE";
                    } else if (b7 == 1) {
                        str = "google_analytics_default_allow_ad_user_data";
                        str2 = "AD_USER_DATA";
                    } else if (b7 == 2) {
                        str = "google_analytics_default_allow_ad_personalization_signals";
                        str2 = "AD_PERSONALIZATION";
                    } else if (b7 == 3) {
                        str = "google_analytics_default_allow_analytics_storage";
                        str2 = "ANALYTICS_STORAGE";
                    }
                    int iIntValue = ((Integer) map.get(str3)).intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 1) {
                            map2.put(str2, "GRANTED");
                        } else if (iIntValue == 2) {
                            map2.put(str2, "DENIED");
                        } else if (iIntValue != 4) {
                            if (iIntValue != 5) {
                                Log.w("UserMessagingPlatform", "Invalid CoMo consent status: " + iIntValue);
                            } else {
                                Object objZza = zzamVar.zza(str);
                                if (objZza == null) {
                                    Log.w("UserMessagingPlatform", "No default metadata");
                                } else if (objZza instanceof Boolean) {
                                    map2.put(str2, true != ((Boolean) objZza).booleanValue() ? "DENIED" : "GRANTED");
                                } else if ((objZza instanceof String) && objZza.equals("eu_consent_policy") && ((str2.equals("AD_PERSONALIZATION") || str2.equals("AD_USER_DATA")) && num != null)) {
                                    map2.put(str2, num.intValue() == 1 ? "DENIED" : "GRANTED");
                                } else {
                                    Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                }
                            }
                        }
                    }
                }
            }
            zzamVar.zzc(map2);
        }
    }
}
