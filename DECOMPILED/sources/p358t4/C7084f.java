package p358t4;

import java.net.URI;

/* JADX INFO: renamed from: t4.f */
/* JADX INFO: loaded from: classes.dex */
public class C7084f {

    /* JADX INFO: renamed from: a */
    private final String f28279a;

    /* JADX INFO: renamed from: b */
    private final String f28280b;

    /* JADX INFO: renamed from: c */
    private final boolean f28281c;

    public C7084f(String str, String str2, boolean z7) {
        this.f28279a = str;
        this.f28280b = str2;
        this.f28281c = z7;
    }

    /* JADX INFO: renamed from: a */
    public static URI m31235a(String str, boolean z7, String str2, String str3) {
        String str4 = (z7 ? "wss" : "ws") + "://" + str + "/.ws?ns=" + str2 + "&v=5";
        if (str3 != null) {
            str4 = str4 + "&ls=" + str3;
        }
        return URI.create(str4);
    }

    /* JADX INFO: renamed from: b */
    public String m31236b() {
        return this.f28279a;
    }

    /* JADX INFO: renamed from: c */
    public String m31237c() {
        return this.f28280b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m31238d() {
        return this.f28281c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("http");
        sb.append(this.f28281c ? "s" : "");
        sb.append("://");
        sb.append(this.f28279a);
        return sb.toString();
    }
}
