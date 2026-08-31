package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbos {
    public static final List zza(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
            arrayList.add(jSONArrayOptJSONArray.getString(i7));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
