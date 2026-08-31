package p314o2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: o2.v */
/* JADX INFO: loaded from: classes.dex */
public class C6570v {

    /* JADX INFO: renamed from: f */
    public static final List f24768f = Arrays.asList("MA", "T", "PG", "G");

    /* JADX INFO: renamed from: a */
    private final int f24769a;

    /* JADX INFO: renamed from: b */
    private final int f24770b;

    /* JADX INFO: renamed from: c */
    private final String f24771c;

    /* JADX INFO: renamed from: d */
    private final List f24772d;

    /* JADX INFO: renamed from: e */
    private final b f24773e;

    /* JADX INFO: renamed from: o2.v$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private int f24774a = -1;

        /* JADX INFO: renamed from: b */
        private int f24775b = -1;

        /* JADX INFO: renamed from: c */
        private String f24776c = null;

        /* JADX INFO: renamed from: d */
        private final List f24777d = new ArrayList();

        /* JADX INFO: renamed from: e */
        private b f24778e = b.DEFAULT;

        /* JADX INFO: renamed from: a */
        public C6570v m27859a() {
            return new C6570v(this.f24774a, this.f24775b, this.f24776c, this.f24777d, this.f24778e, null);
        }
    }

    /* JADX INFO: renamed from: o2.v$b */
    public enum b {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);


        /* JADX INFO: renamed from: a */
        private final int f24783a;

        b(int i7) {
            this.f24783a = i7;
        }

        /* JADX INFO: renamed from: c */
        public int m27860c() {
            return this.f24783a;
        }
    }

    /* synthetic */ C6570v(int i7, int i8, String str, List list, b bVar, byte[] bArr) {
        this.f24769a = i7;
        this.f24770b = i8;
        this.f24771c = str;
        this.f24772d = list;
        this.f24773e = bVar;
    }

    /* JADX INFO: renamed from: a */
    public String m27854a() {
        String str = this.f24771c;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: b */
    public b m27855b() {
        return this.f24773e;
    }

    /* JADX INFO: renamed from: c */
    public int m27856c() {
        return this.f24769a;
    }

    /* JADX INFO: renamed from: d */
    public int m27857d() {
        return this.f24770b;
    }

    /* JADX INFO: renamed from: e */
    public List m27858e() {
        return new ArrayList(this.f24772d);
    }
}
