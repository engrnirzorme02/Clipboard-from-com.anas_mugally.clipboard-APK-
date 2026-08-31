package p192Z3;

import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C2390a;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3748c;
import com.google.android.gms.internal.p411firebaseauthapi.zzaao;
import com.google.android.gms.internal.p411firebaseauthapi.zzt;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p191Z2.C2086a;

/* JADX INFO: renamed from: Z3.z */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2148z {

    /* JADX INFO: renamed from: a */
    private static final C2086a f6998a = new C2086a("JSONParser", new String[0]);

    /* JADX INFO: renamed from: a */
    private static List m8750a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object objM8752c = jSONArray.get(i7);
            if (objM8752c instanceof JSONArray) {
                objM8752c = m8750a((JSONArray) objM8752c);
            } else if (objM8752c instanceof JSONObject) {
                objM8752c = m8752c((JSONObject) objM8752c);
            }
            arrayList.add(objM8752c);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static Map m8751b(String str) {
        AbstractC3718s.m18077f(str);
        List<String> listZza = zzt.zza('.').zza((CharSequence) str);
        if (listZza.size() < 2) {
            f6998a.m8615c("Invalid idToken " + str, new Object[0]);
            return new HashMap();
        }
        try {
            Map mapM8753d = m8753d(new String(AbstractC3748c.m18154b(listZza.get(1)), "UTF-8"));
            return mapM8753d == null ? new HashMap() : mapM8753d;
        } catch (UnsupportedEncodingException e7) {
            f6998a.m8614b("Unable to decode token", e7, new Object[0]);
            return new HashMap();
        }
    }

    /* JADX INFO: renamed from: c */
    private static Map m8752c(JSONObject jSONObject) throws JSONException {
        C2390a c2390a = new C2390a();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objM8752c = jSONObject.get(next);
            if (objM8752c instanceof JSONArray) {
                objM8752c = m8750a((JSONArray) objM8752c);
            } else if (objM8752c instanceof JSONObject) {
                objM8752c = m8752c((JSONObject) objM8752c);
            }
            c2390a.put(next, objM8752c);
        }
        return c2390a;
    }

    /* JADX INFO: renamed from: d */
    public static Map m8753d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return m8752c(jSONObject);
            }
            return null;
        } catch (Exception e7) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzaao(e7);
        }
    }
}
