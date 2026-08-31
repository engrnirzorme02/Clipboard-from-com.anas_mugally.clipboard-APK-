package p334q4;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: q4.a */
/* JADX INFO: loaded from: classes.dex */
public class C6834a {

    /* JADX INFO: renamed from: d */
    private static final Map f27424d;

    /* JADX INFO: renamed from: e */
    private static final Map f27425e;

    /* JADX INFO: renamed from: a */
    private final int f27426a;

    /* JADX INFO: renamed from: b */
    private final String f27427b;

    /* JADX INFO: renamed from: c */
    private final String f27428c;

    static {
        HashMap map = new HashMap();
        f27424d = map;
        map.put(-1, "The transaction needs to be run again with current data");
        map.put(-2, "The server indicated that this operation failed");
        map.put(-3, "This client does not have permission to perform this operation");
        map.put(-4, "The operation had to be aborted due to a network disconnect");
        map.put(-6, "The supplied auth token has expired");
        map.put(-7, "The supplied auth token was invalid");
        map.put(-8, "The transaction had too many retries");
        map.put(-9, "The transaction was overridden by a subsequent set");
        map.put(-10, "The service is unavailable");
        map.put(-11, "User code called from the Firebase Database runloop threw an exception:\n");
        map.put(-24, "The operation could not be performed due to a network error");
        map.put(-25, "The write was canceled by the user.");
        map.put(-999, "An unknown error occurred");
        HashMap map2 = new HashMap();
        f27425e = map2;
        map2.put("datastale", -1);
        map2.put("failure", -2);
        map2.put("permission_denied", -3);
        map2.put("disconnected", -4);
        map2.put("expired_token", -6);
        map2.put("invalid_token", -7);
        map2.put("maxretries", -8);
        map2.put("overriddenbyset", -9);
        map2.put("unavailable", -10);
        map2.put("network_error", -24);
        map2.put("write_canceled", -25);
    }

    private C6834a(int i7, String str) {
        this(i7, str, null);
    }

    /* JADX INFO: renamed from: a */
    public static C6834a m29870a(int i7) {
        Map map = f27424d;
        if (map.containsKey(Integer.valueOf(i7))) {
            return new C6834a(i7, (String) map.get(Integer.valueOf(i7)), null);
        }
        throw new IllegalArgumentException("Invalid Firebase Database error code: " + i7);
    }

    /* JADX INFO: renamed from: b */
    public static C6834a m29871b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return new C6834a(-11, ((String) f27424d.get(-11)) + stringWriter.toString());
    }

    /* JADX INFO: renamed from: c */
    public static C6834a m29872c(String str) {
        return m29873d(str, null);
    }

    /* JADX INFO: renamed from: d */
    public static C6834a m29873d(String str, String str2) {
        return m29874e(str, str2, null);
    }

    /* JADX INFO: renamed from: e */
    public static C6834a m29874e(String str, String str2, String str3) {
        Integer num = (Integer) f27425e.get(str.toLowerCase(Locale.US));
        if (num == null) {
            num = -999;
        }
        if (str2 == null) {
            str2 = (String) f27424d.get(num);
        }
        return new C6834a(num.intValue(), str2, str3);
    }

    /* JADX INFO: renamed from: f */
    public int m29875f() {
        return this.f27426a;
    }

    /* JADX INFO: renamed from: g */
    public C6835b m29876g() {
        return new C6835b("Firebase Database error: " + this.f27427b);
    }

    public String toString() {
        return "DatabaseError: " + this.f27427b;
    }

    private C6834a(int i7, String str, String str2) {
        this.f27426a = i7;
        this.f27427b = str;
        this.f27428c = str2 == null ? "" : str2;
    }
}
