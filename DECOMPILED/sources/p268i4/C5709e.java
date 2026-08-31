package p268i4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p228d4.C5235g;
import p252g4.AbstractC5499i;

/* JADX INFO: renamed from: i4.e */
/* JADX INFO: loaded from: classes.dex */
class C5709e {

    /* JADX INFO: renamed from: a */
    private final Map f21778a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final int f21779b;

    /* JADX INFO: renamed from: c */
    private final int f21780c;

    public C5709e(int i7, int i8) {
        this.f21779b = i7;
        this.f21780c = i8;
    }

    /* JADX INFO: renamed from: b */
    private String m25280b(String str) {
        if (str != null) {
            return m25281c(str, this.f21780c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* JADX INFO: renamed from: c */
    public static String m25281c(String str, int i7) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i7 ? strTrim.substring(0, i7) : strTrim;
    }

    /* JADX INFO: renamed from: a */
    public synchronized Map m25282a() {
        return Collections.unmodifiableMap(new HashMap(this.f21778a));
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m25283d(String str, String str2) {
        String strM25280b = m25280b(str);
        if (this.f21778a.size() >= this.f21779b && !this.f21778a.containsKey(strM25280b)) {
            C5235g.m24179f().m24188k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f21779b);
            return false;
        }
        String strM25281c = m25281c(str2, this.f21780c);
        if (AbstractC5499i.m24808z((String) this.f21778a.get(strM25280b), strM25281c)) {
            return false;
        }
        Map map = this.f21778a;
        if (str2 == null) {
            strM25281c = "";
        }
        map.put(strM25280b, strM25281c);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m25284e(Map map) {
        try {
            int i7 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strM25280b = m25280b((String) entry.getKey());
                if (this.f21778a.size() < this.f21779b || this.f21778a.containsKey(strM25280b)) {
                    String str = (String) entry.getValue();
                    this.f21778a.put(strM25280b, str == null ? "" : m25281c(str, this.f21780c));
                } else {
                    i7++;
                }
            }
            if (i7 > 0) {
                C5235g.m24179f().m24188k("Ignored " + i7 + " entries when adding custom keys. Maximum allowable: " + this.f21779b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
