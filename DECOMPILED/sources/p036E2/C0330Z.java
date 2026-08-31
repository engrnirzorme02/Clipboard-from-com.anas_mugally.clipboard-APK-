package p036E2;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: E2.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C0330Z {

    /* JADX INFO: renamed from: a */
    private SharedPreferences f1349a;

    /* JADX INFO: renamed from: b */
    private SharedPreferences.Editor f1350b;

    /* JADX INFO: renamed from: c */
    private final Context f1351c;

    /* JADX INFO: renamed from: d */
    private final Object f1352d = new Object();

    C0330Z(Context context) {
        this.f1351c = context;
    }

    /* JADX INFO: renamed from: k */
    private final void m1499k() {
        synchronized (this.f1352d) {
            try {
                if (this.f1349a != null) {
                    return;
                }
                SharedPreferences sharedPreferences = this.f1351c.getSharedPreferences("query_info_shared_prefs", 0);
                this.f1349a = sharedPreferences;
                this.f1350b = sharedPreferences.edit();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1500a(String str, String str2) {
        m1499k();
        synchronized (this.f1352d) {
            this.f1350b.putString(str, str2).commit();
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m1501b(String str) {
        String string;
        m1499k();
        synchronized (this.f1352d) {
            string = this.f1349a.getString(str, null);
            this.f1350b.remove(str).commit();
        }
        return string;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1502c(String str) {
        boolean zContains;
        m1499k();
        synchronized (this.f1352d) {
            zContains = this.f1349a.contains(str);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: d */
    public final void m1503d(String str, int i7, String str2, int i8) {
        m1499k();
        synchronized (this.f1352d) {
            this.f1350b.putString("pn", str).putInt("vc", i7).putString("dm", str2).putInt("aav", i8).commit();
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m1504e() {
        String string;
        m1499k();
        synchronized (this.f1352d) {
            string = this.f1349a.getString("pn", null);
        }
        return string;
    }

    /* JADX INFO: renamed from: f */
    public final int m1505f() {
        int i7;
        m1499k();
        synchronized (this.f1352d) {
            i7 = this.f1349a.getInt("vc", -1);
        }
        return i7;
    }

    /* JADX INFO: renamed from: g */
    public final String m1506g() {
        String string;
        m1499k();
        synchronized (this.f1352d) {
            string = this.f1349a.getString("dm", null);
        }
        return string;
    }

    /* JADX INFO: renamed from: h */
    public final int m1507h() {
        int i7;
        m1499k();
        synchronized (this.f1352d) {
            i7 = this.f1349a.getInt("aav", -1);
        }
        return i7;
    }

    /* JADX INFO: renamed from: i */
    public final void m1508i() {
        m1499k();
        synchronized (this.f1352d) {
            this.f1350b.clear().commit();
        }
    }

    /* JADX INFO: renamed from: j */
    public final Map m1509j() {
        HashMap map;
        m1499k();
        synchronized (this.f1352d) {
            try {
                Map<String, ?> all = this.f1349a.getAll();
                map = new HashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), "vc") && !Objects.equals(entry.getKey(), "dm") && !Objects.equals(entry.getKey(), "aav")) {
                        map.put(entry.getKey(), (String) entry.getValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }
}
