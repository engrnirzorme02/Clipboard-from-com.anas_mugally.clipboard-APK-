package p242f2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p216c2.AbstractC2997m;

/* JADX INFO: renamed from: f2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5429a {

    /* JADX INFO: renamed from: e */
    private static final C5429a f20660e = new a().m24610b();

    /* JADX INFO: renamed from: a */
    private final C5434f f20661a;

    /* JADX INFO: renamed from: b */
    private final List f20662b;

    /* JADX INFO: renamed from: c */
    private final C5430b f20663c;

    /* JADX INFO: renamed from: d */
    private final String f20664d;

    /* JADX INFO: renamed from: f2.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private C5434f f20665a = null;

        /* JADX INFO: renamed from: b */
        private List f20666b = new ArrayList();

        /* JADX INFO: renamed from: c */
        private C5430b f20667c = null;

        /* JADX INFO: renamed from: d */
        private String f20668d = "";

        a() {
        }

        /* JADX INFO: renamed from: a */
        public a m24609a(C5432d c5432d) {
            this.f20666b.add(c5432d);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C5429a m24610b() {
            return new C5429a(this.f20665a, Collections.unmodifiableList(this.f20666b), this.f20667c, this.f20668d);
        }

        /* JADX INFO: renamed from: c */
        public a m24611c(String str) {
            this.f20668d = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m24612d(C5430b c5430b) {
            this.f20667c = c5430b;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m24613e(C5434f c5434f) {
            this.f20665a = c5434f;
            return this;
        }
    }

    C5429a(C5434f c5434f, List list, C5430b c5430b, String str) {
        this.f20661a = c5434f;
        this.f20662b = list;
        this.f20663c = c5430b;
        this.f20664d = str;
    }

    /* JADX INFO: renamed from: e */
    public static a m24603e() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public String m24604a() {
        return this.f20664d;
    }

    /* JADX INFO: renamed from: b */
    public C5430b m24605b() {
        return this.f20663c;
    }

    /* JADX INFO: renamed from: c */
    public List m24606c() {
        return this.f20662b;
    }

    /* JADX INFO: renamed from: d */
    public C5434f m24607d() {
        return this.f20661a;
    }

    /* JADX INFO: renamed from: f */
    public byte[] m24608f() {
        return AbstractC2997m.m14961a(this);
    }
}
