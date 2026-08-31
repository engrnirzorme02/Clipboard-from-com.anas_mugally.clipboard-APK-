package p268i4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p228d4.C5235g;
import p252g4.AbstractC5499i;
import p300m4.C6346g;

/* JADX INFO: renamed from: i4.g */
/* JADX INFO: loaded from: classes.dex */
class C5711g {

    /* JADX INFO: renamed from: b */
    private static final Charset f21784b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    private final C6346g f21785a;

    /* JADX INFO: renamed from: i4.g$a */
    class a extends JSONObject {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f21786a;

        a(String str) throws JSONException {
            this.f21786a = str;
            put("userId", str);
        }
    }

    public C5711g(C6346g c6346g) {
        this.f21785a = c6346g;
    }

    /* JADX INFO: renamed from: e */
    private static Map m25292e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, m25300p(jSONObject, next));
        }
        return map;
    }

    /* JADX INFO: renamed from: f */
    private static List m25293f(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            String string = jSONArray.getString(i7);
            try {
                arrayList.add(AbstractC5714j.m25342a(string));
            } catch (Exception e7) {
                C5235g.m24179f().m24189l("Failed de-serializing rollouts state. " + string, e7);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    private String m25294g(String str) {
        return m25300p(new JSONObject(str), "userId");
    }

    /* JADX INFO: renamed from: h */
    private static String m25295h(Map map) {
        return new JSONObject(map).toString();
    }

    /* JADX INFO: renamed from: l */
    private static String m25296l(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i7 = 0; i7 < list.size(); i7++) {
            try {
                jSONArray.put(new JSONObject(AbstractC5714j.f21812a.mo3507b(list.get(i7))));
            } catch (JSONException e7) {
                C5235g.m24179f().m24189l("Exception parsing rollout assignment!", e7);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    /* JADX INFO: renamed from: m */
    private static void m25297m(File file) {
        if (file.exists() && file.delete()) {
            C5235g.m24179f().m24184g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: n */
    private static void m25298n(File file, String str) {
        if (file.exists() && file.delete()) {
            C5235g.m24179f().m24184g(String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
    }

    /* JADX INFO: renamed from: o */
    private static String m25299o(String str) {
        return new a(str).toString();
    }

    /* JADX INFO: renamed from: p */
    private static String m25300p(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    /* JADX INFO: renamed from: a */
    public File m25301a(String str) {
        return this.f21785a.m27349q(str, "internal-keys");
    }

    /* JADX INFO: renamed from: b */
    public File m25302b(String str) {
        return this.f21785a.m27349q(str, "keys");
    }

    /* JADX INFO: renamed from: c */
    public File m25303c(String str) {
        return this.f21785a.m27349q(str, "rollouts-state");
    }

    /* JADX INFO: renamed from: d */
    public File m25304d(String str) {
        return this.f21785a.m27349q(str, "user-data");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    /* JADX INFO: renamed from: i */
    Map m25305i(String str, boolean z7) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e7;
        File fileM25301a = z7 ? m25301a(str) : m25302b(str);
        if (!fileM25301a.exists() || fileM25301a.length() == 0) {
            m25298n(fileM25301a, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(fileM25301a);
                try {
                    Map mapM25292e = m25292e(AbstractC5499i.m24782B(fileInputStream));
                    AbstractC5499i.m24788f(fileInputStream, "Failed to close user metadata file.");
                    return mapM25292e;
                } catch (Exception e8) {
                    e7 = e8;
                    C5235g.m24179f().m24189l("Error deserializing user metadata.", e7);
                    m25297m(fileM25301a);
                    AbstractC5499i.m24788f(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Throwable th2) {
                th = th2;
                AbstractC5499i.m24788f(, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e9) {
            fileInputStream = null;
            e7 = e9;
        } catch (Throwable th3) {
            ?? r7 = 0;
            th = th3;
            AbstractC5499i.m24788f(r7, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public List m25306j(String str) throws Throwable {
        File fileM25303c = m25303c(str);
        if (!fileM25303c.exists() || fileM25303c.length() == 0) {
            m25298n(fileM25303c, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_LIST;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileM25303c);
                try {
                    List listM25293f = m25293f(AbstractC5499i.m24782B(fileInputStream2));
                    C5235g.m24179f().m24180b("Loaded rollouts state:\n" + listM25293f + "\nfor session " + str);
                    AbstractC5499i.m24788f(fileInputStream2, "Failed to close rollouts state file.");
                    return listM25293f;
                } catch (Exception e7) {
                    e = e7;
                    fileInputStream = fileInputStream2;
                    C5235g.m24179f().m24189l("Error deserializing rollouts state.", e);
                    m25297m(fileM25303c);
                    AbstractC5499i.m24788f(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.EMPTY_LIST;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    AbstractC5499i.m24788f(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public String m25307k(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileM25304d = m25304d(str);
        FileInputStream fileInputStream2 = null;
        if (!fileM25304d.exists() || fileM25304d.length() == 0) {
            C5235g.m24179f().m24180b("No userId set for session " + str);
            m25297m(fileM25304d);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileM25304d);
            try {
                try {
                    String strM25294g = m25294g(AbstractC5499i.m24782B(fileInputStream));
                    C5235g.m24179f().m24180b("Loaded userId " + strM25294g + " for session " + str);
                    AbstractC5499i.m24788f(fileInputStream, "Failed to close user metadata file.");
                    return strM25294g;
                } catch (Exception e7) {
                    e = e7;
                    C5235g.m24179f().m24189l("Error deserializing user metadata.", e);
                    m25297m(fileM25304d);
                    AbstractC5499i.m24788f(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                AbstractC5499i.m24788f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            AbstractC5499i.m24788f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m25308q(String str, Map map) throws Throwable {
        m25309r(str, map, false);
    }

    /* JADX INFO: renamed from: r */
    public void m25309r(String str, Map map, boolean z7) throws Throwable {
        File fileM25301a = z7 ? m25301a(str) : m25302b(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strM25295h = m25295h(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM25301a), f21784b));
                try {
                    bufferedWriter2.write(strM25295h);
                    bufferedWriter2.flush();
                    AbstractC5499i.m24788f(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e7) {
                    e = e7;
                    bufferedWriter = bufferedWriter2;
                    C5235g.m24179f().m24189l("Error serializing key/value metadata.", e);
                    m25297m(fileM25301a);
                    AbstractC5499i.m24788f(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    AbstractC5499i.m24788f(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e8) {
            e = e8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX INFO: renamed from: s */
    public void m25310s(String str, List list) throws Throwable {
        Throwable th;
        BufferedWriter bufferedWriter;
        Exception e7;
        File fileM25303c = m25303c(str);
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            m25298n(fileM25303c, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                String strM25296l = m25296l(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM25303c), f21784b));
                try {
                    bufferedWriter.write(strM25296l);
                    bufferedWriter.flush();
                    AbstractC5499i.m24788f(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e8) {
                    e7 = e8;
                    C5235g.m24179f().m24189l("Error serializing rollouts state.", e7);
                    m25297m(fileM25303c);
                    AbstractC5499i.m24788f(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Throwable th2) {
                th = th2;
                AbstractC5499i.m24788f(IsEmpty, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e9) {
            bufferedWriter = null;
            e7 = e9;
        } catch (Throwable th3) {
            IsEmpty = 0;
            th = th3;
            AbstractC5499i.m24788f(IsEmpty, "Failed to close rollouts state file.");
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m25311t(String str, String str2) throws Throwable {
        File fileM25304d = m25304d(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strM25299o = m25299o(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM25304d), f21784b));
                try {
                    bufferedWriter2.write(strM25299o);
                    bufferedWriter2.flush();
                    AbstractC5499i.m24788f(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e7) {
                    e = e7;
                    bufferedWriter = bufferedWriter2;
                    C5235g.m24179f().m24189l("Error serializing user metadata.", e);
                    AbstractC5499i.m24788f(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    AbstractC5499i.m24788f(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
