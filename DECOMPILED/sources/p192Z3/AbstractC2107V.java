package p192Z3;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1949e;

/* JADX INFO: renamed from: Z3.V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2107V {

    /* JADX INFO: renamed from: a */
    private static final Map f6917a;

    static {
        HashMap map = new HashMap();
        f6917a = map;
        map.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        map.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        map.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        map.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        map.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    /* JADX INFO: renamed from: a */
    public static Status m8669a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map map = f6917a;
                if (map.containsKey(string)) {
                    return AbstractC2137o.m8742a(((String) map.get(string)) + ":" + string2);
                }
            }
            return AbstractC2137o.m8742a("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e7) {
            return AbstractC2137o.m8742a("WEB_INTERNAL_ERROR:" + str + "[ " + e7.getLocalizedMessage() + " ]");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m8670b(Intent intent, Status status) {
        AbstractC1949e.m8083e(status, intent, "com.google.firebase.auth.internal.STATUS");
    }
}
