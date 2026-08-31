package p398y4;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p030D4.C0198b;
import p334q4.C6835b;
import p374v4.C7245j;

/* JADX INFO: renamed from: y4.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7552m {

    /* JADX INFO: renamed from: a */
    private static final Pattern f30206a = Pattern.compile("[\\[\\]\\.#$]");

    /* JADX INFO: renamed from: b */
    private static final Pattern f30207b = Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");

    /* JADX INFO: renamed from: a */
    private static boolean m33240a(String str) {
        return !f30206a.matcher(str).find();
    }

    /* JADX INFO: renamed from: b */
    private static boolean m33241b(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        if (str.equals(".value") || str.equals(".priority")) {
            return true;
        }
        return (str.startsWith(".") || f30207b.matcher(str).find()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m33242c(C7245j c7245j) {
        C0198b c0198bM32004z = c7245j.m32004z();
        return c0198bM32004z == null || !c0198bM32004z.m992d().startsWith(".");
    }

    /* JADX INFO: renamed from: d */
    private static void m33243d(double d7) {
        if (Double.isInfinite(d7) || Double.isNaN(d7)) {
            throw new C6835b("Invalid value: Value cannot be NaN, Inf or -Inf.");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m33244e(String str) {
        if (m33240a(str)) {
            return;
        }
        throw new C6835b("Invalid Firebase Database path: " + str + ". Firebase Database paths must not contain '.', '#', '$', '[', or ']'");
    }

    /* JADX INFO: renamed from: f */
    public static void m33245f(String str) {
        if (str.startsWith(".info")) {
            m33244e(str.substring(5));
        } else if (str.startsWith("/.info")) {
            m33244e(str.substring(6));
        } else {
            m33244e(str);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m33246g(String str) {
        if (m33241b(str)) {
            return;
        }
        throw new C6835b("Invalid key: " + str + ". Keys must not contain '/', '.', '#', '$', '[', or ']'");
    }

    /* JADX INFO: renamed from: h */
    public static void m33247h(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.containsKey(".sv")) {
                return;
            }
            for (Map.Entry entry : map.entrySet()) {
                m33246g((String) entry.getKey());
                m33247h(entry.getValue());
            }
            return;
        }
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m33247h(it.next());
            }
        } else if ((obj instanceof Double) || (obj instanceof Float)) {
            m33243d(((Double) obj).doubleValue());
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m33248i(C7245j c7245j) {
        if (m33242c(c7245j)) {
            return;
        }
        throw new C6835b("Invalid write location: " + c7245j.toString());
    }
}
