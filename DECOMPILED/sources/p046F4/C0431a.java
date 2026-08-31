package p046F4;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: F4.a */
/* JADX INFO: loaded from: classes.dex */
public class C0431a {

    /* JADX INFO: renamed from: a */
    private final String f1695a;

    /* JADX INFO: renamed from: b */
    private final Map f1696b;

    public C0431a(String str, Map map) {
        this.f1695a = str;
        this.f1696b = map;
    }

    /* JADX INFO: renamed from: c */
    public static C0431a m1858c(String str) {
        if (!str.startsWith("gauth|")) {
            return null;
        }
        try {
            Map mapM1861a = AbstractC0432b.m1861a(str.substring(6));
            return new C0431a((String) mapM1861a.get("token"), (Map) mapM1861a.get("auth"));
        } catch (IOException e7) {
            throw new RuntimeException("Failed to parse gauth token", e7);
        }
    }

    /* JADX INFO: renamed from: a */
    public Map m1859a() {
        return this.f1696b;
    }

    /* JADX INFO: renamed from: b */
    public String m1860b() {
        return this.f1695a;
    }
}
