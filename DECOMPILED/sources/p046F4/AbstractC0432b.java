package p046F4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;

/* JADX INFO: renamed from: F4.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0432b {
    /* JADX INFO: renamed from: a */
    public static Map m1861a(String str) throws IOException {
        try {
            return m1868h(new JSONObject(str));
        } catch (JSONException e7) {
            throw new IOException(e7);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m1862b(String str) throws IOException {
        try {
            return m1866f(new JSONTokener(str).nextValue());
        } catch (JSONException e7) {
            throw new IOException(e7);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m1863c(Map map) {
        return m1864d(map);
    }

    /* JADX INFO: renamed from: d */
    public static String m1864d(Object obj) throws IOException {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return JSONObject.quote((String) obj);
        }
        if (obj instanceof Number) {
            try {
                return JSONObject.numberToString((Number) obj);
            } catch (JSONException e7) {
                throw new IOException("Could not serialize number", e7);
            }
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? "true" : "false";
        }
        try {
            JSONStringer jSONStringer = new JSONStringer();
            m1865e(obj, jSONStringer);
            return jSONStringer.toString();
        } catch (JSONException e8) {
            throw new IOException("Failed to serialize JSON", e8);
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m1865e(Object obj, JSONStringer jSONStringer) throws JSONException {
        if (obj instanceof Map) {
            jSONStringer.object();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONStringer.key((String) entry.getKey());
                m1865e(entry.getValue(), jSONStringer);
            }
            jSONStringer.endObject();
            return;
        }
        if (!(obj instanceof Collection)) {
            jSONStringer.value(obj);
            return;
        }
        jSONStringer.array();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            m1865e(it.next(), jSONStringer);
        }
        jSONStringer.endArray();
    }

    /* JADX INFO: renamed from: f */
    private static Object m1866f(Object obj) {
        if (obj instanceof JSONObject) {
            return m1868h((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return m1867g((JSONArray) obj);
        }
        if (obj.equals(JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: g */
    private static List m1867g(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            arrayList.add(m1866f(jSONArray.get(i7)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    private static Map m1868h(JSONObject jSONObject) {
        HashMap map = new HashMap(jSONObject.length());
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, m1866f(jSONObject.get(next)));
        }
        return map;
    }
}
