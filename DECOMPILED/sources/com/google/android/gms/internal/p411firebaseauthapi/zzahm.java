package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.firebase.auth.C4848d;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahm implements zzafa {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private C4848d zze;
    private String zzf;
    private String zzg;

    public zzahm(int i7) {
        this.zza = zza(i7);
    }

    public static zzahm zza(C4848d c4848d, String str, String str2) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18083l(c4848d);
        return new zzahm(7, c4848d, null, str2, str, null, null);
    }

    public final C4848d zzb() {
        return this.zze;
    }

    public final zzahm zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final zzahm zzd(String str) {
        this.zzd = AbstractC3718s.m18077f(str);
        return this;
    }

    public final zzahm zzb(String str) {
        this.zzb = AbstractC3718s.m18077f(str);
        return this;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    private zzahm(int i7, C4848d c4848d, String str, String str2, String str3, String str4, String str5) {
        this.zza = zza(7);
        this.zze = (C4848d) AbstractC3718s.m18083l(c4848d);
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public final zzahm zza(C4848d c4848d) {
        this.zze = (C4848d) AbstractC3718s.m18083l(c4848d);
        return this;
    }

    public final zzahm zza(String str) {
        this.zzg = str;
        return this;
    }

    private static String zza(int i7) {
        if (i7 == 1) {
            return "PASSWORD_RESET";
        }
        if (i7 == 4) {
            return "VERIFY_EMAIL";
        }
        if (i7 == 6) {
            return "EMAIL_SIGNIN";
        }
        if (i7 != 7) {
            return "REQUEST_TYPE_UNSET_ENUM_VALUE";
        }
        return "VERIFY_AND_CHANGE_EMAIL";
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        int i7 = 1;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.getClass();
        switch (str) {
            case "PASSWORD_RESET":
                break;
            case "VERIFY_EMAIL":
                i7 = 4;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                i7 = 7;
                break;
            case "EMAIL_SIGNIN":
                i7 = 6;
                break;
            default:
                i7 = 0;
                break;
        }
        jSONObject.put("requestType", i7);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        C4848d c4848d = this.zze;
        if (c4848d != null) {
            jSONObject.put("androidInstallApp", c4848d.m22024U());
            jSONObject.put("canHandleCodeInApp", this.zze.m22023T());
            if (this.zze.m22029Z() != null) {
                jSONObject.put("continueUrl", this.zze.m22029Z());
            }
            if (this.zze.m22027X() != null) {
                jSONObject.put("iosBundleId", this.zze.m22027X());
            }
            if (this.zze.zzd() != null) {
                jSONObject.put("iosAppStoreId", this.zze.zzd());
            }
            if (this.zze.m22026W() != null) {
                jSONObject.put("androidPackageName", this.zze.m22026W());
            }
            if (this.zze.m22025V() != null) {
                jSONObject.put("androidMinimumVersion", this.zze.m22025V());
            }
            if (this.zze.zzc() != null) {
                jSONObject.put("dynamicLinkDomain", this.zze.zzc());
            }
            if (this.zze.m22028Y() != null) {
                jSONObject.put("linkDomain", this.zze.m22028Y());
            }
        }
        String str5 = this.zzf;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        String str6 = this.zzg;
        if (str6 != null) {
            zzajk.zza(jSONObject, "captchaResp", str6);
        } else {
            zzajk.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
