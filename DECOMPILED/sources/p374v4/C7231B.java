package p374v4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p030D4.C0198b;
import p334q4.C6835b;

/* JADX INFO: renamed from: v4.B */
/* JADX INFO: loaded from: classes.dex */
public class C7231B {

    /* JADX INFO: renamed from: a */
    private final List f28819a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private int f28820b;

    private C7231B(C7245j c7245j) {
        this.f28820b = 0;
        Iterator it = c7245j.iterator();
        while (it.hasNext()) {
            this.f28819a.add(((C0198b) it.next()).m992d());
        }
        this.f28820b = Math.max(1, this.f28819a.size());
        for (int i7 = 0; i7 < this.f28819a.size(); i7++) {
            this.f28820b += m31892f((CharSequence) this.f28819a.get(i7));
        }
        m31887a();
    }

    /* JADX INFO: renamed from: a */
    private void m31887a() {
        if (this.f28820b > 768) {
            throw new C6835b("Data has a key path longer than 768 bytes (" + this.f28820b + ").");
        }
        if (this.f28819a.size() <= 32) {
            return;
        }
        throw new C6835b("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle " + m31891e());
    }

    /* JADX INFO: renamed from: b */
    private static String m31888b(String str, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (i7 > 0) {
                sb.append(str);
            }
            sb.append((String) list.get(i7));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    private String m31889c() {
        List list = this.f28819a;
        String str = (String) list.remove(list.size() - 1);
        this.f28820b -= m31892f(str);
        if (this.f28819a.size() > 0) {
            this.f28820b--;
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    private void m31890d(String str) {
        if (this.f28819a.size() > 0) {
            this.f28820b++;
        }
        this.f28819a.add(str);
        this.f28820b += m31892f(str);
        m31887a();
    }

    /* JADX INFO: renamed from: e */
    private String m31891e() {
        if (this.f28819a.size() == 0) {
            return "";
        }
        return "in path '" + m31888b("/", this.f28819a) + "'";
    }

    /* JADX INFO: renamed from: f */
    private static int m31892f(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            char cCharAt = charSequence.charAt(i7);
            if (cCharAt <= 127) {
                i8++;
            } else if (cCharAt <= 2047) {
                i8 += 2;
            } else if (Character.isHighSurrogate(cCharAt)) {
                i8 += 4;
                i7++;
            } else {
                i8 += 3;
            }
            i7++;
        }
        return i8;
    }

    /* JADX INFO: renamed from: g */
    public static void m31893g(C7245j c7245j, Object obj) {
        new C7231B(c7245j).m31894h(obj);
    }

    /* JADX INFO: renamed from: h */
    private void m31894h(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            for (String str : map.keySet()) {
                if (!str.startsWith(".")) {
                    m31890d(str);
                    m31894h(map.get(str));
                    m31889c();
                }
            }
            return;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            for (int i7 = 0; i7 < list.size(); i7++) {
                m31890d(Integer.toString(i7));
                m31894h(list.get(i7));
                m31889c();
            }
        }
    }
}
