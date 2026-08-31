package com.google.android.gms.internal.p411firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.util.AbstractC3765t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class zzaif implements zzaez<zzaif> {
    private static final String zza = "zzaif";
    private String zzb;
    private String zzc;
    private String zzd;
    private zzahy zze;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaez
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaif zza(String str) throws zzacn {
        String str2;
        byte b7;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = AbstractC3765t.m18208a(jSONObject.optString("email"));
            this.zzc = AbstractC3765t.m18208a(jSONObject.optString("newEmail"));
            int iOptInt = jSONObject.optInt("reqType");
            if (iOptInt != 1) {
                switch (iOptInt) {
                    case 4:
                        str2 = "VERIFY_EMAIL";
                        break;
                    case 5:
                        str2 = "RECOVER_EMAIL";
                        break;
                    case 6:
                        str2 = "EMAIL_SIGNIN";
                        break;
                    case 7:
                        str2 = "VERIFY_AND_CHANGE_EMAIL";
                        break;
                    case 8:
                        str2 = "REVERT_SECOND_FACTOR_ADDITION";
                        break;
                    default:
                        str2 = null;
                        break;
                }
            } else {
                str2 = "PASSWORD_RESET";
            }
            this.zzd = str2;
            if (TextUtils.isEmpty(str2)) {
                String strOptString = jSONObject.optString("requestType");
                switch (strOptString.hashCode()) {
                    case -1874510116:
                        if (!strOptString.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                            b7 = -1;
                        } else {
                            b7 = 5;
                        }
                        break;
                    case -1452371317:
                        if (!strOptString.equals("PASSWORD_RESET")) {
                            b7 = -1;
                        } else {
                            b7 = 1;
                        }
                        break;
                    case -1341836234:
                        if (!strOptString.equals("VERIFY_EMAIL")) {
                            b7 = -1;
                        } else {
                            b7 = 0;
                        }
                        break;
                    case -1099157829:
                        if (!strOptString.equals("VERIFY_AND_CHANGE_EMAIL")) {
                            b7 = -1;
                        } else {
                            b7 = 3;
                        }
                        break;
                    case 870738373:
                        if (!strOptString.equals("EMAIL_SIGNIN")) {
                            b7 = -1;
                        } else {
                            b7 = 2;
                        }
                        break;
                    case 970484929:
                        if (!strOptString.equals("RECOVER_EMAIL")) {
                            b7 = -1;
                        } else {
                            b7 = 4;
                        }
                        break;
                    default:
                        b7 = -1;
                        break;
                }
                this.zzd = (b7 == 0 || b7 == 1 || b7 == 2 || b7 == 3 || b7 == 4 || b7 == 5) ? strOptString : null;
            }
            if (jSONObject.has("mfaInfo")) {
                this.zze = zzahy.zza(jSONObject.optJSONObject("mfaInfo"));
            }
            return this;
        } catch (NullPointerException e7) {
            e = e7;
            throw zzajk.zza(e, zza, str);
        } catch (JSONException e8) {
            e = e8;
            throw zzajk.zza(e, zza, str);
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final boolean zze() {
        return this.zzb != null;
    }

    public final boolean zzf() {
        return this.zze != null;
    }

    public final boolean zzg() {
        return this.zzc != null;
    }

    public final boolean zzh() {
        return this.zzd != null;
    }

    public final zzahy zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzb;
    }
}
